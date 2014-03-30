package platform.helper;

import platform.resource.controller;
import platform.resource.gateway;
import platform.util.ApplicationException;


public class GatewayHelper extends BaseHelper {

	public GatewayHelper() {
		super(new gateway());
		// TODO Auto-generated constructor stub
	}
	private static GatewayHelper instance;

	public static GatewayHelper getInstance() {
		if (instance == null)
			instance = new GatewayHelper();
		return instance;
	}

	public void addController(String gatewayId,String controllerId) throws ApplicationException {
		controller _fetchedResource = (controller)ControllerHelper.getInstance().getById(resource.getId());
		controller _resource = (controller)resource;
		if (_resource.getGateway_id() != null) {
			if (!_resource.getGateway_id().equals(_fetchedResource.getGateway_id())) {
				removeController(_fetchedResource.getGateway_id(), _resource.getId());
				_addController(_resource.getGateway_id(), _resource.getId());
			}
		} else {
			if (_fetchedResource.getGateway_id() != null) {
				removeController(_fetchedResource.getGateway_id(), _resource.getId());
			}
		}
	}

	void _addController(String gatewayId,String controllerId) throws ApplicationException {
		gateway _resource = new gateway();
		_resource.setId(gatewayId);
		_resource.addControllers(controllerId);
		update(_resource);
		Managed_objectHelper.getInstance().updateNumberOfController(gatewayId);
	}

	public void removeController(String gatewayId,String controllerId) throws ApplicationException {
		gateway _resource = new gateway();
		_resource.setId(gatewayId);
		_resource.addControllers(controllerId);
		unset(_resource);
		Managed_objectHelper.getInstance().updateNumberOfController(gatewayId);
	}
}
