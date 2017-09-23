package platform.notification;

import java.util.HashMap;
import java.util.Map;


public class NotificationTaskManager {
	private static NotificationTaskManager  instance;
	Map<String, NotificationTask> taskTable;
	public static NotificationTaskManager getInstance() {
		if (instance == null) {
			instance = new NotificationTaskManager();
			
		}
		return instance;
	}
	
	NotificationTaskManager() {
		// TODO Auto-generated constructor stub
		taskTable = new HashMap<String, NotificationTask>();
	}
	public void registerTask(NotificationTask task) {
		System.out.println("Registering the Notification task for "+task.getType().toString());
		taskTable.put(task.getType().toString(), task);
	}
	
	public NotificationTask getTask(String type) {
		return taskTable.get(type);
	}
}
