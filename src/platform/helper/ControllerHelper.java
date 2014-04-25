package platform.helper;

import java.util.ArrayList;

import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.controller;
import platform.resource.gateway;
import platform.util.ApplicationException;


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
	
	public int getControllerCountByGatewayId(String gatewayId) {
		gateway _gateway = (gateway)GatewayHelper.getInstance().getById(gatewayId);
		if (_gateway == null)
			return 0;
		ArrayList<Object> list = _gateway.getControllers();
		if (list != null)
			return list.size();
		return 0;
	}
	public BaseResource[] getByGatewayId(String gatewayId) {
		gateway _gateway = (gateway)GatewayHelper.getInstance().getById(gatewayId);
		if (_gateway == null)
			return null;
		ArrayList<Object> list = _gateway.getControllers();
		return ControllerHelper.getInstance().getById(list.toArray(new String[list.size()]), null);
	}
	
	public BaseResource[] getByApplianceId(String applianceId) {
		platform.db.Expression e = new platform.db.Expression(controller.FIELD_APPLIANCE_ID,REL_OP.EQ, applianceId);
		return getByExpression(e);
	}
}
