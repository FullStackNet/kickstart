package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Hardware_vendorHelper;
import platform.resource.BaseResource;
import platform.resource.hardware_vendor;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class Hardware_vendorService extends BaseService{
	public Hardware_vendorService() {
		super(Hardware_vendorHelper.getInstance(),new hardware_vendor());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		hardware_vendor _resource = (hardware_vendor) resource;
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
