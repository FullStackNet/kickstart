package platform.helper;

import platform.resource.schedule;


public class ScheduleHelper extends BaseHelper {
	
	public ScheduleHelper() {
		super(new schedule());
		// TODO Auto-generated constructor stub
	}
	private static ScheduleHelper instance;
	
	public static ScheduleHelper getInstance() {
		if (instance == null)
			instance = new ScheduleHelper();
		return instance;
	}
}
