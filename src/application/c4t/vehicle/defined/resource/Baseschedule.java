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
public abstract class Baseschedule extends BaseResource {
	private String id = null;
	private String name = null;
	private String customer_id = null;
	private String user_id = null;
	private String route_id = null;
	private String appliance_id = null;
	private String driver_id = null;
	private String attendent_id = null;
	private String driver_id_1 = null;
	private String driver_id_2 = null;
	private String scheduleTime = null;
	private String start_time = null;
	private String end_time = null;
	private String mon_schedule = null;
	private String tues_schedule = null;
	private String wed_schedule = null;
	private String thurs_schedule = null;
	private String fri_schedule = null;
	private String sat_schedule = null;
	private String sun_schedule = null;
	private ArrayList<Object> stopages = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_ATTENDENT_ID = "attendent_id";
	public static String FIELD_DRIVER_ID_1 = "driver_id_1";
	public static String FIELD_DRIVER_ID_2 = "driver_id_2";
	public static String FIELD_SCHEDULETIME = "scheduleTime";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_MON_SCHEDULE = "mon_schedule";
	public static String FIELD_TUES_SCHEDULE = "tues_schedule";
	public static String FIELD_WED_SCHEDULE = "wed_schedule";
	public static String FIELD_THURS_SCHEDULE = "thurs_schedule";
	public static String FIELD_FRI_SCHEDULE = "fri_schedule";
	public static String FIELD_SAT_SCHEDULE = "sat_schedule";
	public static String FIELD_SUN_SCHEDULE = "sun_schedule";
	public static String FIELD_STOPAGES = "stopages";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("schedule");

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

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field driver_idField = new Field("driver_id", "String");
		driver_idField.setLength(128);
		metaData.addField(driver_idField);

		Field attendent_idField = new Field("attendent_id", "String");
		attendent_idField.setLength(128);
		metaData.addField(attendent_idField);

		Field driver_id_1Field = new Field("driver_id_1", "String");
		driver_id_1Field.setLength(128);
		metaData.addField(driver_id_1Field);

		Field driver_id_2Field = new Field("driver_id_2", "String");
		driver_id_2Field.setLength(128);
		metaData.addField(driver_id_2Field);

		Field scheduleTimeField = new Field("scheduleTime", "String");
		scheduleTimeField.setLength(6);
		metaData.addField(scheduleTimeField);

