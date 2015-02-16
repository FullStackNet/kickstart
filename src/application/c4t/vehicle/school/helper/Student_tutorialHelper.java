package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.student_tutorial;


public class Student_tutorialHelper extends BaseHelper {
	
	Student_tutorialHelper() {
		super(new student_tutorial());
		// TODO Auto-generated constructor stub
	}
	private static Student_tutorialHelper instance;
	
	public static Student_tutorialHelper getInstance() {
		if (instance == null)
			instance = new Student_tutorialHelper();
		return instance;
	}
}
