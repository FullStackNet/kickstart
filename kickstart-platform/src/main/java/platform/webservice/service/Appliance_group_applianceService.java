package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_groupHelper;
import platform.helper.Appliance_group_applianceHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_group;
import platform.resource.appliance_group_appliance;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_group_applianceService extends BaseService{
	public Appliance_group_applianceService() {
		super(Appliance_group_applianceHelper.getInstance(),new appliance_group_appliance());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_group_appliance _resource = (appliance_group_appliance)resource;
		getHelper().add(_resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		} 
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
