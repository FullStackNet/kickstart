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
import platform.util.Util;
import application.c4t.vehicle.school.resource.absent;
import application.c4t.vehicle.school.resource.school_timing;
import application.c4t.vehicle.school.resource.student;


public class School_timingHelper extends BaseHelper {
	School_timingHelper() {
		super(new school_timing());
		// TODO Auto-generated constructor stub
	}
	private static School_timingHelper instance;
	
	public static School_timingHelper getInstance() {
		if (instance == null)
			instance = new School_timingHelper();
		return instance;
	}
	
	public void addTiming(student _student) {
		String key = school_timing.id(_student.getSchool_id(), _student.getClass_name(), _student.getSection_name());
		school_timing _timing = new school_timing(key);
		_timing.setSchool_id(_student.getSchool_id());
		_timing.setClass_name(_student.getClass_name());
		_timing.setSection_name(_student.getSection_name());
		try {
			School_timingHelper.getInstance().AddOrUpdate(_timing);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseResource getSchoolTiming(String schoolId,String className,String sectionName) {
		Expression e1 = new Expression(school_timing.FIELD_SCHOOL_ID, REL_OP.EQ, schoolId);
		Expression e2 = new Expression(school_timing.FIELD_CLASS_NAME, REL_OP.EQ, className);
		Expression e3 = new Expression(school_timing.FIELD_SECTION_NAME, REL_OP.EQ, sectionName);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e5 = new Expression(e4, LOG_OP.AND, e3);
		BaseResource[] resources = getByExpression(e5);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return resources[0];
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(School_timingHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(absent.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		try {
			return getByJoining(e,list, new String[]{absent.FIELD_DATE+ " desc"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}
}
