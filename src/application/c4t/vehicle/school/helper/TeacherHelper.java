package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.teacher;


public class TeacherHelper extends BaseHelper {
	
	TeacherHelper() {
		super(new teacher());
		// TODO Auto-generated constructor stub
	}
	private static TeacherHelper instance;
	
	public static TeacherHelper getInstance() {
		if (instance == null)
			instance = new TeacherHelper();
		return instance;
	}
}
