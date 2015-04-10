package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.course;


public class CourseHelper extends BaseHelper {
	
	CourseHelper() {
		super(new course());
		// TODO Auto-generated constructor stub
	}
	private static CourseHelper instance;
	
	public static CourseHelper getInstance() {
		if (instance == null)
			instance = new CourseHelper();
		return instance;
	}
}
