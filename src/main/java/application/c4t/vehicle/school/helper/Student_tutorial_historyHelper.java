package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
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
	public BaseResource[] getByStudentId(String studentId) {
		Expression e = new Expression(student_tutorial_history.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		return getByExpression(e,new String[]{student_tutorial_history.FIELD_ASSIGNED_DATE +" desc"});
	}
}
