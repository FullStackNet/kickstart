package platform.webservice.service;

import java.util.ArrayList;
import java.util.Map;

import platform.appliances.Appliance;
import platform.appliances.ApplianceConstants;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.exception.ExceptionEnum;
import platform.helper.*;
import platform.manager.ApplicationManager;
import platform.message.DeviceAction;
import platform.message.DeviceConfiguration;
import platform.resource.*;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;
import application.c4t.vehicle.helper.RouteHelper;
import application.c4t.vehicle.resource.route;

public class ApplianceService extends BaseService{
	public ApplianceService() {
		super(ApplianceHelper.getInstance(),new appliance());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance _resource = (appliance) resource;
		if (_resource.getCustomer_id() == null) {
			_resource.setCustomer_id(ctx.getCustomerId());
		}
		if (!Util.isEmpty(_resource.getLocation_id())) {
			location _location = (location)LocationHelper.getInstance().getById(_resource.getLocation_id());
			if (_location != null) {
				_resource.setLocation_name(_location.getName());
			}
		}
		if (!Util.isEmpty(_resource.getController_id())) {
			controller _controller = (controller)ControllerHelper.getInstance().getById(_resource.getController_id());
			if (_controller != null) {
				_resource.setController_name(_controller.getName());
			}
			long count = ApplianceHelper.getInstance().getApplianceCount4ControllerId(_resource.getController_id());
			ControllerHelper.getInstance().updateApplianceCount(_resource.getController_id(),count);
		}

		if (!Util.isEmpty(_resource.getThreshold_templete_id())) {
			appliance_threshold_templete _templete = (appliance_threshold_templete)Appliance_threshold_templeteHelper.getInstance().getById(_resource.getThreshold_templete_id());
			if (_templete != null) {
				_resource.setThreshold_templete_name(_templete.getName());
			}
		}
		_resource.setUser_id(ctx.getUserId());
		getHelper().add(_resource);
		Appliance_mapHelper.getInstance().addAdmin(_resource.getId(),ctx.getUserId());
		User_mapHelper.getInstance().addAppliance(ctx.getUserId(), _resource.getId());
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		} else if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CLEAN_DATA)) {
			ApplianceHelper.getInstance().cleanData(ctx.getUserId(),resource);
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_PUSH_CONFIG)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)User_mapHelper.getInstance().getApplianace(userId, resource.getId());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (ApplianceConstants.APPLIANCE_TYPE_DG.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceConfiguration message = new DeviceConfiguration();
				message.setDeviceId(_controller.getId());
				String configString = "airtelgprs.com";
				configString = configString +","+_controller.getConnection_ip();
				configString = configString +","+_controller.getConnection_port();
				configString = configString +","+(int)_controller.getData_read_interval()/5;
				configString = configString +","+(int)_controller.getHeartbeat_interval()/5;
				configString = configString +","+_controller.getPassword();
				configString = configString +",";
				message.setConfiguration(configString);
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
				System.out.println("Sending the request");
			}
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_REBOOT)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)User_mapHelper.getInstance().getApplianace(userId, resource.getId());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (ApplianceConstants.APPLIANCE_TYPE_DG.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceAction message = new DeviceAction();
				message.setDeviceId(_controller.getId());
				message.setAction("REBOOT");
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
			}
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_TURN_ON)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(resource.getId());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (ApplianceConstants.APPLIANCE_TYPE_DG.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceAction message = new DeviceAction();
				message.setDeviceId(_controller.getId());
				message.setAction("ON");
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
			} else if (Appliance.APPLIANCE_HOME_APPLAINCE.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceAction message = new DeviceAction();
				message.setDeviceId(_controller.getId());
				message.setAction("ON");
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
			}
		} else  if (action.equalsIgnoreCase(WebServiceContants.OPERATION_TURN_OFF)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(resource.getId());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			if (ApplianceConstants.APPLIANCE_TYPE_DG.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceAction message = new DeviceAction();
				message.setDeviceId(_controller.getId());
				message.setAction("OFF");
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
			} else if (Appliance.APPLIANCE_HOME_APPLAINCE.equalsIgnoreCase(_appliance.getType())) {
				Expression e = new Expression(controller.FIELD_APPLIANCE_ID, REL_OP.EQ, _appliance.getId());
				BaseResource[] resources = ControllerHelper.getInstance().getByExpression(e);
				if (platform.util.Util.isEmpty(resources)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No controller specified");
				}
				if (resources.length > 1) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "In consitent configuration , More than one controller attached , I am confused ...");
				}
				controller _controller = (controller)resources[0];
				if (_controller.getGateway_id() == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "No Gateway attached to controller ... Cannot process this action");
				}
				DeviceAction message = new DeviceAction();
				message.setDeviceId(_controller.getId());
				message.setAction("OFF");
				ApplicationManager.getInstance().sendMessage(_controller.getGateway_id(), message);
			}
		} else {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid operation ...");
		}

	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance _appliance = (appliance) resource;
		if (!Util.isEmpty(_appliance.getLocation_id())) {
			location _location = (location)LocationHelper.getInstance().getById(_appliance.getLocation_id());
			if (_location != null) {
				_appliance.setLocation_name(_location.getName());
			}
		}
		if (!Util.isEmpty(_appliance.getController_id())) {
			controller _controller = (controller)ControllerHelper.getInstance().getById(_appliance.getController_id());
			if (_controller != null) {
				_appliance.setController_name(_controller.getName());
			}
			long count = ApplianceHelper.getInstance().getApplianceCount4ControllerId(_appliance.getController_id());
			ControllerHelper.getInstance().updateApplianceCount(_appliance.getController_id(),count);
		}
		if (!Util.isEmpty(_appliance.getThreshold_templete_id())) {
			appliance_threshold_templete _templete = (appliance_threshold_templete)Appliance_threshold_templeteHelper.getInstance().getById(_appliance.getThreshold_templete_id());
			if (_templete != null) {
				_appliance.setThreshold_templete_name(_templete.getName());
			}
		}
		getHelper().update(_appliance);
	}

	private enum QueryTypes {

		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_USER_APPLIANCES_SUMMARY ,
		QUERY_TIME_SERIES_APPLIANCES ,
		QUERY_APPLIANCE_RUNNING ,
		QUERY_APPLIANCE_NOT_RUNNING ,
		QUERY_APPLIANCE_LOW_FUEL ,
		QUERY_APPLIANCE_HIGH_CANOPY_TEMP,
		QUERY_APPLIANCE_HIGH_WATER_TEMP ,
		QUERY_APPLIANCE_HIGH_COOLANT_TEMP,
		QUERY_ALERT,
		QUERY_NOTIFICATION,
		QUERY_BUS_SIMULATOR,
		QUERY_BUS_DETAIL_FOR_SCHOOL_ADMIN,
		QUERY_GET_BY_ROUTE_ID,
		QUERY_APPLIANCE_HOME_AUTOMATION,
		QUERY_USER_VEHICLE_SUMMARY,
		QUERY_USER_VEHICLE_LOCATION,
		QUERY_GET_BY_ID,
		QUERY_APPLIANCE_METER_CURRENT_DATA,
		
	};

	public BaseResource get(ServletContext ctx, String uid) {
		String userId = ctx.getUserId();
		return User_mapHelper.getInstance().getApplianace(userId, uid);
	}
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_BUS_DETAIL_FOR_SCHOOL_ADMIN.toString().equals(queryId)) {
			return ApplianceHelper.getInstance().getSchoolBusAdminDetail(ctx.getCustomerId(),null);
		} else if(QueryTypes.QUERY_USER_VEHICLE_LOCATION.toString().equals(queryId)) {
			String appliance_id = (String)map.get("id");
			BaseResource appliance = ApplianceHelper.getInstance().getApplianceLocation(appliance_id);
			if (appliance == null)
				return null;
			BaseResource[] resources = new appliance[1];
			resources[0] = appliance;
			return resources;
		}  else if(QueryTypes.QUERY_GET_BY_ID.toString().equals(queryId)) {
			String appliance_id = (String)map.get("id");
			BaseResource appliance = ApplianceHelper.getInstance().getById(appliance_id);
			if (appliance == null)
				return null;
			BaseResource[] resources = new appliance[1];
			resources[0] = appliance;
			return resources;
		}
		else if(QueryTypes.QUERY_APPLIANCE_HOME_AUTOMATION.toString().equals(queryId)) {
			return ApplianceHelper.getInstance().getByCustomerId(ctx.getCustomerId());
		}
		else if(QueryTypes.QUERY_USER_APPLIANCES_SUMMARY.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			user _user = (user) UserHelper.getInstance().getById(userId);
			if (_user.getType().equals(user.USER_TYPE_CUSTOMER_ADMIN)) {
				return ApplianceHelper.getInstance().getByCustomerId(ctx.getCustomerId());
			}
			return User_mapHelper.getInstance().getApplinacesArray(userId);
		} else if(QueryTypes.QUERY_USER_VEHICLE_SUMMARY.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			return User_mapHelper.getInstance().getApplinacesArray(userId);
		} else if(QueryTypes.QUERY_APPLIANCE_RUNNING.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getRunningApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_BUS_SIMULATOR.toString().equals(queryId)) {
			return ApplianceHelper.getInstance().getByCustomerId(ctx.getCustomerId());
			///Student_mapHelper.getInstance().get
		} else if(QueryTypes.QUERY_APPLIANCE_NOT_RUNNING.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getNotRunningApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_APPLIANCE_LOW_FUEL.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getLowFuelApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_APPLIANCE_HIGH_CANOPY_TEMP.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getHighCanopyTempApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_APPLIANCE_HIGH_COOLANT_TEMP.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getHighCoolantTempApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_APPLIANCE_HIGH_WATER_TEMP.toString().equals(queryId)) {
			return User_mapHelper.getInstance().getHighWaterTempApplinacesArray(ctx.getUserId());
		} else if(QueryTypes.QUERY_ALERT.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)User_mapHelper.getInstance().getApplianace(userId, map.get("id").toString());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			return Appliance_mapHelper.getInstance().getAlertArray(map.get("id").toString());
		} else if(QueryTypes.QUERY_NOTIFICATION.toString().equals(queryId)) {
			String userId = ctx.getUserId();
			if (userId  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Session");
			}
			appliance _appliance = (appliance)User_mapHelper.getInstance().getApplianace(userId, map.get("id").toString());
			if (_appliance  == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Permission denied");
			}
			return Appliance_mapHelper.getInstance().getNotificationArray(map.get("id").toString());
		} else if (QueryTypes.QUERY_GET_BY_ROUTE_ID.toString().equals(queryId)) {
			String route_id = (String)map.get("route_id");
			route _route = (route)RouteHelper.getInstance().getById(route_id);
			if ((_route != null) && (_route.getAppliance_id() != null)) {
				ArrayList<BaseResource> list = new ArrayList<BaseResource>();
				appliance _resource = (appliance) getHelper().getById(_route.getAppliance_id());
				list.add(_resource);
				return list.toArray(new appliance[list.size()]);
			}
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid stopage/route");
		}

		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
