package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.daily_activity;
import application.c4t.vehicle.school.resource.school_event;


public class School_eventHelper extends BaseHelper {
	
	School_eventHelper() {
		super(new school_event());
		// TODO Auto-generated constructor stub
	}
	private static School_eventHelper instance;
	
	public static School_eventHelper getInstance() {
		if (instance == null)
			instance = new School_eventHelper();
		return instance;
	}
	
	
	public void updateSend(String id) throws ApplicationException {
		school_event _event = new school_event(id);
		_event.setSent("Y");
		update(_event);
	}
	
	public void updateSentCounter(String id,int total_students_sent, 
			int total_users_sent, int total_sms_sent, int total_email_sent, 
			int total_app_notification_sent)  {
		school_event _event = new school_event(id);
		_event.setTotal_student_sent(total_students_sent);
		_event.setTotal_user_sent(total_users_sent);
		_event.setTotal_sms_sent(total_sms_sent);
		_event.setTotal_email_sent(total_email_sent);
		_event.setTotal_app_notification_sent(total_app_notification_sent);
		try {
			update(_event);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) throws ApplicationException  {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(School_eventHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByJoining(e,list, new String[]{school_event.FIELD_EVENT_DATE + " desc"});
	}
}
