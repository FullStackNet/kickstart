package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.school;


public class SchoolHelper extends BaseHelper {
	
	SchoolHelper() {
		super(new school());
		// TODO Auto-generated constructor stub
	}
	private static SchoolHelper instance;
	
	public static SchoolHelper getInstance() {
		if (instance == null)
			instance = new SchoolHelper();
		return instance;
	}
	
}
