/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

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
public abstract class Baseroute_stopage extends BaseResource {
	private String id = null;
	private String name = null;
	private String customer_id = null;
	private String user_id = null;
	private String route_id = null;
	private String stopage_id = null;
	private Integer stopage_order = null;
	private Double distance_from_previous_stop = null;
	private Integer time_from_previous_stop = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_STOPAGE_ORDER = "stopage_order";
	public static String FIELD_DISTANCE_FROM_PREVIOUS_STOP = "distance_from_previous_stop";
	public static String FIELD_TIME_FROM_PREVIOUS_STOP = "time_from_previous_stop";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route_stopage");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setIndexed(true);
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field stopage_orderField = new Field("stopage_order", "int");
		metaData.addField(stopage_orderField);

		Field distance_from_previous_stopField = new Field("distance_from_previous_stop", "double");
		metaData.addField(distance_from_previous_stopField);

		Field time_from_previous_stopField = new Field("time_from_previous_stop", "int");
		metaData.addField(time_from_previous_stopField);


		metaData.setTableName("route_stopage");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute_stopage() {}

	public Baseroute_stopage(Baseroute_stopage obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.route_id = obj.route_id;
		this.stopage_id = obj.stopage_id;
		this.stopage_order = obj.stopage_order;
		this.distance_from_previous_stop = obj.distance_from_previous_stop;
		this.time_from_previous_stop = obj.time_from_previous_stop;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		if(distance_from_previous_stop != null)
			map.put("distance_from_previous_stop", distance_from_previous_stop);
		if(time_from_previous_stop != null)
			map.put("time_from_previous_stop", time_from_previous_stop);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateName(add))
			map.put("name", name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(stopage_order != null)
			map.put("stopage_order", stopage_order);
		if(distance_from_previous_stop != null)
			map.put("distance_from_previous_stop", distance_from_previous_stop);
		if(time_from_previous_stop != null)
			map.put("time_from_previous_stop", time_from_previous_stop);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		route_id = (String) map.get("route_id");
		stopage_id = (String) map.get("stopage_id");
		stopage_order = (Integer) map.get("stopage_order");
		distance_from_previous_stop = (Double) map.get("distance_from_previous_stop");
		time_from_previous_stop = (Integer) map.get("time_from_previous_stop");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object stopage_orderObj = map.get("stopage_order");
		if(stopage_orderObj != null)
			stopage_order = new Integer(stopage_orderObj.toString());

		Object distance_from_previous_stopObj = map.get("distance_from_previous_stop");
		if(distance_from_previous_stopObj != null)
			distance_from_previous_stop = new Double(distance_from_previous_stopObj.toString());

		Object time_from_previous_stopObj = map.get("time_from_previous_stop");
		if(time_from_previous_stopObj != null)
			time_from_previous_stop = new Integer(time_from_previous_stopObj.toString());

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

	public String getName() {
		return name;
	}

	public String getNameEx() {
		return name != null ? name : "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void unSetName() {
		this.name = null;
	}

	public boolean validateName(boolean add) throws ApplicationException {
		if(add && name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[name]");
		return name != null;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_idEx() {
		return customer_id != null ? customer_id : "";
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public void unSetCustomer_id() {
		this.customer_id = null;
	}

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getRoute_id() {
		return route_id;
	}

	public String getRoute_idEx() {
		return route_id != null ? route_id : "";
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public void unSetRoute_id() {
		this.route_id = null;
	}

	public String getStopage_id() {
		return stopage_id;
	}

	public String getStopage_idEx() {
		return stopage_id != null ? stopage_id : "";
	}

	public void setStopage_id(String stopage_id) {
		this.stopage_id = stopage_id;
	}

	public void unSetStopage_id() {
		this.stopage_id = null;
	}

	public Integer getStopage_order() {
		return stopage_order;
	}

	public int getStopage_orderEx() {
		return stopage_order != null ? stopage_order : 0;
	}

	public void setStopage_order(int stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void setStopage_order(Integer stopage_order) {
		this.stopage_order = stopage_order;
	}

	public void unSetStopage_order() {
		this.stopage_order = null;
	}

	public Double getDistance_from_previous_stop() {
		return distance_from_previous_stop;
	}

	public double getDistance_from_previous_stopEx() {
		return distance_from_previous_stop != null ? distance_from_previous_stop : 0;
	}

	public void setDistance_from_previous_stop(double distance_from_previous_stop) {
		this.distance_from_previous_stop = distance_from_previous_stop;
	}

	public void setDistance_from_previous_stop(Double distance_from_previous_stop) {
		this.distance_from_previous_stop = distance_from_previous_stop;
	}

	public void unSetDistance_from_previous_stop() {
		this.distance_from_previous_stop = null;
	}

	public Integer getTime_from_previous_stop() {
		return time_from_previous_stop;
	}

	public int getTime_from_previous_stopEx() {
		return time_from_previous_stop != null ? time_from_previous_stop : 0;
	}

	public void setTime_from_previous_stop(int time_from_previous_stop) {
		this.time_from_previous_stop = time_from_previous_stop;
	}

	public void setTime_from_previous_stop(Integer time_from_previous_stop) {
		this.time_from_previous_stop = time_from_previous_stop;
	}

	public void unSetTime_from_previous_stop() {
		this.time_from_previous_stop = null;
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}