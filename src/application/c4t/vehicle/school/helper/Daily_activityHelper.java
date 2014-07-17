package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.daily_activity;


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
	
	public BaseResource[] getDaily_activiyForClass(String customerId, String class_section_name) {
		Expression e1 = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(daily_activity.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e3, new String[]{daily_activity.FIELD_ACTIVITY_DATE + " desc"});
	}
}
