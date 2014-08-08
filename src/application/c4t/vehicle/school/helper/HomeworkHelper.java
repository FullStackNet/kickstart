package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.homework;
import application.c4t.vehicle.school.resource.student;


public class HomeworkHelper extends BaseHelper {
	
	HomeworkHelper() {
		super(new homework());
		// TODO Auto-generated constructor stub
	}
	private static HomeworkHelper instance;
	
	public static HomeworkHelper getInstance() {
		if (instance == null)
			instance = new HomeworkHelper();
		return instance;
	}
	
	public BaseResource[] getByClassSectionName(String school_id, String class_section_name) {
		Expression e1 = new Expression(homework.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(homework.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		
		return getByExpression(e,new String[]{homework.FIELD_SUBMIT_TIMESTAMP + " DESC"});
	}
	
	public BaseResource[] getByStudent(String studentId) {
		String school_id;
		String class_section_name;
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return null;
		school_id = _student.getSchool_id();
		class_section_name = _student.getClass_section_name();
		return getByClassSectionName(school_id,class_section_name);
	}
}
