package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.teacher_subject;


public class Teacher_subjectHelper extends BaseHelper {
	
	Teacher_subjectHelper() {
		super(new teacher_subject());
		// TODO Auto-generated constructor stub
	}
	private static Teacher_subjectHelper instance;
	
	public static Teacher_subjectHelper getInstance() {
		if (instance == null)
			instance = new Teacher_subjectHelper();
		return instance;
	}
}
