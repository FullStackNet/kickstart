package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;


public class SchoolHelper extends BaseHelper {
	
	SchoolHelper() {
		super(new school());
		// TODO Auto-generated constructor stub
	}
	private static SchoolHelper instance;
	
	public static SchoolHelper getInstance() {
		if (instance == null)
			instance = new SchoolHelper();
		return instance;
	}
	public BaseResource[] getSectionStudent(String school_id, String class_section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
}
