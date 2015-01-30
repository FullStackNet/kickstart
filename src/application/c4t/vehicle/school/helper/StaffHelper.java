package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.staff;


public class StaffHelper extends BaseHelper {
	
	StaffHelper() {
		super(new  staff());
		// TODO Auto-generated constructor stub
	}
	private static StaffHelper instance;
	
	public static StaffHelper getInstance() {
		if (instance == null)
			instance = new StaffHelper();
		return instance;
	}
}
