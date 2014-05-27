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
	private String type = null;
	private String route_no = null;
	private String state = null;
	private String from_point = null;
	private String to_point = null;
	private String by_route = null;
	private String customer_id = null;
	private String user_id = null;
	private String appliance_id = null;
	private String driver_id = null;
	private String attendent_id = null;
	private String start_time = null;
	private String end_time = null;
	private String active = null;
	private String schedule_day_monday = null;
	private String schedule_day_tuesday = null;
	private String schedule_day_wednesday = null;
	private String schedule_day_thursday = null;
	private String schedule_day_fridayday = null;
	private String schedule_day_saturday = null;
	private String schedule_day_sunday = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_ROUTE_NO = "route_no";
	public static String FIELD_STATE = "state";
	public static String FIELD_FROM_POINT = "from_point";
	public static String FIELD_TO_POINT = "to_point";
	public static String FIELD_BY_ROUTE = "by_route";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_ATTENDENT_ID = "attendent_id";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_ACTIVE = "active";
	public static String FIELD_SCHEDULE_DAY_MONDAY = "schedule_day_monday";
	public static String FIELD_SCHEDULE_DAY_TUESDAY = "schedule_day_tuesday";
	public static String FIELD_SCHEDULE_DAY_WEDNESDAY = "schedule_day_wednesday";
	public static String FIELD_SCHEDULE_DAY_THURSDAY = "schedule_day_thursday";
	public static String FIELD_SCHEDULE_DAY_FRIDAYDAY = "schedule_day_fridayday";
	public static String FIELD_SCHEDULE_DAY_SATURDAY = "schedule_day_saturday";
	public static String FIELD_SCHEDULE_DAY_SUNDAY = "schedule_day_sunday";

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

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field route_noField = new Field("route_no", "String");
		route_noField.setLength(32);
		metaData.addField(route_noField);

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
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

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

		Field activeField = new Field("active", "String");
		activeField.setLength(1);
		metaData.addField(activeField);

		Field schedule_day_mondayField = new Field("schedule_day_monday", "String");
		schedule_day_mondayField.setDefaultValue("Y");
		schedule_day_mondayField.setLength(1);
		metaData.addField(schedule_day_mondayField);

		Field schedule_day_tuesdayField = new Field("schedule_day_tuesday", "String");
		schedule_day_tuesdayField.setDefaultValue("Y");
		schedule_day_tuesdayField.setLength(1);
		metaData.addField(schedule_day_tuesdayField);

		Field schedule_day_wednesdayField = new Field("schedule_day_wednesday", "String");
		schedule_day_wednesdayField.setDefaultValue("Y");
		schedule_day_wednesdayField.setLength(1);
		metaData.addField(schedule_day_wednesdayField);

		Field schedule_day_thursdayField = new Field("schedule_day_thursday", "String");
		schedule_day_thursdayField.setDefaultValue("Y");
		schedule_day_thursdayField.setLength(1);
		metaData.addField(schedule_day_thursdayField);

		Field schedule_day_fridaydayField = new Field("schedule_day_fridayday", "String");
		schedule_day_fridaydayField.setDefaultValue("Y");
		schedule_day_fridaydayField.setLength(1);
		metaData.addField(schedule_day_fridaydayField);

		Field schedule_day_saturdayField = new Field("schedule_day_saturday", "String");
		schedule_day_saturdayField.setDefaultValue("Y");
		schedule_day_saturdayField.setLength(1);
		metaData.addField(schedule_day_saturdayField);

		Field schedule_day_sundayField = new Field("schedule_day_sunday", "String");
		schedule_day_sundayField.setDefaultValue("Y");
		schedule_day_sundayField.setLength(1);
		metaData.addField(schedule_day_sundayField);


		metaData.setTableName("route");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseroute() {}

	public Baseroute(Baseroute obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.route_no = obj.route_no;
		this.state = obj.state;
		this.from_point = obj.from_point;
		this.to_point = obj.to_point;
		this.by_route = obj.by_route;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.appliance_id = obj.appliance_id;
		this.driver_id = obj.driver_id;
		this.attendent_id = obj.attendent_id;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.active = obj.active;
		this.schedule_day_monday = obj.schedule_day_monday;
		this.schedule_day_tuesday = obj.schedule_day_tuesday;
		this.schedule_day_wednesday = obj.schedule_day_wednesday;
		this.schedule_day_thursday = obj.schedule_day_thursday;
		this.schedule_day_fridayday = obj.schedule_day_fridayday;
		this.schedule_day_saturday = obj.schedule_day_saturday;
		this.schedule_day_sunday = obj.schedule_day_sunday;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(schedule_day_monday == null)
			schedule_day_monday = "Y";
		if(schedule_day_tuesday == null)
			schedule_day_tuesday = "Y";
		if(schedule_day_wednesday == null)
			schedule_day_wednesday = "Y";
		if(schedule_day_thursday == null)
			schedule_day_thursday = "Y";
		if(schedule_day_fridayday == null)
			schedule_day_fridayday = "Y";
		if(schedule_day_saturday == null)
			schedule_day_saturday = "Y";
		if(schedule_day_sunday == null)
			schedule_day_sunday = "Y";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(route_no != null)
			map.put("route_no", route_no);
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
		if(active != null)
			map.put("active", active);
		if(schedule_day_monday != null)
			map.put("schedule_day_monday", schedule_day_monday);
		if(schedule_day_tuesday != null)
			map.put("schedule_day_tuesday", schedule_day_tuesday);
		if(schedule_day_wednesday != null)
			map.put("schedule_day_wednesday", schedule_day_wednesday);
		if(schedule_day_thursday != null)
			map.put("schedule_day_thursday", schedule_day_thursday);
		if(schedule_day_fridayday != null)
			map.put("schedule_day_fridayday", schedule_day_fridayday);
		if(schedule_day_saturday != null)
			map.put("schedule_day_saturday", schedule_day_saturday);
		if(schedule_day_sunday != null)
			map.put("schedule_day_sunday", schedule_day_sunday);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(route_no != null)
			map.put("route_no", route_no);
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
		if(active != null)
			map.put("active", active);
		if(schedule_day_monday != null)
			map.put("schedule_day_monday", schedule_day_monday);
		if(schedule_day_tuesday != null)
			map.put("schedule_day_tuesday", schedule_day_tuesday);
		if(schedule_day_wednesday != null)
			map.put("schedule_day_wednesday", schedule_day_wednesday);
		if(schedule_day_thursday != null)
			map.put("schedule_day_thursday", schedule_day_thursday);
		if(schedule_day_fridayday != null)
			map.put("schedule_day_fridayday", schedule_day_fridayday);
		if(schedule_day_saturday != null)
			map.put("schedule_day_saturday", schedule_day_saturday);
		if(schedule_day_sunday != null)
			map.put("schedule_day_sunday", schedule_day_sunday);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		type = (String) map.get("type");
		route_no = (String) map.get("route_no");
		state = (String) map.get("state");
		from_point = (String) map.get("from_point");
		to_point = (String) map.get("to_point");
		by_route = (String) map.get("by_route");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		appliance_id = (String) map.get("appliance_id");
		driver_id = (String) map.get("driver_id");
		attendent_id = (String) map.get("attendent_id");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
		active = (String) map.get("active");
		schedule_day_monday = (String) map.get("schedule_day_monday");
		schedule_day_tuesday = (String) map.get("schedule_day_tuesday");
		schedule_day_wednesday = (String) map.get("schedule_day_wednesday");
		schedule_day_thursday = (String) map.get("schedule_day_thursday");
		schedule_day_fridayday = (String) map.get("schedule_day_fridayday");
		schedule_day_saturday = (String) map.get("schedule_day_saturday");
		schedule_day_sunday = (String) map.get("schedule_day_sunday");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object route_noObj = map.get("route_no");
		if(route_noObj != null)
			route_no = route_noObj.toString();

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

		Object activeObj = map.get("active");
		if(activeObj != null)
			active = activeObj.toString();

		Object schedule_day_mondayObj = map.get("schedule_day_monday");
		if(schedule_day_mondayObj != null)
			schedule_day_monday = schedule_day_mondayObj.toString();

		Object schedule_day_tuesdayObj = map.get("schedule_day_tuesday");
		if(schedule_day_tuesdayObj != null)
			schedule_day_tuesday = schedule_day_tuesdayObj.toString();

		Object schedule_day_wednesdayObj = map.get("schedule_day_wednesday");
		if(schedule_day_wednesdayObj != null)
			schedule_day_wednesday = schedule_day_wednesdayObj.toString();

		Object schedule_day_thursdayObj = map.get("schedule_day_thursday");
		if(schedule_day_thursdayObj != null)
			schedule_day_thursday = schedule_day_thursdayObj.toString();

		Object schedule_day_fridaydayObj = map.get("schedule_day_fridayday");
		if(schedule_day_fridaydayObj != null)
			schedule_day_fridayday = schedule_day_fridaydayObj.toString();

		Object schedule_day_saturdayObj = map.get("schedule_day_saturday");
		if(schedule_day_saturdayObj != null)
			schedule_day_saturday = schedule_day_saturdayObj.toString();

		Object schedule_day_sundayObj = map.get("schedule_day_sunday");
		if(schedule_day_sundayObj != null)
			schedule_day_sunday = schedule_day_sundayObj.toString();

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

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getRoute_no() {
		return route_no;
	}

	public String getRoute_noEx() {
		return route_no != null ? route_no : "";
	}

	public void setRoute_no(String route_no) {
		this.route_no = route_no;
	}

	public void unSetRoute_no() {
		this.route_no = null;
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

	public String getActive() {
		return active;
	}

	public String getActiveEx() {
		return active != null ? active : "";
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void unSetActive() {
		this.active = null;
	}

	public String getSchedule_day_monday() {
		return schedule_day_monday != null ? schedule_day_monday : "Y";
	}

	public void setSchedule_day_monday(String schedule_day_monday) {
		this.schedule_day_monday = schedule_day_monday;
	}

	public void unSetSchedule_day_monday() {
		this.schedule_day_monday = "Y";
	}

	public String getSchedule_day_tuesday() {
		return schedule_day_tuesday != null ? schedule_day_tuesday : "Y";
	}

	public void setSchedule_day_tuesday(String schedule_day_tuesday) {
		this.schedule_day_tuesday = schedule_day_tuesday;
	}

	public void unSetSchedule_day_tuesday() {
		this.schedule_day_tuesday = "Y";
	}

	public String getSchedule_day_wednesday() {
		return schedule_day_wednesday != null ? schedule_day_wednesday : "Y";
	}

	public void setSchedule_day_wednesday(String schedule_day_wednesday) {
		this.schedule_day_wednesday = schedule_day_wednesday;
	}

	public void unSetSchedule_day_wednesday() {
		this.schedule_day_wednesday = "Y";
	}

	public String getSchedule_day_thursday() {
		return schedule_day_thursday != null ? schedule_day_thursday : "Y";
	}

	public void setSchedule_day_thursday(String schedule_day_thursday) {
		this.schedule_day_thursday = schedule_day_thursday;
	}

	public void unSetSchedule_day_thursday() {
		this.schedule_day_thursday = "Y";
	}

	public String getSchedule_day_fridayday() {
		return schedule_day_fridayday != null ? schedule_day_fridayday : "Y";
	}

	public void setSchedule_day_fridayday(String schedule_day_fridayday) {
		this.schedule_day_fridayday = schedule_day_fridayday;
	}

	public void unSetSchedule_day_fridayday() {
		this.schedule_day_fridayday = "Y";
	}

	public String getSchedule_day_saturday() {
		return schedule_day_saturday != null ? schedule_day_saturday : "Y";
	}

	public void setSchedule_day_saturday(String schedule_day_saturday) {
		this.schedule_day_saturday = schedule_day_saturday;
	}

	public void unSetSchedule_day_saturday() {
		this.schedule_day_saturday = "Y";
	}

	public String getSchedule_day_sunday() {
		return schedule_day_sunday != null ? schedule_day_sunday : "Y";
	}

	public void setSchedule_day_sunday(String schedule_day_sunday) {
		this.schedule_day_sunday = schedule_day_sunday;
	}

	public void unSetSchedule_day_sunday() {
		this.schedule_day_sunday = "Y";
	}
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}