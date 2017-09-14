package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.daily_activity;
import application.c4t.vehicle.school.resource.message2parent;
import application.c4t.vehicle.school.resource.message2school;


public class Message2parentHelper extends BaseHelper {
	
	Message2parentHelper() {
		super(new message2parent());
		// TODO Auto-generated constructor stub
	}
	private static Message2parentHelper instance;
	
	public static Message2parentHelper getInstance() {
		if (instance == null)
			instance = new Message2parentHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getBySchool(String[] schoolIds) {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(Message2parentHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schoolIds);
		try {
			return getByJoining(e,list, new String[]{message2school.FIELD_LAST_UPDATED + " desc"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>(); 
	}
	
	public BaseResource[] getByStudent(String studentId) {
		Expression e = new Expression(message2parent.FIELD_STUDENT_ID,REL_OP.EQ, studentId);
		return getByExpression(e, new String[]{message2parent.FIELD_LAST_UPDATED +" desc"});
	}
	
	public ArrayList<Map<String, Object>> getByUser(String userId) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		return getBySchool(schoolIds);
	}
		
}
