package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_policyHelper;
import platform.helper.Appliance_policy_detailHelper;
import platform.helper.Billing_planHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_policy_detail;
import platform.resource.billing_plan;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_policy_detailService extends BaseService{
	public Appliance_policy_detailService() {
		super(Appliance_policy_detailHelper.getInstance(),new appliance_policy_detail());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_policy_detail _resource = (appliance_policy_detail)resource;
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
