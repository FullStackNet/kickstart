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
	private ArrayList<Object> stopages = null;
	private ArrayList<Object> users = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STOPAGES = "stopages";
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

		Field stopagesField = new Field("stopages", "Array");
		metaData.addField(stopagesField);

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);


		metaData.setTableName("route_map");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_map() {}

	public Baseroute_map(Baseroute_map obj) {
		this.id = obj.id;
		this.stopages = obj.stopages;
		this.users = obj.users;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(stopages != null)
			map.put("stopages", stopages);
		if(users != null)
			map.put("users", users);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(stopages != null)
			map.put("stopages", stopages);
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
		stopages = (ArrayList<Object>) map.get("stopages");
		users = (ArrayList<Object>) map.get("users");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		stopages = (ArrayList<Object>) map.get("stopages");
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