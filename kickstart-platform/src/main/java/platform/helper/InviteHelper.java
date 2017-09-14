package platform.helper;

import java.util.HashMap;
import java.util.Map;

import platform.datasync.DataSyncManager;
import platform.datasync.DataSyncMessage;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_relation;
import platform.resource.invite;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Json;
import platform.util.Util;
import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.helper.School_user_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.helper.TeacherHelper;
import application.c4t.vehicle.school.helper.Teacher_mapHelper;
import application.c4t.vehicle.school.resource.school;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.teacher;


public class InviteHelper extends BaseHelper {

	public InviteHelper() {
		super(new invite());
		// TODO Auto-generated constructor stub
	}
	private static InviteHelper instance;

	public static InviteHelper getInstance() {
		if (instance == null)
			instance = new InviteHelper();
		return instance;
	}

	public invite getByEmailId(String emailId) {
		Expression e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}

	public invite validateActivtion(String mobileoremail,String key) {
		Expression e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileoremail);
		Expression e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, mobileoremail);
		Expression e3 = new Expression(e1, LOG_OP.OR, e2);
		Expression e4 = new Expression(invite.FIELD_KEY, REL_OP.EQ, key);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}

	public invite getInvite(String mobileno,String emailId,String referenceId) {
		if (Util.isEmpty(mobileno )) {
			mobileno = "dummy";
		}
		if (Util.isEmpty(emailId)) {
			emailId = "dummy";
		}
		Expression e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		Expression e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		Expression e3 = new Expression(e1, LOG_OP.OR, e2);
		Expression e4 = new Expression(invite.FIELD_REFERENCE_ID, REL_OP.EQ, referenceId);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
			
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}

	public invite getByReferenceId(String referenceId) {
		Expression e = new Expression(invite.FIELD_REFERENCE_ID, REL_OP.EQ, referenceId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}
	
	public void updateStatus(String inviteId,String status) {
		if (inviteId == null) return;
		if (status == null) return;

		invite _invite = new invite(inviteId);
		_invite.setInvite_status(status);
		try {
			update(_invite);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public invite verifyKey(String inviteId,String key) throws ApplicationException {
		if (key == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid key");

		invite _invite = (invite)getById(inviteId);

		if (_invite != null) {
			if (key.equals(_invite.getKey())) {
				if (_invite.getInvite_statusEx().equals(invite.INVITE_STATUS_JOINED)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "Already Joined");
				}
				return _invite;
			}
		} else {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Invitation");
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid key");
	}

	public invite getByMobileId(String mobileno) {
		Expression e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}
	
	public void parentInviteAccepted(invite _invite, String userId ) throws ApplicationException {
		//Student_mapHelper.getInstance().addUser(_fetched_resource.getReference_id(), _user.getId());
		//User_mapHelper.getInstance().addApplianr(userId, applianceId);
		student _student = (student)StudentHelper.getInstance().getById(_invite.getReference_id());
		if (_student != null) {
			Student_mapHelper.getInstance().addUser(_student.getId(), userId);
			School_user_mapHelper.getInstance().addStudent(userId,_student.getId());
		}
	}
	
	public void teacherInviteAccepted(invite _invite, String userId ) throws ApplicationException {
		teacher _teacher = (teacher)TeacherHelper.getInstance().getById(_invite.getReference_id());
		if (_teacher != null) {
			Teacher_mapHelper.getInstance().addUser(_teacher.getId(), userId);
			School_user_mapHelper.getInstance().addTeacher(userId,_teacher.getId());
		}
	}
	BaseResource[] getOtherInvites(invite invite) {
		invite _invite = (invite)getById(invite.getId());
		Map<String, BaseResource> inviteMap = new HashMap<String, BaseResource>();
		if (_invite == null)
			return null;
		if (!Util.isEmpty(_invite.getMobile_no())) {
			Expression e = new Expression(invite.FIELD_MOBILE_NO, REL_OP.EQ, _invite.getMobile_no()); 
			BaseResource[] invites = InviteHelper.getInstance().getByExpression(e);
			if (!Util.isEmpty(invites)) {
				for(BaseResource resource : invites) {
					if (_invite.getId().equals(resource.getId()))
						continue;
					inviteMap.put(resource.getId(), resource);
				}
			}
		}
		if (!Util.isEmpty(_invite.getEmail_id())) {
			Expression e = new Expression(invite.FIELD_EMAIL_ID, REL_OP.EQ, _invite.getEmail_id()); 
			BaseResource[] invites = InviteHelper.getInstance().getByExpression(e);
			if (!Util.isEmpty(invites)) {
				for(BaseResource resource : invites) {
					if (_invite.getId().equals(resource.getId()))
						continue;
					inviteMap.put(resource.getId(), resource);
				}
			}
		}
		if (inviteMap.size() == 0)
			return null;
		BaseResource[] inviteArray = new invite[inviteMap.size()];
		int i = 0;
		for(BaseResource resource : inviteMap.values()) {
			inviteArray[i] = resource;
			i++;
		}
		return inviteArray;
	}
	
	public void acceptOtherInvites(invite _invite) throws ApplicationException {
		BaseResource[] invites = getOtherInvites(_invite);
		if (Util.isEmpty(invites)) 
			return;
		System.out.println(_invite.getMobile_no()+" has " + invites.length + " more invite to accept");
		for(int i=0; i < invites.length ; i++) {
			acceptInvite((invite)invites[i]);
		}		
	}
	
	public void acceptInvite(invite _invite) throws ApplicationException {
		c4t_object _community = null;
		invite _fetched_resource = (invite)getById(_invite.getId());
		user _user = UserHelper.getInstance().getByMobileOrEmailId(_fetched_resource.getMobile_no(), _fetched_resource.getEmail_id());
		if (_user == null) {
			_user = new user();
			_user.setType(user.USER_TYPE_USER);
		}
		if (_user.getMobile_no() == null)
			_user.setMobile_no(_fetched_resource.getMobile_no());
		if (_user.getEmail_id() == null)
			_user.setEmail_id(_fetched_resource.getEmail_id());
		if (_user.getName() == null)
			_user.setName(_fetched_resource.getName());
		if (_invite.getPassword() != null)
			_user.setPassword(Util.doubleMD5(_invite.getPasswordEx()));
		if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_fetched_resource.getInvite_type())) {
			// check the user if exists
			_user.setSchoolTrackerService("Y");
			if ("STUDENT".equals(_fetched_resource.getRelation())) {
				_user.setStudentService("Y");
			} else
				_user.setParentService("Y");
			InviteHelper.getInstance().parentInviteAccepted(_fetched_resource, _user.getId());
			if ("STUDENT".equals(_fetched_resource.getRelation())) {
				c4t_object _member = new c4t_object(_fetched_resource.getReference_id());
				_member.setUser_id(_user.getId());
				C4t_objectHelper.getInstance().AddOrUpdate(_member);
			}
		}
		if (invite.INVITE_TYPE_JOIN_COMMUNITY.equals(_fetched_resource.getInvite_type())) {
			 	 _community = C4t_objectHelper.getInstance().getById(_fetched_resource.getCommunity_id());
				 c4t_object _object = new c4t_object(_user.getId()+"^"+_fetched_resource.getRelation()+"^"+_fetched_resource.getCommunity_id());
				 _object.setObject_type("COMMUNITY_USER");
				 _object.setUser_id(_user.getId());
				 _object.setUser_name(_user.getName());
				 _object.setParent_id(_fetched_resource.getCommunity_id());
				 _object.setCommunity_id(_fetched_resource.getCommunity_id());
				 _object.setName(_community.getName());
				 _object.setType(_fetched_resource.getRelation());
				 _object.setCommunity_type(_community.getType());
				 _object.setSub_type(_community.getSub_type());
				 _object.setReference_id(_fetched_resource.getReference_id());
				 _object.setCompany_name(_fetched_resource.getCompany_name());
				 _object.setCompany_id(_fetched_resource.getCompany_id());
				 _object.setMobile_no(_fetched_resource.getMobile_no());
				 _object.setEmail_id(_fetched_resource.getEmail_id());
				 C4t_objectHelper.getInstance().AddOrUpdate(_object);
				 String key = _user.getId()+"^"+_community.getId();
				 C4t_relationHelper.getInstance().addRelationMap(key, _fetched_resource.getReference_id(), _fetched_resource.getRelation());
				 if (Util.isDataSyncNeed(_community)) {
					 DataSyncManager.getInstance().send(new DataSyncMessage(_community.getServer_url(), C4t_objectHelper.getInstance(),_object.getId()));
					 DataSyncManager.getInstance().send(new DataSyncMessage(_community.getServer_url(), C4t_relationHelper.getInstance(),c4t_relation.getMapId(key,_fetched_resource.getRelation())));					 
					 DataSyncManager.getInstance().send(new DataSyncMessage(_community.getServer_url(), C4t_relationHelper.getInstance(),c4t_relation.getMapId(_fetched_resource.getReference_id(),_fetched_resource.getRelation())));					 
				 } else {
					 C4t_objectHelper.getInstance().updateUserId(_fetched_resource.getReference_id(),_user.getId());
				 }
		}
		if (invite.INVITE_TYPE_JOIN_TEACHER.equals(_fetched_resource.getInvite_type())) {
			// check the user if exists
			_user.setSchoolTrackerService("Y");
			_user.setTeacherService("Y");
			teacherInviteAccepted(_fetched_resource, _user.getId());
		}
		UserHelper.getInstance().AddOrUpdate(_user);
		updateStatus(_invite.getId(), invite.INVITE_STATUS_JOINED);
		if (invite.INVITE_TYPE_JOIN_COMMUNITY.equals(_fetched_resource.getInvite_type())) {
			if (Util.isDataSyncNeed(_community)) {
				 DataSyncManager.getInstance().send(new DataSyncMessage(_community.getServer_url(), InviteHelper.getInstance(), _invite.getId()));
				 DataSyncManager.getInstance().send(new DataSyncMessage(_community.getServer_url(), UserHelper.getInstance(), _user.getId()));
			}
		}
	}
	
	public void sendParentInvite(invite _invite) throws ApplicationException {
		InviteHelper.getInstance().updateStatus(_invite.getId(), invite.INVITE_STATUS_SENT);
		String studentId = _invite.getReference_id();
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Stdeunt Reference");
		
		school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
		if (_school == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid School Reference");
		
		if (_invite.getEmail_id() != null) {
			if (school.SCHOOL_TYPE_COMPTATIVE_EXAM_COACHING.equals(_school.getType())) {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_STUDENT_COACHING_INSTITUTE);
				resendMail.setTo(_invite.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_STUDENT_COACHING_INSTITUTE);
				Map<String, String> map = new HashMap<String, String>();
				map.put("NAME", _invite.getName());
				map.put("STUDENT_NAME", _invite.getReference_name());
				map.put("ACTIVATION_TOKEN", _invite.getKey());
				map.put("SCHOOL_NAME", _school.getBrand_name());
				map.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
				map.put("CUSTOMER_ID",_invite.getCustomer_id());
				map.put("BRAND_NAME",_school.getBrand_name());
				
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
				
			} else {
				SendEmail resendMail = new SendEmail();
				resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_PARENT);
				resendMail.setTo(_invite.getEmail_id());
				resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_PARENT);
				Map<String, String> map = new HashMap<String, String>();
				map.put("NAME", _invite.getName());
				map.put("STUDENT_NAME", _invite.getReference_name());
				map.put("ACTIVATION_TOKEN", _invite.getKey());
				map.put("SCHOOL_NAME", _school.getBrand_name());
				map.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
				map.put("CUSTOMER_ID",_invite.getCustomer_id());
				map.put("BRAND_NAME",_school.getBrand_name());
				
				String params = Json.maptoString(map);
				resendMail.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
						resendMail);
				}
		}
		if (_invite.getMobile_no() != null) {
			if (school.SCHOOL_TYPE_COMPTATIVE_EXAM_COACHING.equals(_school.getType())) {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_invite.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_STUDENT_COACHING_INSTITUTE);
				Map<String, String> smsMap = new HashMap<String, String>();
				smsMap.put("STUDENT_NAME", _invite.getReference_name());
				smsMap.put("ACTIVATION_TOKEN", _invite.getKey());
				smsMap.put("SCHOOL_NAME", _school.getBrand_name());
				smsMap.put("BRAND_NAME", _school.getBrand_name());
				smsMap.put("CUSTOMER_ID",_invite.getCustomer_id());
				smsMap.put("APP_DOWNALOD_URL",_school.getApp_download_link());
				String params = Json.maptoString(smsMap);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			} else {
				SendSMS smsMessage = new SendSMS();
				smsMessage.setMobile_no(_invite.getMobile_no());
				smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_PARENT);
				Map<String, String> smsMap = new HashMap<String, String>();
				smsMap.put("STUDENT_NAME", _invite.getReference_name());
				smsMap.put("ACTIVATION_TOKEN", _invite.getKey());
				smsMap.put("SCHOOL_NAME", _school.getBrand_name());
				smsMap.put("BRAND_NAME", _school.getBrand_name());
				smsMap.put("CUSTOMER_ID",_invite.getCustomer_id());
				String params = Json.maptoString(smsMap);
				smsMessage.setParams(params);
				ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
						smsMessage);
			}
		}
	}
}
