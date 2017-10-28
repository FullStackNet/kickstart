package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_mf_profileHelper;
import platform.helper.CustomerHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_mf_profile;
import platform.resource.customer;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_mf_profileService extends BaseService{
	public Appliance_mf_profileService() {
		super(Appliance_mf_profileHelper.getInstance(),new appliance_mf_profile());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_mf_profile _resource = (appliance_mf_profile)resource;
		if (Util.isEmpty(_resource.getCustomer_id())) {
			_resource.setCustomer_id(ctx.getCustomerId());
		}
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


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
