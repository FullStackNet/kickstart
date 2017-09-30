package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.Appliance_threshold_temleteHelper;
import platform.helper.Customer_mapHelper;
import platform.helper.LocationHelper;
import platform.resource.BaseResource;
import platform.resource.appliance_threshold_templete;
import platform.resource.location;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_threshold_templeteService extends BaseService{
	public Appliance_threshold_templeteService() {
		super(Appliance_threshold_temleteHelper.getInstance(),new appliance_threshold_templete());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_threshold_templete _resource = (appliance_threshold_templete) resource;
		getHelper().add(_resource);
	}
	
	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			location _resource = (location) resource;
			if (Util.isEmpty(_resource.getName())) {
			_resource.setName(_resource.getAddress()+","+
					_resource.getStreat()+","+_resource.getArea()+","+
					_resource.getCity()+","+_resource.getState()+
					","+_resource.getCountry()+","+_resource.getPinCode());
			}
			update(ctx, _resource);
		}
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
