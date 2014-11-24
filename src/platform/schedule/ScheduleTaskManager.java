package platform.schedule;

import java.util.HashMap;
import java.util.Map;


public class ScheduleTaskManager {
	private static ScheduleTaskManager  instance;
	Map<String, SchduleTask> taskTable;
	public static ScheduleTaskManager getInstance() {
		if (instance == null) {
			instance = new ScheduleTaskManager();
			
		}
		return instance;
	}
	
	ScheduleTaskManager() {
		// TODO Auto-generated constructor stub
		taskTable = new HashMap<String, SchduleTask>();
	}
	public void registerTask(SchduleTask task) {
		System.out.println("Registering the alert task for "+task.getType().toString());
		taskTable.put(task.getType().toString(), task);
	}
	
	public SchduleTask getTask(String type) {
		return taskTable.get(type);
	}
}
