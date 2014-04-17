/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseappliance_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> admins = null;
	private ArrayList<Object> users = null;
	private ArrayList<Object> alerts = null;
	private ArrayList<Object> notifications = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ADMINS = "admins";
	public static String FIELD_USERS = "users";
	public static String FIELD_ALERTS = "alerts";
	public static String FIELD_NOTIFICATIONS = "notifications";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field adminsField = new Field("admins", "Array");
		metaData.addField(adminsField);

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);

		Field alertsField = new Field("alerts", "Array");
		metaData.addField(alertsField);

		Field notificationsField = new Field("notifications", "Array");
		metaData.addField(notificationsField);


		metaData.setTableName("appliance_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_map() {}

	public Baseappliance_map(Baseappliance_map obj) {
		this.id = obj.id;
		this.admins = obj.admins;
		this.users = obj.users;
		this.alerts = obj.alerts;
		this.notifications = obj.notifications;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(admins != null)
			map.put("admins", admins);
		if(users != null)
			map.put("users", users);
		if(alerts != null)
			map.put("alerts", alerts);
		if(notifications != null)
			map.put("notifications", notifications);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(admins != null)
			map.put("admins", admins);
		if(users != null)
			map.put("users", users);
		if(alerts != null)
			map.put("alerts", alerts);
		if(notifications != null)
			map.put("notifications", notifications);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		admins = (ArrayList<Object>) map.get("admins");
		users = (ArrayList<Object>) map.get("users");
		alerts = (ArrayList<Object>) map.get("alerts");
		notifications = (ArrayList<Object>) map.get("notifications");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		admins = (ArrayList<Object>) map.get("admins");
		users = (ArrayList<Object>) map.get("users");
		alerts = (ArrayList<Object>) map.get("alerts");
		notifications = (ArrayList<Object>) map.get("notifications");
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

	public ArrayList<Object> getAdmins() {
		return admins;
	}


	public void setAdmins(ArrayList<Object> admins) {
		this.admins = admins;
	}

	public void addAdmins(Object value) {
		if(admins == null)
			admins = new ArrayList<Object>();
		admins.add(value);
	}

	public void unSetAdmins() {
		this.admins = null;
	}

	public ArrayList<Object> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<Object> users) {
		this.users = users;
	}

	public void addUsers(Object value) {
		if(users == null)
			users = new ArrayList<Object>();
		users.add(value);
	}

	public void unSetUsers() {
		this.users = null;
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
	public String getCluster() {
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}