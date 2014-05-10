package platform.webservice.service;

import java.util.HashMap;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.CustomerHelper;
import platform.helper.InviteHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.invite;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Json;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

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

		if (_invite.getEmail_id() != null) {
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
	
	public void sendTeacherInvite(invite _invite) {
		String school_name = "";
		customer _customer = (customer)CustomerHelper.getInstance().getById(_invite.getCustomer_id());
		if (_customer != null) {
			school_name = _customer.getName();
		}

		if (_invite.getEmail_id() != null) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_TEACHER);
			resendMail.setTo(_invite.getEmail_id());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_TEACHER);
			Map<String, String> map = new HashMap<String, String>();
			map.put("NAME", _invite.getName());
			map.put("TEACHER_NAME", _invite.getReference_name());
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
			smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_TEACHER);
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("TEACHER_NAME", _invite.getReference_name());
			smsMap.put("ACTIVATION_TOKEN", _invite.getKey());
			smsMap.put("SCHOOL_NAME", school_name);
			String params = Json.maptoString(smsMap);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
		}
	}
	
	public void sendCustomerAdminInvite(invite _invite) {
		String school_name = "";
		customer _customer = (customer)CustomerHelper.getInstance().getById(_invite.getCustomer_id());
		if (_customer != null) {
			school_name = _customer.getName();
		}

		if (_invite.getEmail_id() != null) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_CUSTOMER_ADMIN);
			resendMail.setTo(_invite.getEmail_id());
			resendMail.setType(ApplicationConstants.MAIL_TYPE_INVITE_CUSTOMER_ADMIN);
			Map<String, String> map = new HashMap<String, String>();
			map.put("NAME", _invite.getName());
			map.put("ACTIVATION_TOKEN", _invite.getKey());
			map.put("ACTIVATE_URL", "http://my.cloud4things.com/ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
		}
		if (_invite.getMobile_no() != null) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(_invite.getMobile_no());
			smsMessage.setType(ApplicationConstants.SMS_TYPE_INVITE_TEACHER);
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("TEACHER_NAME", _invite.getReference_name());
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
			if ((_resource.getPassword() == null) || (_resource.getPassword().isEmpty())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Empty Password not allowed");
			}

			if (!_resource.getPasswordEx().equals(_resource.getConfirm_password())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Password and confirm password not matching");
			}
			InviteHelper.getInstance().acceptInvite(_resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CONFIRM_AFTER_LOGIN)) {
			invite _resource = (invite) resource;
			InviteHelper.getInstance().acceptInvite(_resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_RESEND_INVITE)) {
			invite _invite = (invite)InviteHelper.getInstance().getById(resource.getId());
			if (_invite == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Request");
			if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_invite.getInvite_type())) {
				if (_invite.getEmail_id() != null) {
					sendParentInvite(_invite);
				}
			}else if (invite.INVITE_TYPE_JOIN_TEACHER.equals(_invite.getInvite_type())) {
				if (_invite.getEmail_id() != null) {
					sendTeacherInvite(_invite);
				}
			}else if (invite.INVITE_TYPE_JOIN_CUSTOMER_ADMIN.equals(_invite.getInvite_type())) {
				if (_invite.getEmail_id() != null) {
					sendCustomerAdminInvite(_invite);
				}
			} 
		} else  
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Action");
	}
	
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_INVITE_LIST ,
	};

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_INVITE_LIST.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			return User_mapHelper.getInstance().getInviteArray(userId);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
