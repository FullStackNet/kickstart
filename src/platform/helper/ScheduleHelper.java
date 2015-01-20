package platform.helper;



import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.util.ApplicationException;


public class ScheduleHelper extends BaseHelper {
	
	public ScheduleHelper() {
		super(new schedule());
		// TODO Auto-generated constructor stub
	}
	private static ScheduleHelper instance;
	
	public static ScheduleHelper getInstance() {
		if (instance == null)
			instance = new ScheduleHelper();
		return instance;
	}
	public BaseResource[] getExpiredSchedule(long time) {
			Expression e1 = new Expression(schedule.FIELD_SCHEDULE_TIME ,REL_OP.LTEQ, time);
			Expression e2 = new Expression(schedule.FIELD_SCHEDULE_STATUS ,REL_OP.EQ, schedule.STATUS_NOT_SCHEDULED);
			Expression e = new Expression(e1, LOG_OP.AND, e2);
			return getByExpression(e, new String[]{schedule.FIELD_SCHEDULE_TIME});
	}
	public void reschedule(String id, long time) {
		schedule _schedule = new schedule(id);
		_schedule.setSchedule_time(time);
		_schedule.setSchedule_status(schedule.STATUS_NOT_SCHEDULED);
		try {
			ScheduleHelper.getInstance().update(_schedule);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateStatus(String id, String status) {
		schedule _schedule = new schedule(id);
		_schedule.setSchedule_status(status);
		try {
			ScheduleHelper.getInstance().update(_schedule);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
