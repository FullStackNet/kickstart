/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import platform.config.Reader;

public class Profiler {
	private static Profiler profiler;
	private Map<String, Task> tasks;
	
	private boolean enabled;
	private String granularity = "ms";

	private Profiler() throws ApplicationException {
		tasks = new HashMap<String, Task>();
		
		Reader reader = new Reader("profiling");
		enabled = reader.getBoolean("enabled", false);
		if(!enabled)
			System.out.println("Profiler is disabled. Please enable it from 'profiling.properties'");
		granularity = reader.getString("granularity","ms");
		if(!isGranularityValid())
			throw new ApplicationException(ExceptionSeverity.ERROR, "Profiling granularity is not supported: " + granularity);
	}

	public synchronized static Profiler getInstance() throws ApplicationException {
		if(profiler == null)
			profiler = new Profiler();
		return profiler;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException(); 
	}
	
	public void start(String id) throws ApplicationException {
		if(!enabled)
			return;
		
		start(id, null);
	}
	
	public void start(String id, String parentId) throws ApplicationException {
		//If not enabled, should be a NO-OP
		if(!enabled)
			return;
		
		if(id == null || id.length() == 0)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Task ID is invalid: " + id);
		
		String prefix = getTaskPrefix();
		synchronized(tasks) {
			if(tasks.get(prefix + id) != null)
				throw new ApplicationException(ExceptionSeverity.ERROR, "Task already exists/started: " + id);

			Task parentTask = null;
			if(parentId != null && parentId.length() > 0) {
				parentTask = tasks.get(prefix + parentId);
				if(parentTask == null)
					throw new ApplicationException(ExceptionSeverity.ERROR, "Parent task ID not found: " + parentId + " for task ID: " + id);
			}

			Task task = new Task(id, parentTask);
			tasks.put(prefix + id, task);

			//To be accurate always keep this line last
			task.setStartTime(getCurrentTime());
		 }
	}
	
	public void end(String id) throws ApplicationException {
		//If not enabled, should be a NO-OP
		if(!enabled)
			return;
		
		//To be accurate always keep this line first
		long endTime = getCurrentTime();
		
		if(id == null || id.length() == 0)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Task ID is invalid: " + id);
		
		String prefix = getTaskPrefix();
		synchronized(tasks) {
			Task task = tasks.get(prefix + id);
			if(task == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, "Task ID not found: " + id);
			task.setEndTime(endTime);

			if(task.getParent() == null) {
				printTask(task);
				removeTask(task);
			}
		}
	}
	
	private void printTask(Task task) throws ApplicationException {
		printTask(task, new int[] {0});
	}
	
	private void printTask(Task task, int[] level) throws ApplicationException {
		StringBuffer tabs = new StringBuffer(level[0]);
		for(int i = 0; i < level[0]; i++)
			tabs.append("\t");
		
		level[0]++;
		long childTasksDuration = 0;
		List<Task> childTasks = task.getChildren();
		for(Task childTask : childTasks) {
			childTasksDuration += childTask.getDuration();
			printTask(childTask, level);
		}
		level[0]--;
		
		StringBuffer output = new StringBuffer();
		output.append(tabs.toString() + "Time taken for task '" + task.getId() + "': " + formatTime(task.getDuration()));
		if(childTasksDuration > 0)
			output.append(" (excluding subtasks): " + formatTime(task.getDuration() - childTasksDuration));
		System.out.println(output);
	}
	
	private void removeTask(Task task) {
		List<Task> childTasks = task.getChildren();
		for(Task childTask : childTasks)
			removeTask(childTask);
		task.clear();
		tasks.remove(getTaskPrefix() + task.getId());
	}
	
	private String formatTime(long time) {
		double powerToConvertToSeconds = isMilliSecGranular() ? 3 : (isMicroSecGranular() ? 6 : 9);
		double seconds = time/Math.pow(10, powerToConvertToSeconds);
		if(seconds >= 1)
			return formatTime(seconds, "seconds");

		double milliSeconds = time/Math.pow(10, powerToConvertToSeconds - 3);
		if(isMilliSecGranular() || milliSeconds >= 1)
			return formatTime(milliSeconds, "milli seconds");
		
		double microSeconds = time/Math.pow(10, powerToConvertToSeconds - 6);
		if(isMicroSecGranular() || microSeconds >= 1)
			return formatTime(microSeconds, "micro seconds");

		double nanoSeconds = time/Math.pow(10, powerToConvertToSeconds - 9);
		return formatTime(nanoSeconds, "nano seconds");
	}
	
	private String formatTime(double time, String unit) {
		return new DecimalFormat("#0.000").format(time) + " " + unit;
	}
	
	private long getCurrentTime() throws ApplicationException {
		if(isMilliSecGranular())
			return System.currentTimeMillis();
		if(isMicroSecGranular())
			return System.nanoTime()/1000;
		return System.nanoTime();
	}
	
	private boolean isGranularityValid() {
		return isMilliSecGranular() || isMicroSecGranular() || isNanoSecGranular();
	}
	
	private boolean isMilliSecGranular() {
		if (granularity != null)
			return granularity.equals("ms");
		return true;
	}
	
	private boolean isMicroSecGranular() {
		if (granularity != null)
			return granularity.equals("us");
		return false;
	}
	
	private boolean isNanoSecGranular() {
		if (granularity != null)
			return granularity.equals("ns");
		return false;
	}
	
	private String getTaskPrefix() {
		return Thread.currentThread().getName();
	}
}