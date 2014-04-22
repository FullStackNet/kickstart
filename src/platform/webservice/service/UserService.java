package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class UserService extends BaseService{
	public UserService() {
		super(UserHelper.getInstance(),new customer());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().add(resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		} 
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}

	private enum QueryTypes {
		QUERY_ALERT,
		QUERY_NOTIFICATION,
		QUERY_USER_SERVICE
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
