/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseuser_map extends BaseResource {
	private String id = null;
	private Map<String, String> applications = null;
	private List<Object> appliances = null;
	private List<Object> devices = null;
	private List<Object> alerts = null;
	private List<Object> notifications = null;
	private List<Object> recent_notifications = null;
	private List<Object> recent_alerts = null;
	private List<Object> invites = null;
	private List<Object> locations = null;
	private List<Object> communities = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLICATIONS = "applications";
	public static String FIELD_APPLIANCES = "appliances";
	public static String FIELD_DEVICES = "devices";
	public static String FIELD_ALERTS = "alerts";
	public static String FIELD_NOTIFICATIONS = "notifications";
	public static String FIELD_RECENT_NOTIFICATIONS = "recent_notifications";
	public static String FIELD_RECENT_ALERTS = "recent_alerts";
	public static String FIELD_INVITES = "invites";
	public static String FIELD_LOCATIONS = "locations";
	public static String FIELD_COMMUNITIES = "communities";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("user_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field applicationsField = new Field("applications", "Map");
		applicationsField.setValueType("String");
		metaData.addField(applicationsField);

		Field appliancesField = new Field("appliances", "Array");
		metaData.addField(appliancesField);

		Field devicesField = new Field("devices", "Array");
		metaData.addField(devicesField);

		Field alertsField = new Field("alerts", "Array");
		metaData.addField(alertsField);

		Field notificationsField = new Field("notifications", "Array");
		metaData.addField(notificationsField);

		Field recent_notificationsField = new Field("recent_notifications", "Array");
		metaData.addField(recent_notificationsField);

		Field recent_alertsField = new Field("recent_alerts", "Array");
		metaData.addField(recent_alertsField);

		Field invitesField = new Field("invites", "Array");
		metaData.addField(invitesField);

		Field locationsField = new Field("locations", "Array");
		metaData.addField(locationsField);

		Field communitiesField = new Field("communities", "Array");
		metaData.addField(communitiesField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("user_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseuser_map() {}

	public Baseuser_map(Baseuser_map obj) {
		this.id = obj.id;
		this.applications = obj.applications;
		this.appliances = obj.appliances;
		this.devices = obj.devices;
		this.alerts = obj.alerts;
		this.notifications = obj.notifications;
		this.recent_notifications = obj.recent_notifications;
		this.recent_alerts = obj.recent_alerts;
		this.invites = obj.invites;
		this.locations = obj.locations;
		this.communities = obj.communities;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(applications != null)
			map.put("applications", applications);
		if(appliances != null)
			map.put("appliances", appliances);
		if(devices != null)
			map.put("devices", devices);
		if(alerts != null)
			map.put("alerts", alerts);
		if(notifications != null)
			map.put("notifications", notifications);
		if(recent_notifications != null)
			map.put("recent_notifications", recent_notifications);
		if(recent_alerts != null)
			map.put("recent_alerts", recent_alerts);
		if(invites != null)
			map.put("invites", invites);
		if(locations != null)
			map.put("locations", locations);
		if(communities != null)
			map.put("communities", communities);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(applications != null)
			map.put("applications", applications);
		if(appliances != null)
			map.put("appliances", appliances);
		if(devices != null)
			map.put("devices", devices);
		if(alerts != null)
			map.put("alerts", alerts);
		if(notifications != null)
			map.put("notifications", notifications);
		if(recent_notifications != null)
			map.put("recent_notifications", recent_notifications);
		if(recent_alerts != null)
			map.put("recent_alerts", recent_alerts);
		if(invites != null)
			map.put("invites", invites);
		if(locations != null)
			map.put("locations", locations);
		if(communities != null)
			map.put("communities", communities);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	@SuppressWarnings("unchecked")
	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		applications = (Map<String, String>) map.get("applications");
		appliances = (List<Object>) map.get("appliances");
		devices = (List<Object>) map.get("devices");
		alerts = (List<Object>) map.get("alerts");
		notifications = (List<Object>) map.get("notifications");
		recent_notifications = (List<Object>) map.get("recent_notifications");
		recent_alerts = (List<Object>) map.get("recent_alerts");
		invites = (List<Object>) map.get("invites");
		locations = (List<Object>) map.get("locations");
		communities = (List<Object>) map.get("communities");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		applications = (Map<String, String>) map.get("applications");
		appliances = (List<Object>) map.get("appliances");
		devices = (List<Object>) map.get("devices");
		alerts = (List<Object>) map.get("alerts");
		notifications = (List<Object>) map.get("notifications");
		recent_notifications = (List<Object>) map.get("recent_notifications");
		recent_alerts = (List<Object>) map.get("recent_alerts");
		invites = (List<Object>) map.get("invites");
		locations = (List<Object>) map.get("locations");
		communities = (List<Object>) map.get("communities");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

	public String getId() {
		return id;
	}

	public String getIdEx() {
		return id != null ? id : "";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void unSetId() {
		this.id = null;
	}

	public boolean validateId(boolean add) throws ApplicationException {
		if(add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
	}

	public Map<String, String> getApplications() {
		return applications;
	}

	public String getApplications(String key) {
		return applications == null ? null : applications.get(key);
	}

	public void setApplications(Map<String, String> applications) {
		this.applications = applications;
	}

	public void setApplications(String key, String value) {
		if(applications == null)
			applications = new HashMap<String, String>();
		applications.put(key, value);
	}

	public void unSetApplications() {
		this.applications = null;
	}

	public List<Object> getAppliances() {
		return appliances;
	}


	public void setAppliances(List<Object> appliances) {
		this.appliances = appliances;
	}

	public void addAppliances(Object value) {
		if(appliances == null)
			appliances = new ArrayList<>();
		appliances.add(value);
	}

	public void unSetAppliances() {
		this.appliances = null;
	}

	public List<Object> getDevices() {
		return devices;
	}


	public void setDevices(List<Object> devices) {
		this.devices = devices;
	}

	public void addDevices(Object value) {
		if(devices == null)
			devices = new ArrayList<>();
		devices.add(value);
	}

	public void unSetDevices() {
		this.devices = null;
	}

	public List<Object> getAlerts() {
		return alerts;
	}


	public void setAlerts(List<Object> alerts) {
		this.alerts = alerts;
	}

	public void addAlerts(Object value) {
		if(alerts == null)
			alerts = new ArrayList<>();
		alerts.add(value);
	}

	public void unSetAlerts() {
		this.alerts = null;
	}

	public List<Object> getNotifications() {
		return notifications;
	}


	public void setNotifications(List<Object> notifications) {
		this.notifications = notifications;
	}

	public void addNotifications(Object value) {
		if(notifications == null)
			notifications = new ArrayList<>();
		notifications.add(value);
	}

	public void unSetNotifications() {
		this.notifications = null;
	}

	public List<Object> getRecent_notifications() {
		return recent_notifications;
	}


	public void setRecent_notifications(List<Object> recent_notifications) {
		this.recent_notifications = recent_notifications;
	}

	public void addRecent_notifications(Object value) {
		if(recent_notifications == null)
			recent_notifications = new ArrayList<>();
		recent_notifications.add(value);
	}

	public void unSetRecent_notifications() {
		this.recent_notifications = null;
	}

	public List<Object> getRecent_alerts() {
		return recent_alerts;
	}


	public void setRecent_alerts(List<Object> recent_alerts) {
		this.recent_alerts = recent_alerts;
	}

	public void addRecent_alerts(Object value) {
		if(recent_alerts == null)
			recent_alerts = new ArrayList<>();
		recent_alerts.add(value);
	}

	public void unSetRecent_alerts() {
		this.recent_alerts = null;
	}

	public List<Object> getInvites() {
		return invites;
	}


	public void setInvites(List<Object> invites) {
		this.invites = invites;
	}

	public void addInvites(Object value) {
		if(invites == null)
			invites = new ArrayList<>();
		invites.add(value);
	}

	public void unSetInvites() {
		this.invites = null;
	}

	public List<Object> getLocations() {
		return locations;
	}


	public void setLocations(List<Object> locations) {
		this.locations = locations;
	}

	public void addLocations(Object value) {
		if(locations == null)
			locations = new ArrayList<>();
		locations.add(value);
	}

	public void unSetLocations() {
		this.locations = null;
	}

	public List<Object> getCommunities() {
		return communities;
	}


	public void setCommunities(List<Object> communities) {
		this.communities = communities;
	}

	public void addCommunities(Object value) {
		if(communities == null)
			communities = new ArrayList<>();
		communities.add(value);
	}

	public void unSetCommunities() {
		this.communities = null;
	}

	public Map<String, Object> getExtra_data() {
		return extra_data;
	}

	public Object getExtra_data(String key) {
		return extra_data == null ? null : extra_data.get(key);
	}

	public void setExtra_data(Map<String, Object> extra_data) {
		this.extra_data = extra_data;
	}

	public void setExtra_data(String key, Object value) {
		if(extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}