package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.student_tutorial_history;


public class Student_tutorial_historyHelper extends BaseHelper {
	
	Student_tutorial_historyHelper() {
		super(new student_tutorial_history());
		// TODO Auto-generated constructor stub
	}
	private static Student_tutorial_historyHelper instance;
	
	public static Student_tutorial_historyHelper getInstance() {
		if (instance == null)
			instance = new Student_tutorial_historyHelper();
		return instance;
	}
}
