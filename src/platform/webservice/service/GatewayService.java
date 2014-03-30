package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.DeviceHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.device;
import platform.resource.gateway;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class GatewayService extends BaseService{
	public GatewayService() {
		super(DeviceHelper.getInstance(),new device());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		gateway _resource = (gateway) resource;
		getHelper().add(_resource);
		User_mapHelper.getInstance().addDevice(ctx.getUserId(), _resource.getId());
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
