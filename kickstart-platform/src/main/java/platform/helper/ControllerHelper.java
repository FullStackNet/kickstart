package platform.helper;

import java.util.Date;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.controller;
import platform.resource.gateway;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;


public class ControllerHelper extends BaseHelper {
	
	public ControllerHelper() {
		super(new controller());
		// TODO Auto-generated constructor stub
	}
	private static ControllerHelper instance;
	
	public static ControllerHelper getInstance() {
		if (instance == null)
			instance = new ControllerHelper();
		return instance;
	}
	
	public void delete(String userId,String customerId,String controllerId) throws ApplicationException {
		controller _controller = (controller)ControllerHelper.getInstance().getById(controllerId);
		if (_controller == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Controller");
		Customer_mapHelper.getInstance().removeController(customerId, controllerId);
		DeviceHelper.getInstance().updateState(controllerId,"REMOVED");
		ControllerHelper.getInstance().deleteById(controllerId);
	}
	
	public void updateManager(String controllerId, String manager) {
		if (controllerId ==null) return;
		if (manager == null) return;
		
		controller _controller = new controller();
		_controller.setId(controllerId);
		_controller.setManager(manager);
		try {
			ControllerHelper.getInstance().update(_controller);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateLastDataReceivedTime(String controllerId, Date time) {
		if (controllerId ==null) return;
		
		controller _controller = new controller();
		_controller.setId(controllerId);
		_controller.setLast_data_received(time.getTime());
		try {
			ControllerHelper.getInstance().update(_controller);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateApplianceCount(String controllerId, long count) {
		if (controllerId ==null) return;

		controller _controller = new controller();
		_controller.setId(controllerId);
		_controller.setAppliances((int)count);
		try {
			ControllerHelper.getInstance().update(_controller);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BaseResource[] getCommunityControllers(String communityId) {
		Expression e = new Expression(appliance.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
		BaseResource[] _controllers = getByExpression(e, new String[]{appliance.FIELD_NAME});
		if (Util.isEmpty(_controllers)) 
			return null;
		return _controllers;
	}
	
	public int getControllerCountByGatewayId(String gatewayId) {
		gateway _gateway = (gateway)GatewayHelper.getInstance().getById(gatewayId);
		if (_gateway == null)
			return 0;
		java.util.List<Object> list = _gateway.getControllers();
		if (list != null)
			return list.size();
		return 0;
	}
	public BaseResource[] getByGatewayId(String gatewayId) {
		gateway _gateway = (gateway)GatewayHelper.getInstance().getById(gatewayId);
		if (_gateway == null)
			return null;
		java.util.List<Object> list = _gateway.getControllers();
		return ControllerHelper.getInstance().getById(list.toArray(new String[list.size()]), null);
	}

	public BaseResource[] getByLocationId(String locationId) {
		Expression e = new Expression(controller.FIELD_SITE_ID, REL_OP.EQ, locationId);
		return getByExpression(e, new String[]{appliance.FIELD_NAME});
	}

	public BaseResource[] getByApplianceId(String applianceId) {
		platform.db.Expression e = new platform.db.Expression(controller.FIELD_APPLIANCE_ID,REL_OP.EQ, applianceId);
		return getByExpression(e);
	}
}
