/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

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
public abstract class Basevehicle_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> routes = null;
	private ArrayList<Object> stopages = null;
	private ArrayList<Object> notify_users = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ROUTES = "routes";
	public static String FIELD_STOPAGES = "stopages";
	public static String FIELD_NOTIFY_USERS = "notify_users";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("vehicle_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field routesField = new Field("routes", "Array");
		metaData.addField(routesField);

		Field stopagesField = new Field("stopages", "Array");
		metaData.addField(stopagesField);

		Field notify_usersField = new Field("notify_users", "Array");
		metaData.addField(notify_usersField);


		metaData.setTableName("vehicle_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Basevehicle_map() {}

	public Basevehicle_map(Basevehicle_map obj) {
		this.id = obj.id;
		this.routes = obj.routes;
		this.stopages = obj.stopages;
		this.notify_users = obj.notify_users;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(routes != null)
			map.put("routes", routes);
		if(stopages != null)
			map.put("stopages", stopages);
		if(notify_users != null)
			map.put("notify_users", notify_users);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(routes != null)
			map.put("routes", routes);
		if(stopages != null)
			map.put("stopages", stopages);
		if(notify_users != null)
			map.put("notify_users", notify_users);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		routes = (ArrayList<Object>) map.get("routes");
		stopages = (ArrayList<Object>) map.get("stopages");
		notify_users = (ArrayList<Object>) map.get("notify_users");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		routes = (ArrayList<Object>) map.get("routes");
		stopages = (ArrayList<Object>) map.get("stopages");
		notify_users = (ArrayList<Object>) map.get("notify_users");
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

	public ArrayList<Object> getRoutes() {
		return routes;
	}


	public void setRoutes(ArrayList<Object> routes) {
		this.routes = routes;
	}

	public void addRoutes(Object value) {
		if(routes == null)
			routes = new ArrayList<Object>();
		routes.add(value);
	}

	public void unSetRoutes() {
		this.routes = null;
	}

	public ArrayList<Object> getStopages() {
		return stopages;
	}


	public void setStopages(ArrayList<Object> stopages) {
		this.stopages = stopages;
	}

	public void addStopages(Object value) {
		if(stopages == null)
			stopages = new ArrayList<Object>();
		stopages.add(value);
	}

	public void unSetStopages() {
		this.stopages = null;
	}

	public ArrayList<Object> getNotify_users() {
		return notify_users;
	}


	public void setNotify_users(ArrayList<Object> notify_users) {
		this.notify_users = notify_users;
	}

	public void addNotify_users(Object value) {
		if(notify_users == null)
			notify_users = new ArrayList<Object>();
		notify_users.add(value);
	}

	public void unSetNotify_users() {
		this.notify_users = null;
	}
	public String getCluster() {
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}