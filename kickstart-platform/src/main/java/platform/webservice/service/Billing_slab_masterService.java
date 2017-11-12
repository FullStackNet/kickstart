package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Billing_planHelper;
import platform.helper.Billing_slab_masterHelper;
import platform.resource.BaseResource;
import platform.resource.billing_plan;
import platform.resource.billing_slab_master;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Billing_slab_masterService extends BaseService{
	public Billing_slab_masterService() {
		super(Billing_slab_masterHelper.getInstance(),new billing_slab_master());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		billing_slab_master _resource = (billing_slab_master)resource;
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
