package platform.webservice.service;

import java.util.HashMap;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.CustomerHelper;
import platform.helper.InviteHelper;
import platform.helper.UserHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.invite;
import platform.resource.user;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Json;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;
import application.c4t.vehicle.school.helper.School_user_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class InviteService extends BaseService{
	public InviteService() {
		super(InviteHelper.getInstance(),new invite());
	}

	public void sendParentInvite(invite _invite) {
		String school_name = "";
		customer _customer = (customer)CustomerHelper.getInstance().getById(_invite.getCustomer_id());
		if (_customer != null) {
			school_name = _customer.getName();
		}

		if (_invite.getMobile_no() != null) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_PARENT);
			resendMail.setTo(_invite.getEmail_id());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_PARENT);
			Map<String, String> map = new HashMap<String, String>();
			map.put("NAME", _invite.getName());
			map.put("STUDENT_NAME", _invite.getReference_name());
			map.put("ACTIVATION_TOKEN", _invite.getKey());
			map.put("SCHOOL_NAME", school_name);
			map.put("ACTIVATE_URL", "http://my.cloud4things.com/ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
		}
		if (_invite.getMobile_no() != null) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(_invite.getMobile_no());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_PARENT);
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("STUDENT_NAME", _invite.getReference_name());
			smsMap.put("ACTIVATION_TOKEN", _invite.getKey());
			smsMap.put("SCHOOL_NAME", school_name);
			String params = Json.maptoString(smsMap);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
		}
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CONFIRM)) {
			invite _resource = (invite) resource;
			if (_resource.getPassword() == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Empty Password not allowed");
			}

			if (!_resource.getPasswordEx().equals(_resource.getConfirm_password())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Password and confirm password not matching");
			}
			invite _fetched_resource = (invite)getHelper().getById(_resource.getId());
			if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_fetched_resource.getInvite_type())) {
				// check the user if exists
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
				_user.setPassword(Util.doubleMD5(_resource.getPasswordEx()));
				UserHelper.getInstance().AddOrUpdate(_user);
				//Student_mapHelper.getInstance().addUser(_fetched_resource.getReference_id(), _user.getId());
				//User_mapHelper.getInstance().addApplianr(userId, applianceId);
				student _student = (student)StudentHelper.getInstance().getById(_fetched_resource.getReference_id());
				if (_student != null) {
					Student_mapHelper.getInstance().addUser(_student.getId(), _user.getId());
					School_user_mapHelper.getInstance().addStudent(_user.getId(),_student.getId());
				}
			}
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_RESEND_INVITE)) {
			invite _invite = (invite)InviteHelper.getInstance().getById(resource.getId());
			if (_invite == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Request");
			if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_invite.getInvite_type())) {
				if (_invite.getEmail_id() != null) {
					sendParentInvite(_invite);
				}
			}
		} else  
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Action");
	}


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
