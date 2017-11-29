package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_groupHelper;
import platform.helper.Appliance_mf_profileHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_group;
import platform.resource.appliance_mf_profile;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_groupService extends BaseService{
	public Appliance_groupService() {
		super(Appliance_groupHelper.getInstance(),new appliance_group());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_group _resource = (appliance_group)resource;
		if (Util.isEmpty(_resource.getCustomer_id())) {
			_resource.setCustomer_id(ctx.getCustomerId());
		}
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
