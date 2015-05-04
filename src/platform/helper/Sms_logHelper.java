package platform.helper;

import java.util.Date;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.sms_log;
import platform.util.ApplicationException;



public class Sms_logHelper extends BaseHelper {
	public Sms_logHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static Sms_logHelper instance;

	public static Sms_logHelper getInstance() {
		if (instance == null)
			instance = new Sms_logHelper();
		return instance;
	}

	
	Sms_logHelper() {
		super(new sms_log());
		// TODO Auto-generated constructor stub
	}
	
	public sms_log logSchoolActivity(String schoolId,
			String schoolName,
			String studentId,
			String studentName,
			String className,
			String sectionName,
			String mobileNumber,
			String reason,
			String currentDate,
			long activityCreationTime,
			String activityTitle,
			String activityId)  {
		sms_log _log = new sms_log();
		_log.setSchool_id(schoolId);
		_log.setMobile_no(mobileNumber);
		_log.setInvocation_time(new Date().getTime());
		_log.setEvent_creation_time(activityCreationTime);
		_log.setStudent_id(studentId);
		_log.setStudent_name(studentName);
		_log.setClass_name(className);
		_log.setDate(currentDate);
		_log.setSection_name(sectionName);
		_log.setSchool_name(schoolName);
		_log.setReason(reason);
		_log.setReference_description(activityTitle);
		_log.setReference_id(activityId);	
		//_log.setPerson_name("");
		_log.setSent_status("N");
		_log.setProcessing_status("N");
		String parent_id = Sms_daily_analysisHelper.getInstance().createAnalysis(_log);
		_log.setParent_id(parent_id);
		try {
			Sms_logHelper.getInstance().add(_log);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return _log;
	}
	
	public sms_log logCommunityActivity(String communityId,
			String communityName,
			String userId,
			String memberName,
			String mobileNumber,
			String reason,
			String currentDate,
			long activityCreationTime,
			String activityTitle,
			String activityId,
			String customerId)  {
		sms_log _log = new sms_log();
		_log.setCommunity_id(communityId);
		_log.setMobile_no(mobileNumber);
		_log.setInvocation_time(new Date().getTime());
		_log.setEvent_creation_time(activityCreationTime);
		_log.setUser_id(userId);
		_log.setMember_name(memberName);
		_log.setDate(currentDate);
		_log.setCommunity_name(communityName);
		_log.setReason(reason);
		_log.setReference_description(activityTitle);
		_log.setReference_id(activityId);
		_log.setCustomer_id(customerId);
		//_log.setPerson_name("");
		_log.setSent_status("N");
		_log.setProcessing_status("N");
		String parent_id = Sms_daily_analysisHelper.getInstance().createAnalysis(_log);
		_log.setParent_id(parent_id);
		try {
			Sms_logHelper.getInstance().add(_log);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return _log;
	}
	
	public sms_log logSchoolActivity(String schoolId,
			String schoolName,
			String studentId,
			String studentName,
			String className,
			String sectionName,
			String mobileNumber,
			String reason,
			String currentDate)  {
		sms_log _log = new sms_log();
		_log.setSchool_id(schoolId);
		_log.setMobile_no(mobileNumber);
		_log.setInvocation_time(new Date().getTime());
		_log.setStudent_id(studentId);
		_log.setStudent_name(studentName);
		_log.setClass_name(className);
		_log.setDate(currentDate);
		_log.setSection_name(sectionName);
		_log.setSchool_name(schoolName);
		_log.setReason(reason);
		//_log.setPerson_name("");
		_log.setSent_status("N");
		_log.setProcessing_status("N");
		String parent_id = Sms_daily_analysisHelper.getInstance().createAnalysis(_log);
		_log.setParent_id(parent_id);
		try {
			Sms_logHelper.getInstance().add(_log);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return _log;
	}
	
	public void updateTryTime(String id)  {
		sms_log _log = new sms_log(id);
		_log.setSent_try_time(new Date().getTime());
		try {
			update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseResource[] getDetail(String parentId) {
		Expression e = new Expression(sms_log.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public void updateSent(String id)  {
		sms_log _log = new sms_log(id);
		_log.setSent_status("S");
		_log.setSent_time(new Date().getTime());
		try {
			update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateSentFail(String id)  {
		sms_log _log = new sms_log(id);
		_log.setSent_status("F");
		_log.setSent_time(new Date().getTime());;
		
		try {
			update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
