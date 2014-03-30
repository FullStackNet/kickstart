package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.AlertHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;


public class AlertService extends BaseService{
	public AlertService() {
		super(AlertHelper.getInstance(),new alert());
	}

	
	private enum QueryTypes {

		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_USER_ALERT {
			public String toString() {
				return "QUERY_USER_ALERT"; 
			}
		}
	};

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_USER_ALERT.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			return User_mapHelper.getInstance().getAlertArray(userId);
		} 
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
