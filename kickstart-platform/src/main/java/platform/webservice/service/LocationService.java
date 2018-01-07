package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.ApplianceHelper;
import platform.helper.Customer_mapHelper;
import platform.helper.LocationHelper;
import platform.resource.BaseResource;
import platform.resource.location;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class LocationService extends BaseService{
	public LocationService() {
		super(LocationHelper.getInstance(),new location());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		location _resource = (location) resource;
		if (Util.isEmpty(_resource.getName())) {
			_resource.setName(_resource.getAddress()+","+
				_resource.getStreat()+","+_resource.getArea()+","+
				_resource.getCity()+","+_resource.getState()+
				","+_resource.getCountry()+","+_resource.getPinCode());
		}
		getHelper().add(_resource);
		Customer_mapHelper.getInstance().addLocation(ctx.getCustomerId(), _resource.getId());
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
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			location _resource = (location) resource;
			if (!Util.isEmpty(_resource.getId())) {
				LocationHelper.getInstance().deleteById(_resource.getId());
			}
		}
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}

	private enum QueryTypes {
		QUERY_GET_BY_CUSTOMER_ID
	};
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_GET_BY_CUSTOMER_ID.toString().equals(queryId)) {
			String customerId = (String) map.get("customerId");
			return LocationHelper.getInstance().getByCustomerId(customerId);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
