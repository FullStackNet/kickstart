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
import application.c4t.vehicle.school.resource.daily_activity;
import application.c4t.vehicle.school.resource.student;


public class Daily_activityHelper extends BaseHelper {
	
	Daily_activityHelper() {
		super(new daily_activity());
		// TODO Auto-generated constructor stub
	}
	private static Daily_activityHelper instance;
	
	public static Daily_activityHelper getInstance() {
		if (instance == null)
			instance = new Daily_activityHelper();
		return instance;
	}
	
	public void updateSend(String id) throws ApplicationException {
		daily_activity _daily_activity = new daily_activity(id);
		_daily_activity.setSent("Y");
		Daily_activityHelper.getInstance().update(_daily_activity);
	}
	
	public void addSchool(String id,String[] schoolIds) {
		daily_activity _activity = new daily_activity();
		_activity.setId(id);
		for(int i=0 ; i < schoolIds.length; i++) {
			_activity.addSchools(schoolIds[i]);
		}
		try {
			Daily_activityHelper.getInstance().update(_activity);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSchool(String id,String schoolId) {
		daily_activity _activity = new daily_activity();
		_activity.setId(id);
		_activity.addSchools(schoolId);
		try {
			Daily_activityHelper.getInstance().update(_activity);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public BaseResource[] getDaily_activiyForClass(String schoolId, String class_section_name,String class_name) {
		Expression e12 = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.EQ, schoolId);
		Expression e11 = new Expression(daily_activity.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, new String[]{schoolId});
		Expression e1 = new Expression(e12,LOG_OP.OR, e11);
		Expression e21 = new Expression(daily_activity.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e221 = new Expression(daily_activity.FIELD_SECTION_NAME, REL_OP.EQ, "ALL");
		Expression e222 = new Expression(daily_activity.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e22 = new Expression(e221, LOG_OP.AND, e222);
		Expression e2 = new Expression(e21, LOG_OP.OR, e22);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(daily_activity.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
			
		return getByExpression(e5, new String[]{daily_activity.FIELD_ACTIVITY_DATE + " desc"});
	}
	
	public BaseResource[] getDaily_activiyForStudent(String studentId) {
		String school_id;
		String class_section_name;
		String class_name;
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return null;
		school_id = _student.getSchool_id();
		class_section_name = _student.getClass_section_name();
		class_name = _student.getClass_name();
		return getDaily_activiyForClass(school_id,class_section_name,class_name);
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools,String[] order,long fromtime,long totime) throws ApplicationException  {
		try {
			HelperFactory.getInstance().register(SchoolHelper.getInstance());
			HelperFactory.getInstance().register(Daily_activityHelper.getInstance());
			ArrayList<JoinField> list = new ArrayList<JoinField>();
			JoinField field = new JoinField("school", "school_id", "school_name");
			list.add(field);
			
			Expression e2 = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
			Expression e1 = new Expression(daily_activity.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, schools);
			Expression e3 = new Expression(e1,LOG_OP.OR, e2);

			Expression e4 = new Expression(daily_activity.FIELD_ACTIVITY_DATE, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(daily_activity.FIELD_ACTIVITY_DATE, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e = new Expression(e3, LOG_OP.AND, e6);
			return getByJoining(e,list,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) throws ApplicationException  {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(Daily_activityHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e2 = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		Expression e1 = new Expression(daily_activity.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, schools);
		Expression e = new Expression(e1,LOG_OP.OR, e2);
		return getByJoining(e,list, new String[]{daily_activity.FIELD_ACTIVITY_DATE + " desc"});
	}
}
