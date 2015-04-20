package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.holiday;


public class HolidayHelper extends BaseHelper {
	
	HolidayHelper() {
		super(new holiday());
		// TODO Auto-generated constructor stub
	}
	private static HolidayHelper instance;
	
	public static HolidayHelper getInstance() {
		if (instance == null)
			instance = new HolidayHelper();
		return instance;
	}
}
