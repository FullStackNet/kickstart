package platform.webservice.service;

import java.util.Date;
import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_time_seriesHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_time_series;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.TimeUtil;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class Appliance_time_seriesService extends BaseService{
	public Appliance_time_seriesService() {
		super(new appliance_time_series());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	private enum QueryTypes {
		
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_TIME_SERIES_DATA_FOR_COUNTER
	};
	
	public BaseResource get(ServletContext ctx, String uid) {
		String userId = ctx.getUserId();
		return User_mapHelper.getInstance().getApplianace(userId, uid);
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_TIME_SERIES_DATA_FOR_COUNTER.toString().equals(queryId)) {
			
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
		
			String counter = (String)map.get("counter");
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
			return Appliance_time_seriesHelper.getInstance().getArray(applianceId, counter, fromDatestring, toDatestring);
		}
		
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
