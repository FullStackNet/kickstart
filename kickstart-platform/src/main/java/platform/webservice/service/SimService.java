package platform.webservice.service;

import platform.helper.SimHelper;
import platform.resource.BaseResource;
import platform.resource.sim;
import platform.util.ApplicationException;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class SimService extends BaseService{
	public SimService() {
		super(SimHelper.getInstance(), new sim());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		sim _resource = (sim) resource;
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
}
