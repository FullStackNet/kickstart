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
	private ArrayList<Object> users = null;
	private ArrayList<Object> students = null;
	private String appliance_id = null;
	private String driver_id = null;
	private String attendent_id = null;
	private String start_time = null;
	private String end_time = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_STATE = "state";
	public static String FIELD_FROM_POINT = "from_point";
	public static String FIELD_TO_POINT = "to_point";
	public static String FIELD_BY_ROUTE = "by_route";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_STOPAGES = "stopages";
	public static String FIELD_USERS = "users";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_ATTENDENT_ID = "attendent_id";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";

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

		Field usersField = new Field("users", "Array");
		metaData.addField(usersField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field driver_idField = new Field("driver_id", "String");
		driver_idField.setLength(128);
		metaData.addField(driver_idField);

		Field attendent_idField = new Field("attendent_id", "String");
		attendent_idField.setLength(128);
		metaData.addField(attendent_idField);

		Field start_timeField = new Field("start_time", "String");
		start_timeField.setLength(10);
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "String");
		end_timeField.setLength(10);
		metaData.addField(end_timeField);


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
		this.users = obj.users;
		this.students = obj.students;
		this.appliance_id = obj.appliance_id;
		this.driver_id = obj.driver_id;
		this.attendent_id = obj.attendent_id;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
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
		if(users != null)
			map.put("users", users);
		if(students != null)
			map.put("students", students);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(attendent_id != null)
			map.put("attendent_id", attendent_id);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
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
		if(users != null)
			map.put("users", users);
		if(students != null)
			map.put("students", students);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(attendent_id != null)
			map.put("attendent_id", attendent_id);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
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
		users = (ArrayList<Object>) map.get("users");
		students = (ArrayList<Object>) map.get("students");
		appliance_id = (String) map.get("appliance_id");
		driver_id = (String) map.get("driver_id");
		attendent_id = (String) map.get("attendent_id");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
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
		users = (ArrayList<Object>) map.get("users");
		students = (ArrayList<Object>) map.get("students");
		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object driver_idObj = map.get("driver_id");
		if(driver_idObj != null)
			driver_id = driver_idObj.toString();

		Object attendent_idObj = map.get("attendent_id");
		if(attendent_idObj != null)
			attendent_id = attendent_idObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = end_timeObj.toString();

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

	public ArrayList<Object> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Object> students) {
		this.students = students;
	}

	public void addStudents(Object value) {
		if(students == null)
			students = new ArrayList<Object>();
		students.add(value);
	}

	public void unSetStudents() {
		this.students = null;
	}

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public String getDriver_id() {
		return driver_id;
	}

	public String getDriver_idEx() {
		return driver_id != null ? driver_id : "";
	}

	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}

	public void unSetDriver_id() {
		this.driver_id = null;
	}

	public String getAttendent_id() {
		return attendent_id;
	}

	public String getAttendent_idEx() {
		return attendent_id != null ? attendent_id : "";
	}

	public void setAttendent_id(String attendent_id) {
		this.attendent_id = attendent_id;
	}

	public void unSetAttendent_id() {
		this.attendent_id = null;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getStart_timeEx() {
		return start_time != null ? start_time : "";
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void unSetStart_time() {
		this.start_time = null;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getEnd_timeEx() {
		return end_time != null ? end_time : "";
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void unSetEnd_time() {
		this.end_time = null;
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}