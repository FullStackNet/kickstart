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
	private ArrayList<Object> route_stopages = null;
	private ArrayList<Object> users = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ROUTE_STOPAGES = "route_stopages";
	public static String FIELD_USERS = "users";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field route_stopagesField = new Field("route_stopages", "Array");
		metaData.addField(route_stopagesField);

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);


		metaData.setTableName("route_map");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_map() {}

	public Baseroute_map(Baseroute_map obj) {
		this.id = obj.id;
		this.route_stopages = obj.route_stopages;
		this.users = obj.users;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(route_stopages != null)
			map.put("route_stopages", route_stopages);
		if(users != null)
			map.put("users", users);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(route_stopages != null)
			map.put("route_stopages", route_stopages);
		if(users != null)
			map.put("users", users);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		route_stopages = (ArrayList<Object>) map.get("route_stopages");
		users = (ArrayList<Object>) map.get("users");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		route_stopages = (ArrayList<Object>) map.get("route_stopages");
		users = (ArrayList<Object>) map.get("users");
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

	public ArrayList<Object> getRoute_stopages() {
		return route_stopages;
	}


	public void setRoute_stopages(ArrayList<Object> route_stopages) {
		this.route_stopages = route_stopages;
	}

	public void addRoute_stopages(Object value) {
		if(route_stopages == null)
			route_stopages = new ArrayList<Object>();
		route_stopages.add(value);
	}

	public void unSetRoute_stopages() {
		this.route_stopages = null;
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
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}