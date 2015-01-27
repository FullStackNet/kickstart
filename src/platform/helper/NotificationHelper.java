package platform.helper;

import java.util.Date;
import java.util.Map;

import platform.appliances.ApplianceConstants;
import platform.event.EventManager;
import platform.events.NotificationAddedEvent;
import platform.message.Notification;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.controller;
import platform.resource.notification;
import platform.sensor.C4T_PARAMETER;
import platform.util.ApplicationException;



public class NotificationHelper extends BaseHelper {
	public NotificationHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static NotificationHelper instance;

	public static NotificationHelper getInstance() {
		if (instance == null)
			instance = new NotificationHelper();
		return instance;
	}

	NotificationHelper() {
		super(new notification());
		// TODO Auto-generated constructor stub
	}

	public notification getById(String id) {
		return (notification) super.getById(id);
	}
	public void handleDisconnected(String gatewayId, String deviceType,String deviceId) {

	}

	public void handleConnected(String gatewayId,String deviceType,String deviceId) {
	}

	public void handleApplianceIgnitionOn(appliance _fetchedAppliance) {
		appliance _appliance = new appliance(_fetchedAppliance.getId());
		_appliance.setIgnitionState("Y");
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void handleApplianceIgnitionOff(appliance _fetchedAppliance) {
		appliance _appliance = new appliance(_fetchedAppliance.getId());
		_appliance.setIgnitionState("N");
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void handleApplianceStopped(appliance _fetchedAppliance,long alertTime,Map<String, Object> map) {
		if ("N".equals(_fetchedAppliance.getState()))
			return;
		appliance _appliance = new appliance(_fetchedAppliance.getId());
		_appliance.setState("N");
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (_fetchedAppliance.getStart_time() != null) {
			Appliance_running_logHelper.getInstance().AddStopRecord(_fetchedAppliance.getId(), _fetchedAppliance.getStart_time(),alertTime);
			if (ApplianceConstants.APPLIANCE_TYPE_DG.equals(_fetchedAppliance.getType())) {
				Double fuel_quantity = (Double)map.get(C4T_PARAMETER.FUEL_QUANTITY.toString());
				Double fuel_consumption = (Double)map.get(C4T_PARAMETER.FUEL_CONSUMPTION.toString());
				if (fuel_consumption == null) {
					fuel_consumption = 0.0;
				}
				if (fuel_quantity != null) {
					Appliance_running_logHelper.getInstance().updateFuelStopRecord(_fetchedAppliance.getId(), _fetchedAppliance.getStart_time(),alertTime, fuel_quantity, fuel_consumption);
				}
			}
		}
	}

	public notification addNotificationFromController(String controllerId,
			String alertId, int severity,  Map<String, Object> data, Date alertTime)  {
		controller controller_object = (controller)ControllerHelper.getInstance().getById(controllerId);
		if (controller_object != null) {
			return addNotificationFromController(controller_object,alertId,severity,data,alertTime);
		}
		return null;
	}

	public notification addNotificationFromController(controller controller_object,
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
		return addNotification(customer_id, site_id, gateway_Id, controller_object.getId(), deviceType, deviceName, 
				applianceId, applianceName, assetId, 
				alertId, severity, data, alertTime);
	}
	
	public void handleApplianceStarted(appliance _fetchedAppliance, long alertTime,Map<String, Object> map) {
		if ("Y".equals(_fetchedAppliance.getState()))
			return;

		appliance _appliance = new appliance(_fetchedAppliance.getId());
		_appliance.setState("Y");
		_appliance.setStart_time(alertTime);
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Appliance_running_logHelper.getInstance().AddStartRecord(_fetchedAppliance.getId(), alertTime);
		if (ApplianceConstants.APPLIANCE_TYPE_DG.equals(_fetchedAppliance.getType())) {
			Double fuel_quantity = (Double)map.get(C4T_PARAMETER.FUEL_QUANTITY.toString());
			if (fuel_quantity != null) {
				Appliance_running_logHelper.getInstance().updateFuelStartRecord(_fetchedAppliance.getId(), alertTime, fuel_quantity);
			}
		}
	}

	public notification addNotificationFromAppliance(String applianceId,
			String notificationId, int severity, Map<String, Object> data, Date alertTime)  {
		appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
		return addNotificationFromAppliance(_appliance, notificationId, severity, data, alertTime);
	}
	
	public notification addNotificationFromAppliance(appliance _appliance,
			String notificationId, int severity, Map<String, Object> data, Date alertTime)  {
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
		
		notification _notification = addNotification(customer_id, site_id, gateway_Id, applianceId, deviceType, deviceName, 
				applianceId, applianceName, assetId, 
				notificationId, severity, data, alertTime);
		
		if (NotificationFactory.NOTIFICATION_IGNITION_ON.equals(notificationId)) {
			handleApplianceIgnitionOn(_appliance);
		}

		if (NotificationFactory.NOTIFICATION_IGNITION_OFF.equals(notificationId)) {
			handleApplianceIgnitionOff(_appliance);
		}

		if (NotificationFactory.NOTIFICATION_STARTED.equals(notificationId)) {
			handleApplianceStarted(_appliance,alertTime.getTime(),data);
		}

		if (NotificationFactory.NOTIFICATION_STOPPED.equals(notificationId)) {
			handleApplianceStopped(_appliance,alertTime.getTime(),data);
		}
		return _notification;
	}
	
	public notification addNotificationNonAppliance(String notificationId,
			int severity, Map<String, Object> data, Date alertTime)  {
		String site_id = "";
		String deviceType = "";
		String deviceName = "";
		String customer_id = "";
		String gateway_Id = "";
		String applianceId= "";
		String applianceName= "";
		String assetId= "";
		
		return addNotification(customer_id, site_id, gateway_Id, applianceId, deviceType, deviceName, 
				applianceId, applianceName, assetId, 
				notificationId, severity, data, alertTime);
	}

	notification addNotification(String customer_id,String site_id, 
			String gateway_id, String deviceId,String deviceType,String deviceName, 
			String applianceId,String applianceName,String assetId, 
			String notificationId, int severity, Map<String, Object> data, Date alertTime)  {
	
		if (applianceId != null) {
			appliance appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
			if (appliance != null) {
				applianceName = appliance.getName();
				if (appliance.getAsset_id() != null) {
					assetId = appliance.getAsset_id();
				}
			}
		}
		notification _notification = new notification();
		_notification.setSite_id(site_id);
		_notification.setCustomer_id(customer_id);
		_notification.setDevice_id(deviceId);
		_notification.setDevice_name(deviceName);
		_notification.setDevice_type(deviceType);
		_notification.setNotification_id(notificationId);
		_notification.setSeverity(severity);
		_notification.setNotification_data(data);
		_notification.setGateway_id(gateway_id);
		_notification.setApplinace_id(applianceId);
		_notification.setAsset_id(assetId);
		_notification.setApplinace_name(applianceName);
		_notification.setNotification_time(alertTime.getTime());
		try {
			add(_notification);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Notification notificationMessage = new Notification();
		notificationMessage.setId(_notification.getId());
		EventManager.getInstance().triggerEvent(this, new NotificationAddedEvent(_notification.getId()));
		return _notification;
	}
}