		Field start_timeField = new Field("start_time", "String");
		start_timeField.setLength(10);
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "String");
		end_timeField.setLength(10);
		metaData.addField(end_timeField);

		Field mon_scheduleField = new Field("mon_schedule", "String");
		mon_scheduleField.setDefaultValue("Y");
		mon_scheduleField.setLength(1);
		metaData.addField(mon_scheduleField);

		Field tues_scheduleField = new Field("tues_schedule", "String");
		tues_scheduleField.setDefaultValue("Y");
		tues_scheduleField.setLength(1);
		metaData.addField(tues_scheduleField);

		Field wed_scheduleField = new Field("wed_schedule", "String");
		wed_scheduleField.setDefaultValue("Y");
		wed_scheduleField.setLength(1);
		metaData.addField(wed_scheduleField);

		Field thurs_scheduleField = new Field("thurs_schedule", "String");
		thurs_scheduleField.setDefaultValue("Y");
		thurs_scheduleField.setLength(1);
		metaData.addField(thurs_scheduleField);

		Field fri_scheduleField = new Field("fri_schedule", "String");
		fri_scheduleField.setDefaultValue("Y");
		fri_scheduleField.setLength(1);
		metaData.addField(fri_scheduleField);

		Field sat_scheduleField = new Field("sat_schedule", "String");
		sat_scheduleField.setDefaultValue("Y");
		sat_scheduleField.setLength(1);
		metaData.addField(sat_scheduleField);

		Field sun_scheduleField = new Field("sun_schedule", "String");
		sun_scheduleField.setDefaultValue("Y");
		sun_scheduleField.setLength(1);
		metaData.addField(sun_scheduleField);

		Field stopagesField = new Field("stopages", "Array");
		metaData.addField(stopagesField);


		metaData.setTableName("schedule");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseschedule() {}

	public Baseschedule(Baseschedule obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.route_id = obj.route_id;
		this.appliance_id = obj.appliance_id;
		this.driver_id = obj.driver_id;
		this.attendent_id = obj.attendent_id;
		this.driver_id_1 = obj.driver_id_1;
		this.driver_id_2 = obj.driver_id_2;
		this.scheduleTime = obj.scheduleTime;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.mon_schedule = obj.mon_schedule;
		this.tues_schedule = obj.tues_schedule;
		this.wed_schedule = obj.wed_schedule;
		this.thurs_schedule = obj.thurs_schedule;
		this.fri_schedule = obj.fri_schedule;
		this.sat_schedule = obj.sat_schedule;
		this.sun_schedule = obj.sun_schedule;
		this.stopages = obj.stopages;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(mon_schedule == null)
			mon_schedule = "Y";
		if(tues_schedule == null)
			tues_schedule = "Y";
		if(wed_schedule == null)
			wed_schedule = "Y";
		if(thurs_schedule == null)
			thurs_schedule = "Y";
		if(fri_schedule == null)
			fri_schedule = "Y";
		if(sat_schedule == null)
			sat_schedule = "Y";
		if(sun_schedule == null)
			sun_schedule = "Y";
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
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(attendent_id != null)
			map.put("attendent_id", attendent_id);
		if(driver_id_1 != null)
			map.put("driver_id_1", driver_id_1);
		if(driver_id_2 != null)
			map.put("driver_id_2", driver_id_2);
		if(scheduleTime != null)
			map.put("scheduleTime", scheduleTime);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(mon_schedule != null)
			map.put("mon_schedule", mon_schedule);
		if(tues_schedule != null)
			map.put("tues_schedule", tues_schedule);
		if(wed_schedule != null)
			map.put("wed_schedule", wed_schedule);
		if(thurs_schedule != null)
			map.put("thurs_schedule", thurs_schedule);
		if(fri_schedule != null)
			map.put("fri_schedule", fri_schedule);
		if(sat_schedule != null)
			map.put("sat_schedule", sat_schedule);
		if(sun_schedule != null)
			map.put("sun_schedule", sun_schedule);
		if(stopages != null)
			map.put("stopages", stopages);
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
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(attendent_id != null)
			map.put("attendent_id", attendent_id);
		if(driver_id_1 != null)
			map.put("driver_id_1", driver_id_1);
		if(driver_id_2 != null)
			map.put("driver_id_2", driver_id_2);
		if(scheduleTime != null)
			map.put("scheduleTime", scheduleTime);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(mon_schedule != null)
			map.put("mon_schedule", mon_schedule);
		if(tues_schedule != null)
			map.put("tues_schedule", tues_schedule);
		if(wed_schedule != null)
			map.put("wed_schedule", wed_schedule);
		if(thurs_schedule != null)
			map.put("thurs_schedule", thurs_schedule);
		if(fri_schedule != null)
			map.put("fri_schedule", fri_schedule);
		if(sat_schedule != null)
			map.put("sat_schedule", sat_schedule);
		if(sun_schedule != null)
			map.put("sun_schedule", sun_schedule);
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
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		route_id = (String) map.get("route_id");
		appliance_id = (String) map.get("appliance_id");
		driver_id = (String) map.get("driver_id");
		attendent_id = (String) map.get("attendent_id");
		driver_id_1 = (String) map.get("driver_id_1");
		driver_id_2 = (String) map.get("driver_id_2");
		scheduleTime = (String) map.get("scheduleTime");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
		mon_schedule = (String) map.get("mon_schedule");
		tues_schedule = (String) map.get("tues_schedule");
		wed_schedule = (String) map.get("wed_schedule");
		thurs_schedule = (String) map.get("thurs_schedule");
		fri_schedule = (String) map.get("fri_schedule");
		sat_schedule = (String) map.get("sat_schedule");
		sun_schedule = (String) map.get("sun_schedule");
		stopages = (ArrayList<Object>) map.get("stopages");
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

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object driver_idObj = map.get("driver_id");
		if(driver_idObj != null)
			driver_id = driver_idObj.toString();

		Object attendent_idObj = map.get("attendent_id");
		if(attendent_idObj != null)
			attendent_id = attendent_idObj.toString();

		Object driver_id_1Obj = map.get("driver_id_1");
		if(driver_id_1Obj != null)
			driver_id_1 = driver_id_1Obj.toString();

		Object driver_id_2Obj = map.get("driver_id_2");
		if(driver_id_2Obj != null)
			driver_id_2 = driver_id_2Obj.toString();

		Object scheduleTimeObj = map.get("scheduleTime");
		if(scheduleTimeObj != null)
			scheduleTime = scheduleTimeObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = end_timeObj.toString();

		Object mon_scheduleObj = map.get("mon_schedule");
		if(mon_scheduleObj != null)
			mon_schedule = mon_scheduleObj.toString();

		Object tues_scheduleObj = map.get("tues_schedule");
		if(tues_scheduleObj != null)
			tues_schedule = tues_scheduleObj.toString();

		Object wed_scheduleObj = map.get("wed_schedule");
		if(wed_scheduleObj != null)
			wed_schedule = wed_scheduleObj.toString();

		Object thurs_scheduleObj = map.get("thurs_schedule");
		if(thurs_scheduleObj != null)
			thurs_schedule = thurs_scheduleObj.toString();

		Object fri_scheduleObj = map.get("fri_schedule");
		if(fri_scheduleObj != null)
			fri_schedule = fri_scheduleObj.toString();

		Object sat_scheduleObj = map.get("sat_schedule");
		if(sat_scheduleObj != null)
			sat_schedule = sat_scheduleObj.toString();

		Object sun_scheduleObj = map.get("sun_schedule");
		if(sun_scheduleObj != null)
			sun_schedule = sun_scheduleObj.toString();

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

	public String getDriver_id_1() {
		return driver_id_1;
	}

	public String getDriver_id_1Ex() {
		return driver_id_1 != null ? driver_id_1 : "";
	}

	public void setDriver_id_1(String driver_id_1) {
		this.driver_id_1 = driver_id_1;
	}

	public void unSetDriver_id_1() {
		this.driver_id_1 = null;
	}

	public String getDriver_id_2() {
		return driver_id_2;
	}

	public String getDriver_id_2Ex() {
		return driver_id_2 != null ? driver_id_2 : "";
	}

	public void setDriver_id_2(String driver_id_2) {
		this.driver_id_2 = driver_id_2;
	}

	public void unSetDriver_id_2() {
		this.driver_id_2 = null;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public String getScheduleTimeEx() {
		return scheduleTime != null ? scheduleTime : "";
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public void unSetScheduleTime() {
		this.scheduleTime = null;
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

	public String getMon_schedule() {
		return mon_schedule != null ? mon_schedule : "Y";
	}

	public void setMon_schedule(String mon_schedule) {
		this.mon_schedule = mon_schedule;
	}

	public void unSetMon_schedule() {
		this.mon_schedule = "Y";
	}

	public String getTues_schedule() {
		return tues_schedule != null ? tues_schedule : "Y";
	}

	public void setTues_schedule(String tues_schedule) {
		this.tues_schedule = tues_schedule;
	}

	public void unSetTues_schedule() {
		this.tues_schedule = "Y";
	}

	public String getWed_schedule() {
		return wed_schedule != null ? wed_schedule : "Y";
	}

	public void setWed_schedule(String wed_schedule) {
		this.wed_schedule = wed_schedule;
	}

	public void unSetWed_schedule() {
		this.wed_schedule = "Y";
	}

	public String getThurs_schedule() {
		return thurs_schedule != null ? thurs_schedule : "Y";
	}

	public void setThurs_schedule(String thurs_schedule) {
		this.thurs_schedule = thurs_schedule;
	}

	public void unSetThurs_schedule() {
		this.thurs_schedule = "Y";
	}

	public String getFri_schedule() {
		return fri_schedule != null ? fri_schedule : "Y";
	}

	public void setFri_schedule(String fri_schedule) {
		this.fri_schedule = fri_schedule;
	}

	public void unSetFri_schedule() {
		this.fri_schedule = "Y";
	}

	public String getSat_schedule() {
		return sat_schedule != null ? sat_schedule : "Y";
	}

	public void setSat_schedule(String sat_schedule) {
		this.sat_schedule = sat_schedule;
	}

	public void unSetSat_schedule() {
		this.sat_schedule = "Y";
	}

	public String getSun_schedule() {
		return sun_schedule != null ? sun_schedule : "Y";
	}

	public void setSun_schedule(String sun_schedule) {
		this.sun_schedule = sun_schedule;
	}

	public void unSetSun_schedule() {
		this.sun_schedule = "Y";
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