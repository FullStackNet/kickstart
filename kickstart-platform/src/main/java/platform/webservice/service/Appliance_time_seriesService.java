package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_threshold_templeteHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_threshold_templete;
import platform.resource.appliance_time_series;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class Appliance_time_seriesService extends BaseService{
	public Appliance_time_seriesService() {
		super(Appliance_threshold_templeteHelper.getInstance(),new appliance_threshold_templete());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_threshold_templete _resource = (appliance_threshold_templete)resource;
		getHelper().add(_resource);
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_threshold_templete _resource = (appliance_threshold_templete)resource;
		getHelper().update(_resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		}
	}
	private enum QueryTypes {
		
	};
	

	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
