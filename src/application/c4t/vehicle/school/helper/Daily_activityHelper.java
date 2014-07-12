package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.daily_activity;


public class Daily_activityHelper extends BaseHelper {
	
	Daily_activityHelper() {
		super(new daily_activity());
		// TODO Auto-generated constructor stub
	}
	private static Daily_activityHelper instance;
	
	public static Daily_activityHelper getInstance() {
		if (instance == null)
			instance = new Daily_activityHelper();
		return instance;
	}
}
