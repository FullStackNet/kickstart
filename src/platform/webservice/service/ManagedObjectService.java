package platform.webservice.service;

import java.util.Map;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.event.EventManager;
import platform.events.ShutDownProcessEvent;
import platform.exception.ExceptionEnum;
import platform.helper.Managed_objectHelper;
import platform.helper.User_mapHelper;
import platform.manager.ApplicationManager;
import platform.message.MOConfigureAgent;
import platform.message.MOConfigureAlertManager;
import platform.message.MOConfigureGateway;
import platform.message.MOConfigureManager;
import platform.message.MOConfigureMonitor;
import platform.message.MOProcessStart;
import platform.message.MOProcessStop;
import platform.message.MOUpgrade;
import platform.resource.BaseResource;
import platform.resource.managed_object;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class ManagedObjectService extends BaseService{
	public ManagedObjectService() {
		super(Managed_objectHelper.getInstance(),new managed_object());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		managed_object _resource = (managed_object) resource;
		getHelper().add(_resource);
	}
	
	public void sendManagerConfigureMessage(managed_object _managed_object) throws ApplicationException {
		MOConfigureManager message  = new MOConfigureManager();
		message.setMo_name(_managed_object.getName());
		message.setLocation(_managed_object.getLocation());
		message.setSelf_ip_address(_managed_object.getIp_address());
		message.setConnect_url(_managed_object.getMessage_bus_url());
		ApplicationManager.getInstance().sendMessage(
				_managed_object.getId(), message);
	}
	
	public void sendAlertManagerConfigureMessage(managed_object _managed_object) throws ApplicationException {
		MOConfigureAlertManager message  = new MOConfigureAlertManager();
		message.setMo_name(_managed_object.getName());
		message.setLocation(_managed_object.getLocation());
		message.setSelf_ip_address(_managed_object.getIp_address());
		message.setConnect_url(_managed_object.getMessage_bus_url());
		ApplicationManager.getInstance().sendMessage(
				_managed_object.getId(), message);
	}
	
	public void sendAgentConfigureMessage(managed_object _managed_object) throws ApplicationException {
		MOConfigureAgent message  = new MOConfigureAgent();
		message.setMo_name(_managed_object.getName());
		message.setLocation(_managed_object.getLocation());
		message.setSelf_ip_address(_managed_object.getIp_address());
		message.setConnect_url(_managed_object.getMessage_bus_url());
		message.setDb_enable(_managed_object.getDb_enabled());
		ApplicationManager.getInstance().sendMessage(
				_managed_object.getId(), message);
	}
	
	public void sendMonitorConfigureMessage(managed_object _managed_object) throws ApplicationException {
		MOConfigureMonitor message  = new MOConfigureMonitor();
		message.setMo_name(_managed_object.getName());
		message.setLocation(_managed_object.getLocation());
		message.setSelf_ip_address(_managed_object.getIp_address());
		message.setConnect_url(_managed_object.getMessage_bus_url());
		ApplicationManager.getInstance().sendMessage(
				_managed_object.getId(), message);
	}
	
	public void sendGatewayConfigureMessage(managed_object _managed_object) throws ApplicationException {
		MOConfigureGateway message  = new MOConfigureGateway();
		message.setMo_name(_managed_object.getName());
		message.setLocation(_managed_object.getLocation());
		message.setSelf_ip_address(_managed_object.getIp_address());
		message.setConnect_url(_managed_object.getMessage_bus_url());
		message.setDb_enable(_managed_object.getDb_enabled());
		message.setModules(_managed_object.getModules());
		ApplicationManager.getInstance().sendMessage(
				_managed_object.getId(), message);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
			managed_object _managed_object = (managed_object)Managed_objectHelper.getInstance().getById(resource.getId());
			if (_managed_object  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (ApplicationConstants.APPLICATION_NAME_MANAGER.equals(_managed_object.getType())) {
				sendManagerConfigureMessage(_managed_object);
			} else if (ApplicationConstants.APPLICATION_NAME_ALERT_MANAGER.equals(_managed_object.getType())) {
				sendAlertManagerConfigureMessage(_managed_object);
			} else if (ApplicationConstants.APPLICATION_NAME_GATEWAY.equals(_managed_object.getType())) {
				sendGatewayConfigureMessage(_managed_object);
			} else if (ApplicationConstants.APPLICATION_NAME_AGENT.equals(_managed_object.getType())) {
				sendAgentConfigureMessage(_managed_object);
			} else if (ApplicationConstants.APPLICATION_NAME_MONITOR.equals(_managed_object.getType())) {
				sendMonitorConfigureMessage(_managed_object);
			}
		}  else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_PUSH_CONFIG)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			managed_object _managed_object = (managed_object)Managed_objectHelper.getInstance().getById(resource.getId());
			if (_managed_object  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_TURN_OFF)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			managed_object _managed_object = (managed_object)Managed_objectHelper.getInstance().getById(resource.getId());
			if (_managed_object  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (_managed_object.getType().equals(ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER)) {
				Expression e1 = new Expression(managed_object.FIELD_TYPE, REL_OP.EQ, ApplicationConstants.APPLICATION_NAME_AGENT);
				Expression e2 = new Expression(managed_object.FIELD_IP_ADDRESS, REL_OP.EQ, _managed_object.getIp_address());
				Expression e = new Expression(e1, LOG_OP.AND, e2);
				BaseResource[] resources = Managed_objectHelper.getInstance().getByExpression(e);
				if (Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No agent found to execute command ....");
				}
				
				MOProcessStop message = new MOProcessStop();
				message.setProcess_name(_managed_object.getType());
				ApplicationManager.getInstance().sendMessage(
						resources[0].getId(), message);
				
			} else {
				MOProcessStop message = new MOProcessStop();
				ApplicationManager.getInstance().sendMessage(
						_managed_object.getId(), message);
			}
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_UPGRADE)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			managed_object _managed_object = (managed_object)Managed_objectHelper.getInstance().getById(resource.getId());
			if (_managed_object  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (_managed_object.getType().equals(ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER)) {
				Expression e1 = new Expression(managed_object.FIELD_TYPE, REL_OP.EQ, ApplicationConstants.APPLICATION_NAME_AGENT);
				Expression e2 = new Expression(managed_object.FIELD_IP_ADDRESS, REL_OP.EQ, _managed_object.getIp_address());
				Expression e = new Expression(e1, LOG_OP.AND, e2);
				BaseResource[] resources = Managed_objectHelper.getInstance().getByExpression(e);
				if (Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No agent found to execute command ....");
				}
				MOUpgrade message = new MOUpgrade();
				message.setProcess_name(_managed_object.getType());
				ApplicationManager.getInstance().sendMessage(
						resources[0].getId(), message);
				EventManager.getInstance().triggerEvent(this, new ShutDownProcessEvent());
			} else {
				MOUpgrade message = new MOUpgrade();
				ApplicationManager.getInstance().sendMessage(
						_managed_object.getId(), message);
			}
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_TURN_ON)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			managed_object _managed_object = (managed_object)Managed_objectHelper.getInstance().getById(resource.getId());
			if (_managed_object  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			Expression e1 = new Expression(managed_object.FIELD_TYPE, REL_OP.EQ, ApplicationConstants.APPLICATION_NAME_AGENT);
			Expression e2 = new Expression(managed_object.FIELD_IP_ADDRESS, REL_OP.EQ, _managed_object.getIp_address());
			Expression e = new Expression(e1, LOG_OP.AND, e2);
			BaseResource[] resources = Managed_objectHelper.getInstance().getByExpression(e);
			if (Util.isEmpty(resources)) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "No agent found to execute command ....");
			}
			
			MOProcessStart message = new MOProcessStart();
			message.setProcess_name(_managed_object.getType());
			ApplicationManager.getInstance().sendMessage(
					resources[0].getId(), message);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			managed_object _resource = (managed_object) resource;
			Managed_objectHelper.getInstance().delete(ctx.getCustomerId(),ctx.getUserId(),_resource.getId());

		}else {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid operation ...");
		}

	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		managed_object _managed_object = (managed_object) resource;
		getHelper().update(_managed_object);
	}

	private enum QueryTypes {

		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_ALL_MANAGED_OBJECT
	};

	public BaseResource get(ServletContext ctx, String uid) {
		String userId = ctx.getUserId();
		return User_mapHelper.getInstance().getApplianace(userId, uid);
	}

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_ALL_MANAGED_OBJECT.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			return Managed_objectHelper.getInstance().getAll();
		} 						
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
