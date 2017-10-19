package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.CustomerHelper;
import platform.helper.ServerHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.server;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class ServerService extends BaseService{
	public ServerService() {
		super(ServerHelper.getInstance(),new server());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		server _resource = (server) resource;
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
		if (queryId.equalsIgnoreCase("QUERY_MY_SERVER")) {
			String customerId = ctx.getCustomerId();
			return ServerHelper.getInstance().getByCustomerId(customerId);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);

	}
}
