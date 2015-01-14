package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.school.resource.absent;
import application.c4t.vehicle.school.resource.present;
import application.c4t.vehicle.school.resource.present_detail;
import application.c4t.vehicle.school.resource.student;


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
		student _student = (student)students[0];
		String entryKey =  _student.getSchool_id()+_student.getClass_name()+"^"+_student.getSection_name();
		entryKey = entryKey +"^"+"BUS"+"^"+_route.getType()+"^"+"ENTRY"+today;
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
			_present.setPresent_type("BUS");
			_present.setSub_present_type(_route.getType());
			_present.setPresent_type("ENTRY");
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
			_detail.setPresent_type("ENTRY");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
		}
		if ((currentTime - _detail.getCreation_time()) < 60*1000L) {
			return;
		}
		
		String exitKey =  _student.getSchool_id()+_student.getClass_name()+"^"+_student.getSection_name();
		exitKey = exitKey +"^"+"BUS"+"^"+_route.getType()+"^"+"EXIT"+today;
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
			_present.setPresent_type("BUS");
			_present.setSub_present_type(_route.getType());
			_present.setPresent_type("EXIT");
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
			_detail.setPresent_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
		} else {
			_detail = new present_detail(exitKeyDetail);
			_detail.setCreation_time(new Date().getTime());
			Present_detailHelper.getInstance().update(_detail);
		}		
	}
	
	public void updateInSchoolAttendance(String cardId) throws ApplicationException {
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
			_present.setPresent_type("ENTRY");
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
		    _detail.setPresent_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
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
			_present.setPresent_type("EXIT");
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
			_detail.setPresent_type("EXIT");
			_detail.setDate_str(today);
			_detail.setStudent_id(_student.getId());
			_detail.setDate(TimeUtil.getTimeFromDateString(null, today));
			Present_detailHelper.getInstance().add(_detail);
		} else {
			_detail = new present_detail(exitKeyDetail);
			_detail.setCreation_time(new Date().getTime());
			Present_detailHelper.getInstance().update(_detail);
		}		
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
