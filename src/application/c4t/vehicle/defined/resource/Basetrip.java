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
public abstract class Basetrip extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String route_id = null;
	private String route_name = null;
	private String school_id = null;
	private String scheduled_start_time = null;
	private String scheduled_reached_time = null;
	private String start_time = null;
	private String reached_time = null;
	private String driver_id = null;
	private String driver_name = null;
	private String helper_id = null;
	private String alternate_helper_id = null;
	private Long delayed = null;
	private ArrayList<String> students = null;
	private Integer overspeed_count = null;
	private Long creation_time = null;
	private Integer sms_sent_count = null;
	private Integer sms_failed_count = null;
	private Integer email_sent_count = null;
	private Integer email_failed_count = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_ROUTE_NAME = "route_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHEDULED_START_TIME = "scheduled_start_time";
	public static String FIELD_SCHEDULED_REACHED_TIME = "scheduled_reached_time";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_REACHED_TIME = "reached_time";
	public static String FIELD_DRIVER_ID = "driver_id";
	public static String FIELD_DRIVER_NAME = "driver_name";
	public static String FIELD_HELPER_ID = "helper_id";
	public static String FIELD_ALTERNATE_HELPER_ID = "alternate_helper_id";
	public static String FIELD_DELAYED = "delayed";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_OVERSPEED_COUNT = "overspeed_count";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_SMS_SENT_COUNT = "sms_sent_count";
	public static String FIELD_SMS_FAILED_COUNT = "sms_failed_count";
	public static String FIELD_EMAIL_SENT_COUNT = "email_sent_count";
	public static String FIELD_EMAIL_FAILED_COUNT = "email_failed_count";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("trip");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field route_nameField = new Field("route_name", "String");
		route_nameField.setLength(128);
		metaData.addField(route_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field scheduled_start_timeField = new Field("scheduled_start_time", "String");
		metaData.addField(scheduled_start_timeField);

		Field scheduled_reached_timeField = new Field("scheduled_reached_time", "String");
		metaData.addField(scheduled_reached_timeField);

		Field start_timeField = new Field("start_time", "String");
		metaData.addField(start_timeField);

		Field reached_timeField = new Field("reached_time", "String");
		metaData.addField(reached_timeField);

		Field driver_idField = new Field("driver_id", "String");
		driver_idField.setLength(128);
		metaData.addField(driver_idField);

		Field driver_nameField = new Field("driver_name", "String");
		driver_nameField.setLength(128);
		metaData.addField(driver_nameField);

		Field helper_idField = new Field("helper_id", "String");
		helper_idField.setLength(128);
		metaData.addField(helper_idField);

		Field alternate_helper_idField = new Field("alternate_helper_id", "String");
		alternate_helper_idField.setLength(128);
		metaData.addField(alternate_helper_idField);

		Field delayedField = new Field("delayed", "long");
		metaData.addField(delayedField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

		Field overspeed_countField = new Field("overspeed_count", "int");
		metaData.addField(overspeed_countField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field sms_sent_countField = new Field("sms_sent_count", "int");
		metaData.addField(sms_sent_countField);

		Field sms_failed_countField = new Field("sms_failed_count", "int");
		metaData.addField(sms_failed_countField);

		Field email_sent_countField = new Field("email_sent_count", "int");
		metaData.addField(email_sent_countField);

		Field email_failed_countField = new Field("email_failed_count", "int");
		metaData.addField(email_failed_countField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("trip");

		metaData.setCluster("DB_LOG");
	}

	public Basetrip() {}

	public Basetrip(Basetrip obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.route_id = obj.route_id;
		this.route_name = obj.route_name;
		this.school_id = obj.school_id;
		this.scheduled_start_time = obj.scheduled_start_time;
		this.scheduled_reached_time = obj.scheduled_reached_time;
		this.start_time = obj.start_time;
		this.reached_time = obj.reached_time;
		this.driver_id = obj.driver_id;
		this.driver_name = obj.driver_name;
		this.helper_id = obj.helper_id;
		this.alternate_helper_id = obj.alternate_helper_id;
		this.delayed = obj.delayed;
		this.students = obj.students;
		this.overspeed_count = obj.overspeed_count;
		this.creation_time = obj.creation_time;
		this.sms_sent_count = obj.sms_sent_count;
		this.sms_failed_count = obj.sms_failed_count;
		this.email_sent_count = obj.email_sent_count;
		this.email_failed_count = obj.email_failed_count;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(route_id != null)
			map.put("route_id", route_id);
		if(route_name != null)
			map.put("route_name", route_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(driver_name != null)
			map.put("driver_name", driver_name);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
		if(delayed != null)
			map.put("delayed", delayed);
		if(students != null)
			map.put("students", students);
		if(overspeed_count != null)
			map.put("overspeed_count", overspeed_count);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sms_sent_count != null)
			map.put("sms_sent_count", sms_sent_count);
		if(sms_failed_count != null)
			map.put("sms_failed_count", sms_failed_count);
		if(email_sent_count != null)
			map.put("email_sent_count", email_sent_count);
		if(email_failed_count != null)
			map.put("email_failed_count", email_failed_count);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(route_id != null)
			map.put("route_id", route_id);
		if(route_name != null)
			map.put("route_name", route_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(scheduled_start_time != null)
			map.put("scheduled_start_time", scheduled_start_time);
		if(scheduled_reached_time != null)
			map.put("scheduled_reached_time", scheduled_reached_time);
		if(start_time != null)
			map.put("start_time", start_time);
		if(reached_time != null)
			map.put("reached_time", reached_time);
		if(driver_id != null)
			map.put("driver_id", driver_id);
		if(driver_name != null)
			map.put("driver_name", driver_name);
		if(helper_id != null)
			map.put("helper_id", helper_id);
		if(alternate_helper_id != null)
			map.put("alternate_helper_id", alternate_helper_id);
		if(delayed != null)
			map.put("delayed", delayed);
		if(students != null)
			map.put("students", students);
		if(overspeed_count != null)
			map.put("overspeed_count", overspeed_count);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sms_sent_count != null)
			map.put("sms_sent_count", sms_sent_count);
		if(sms_failed_count != null)
			map.put("sms_failed_count", sms_failed_count);
		if(email_sent_count != null)
			map.put("email_sent_count", email_sent_count);
		if(email_failed_count != null)
			map.put("email_failed_count", email_failed_count);
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
		customer_id = (String) map.get("customer_id");
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		route_id = (String) map.get("route_id");
		route_name = (String) map.get("route_name");
		school_id = (String) map.get("school_id");
		scheduled_start_time = (String) map.get("scheduled_start_time");
		scheduled_reached_time = (String) map.get("scheduled_reached_time");
		start_time = (String) map.get("start_time");
		reached_time = (String) map.get("reached_time");
		driver_id = (String) map.get("driver_id");
		driver_name = (String) map.get("driver_name");
		helper_id = (String) map.get("helper_id");
		alternate_helper_id = (String) map.get("alternate_helper_id");
		delayed = (Long) map.get("delayed");
		students = (ArrayList<String>) map.get("students");
		overspeed_count = (Integer) map.get("overspeed_count");
		creation_time = (Long) map.get("creation_time");
		sms_sent_count = (Integer) map.get("sms_sent_count");
		sms_failed_count = (Integer) map.get("sms_failed_count");
		email_sent_count = (Integer) map.get("email_sent_count");
		email_failed_count = (Integer) map.get("email_failed_count");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object route_nameObj = map.get("route_name");
		if(route_nameObj != null)
			route_name = route_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object scheduled_start_timeObj = map.get("scheduled_start_time");
		if(scheduled_start_timeObj != null)
			scheduled_start_time = scheduled_start_timeObj.toString();

		Object scheduled_reached_timeObj = map.get("scheduled_reached_time");
		if(scheduled_reached_timeObj != null)
			scheduled_reached_time = scheduled_reached_timeObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object reached_timeObj = map.get("reached_time");
		if(reached_timeObj != null)
			reached_time = reached_timeObj.toString();

		Object driver_idObj = map.get("driver_id");
		if(driver_idObj != null)
			driver_id = driver_idObj.toString();

		Object driver_nameObj = map.get("driver_name");
		if(driver_nameObj != null)
			driver_name = driver_nameObj.toString();

		Object helper_idObj = map.get("helper_id");
		if(helper_idObj != null)
			helper_id = helper_idObj.toString();

		Object alternate_helper_idObj = map.get("alternate_helper_id");
		if(alternate_helper_idObj != null)
			alternate_helper_id = alternate_helper_idObj.toString();

		Object delayedObj = map.get("delayed");
		if(delayedObj != null)
			delayed = new Long(delayedObj.toString());

		students = (ArrayList<String>) map.get("students");
		Object overspeed_countObj = map.get("overspeed_count");
		if(overspeed_countObj != null)
			overspeed_count = new Integer(overspeed_countObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object sms_sent_countObj = map.get("sms_sent_count");
		if(sms_sent_countObj != null)
			sms_sent_count = new Integer(sms_sent_countObj.toString());

		Object sms_failed_countObj = map.get("sms_failed_count");
		if(sms_failed_countObj != null)
			sms_failed_count = new Integer(sms_failed_countObj.toString());

		Object email_sent_countObj = map.get("email_sent_count");
		if(email_sent_countObj != null)
			email_sent_count = new Integer(email_sent_countObj.toString());

		Object email_failed_countObj = map.get("email_failed_count");
		if(email_failed_countObj != null)
			email_failed_count = new Integer(email_failed_countObj.toString());

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

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
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

	public String getRoute_name() {
		return route_name;
	}

	public String getRoute_nameEx() {
		return route_name != null ? route_name : "";
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	public void unSetRoute_name() {
		this.route_name = null;
	}

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
	}

	public String getScheduled_start_time() {
		return scheduled_start_time;
	}

	public String getScheduled_start_timeEx() {
		return scheduled_start_time != null ? scheduled_start_time : "";
	}

	public void setScheduled_start_time(String scheduled_start_time) {
		this.scheduled_start_time = scheduled_start_time;
	}

	public void unSetScheduled_start_time() {
		this.scheduled_start_time = null;
	}

	public String getScheduled_reached_time() {
		return scheduled_reached_time;
	}

	public String getScheduled_reached_timeEx() {
		return scheduled_reached_time != null ? scheduled_reached_time : "";
	}

	public void setScheduled_reached_time(String scheduled_reached_time) {
		this.scheduled_reached_time = scheduled_reached_time;
	}

	public void unSetScheduled_reached_time() {
		this.scheduled_reached_time = null;
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

	public String getReached_time() {
		return reached_time;
	}

	public String getReached_timeEx() {
		return reached_time != null ? reached_time : "";
	}

	public void setReached_time(String reached_time) {
		this.reached_time = reached_time;
	}

	public void unSetReached_time() {
		this.reached_time = null;
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

	public String getDriver_name() {
		return driver_name;
	}

	public String getDriver_nameEx() {
		return driver_name != null ? driver_name : "";
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public void unSetDriver_name() {
		this.driver_name = null;
	}

	public String getHelper_id() {
		return helper_id;
	}

	public String getHelper_idEx() {
		return helper_id != null ? helper_id : "";
	}

	public void setHelper_id(String helper_id) {
		this.helper_id = helper_id;
	}

	public void unSetHelper_id() {
		this.helper_id = null;
	}

	public String getAlternate_helper_id() {
		return alternate_helper_id;
	}

	public String getAlternate_helper_idEx() {
		return alternate_helper_id != null ? alternate_helper_id : "";
	}

	public void setAlternate_helper_id(String alternate_helper_id) {
		this.alternate_helper_id = alternate_helper_id;
	}

	public void unSetAlternate_helper_id() {
		this.alternate_helper_id = null;
	}

	public Long getDelayed() {
		return delayed;
	}

	public long getDelayedEx() {
		return delayed != null ? delayed : 0L;
	}

	public void setDelayed(long delayed) {
		this.delayed = delayed;
	}

	public void setDelayed(Long delayed) {
		this.delayed = delayed;
	}

	public void unSetDelayed() {
		this.delayed = null;
	}

	public ArrayList<String> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

	public void addStudents(String value) {
		if(students == null)
			students = new ArrayList<String>();
		students.add(value);
	}

	public void unSetStudents() {
		this.students = null;
	}

	public Integer getOverspeed_count() {
		return overspeed_count;
	}

	public int getOverspeed_countEx() {
		return overspeed_count != null ? overspeed_count : 0;
	}

	public void setOverspeed_count(int overspeed_count) {
		this.overspeed_count = overspeed_count;
	}

	public void setOverspeed_count(Integer overspeed_count) {
		this.overspeed_count = overspeed_count;
	}

	public void unSetOverspeed_count() {
		this.overspeed_count = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Integer getSms_sent_count() {
		return sms_sent_count;
	}

	public int getSms_sent_countEx() {
		return sms_sent_count != null ? sms_sent_count : 0;
	}

	public void setSms_sent_count(int sms_sent_count) {
		this.sms_sent_count = sms_sent_count;
	}

	public void setSms_sent_count(Integer sms_sent_count) {
		this.sms_sent_count = sms_sent_count;
	}

	public void unSetSms_sent_count() {
		this.sms_sent_count = null;
	}

	public Integer getSms_failed_count() {
		return sms_failed_count;
	}

	public int getSms_failed_countEx() {
		return sms_failed_count != null ? sms_failed_count : 0;
	}

	public void setSms_failed_count(int sms_failed_count) {
		this.sms_failed_count = sms_failed_count;
	}

	public void setSms_failed_count(Integer sms_failed_count) {
		this.sms_failed_count = sms_failed_count;
	}

	public void unSetSms_failed_count() {
		this.sms_failed_count = null;
	}

	public Integer getEmail_sent_count() {
		return email_sent_count;
	}

	public int getEmail_sent_countEx() {
		return email_sent_count != null ? email_sent_count : 0;
	}

	public void setEmail_sent_count(int email_sent_count) {
		this.email_sent_count = email_sent_count;
	}

	public void setEmail_sent_count(Integer email_sent_count) {
		this.email_sent_count = email_sent_count;
	}

	public void unSetEmail_sent_count() {
		this.email_sent_count = null;
	}

	public Integer getEmail_failed_count() {
		return email_failed_count;
	}

	public int getEmail_failed_countEx() {
		return email_failed_count != null ? email_failed_count : 0;
	}

	public void setEmail_failed_count(int email_failed_count) {
		this.email_failed_count = email_failed_count;
	}

	public void setEmail_failed_count(Integer email_failed_count) {
		this.email_failed_count = email_failed_count;
	}

	public void unSetEmail_failed_count() {
		this.email_failed_count = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}