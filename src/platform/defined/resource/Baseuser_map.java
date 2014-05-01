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
	private ArrayList<Object> appliances = null;
	private ArrayList<Object> devices = null;
	private ArrayList<Object> alerts = null;
	private ArrayList<Object> notifications = null;
	private ArrayList<Object> invites = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLICATIONS = "applications";
	public static String FIELD_APPLIANCES = "appliances";
	public static String FIELD_DEVICES = "devices";
	public static String FIELD_ALERTS = "alerts";
	public static String FIELD_NOTIFICATIONS = "notifications";
	public static String FIELD_INVITES = "invites";

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

		Field invitesField = new Field("invites", "Array");
		metaData.addField(invitesField);


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
		this.invites = obj.invites;
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
		if(invites != null)
			map.put("invites", invites);
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
		if(invites != null)
			map.put("invites", invites);
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
		appliances = (ArrayList<Object>) map.get("appliances");
		devices = (ArrayList<Object>) map.get("devices");
		alerts = (ArrayList<Object>) map.get("alerts");
		notifications = (ArrayList<Object>) map.get("notifications");
		invites = (ArrayList<Object>) map.get("invites");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		applications = (Map<String, String>) map.get("applications");
		appliances = (ArrayList<Object>) map.get("appliances");
		devices = (ArrayList<Object>) map.get("devices");
		alerts = (ArrayList<Object>) map.get("alerts");
		notifications = (ArrayList<Object>) map.get("notifications");
		invites = (ArrayList<Object>) map.get("invites");
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

	public ArrayList<Object> getAppliances() {
		return appliances;
	}


	public void setAppliances(ArrayList<Object> appliances) {
		this.appliances = appliances;
	}

	public void addAppliances(Object value) {
		if(appliances == null)
			appliances = new ArrayList<Object>();
		appliances.add(value);
	}

	public void unSetAppliances() {
		this.appliances = null;
	}

	public ArrayList<Object> getDevices() {
		return devices;
	}


	public void setDevices(ArrayList<Object> devices) {
		this.devices = devices;
	}

	public void addDevices(Object value) {
		if(devices == null)
			devices = new ArrayList<Object>();
		devices.add(value);
	}

	public void unSetDevices() {
		this.devices = null;
	}

	public ArrayList<Object> getAlerts() {
		return alerts;
	}


	public void setAlerts(ArrayList<Object> alerts) {
		this.alerts = alerts;
	}

	public void addAlerts(Object value) {
		if(alerts == null)
			alerts = new ArrayList<Object>();
		alerts.add(value);
	}

	public void unSetAlerts() {
		this.alerts = null;
	}

	public ArrayList<Object> getNotifications() {
		return notifications;
	}


	public void setNotifications(ArrayList<Object> notifications) {
		this.notifications = notifications;
	}

	public void addNotifications(Object value) {
		if(notifications == null)
			notifications = new ArrayList<Object>();
		notifications.add(value);
	}

	public void unSetNotifications() {
		this.notifications = null;
	}

	public ArrayList<Object> getInvites() {
		return invites;
	}


	public void setInvites(ArrayList<Object> invites) {
		this.invites = invites;
	}

	public void addInvites(Object value) {
		if(invites == null)
			invites = new ArrayList<Object>();
		invites.add(value);
	}

	public void unSetInvites() {
		this.invites = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}