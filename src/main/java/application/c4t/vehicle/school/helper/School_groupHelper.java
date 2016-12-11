package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.school_group;


public class School_groupHelper extends BaseHelper {
	
	School_groupHelper() {
		super(new school_group());
		// TODO Auto-generated constructor stub
	}
	private static School_groupHelper instance;
	
	public static School_groupHelper getInstance() {
		if (instance == null)
			instance = new School_groupHelper();
		return instance;
	}
}
