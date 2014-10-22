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
	
	public BaseResource[] getDaily_activiyForClass(String schoolId, String class_section_name) {
		Expression e1 = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.EQ, schoolId);
		Expression e2 = new Expression(daily_activity.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(daily_activity.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e5, new String[]{daily_activity.FIELD_ACTIVITY_DATE + " desc"});
	}
	
	public BaseResource[] getDaily_activiyForStudent(String studentId) {
		String school_id;
		String class_section_name;
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return null;
		school_id = _student.getSchool_id();
		class_section_name = _student.getClass_section_name();
		return getDaily_activiyForClass(school_id,class_section_name);
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) throws ApplicationException  {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(Daily_activityHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByJoining(e,list, new String[]{daily_activity.FIELD_ACTIVITY_DATE + " desc"});
	}
}
