package platform.webservice.service;

import java.util.Date;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_running_logHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_running_log;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.TimeUtil;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class Appliance_running_logService extends BaseService{
	public Appliance_running_logService() {
		super(new appliance_running_log());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_DATA_FOR_DATE {
			public String toString() {
				return "QUERY_DATA_FOR_DATE"; 
			}
		}
	};
	
	public BaseResource get(ServletContext ctx, String uid) {
		String userId = ctx.getUserId();
		return User_mapHelper.getInstance().getApplianace(userId, uid);
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_DATA_FOR_DATE.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			// Check for access for appliance
			String applianceId = (String)map.get("applianceId");
			if (applianceId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Required argument Appliance Id missing.");
			}
			appliance _appliance = (appliance)User_mapHelper.getInstance().getApplianace(userId, applianceId);
			if (_appliance == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
	
			String applianceTimeZone = "IST";
			if (_appliance.getTimeZone() != null)
				applianceTimeZone = _appliance.getTimeZone();
			
			String fromDatestring = (String)map.get("from_date");
			String toDatestring =  (String) map.get("to_date");
			
			if (fromDatestring == null) {
				fromDatestring = TimeUtil.getDateString(applianceTimeZone, new Date().getTime());
			}
			
			if (toDatestring == null) {
				toDatestring = TimeUtil.getDateString(applianceTimeZone, new Date().getTime());
			}

			return Appliance_running_logHelper.getInstance().getTimeSeries(applianceId,
												fromDatestring,toDatestring);
		} 
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
