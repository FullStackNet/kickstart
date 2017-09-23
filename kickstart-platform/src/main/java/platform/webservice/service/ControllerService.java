package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.ControllerHelper;
import platform.helper.Customer_mapHelper;
import platform.helper.DeviceHelper;
import platform.helper.GatewayHelper;
import platform.helper.Hardware_vendorHelper;
import platform.manager.ApplicationManager;
import platform.message.RegisteredController;
import platform.resource.BaseResource;
import platform.resource.controller;
import platform.resource.device;
import platform.resource.hardware_vendor;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class ControllerService extends BaseService{
	public ControllerService() {
		super(ControllerHelper.getInstance(), new controller());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		controller _resource = (controller) resource;
		device _device = (device)DeviceHelper.getInstance().getById(_resource.getId());
		if (_device == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Controller");
		}

		hardware_vendor _vendor = (hardware_vendor)Hardware_vendorHelper.getInstance().getById(_device.getVendor_id());
		if (_vendor == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Vendor");
		}
		if (_resource.getGateway_id() != null) {
			GatewayHelper.getInstance().addController(_resource.getGateway_id(), _resource.getId());
		}
		_resource.setManager(_device.getManager());
		_resource.setModel(_device.getModel());
		_resource.setHardware_vendor_id(_device.getVendor_id());
		getHelper().add(_resource);
		Customer_mapHelper.getInstance().addController(ctx.getCustomerId(), _resource.getId());
		DeviceHelper.getInstance().updateState(_device.getId(), "DEPLOYED");
		
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			controller _resource = (controller) resource;
			controller _controller = (controller)ControllerHelper.getInstance().getById(resource.getId());
			if (((controller)resource).getPacket_capture() != null) {
				if (_controller.getPacket_capture().equals(_resource.getPacket_capture())) {
					// send the packet capture 
					RegisteredController message = new RegisteredController();
					message.setController_id(_controller.getId());
					if (Util.isEmpty(_controller.getName())) {
						message.setController_name(_controller.getId());
					}
					message.setController_type(_controller.getType());
					message.setManager(_controller.getManager());
					message.setModel(_controller.getModel());
					message.setPacket_capture(_resource.getPacket_capture());
					ApplicationManager.getInstance().sendMessage(_controller.getId(),message);
				}
			}
			update(ctx, resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			controller _resource = (controller) resource;
			ControllerHelper.getInstance().delete(ctx.getCustomerId(),ctx.getUserId(),_resource.getId());
		}
	}
	
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}
	private enum QueryTypes {
		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_APPLIANCE_CONTROLLER,
	};
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_APPLIANCE_CONTROLLER.toString().equals(queryId)) {
			String applianceId = (String)map.get(controller.FIELD_APPLIANCE_ID);
			return ControllerHelper.getInstance().getByApplianceId(applianceId);
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
