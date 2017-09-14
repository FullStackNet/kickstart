package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.attendent;


public class AttendentHelper extends BaseHelper {
	
	public AttendentHelper() {
		super(new attendent());
		// TODO Auto-generated constructor stub
	}
	private static AttendentHelper instance;
	
	public static AttendentHelper getInstance() {
		if (instance == null)
			instance = new AttendentHelper();
		return instance;
	}
}
