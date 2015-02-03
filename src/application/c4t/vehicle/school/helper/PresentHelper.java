package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.helper.Id_cardHelper;
import platform.helper.NotificationHelper;
import platform.log.ApplicationLogger;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.id_card;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.helper.Route_stopageHelper;
import application.c4t.vehicle.helper.TripHelper;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.trip;
import application.c4t.vehicle.school.resource.absent;
import application.c4t.vehicle.school.resource.present;
import application.c4t.vehicle.school.resource.present_detail;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.staff;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.trip_student_detail;


public class PresentHelper extends BaseHelper {
	PresentHelper() {
		super(new present());
		// TODO Auto-generated constructor stub
	}
	private static PresentHelper instance;
	
	public static PresentHelper getInstance() {
		if (instance == null)
			instance = new PresentHelper();
		return instance;
	}
	public void updateTotalPresent(String key) {
		BaseResource[] resources = Present_detailHelper.getInstance().getDetail(key);
		if (!Util.isEmpty(resources)) {
			present _present = new present(key);
			_present.setTotal_present(resources.length);
			try {
				PresentHelper.getInstance().update(_present);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void updateInBusAttendance(route _route,String cardId) throws ApplicationException {
		long currentTime = new Date().getTime();
		
		String today = TimeUtil.getDateString("IST", new Date().getTime(),"-");
		BaseResource[] students = StudentHelper.getInstance().getStudentByCardNo(cardId);
		if (Util.isEmpty(students)) {
			ApplicationLogger.error(" No student found for card " +cardId, this.getClass());
			return;
		}
		
		if (students.length > 1) {
			ApplicationLogger.error(" Multiple student detected for card " +cardId, this.getClass());
			//need to send the alerts admin
		}
		boolean entryRecordExist = true;
		student _student = (student)students[0];
		route_stopage pickup_route_stopage = (route_stopage)Route_stopageHelper.getInstance().getById(_student.getPickup_route_stopage_id());
		if (pickup_route_stopage == null)
			return;
		
		route_stopage dropped_route_stopage = (route_stopage)Route_stopageHelper.getInstance().getById(_student.getDropped_route_stopage_id());
		
		if (dropped_route_stopage == null)
			return;
		appliance _appliance = ApplianceHelper.getInstance().getById(_route.getAppliance_id());
		if (!_route.getId().equals(pickup_route_stopage.getRoute_id()) && 
				(!_route.getId().equals(dropped_route_stopage.getRoute_id()))) {
			ApplicationLogger.error("Rejecting the card not in right route ... " +cardId, this.getClass());
			return;
		}
		String entryKey =  _route.getId()+"^";
		entryKey = entryKey +"^"+"BUS"+"^"+_route.getType()+"^"+"ENTRY"+today;
		present _present = (present)PresentHelper.getInstance().getById(entryKey);
		if (_present == null){
			_present = new present(entryKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_student.getSchool_id());
			_present.setRoute_id(_route.getId());
			_present.setRoute_name(_route.getName());
			_present.setPresent_type("BUS");
			_present.setSub_present_type(_route.getType());
			_present.setPresent_record_type("ENTRY");
			PresentHelper.getInstance().add(_present);
		}
		String entryKeyDetail = entryKey+"^"+_student.getId();
		present_detail _detail = (present_detail)Present_detailHelper.getInstance().getById(entryKeyDetail); 
		if (_detail == null) {
			_detail = new present_detail(entryKeyDetail);
			_detail.setPresent_parent_id(entryKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_student.getSchool_id());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_detail.setClass_section_name(class_section_name);
			_detail.setPresent_type("BUS");
		    _detail.setSub_present_type(_route.getType());
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setPresent_record_type("ENTRY");
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
			_detail = (present_detail)Present_detailHelper.getInstance().getById(entryKeyDetail); 
			entryRecordExist = false;
			String tripId = trip.id(_route.getId(),_appliance.getTimeZone(), new Date(), _route.getStart_timeEx());
			TripHelper.getInstance().addStudent(tripId, _student.getId());
			trip_student_detail _trip_student_detail = new trip_student_detail(trip_student_detail.id(tripId, _student.getId()));
			_trip_student_detail.setClass_name(_student.getClass_name());
			_trip_student_detail.setSection_name(_student.getSection_name());
			_trip_student_detail.setStudent_name(_student.getName());
			_trip_student_detail.setStudent_id(_student.getId());
			_trip_student_detail.setStopage_name(_appliance.getLast_stopage_name());
			_trip_student_detail.setStopage_id(_appliance.getLastStopageId());
			_trip_student_detail.setEntry_time(currentTime);
			_trip_student_detail.setRoute_id(_route.getId());
			Trip_student_detailHelper.getInstance().AddOrUpdate(_trip_student_detail);	
			Map<String, Object> map = new HashMap<String, Object>();
			school _school = (school) SchoolHelper.getInstance().getById(_student.getSchool_id());
			map.put("BRAND_NAME", "School");
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID,_trip_student_detail.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SCHOOL_ID,
					_student.getSchool_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID,_student.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME,_student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TYPE,_route.getType());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_SECTION_NAME,_student.getClass_section_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE,currentTime);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID,_student.getCustomer_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME,TimeUtil.getStringFromOnlyTime(_school.getTimezone(), currentTime));
			if ((_school != null) && (_school.getBrand_name() != null)) {
				map.put("BRAND_NAME", _school.getBrand_name());
			} 
			NotificationHelper.getInstance().addNotificationNonAppliance(NotificationFactory.NOTIFICATION_BUS_ENTRY, 
					NotificationFactory.SEVERIRY_INFO, 
					map, 
					new Date(currentTime)); 
		}
		updateTotalPresent(entryKey);
		if ((currentTime - _detail.getCreation_time()) < 60*1000L) {
			return;
		}
		if (!entryRecordExist)
			return;
		String exitKey =  _route.getId()+"^";
		exitKey = exitKey +"^"+"BUS"+"^"+_route.getType()+"^"+"EXIT"+today;
		// create a presnt entry record;
		String exitKeyDetail = exitKey+"^"+_student.getId();
		
		_present = (present)PresentHelper.getInstance().getById(exitKey);
		if (_present == null){
			_present = new present(exitKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_student.getSchool_id());
			_present.setRoute_id(_route.getId());
			_present.setRoute_name(_route.getName());
			_present.setPresent_type("BUS");
			_present.setSub_present_type(_route.getType());
			_present.setPresent_record_type("EXIT");
			PresentHelper.getInstance().add(_present);
		}
		_detail = (present_detail)Present_detailHelper.getInstance().getById(exitKeyDetail); 
		if (_detail == null) {
			_detail = new present_detail(exitKeyDetail);
			_detail.setPresent_parent_id(exitKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_student.getSchool_id());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_detail.setClass_section_name(class_section_name);
			_detail.setPresent_type("BUS");
		    _detail.setSub_present_type(_route.getType());
			_detail.setPresent_record_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
			_detail = (present_detail)Present_detailHelper.getInstance().getById(exitKeyDetail); 
			String tripId = trip.id(_route.getId(),_appliance.getTimeZone(), new Date(), _route.getStart_timeEx());
			TripHelper.getInstance().addStudent(tripId, _student.getId());	
			trip_student_detail _trip_student_detail = new trip_student_detail(trip_student_detail.id(tripId, _student.getId()));
			_trip_student_detail.setClass_name(_student.getClass_name());
			_trip_student_detail.setSection_name(_student.getSection_name());
			_trip_student_detail.setStudent_name(_student.getName());
			_trip_student_detail.setStudent_id(_student.getId());
			_trip_student_detail.setStopage_name(_appliance.getLast_stopage_name());
			_trip_student_detail.setStopage_id(_appliance.getLastStopageId());
			_trip_student_detail.setExit_time(new Date().getTime());
			_trip_student_detail.setRoute_id(_route.getId());
			Trip_student_detailHelper.getInstance().AddOrUpdate(_trip_student_detail);	
			Map<String, Object> map = new HashMap<String, Object>();
			school _school = (school) SchoolHelper.getInstance().getById(_student.getSchool_id());
			map.put("BRAND_NAME", "School");
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID,_trip_student_detail.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SCHOOL_ID,
					_student.getSchool_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID,_student.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME,_student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_TYPE,_route.getType());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_SECTION_NAME,_student.getClass_section_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE,currentTime);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID,_student.getCustomer_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME,TimeUtil.getStringFromOnlyTime(_school.getTimezone(), currentTime));
			
			if ((_school != null) && (_school.getBrand_name() != null)) {
				map.put("BRAND_NAME", _school.getBrand_name());
			} 
			NotificationHelper.getInstance().addNotificationNonAppliance(NotificationFactory.NOTIFICATION_BUS_EXIT, 
					NotificationFactory.SEVERIRY_INFO, 
					map, 
					new Date(currentTime)); 

		} else {
			_detail = new present_detail(exitKeyDetail);
			_detail.setCreation_time(new Date().getTime());
			Present_detailHelper.getInstance().update(_detail);
			String tripId = trip.id(_route.getId(),_appliance.getTimeZone(), new Date(), _route.getStart_timeEx());
			trip_student_detail _trip_student_detail = new trip_student_detail(trip_student_detail.id(tripId, _student.getId()));
			_trip_student_detail.setClass_name(_student.getClass_name());
			_trip_student_detail.setSection_name(_student.getSection_name());
			_trip_student_detail.setStudent_name(_student.getName());
			_trip_student_detail.setStudent_id(_student.getId());
			_trip_student_detail.setStopage_name(_appliance.getLast_stopage_name());
			_trip_student_detail.setStopage_id(_appliance.getLastStopageId());
			_trip_student_detail.setExit_time(new Date().getTime());
			_trip_student_detail.setRoute_id(_route.getId());
			Trip_student_detailHelper.getInstance().AddOrUpdate(_trip_student_detail);	

		}	
		updateTotalPresent(exitKey);
	}
	
	public void updateInSchoolAttendance(String cardId,String readerId) throws ApplicationException {
		long currentTime = new Date().getTime();
		Id_cardHelper.getInstance().verifyAndAdd(cardId, readerId);
		String today = TimeUtil.getDateString("IST", new Date().getTime(),"-");
		BaseResource[] students = StudentHelper.getInstance().getStudentByCardNo(cardId);
		if (Util.isEmpty(students)) {
			BaseResource[] staffs =StaffHelper.getInstance().getStaffByCardNo(cardId);
			if (staffs.length > 1) {
				ApplicationLogger.error(" Multiple staffs detected for card " +cardId, this.getClass());
				//need to send the alerts admin
				return;
			} if (staffs.length == 1) { 
				Staff_presentHelper.getInstance().updateInSchoolAttendance((staff)staffs[0], cardId);
				return;
			}
			
			ApplicationLogger.error(" No student or Staff found for card " +cardId, this.getClass());
			return;
		}
		if (students.length > 1) {
			ApplicationLogger.error(" Multiple student detected for card " +cardId, this.getClass());
			//need to send the alerts admin
			return;
		}
		student _student = (student)students[0];
		String entryKey =  _student.getSchool_id()+_student.getClass_name()+"^"+_student.getSection_name();
		entryKey = entryKey +"^"+"SCHOOL"+"^"+"ENTRY"+today;
		present _present = (present)PresentHelper.getInstance().getById(entryKey);
		if (_present == null){
			_present = new present(entryKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_student.getSchool_id());
			_present.setClass_name(_student.getClass_name());
			_present.setSection_name(_student.getSection_name());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_present.setClass_section_name(class_section_name);
			_present.setPresent_type("SCHOOL");
			_present.setPresent_record_type("ENTRY");
			PresentHelper.getInstance().add(_present);
		}
		
		String entryKeyDetail = entryKey+"^"+_student.getId();
		present_detail _detail = (present_detail)Present_detailHelper.getInstance().getById(entryKeyDetail); 
		if (_detail == null) {
			_detail = new present_detail(entryKeyDetail);
			_detail.setPresent_parent_id(entryKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_student.getSchool_id());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_detail.setClass_section_name(class_section_name);
			_detail.setPresent_type("SCHOOL");
		    _detail.setPresent_record_type("ENTRY");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
			_detail = (present_detail)Present_detailHelper.getInstance().getById(entryKeyDetail); 
			updateTotalPresent(entryKey);
			StudentHelper.getInstance().incrementCounter(_student.getId(),student.FIELD_TOTAL_PRESENT, 1);
			Map<String, Object> map = new HashMap<String, Object>();
			school _school = (school) SchoolHelper.getInstance().getById(_student.getSchool_id());
			map.put("BRAND_NAME", "School");
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID,_detail.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SCHOOL_ID,
					_student.getSchool_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID,_student.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME,_student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_SECTION_NAME,_student.getClass_section_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE,currentTime);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID,_student.getCustomer_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME,TimeUtil.getStringFromOnlyTime(_school.getTimezone(), currentTime));
			
			if ((_school != null) && (_school.getBrand_name() != null)) {
				map.put("BRAND_NAME", _school.getBrand_name());
			} 
			NotificationHelper.getInstance().addNotificationNonAppliance(NotificationFactory.NOTIFICATION_SCHOOL_ENTRY, 
					NotificationFactory.SEVERIRY_INFO, 
					map, 
					new Date(currentTime)); 

			return;
		} 
		
		if ((currentTime - _detail.getCreation_time()) < 60*1000L) {
			return;
		}
		
		String exitKey =  _student.getSchool_id()+_student.getClass_name()+"^"+_student.getSection_name();
		exitKey = exitKey +"^"+"SCHOOL"+"^"+"EXIT"+today;
		// create a presnt entry record;
		String exitKeyDetail = exitKey+"^"+_student.getId();
		
		_present = (present)PresentHelper.getInstance().getById(exitKey);
		if (_present == null){
			_present = new present(exitKey);
			_present.setDate_str(today);
			_present.setDate(TimeUtil.getTimeFromDateString(null, today));
			_present.setSchool_id(_student.getSchool_id());
			_present.setClass_name(_student.getClass_name());
			_present.setSection_name(_student.getSection_name());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_present.setClass_section_name(class_section_name);
			_present.setPresent_type("SCHOOL");
			_present.setPresent_record_type("EXIT");
			PresentHelper.getInstance().add(_present);
		}
		_detail = (present_detail)Present_detailHelper.getInstance().getById(exitKeyDetail); 
		if (_detail == null) {
			_detail = new present_detail(exitKeyDetail);
			_detail.setPresent_parent_id(exitKey);
			_detail.setDate_str(today);
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			_detail.setSchool_id(_student.getSchool_id());
			 String class_section_name = _student.getClass_name()+" "+_student.getSection_name();
			_detail.setClass_section_name(class_section_name);
			_detail.setPresent_type("SCHOOL");
			_detail.setPresent_record_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
			Map<String, Object> map = new HashMap<String, Object>();
			school _school = (school) SchoolHelper.getInstance().getById(_student.getSchool_id());
			map.put("BRAND_NAME", "School");
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_ID,_detail.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_SCHOOL_ID,
					_student.getSchool_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_ID,_student.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STUDENT_NAME,_student.getShort_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CLASS_SECTION_NAME,_student.getClass_section_name());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REFERENCE_DATE,currentTime);
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_CUSTOMER_ID,_student.getCustomer_id());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_DISPLAY_TIME,TimeUtil.getStringFromOnlyTime(_school.getTimezone(), currentTime));
			
			if ((_school != null) && (_school.getBrand_name() != null)) {
				map.put("BRAND_NAME", _school.getBrand_name());
			} 
			NotificationHelper.getInstance().addNotificationNonAppliance(NotificationFactory.NOTIFICATION_SCHOOL_EXIT, 
					NotificationFactory.SEVERIRY_INFO, 
					map, 
					new Date(currentTime)); 
		} else {
			_detail = new present_detail(exitKeyDetail);
			_detail.setCreation_time(new Date().getTime());
			Present_detailHelper.getInstance().update(_detail);
		}	
		updateTotalPresent(exitKey);
	}
	
	public void updateSend(String id) throws ApplicationException {
		present _present = new present(id);
		_present.setSent("Y");
		PresentHelper.getInstance().update(_present);
	}
	
	public BaseResource[] getDaily_activiyForClass(String customerId, String class_section_name) {
		Expression e1 = new Expression(present.FIELD_SCHOOL_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(present.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(present.FIELD_SENT, REL_OP.EQ, "Y");
		Expression e5 = new Expression(e3, LOG_OP.AND, e4);
		
		return getByExpression(e5, new String[]{absent.FIELD_DATE+ " desc"});
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(PresentHelper.getInstance());
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
