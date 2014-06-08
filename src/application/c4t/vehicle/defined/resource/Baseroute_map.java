/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseroute_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> users = null;
	private Map<String, Object> start_points = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USERS = "users";
	public static String FIELD_START_POINTS = "start_points";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);

		Field start_pointsField = new Field("start_points", "Map");
		start_pointsField.setValueType("Object");
		metaData.addField(start_pointsField);


		metaData.setTableName("route_map");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_map() {}

	public Baseroute_map(Baseroute_map obj) {
		this.id = obj.id;
		this.users = obj.users;
		this.start_points = obj.start_points;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(users != null)
			map.put("users", users);
		if(start_points != null)
			map.put("start_points", start_points);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(users != null)
			map.put("users", users);
		if(start_points != null)
			map.put("start_points", start_points);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	@SuppressWarnings("unchecked")
	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		users = (ArrayList<Object>) map.get("users");
		start_points = (Map<String, Object>) map.get("start_points");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		users = (ArrayList<Object>) map.get("users");
		start_points = (Map<String, Object>) map.get("start_points");
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

	public Map<String, Object> getStart_points() {
		return start_points;
	}

	public Object getStart_points(String key) {
		return start_points == null ? null : start_points.get(key);
	}

	public void setStart_points(Map<String, Object> start_points) {
		this.start_points = start_points;
	}

	public void setStart_points(String key, Object value) {
		if(start_points == null)
			start_points = new HashMap<String, Object>();
		start_points.put(key, value);
	}

	public void unSetStart_points() {
		this.start_points = null;
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}