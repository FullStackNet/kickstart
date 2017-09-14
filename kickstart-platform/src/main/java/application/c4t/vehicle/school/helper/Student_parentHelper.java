package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.user;
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
	
	public BaseResource[] getByMobileNo(String[] mobileno,String[] orderby) {
		Expression e = new Expression(student_parent.FIELD_MOBILE_NO, REL_OP.IN, mobileno);
		return getByExpression(e, orderby);
	}
	
	public student_parent getByMobileOrEmailId(String mobileno,String emailId) {
		Expression e = null;
		
		if (!Util.isEmpty(mobileno)) {
			if ((mobileno != null) && mobileno.startsWith("91")) {
				if (mobileno.length() > 10) {
					mobileno = mobileno.substring(2, mobileno.length());
				}
			}
			if ((mobileno != null) &&  mobileno.startsWith("+91")) {
				if (mobileno.length() > 10) {
					mobileno = mobileno.substring(3, mobileno.length());
				}
			}
			e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
			BaseResource[] resources = getByExpression(e);
			if (!Util.isEmpty(resources)) {
				return (student_parent)resources[0];
			}
		}
		if (!Util.isEmpty(emailId)) {
			e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
			BaseResource[] resources = getByExpression(e);
			if (!Util.isEmpty(resources)) {
				return (student_parent)resources[0];
			}
		}
		return null;
	}
}
