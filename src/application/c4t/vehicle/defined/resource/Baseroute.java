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
public abstract class Baseroute extends BaseResource {
	private String id = null;
	private String name = null;
	private String state = null;
	private String from_point = null;
	private String to_point = null;
	private String by_route = null;
	private String customer_id = null;
	private String user_id = null;
	private ArrayList<Object> stopages = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_STATE = "state";
	public static String FIELD_FROM_POINT = "from_point";
	public static String FIELD_TO_POINT = "to_point";
	public static String FIELD_BY_ROUTE = "by_route";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_STOPAGES = "stopages";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("route");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field from_pointField = new Field("from_point", "String");
		from_pointField.setLength(128);
		metaData.addField(from_pointField);

		Field to_pointField = new Field("to_point", "String");
		to_pointField.setLength(128);
		metaData.addField(to_pointField);

		Field by_routeField = new Field("by_route", "String");
		by_routeField.setLength(128);
		metaData.addField(by_routeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field stopagesField = new Field("stopages", "Array");
		metaData.addField(stopagesField);


		metaData.setTableName("route");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute() {}

	public Baseroute(Baseroute obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.state = obj.state;
		this.from_point = obj.from_point;
		this.to_point = obj.to_point;
		this.by_route = obj.by_route;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.stopages = obj.stopages;
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
		if(state != null)
			map.put("state", state);
		if(from_point != null)
			map.put("from_point", from_point);
		if(to_point != null)
			map.put("to_point", to_point);
		if(by_route != null)
			map.put("by_route", by_route);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(stopages != null)
			map.put("stopages", stopages);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(state != null)
			map.put("state", state);
		if(from_point != null)
			map.put("from_point", from_point);
		if(to_point != null)
			map.put("to_point", to_point);
		if(by_route != null)
			map.put("by_route", by_route);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(stopages != null)
			map.put("stopages", stopages);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		state = (String) map.get("state");
		from_point = (String) map.get("from_point");
		to_point = (String) map.get("to_point");
		by_route = (String) map.get("by_route");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		stopages = (ArrayList<Object>) map.get("stopages");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object from_pointObj = map.get("from_point");
		if(from_pointObj != null)
			from_point = from_pointObj.toString();

		Object to_pointObj = map.get("to_point");
		if(to_pointObj != null)
			to_point = to_pointObj.toString();

		Object by_routeObj = map.get("by_route");
		if(by_routeObj != null)
			by_route = by_routeObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		stopages = (ArrayList<Object>) map.get("stopages");
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

	public String getState() {
		return state;
	}

	public String getStateEx() {
		return state != null ? state : "";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getFrom_point() {
		return from_point;
	}

	public String getFrom_pointEx() {
		return from_point != null ? from_point : "";
	}

	public void setFrom_point(String from_point) {
		this.from_point = from_point;
	}

	public void unSetFrom_point() {
		this.from_point = null;
	}

	public String getTo_point() {
		return to_point;
	}

	public String getTo_pointEx() {
		return to_point != null ? to_point : "";
	}

	public void setTo_point(String to_point) {
		this.to_point = to_point;
	}

	public void unSetTo_point() {
		this.to_point = null;
	}

	public String getBy_route() {
		return by_route;
	}

	public String getBy_routeEx() {
		return by_route != null ? by_route : "";
	}

	public void setBy_route(String by_route) {
		this.by_route = by_route;
	}

	public void unSetBy_route() {
		this.by_route = null;
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
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}