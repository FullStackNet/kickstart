package platform.helper;

import java.util.ArrayList;

import platform.resource.BaseResource;
import platform.resource.controller;
import platform.resource.gateway;


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
}
