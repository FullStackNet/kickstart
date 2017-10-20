package platform.helper;

import java.util.Date;
import java.util.Map;

import platform.alert.AlertFactory;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.event.EventManager;
import platform.events.AlertAddedEvent;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.resource.appliance;
import platform.resource.controller;
import platform.resource.sensor;
import platform.util.ApplicationException;



public class AlertHelper extends BaseHelper {
	public AlertHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static AlertHelper instance;

	public static AlertHelper getInstance() {
		if (instance == null)
			instance = new AlertHelper();
		return instance;
	}

	AlertHelper() {
		super(new alert());
		// TODO Auto-generated constructor stub
	}

	public alert getById(String id) {
		return (alert)super.getById(id);
	}
	public void handleDisconnected(String gatewayId, String deviceType,String deviceId) {

	}

	public void handleConnected(String gatewayId,String deviceType,String deviceId) {
	}

	public void handleDeepDischargeBattery(sensor _sensor, String data) {
	}

	public void handleApplianceLowFuel(appliance _appliance, Date alertTime) {
		appliance __appliance  = new appliance(_appliance.getId());
		__appliance.setLowFuelState("Y");
		__appliance.setLowFuelStateEnterTime(alertTime.getTime());
		try {
			ApplianceHelper.getInstance().update(__appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void handleApplianceLowFuelNormal(appliance _appliance) {
		appliance __appliance  = new appliance(_appliance.getId());
		__appliance.setLowFuelState("N");
		try {
			ApplianceHelper.getInstance().update(__appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void handleApplianceTempered(appliance _appliance) {
		appliance __appliance  = new appliance(_appliance.getId());
		__appliance.setTempered("Y");
		try {
			ApplianceHelper.getInstance().update(__appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addAlertFromAppliance(appliance _appliance,
			String alertId, int severity, Map<String, Object> data, Date alertTime)  {
		
		String site_id = "";
		String deviceType = "";
		String deviceName = "";
		String customer_id = "";
		String gateway_Id = "";
		String applianceId= "";
		String applianceName= "";
		String assetId= "";
		
		deviceType = _appliance.getType();
		deviceName = _appliance.getName();
		site_id = _appliance.getSite_id();
		customer_id = _appliance.getCustomer_id();
		applianceId = _appliance.getId();
		applianceName = _appliance.getName();
		assetId = _appliance.getAsset_id();
		
		addAlert(customer_id, site_id, gateway_Id, applianceId, deviceType, deviceName, 
				applianceId, applianceName, assetId, 
				alertId, severity, data, alertTime);
		if (AlertFactory.ALERT_LOW_FUEL.equals(alertId)) {
			handleApplianceLowFuel(_appliance,alertTime);
		} else if (AlertFactory.ALERT_LOW_FUEL_NORMAL.equals(alertId)) {
			handleApplianceLowFuelNormal(_appliance);
		} else if (AlertFactory.ALERT_TEMPERED.equals(alertId)) {
			handleApplianceTempered(_appliance);
		}
	}


	public void addAlertFromAppliance(String applianceId,
			String alertId, int severity,  Map<String, Object> data, Date alertTime)  {

		appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
		addAlertFromAppliance(_appliance,alertId,severity,data,alertTime);
	}

	public void addAlertFromController(String controllerId,
			String alertId, int severity,  Map<String, Object> data, Date alertTime)  {
		controller controller_object = (controller)ControllerHelper.getInstance().getById(controllerId);
		if (controller_object != null) {
			addAlertFromController(controller_object,alertId,severity,data,alertTime);
		} 
	}

	public void addAlertFromController(controller controller_object,
			String alertId, int severity,  Map<String, Object> data, Date alertTime)  {

		String site_id = "";
		String deviceType = "";
		String deviceName = "";
		String customer_id = "";
		String gateway_Id = "";
		String applianceId= "";
		String applianceName= "";
		String assetId= "";
		
		deviceType = controller_object.getType();
		deviceName = controller_object.getName();
		site_id = controller_object.getSite_id();
		customer_id = controller_object.getCustomer_id();
		gateway_Id = controller_object.getGateway_id();
		applianceId = controller_object.getAppliance_id();
		
		if (applianceId != null) {
			appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
			if (_appliance != null) {
				applianceName = _appliance.getName();
				assetId = _appliance.getAsset_id();
			}
		}	
		addAlert(customer_id, site_id, gateway_Id, controller_object.getId(), deviceType, deviceName, 
				applianceId, applianceName, assetId, 
				alertId, severity, data, alertTime);
	}

	public alert getAleadyCreatedAlert(String deviceId,String deviceType,String alertId) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,deviceId);
		Expression e2 = new Expression(alert.FIELD_DEVICE_TYPE, REL_OP.EQ,deviceType);
		Expression e3 = new Expression(alert.FIELD_ALERT_ID, REL_OP.EQ,alertId);
		Expression e4 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e5 = new Expression(e1, LOG_OP.AND,e2);
		Expression e6 = new Expression(e3, LOG_OP.AND,e4);
		Expression e = new Expression(e5, LOG_OP.AND,e6);
		return  (alert)AlertHelper.getInstance().getByExpressionFirstRecord(e);
	}

	public void addServerAlert(String customerId,
				  String serverId,String serverName,
			  	String alertId, int severity, Map<String, Object> data, Date alertTime) {
		addAlert(customerId,"","",serverId,"SERVER",serverName,"","","",alertId,severity,data,alertTime);
	}

	void addAlert(String customerId,String site_id,
			String gatewayId, String deviceId,String deviceType,String deviceName, 
			String applianceId,String applianceName,String assetId, 
			String alertId, int severity, Map<String, Object> data, Date alertTime)  {


		 alert _alert = getAleadyCreatedAlert(deviceId,deviceType,alertId);
		 if (_alert == null) {
			 _alert = new alert();
			 _alert.setSite_id(site_id);
			 _alert.setCustomer_id(customerId);
			 _alert.setDevice_id(deviceId);
			 _alert.setDevice_name(deviceName);
			 _alert.setDevice_type(deviceType);
			 _alert.setAlert_id(alertId);
			 _alert.setSeverity(severity);
			 _alert.setAlert_data(data);
			 _alert.setGateway_id(gatewayId);
			 _alert.setApplinace_id(applianceId);
			 _alert.setAsset_id(assetId);
			 _alert.setApplinace_name(applianceName);
			 _alert.setCleared("N");
		 }
		_alert.setAlert_time(alertTime.getTime());
		try {
			AddOrUpdate(_alert);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventManager.getInstance().triggerEvent(this, new AlertAddedEvent(_alert.getId()));
	}


	public BaseResource[] getAlertByDeviceId(String id) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,id);
		Expression e2 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e,new String[]{alert.FIELD_ALERT_TIME+" desc"});
	}


	public long getCriticalAlert4DeviceId(String id) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,id);
		Expression e2 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e3 = new Expression(alert.FIELD_SEVERITY, REL_OP.EQ, NotificationFactory.SEVERIRY_CRITICAL);
		Expression e4 = new Expression(e1, LOG_OP.AND,e2);
		Expression e = new Expression(e3, LOG_OP.AND,e4);
		return getCount(e);
	}

	public long getMajorAlert4DeviceId(String id) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,id);
		Expression e2 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e3 = new Expression(alert.FIELD_SEVERITY, REL_OP.EQ, NotificationFactory.SEVERIRY_MAJOR);
		Expression e4 = new Expression(e1, LOG_OP.AND,e2);
		Expression e = new Expression(e3, LOG_OP.AND,e4);
		return getCount(e);
	}

	public long getWarningAlert4DeviceId(String id) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,id);
		Expression e2 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e3 = new Expression(alert.FIELD_SEVERITY, REL_OP.EQ, NotificationFactory.SEVERIRY_WARNING);
		Expression e4 = new Expression(e1, LOG_OP.AND,e2);
		Expression e = new Expression(e3, LOG_OP.AND,e4);
		return getCount(e);
	}

	public long getMinorAlert4DeviceId(String id) {
		Expression e1 = new Expression(alert.FIELD_DEVICE_ID, REL_OP.EQ,id);
		Expression e2 = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
		Expression e3 = new Expression(alert.FIELD_SEVERITY, REL_OP.EQ, NotificationFactory.SEVERIRY_MINOR);
		Expression e4 = new Expression(e1, LOG_OP.AND,e2);
		Expression e = new Expression(e3, LOG_OP.AND,e4);
		return getCount(e);
	}


}
