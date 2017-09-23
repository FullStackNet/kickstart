package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.resource.appliance;
import platform.resource.appliance_map;
import platform.resource.c4t_object;
import platform.resource.location;
import platform.resource.notification;
import platform.resource.user_map;
import platform.util.ApplicationException;
import platform.util.Util;


public class User_mapHelper extends BaseHelper {
	
	public User_mapHelper() {
		super(new user_map());
		// TODO Auto-generated constructor stub
	}
	private static User_mapHelper instance;
	
	public static User_mapHelper getInstance() {
		if (instance == null)
			instance = new User_mapHelper();
		return instance;
	}
	
	public void addAppliance(String userId,String applianceId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addAppliances(applianceId);
		AddOrUpdate(_user_map);
	}
	
	public void addLocation(String userId,String locationId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addLocations(locationId);
		AddOrUpdate(_user_map);
	}
	
	public void removeLocation(String userId,String locationId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addLocations(locationId);
		unset(_user_map);
	}
	
	public void addCommunity(String userId,String communityId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addCommunities(communityId);
		AddOrUpdate(_user_map);
	}
	
	public void removeCommunity(String userId,String communityId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addCommunities(communityId);
		unset(_user_map);
	}
	
	public void addAlert(String userId,String alertId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addAlerts(alertId);
		_user_map.addRecent_alerts(alertId);
		AddOrUpdate(_user_map);
	}
	
	public void addNotification(String userId,String notificationId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addNotifications(notificationId);
		_user_map.addRecent_notifications(notificationId);
		AddOrUpdate(_user_map);
	}
	
