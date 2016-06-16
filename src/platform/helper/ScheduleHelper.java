package platform.helper;



import java.util.Date;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.schedule.ScheduleFactory;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.school.resource.student;


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
	
	public void deleteResultDeclareSchedule(String id) {
		Expression e1 = new Expression(schedule.FIELD_REFERENCE_ID, REL_OP.EQ, id);
		Expression e2 = new Expression(schedule.FIELD_TYPE, REL_OP.EQ, ScheduleFactory.RESULT_DECLARE);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		ScheduleHelper.getInstance().deleteByExpression(e);
	}
	
	public void createBirthdaySchedule(student _student) {
		deleteBirthdaySchedule(_student.getId());
		if (Util.isEmpty(_student.getDob())) return;
		schedule _schedule = new schedule();
		_schedule.setName(ScheduleFactory.BIRTHDAY+" of " + _student.getName() +" ("+ _student.getAdmission_no()+")");
		_schedule.setType(ScheduleFactory.BIRTHDAY);
		_schedule.setReference_id(_student.getId());
		_schedule.setFrequency(schedule.FRQUENCY_YEARLY);
		_schedule.setReference_name(_student.getName());
		long time = TimeUtil.getTimeFromDateStringWithCurrentYear(null, _student.getDob(),"07:00:00");
		long currentTime =  new Date().getTime();
		if (time < currentTime) {
			time = TimeUtil.addYear(time,1);
		}
		_schedule.setDate_str(TimeUtil.getDisplayDateString(null,time));
		_schedule.setDate(TimeUtil.getTimeFromDateString(_schedule.getDate_str(), null));
		_schedule.setTime("07:00:00");
		_schedule.setSchedule_time(time);
		_schedule.setSchedule_status(schedule.STATUS_NOT_SCHEDULED);
		_schedule.setCustomer_id(_student.getCustomer_id());
		_schedule.setSchool_id(_student.getSchool_id());	
		_schedule.setReference_date(_student.getDob());
		try {
			ScheduleHelper.getInstance().add(_schedule);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void createResultDeclareSchedule(String allocationId,String schoolId,String customerId, String date, String timestamp) {
		deleteBirthdaySchedule(allocationId);
		if (Util.isEmpty(date)) return;
		schedule _schedule = new schedule();
		_schedule.setName(ScheduleFactory.RESULT_DECLARE+" of " + allocationId);
		_schedule.setType(ScheduleFactory.RESULT_DECLARE);
		_schedule.setReference_id(allocationId);
		_schedule.setFrequency(schedule.FRQUENCY_ONCE);
		_schedule.setReference_name(allocationId);
		long time = TimeUtil.getTimeFromDateStringWithCurrentYear(null, date,timestamp);
		long currentTime =  new Date().getTime();
		if (time < currentTime) {
			time = TimeUtil.addYear(time,1);
		}
		_schedule.setDate_str(TimeUtil.getDisplayDateString(null,time));
		_schedule.setDate(TimeUtil.getTimeFromDateString(_schedule.getDate_str(), null));
		_schedule.setTime(timestamp);
		_schedule.setSchedule_time(time);
		_schedule.setSchedule_status(schedule.STATUS_NOT_SCHEDULED);
		_schedule.setCustomer_id(customerId);
		_schedule.setSchool_id(schoolId);	
		_schedule.setReference_date(date);
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
			return getLatest(e, new String[]{schedule.FIELD_SCHEDULE_TIME}, 100);
	}
	
	public void reschedule(String id, long time) {
		schedule _schedule = new schedule(id);
		_schedule.setSchedule_time(time);
		_schedule.setDate_str(TimeUtil.getDisplayDateString(null,time));
		_schedule.setDate(TimeUtil.getTimeFromDateString(_schedule.getDate_str(), null));
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
