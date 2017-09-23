package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.resource.BaseResource;
import platform.resource.alert;
import platform.resource.appliance_map;
import platform.resource.notification;
import platform.util.ApplicationException;


public class Appliance_mapHelper extends BaseHelper {
	
	public Appliance_mapHelper() {
		super(new appliance_map());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_mapHelper instance;
	
	public static Appliance_mapHelper getInstance() {
		if (instance == null)
			instance = new Appliance_mapHelper();
		return instance;
	}
	
	public void addAdmin(String applianceId,String adminId) throws ApplicationException {
		appliance_map _map = new appliance_map();
		_map.setId(applianceId);
		_map.addAdmins(adminId);
		AddOrUpdate(_map);
	}
	
	public void addAlert(String applianceId,String alertId) throws ApplicationException {
		appliance_map _map = new appliance_map();
		_map.setId(applianceId);
		_map.addAlerts(alertId);
		AddOrUpdate(_map);
	}
	
	public void addNotification(String applianceId,String notificationId) throws ApplicationException {
		appliance_map _map = new appliance_map();
		_map.setId(applianceId);
		_map.addNotifications(notificationId);
		AddOrUpdate(_map);
	}
	
	public BaseResource[] getAdmins(String applianceId) {
		appliance_map _map = (appliance_map)getSelectedFieldsById(applianceId,
				appliance_map.FIELD_ADMINS);
		if ((_map == null) || (_map.getAdmins() == null))
			return null;
		return UserHelper.getInstance().getById(_map.getAdmins().toArray(new String[_map.getAdmins().size()]),null);
	}
	
	public BaseResource[] getAlertArray(String applianceId) {
		appliance_map _map = (appliance_map)getSelectedFieldsById(applianceId,appliance_map.FIELD_ALERTS);
		if ((_map == null) || (_map.getAlerts() == null))
			return null;
		return AlertHelper.getInstance().getArrayById(_map.getAlerts().toArray(new String[_map.getAlerts().size()]),
				new String[]{alert.FIELD_ALERT_TIME+" DESC"});
	}
	
	public BaseResource[] getNotificationArray(String applianceId) {
		appliance_map _map = (appliance_map)getSelectedFieldsById(applianceId,appliance_map.FIELD_NOTIFICATIONS);
		if ((_map == null) || (_map.getNotifications() == null))
			return null;
		return NotificationHelper.getInstance().getArrayById(_map.getNotifications().toArray(new String[_map.getNotifications().size()]),
				new String[]{notification.FIELD_NOTIFICATION_TIME+" DESC"});
	}
	
	
	
	public ArrayList<Map<String, Object>> getAlertsListMap(String applianceId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		appliance_map _map = (appliance_map)getSelectedFieldsById(applianceId,
				appliance_map.FIELD_ALERTS);
		if ((_map == null) || (_map.getAlerts() == null))
			return list;
		return AlertHelper.getInstance().getListMapById(_map.getAlerts().toArray(new String[_map.getAlerts().size()]),
				new String[]{alert.FIELD_ALERT_TIME+ " DESC"});
	}
	
	public ArrayList<Map<String, Object>> getNotificationsListMap(String applianceId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		appliance_map _map = (appliance_map)getSelectedFieldsById(applianceId,
				appliance_map.FIELD_NOTIFICATIONS);
		if ((_map == null) || (_map.getNotifications() == null))
			return list;
		return NotificationHelper.getInstance().getListMapById(_map.getNotifications().toArray(new String[_map.getNotifications().size()]),
				new String[]{notification.FIELD_NOTIFICATION_TIME+" DESC"});
	}
}
