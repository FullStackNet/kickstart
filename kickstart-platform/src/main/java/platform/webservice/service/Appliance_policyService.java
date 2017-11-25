package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_policyHelper;
import platform.helper.Appliance_policy_detailHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_policy;
import platform.resource.appliance_policy_detail;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_policyService extends BaseService{
	public Appliance_policyService() {
		super(Appliance_policyHelper.getInstance(),new appliance_policy());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_policy _resource = (appliance_policy)resource;
		_resource.setCustomer_id(ctx.getCustomerId());
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
