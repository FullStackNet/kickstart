package platform.alert;

import java.util.HashMap;
import java.util.Map;


public class AlertTaskManager {
	private static AlertTaskManager  instance;
	Map<String, AlertTask> taskTable;
	public static AlertTaskManager getInstance() {
		if (instance == null) {
			instance = new AlertTaskManager();
			
		}
		return instance;
	}
	
	AlertTaskManager() {
		// TODO Auto-generated constructor stub
		taskTable = new HashMap<String, AlertTask>();
	}
	public void registerTask(AlertTask task) {
		System.out.println("Registering the alert task for "+task.getType().toString());
		taskTable.put(task.getType().toString(), task);
	}
	
	public AlertTask getTask(String type) {
		return taskTable.get(type);
	}
}
