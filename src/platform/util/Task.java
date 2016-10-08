/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

import java.util.ArrayList;
import java.util.List;

public class Task {
	private String id;
	private Task parent;
	private List<Task> children;
	
	private long startTime;
	private long endTime;
	
	Task(String id, Task parentTask) {
		this.id = id;
		this.parent = parentTask;
		this.children = new ArrayList<Task>();
		if (parentTask != null) {
			parentTask.addChild(this);
		}
	}
	
	void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	
	String getId() {
		return id;
	}
	
	Task getParent() {
		return parent;
	}
	
	List<Task> getChildren() {
		return children;
	}
	
	private void addChild(Task child) {
		children.add(child);
	}
	
	long getDuration() throws ApplicationException {
		if(endTime < startTime)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Task has not yet ended: " + id);
		return endTime - startTime;
	}
	
	void clear() {
		parent = null;
		children.clear();
	}
}