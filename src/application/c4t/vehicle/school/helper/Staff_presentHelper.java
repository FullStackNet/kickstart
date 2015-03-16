package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.staff;
import application.c4t.vehicle.school.resource.staff_present;
import application.c4t.vehicle.school.resource.staff_present_detail;
import application.c4t.vehicle.school.resource.staff_timing;


public class Staff_presentHelper extends BaseHelper {
	Staff_presentHelper() {
		super(new staff_present());
		// TODO Auto-generated constructor stub
	}
	private static Staff_presentHelper instance;
	
	public static Staff_presentHelper getInstance() {
		if (instance == null)
			instance = new Staff_presentHelper();
		return instance;
	}
	public void updateTotalPresent(String key) {
		BaseResource[] resources = Staff_present_detailHelper.getInstance().getDetail(key);
		if (!Util.isEmpty(resources)) {
			staff_present _present = new staff_present(key);
			_present.setTotal_present(resources.length);
			try {
				Staff_presentHelper.getInstance().update(_present);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateInSchoolAttendance(staff _staff,String cardId) throws ApplicationException {
		long currentTime = new Date().getTime();
		school _school = (school) SchoolHelper.getInstance().getById(_staff.getSchool_id());
		String timeZone = "IST";
		if (_school != null)
			timeZone = _school.getTimezone();
		boolean isSchoolTimingConfigured = true;
		staff_timing _timings = (staff_timing)Staff_timingHelper.getInstance().getById(_staff.getTiming_id());
		if (_timings == null) {
			isSchoolTimingConfigured = false;
		}
		
		String today = TimeUtil.getDateStringMMDDYYYY("IST", new Date().getTime(),"-");
		String entryKey =  _staff.getSchool_id();
		entryKey = entryKey +"^"+"STAFF"+"^"+"ENTRY"+today;
		staff_present _present = (staff_present)Staff_presentHelper.getInstance().getById(entryKey);
		if (_present == null){
			_present = new staff_present(entryKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_staff.getSchool_id());
			_present.setPresent_type("STAFF");
			_present.setPresent_record_type("ENTRY");
			Staff_presentHelper.getInstance().add(_present);
		}
		
		String entryKeyDetail = entryKey+"^"+_staff.getId();
		staff_present_detail _detail = (staff_present_detail)Staff_present_detailHelper.getInstance().getById(entryKeyDetail); 
		if (_detail == null) {
			_detail = new staff_present_detail(entryKeyDetail);
			_detail.setPresent_parent_id(entryKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_staff.getSchool_id());
			_detail.setPresent_type("STAFF");
		    _detail.setPresent_record_type("ENTRY");
			_detail.setDate_str(today);
			_detail.setEntry_time(currentTime);
			_detail.setStaff_id(_staff.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			if (isSchoolTimingConfigured) {
				if (!Util.isEmpty(_timings.getStart_time())) {
					long currentDaytime = TimeUtil.getDayTime(timeZone, currentTime);
					long startDaytime = TimeUtil.getDayTime(_timings.getStart_time());	
					long allowedtime = startDaytime+_timings.getEntry_buffer_afterInMinEx()*60;
					if (currentDaytime > allowedtime) {
						_detail.setLate_comingInMin((currentDaytime-startDaytime)/60);
					}
				}
			}
			Staff_present_detailHelper.getInstance().add(_detail);
			_detail = (staff_present_detail)Staff_present_detailHelper.getInstance().getById(entryKeyDetail); 
			updateTotalPresent(entryKey);
				return;
		} 
		
		if ((currentTime - _detail.getCreation_time()) < 2*60*1000L) {
			return;
		}
		
		long entrytime = _detail.getCreation_time();
		long latecomming = _detail.getLate_comingInMinEx();
		
		String exitKey =  _staff.getSchool_id();
		exitKey = exitKey +"^"+"STAFF"+"^"+"EXIT"+today;
		// create a presnt entry record;
		String exitKeyDetail = exitKey+"^"+_staff.getId();
		
		_present = (staff_present)Staff_presentHelper.getInstance().getById(exitKey);
		if (_present == null){
			_present = new staff_present(exitKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_staff.getSchool_id());
			_present.setPresent_type("STAFF");
			_present.setPresent_record_type("EXIT");
			Staff_presentHelper.getInstance().add(_present);
		}
		_detail = (staff_present_detail)Staff_present_detailHelper.getInstance().getById(exitKeyDetail); 
		if (_detail == null) {
			_detail = new staff_present_detail(exitKeyDetail);
			_detail.setPresent_parent_id(exitKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_staff.getSchool_id());
			_detail.setPresent_type("STAFF");
			_detail.setPresent_record_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStaff_id(_staff.getId());
			_detail.setEntry_time(entrytime);
			_detail.setLate_comingInMin(latecomming);
			_detail.setWorkingInMin((currentTime-entrytime)/(1000*60));
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Staff_present_detailHelper.getInstance().add(_detail);
		} else {
			_detail = new staff_present_detail(exitKeyDetail);
			_detail.setCreation_time(new Date().getTime());
			_detail.setWorkingInMin((currentTime-entrytime)/(1000*60));
			Staff_present_detailHelper.getInstance().update(_detail);
		}	
		updateTotalPresent(exitKey);
	}
			
	public void updateSend(String id) throws ApplicationException {
		staff_present _present = new staff_present(id);
		_present.setSent("Y");
		Staff_presentHelper.getInstance().update(_present);
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(Staff_presentHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(staff_present.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		try {
			return getByJoining(e,list, new String[]{staff_present.FIELD_DATE+ " desc"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}
}
