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
public abstract class Baseroute_stopage_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> notify_users = null;
	private ArrayList<Object> time_taken_from_previous_stop = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NOTIFY_USERS = "notify_users";
	public static String FIELD_TIME_TAKEN_FROM_PREVIOUS_STOP = "time_taken_from_previous_stop";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_stopage_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field notify_usersField = new Field("notify_users", "Array");
		metaData.addField(notify_usersField);

		Field time_taken_from_previous_stopField = new Field("time_taken_from_previous_stop", "Array");
		metaData.addField(time_taken_from_previous_stopField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("route_stopage_map");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_stopage_map() {}

	public Baseroute_stopage_map(Baseroute_stopage_map obj) {
		this.id = obj.id;
		this.notify_users = obj.notify_users;
		this.time_taken_from_previous_stop = obj.time_taken_from_previous_stop;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(notify_users != null)
			map.put("notify_users", notify_users);
		if(time_taken_from_previous_stop != null)
			map.put("time_taken_from_previous_stop", time_taken_from_previous_stop);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(notify_users != null)
			map.put("notify_users", notify_users);
		if(time_taken_from_previous_stop != null)
			map.put("time_taken_from_previous_stop", time_taken_from_previous_stop);
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
		notify_users = (ArrayList<Object>) map.get("notify_users");
		time_taken_from_previous_stop = (ArrayList<Object>) map.get("time_taken_from_previous_stop");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		notify_users = (ArrayList<Object>) map.get("notify_users");
		time_taken_from_previous_stop = (ArrayList<Object>) map.get("time_taken_from_previous_stop");
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

	public ArrayList<Object> getTime_taken_from_previous_stop() {
		return time_taken_from_previous_stop;
	}


	public void setTime_taken_from_previous_stop(ArrayList<Object> time_taken_from_previous_stop) {
		this.time_taken_from_previous_stop = time_taken_from_previous_stop;
	}

	public void addTime_taken_from_previous_stop(Object value) {
		if(time_taken_from_previous_stop == null)
			time_taken_from_previous_stop = new ArrayList<Object>();
		time_taken_from_previous_stop.add(value);
	}

	public void unSetTime_taken_from_previous_stop() {
		this.time_taken_from_previous_stop = null;
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
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}