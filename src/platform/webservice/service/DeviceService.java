package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.DeviceHelper;
import platform.helper.Hardware_vendorHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.device;
import platform.resource.hardware_vendor;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class DeviceService extends BaseService{
	public DeviceService() {
		super(DeviceHelper.getInstance(),new device());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		device _resource = (device) resource;
		hardware_vendor vendor = (hardware_vendor)Hardware_vendorHelper.getInstance().getById(_resource.getVendor_id());
		if (_resource.getVendor_device_id() != null) {
			 if(!_resource.getVendor_device_id().startsWith(vendor.getShort_code()+"_")) {
					_resource.setId(vendor.getShort_code()+"_"+_resource.getVendor_device_id());
			} else {
				_resource.setId(_resource.getVendor_device_id());
			}
		}
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
