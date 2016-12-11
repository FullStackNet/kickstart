package platform.webservice.service;

import java.util.HashMap;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.C4t_objectHelper;
import platform.helper.CustomerHelper;
import platform.helper.InviteHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
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
			map.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			map.put("CUSTOMER_ID",_invite.getCustomer_id());
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
			smsMap.put("CUSTOMER_ID",_invite.getCustomer_id());
			String params = Json.maptoString(smsMap);
			smsMessage.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					smsMessage);
		}
	}
	
	public void sendCommunityInvite(invite _invite) {
		String community_name = "";
		c4t_object _community = (c4t_object)C4t_objectHelper.getInstance().getById(_invite.getCommunity_id());
		if (_community != null) {
			community_name = _community.getShort_name();
			if (community_name == null)
				community_name = _community.getName();
		}

		if (_invite.getEmail_id() != null) {
			SendEmail resendMail = new SendEmail();
			resendMail.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_COMMUNITY_ACTIVATE_ACCOUNT);
			resendMail.setTo(_invite.getEmail_id());
			if (_community.getType().equals("BUSINESS")) {
				resendMail.setType(ApplicationConstants.MAIL_TYPE_COMMUNITY_INVITE_BUSINESS);
			} else 	if (_community.getType().equals("SOCIAL")) {
				resendMail.setType(ApplicationConstants.MAIL_TYPE_COMMUNITY_INVITE_SOCIAL);
			} else 	if (_community.getType().equals("SPIRITUAL")) {
				resendMail.setType(ApplicationConstants.MAIL_TYPE_COMMUNITY_INVITE_SPIRITUAL);
			} else {
				resendMail.setType(ApplicationConstants.MAIL_TYPE_COMMUNITY_INVITE);
			}
			Map<String, String> map = new HashMap<String, String>();
			map.put("NAME", _invite.getName());
			map.put("ACTIVATION_TOKEN", _invite.getKey());
			map.put("COMMUNITY_NAME", community_name);
			map.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			map.put("CUSTOMER_ID",_invite.getCustomer_id());
			String params = Json.maptoString(map);
			resendMail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					resendMail);
		}
		if (_invite.getMobile_no() != null) {
			SendSMS smsMessage = new SendSMS();
			smsMessage.setMobile_no(_invite.getMobile_no());
			if (_community.getType().equals("BUSINESS")) {
				smsMessage.setType(ApplicationConstants.SMS_TYPE_COMMUNITY_INVITE_BUSINESS);
			} else 	if (_community.getType().equals("SOCIAL")) {
				smsMessage.setType(ApplicationConstants.SMS_TYPE_COMMUNITY_INVITE_SOCIAL);
			} else 	if (_community.getType().equals("SPIRITUAL")) {
				smsMessage.setType(ApplicationConstants.SMS_TYPE_COMMUNITY_INVITE_SPIRITUAL);
			} else {
				smsMessage.setType(ApplicationConstants.SMS_TYPE_COMMUNITY_INVITE);
			}
			
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("NAME", _invite.getName());
			smsMap.put("ACTIVATION_TOKEN", _invite.getKey());
			smsMap.put("COMMUNITY_NAME", community_name);
			smsMap.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			smsMap.put("CUSTOMER_ID",_invite.getCustomer_id());
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
			map.put("ACTIVATE_URL", "ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			map.put("CUSTOMER_ID",_invite.getCustomer_id());
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
			smsMap.put("CUSTOMER_ID",_invite.getCustomer_id());
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
			InviteHelper.getInstance().acceptOtherInvites(_resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			invite _resource = (invite) resource;
			InviteHelper.getInstance().deleteById(_resource.getId());
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_ACTIVATE)) {
			invite _resource = (invite) resource;
			if ((_resource.getKey() == null) || (_resource.getKey().isEmpty())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Empty token not allowed");
			}
			invite _invite = InviteHelper.getInstance().validateActivtion(_resource.getEmail_id(),_resource.getKey());
			if (_invite == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid activation request");
			}
			resource.setId(_invite.getId());
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CONFIRM_AFTER_LOGIN)) {
			invite _resource = (invite) resource;
			InviteHelper.getInstance().acceptInvite(_resource);
			InviteHelper.getInstance().acceptOtherInvites(_resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_RESEND_INVITE)) {
			invite _invite = (invite)InviteHelper.getInstance().getById(resource.getId());
			sendInvite(_invite);
		} else  
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Action");
	}
	
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_INVITE_LIST ,
		INVITE,
	};

	public void sendInvite(invite _invite) throws ApplicationException {
		if (_invite == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Request");
		if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_invite.getInvite_type())) {
			if (_invite.getEmail_id() != null) {
				InviteHelper.getInstance().sendParentInvite(_invite);
			}
		}else if (invite.INVITE_TYPE_JOIN_TEACHER.equals(_invite.getInvite_type())) {
			if (_invite.getEmail_id() != null) {
				sendTeacherInvite(_invite);
			}
		}else if (invite.INVITE_TYPE_JOIN_CUSTOMER_ADMIN.equals(_invite.getInvite_type())) {
			if (_invite.getEmail_id() != null) {
				sendCustomerAdminInvite(_invite);
			}
		} else if (invite.INVITE_TYPE_JOIN_COMMUNITY.equals(_invite.getInvite_type())) {
			sendCommunityInvite(_invite);
		}
	}
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_INVITE_LIST.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			return User_mapHelper.getInstance().getInviteArray(userId);
		} else if(QueryTypes.INVITE.toString().equals(queryId)) {
			String mobile_no = (String)map.get("m");
			invite _invite = InviteHelper.getInstance().getByMobileId(mobile_no);
			sendInvite(_invite);
			return null;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
