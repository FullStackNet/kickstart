package platform.webservice.service;

import java.util.HashMap;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.InviteHelper;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
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

public class UserService extends BaseService{
	public UserService() {
		super(UserHelper.getInstance(),new user());
	}
	
	public void sendInvite(invite _invite,user _resource) {
		if ((_invite.getEmail_id() != null) && user.USER_TYPE_CUSTOMER_ADMIN.equals(_resource.getType())) {
			SendEmail email =  new SendEmail();
			email.setSubject(ApplicationConstants.MAIL_SUBJECT_INVITE_CUSTOMER_ADMIN);
			email.setTo(_invite.getEmail_id());
			email.setType(ApplicationConstants.MAIL_TYPE_INVITE_CUSTOMER_ADMIN);
			Map<String, String> map = new HashMap<String, String>();
			map.put("NAME", _invite.getName());
			map.put("ACTIVATION_TOKEN", _invite.getKey());
			map.put("CUSTOMER_NAME", "C4T Admin");
			map.put("ACTIVATE_URL", "/ui/confirm_invite?action=CONFIRM&id="+_invite.getId()+"&key="+_invite.getKey());
			String params = Json.maptoString(map);
			email.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, email);
		}
	}
	
	public void invite(ServletContext ctx, user _resource) throws ApplicationException{
		if (!Util.isEmpty(_resource.getEmail_id())) {
			invite _invite = (invite) InviteHelper.getInstance().getByEmailId(_resource.getEmail_id());
			if (_invite == null) {
				_invite = new invite();
				if (user.USER_TYPE_CUSTOMER_ADMIN.equalsIgnoreCase( _resource.getType())) {
					_invite.setInvite_type(invite.INVITE_TYPE_JOIN_CUSTOMER_ADMIN);
				} else if (user.USER_TYPE_C4T_ADMIN.equalsIgnoreCase(_resource.getType())) {
					_invite.setInvite_type(invite.INVITE_TYPE_JOIN_C4T_ADMIN);
				} else if (user.USER_TYPE_USER.equalsIgnoreCase(_resource.getType())) {
					_invite.setInvite_type(invite.INVITE_TYPE_JOIN_USER);
				}
				_invite.setName(_resource.getName());
				_invite.setReference_name(_resource.getName());
				_invite.setEmail_id(_resource.getEmail_id());
				_invite.setType(_resource.getType());
				_invite.setKey(Util.getRandonToken());
				_invite.setDgService(_resource.getDgService());
				_invite.setFleetService(_resource.getFleetService());
				_invite.setGameService(_resource.getGameService());
				_invite.setSchoolTrackerService(_resource.getSchoolTrackerService());
				_invite.setCommunityService(_resource.getCommunityService());
						
				InviteHelper.getInstance().add(_invite);
				sendInvite(_invite,_resource);
			}
		}
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		user _resource = (user) resource;
		if (_resource.getCustomer_id() == null) {
			_resource.setCustomer_id(ctx.getCustomerId());
		}
		getHelper().add(resource);
		invite(ctx, _resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
			return;
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_FORGOT_PASSSWORD_TOKEN_CONFIRM)) {
			user _resource = (user) resource;
			user _user = (user)UserHelper.getInstance().getById(_resource.getId());
			if (_user == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_USER);
			}
			if (!_user.getKeyEx().equals(_resource.getKey())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Token");
			}
			return;
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_FORGOT_PASSWORD)) {
		
			user _resource = (user) resource;
			user _user = UserHelper.getInstance().getByEmailId(_resource.getEmail_id());
			if (_user == null) {
				_user = UserHelper.getInstance().getByMobileId(_resource.getEmail_id());
			}
			if (_user == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_USER);
			}
			user _update_user = new user();
			_update_user.setId(_user.getId());
			_update_user.setKey(Util.getRandonToken());
			UserHelper.getInstance().update(_update_user);
			_user.setKey(_update_user.getKey());
			notifyForgotPassword(_user);
			resource.setId(_user.getId());
			return;
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CHANGE_PASSWORD)) {
			String userId = ctx.getUserId();
			user _resource = (user)resource;
			user _user = (user)UserHelper.getInstance().getById(userId);
			if (_user == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_USER);
			}
			user _update_user = new user();
			_update_user.setId(_user.getId());
			_update_user.setPassword(_resource.getPassword());
			UserHelper.getInstance().update(_update_user);
			return;
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_RESET_PASSWORD)) {
			user _resource = (user) resource;
			user fetched = (user)UserHelper.getInstance().getById(_resource.getId());
			if (fetched == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_USER);
			
			user update_resource= new user();
			update_resource.setId(_resource.getId());
			update_resource.setPassword(_resource.getPassword());
			UserHelper.getInstance().update(update_resource);
			return;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_ACTION);
	}
	
	void notifyForgotPassword(user _user) {
		if (!Util.isEmpty(_user.getMobile_no())) {
			SendSMS sms = new SendSMS();
			sms.setMobile_no(_user.getMobile_no());
			sms.setType(ApplicationConstants.SMS_TYPE_FORGOT_PASSWORD);
			Map<String, String> smsMap = new HashMap<String, String>();
			smsMap.put("TOKEN", _user.getKey());
			String params = Json.maptoString(smsMap);
			sms.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_SMS_MANAGER, 
					sms);
		}
		if (!Util.isEmpty(_user.getEmail_id())) {
			SendEmail mail = new SendEmail();
			mail.setSubject(ApplicationConstants.MAIL_SUBJECT_FORGOT_PASSWORD);
			mail.setTo(_user.getEmail_id());
			mail.setType(ApplicationConstants.MAIL_TYPE_FORGOT_PASSWORD);
			Map<String, String> map = new HashMap<String, String>();
			map.put("TOKEN", _user.getKey());
			map.put("URL", "/ui/confirm_forgot_password?id="+_user.getId()+"&key="+_user.getKey());
			String params = Json.maptoString(map);
			mail.setParams(params);
			ApplicationManager.getInstance().sendMessage(ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER, 
					mail);
		}
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}

	private enum QueryTypes {
		QUERY_ALERT,
		QUERY_NOTIFICATION,
		QUERY_USER_SERVICE,
		QUERY_USER_ID_BY_EMAIL_OR_MOBILE
	};
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_ALERT.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			User_mapHelper.getInstance().resetRecentAlerts(userId);
			return User_mapHelper.getInstance().getAlertArray(userId);
		} else if(QueryTypes.QUERY_NOTIFICATION.toString().equals(queryId)) {
			
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			User_mapHelper.getInstance().resetRecentNotification(userId);
			return User_mapHelper.getInstance().getNotificationArray(userId);
		}  else if(QueryTypes.QUERY_USER_ID_BY_EMAIL_OR_MOBILE.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String id = (String)map.get("id");
			user _fetchedUser = (user)UserHelper.getInstance().getByEmailId(id);
			if (_fetchedUser == null) {
				_fetchedUser = (user)UserHelper.getInstance().getByMobileId(id);
			}
			if (_fetchedUser == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid user");
			}
			
			 user _user = new user(_fetchedUser.getId());
			return new user[]{_user};
		} else if(QueryTypes.QUERY_USER_SERVICE.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			user _user = (user)UserHelper.getInstance().getById(userId);
			if (_user == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid user");
			}
			return new user[]{_user};
		} 
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
