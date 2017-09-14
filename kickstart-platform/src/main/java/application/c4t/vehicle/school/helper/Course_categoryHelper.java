package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.course_category;
import platform.helper.BaseHelper;


public class Course_categoryHelper extends BaseHelper {
	
	Course_categoryHelper() {
		super(new course_category());
		// TODO Auto-generated constructor stub
	}
	private static Course_categoryHelper instance;
	
	public static Course_categoryHelper getInstance() {
		if (instance == null)
			instance = new Course_categoryHelper();
		return instance;
	}
}
