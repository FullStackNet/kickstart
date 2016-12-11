package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.staff_timing;


public class Staff_timingHelper extends BaseHelper {
	
	Staff_timingHelper() {
		super(new  staff_timing());
		// TODO Auto-generated constructor stub
	}
	private static Staff_timingHelper instance;
	
	public static Staff_timingHelper getInstance() {
		if (instance == null)
			instance = new Staff_timingHelper();
		return instance;
	}
	
	
}
