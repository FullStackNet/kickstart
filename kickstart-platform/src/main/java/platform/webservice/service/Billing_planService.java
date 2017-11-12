package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Billing_planHelper;
import platform.helper.CustomerHelper;
import platform.resource.BaseResource;
import platform.resource.billing_plan;
import platform.resource.customer;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Billing_planService extends BaseService{
	public Billing_planService() {
		super(Billing_planHelper.getInstance(),new billing_plan());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
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
