package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.school.resource.student_parent;


public class Student_parentHelper extends BaseHelper {
	
	Student_parentHelper() {
		super(new student_parent());
		// TODO Auto-generated constructor stub
	}
	private static Student_parentHelper instance;
	
	public static Student_parentHelper getInstance() {
		if (instance == null)
			instance = new Student_parentHelper();
		return instance;
	}
	
	public student_parent getByMobileOrEmailId(String mobileno,String emailId) {
		Expression e1 = new Expression(student_parent.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		Expression e2 = new Expression(student_parent.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		Expression e = new Expression(e1, LOG_OP.OR, e2);
		
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (student_parent)resources[0];
		}
		return null;
	}
}
