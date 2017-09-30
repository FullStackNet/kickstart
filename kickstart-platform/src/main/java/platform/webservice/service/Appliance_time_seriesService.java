package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_threshold_templeteHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_time_series;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class Appliance_time_seriesService extends BaseService{
	public Appliance_time_seriesService() {
		super(Appliance_threshold_templeteHelper.getInstance(),new appliance_time_series());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().add(resource);
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}
	
	private enum QueryTypes {
		
	};
	

	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
