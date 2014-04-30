package platform.webservice.service;

import java.util.HashMap;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.SendEmail;
import platform.message.SendSMS;
import platform.resource.BaseResource;
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

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().add(resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
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
		if (_user.getMobile_no() != null) {
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
		if (_user.getEmail_id() != null) {
			SendEmail mail = new SendEmail();
			mail.setSubject(ApplicationConstants.MAIL_SUBJECT_FORGOT_PASSWORD);
			mail.setTo(_user.getEmail_id());
			mail.setType(ApplicationConstants.MAIL_TYPE_FORGOT_PASSWORD);
			Map<String, String> map = new HashMap<String, String>();
			map.put("TOKEN", _user.getKey());
			map.put("URL", "http://my.cloud4things.com/ui/confirm_forgot_password?id="+_user.getId()+"&key="+_user.getKey());
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
			return User_mapHelper.getInstance().getAlertArray(userId);
		} else if(QueryTypes.QUERY_NOTIFICATION.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
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
			user _fetchedUser = (user)UserHelper.getInstance().getById(userId);
			if (_fetchedUser == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid user");
			}
			
			user _user = new user(_fetchedUser.getId());
			_user.setDgService(_fetchedUser.getDgService());
			_user.setFleetService(_fetchedUser.getFleetService());
			_user.setSchoolTrackerService(_fetchedUser.getSchoolTrackerService());
			_user.setRouteSettingService(_fetchedUser.getRouteSettingService());
			return new user[]{_user};
		} 
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
