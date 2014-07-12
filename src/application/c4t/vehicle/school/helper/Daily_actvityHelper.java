package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.daily_activity;


public class Daily_actvityHelper extends BaseHelper {
	
	Daily_actvityHelper() {
		super(new daily_activity());
		// TODO Auto-generated constructor stub
	}
	private static Daily_actvityHelper instance;
	
	public static Daily_actvityHelper getInstance() {
		if (instance == null)
			instance = new Daily_actvityHelper();
		return instance;
	}
}
