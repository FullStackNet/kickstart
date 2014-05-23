/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basestudent_detail extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String name = null;
	private String pickup_route_stopage_id = null;
	private String pickup_route_id = null;
	private String pickup_route_name = null;
	private String pickup_stopage_id = null;
	private String pickup_stopage_name = null;
	private String pickup_start_time = null;
	private String pickup_end_time = null;
	private String pickup_vehicle_name = null;
	private String pickup_driver_id = null;
	private String pickup_driver_name = null;
	private String pickup_driver_mobile_no = null;
	private String dropped_route_stopage_id = null;
	private String dropped_route_id = null;
	private String dropped_route_name = null;
	private String dropped_stopage_id = null;
	private String dropped_stopage_name = null;
	private String dropped_start_time = null;
	private String dropped_end_time = null;
	private String dropped_vehicle_name = null;
	private String dropped_driver_id = null;
	private String dropped_driver_name = null;
	private String dropped_driver_mobile_no = null;
	private String class_name = null;
	private String section_name = null;
	private String bus_started = null;
	private String last_stopage_name = null;
	private Long last_stopage_time = null;
	private Long reaching_time = null;
	private String reached = null;
	private String alert_pickup_route_stopage_id = null;
	private String alert_dropped_route_stopage_id = null;
	private String alert_pickup_stopage_name = null;
	private String alert_dropped_stopage_name = null;
	private String stopage_alert_sms = null;
	private String stopage_alert_mobile_app = null;
	private String stopage_alert_email = null;
	private String feature_parent2parent_chat = null;
	private String feature_homework = null;
	private String feature_parent2teacher_chat = null;
	private String feature_teacher2parent_chat = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PICKUP_ROUTE_STOPAGE_ID = "pickup_route_stopage_id";
	public static String FIELD_PICKUP_ROUTE_ID = "pickup_route_id";
	public static String FIELD_PICKUP_ROUTE_NAME = "pickup_route_name";
	public static String FIELD_PICKUP_STOPAGE_ID = "pickup_stopage_id";
	public static String FIELD_PICKUP_STOPAGE_NAME = "pickup_stopage_name";
	public static String FIELD_PICKUP_START_TIME = "pickup_start_time";
	public static String FIELD_PICKUP_END_TIME = "pickup_end_time";
	public static String FIELD_PICKUP_VEHICLE_NAME = "pickup_vehicle_name";
	public static String FIELD_PICKUP_DRIVER_ID = "pickup_driver_id";
	public static String FIELD_PICKUP_DRIVER_NAME = "pickup_driver_name";
	public static String FIELD_PICKUP_DRIVER_MOBILE_NO = "pickup_driver_mobile_no";
	public static String FIELD_DROPPED_ROUTE_STOPAGE_ID = "dropped_route_stopage_id";
	public static String FIELD_DROPPED_ROUTE_ID = "dropped_route_id";
	public static String FIELD_DROPPED_ROUTE_NAME = "dropped_route_name";
	public static String FIELD_DROPPED_STOPAGE_ID = "dropped_stopage_id";
	public static String FIELD_DROPPED_STOPAGE_NAME = "dropped_stopage_name";
	public static String FIELD_DROPPED_START_TIME = "dropped_start_time";
	public static String FIELD_DROPPED_END_TIME = "dropped_end_time";
	public static String FIELD_DROPPED_VEHICLE_NAME = "dropped_vehicle_name";
	public static String FIELD_DROPPED_DRIVER_ID = "dropped_driver_id";
	public static String FIELD_DROPPED_DRIVER_NAME = "dropped_driver_name";
	public static String FIELD_DROPPED_DRIVER_MOBILE_NO = "dropped_driver_mobile_no";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_BUS_STARTED = "bus_started";
	public static String FIELD_LAST_STOPAGE_NAME = "last_stopage_name";
	public static String FIELD_LAST_STOPAGE_TIME = "last_stopage_time";
	public static String FIELD_REACHING_TIME = "reaching_time";
	public static String FIELD_REACHED = "reached";
	public static String FIELD_ALERT_PICKUP_ROUTE_STOPAGE_ID = "alert_pickup_route_stopage_id";
	public static String FIELD_ALERT_DROPPED_ROUTE_STOPAGE_ID = "alert_dropped_route_stopage_id";
	public static String FIELD_ALERT_PICKUP_STOPAGE_NAME = "alert_pickup_stopage_name";
	public static String FIELD_ALERT_DROPPED_STOPAGE_NAME = "alert_dropped_stopage_name";
	public static String FIELD_STOPAGE_ALERT_SMS = "stopage_alert_sms";
	public static String FIELD_STOPAGE_ALERT_MOBILE_APP = "stopage_alert_mobile_app";
	public static String FIELD_STOPAGE_ALERT_EMAIL = "stopage_alert_email";
	public static String FIELD_FEATURE_PARENT2PARENT_CHAT = "feature_parent2parent_chat";
	public static String FIELD_FEATURE_HOMEWORK = "feature_homework";
	public static String FIELD_FEATURE_PARENT2TEACHER_CHAT = "feature_parent2teacher_chat";
	public static String FIELD_FEATURE_TEACHER2PARENT_CHAT = "feature_teacher2parent_chat";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field pickup_route_stopage_idField = new Field("pickup_route_stopage_id", "String");
		pickup_route_stopage_idField.setLength(128);
		metaData.addField(pickup_route_stopage_idField);

		Field pickup_route_idField = new Field("pickup_route_id", "String");
		pickup_route_idField.setLength(128);
		metaData.addField(pickup_route_idField);

		Field pickup_route_nameField = new Field("pickup_route_name", "String");
		pickup_route_nameField.setLength(128);
		metaData.addField(pickup_route_nameField);

		Field pickup_stopage_idField = new Field("pickup_stopage_id", "String");
		pickup_stopage_idField.setLength(128);
		metaData.addField(pickup_stopage_idField);

		Field pickup_stopage_nameField = new Field("pickup_stopage_name", "String");
		pickup_stopage_nameField.setLength(128);
		metaData.addField(pickup_stopage_nameField);

		Field pickup_start_timeField = new Field("pickup_start_time", "String");
		pickup_start_timeField.setLength(128);
		metaData.addField(pickup_start_timeField);

		Field pickup_end_timeField = new Field("pickup_end_time", "String");
		pickup_end_timeField.setLength(128);
		metaData.addField(pickup_end_timeField);

		Field pickup_vehicle_nameField = new Field("pickup_vehicle_name", "String");
		pickup_vehicle_nameField.setLength(128);
		metaData.addField(pickup_vehicle_nameField);

		Field pickup_driver_idField = new Field("pickup_driver_id", "String");
		pickup_driver_idField.setLength(128);
		metaData.addField(pickup_driver_idField);

		Field pickup_driver_nameField = new Field("pickup_driver_name", "String");
		pickup_driver_nameField.setLength(128);
		metaData.addField(pickup_driver_nameField);

		Field pickup_driver_mobile_noField = new Field("pickup_driver_mobile_no", "String");
		pickup_driver_mobile_noField.setLength(128);
		metaData.addField(pickup_driver_mobile_noField);

		Field dropped_route_stopage_idField = new Field("dropped_route_stopage_id", "String");
		dropped_route_stopage_idField.setLength(128);
		metaData.addField(dropped_route_stopage_idField);

		Field dropped_route_idField = new Field("dropped_route_id", "String");
		dropped_route_idField.setLength(128);
		metaData.addField(dropped_route_idField);

		Field dropped_route_nameField = new Field("dropped_route_name", "String");
		dropped_route_nameField.setLength(128);
		metaData.addField(dropped_route_nameField);

		Field dropped_stopage_idField = new Field("dropped_stopage_id", "String");
		dropped_stopage_idField.setLength(128);
		metaData.addField(dropped_stopage_idField);

		Field dropped_stopage_nameField = new Field("dropped_stopage_name", "String");
		dropped_stopage_nameField.setLength(128);
		metaData.addField(dropped_stopage_nameField);

		Field dropped_start_timeField = new Field("dropped_start_time", "String");
		dropped_start_timeField.setLength(128);
		metaData.addField(dropped_start_timeField);

		Field dropped_end_timeField = new Field("dropped_end_time", "String");
		dropped_end_timeField.setLength(128);
		metaData.addField(dropped_end_timeField);

		Field dropped_vehicle_nameField = new Field("dropped_vehicle_name", "String");
		dropped_vehicle_nameField.setLength(128);
		metaData.addField(dropped_vehicle_nameField);

		Field dropped_driver_idField = new Field("dropped_driver_id", "String");
		dropped_driver_idField.setLength(128);
		metaData.addField(dropped_driver_idField);

		Field dropped_driver_nameField = new Field("dropped_driver_name", "String");
		dropped_driver_nameField.setLength(128);
		metaData.addField(dropped_driver_nameField);

		Field dropped_driver_mobile_noField = new Field("dropped_driver_mobile_no", "String");
		dropped_driver_mobile_noField.setLength(128);
		metaData.addField(dropped_driver_mobile_noField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field bus_startedField = new Field("bus_started", "String");
		bus_startedField.setLength(128);
		metaData.addField(bus_startedField);

		Field last_stopage_nameField = new Field("last_stopage_name", "String");
		last_stopage_nameField.setLength(128);
		metaData.addField(last_stopage_nameField);

		Field last_stopage_timeField = new Field("last_stopage_time", "long");
		metaData.addField(last_stopage_timeField);

		Field reaching_timeField = new Field("reaching_time", "long");
		metaData.addField(reaching_timeField);

		Field reachedField = new Field("reached", "String");
		reachedField.setLength(1);
		metaData.addField(reachedField);

		Field alert_pickup_route_stopage_idField = new Field("alert_pickup_route_stopage_id", "String");
		alert_pickup_route_stopage_idField.setLength(128);
		metaData.addField(alert_pickup_route_stopage_idField);

		Field alert_dropped_route_stopage_idField = new Field("alert_dropped_route_stopage_id", "String");
		alert_dropped_route_stopage_idField.setLength(128);
		metaData.addField(alert_dropped_route_stopage_idField);

		Field alert_pickup_stopage_nameField = new Field("alert_pickup_stopage_name", "String");
		alert_pickup_stopage_nameField.setLength(128);
		metaData.addField(alert_pickup_stopage_nameField);

		Field alert_dropped_stopage_nameField = new Field("alert_dropped_stopage_name", "String");
		alert_dropped_stopage_nameField.setLength(128);
		metaData.addField(alert_dropped_stopage_nameField);

		Field stopage_alert_smsField = new Field("stopage_alert_sms", "String");
		stopage_alert_smsField.setDefaultValue("N");
		stopage_alert_smsField.setLength(1);
		metaData.addField(stopage_alert_smsField);

		Field stopage_alert_mobile_appField = new Field("stopage_alert_mobile_app", "String");
		stopage_alert_mobile_appField.setDefaultValue("Y");
		stopage_alert_mobile_appField.setLength(1);
		metaData.addField(stopage_alert_mobile_appField);

		Field stopage_alert_emailField = new Field("stopage_alert_email", "String");
		stopage_alert_emailField.setDefaultValue("N");
		stopage_alert_emailField.setLength(1);
		metaData.addField(stopage_alert_emailField);

		Field feature_parent2parent_chatField = new Field("feature_parent2parent_chat", "String");
		feature_parent2parent_chatField.setDefaultValue("N");
		feature_parent2parent_chatField.setLength(1);
		metaData.addField(feature_parent2parent_chatField);

		Field feature_homeworkField = new Field("feature_homework", "String");
		feature_homeworkField.setDefaultValue("N");
		feature_homeworkField.setLength(1);
		metaData.addField(feature_homeworkField);

		Field feature_parent2teacher_chatField = new Field("feature_parent2teacher_chat", "String");
		feature_parent2teacher_chatField.setDefaultValue("N");
		feature_parent2teacher_chatField.setLength(1);
		metaData.addField(feature_parent2teacher_chatField);

		Field feature_teacher2parent_chatField = new Field("feature_teacher2parent_chat", "String");
		feature_teacher2parent_chatField.setDefaultValue("N");
		feature_teacher2parent_chatField.setLength(1);
		metaData.addField(feature_teacher2parent_chatField);


		metaData.setTableName("student_detail");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent_detail() {}

	public Basestudent_detail(Basestudent_detail obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.name = obj.name;
		this.pickup_route_stopage_id = obj.pickup_route_stopage_id;
		this.pickup_route_id = obj.pickup_route_id;
		this.pickup_route_name = obj.pickup_route_name;
		this.pickup_stopage_id = obj.pickup_stopage_id;
		this.pickup_stopage_name = obj.pickup_stopage_name;
		this.pickup_start_time = obj.pickup_start_time;
		this.pickup_end_time = obj.pickup_end_time;
		this.pickup_vehicle_name = obj.pickup_vehicle_name;
		this.pickup_driver_id = obj.pickup_driver_id;
		this.pickup_driver_name = obj.pickup_driver_name;
		this.pickup_driver_mobile_no = obj.pickup_driver_mobile_no;
		this.dropped_route_stopage_id = obj.dropped_route_stopage_id;
		this.dropped_route_id = obj.dropped_route_id;
		this.dropped_route_name = obj.dropped_route_name;
		this.dropped_stopage_id = obj.dropped_stopage_id;
		this.dropped_stopage_name = obj.dropped_stopage_name;
		this.dropped_start_time = obj.dropped_start_time;
		this.dropped_end_time = obj.dropped_end_time;
		this.dropped_vehicle_name = obj.dropped_vehicle_name;
		this.dropped_driver_id = obj.dropped_driver_id;
		this.dropped_driver_name = obj.dropped_driver_name;
		this.dropped_driver_mobile_no = obj.dropped_driver_mobile_no;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.bus_started = obj.bus_started;
		this.last_stopage_name = obj.last_stopage_name;
		this.last_stopage_time = obj.last_stopage_time;
		this.reaching_time = obj.reaching_time;
		this.reached = obj.reached;
		this.alert_pickup_route_stopage_id = obj.alert_pickup_route_stopage_id;
		this.alert_dropped_route_stopage_id = obj.alert_dropped_route_stopage_id;
		this.alert_pickup_stopage_name = obj.alert_pickup_stopage_name;
		this.alert_dropped_stopage_name = obj.alert_dropped_stopage_name;
		this.stopage_alert_sms = obj.stopage_alert_sms;
		this.stopage_alert_mobile_app = obj.stopage_alert_mobile_app;
		this.stopage_alert_email = obj.stopage_alert_email;
		this.feature_parent2parent_chat = obj.feature_parent2parent_chat;
		this.feature_homework = obj.feature_homework;
		this.feature_parent2teacher_chat = obj.feature_parent2teacher_chat;
		this.feature_teacher2parent_chat = obj.feature_teacher2parent_chat;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(stopage_alert_sms == null)
			stopage_alert_sms = "N";
		if(stopage_alert_mobile_app == null)
			stopage_alert_mobile_app = "Y";
		if(stopage_alert_email == null)
			stopage_alert_email = "N";
		if(feature_parent2parent_chat == null)
			feature_parent2parent_chat = "N";
		if(feature_homework == null)
			feature_homework = "N";
		if(feature_parent2teacher_chat == null)
			feature_parent2teacher_chat = "N";
		if(feature_teacher2parent_chat == null)
			feature_teacher2parent_chat = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_route_name != null)
			map.put("pickup_route_name", pickup_route_name);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(pickup_stopage_name != null)
			map.put("pickup_stopage_name", pickup_stopage_name);
		if(pickup_start_time != null)
			map.put("pickup_start_time", pickup_start_time);
		if(pickup_end_time != null)
			map.put("pickup_end_time", pickup_end_time);
		if(pickup_vehicle_name != null)
			map.put("pickup_vehicle_name", pickup_vehicle_name);
		if(pickup_driver_id != null)
			map.put("pickup_driver_id", pickup_driver_id);
		if(pickup_driver_name != null)
			map.put("pickup_driver_name", pickup_driver_name);
		if(pickup_driver_mobile_no != null)
			map.put("pickup_driver_mobile_no", pickup_driver_mobile_no);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_route_name != null)
			map.put("dropped_route_name", dropped_route_name);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(dropped_stopage_name != null)
			map.put("dropped_stopage_name", dropped_stopage_name);
		if(dropped_start_time != null)
			map.put("dropped_start_time", dropped_start_time);
		if(dropped_end_time != null)
			map.put("dropped_end_time", dropped_end_time);
		if(dropped_vehicle_name != null)
			map.put("dropped_vehicle_name", dropped_vehicle_name);
		if(dropped_driver_id != null)
			map.put("dropped_driver_id", dropped_driver_id);
		if(dropped_driver_name != null)
			map.put("dropped_driver_name", dropped_driver_name);
		if(dropped_driver_mobile_no != null)
			map.put("dropped_driver_mobile_no", dropped_driver_mobile_no);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(bus_started != null)
			map.put("bus_started", bus_started);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_time != null)
			map.put("last_stopage_time", last_stopage_time);
		if(reaching_time != null)
			map.put("reaching_time", reaching_time);
		if(reached != null)
			map.put("reached", reached);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(alert_pickup_stopage_name != null)
			map.put("alert_pickup_stopage_name", alert_pickup_stopage_name);
		if(alert_dropped_stopage_name != null)
			map.put("alert_dropped_stopage_name", alert_dropped_stopage_name);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_parent2teacher_chat != null)
			map.put("feature_parent2teacher_chat", feature_parent2teacher_chat);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(pickup_route_id != null)
			map.put("pickup_route_id", pickup_route_id);
		if(pickup_route_name != null)
			map.put("pickup_route_name", pickup_route_name);
		if(pickup_stopage_id != null)
			map.put("pickup_stopage_id", pickup_stopage_id);
		if(pickup_stopage_name != null)
			map.put("pickup_stopage_name", pickup_stopage_name);
		if(pickup_start_time != null)
			map.put("pickup_start_time", pickup_start_time);
		if(pickup_end_time != null)
			map.put("pickup_end_time", pickup_end_time);
		if(pickup_vehicle_name != null)
			map.put("pickup_vehicle_name", pickup_vehicle_name);
		if(pickup_driver_id != null)
			map.put("pickup_driver_id", pickup_driver_id);
		if(pickup_driver_name != null)
			map.put("pickup_driver_name", pickup_driver_name);
		if(pickup_driver_mobile_no != null)
			map.put("pickup_driver_mobile_no", pickup_driver_mobile_no);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(dropped_route_id != null)
			map.put("dropped_route_id", dropped_route_id);
		if(dropped_route_name != null)
			map.put("dropped_route_name", dropped_route_name);
		if(dropped_stopage_id != null)
			map.put("dropped_stopage_id", dropped_stopage_id);
		if(dropped_stopage_name != null)
			map.put("dropped_stopage_name", dropped_stopage_name);
		if(dropped_start_time != null)
			map.put("dropped_start_time", dropped_start_time);
		if(dropped_end_time != null)
			map.put("dropped_end_time", dropped_end_time);
		if(dropped_vehicle_name != null)
			map.put("dropped_vehicle_name", dropped_vehicle_name);
		if(dropped_driver_id != null)
			map.put("dropped_driver_id", dropped_driver_id);
		if(dropped_driver_name != null)
			map.put("dropped_driver_name", dropped_driver_name);
		if(dropped_driver_mobile_no != null)
			map.put("dropped_driver_mobile_no", dropped_driver_mobile_no);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(bus_started != null)
			map.put("bus_started", bus_started);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_time != null)
			map.put("last_stopage_time", last_stopage_time);
		if(reaching_time != null)
			map.put("reaching_time", reaching_time);
		if(reached != null)
			map.put("reached", reached);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(alert_pickup_stopage_name != null)
			map.put("alert_pickup_stopage_name", alert_pickup_stopage_name);
		if(alert_dropped_stopage_name != null)
			map.put("alert_dropped_stopage_name", alert_dropped_stopage_name);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
		if(feature_parent2parent_chat != null)
			map.put("feature_parent2parent_chat", feature_parent2parent_chat);
		if(feature_homework != null)
			map.put("feature_homework", feature_homework);
		if(feature_parent2teacher_chat != null)
			map.put("feature_parent2teacher_chat", feature_parent2teacher_chat);
		if(feature_teacher2parent_chat != null)
			map.put("feature_teacher2parent_chat", feature_teacher2parent_chat);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		school_id = (String) map.get("school_id");
		name = (String) map.get("name");
		pickup_route_stopage_id = (String) map.get("pickup_route_stopage_id");
		pickup_route_id = (String) map.get("pickup_route_id");
		pickup_route_name = (String) map.get("pickup_route_name");
		pickup_stopage_id = (String) map.get("pickup_stopage_id");
		pickup_stopage_name = (String) map.get("pickup_stopage_name");
		pickup_start_time = (String) map.get("pickup_start_time");
		pickup_end_time = (String) map.get("pickup_end_time");
		pickup_vehicle_name = (String) map.get("pickup_vehicle_name");
		pickup_driver_id = (String) map.get("pickup_driver_id");
		pickup_driver_name = (String) map.get("pickup_driver_name");
		pickup_driver_mobile_no = (String) map.get("pickup_driver_mobile_no");
		dropped_route_stopage_id = (String) map.get("dropped_route_stopage_id");
		dropped_route_id = (String) map.get("dropped_route_id");
		dropped_route_name = (String) map.get("dropped_route_name");
		dropped_stopage_id = (String) map.get("dropped_stopage_id");
		dropped_stopage_name = (String) map.get("dropped_stopage_name");
		dropped_start_time = (String) map.get("dropped_start_time");
		dropped_end_time = (String) map.get("dropped_end_time");
		dropped_vehicle_name = (String) map.get("dropped_vehicle_name");
		dropped_driver_id = (String) map.get("dropped_driver_id");
		dropped_driver_name = (String) map.get("dropped_driver_name");
		dropped_driver_mobile_no = (String) map.get("dropped_driver_mobile_no");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		bus_started = (String) map.get("bus_started");
		last_stopage_name = (String) map.get("last_stopage_name");
		last_stopage_time = (Long) map.get("last_stopage_time");
		reaching_time = (Long) map.get("reaching_time");
		reached = (String) map.get("reached");
		alert_pickup_route_stopage_id = (String) map.get("alert_pickup_route_stopage_id");
		alert_dropped_route_stopage_id = (String) map.get("alert_dropped_route_stopage_id");
		alert_pickup_stopage_name = (String) map.get("alert_pickup_stopage_name");
		alert_dropped_stopage_name = (String) map.get("alert_dropped_stopage_name");
		stopage_alert_sms = (String) map.get("stopage_alert_sms");
		stopage_alert_mobile_app = (String) map.get("stopage_alert_mobile_app");
		stopage_alert_email = (String) map.get("stopage_alert_email");
		feature_parent2parent_chat = (String) map.get("feature_parent2parent_chat");
		feature_homework = (String) map.get("feature_homework");
		feature_parent2teacher_chat = (String) map.get("feature_parent2teacher_chat");
		feature_teacher2parent_chat = (String) map.get("feature_teacher2parent_chat");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object pickup_route_stopage_idObj = map.get("pickup_route_stopage_id");
		if(pickup_route_stopage_idObj != null)
			pickup_route_stopage_id = pickup_route_stopage_idObj.toString();

		Object pickup_route_idObj = map.get("pickup_route_id");
		if(pickup_route_idObj != null)
			pickup_route_id = pickup_route_idObj.toString();

		Object pickup_route_nameObj = map.get("pickup_route_name");
		if(pickup_route_nameObj != null)
			pickup_route_name = pickup_route_nameObj.toString();

		Object pickup_stopage_idObj = map.get("pickup_stopage_id");
		if(pickup_stopage_idObj != null)
			pickup_stopage_id = pickup_stopage_idObj.toString();

		Object pickup_stopage_nameObj = map.get("pickup_stopage_name");
		if(pickup_stopage_nameObj != null)
			pickup_stopage_name = pickup_stopage_nameObj.toString();

		Object pickup_start_timeObj = map.get("pickup_start_time");
		if(pickup_start_timeObj != null)
			pickup_start_time = pickup_start_timeObj.toString();

		Object pickup_end_timeObj = map.get("pickup_end_time");
		if(pickup_end_timeObj != null)
			pickup_end_time = pickup_end_timeObj.toString();

		Object pickup_vehicle_nameObj = map.get("pickup_vehicle_name");
		if(pickup_vehicle_nameObj != null)
			pickup_vehicle_name = pickup_vehicle_nameObj.toString();

		Object pickup_driver_idObj = map.get("pickup_driver_id");
		if(pickup_driver_idObj != null)
			pickup_driver_id = pickup_driver_idObj.toString();

		Object pickup_driver_nameObj = map.get("pickup_driver_name");
		if(pickup_driver_nameObj != null)
			pickup_driver_name = pickup_driver_nameObj.toString();

		Object pickup_driver_mobile_noObj = map.get("pickup_driver_mobile_no");
		if(pickup_driver_mobile_noObj != null)
			pickup_driver_mobile_no = pickup_driver_mobile_noObj.toString();

		Object dropped_route_stopage_idObj = map.get("dropped_route_stopage_id");
		if(dropped_route_stopage_idObj != null)
			dropped_route_stopage_id = dropped_route_stopage_idObj.toString();

		Object dropped_route_idObj = map.get("dropped_route_id");
		if(dropped_route_idObj != null)
			dropped_route_id = dropped_route_idObj.toString();

		Object dropped_route_nameObj = map.get("dropped_route_name");
		if(dropped_route_nameObj != null)
			dropped_route_name = dropped_route_nameObj.toString();

		Object dropped_stopage_idObj = map.get("dropped_stopage_id");
		if(dropped_stopage_idObj != null)
			dropped_stopage_id = dropped_stopage_idObj.toString();

		Object dropped_stopage_nameObj = map.get("dropped_stopage_name");
		if(dropped_stopage_nameObj != null)
			dropped_stopage_name = dropped_stopage_nameObj.toString();

		Object dropped_start_timeObj = map.get("dropped_start_time");
		if(dropped_start_timeObj != null)
			dropped_start_time = dropped_start_timeObj.toString();

		Object dropped_end_timeObj = map.get("dropped_end_time");
		if(dropped_end_timeObj != null)
			dropped_end_time = dropped_end_timeObj.toString();

		Object dropped_vehicle_nameObj = map.get("dropped_vehicle_name");
		if(dropped_vehicle_nameObj != null)
			dropped_vehicle_name = dropped_vehicle_nameObj.toString();

		Object dropped_driver_idObj = map.get("dropped_driver_id");
		if(dropped_driver_idObj != null)
			dropped_driver_id = dropped_driver_idObj.toString();

		Object dropped_driver_nameObj = map.get("dropped_driver_name");
		if(dropped_driver_nameObj != null)
			dropped_driver_name = dropped_driver_nameObj.toString();

		Object dropped_driver_mobile_noObj = map.get("dropped_driver_mobile_no");
		if(dropped_driver_mobile_noObj != null)
			dropped_driver_mobile_no = dropped_driver_mobile_noObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object bus_startedObj = map.get("bus_started");
		if(bus_startedObj != null)
			bus_started = bus_startedObj.toString();

		Object last_stopage_nameObj = map.get("last_stopage_name");
		if(last_stopage_nameObj != null)
			last_stopage_name = last_stopage_nameObj.toString();

		Object last_stopage_timeObj = map.get("last_stopage_time");
		if(last_stopage_timeObj != null)
			last_stopage_time = new Long(last_stopage_timeObj.toString());

		Object reaching_timeObj = map.get("reaching_time");
		if(reaching_timeObj != null)
			reaching_time = new Long(reaching_timeObj.toString());

		Object reachedObj = map.get("reached");
		if(reachedObj != null)
			reached = reachedObj.toString();

		Object alert_pickup_route_stopage_idObj = map.get("alert_pickup_route_stopage_id");
		if(alert_pickup_route_stopage_idObj != null)
			alert_pickup_route_stopage_id = alert_pickup_route_stopage_idObj.toString();

		Object alert_dropped_route_stopage_idObj = map.get("alert_dropped_route_stopage_id");
		if(alert_dropped_route_stopage_idObj != null)
			alert_dropped_route_stopage_id = alert_dropped_route_stopage_idObj.toString();

		Object alert_pickup_stopage_nameObj = map.get("alert_pickup_stopage_name");
		if(alert_pickup_stopage_nameObj != null)
			alert_pickup_stopage_name = alert_pickup_stopage_nameObj.toString();

		Object alert_dropped_stopage_nameObj = map.get("alert_dropped_stopage_name");
		if(alert_dropped_stopage_nameObj != null)
			alert_dropped_stopage_name = alert_dropped_stopage_nameObj.toString();

		Object stopage_alert_smsObj = map.get("stopage_alert_sms");
		if(stopage_alert_smsObj != null)
			stopage_alert_sms = stopage_alert_smsObj.toString();

		Object stopage_alert_mobile_appObj = map.get("stopage_alert_mobile_app");
		if(stopage_alert_mobile_appObj != null)
			stopage_alert_mobile_app = stopage_alert_mobile_appObj.toString();

		Object stopage_alert_emailObj = map.get("stopage_alert_email");
		if(stopage_alert_emailObj != null)
			stopage_alert_email = stopage_alert_emailObj.toString();

		Object feature_parent2parent_chatObj = map.get("feature_parent2parent_chat");
		if(feature_parent2parent_chatObj != null)
			feature_parent2parent_chat = feature_parent2parent_chatObj.toString();

		Object feature_homeworkObj = map.get("feature_homework");
		if(feature_homeworkObj != null)
			feature_homework = feature_homeworkObj.toString();

		Object feature_parent2teacher_chatObj = map.get("feature_parent2teacher_chat");
		if(feature_parent2teacher_chatObj != null)
			feature_parent2teacher_chat = feature_parent2teacher_chatObj.toString();

		Object feature_teacher2parent_chatObj = map.get("feature_teacher2parent_chat");
		if(feature_teacher2parent_chatObj != null)
			feature_teacher2parent_chat = feature_teacher2parent_chatObj.toString();

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

	public String getPickup_route_stopage_id() {
		return pickup_route_stopage_id;
	}

	public String getPickup_route_stopage_idEx() {
		return pickup_route_stopage_id != null ? pickup_route_stopage_id : "";
	}

	public void setPickup_route_stopage_id(String pickup_route_stopage_id) {
		this.pickup_route_stopage_id = pickup_route_stopage_id;
	}

	public void unSetPickup_route_stopage_id() {
		this.pickup_route_stopage_id = null;
	}

	public String getPickup_route_id() {
		return pickup_route_id;
	}

	public String getPickup_route_idEx() {
		return pickup_route_id != null ? pickup_route_id : "";
	}

	public void setPickup_route_id(String pickup_route_id) {
		this.pickup_route_id = pickup_route_id;
	}

	public void unSetPickup_route_id() {
		this.pickup_route_id = null;
	}

	public String getPickup_route_name() {
		return pickup_route_name;
	}

	public String getPickup_route_nameEx() {
		return pickup_route_name != null ? pickup_route_name : "";
	}

	public void setPickup_route_name(String pickup_route_name) {
		this.pickup_route_name = pickup_route_name;
	}

	public void unSetPickup_route_name() {
		this.pickup_route_name = null;
	}

	public String getPickup_stopage_id() {
		return pickup_stopage_id;
	}

	public String getPickup_stopage_idEx() {
		return pickup_stopage_id != null ? pickup_stopage_id : "";
	}

	public void setPickup_stopage_id(String pickup_stopage_id) {
		this.pickup_stopage_id = pickup_stopage_id;
	}

	public void unSetPickup_stopage_id() {
		this.pickup_stopage_id = null;
	}

	public String getPickup_stopage_name() {
		return pickup_stopage_name;
	}

	public String getPickup_stopage_nameEx() {
		return pickup_stopage_name != null ? pickup_stopage_name : "";
	}

	public void setPickup_stopage_name(String pickup_stopage_name) {
		this.pickup_stopage_name = pickup_stopage_name;
	}

	public void unSetPickup_stopage_name() {
		this.pickup_stopage_name = null;
	}

	public String getPickup_start_time() {
		return pickup_start_time;
	}

	public String getPickup_start_timeEx() {
		return pickup_start_time != null ? pickup_start_time : "";
	}

	public void setPickup_start_time(String pickup_start_time) {
		this.pickup_start_time = pickup_start_time;
	}

	public void unSetPickup_start_time() {
		this.pickup_start_time = null;
	}

	public String getPickup_end_time() {
		return pickup_end_time;
	}

	public String getPickup_end_timeEx() {
		return pickup_end_time != null ? pickup_end_time : "";
	}

	public void setPickup_end_time(String pickup_end_time) {
		this.pickup_end_time = pickup_end_time;
	}

	public void unSetPickup_end_time() {
		this.pickup_end_time = null;
	}

	public String getPickup_vehicle_name() {
		return pickup_vehicle_name;
	}

	public String getPickup_vehicle_nameEx() {
		return pickup_vehicle_name != null ? pickup_vehicle_name : "";
	}

	public void setPickup_vehicle_name(String pickup_vehicle_name) {
		this.pickup_vehicle_name = pickup_vehicle_name;
	}

	public void unSetPickup_vehicle_name() {
		this.pickup_vehicle_name = null;
	}

	public String getPickup_driver_id() {
		return pickup_driver_id;
	}

	public String getPickup_driver_idEx() {
		return pickup_driver_id != null ? pickup_driver_id : "";
	}

	public void setPickup_driver_id(String pickup_driver_id) {
		this.pickup_driver_id = pickup_driver_id;
	}

	public void unSetPickup_driver_id() {
		this.pickup_driver_id = null;
	}

	public String getPickup_driver_name() {
		return pickup_driver_name;
	}

	public String getPickup_driver_nameEx() {
		return pickup_driver_name != null ? pickup_driver_name : "";
	}

	public void setPickup_driver_name(String pickup_driver_name) {
		this.pickup_driver_name = pickup_driver_name;
	}

	public void unSetPickup_driver_name() {
		this.pickup_driver_name = null;
	}

	public String getPickup_driver_mobile_no() {
		return pickup_driver_mobile_no;
	}

	public String getPickup_driver_mobile_noEx() {
		return pickup_driver_mobile_no != null ? pickup_driver_mobile_no : "";
	}

	public void setPickup_driver_mobile_no(String pickup_driver_mobile_no) {
		this.pickup_driver_mobile_no = pickup_driver_mobile_no;
	}

	public void unSetPickup_driver_mobile_no() {
		this.pickup_driver_mobile_no = null;
	}

	public String getDropped_route_stopage_id() {
		return dropped_route_stopage_id;
	}

	public String getDropped_route_stopage_idEx() {
		return dropped_route_stopage_id != null ? dropped_route_stopage_id : "";
	}

	public void setDropped_route_stopage_id(String dropped_route_stopage_id) {
		this.dropped_route_stopage_id = dropped_route_stopage_id;
	}

	public void unSetDropped_route_stopage_id() {
		this.dropped_route_stopage_id = null;
	}

	public String getDropped_route_id() {
		return dropped_route_id;
	}

	public String getDropped_route_idEx() {
		return dropped_route_id != null ? dropped_route_id : "";
	}

	public void setDropped_route_id(String dropped_route_id) {
		this.dropped_route_id = dropped_route_id;
	}

	public void unSetDropped_route_id() {
		this.dropped_route_id = null;
	}

	public String getDropped_route_name() {
		return dropped_route_name;
	}

	public String getDropped_route_nameEx() {
		return dropped_route_name != null ? dropped_route_name : "";
	}

	public void setDropped_route_name(String dropped_route_name) {
		this.dropped_route_name = dropped_route_name;
	}

	public void unSetDropped_route_name() {
		this.dropped_route_name = null;
	}

	public String getDropped_stopage_id() {
		return dropped_stopage_id;
	}

	public String getDropped_stopage_idEx() {
		return dropped_stopage_id != null ? dropped_stopage_id : "";
	}

	public void setDropped_stopage_id(String dropped_stopage_id) {
		this.dropped_stopage_id = dropped_stopage_id;
	}

	public void unSetDropped_stopage_id() {
		this.dropped_stopage_id = null;
	}

	public String getDropped_stopage_name() {
		return dropped_stopage_name;
	}

	public String getDropped_stopage_nameEx() {
		return dropped_stopage_name != null ? dropped_stopage_name : "";
	}

	public void setDropped_stopage_name(String dropped_stopage_name) {
		this.dropped_stopage_name = dropped_stopage_name;
	}

	public void unSetDropped_stopage_name() {
		this.dropped_stopage_name = null;
	}

	public String getDropped_start_time() {
		return dropped_start_time;
	}

	public String getDropped_start_timeEx() {
		return dropped_start_time != null ? dropped_start_time : "";
	}

	public void setDropped_start_time(String dropped_start_time) {
		this.dropped_start_time = dropped_start_time;
	}

	public void unSetDropped_start_time() {
		this.dropped_start_time = null;
	}

	public String getDropped_end_time() {
		return dropped_end_time;
	}

	public String getDropped_end_timeEx() {
		return dropped_end_time != null ? dropped_end_time : "";
	}

	public void setDropped_end_time(String dropped_end_time) {
		this.dropped_end_time = dropped_end_time;
	}

	public void unSetDropped_end_time() {
		this.dropped_end_time = null;
	}

	public String getDropped_vehicle_name() {
		return dropped_vehicle_name;
	}

	public String getDropped_vehicle_nameEx() {
		return dropped_vehicle_name != null ? dropped_vehicle_name : "";
	}

	public void setDropped_vehicle_name(String dropped_vehicle_name) {
		this.dropped_vehicle_name = dropped_vehicle_name;
	}

	public void unSetDropped_vehicle_name() {
		this.dropped_vehicle_name = null;
	}

	public String getDropped_driver_id() {
		return dropped_driver_id;
	}

	public String getDropped_driver_idEx() {
		return dropped_driver_id != null ? dropped_driver_id : "";
	}

	public void setDropped_driver_id(String dropped_driver_id) {
		this.dropped_driver_id = dropped_driver_id;
	}

	public void unSetDropped_driver_id() {
		this.dropped_driver_id = null;
	}

	public String getDropped_driver_name() {
		return dropped_driver_name;
	}

	public String getDropped_driver_nameEx() {
		return dropped_driver_name != null ? dropped_driver_name : "";
	}

	public void setDropped_driver_name(String dropped_driver_name) {
		this.dropped_driver_name = dropped_driver_name;
	}

	public void unSetDropped_driver_name() {
		this.dropped_driver_name = null;
	}

	public String getDropped_driver_mobile_no() {
		return dropped_driver_mobile_no;
	}

	public String getDropped_driver_mobile_noEx() {
		return dropped_driver_mobile_no != null ? dropped_driver_mobile_no : "";
	}

	public void setDropped_driver_mobile_no(String dropped_driver_mobile_no) {
		this.dropped_driver_mobile_no = dropped_driver_mobile_no;
	}

	public void unSetDropped_driver_mobile_no() {
		this.dropped_driver_mobile_no = null;
	}

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
	}

	public String getBus_started() {
		return bus_started;
	}

	public String getBus_startedEx() {
		return bus_started != null ? bus_started : "";
	}

	public void setBus_started(String bus_started) {
		this.bus_started = bus_started;
	}

	public void unSetBus_started() {
		this.bus_started = null;
	}

	public String getLast_stopage_name() {
		return last_stopage_name;
	}

	public String getLast_stopage_nameEx() {
		return last_stopage_name != null ? last_stopage_name : "";
	}

	public void setLast_stopage_name(String last_stopage_name) {
		this.last_stopage_name = last_stopage_name;
	}

	public void unSetLast_stopage_name() {
		this.last_stopage_name = null;
	}

	public Long getLast_stopage_time() {
		return last_stopage_time;
	}

	public long getLast_stopage_timeEx() {
		return last_stopage_time != null ? last_stopage_time : 0L;
	}

	public void setLast_stopage_time(long last_stopage_time) {
		this.last_stopage_time = last_stopage_time;
	}

	public void setLast_stopage_time(Long last_stopage_time) {
		this.last_stopage_time = last_stopage_time;
	}

	public void unSetLast_stopage_time() {
		this.last_stopage_time = null;
	}

	public Long getReaching_time() {
		return reaching_time;
	}

	public long getReaching_timeEx() {
		return reaching_time != null ? reaching_time : 0L;
	}

	public void setReaching_time(long reaching_time) {
		this.reaching_time = reaching_time;
	}

	public void setReaching_time(Long reaching_time) {
		this.reaching_time = reaching_time;
	}

	public void unSetReaching_time() {
		this.reaching_time = null;
	}

	public String getReached() {
		return reached;
	}

	public String getReachedEx() {
		return reached != null ? reached : "";
	}

	public void setReached(String reached) {
		this.reached = reached;
	}

	public void unSetReached() {
		this.reached = null;
	}

	public String getAlert_pickup_route_stopage_id() {
		return alert_pickup_route_stopage_id;
	}

	public String getAlert_pickup_route_stopage_idEx() {
		return alert_pickup_route_stopage_id != null ? alert_pickup_route_stopage_id : "";
	}

	public void setAlert_pickup_route_stopage_id(String alert_pickup_route_stopage_id) {
		this.alert_pickup_route_stopage_id = alert_pickup_route_stopage_id;
	}

	public void unSetAlert_pickup_route_stopage_id() {
		this.alert_pickup_route_stopage_id = null;
	}

	public String getAlert_dropped_route_stopage_id() {
		return alert_dropped_route_stopage_id;
	}

	public String getAlert_dropped_route_stopage_idEx() {
		return alert_dropped_route_stopage_id != null ? alert_dropped_route_stopage_id : "";
	}

	public void setAlert_dropped_route_stopage_id(String alert_dropped_route_stopage_id) {
		this.alert_dropped_route_stopage_id = alert_dropped_route_stopage_id;
	}

	public void unSetAlert_dropped_route_stopage_id() {
		this.alert_dropped_route_stopage_id = null;
	}

	public String getAlert_pickup_stopage_name() {
		return alert_pickup_stopage_name;
	}

	public String getAlert_pickup_stopage_nameEx() {
		return alert_pickup_stopage_name != null ? alert_pickup_stopage_name : "";
	}

	public void setAlert_pickup_stopage_name(String alert_pickup_stopage_name) {
		this.alert_pickup_stopage_name = alert_pickup_stopage_name;
	}

	public void unSetAlert_pickup_stopage_name() {
		this.alert_pickup_stopage_name = null;
	}

	public String getAlert_dropped_stopage_name() {
		return alert_dropped_stopage_name;
	}

	public String getAlert_dropped_stopage_nameEx() {
		return alert_dropped_stopage_name != null ? alert_dropped_stopage_name : "";
	}

	public void setAlert_dropped_stopage_name(String alert_dropped_stopage_name) {
		this.alert_dropped_stopage_name = alert_dropped_stopage_name;
	}

	public void unSetAlert_dropped_stopage_name() {
		this.alert_dropped_stopage_name = null;
	}

	public String getStopage_alert_sms() {
		return stopage_alert_sms != null ? stopage_alert_sms : "N";
	}

	public void setStopage_alert_sms(String stopage_alert_sms) {
		this.stopage_alert_sms = stopage_alert_sms;
	}

	public void unSetStopage_alert_sms() {
		this.stopage_alert_sms = "N";
	}

	public String getStopage_alert_mobile_app() {
		return stopage_alert_mobile_app != null ? stopage_alert_mobile_app : "Y";
	}

	public void setStopage_alert_mobile_app(String stopage_alert_mobile_app) {
		this.stopage_alert_mobile_app = stopage_alert_mobile_app;
	}

	public void unSetStopage_alert_mobile_app() {
		this.stopage_alert_mobile_app = "Y";
	}

	public String getStopage_alert_email() {
		return stopage_alert_email != null ? stopage_alert_email : "N";
	}

	public void setStopage_alert_email(String stopage_alert_email) {
		this.stopage_alert_email = stopage_alert_email;
	}

	public void unSetStopage_alert_email() {
		this.stopage_alert_email = "N";
	}

	public String getFeature_parent2parent_chat() {
		return feature_parent2parent_chat != null ? feature_parent2parent_chat : "N";
	}

	public void setFeature_parent2parent_chat(String feature_parent2parent_chat) {
		this.feature_parent2parent_chat = feature_parent2parent_chat;
	}

	public void unSetFeature_parent2parent_chat() {
		this.feature_parent2parent_chat = "N";
	}

	public String getFeature_homework() {
		return feature_homework != null ? feature_homework : "N";
	}

	public void setFeature_homework(String feature_homework) {
		this.feature_homework = feature_homework;
	}

	public void unSetFeature_homework() {
		this.feature_homework = "N";
	}

	public String getFeature_parent2teacher_chat() {
		return feature_parent2teacher_chat != null ? feature_parent2teacher_chat : "N";
	}

	public void setFeature_parent2teacher_chat(String feature_parent2teacher_chat) {
		this.feature_parent2teacher_chat = feature_parent2teacher_chat;
	}

	public void unSetFeature_parent2teacher_chat() {
		this.feature_parent2teacher_chat = "N";
	}

	public String getFeature_teacher2parent_chat() {
		return feature_teacher2parent_chat != null ? feature_teacher2parent_chat : "N";
	}

	public void setFeature_teacher2parent_chat(String feature_teacher2parent_chat) {
		this.feature_teacher2parent_chat = feature_teacher2parent_chat;
	}

	public void unSetFeature_teacher2parent_chat() {
		this.feature_teacher2parent_chat = "N";
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}