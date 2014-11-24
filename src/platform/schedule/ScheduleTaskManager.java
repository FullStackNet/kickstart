package platform.schedule;

import java.util.HashMap;
import java.util.Map;


public class ScheduleTaskManager {
	private static ScheduleTaskManager  instance;
	Map<String, ScheduleTask> taskTable;
	public static ScheduleTaskManager getInstance() {
		if (instance == null) {
			instance = new ScheduleTaskManager();
			
		}
		return instance;
	}
	
	ScheduleTaskManager() {
		// TODO Auto-generated constructor stub
		taskTable = new HashMap<String, ScheduleTask>();
	}
	public void registerTask(ScheduleTask task) {
		System.out.println("Registering the Schedule task for "+task.getType().toString());
		taskTable.put(task.getType().toString(), task);
	}
	
	public ScheduleTask getTask(String type) {
		return taskTable.get(type);
	}
}
