package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
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
	
	public ArrayList<Map<String, Object>> getTeacherSubjectListMap(String teacherId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		BaseResource[] _resources;
		Expression expression = new Expression(teacher_subject.FIELD_TEACHER_ID, REL_OP.EQ, teacherId);
		_resources = getByExpression(expression);
		for(BaseResource resource : _resources) {
			Map<String, Object> _map = resource.convertResourceToMap();
			list.add(_map);
		}
		return list;
	}
	
	public BaseResource[] getSubjectByClassSection(String school_id, String class_section, String teacher_id) {
		Expression e1 = new Expression(teacher_subject.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(teacher_subject.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(teacher_subject.FIELD_TEACHER_ID, REL_OP.EQ, teacher_id);
		Expression e  = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e);
	}

}
