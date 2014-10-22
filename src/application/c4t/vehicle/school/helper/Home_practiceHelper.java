package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.home_practice;
import application.c4t.vehicle.school.resource.student;


public class Home_practiceHelper extends BaseHelper {
	
	Home_practiceHelper() {
		super(new home_practice());
		// TODO Auto-generated constructor stub
	}
	private static Home_practiceHelper instance;
	
	public static Home_practiceHelper getInstance() {
		if (instance == null)
			instance = new Home_practiceHelper();
		return instance;
	}
	
	public BaseResource[] getHome_practiceForClass(String school_id, String class_section_name) {
		Expression e1 = new Expression(home_practice.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(home_practice.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(home_practice.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e5, new String[]{home_practice.FIELD_CREATION_TIME + " desc"});
	}
	
	public BaseResource[] getHome_practiceForStudent(String  student_id) {
		String school_id;
		String class_section_name;
		student _student = (student)StudentHelper.getInstance().getById(student_id);
		if (_student == null)
			return null;
		school_id = _student.getSchool_id();
		class_section_name = _student.getClass_section_name();
		return getHome_practiceForClass(school_id,class_section_name);
	}
	
	public void updateSend(String id) throws ApplicationException {
		home_practice _resource = new home_practice(id);
		_resource.setSent("Y");
		update(_resource);
	}
	
	public  ArrayList<Map<String, Object>>  getForSchools(String[] schools) throws ApplicationException {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(Home_practiceHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(home_practice.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByJoining(e,list, new String[]{home_practice.FIELD_CREATION_TIME + " desc"});
	}
}
