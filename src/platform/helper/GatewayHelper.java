package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.controller;
import platform.resource.gateway;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;


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

	public gateway validate(String username, String password,String identifier) throws ApplicationException {
		Expression e = new Expression(gateway.FIELD_LOGIN_ID, REL_OP.EQ, username);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources))
			return null;
		gateway _gateway = (gateway) resources[0];
		if (Util.isEmpty(_gateway.getPassword()))
			return _gateway;
		if (!password.equals(_gateway.getPassword())) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid user name and password");
		}
		if ((identifier != null) && (_gateway.getMachine_id() != null) && !identifier.equals(_gateway.getMachine_id())) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Gateway running on invalid Machine");
		}
		return _gateway;
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
