package platform.webservice.service;

import platform.helper.Customer_mapHelper;
import platform.helper.SensorHelper;
import platform.resource.BaseResource;
import platform.resource.sensor;
import platform.util.ApplicationException;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class SensorService extends BaseService{
	public SensorService() {
		super(SensorHelper.getInstance(), new sensor());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		sensor _resource = (sensor) resource;
		getHelper().add(resource);
		Customer_mapHelper.getInstance().addSensor(ctx.getCustomerId(), _resource.getId());
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
