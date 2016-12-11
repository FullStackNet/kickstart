package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
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
	
	public student_tutorial getByStudentId(String studentId) {
		Expression e = new Expression(student_tutorial.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return (student_tutorial)resources[0];
	}
}
