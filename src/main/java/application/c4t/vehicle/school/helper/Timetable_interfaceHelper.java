package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.timetable;
import application.c4t.vehicle.school.resource.timetable_interface;


public class Timetable_interfaceHelper extends BaseSchoolHelper {
	Timetable_interfaceHelper() {
		super(new timetable_interface());
		// TODO Auto-generated constructor stub
	}
	private static Timetable_interfaceHelper instance;
	
	public static Timetable_interfaceHelper getInstance() {
		if (instance == null)
			instance = new Timetable_interfaceHelper();
		return instance;
	}
	
	public BaseResource[] getByStudentId(String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return null;
		Expression e1 = new Expression(timetable.FIELD_SCHOOL_ID, REL_OP.EQ, _student.getSchool_id());
		Expression e2 = new Expression(timetable.FIELD_CLASS_NAME, REL_OP.EQ, _student.getClass_name());
		Expression e3 = new Expression(timetable.FIELD_SECTION_NAME, REL_OP.EQ, _student.getSection_name());
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);					
	}	
}
