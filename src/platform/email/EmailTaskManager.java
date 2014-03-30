package platform.email;

import java.util.HashMap;
import java.util.Map;


public class EmailTaskManager {
	private static EmailTaskManager  instance;
	Map<String, EmailTask> taskTable;
	public static EmailTaskManager getInstance() {
		if (instance == null) {
			instance = new EmailTaskManager();
			
		}
		return instance;
	}
	
	EmailTaskManager() {
		// TODO Auto-generated constructor stub
		taskTable = new HashMap<String, EmailTask>();
	}
	public void registerTask(EmailTask task) {
		System.out.println("Registering the email task for "+task.getType().toString());
		taskTable.put(task.getType().toString(), task);
	}
	
	public EmailTask getTask(String type) {
		return taskTable.get(type);
	}
}