	public void resetRecentNotification(String userId) throws ApplicationException {
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_RECENT_NOTIFICATIONS);
		if ((_user_map == null)  ||  (_user_map.getRecent_notifications() == null))
			return;
		for(int i =0 ; i < _user_map.getRecent_notifications().size(); i++) {
			user_map __user_map = new user_map();
			__user_map.setId(userId);
			__user_map.addRecent_notifications(_user_map.getRecent_notifications().get(i));
			unset(__user_map);
		}
	}
	
	public void resetRecentAlerts(String userId) throws ApplicationException {
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_RECENT_ALERTS);
		if ((_user_map == null)  ||  (_user_map.getRecent_alerts() == null))
			return;
		user_map __user_map = new user_map();
		__user_map.setId(userId);
		__user_map.setRecent_alerts(_user_map.getRecent_alerts());
		unset(__user_map);
	}
	
	public void addInvite(String userId,String inviteId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addInvites(inviteId);
		AddOrUpdate(_user_map);
	}
	
	public void addDevice(String userId,String deviceId) throws ApplicationException {
		user_map _user_map = new user_map();
		_user_map.setId(userId);
		_user_map.addDevices(deviceId);
		AddOrUpdate(_user_map);
	}
	
	public ArrayList<BaseResource> getApplinaces(String userId) {
		ArrayList<BaseResource> appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		return ApplianceHelper.getInstance().getListById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null);
	}

	public BaseResource[] getApplinaceResources(String userId) {
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return null;
		return ApplianceHelper.getInstance().getById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null);
	}
	
	public int  getRecentNotificationCount(String userId) {
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_RECENT_NOTIFICATIONS);
		if ((_user_map == null)  ||  (_user_map.getRecent_notifications() == null))
			return 0;
		return _user_map.getRecent_notifications().size();
	}
	
	public int  getRecentAlertCount(String userId) {
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_RECENT_ALERTS);
		if ((_user_map == null)  ||  (_user_map.getRecent_alerts() == null))
			return 0;
		return _user_map.getRecent_alerts().size();
	}
	
	
	public BaseResource[] getApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null);
	}
	
	public BaseResource[] getRunningApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_STATE, REL_OP.EQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}
	
	public BaseResource[] getLowFuelApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_LOWFUELSTATE, REL_OP.EQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}

	public BaseResource[] getHighCoolantTempApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_HIGH_COOLANT_TEMPERATURE, REL_OP.EQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}

	public BaseResource[] getHighWaterTempApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_HIGH_DG_WATER_TEMPERATURE, REL_OP.EQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}
	
	public BaseResource[] getHighCanopyTempApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_HIGH_CANOPY_TEMPERATURE, REL_OP.EQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}
	public BaseResource[] getNotRunningApplinacesArray(String userId) {
		BaseResource[] appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		Expression  e = new Expression(appliance.FIELD_STATE, REL_OP.NEQ, "Y");
		return ApplianceHelper.getInstance().getArrayById(_user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]),null, e);
	}
	public ArrayList<Map<String, Object>> getApplinaces(String userId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>>  appliances = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null)  ||  (_user_map.getAppliances() == null))
			return appliances;
		String[] ids = _user_map.getAppliances().toArray(new String[_user_map.getAppliances().size()]);
		return ApplianceHelper.getInstance().getByJoining(ids, joinFields,null);
	}

	public ArrayList<Map<String, Object>> getDevices(String userId,ArrayList<JoinField> joinFields) {
		HelperFactory.getInstance().register(DeviceHelper.getInstance());
		ArrayList<Map<String, Object>>  devices = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_DEVICES);
		if ((_user_map == null) || _user_map.getDevices()== null)
			return devices;
		String[] ids = _user_map.getDevices().toArray(new String[_user_map.getDevices().size()]);
		return DeviceHelper.getInstance().getByJoining(ids, joinFields,null);
	}
	
	public BaseResource getApplianace(String userId,String applianceId) {
		BaseResource appliance = null;
		user_map _user_map = (user_map)getSelectedFieldsById(userId, user_map.FIELD_APPLIANCES);
		if ((_user_map == null) || _user_map.getAppliances() == null)
			return appliance;
		for(int i=0; i < _user_map.getAppliances().size(); i++) {
			String id = (String) _user_map.getAppliances().get(i);
			if (id == null) continue;
			if ((id != null ) && id.equals(applianceId)) {
				return ApplianceHelper.getInstance().getById(applianceId);
			}
		}
		return null;
	}

	public BaseResource[] getAlertArray(String userId) {
		user_map _map = (user_map)getSelectedFieldsById(userId,appliance_map.FIELD_ALERTS);
		if ((_map == null) || (_map.getAlerts() == null))
			return null;
		return AlertHelper.getInstance().getArrayById(_map.getAlerts().toArray(new String[_map.getAlerts().size()]),
				new String[]{alert.FIELD_ALERT_TIME+" DESC"});
	}
	
	public BaseResource[] getNotificationArray(String userId) {
		user_map _map = (user_map)getSelectedFieldsById(userId,appliance_map.FIELD_NOTIFICATIONS);
		if ((_map == null) || (_map.getNotifications() == null))
			return null;
		BaseResource[] resources =   NotificationHelper.getInstance().getArrayById(_map.getNotifications().toArray(new String[_map.getNotifications().size()]),
				new String[]{notification.FIELD_NOTIFICATION_TIME+" DESC"});
		if (Util.isEmpty(resources)) 
			return resources;
		ArrayList<notification> list = new ArrayList<notification>();
		for(int i=0 ; i < 25; i++) {
			list.add((notification)resources[i]);
		}
		return list.toArray(new notification[list.size()]);		
	}
	
	public BaseResource[] getInviteArray(String userId) {
		user_map _map = (user_map)getSelectedFieldsById(userId,user_map.FIELD_INVITES);
		if ((_map == null) || (_map.getInvites() == null))
			return null;
		return InviteHelper.getInstance().getArrayById(_map.getInvites().toArray(new String[_map.getInvites().size()]), null);
	}
	
	public ArrayList<Map<String, Object>> getAlertsListMap(String applianceId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(applianceId,
				appliance_map.FIELD_ALERTS);
		if ((_map == null) || (_map.getAlerts() == null))
			return list;
		return AlertHelper.getInstance().getListMapById(_map.getAlerts().toArray(new String[_map.getAlerts().size()]),
				new String[]{alert.FIELD_ALERT_TIME+" DESC"});
	}
	
	public ArrayList<Map<String, Object>> getNotificationsListMap(String applianceId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(applianceId,
				appliance_map.FIELD_NOTIFICATIONS);
		if ((_map == null) || (_map.getNotifications() == null))
			return list;
		return NotificationHelper.getInstance().getListMapById(_map.getNotifications().toArray(new String[_map.getNotifications().size()]),
				new String[]{notification.FIELD_NOTIFICATION_TIME+" DESC"});
	}
	
	public String[] getLocationIds(String user_id) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_LOCATIONS);
		if ((_map == null) || (_map.getLocations() == null))
			return null;
		return _map.getLocations().toArray(new String[_map.getLocations().size()]);
	}
	
	public String[] getCommunityIds(String user_id) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_COMMUNITIES);
		if ((_map == null) || (_map.getLocations() == null))
			return null;
		return _map.getCommunities().toArray(new String[_map.getCommunities().size()]);
	}
	
	public ArrayList<Map<String, Object>> getLocationListMap(String user_id) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_LOCATIONS);
		if ((_map == null) || (_map.getLocations() == null))
			return list;
		return LocationHelper.getInstance().getListMapById(_map.getLocations().toArray(new String[_map.getLocations().size()]),
				new String[]{location.FIELD_NAME});
	}
	
	public BaseResource[] getLocations(String user_id) {
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_LOCATIONS);
		if ((_map == null) || (_map.getLocations() == null))
			return null;
		return LocationHelper.getInstance().getById(_map.getLocations().toArray(new String[_map.getLocations().size()]),
				new String[]{location.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getCommunityListMap(String user_id) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_LOCATIONS);
		if ((_map == null) || (_map.getLocations() == null))
			return list;
		return LocationHelper.getInstance().getListMapById(_map.getLocations().toArray(new String[_map.getLocations().size()]),
				new String[]{location.FIELD_NAME});
	}
	
	public boolean isCommunityAdmin(String user_id,String communityId) {
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_COMMUNITIES);
		if ((_map == null) || (_map.getCommunities() == null))
			return false;
		for(Object _communityId : _map.getCommunities()) {
			if (communityId.equals(_communityId))
				return true;
		}
		return false;
	}
	
	public BaseResource[] getCommunities(String user_id) {
		user_map _map = (user_map)getSelectedFieldsById(user_id,
				user_map.FIELD_COMMUNITIES);
		if ((_map == null) || (_map.getCommunities() == null))
			return null;
		return C4t_objectHelper.getInstance().getById(_map.getCommunities().toArray(new String[_map.getCommunities().size()]),
				new String[]{c4t_object.FIELD_NAME});
	}
}
