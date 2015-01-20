package platform.helper;



import application.c4t.vehicle.school.resource.student;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.schedule.ScheduleFactory;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;


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
	
	public void deleteBirthdaySchedule(String id) {
		Expression e1 = new Expression(schedule.FIELD_REFERENCE_ID, REL_OP.EQ, id);
		Expression e2 = new Expression(schedule.FIELD_TYPE, REL_OP.EQ, ScheduleFactory.BIRTHDAY);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		ScheduleHelper.getInstance().deleteByExpression(e);
	}
	
	public void createBirthdaySchedule(student _student) {
		deleteBirthdaySchedule(_student.getId());
		if (Util.isEmpty(_student.getDob())) return;
		schedule _schedule = new schedule();
		_schedule.setType(ScheduleFactory.BIRTHDAY);
		_schedule.setReference_id(_student.getId());
		_schedule.setFrequency(schedule.FRQUENCY_YEARLY);
		_schedule.setDate_str(_student.getDob());
		_schedule.setTime("07:00:00");
		_schedule.setDate(TimeUtil.getTimeFromDateString(null, _student.getDob()));
		_schedule.setSchedule_time(TimeUtil.getTimeFromDateString(null, _student.getDob(),"07:00:00"));
		_schedule.setSchedule_status(schedule.STATUS_NOT_SCHEDULED);
		_schedule.setCustomer_id(_student.getCustomer_id());
		_schedule.setSchool_id(_student.getSchool_id());		
		try {
			ScheduleHelper.getInstance().add(_schedule);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
