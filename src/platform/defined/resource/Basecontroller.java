/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basecontroller extends BaseResource {
	private String id = null;
	private String name = null;
	private String hardware_vendor_id = null;
	private String appliance_id = null;
	private String mfg_date = null;
	private String model = null;
	private String manager = null;
	private String serial_number = null;
	private Integer number_of_ports = null;
	private String hardware_version = null;
	private String software_version = null;
	private String gateway_id = null;
	private String gateway_name = null;
	private String site_id = null;
	private String site_name = null;
	private Integer overload_pulse_count_duration = null;
	private Integer retry_interval = null;
	private Integer number_of_retry = null;
	private Long creation_time = null;
	private Long last_modified_time = null;
	private String created_by_profile_id = null;
	private String created_by_profile_name = null;
	private String last_updated_by_profile_id = null;
	private String last_updated_by_profile_name = null;
	private String remark = null;
	private String status = null;
	private String tower_id = null;
	private String dic_local_id = null;
	private String dic_connection_string = null;
	private String connection_ip = null;
	private String connection_port = null;
	private String type = null;
	private String inventory_state = null;
	private Integer poll_period = null;
	private Integer sync_interval = null;
	private Integer pdi = null;
	private Integer dg_no = null;
	private Integer major_version = null;
	private Integer minor_version = null;
	private String customer_id = null;
	private String battery_status = null;
	private String activated = null;
	private String connected = null;
	private String hardware_error = null;
	private String dg_on = null;
	private String config = null;
	private Long last_data_received = null;
	private Long last_reading_received = null;
	private Integer deployed_major_version = null;
	private Integer deployed_minor_version = null;
	private Number upgrade_status = null;
	private String admin_status = null;
	private Integer heartbeat_interval = null;
	private Integer data_read_interval = null;
	private String password = null;
	private Double multiple_factor_port3001 = null;
	private Double multiple_factor_port3002 = null;
	private Double multiple_factor_port3003 = null;
	private Double multiple_factor_port3004 = null;
	private Double multiple_factor_port3005 = null;
	private Double multiple_factor_port3006 = null;
	private Double multiple_factor_port3007 = null;
	private Double multiple_factor_port3000 = null;
	private String packet_capture = null;
	private String deployment_type = null;
	private String school_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_HARDWARE_VENDOR_ID = "hardware_vendor_id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_MFG_DATE = "mfg_date";
	public static String FIELD_MODEL = "model";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_SERIAL_NUMBER = "serial_number";
	public static String FIELD_NUMBER_OF_PORTS = "number_of_ports";
	public static String FIELD_HARDWARE_VERSION = "hardware_version";
	public static String FIELD_SOFTWARE_VERSION = "software_version";
	public static String FIELD_GATEWAY_ID = "gateway_id";
	public static String FIELD_GATEWAY_NAME = "gateway_name";
	public static String FIELD_SITE_ID = "site_id";
	public static String FIELD_SITE_NAME = "site_name";
	public static String FIELD_OVERLOAD_PULSE_COUNT_DURATION = "overload_pulse_count_duration";
	public static String FIELD_RETRY_INTERVAL = "retry_interval";
	public static String FIELD_NUMBER_OF_RETRY = "number_of_retry";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_MODIFIED_TIME = "last_modified_time";
	public static String FIELD_CREATED_BY_PROFILE_ID = "created_by_profile_id";
	public static String FIELD_CREATED_BY_PROFILE_NAME = "created_by_profile_name";
	public static String FIELD_LAST_UPDATED_BY_PROFILE_ID = "last_updated_by_profile_id";
	public static String FIELD_LAST_UPDATED_BY_PROFILE_NAME = "last_updated_by_profile_name";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_STATUS = "status";
	public static String FIELD_TOWER_ID = "tower_id";
	public static String FIELD_DIC_LOCAL_ID = "dic_local_id";
	public static String FIELD_DIC_CONNECTION_STRING = "dic_connection_string";
	public static String FIELD_CONNECTION_IP = "connection_ip";
	public static String FIELD_CONNECTION_PORT = "connection_port";
	public static String FIELD_TYPE = "type";
	public static String FIELD_INVENTORY_STATE = "inventory_state";
	public static String FIELD_POLL_PERIOD = "poll_period";
	public static String FIELD_SYNC_INTERVAL = "sync_interval";
	public static String FIELD_PDI = "pdi";
	public static String FIELD_DG_NO = "dg_no";
	public static String FIELD_MAJOR_VERSION = "major_version";
	public static String FIELD_MINOR_VERSION = "minor_version";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_BATTERY_STATUS = "battery_status";
	public static String FIELD_ACTIVATED = "activated";
	public static String FIELD_CONNECTED = "connected";
	public static String FIELD_HARDWARE_ERROR = "hardware_error";
	public static String FIELD_DG_ON = "dg_on";
	public static String FIELD_CONFIG = "config";
	public static String FIELD_LAST_DATA_RECEIVED = "last_data_received";
	public static String FIELD_LAST_READING_RECEIVED = "last_reading_received";
	public static String FIELD_DEPLOYED_MAJOR_VERSION = "deployed_major_version";
	public static String FIELD_DEPLOYED_MINOR_VERSION = "deployed_minor_version";
	public static String FIELD_UPGRADE_STATUS = "upgrade_status";
	public static String FIELD_ADMIN_STATUS = "admin_status";
	public static String FIELD_HEARTBEAT_INTERVAL = "heartbeat_interval";
	public static String FIELD_DATA_READ_INTERVAL = "data_read_interval";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_MULTIPLE_FACTOR_PORT3001 = "multiple_factor_port3001";
	public static String FIELD_MULTIPLE_FACTOR_PORT3002 = "multiple_factor_port3002";
	public static String FIELD_MULTIPLE_FACTOR_PORT3003 = "multiple_factor_port3003";
	public static String FIELD_MULTIPLE_FACTOR_PORT3004 = "multiple_factor_port3004";
	public static String FIELD_MULTIPLE_FACTOR_PORT3005 = "multiple_factor_port3005";
	public static String FIELD_MULTIPLE_FACTOR_PORT3006 = "multiple_factor_port3006";
	public static String FIELD_MULTIPLE_FACTOR_PORT3007 = "multiple_factor_port3007";
	public static String FIELD_MULTIPLE_FACTOR_PORT3000 = "multiple_factor_port3000";
	public static String FIELD_PACKET_CAPTURE = "packet_capture";
	public static String FIELD_DEPLOYMENT_TYPE = "deployment_type";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("controller");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(100);
		metaData.addField(nameField);

		Field hardware_vendor_idField = new Field("hardware_vendor_id", "String");
		hardware_vendor_idField.setLength(128);
		metaData.addField(hardware_vendor_idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field mfg_dateField = new Field("mfg_date", "String");
		mfg_dateField.setLength(20);
		metaData.addField(mfg_dateField);

		Field modelField = new Field("model", "String");
		modelField.setLength(50);
		metaData.addField(modelField);

		Field managerField = new Field("manager", "String");
		managerField.setLength(50);
		metaData.addField(managerField);

		Field serial_numberField = new Field("serial_number", "String");
		serial_numberField.setLength(32);
		metaData.addField(serial_numberField);

		Field number_of_portsField = new Field("number_of_ports", "int");
		number_of_portsField.setDefaultValue(12);
		number_of_portsField.setLength(3);
		metaData.addField(number_of_portsField);

		Field hardware_versionField = new Field("hardware_version", "String");
		hardware_versionField.setLength(50);
		metaData.addField(hardware_versionField);

		Field software_versionField = new Field("software_version", "String");
		software_versionField.setLength(50);
		metaData.addField(software_versionField);

		Field gateway_idField = new Field("gateway_id", "String");
		gateway_idField.setLength(128);
		metaData.addField(gateway_idField);

		Field gateway_nameField = new Field("gateway_name", "String");
		gateway_nameField.setLength(128);
		metaData.addField(gateway_nameField);

		Field site_idField = new Field("site_id", "String");
		site_idField.setLength(128);
		metaData.addField(site_idField);

		Field site_nameField = new Field("site_name", "String");
		site_nameField.setLength(128);
		metaData.addField(site_nameField);

		Field overload_pulse_count_durationField = new Field("overload_pulse_count_duration", "int");
		overload_pulse_count_durationField.setDefaultValue(30);
		overload_pulse_count_durationField.setLength(3);
		metaData.addField(overload_pulse_count_durationField);

		Field retry_intervalField = new Field("retry_interval", "int");
		retry_intervalField.setDefaultValue(1);
		retry_intervalField.setLength(3);
		metaData.addField(retry_intervalField);

		Field number_of_retryField = new Field("number_of_retry", "int");
		number_of_retryField.setDefaultValue(3);
		number_of_retryField.setLength(3);
		metaData.addField(number_of_retryField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field last_modified_timeField = new Field("last_modified_time", "timestamp");
		metaData.addField(last_modified_timeField);

		Field created_by_profile_idField = new Field("created_by_profile_id", "String");
		created_by_profile_idField.setLength(128);
		metaData.addField(created_by_profile_idField);

		Field created_by_profile_nameField = new Field("created_by_profile_name", "String");
		created_by_profile_nameField.setLength(128);
		metaData.addField(created_by_profile_nameField);

		Field last_updated_by_profile_idField = new Field("last_updated_by_profile_id", "String");
		last_updated_by_profile_idField.setLength(128);
		metaData.addField(last_updated_by_profile_idField);

		Field last_updated_by_profile_nameField = new Field("last_updated_by_profile_name", "String");
		last_updated_by_profile_nameField.setLength(128);
		metaData.addField(last_updated_by_profile_nameField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field statusField = new Field("status", "String");
		statusField.setDefaultValue("C");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field tower_idField = new Field("tower_id", "String");
		tower_idField.setLength(128);
		metaData.addField(tower_idField);

		Field dic_local_idField = new Field("dic_local_id", "String");
		dic_local_idField.setLength(64);
		metaData.addField(dic_local_idField);

		Field dic_connection_stringField = new Field("dic_connection_string", "String");
		dic_connection_stringField.setLength(255);
		metaData.addField(dic_connection_stringField);

		Field connection_ipField = new Field("connection_ip", "String");
		connection_ipField.setLength(255);
		metaData.addField(connection_ipField);

		Field connection_portField = new Field("connection_port", "String");
		connection_portField.setLength(255);
		metaData.addField(connection_portField);

		Field typeField = new Field("type", "String");
		typeField.setLength(16);
		metaData.addField(typeField);

		Field inventory_stateField = new Field("inventory_state", "String");
		inventory_stateField.setLength(16);
		metaData.addField(inventory_stateField);

		Field poll_periodField = new Field("poll_period", "int");
		poll_periodField.setDefaultValue(30);
		poll_periodField.setLength(8);
		metaData.addField(poll_periodField);

		Field sync_intervalField = new Field("sync_interval", "int");
		sync_intervalField.setDefaultValue(30);
		sync_intervalField.setLength(8);
		metaData.addField(sync_intervalField);

		Field pdiField = new Field("pdi", "int");
		pdiField.setDefaultValue(30);
		pdiField.setLength(8);
		metaData.addField(pdiField);

		Field dg_noField = new Field("dg_no", "int");
		dg_noField.setDefaultValue(0);
		dg_noField.setLength(4);
		metaData.addField(dg_noField);

		Field major_versionField = new Field("major_version", "int");
		major_versionField.setLength(4);
		metaData.addField(major_versionField);

		Field minor_versionField = new Field("minor_version", "int");
		minor_versionField.setLength(15);
		metaData.addField(minor_versionField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field battery_statusField = new Field("battery_status", "String");
		battery_statusField.setDefaultValue("M");
		battery_statusField.setLength(1);
		metaData.addField(battery_statusField);

		Field activatedField = new Field("activated", "String");
		activatedField.setDefaultValue("N");
		activatedField.setLength(1);
		metaData.addField(activatedField);

		Field connectedField = new Field("connected", "String");
		connectedField.setDefaultValue("N");
		connectedField.setLength(1);
		metaData.addField(connectedField);

		Field hardware_errorField = new Field("hardware_error", "String");
		hardware_errorField.setDefaultValue("N");
		hardware_errorField.setLength(1);
		metaData.addField(hardware_errorField);

		Field dg_onField = new Field("dg_on", "String");
		dg_onField.setLength(1);
		metaData.addField(dg_onField);

		Field configField = new Field("config", "String");
		configField.setDefaultValue("Y");
		configField.setLength(1);
		metaData.addField(configField);

		Field last_data_receivedField = new Field("last_data_received", "timestamp");
		metaData.addField(last_data_receivedField);

		Field last_reading_receivedField = new Field("last_reading_received", "timestamp");
		metaData.addField(last_reading_receivedField);

		Field deployed_major_versionField = new Field("deployed_major_version", "int");
		deployed_major_versionField.setLength(4);
		metaData.addField(deployed_major_versionField);

		Field deployed_minor_versionField = new Field("deployed_minor_version", "int");
		deployed_minor_versionField.setLength(15);
		metaData.addField(deployed_minor_versionField);

		Field upgrade_statusField = new Field("upgrade_status", "Number");
		upgrade_statusField.setDefaultValue(100.00);
		upgrade_statusField.setLength(5);
		upgrade_statusField.setPrecision(2);
		metaData.addField(upgrade_statusField);

		Field admin_statusField = new Field("admin_status", "String");
		admin_statusField.setDefaultValue("N");
		admin_statusField.setLength(1);
		metaData.addField(admin_statusField);

		Field heartbeat_intervalField = new Field("heartbeat_interval", "int");
		heartbeat_intervalField.setDefaultValue(0);
		metaData.addField(heartbeat_intervalField);

		Field data_read_intervalField = new Field("data_read_interval", "int");
		data_read_intervalField.setDefaultValue(0);
		metaData.addField(data_read_intervalField);

		Field passwordField = new Field("password", "String");
		passwordField.setLength(10);
		metaData.addField(passwordField);

		Field multiple_factor_port3001Field = new Field("multiple_factor_port3001", "double");
		metaData.addField(multiple_factor_port3001Field);

		Field multiple_factor_port3002Field = new Field("multiple_factor_port3002", "double");
		metaData.addField(multiple_factor_port3002Field);

		Field multiple_factor_port3003Field = new Field("multiple_factor_port3003", "double");
		metaData.addField(multiple_factor_port3003Field);

		Field multiple_factor_port3004Field = new Field("multiple_factor_port3004", "double");
		metaData.addField(multiple_factor_port3004Field);

		Field multiple_factor_port3005Field = new Field("multiple_factor_port3005", "double");
		metaData.addField(multiple_factor_port3005Field);

		Field multiple_factor_port3006Field = new Field("multiple_factor_port3006", "double");
		metaData.addField(multiple_factor_port3006Field);

		Field multiple_factor_port3007Field = new Field("multiple_factor_port3007", "double");
		metaData.addField(multiple_factor_port3007Field);

		Field multiple_factor_port3000Field = new Field("multiple_factor_port3000", "double");
		metaData.addField(multiple_factor_port3000Field);

		Field packet_captureField = new Field("packet_capture", "String");
		packet_captureField.setDefaultValue("N");
		packet_captureField.setLength(1);
		metaData.addField(packet_captureField);

		Field deployment_typeField = new Field("deployment_type", "String");
		deployment_typeField.setDefaultValue("N");
		deployment_typeField.setLength(1);
		metaData.addField(deployment_typeField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("controller");

		metaData.setCluster("DB_DEVICE");
	}

	public Basecontroller() {}

	public Basecontroller(Basecontroller obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.hardware_vendor_id = obj.hardware_vendor_id;
		this.appliance_id = obj.appliance_id;
		this.mfg_date = obj.mfg_date;
		this.model = obj.model;
		this.manager = obj.manager;
		this.serial_number = obj.serial_number;
		this.number_of_ports = obj.number_of_ports;
		this.hardware_version = obj.hardware_version;
		this.software_version = obj.software_version;
		this.gateway_id = obj.gateway_id;
		this.gateway_name = obj.gateway_name;
		this.site_id = obj.site_id;
		this.site_name = obj.site_name;
		this.overload_pulse_count_duration = obj.overload_pulse_count_duration;
		this.retry_interval = obj.retry_interval;
		this.number_of_retry = obj.number_of_retry;
		this.creation_time = obj.creation_time;
		this.last_modified_time = obj.last_modified_time;
		this.created_by_profile_id = obj.created_by_profile_id;
		this.created_by_profile_name = obj.created_by_profile_name;
		this.last_updated_by_profile_id = obj.last_updated_by_profile_id;
		this.last_updated_by_profile_name = obj.last_updated_by_profile_name;
		this.remark = obj.remark;
		this.status = obj.status;
		this.tower_id = obj.tower_id;
		this.dic_local_id = obj.dic_local_id;
		this.dic_connection_string = obj.dic_connection_string;
		this.connection_ip = obj.connection_ip;
		this.connection_port = obj.connection_port;
		this.type = obj.type;
		this.inventory_state = obj.inventory_state;
		this.poll_period = obj.poll_period;
		this.sync_interval = obj.sync_interval;
		this.pdi = obj.pdi;
		this.dg_no = obj.dg_no;
		this.major_version = obj.major_version;
		this.minor_version = obj.minor_version;
		this.customer_id = obj.customer_id;
		this.battery_status = obj.battery_status;
		this.activated = obj.activated;
		this.connected = obj.connected;
		this.hardware_error = obj.hardware_error;
		this.dg_on = obj.dg_on;
		this.config = obj.config;
		this.last_data_received = obj.last_data_received;
		this.last_reading_received = obj.last_reading_received;
		this.deployed_major_version = obj.deployed_major_version;
		this.deployed_minor_version = obj.deployed_minor_version;
		this.upgrade_status = obj.upgrade_status;
		this.admin_status = obj.admin_status;
		this.heartbeat_interval = obj.heartbeat_interval;
		this.data_read_interval = obj.data_read_interval;
		this.password = obj.password;
		this.multiple_factor_port3001 = obj.multiple_factor_port3001;
		this.multiple_factor_port3002 = obj.multiple_factor_port3002;
		this.multiple_factor_port3003 = obj.multiple_factor_port3003;
		this.multiple_factor_port3004 = obj.multiple_factor_port3004;
		this.multiple_factor_port3005 = obj.multiple_factor_port3005;
		this.multiple_factor_port3006 = obj.multiple_factor_port3006;
		this.multiple_factor_port3007 = obj.multiple_factor_port3007;
		this.multiple_factor_port3000 = obj.multiple_factor_port3000;
		this.packet_capture = obj.packet_capture;
		this.deployment_type = obj.deployment_type;
		this.school_id = obj.school_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(number_of_ports == null)
			number_of_ports = 12;
		if(overload_pulse_count_duration == null)
			overload_pulse_count_duration = 30;
		if(retry_interval == null)
			retry_interval = 1;
		if(number_of_retry == null)
			number_of_retry = 3;
		if(status == null)
			status = "C";
		if(poll_period == null)
			poll_period = 30;
		if(sync_interval == null)
			sync_interval = 30;
		if(pdi == null)
			pdi = 30;
		if(dg_no == null)
			dg_no = 0;
		if(battery_status == null)
			battery_status = "M";
		if(activated == null)
			activated = "N";
		if(connected == null)
			connected = "N";
		if(hardware_error == null)
			hardware_error = "N";
		if(config == null)
			config = "Y";
		if(upgrade_status == null)
			upgrade_status = 100.00;
		if(admin_status == null)
			admin_status = "N";
		if(heartbeat_interval == null)
			heartbeat_interval = 0;
		if(data_read_interval == null)
			data_read_interval = 0;
		if(packet_capture == null)
			packet_capture = "N";
		if(deployment_type == null)
			deployment_type = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(hardware_vendor_id != null)
			map.put("hardware_vendor_id", hardware_vendor_id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(mfg_date != null)
			map.put("mfg_date", mfg_date);
		if(model != null)
			map.put("model", model);
		if(manager != null)
			map.put("manager", manager);
		if(serial_number != null)
			map.put("serial_number", serial_number);
		if(number_of_ports != null)
			map.put("number_of_ports", number_of_ports);
		if(hardware_version != null)
			map.put("hardware_version", hardware_version);
		if(software_version != null)
			map.put("software_version", software_version);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(gateway_name != null)
			map.put("gateway_name", gateway_name);
		if(site_id != null)
			map.put("site_id", site_id);
		if(site_name != null)
			map.put("site_name", site_name);
		if(overload_pulse_count_duration != null)
			map.put("overload_pulse_count_duration", overload_pulse_count_duration);
		if(retry_interval != null)
			map.put("retry_interval", retry_interval);
		if(number_of_retry != null)
			map.put("number_of_retry", number_of_retry);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_modified_time != null)
			map.put("last_modified_time", last_modified_time);
		if(created_by_profile_id != null)
			map.put("created_by_profile_id", created_by_profile_id);
		if(created_by_profile_name != null)
			map.put("created_by_profile_name", created_by_profile_name);
		if(last_updated_by_profile_id != null)
			map.put("last_updated_by_profile_id", last_updated_by_profile_id);
		if(last_updated_by_profile_name != null)
			map.put("last_updated_by_profile_name", last_updated_by_profile_name);
		if(remark != null)
			map.put("remark", remark);
		if(status != null)
			map.put("status", status);
		if(tower_id != null)
			map.put("tower_id", tower_id);
		if(dic_local_id != null)
			map.put("dic_local_id", dic_local_id);
		if(dic_connection_string != null)
			map.put("dic_connection_string", dic_connection_string);
		if(connection_ip != null)
			map.put("connection_ip", connection_ip);
		if(connection_port != null)
			map.put("connection_port", connection_port);
		if(type != null)
			map.put("type", type);
		if(inventory_state != null)
			map.put("inventory_state", inventory_state);
		if(poll_period != null)
			map.put("poll_period", poll_period);
		if(sync_interval != null)
			map.put("sync_interval", sync_interval);
		if(pdi != null)
			map.put("pdi", pdi);
		if(dg_no != null)
			map.put("dg_no", dg_no);
		if(major_version != null)
			map.put("major_version", major_version);
		if(minor_version != null)
			map.put("minor_version", minor_version);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(battery_status != null)
			map.put("battery_status", battery_status);
		if(activated != null)
			map.put("activated", activated);
		if(connected != null)
			map.put("connected", connected);
		if(hardware_error != null)
			map.put("hardware_error", hardware_error);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(config != null)
			map.put("config", config);
		if(last_data_received != null)
			map.put("last_data_received", last_data_received);
		if(last_reading_received != null)
			map.put("last_reading_received", last_reading_received);
		if(deployed_major_version != null)
			map.put("deployed_major_version", deployed_major_version);
		if(deployed_minor_version != null)
			map.put("deployed_minor_version", deployed_minor_version);
		if(upgrade_status != null)
			map.put("upgrade_status", upgrade_status);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
		if(data_read_interval != null)
			map.put("data_read_interval", data_read_interval);
		if(password != null)
			map.put("password", password);
		if(multiple_factor_port3001 != null)
			map.put("multiple_factor_port3001", multiple_factor_port3001);
		if(multiple_factor_port3002 != null)
			map.put("multiple_factor_port3002", multiple_factor_port3002);
		if(multiple_factor_port3003 != null)
			map.put("multiple_factor_port3003", multiple_factor_port3003);
		if(multiple_factor_port3004 != null)
			map.put("multiple_factor_port3004", multiple_factor_port3004);
		if(multiple_factor_port3005 != null)
			map.put("multiple_factor_port3005", multiple_factor_port3005);
		if(multiple_factor_port3006 != null)
			map.put("multiple_factor_port3006", multiple_factor_port3006);
		if(multiple_factor_port3007 != null)
			map.put("multiple_factor_port3007", multiple_factor_port3007);
		if(multiple_factor_port3000 != null)
			map.put("multiple_factor_port3000", multiple_factor_port3000);
		if(packet_capture != null)
			map.put("packet_capture", packet_capture);
		if(deployment_type != null)
			map.put("deployment_type", deployment_type);
		if(school_id != null)
			map.put("school_id", school_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateName(add))
			map.put("name", name);
		if(hardware_vendor_id != null)
			map.put("hardware_vendor_id", hardware_vendor_id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(mfg_date != null)
			map.put("mfg_date", mfg_date);
		if(model != null)
			map.put("model", model);
		if(manager != null)
			map.put("manager", manager);
		if(serial_number != null)
			map.put("serial_number", serial_number);
		if(number_of_ports != null)
			map.put("number_of_ports", number_of_ports);
		if(hardware_version != null)
			map.put("hardware_version", hardware_version);
		if(software_version != null)
			map.put("software_version", software_version);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(gateway_name != null)
			map.put("gateway_name", gateway_name);
		if(site_id != null)
			map.put("site_id", site_id);
		if(site_name != null)
			map.put("site_name", site_name);
		if(overload_pulse_count_duration != null)
			map.put("overload_pulse_count_duration", overload_pulse_count_duration);
		if(retry_interval != null)
			map.put("retry_interval", retry_interval);
		if(number_of_retry != null)
			map.put("number_of_retry", number_of_retry);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(last_modified_time != null)
			map.put("last_modified_time", last_modified_time);
		if(created_by_profile_id != null)
			map.put("created_by_profile_id", created_by_profile_id);
		if(created_by_profile_name != null)
			map.put("created_by_profile_name", created_by_profile_name);
		if(last_updated_by_profile_id != null)
			map.put("last_updated_by_profile_id", last_updated_by_profile_id);
		if(last_updated_by_profile_name != null)
			map.put("last_updated_by_profile_name", last_updated_by_profile_name);
		if(remark != null)
			map.put("remark", remark);
		if(status != null)
			map.put("status", status);
		if(tower_id != null)
			map.put("tower_id", tower_id);
		if(dic_local_id != null)
			map.put("dic_local_id", dic_local_id);
		if(dic_connection_string != null)
			map.put("dic_connection_string", dic_connection_string);
		if(connection_ip != null)
			map.put("connection_ip", connection_ip);
		if(connection_port != null)
			map.put("connection_port", connection_port);
		if(type != null)
			map.put("type", type);
		if(inventory_state != null)
			map.put("inventory_state", inventory_state);
		if(poll_period != null)
			map.put("poll_period", poll_period);
		if(sync_interval != null)
			map.put("sync_interval", sync_interval);
		if(pdi != null)
			map.put("pdi", pdi);
		if(dg_no != null)
			map.put("dg_no", dg_no);
		if(major_version != null)
			map.put("major_version", major_version);
		if(minor_version != null)
			map.put("minor_version", minor_version);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(battery_status != null)
			map.put("battery_status", battery_status);
		if(activated != null)
			map.put("activated", activated);
		if(connected != null)
			map.put("connected", connected);
		if(hardware_error != null)
			map.put("hardware_error", hardware_error);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(config != null)
			map.put("config", config);
		if(last_data_received != null)
			map.put("last_data_received", last_data_received);
		if(last_reading_received != null)
			map.put("last_reading_received", last_reading_received);
		if(deployed_major_version != null)
			map.put("deployed_major_version", deployed_major_version);
		if(deployed_minor_version != null)
			map.put("deployed_minor_version", deployed_minor_version);
		if(upgrade_status != null)
			map.put("upgrade_status", upgrade_status);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
		if(data_read_interval != null)
			map.put("data_read_interval", data_read_interval);
		if(password != null)
			map.put("password", password);
		if(multiple_factor_port3001 != null)
			map.put("multiple_factor_port3001", multiple_factor_port3001);
		if(multiple_factor_port3002 != null)
			map.put("multiple_factor_port3002", multiple_factor_port3002);
		if(multiple_factor_port3003 != null)
			map.put("multiple_factor_port3003", multiple_factor_port3003);
		if(multiple_factor_port3004 != null)
			map.put("multiple_factor_port3004", multiple_factor_port3004);
		if(multiple_factor_port3005 != null)
			map.put("multiple_factor_port3005", multiple_factor_port3005);
		if(multiple_factor_port3006 != null)
			map.put("multiple_factor_port3006", multiple_factor_port3006);
		if(multiple_factor_port3007 != null)
			map.put("multiple_factor_port3007", multiple_factor_port3007);
		if(multiple_factor_port3000 != null)
			map.put("multiple_factor_port3000", multiple_factor_port3000);
		if(packet_capture != null)
			map.put("packet_capture", packet_capture);
		if(deployment_type != null)
			map.put("deployment_type", deployment_type);
		if(school_id != null)
			map.put("school_id", school_id);
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
		name = (String) map.get("name");
		hardware_vendor_id = (String) map.get("hardware_vendor_id");
		appliance_id = (String) map.get("appliance_id");
		mfg_date = (String) map.get("mfg_date");
		model = (String) map.get("model");
		manager = (String) map.get("manager");
		serial_number = (String) map.get("serial_number");
		number_of_ports = (Integer) map.get("number_of_ports");
		hardware_version = (String) map.get("hardware_version");
		software_version = (String) map.get("software_version");
		gateway_id = (String) map.get("gateway_id");
		gateway_name = (String) map.get("gateway_name");
		site_id = (String) map.get("site_id");
		site_name = (String) map.get("site_name");
		overload_pulse_count_duration = (Integer) map.get("overload_pulse_count_duration");
		retry_interval = (Integer) map.get("retry_interval");
		number_of_retry = (Integer) map.get("number_of_retry");
		creation_time = (Long) map.get("creation_time");
		last_modified_time = (Long) map.get("last_modified_time");
		created_by_profile_id = (String) map.get("created_by_profile_id");
		created_by_profile_name = (String) map.get("created_by_profile_name");
		last_updated_by_profile_id = (String) map.get("last_updated_by_profile_id");
		last_updated_by_profile_name = (String) map.get("last_updated_by_profile_name");
		remark = (String) map.get("remark");
		status = (String) map.get("status");
		tower_id = (String) map.get("tower_id");
		dic_local_id = (String) map.get("dic_local_id");
		dic_connection_string = (String) map.get("dic_connection_string");
		connection_ip = (String) map.get("connection_ip");
		connection_port = (String) map.get("connection_port");
		type = (String) map.get("type");
		inventory_state = (String) map.get("inventory_state");
		poll_period = (Integer) map.get("poll_period");
		sync_interval = (Integer) map.get("sync_interval");
		pdi = (Integer) map.get("pdi");
		dg_no = (Integer) map.get("dg_no");
		major_version = (Integer) map.get("major_version");
		minor_version = (Integer) map.get("minor_version");
		customer_id = (String) map.get("customer_id");
		battery_status = (String) map.get("battery_status");
		activated = (String) map.get("activated");
		connected = (String) map.get("connected");
		hardware_error = (String) map.get("hardware_error");
		dg_on = (String) map.get("dg_on");
		config = (String) map.get("config");
		last_data_received = (Long) map.get("last_data_received");
		last_reading_received = (Long) map.get("last_reading_received");
		deployed_major_version = (Integer) map.get("deployed_major_version");
		deployed_minor_version = (Integer) map.get("deployed_minor_version");
		upgrade_status = (Number) map.get("upgrade_status");
		admin_status = (String) map.get("admin_status");
		heartbeat_interval = (Integer) map.get("heartbeat_interval");
		data_read_interval = (Integer) map.get("data_read_interval");
		password = (String) map.get("password");
		multiple_factor_port3001 = (Double) map.get("multiple_factor_port3001");
		multiple_factor_port3002 = (Double) map.get("multiple_factor_port3002");
		multiple_factor_port3003 = (Double) map.get("multiple_factor_port3003");
		multiple_factor_port3004 = (Double) map.get("multiple_factor_port3004");
		multiple_factor_port3005 = (Double) map.get("multiple_factor_port3005");
		multiple_factor_port3006 = (Double) map.get("multiple_factor_port3006");
		multiple_factor_port3007 = (Double) map.get("multiple_factor_port3007");
		multiple_factor_port3000 = (Double) map.get("multiple_factor_port3000");
		packet_capture = (String) map.get("packet_capture");
		deployment_type = (String) map.get("deployment_type");
		school_id = (String) map.get("school_id");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object hardware_vendor_idObj = map.get("hardware_vendor_id");
		if(hardware_vendor_idObj != null)
			hardware_vendor_id = hardware_vendor_idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object mfg_dateObj = map.get("mfg_date");
		if(mfg_dateObj != null)
			mfg_date = mfg_dateObj.toString();

		Object modelObj = map.get("model");
		if(modelObj != null)
			model = modelObj.toString();

		Object managerObj = map.get("manager");
		if(managerObj != null)
			manager = managerObj.toString();

		Object serial_numberObj = map.get("serial_number");
		if(serial_numberObj != null)
			serial_number = serial_numberObj.toString();

		Object number_of_portsObj = map.get("number_of_ports");
		if(number_of_portsObj != null)
			number_of_ports = new Integer(number_of_portsObj.toString());

		Object hardware_versionObj = map.get("hardware_version");
		if(hardware_versionObj != null)
			hardware_version = hardware_versionObj.toString();

		Object software_versionObj = map.get("software_version");
		if(software_versionObj != null)
			software_version = software_versionObj.toString();

		Object gateway_idObj = map.get("gateway_id");
		if(gateway_idObj != null)
			gateway_id = gateway_idObj.toString();

		Object gateway_nameObj = map.get("gateway_name");
		if(gateway_nameObj != null)
			gateway_name = gateway_nameObj.toString();

		Object site_idObj = map.get("site_id");
		if(site_idObj != null)
			site_id = site_idObj.toString();

		Object site_nameObj = map.get("site_name");
		if(site_nameObj != null)
			site_name = site_nameObj.toString();

		Object overload_pulse_count_durationObj = map.get("overload_pulse_count_duration");
		if(overload_pulse_count_durationObj != null)
			overload_pulse_count_duration = new Integer(overload_pulse_count_durationObj.toString());

		Object retry_intervalObj = map.get("retry_interval");
		if(retry_intervalObj != null)
			retry_interval = new Integer(retry_intervalObj.toString());

		Object number_of_retryObj = map.get("number_of_retry");
		if(number_of_retryObj != null)
			number_of_retry = new Integer(number_of_retryObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object last_modified_timeObj = map.get("last_modified_time");
		if(last_modified_timeObj != null)
			last_modified_time = (Long) last_modified_timeObj;

		Object created_by_profile_idObj = map.get("created_by_profile_id");
		if(created_by_profile_idObj != null)
			created_by_profile_id = created_by_profile_idObj.toString();

		Object created_by_profile_nameObj = map.get("created_by_profile_name");
		if(created_by_profile_nameObj != null)
			created_by_profile_name = created_by_profile_nameObj.toString();

		Object last_updated_by_profile_idObj = map.get("last_updated_by_profile_id");
		if(last_updated_by_profile_idObj != null)
			last_updated_by_profile_id = last_updated_by_profile_idObj.toString();

		Object last_updated_by_profile_nameObj = map.get("last_updated_by_profile_name");
		if(last_updated_by_profile_nameObj != null)
			last_updated_by_profile_name = last_updated_by_profile_nameObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object tower_idObj = map.get("tower_id");
		if(tower_idObj != null)
			tower_id = tower_idObj.toString();

		Object dic_local_idObj = map.get("dic_local_id");
		if(dic_local_idObj != null)
			dic_local_id = dic_local_idObj.toString();

		Object dic_connection_stringObj = map.get("dic_connection_string");
		if(dic_connection_stringObj != null)
			dic_connection_string = dic_connection_stringObj.toString();

		Object connection_ipObj = map.get("connection_ip");
		if(connection_ipObj != null)
			connection_ip = connection_ipObj.toString();

		Object connection_portObj = map.get("connection_port");
		if(connection_portObj != null)
			connection_port = connection_portObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object inventory_stateObj = map.get("inventory_state");
		if(inventory_stateObj != null)
			inventory_state = inventory_stateObj.toString();

		Object poll_periodObj = map.get("poll_period");
		if(poll_periodObj != null)
			poll_period = new Integer(poll_periodObj.toString());

		Object sync_intervalObj = map.get("sync_interval");
		if(sync_intervalObj != null)
			sync_interval = new Integer(sync_intervalObj.toString());

		Object pdiObj = map.get("pdi");
		if(pdiObj != null)
			pdi = new Integer(pdiObj.toString());

		Object dg_noObj = map.get("dg_no");
		if(dg_noObj != null)
			dg_no = new Integer(dg_noObj.toString());

		Object major_versionObj = map.get("major_version");
		if(major_versionObj != null)
			major_version = new Integer(major_versionObj.toString());

		Object minor_versionObj = map.get("minor_version");
		if(minor_versionObj != null)
			minor_version = new Integer(minor_versionObj.toString());

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object battery_statusObj = map.get("battery_status");
		if(battery_statusObj != null)
			battery_status = battery_statusObj.toString();

		Object activatedObj = map.get("activated");
		if(activatedObj != null)
			activated = activatedObj.toString();

		Object connectedObj = map.get("connected");
		if(connectedObj != null)
			connected = connectedObj.toString();

		Object hardware_errorObj = map.get("hardware_error");
		if(hardware_errorObj != null)
			hardware_error = hardware_errorObj.toString();

		Object dg_onObj = map.get("dg_on");
		if(dg_onObj != null)
			dg_on = dg_onObj.toString();

		Object configObj = map.get("config");
		if(configObj != null)
			config = configObj.toString();

		Object last_data_receivedObj = map.get("last_data_received");
		if(last_data_receivedObj != null)
			last_data_received = (Long) last_data_receivedObj;

		Object last_reading_receivedObj = map.get("last_reading_received");
		if(last_reading_receivedObj != null)
			last_reading_received = (Long) last_reading_receivedObj;

		Object deployed_major_versionObj = map.get("deployed_major_version");
		if(deployed_major_versionObj != null)
			deployed_major_version = new Integer(deployed_major_versionObj.toString());

		Object deployed_minor_versionObj = map.get("deployed_minor_version");
		if(deployed_minor_versionObj != null)
			deployed_minor_version = new Integer(deployed_minor_versionObj.toString());

		Object upgrade_statusObj = map.get("upgrade_status");
		if(upgrade_statusObj != null)
			upgrade_status = new Double(upgrade_statusObj.toString());

		Object admin_statusObj = map.get("admin_status");
		if(admin_statusObj != null)
			admin_status = admin_statusObj.toString();

		Object heartbeat_intervalObj = map.get("heartbeat_interval");
		if(heartbeat_intervalObj != null)
			heartbeat_interval = new Integer(heartbeat_intervalObj.toString());

		Object data_read_intervalObj = map.get("data_read_interval");
		if(data_read_intervalObj != null)
			data_read_interval = new Integer(data_read_intervalObj.toString());

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object multiple_factor_port3001Obj = map.get("multiple_factor_port3001");
		if(multiple_factor_port3001Obj != null)
			multiple_factor_port3001 = new Double(multiple_factor_port3001Obj.toString());

		Object multiple_factor_port3002Obj = map.get("multiple_factor_port3002");
		if(multiple_factor_port3002Obj != null)
			multiple_factor_port3002 = new Double(multiple_factor_port3002Obj.toString());

		Object multiple_factor_port3003Obj = map.get("multiple_factor_port3003");
		if(multiple_factor_port3003Obj != null)
			multiple_factor_port3003 = new Double(multiple_factor_port3003Obj.toString());

		Object multiple_factor_port3004Obj = map.get("multiple_factor_port3004");
		if(multiple_factor_port3004Obj != null)
			multiple_factor_port3004 = new Double(multiple_factor_port3004Obj.toString());

		Object multiple_factor_port3005Obj = map.get("multiple_factor_port3005");
		if(multiple_factor_port3005Obj != null)
			multiple_factor_port3005 = new Double(multiple_factor_port3005Obj.toString());

		Object multiple_factor_port3006Obj = map.get("multiple_factor_port3006");
		if(multiple_factor_port3006Obj != null)
			multiple_factor_port3006 = new Double(multiple_factor_port3006Obj.toString());

		Object multiple_factor_port3007Obj = map.get("multiple_factor_port3007");
		if(multiple_factor_port3007Obj != null)
			multiple_factor_port3007 = new Double(multiple_factor_port3007Obj.toString());

		Object multiple_factor_port3000Obj = map.get("multiple_factor_port3000");
		if(multiple_factor_port3000Obj != null)
			multiple_factor_port3000 = new Double(multiple_factor_port3000Obj.toString());

		Object packet_captureObj = map.get("packet_capture");
		if(packet_captureObj != null)
			packet_capture = packet_captureObj.toString();

		Object deployment_typeObj = map.get("deployment_type");
		if(deployment_typeObj != null)
			deployment_type = deployment_typeObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

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

	public String getHardware_vendor_id() {
		return hardware_vendor_id;
	}

	public String getHardware_vendor_idEx() {
		return hardware_vendor_id != null ? hardware_vendor_id : "";
	}

	public void setHardware_vendor_id(String hardware_vendor_id) {
		this.hardware_vendor_id = hardware_vendor_id;
	}

	public void unSetHardware_vendor_id() {
		this.hardware_vendor_id = null;
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

	public String getMfg_date() {
		return mfg_date;
	}

	public String getMfg_dateEx() {
		return mfg_date != null ? mfg_date : "";
	}

	public void setMfg_date(String mfg_date) {
		this.mfg_date = mfg_date;
	}

	public void unSetMfg_date() {
		this.mfg_date = null;
	}

	public String getModel() {
		return model;
	}

	public String getModelEx() {
		return model != null ? model : "";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void unSetModel() {
		this.model = null;
	}

	public String getManager() {
		return manager;
	}

	public String getManagerEx() {
		return manager != null ? manager : "";
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void unSetManager() {
		this.manager = null;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public String getSerial_numberEx() {
		return serial_number != null ? serial_number : "";
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}

	public void unSetSerial_number() {
		this.serial_number = null;
	}

	public Integer getNumber_of_ports() {
		return number_of_ports != null ? number_of_ports : 12;
	}

	public void setNumber_of_ports(int number_of_ports) {
		this.number_of_ports = number_of_ports;
	}

	public void setNumber_of_ports(Integer number_of_ports) {
		this.number_of_ports = number_of_ports;
	}

	public void unSetNumber_of_ports() {
		this.number_of_ports = 12;
	}

	public String getHardware_version() {
		return hardware_version;
	}

	public String getHardware_versionEx() {
		return hardware_version != null ? hardware_version : "";
	}

	public void setHardware_version(String hardware_version) {
		this.hardware_version = hardware_version;
	}

	public void unSetHardware_version() {
		this.hardware_version = null;
	}

	public String getSoftware_version() {
		return software_version;
	}

	public String getSoftware_versionEx() {
		return software_version != null ? software_version : "";
	}

	public void setSoftware_version(String software_version) {
		this.software_version = software_version;
	}

	public void unSetSoftware_version() {
		this.software_version = null;
	}

	public String getGateway_id() {
		return gateway_id;
	}

	public String getGateway_idEx() {
		return gateway_id != null ? gateway_id : "";
	}

	public void setGateway_id(String gateway_id) {
		this.gateway_id = gateway_id;
	}

	public void unSetGateway_id() {
		this.gateway_id = null;
	}

	public String getGateway_name() {
		return gateway_name;
	}

	public String getGateway_nameEx() {
		return gateway_name != null ? gateway_name : "";
	}

	public void setGateway_name(String gateway_name) {
		this.gateway_name = gateway_name;
	}

	public void unSetGateway_name() {
		this.gateway_name = null;
	}

	public String getSite_id() {
		return site_id;
	}

	public String getSite_idEx() {
		return site_id != null ? site_id : "";
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public void unSetSite_id() {
		this.site_id = null;
	}

	public String getSite_name() {
		return site_name;
	}

	public String getSite_nameEx() {
		return site_name != null ? site_name : "";
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public void unSetSite_name() {
		this.site_name = null;
	}

	public Integer getOverload_pulse_count_duration() {
		return overload_pulse_count_duration != null ? overload_pulse_count_duration : 30;
	}

	public void setOverload_pulse_count_duration(int overload_pulse_count_duration) {
		this.overload_pulse_count_duration = overload_pulse_count_duration;
	}

	public void setOverload_pulse_count_duration(Integer overload_pulse_count_duration) {
		this.overload_pulse_count_duration = overload_pulse_count_duration;
	}

	public void unSetOverload_pulse_count_duration() {
		this.overload_pulse_count_duration = 30;
	}

	public Integer getRetry_interval() {
		return retry_interval != null ? retry_interval : 1;
	}

	public void setRetry_interval(int retry_interval) {
		this.retry_interval = retry_interval;
	}

	public void setRetry_interval(Integer retry_interval) {
		this.retry_interval = retry_interval;
	}

	public void unSetRetry_interval() {
		this.retry_interval = 1;
	}

	public Integer getNumber_of_retry() {
		return number_of_retry != null ? number_of_retry : 3;
	}

	public void setNumber_of_retry(int number_of_retry) {
		this.number_of_retry = number_of_retry;
	}

	public void setNumber_of_retry(Integer number_of_retry) {
		this.number_of_retry = number_of_retry;
	}

	public void unSetNumber_of_retry() {
		this.number_of_retry = 3;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public boolean validateCreation_time(boolean add) throws ApplicationException {
		if(add && creation_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_time]");
		return creation_time != null;
	}

	public Long getLast_modified_time() {
		return last_modified_time;
	}

	public void setLast_modified_time(Long last_modified_time) {
		this.last_modified_time = last_modified_time;
	}


	public String getCreated_by_profile_id() {
		return created_by_profile_id;
	}

	public String getCreated_by_profile_idEx() {
		return created_by_profile_id != null ? created_by_profile_id : "";
	}

	public void setCreated_by_profile_id(String created_by_profile_id) {
		this.created_by_profile_id = created_by_profile_id;
	}

	public void unSetCreated_by_profile_id() {
		this.created_by_profile_id = null;
	}

	public String getCreated_by_profile_name() {
		return created_by_profile_name;
	}

	public String getCreated_by_profile_nameEx() {
		return created_by_profile_name != null ? created_by_profile_name : "";
	}

	public void setCreated_by_profile_name(String created_by_profile_name) {
		this.created_by_profile_name = created_by_profile_name;
	}

	public void unSetCreated_by_profile_name() {
		this.created_by_profile_name = null;
	}

	public String getLast_updated_by_profile_id() {
		return last_updated_by_profile_id;
	}

	public String getLast_updated_by_profile_idEx() {
		return last_updated_by_profile_id != null ? last_updated_by_profile_id : "";
	}

	public void setLast_updated_by_profile_id(String last_updated_by_profile_id) {
		this.last_updated_by_profile_id = last_updated_by_profile_id;
	}

	public void unSetLast_updated_by_profile_id() {
		this.last_updated_by_profile_id = null;
	}

	public String getLast_updated_by_profile_name() {
		return last_updated_by_profile_name;
	}

	public String getLast_updated_by_profile_nameEx() {
		return last_updated_by_profile_name != null ? last_updated_by_profile_name : "";
	}

	public void setLast_updated_by_profile_name(String last_updated_by_profile_name) {
		this.last_updated_by_profile_name = last_updated_by_profile_name;
	}

	public void unSetLast_updated_by_profile_name() {
		this.last_updated_by_profile_name = null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
	}

	public String getStatus() {
		return status != null ? status : "C";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = "C";
	}

	public String getTower_id() {
		return tower_id;
	}

	public String getTower_idEx() {
		return tower_id != null ? tower_id : "";
	}

	public void setTower_id(String tower_id) {
		this.tower_id = tower_id;
	}

	public void unSetTower_id() {
		this.tower_id = null;
	}

	public String getDic_local_id() {
		return dic_local_id;
	}

	public String getDic_local_idEx() {
		return dic_local_id != null ? dic_local_id : "";
	}

	public void setDic_local_id(String dic_local_id) {
		this.dic_local_id = dic_local_id;
	}

	public void unSetDic_local_id() {
		this.dic_local_id = null;
	}

	public String getDic_connection_string() {
		return dic_connection_string;
	}

	public String getDic_connection_stringEx() {
		return dic_connection_string != null ? dic_connection_string : "";
	}

	public void setDic_connection_string(String dic_connection_string) {
		this.dic_connection_string = dic_connection_string;
	}

	public void unSetDic_connection_string() {
		this.dic_connection_string = null;
	}

	public String getConnection_ip() {
		return connection_ip;
	}

	public String getConnection_ipEx() {
		return connection_ip != null ? connection_ip : "";
	}

	public void setConnection_ip(String connection_ip) {
		this.connection_ip = connection_ip;
	}

	public void unSetConnection_ip() {
		this.connection_ip = null;
	}

	public String getConnection_port() {
		return connection_port;
	}

	public String getConnection_portEx() {
		return connection_port != null ? connection_port : "";
	}

	public void setConnection_port(String connection_port) {
		this.connection_port = connection_port;
	}

	public void unSetConnection_port() {
		this.connection_port = null;
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

	public String getInventory_state() {
		return inventory_state;
	}

	public String getInventory_stateEx() {
		return inventory_state != null ? inventory_state : "";
	}

	public void setInventory_state(String inventory_state) {
		this.inventory_state = inventory_state;
	}

	public void unSetInventory_state() {
		this.inventory_state = null;
	}

	public Integer getPoll_period() {
		return poll_period != null ? poll_period : 30;
	}

	public void setPoll_period(int poll_period) {
		this.poll_period = poll_period;
	}

	public void setPoll_period(Integer poll_period) {
		this.poll_period = poll_period;
	}

	public void unSetPoll_period() {
		this.poll_period = 30;
	}

	public Integer getSync_interval() {
		return sync_interval != null ? sync_interval : 30;
	}

	public void setSync_interval(int sync_interval) {
		this.sync_interval = sync_interval;
	}

	public void setSync_interval(Integer sync_interval) {
		this.sync_interval = sync_interval;
	}

	public void unSetSync_interval() {
		this.sync_interval = 30;
	}

	public Integer getPdi() {
		return pdi != null ? pdi : 30;
	}

	public void setPdi(int pdi) {
		this.pdi = pdi;
	}

	public void setPdi(Integer pdi) {
		this.pdi = pdi;
	}

	public void unSetPdi() {
		this.pdi = 30;
	}

	public Integer getDg_no() {
		return dg_no != null ? dg_no : 0;
	}

	public void setDg_no(int dg_no) {
		this.dg_no = dg_no;
	}

	public void setDg_no(Integer dg_no) {
		this.dg_no = dg_no;
	}

	public void unSetDg_no() {
		this.dg_no = 0;
	}

	public Integer getMajor_version() {
		return major_version;
	}

	public int getMajor_versionEx() {
		return major_version != null ? major_version : 0;
	}

	public void setMajor_version(int major_version) {
		this.major_version = major_version;
	}

	public void setMajor_version(Integer major_version) {
		this.major_version = major_version;
	}

	public void unSetMajor_version() {
		this.major_version = null;
	}

	public Integer getMinor_version() {
		return minor_version;
	}

	public int getMinor_versionEx() {
		return minor_version != null ? minor_version : 0;
	}

	public void setMinor_version(int minor_version) {
		this.minor_version = minor_version;
	}

	public void setMinor_version(Integer minor_version) {
		this.minor_version = minor_version;
	}

	public void unSetMinor_version() {
		this.minor_version = null;
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

	public String getBattery_status() {
		return battery_status != null ? battery_status : "M";
	}

	public void setBattery_status(String battery_status) {
		this.battery_status = battery_status;
	}

	public void unSetBattery_status() {
		this.battery_status = "M";
	}

	public String getActivated() {
		return activated != null ? activated : "N";
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public void unSetActivated() {
		this.activated = "N";
	}

	public String getConnected() {
		return connected != null ? connected : "N";
	}

	public void setConnected(String connected) {
		this.connected = connected;
	}

	public void unSetConnected() {
		this.connected = "N";
	}

	public String getHardware_error() {
		return hardware_error != null ? hardware_error : "N";
	}

	public void setHardware_error(String hardware_error) {
		this.hardware_error = hardware_error;
	}

	public void unSetHardware_error() {
		this.hardware_error = "N";
	}

	public String getDg_on() {
		return dg_on;
	}

	public String getDg_onEx() {
		return dg_on != null ? dg_on : "";
	}

	public void setDg_on(String dg_on) {
		this.dg_on = dg_on;
	}

	public void unSetDg_on() {
		this.dg_on = null;
	}

	public String getConfig() {
		return config != null ? config : "Y";
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public void unSetConfig() {
		this.config = "Y";
	}

	public Long getLast_data_received() {
		return last_data_received;
	}

	public void setLast_data_received(Long last_data_received) {
		this.last_data_received = last_data_received;
	}


	public Long getLast_reading_received() {
		return last_reading_received;
	}

	public void setLast_reading_received(Long last_reading_received) {
		this.last_reading_received = last_reading_received;
	}


	public Integer getDeployed_major_version() {
		return deployed_major_version;
	}

	public int getDeployed_major_versionEx() {
		return deployed_major_version != null ? deployed_major_version : 0;
	}

	public void setDeployed_major_version(int deployed_major_version) {
		this.deployed_major_version = deployed_major_version;
	}

	public void setDeployed_major_version(Integer deployed_major_version) {
		this.deployed_major_version = deployed_major_version;
	}

	public void unSetDeployed_major_version() {
		this.deployed_major_version = null;
	}

	public Integer getDeployed_minor_version() {
		return deployed_minor_version;
	}

	public int getDeployed_minor_versionEx() {
		return deployed_minor_version != null ? deployed_minor_version : 0;
	}

	public void setDeployed_minor_version(int deployed_minor_version) {
		this.deployed_minor_version = deployed_minor_version;
	}

	public void setDeployed_minor_version(Integer deployed_minor_version) {
		this.deployed_minor_version = deployed_minor_version;
	}

	public void unSetDeployed_minor_version() {
		this.deployed_minor_version = null;
	}

	public Number getUpgrade_status() {
		return upgrade_status != null ? upgrade_status : 100.00;
	}

	public void setUpgrade_status(Number upgrade_status) {
		this.upgrade_status = upgrade_status;
	}

	public void unSetUpgrade_status() {
		this.upgrade_status = 100.00;
	}

	public String getAdmin_status() {
		return admin_status != null ? admin_status : "N";
	}

	public void setAdmin_status(String admin_status) {
		this.admin_status = admin_status;
	}

	public void unSetAdmin_status() {
		this.admin_status = "N";
	}

	public Integer getHeartbeat_interval() {
		return heartbeat_interval != null ? heartbeat_interval : 0;
	}

	public void setHeartbeat_interval(int heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void setHeartbeat_interval(Integer heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void unSetHeartbeat_interval() {
		this.heartbeat_interval = 0;
	}

	public Integer getData_read_interval() {
		return data_read_interval != null ? data_read_interval : 0;
	}

	public void setData_read_interval(int data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void setData_read_interval(Integer data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void unSetData_read_interval() {
		this.data_read_interval = 0;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public Double getMultiple_factor_port3001() {
		return multiple_factor_port3001;
	}

	public double getMultiple_factor_port3001Ex() {
		return multiple_factor_port3001 != null ? multiple_factor_port3001 : 0;
	}

	public void setMultiple_factor_port3001(double multiple_factor_port3001) {
		this.multiple_factor_port3001 = multiple_factor_port3001;
	}

	public void setMultiple_factor_port3001(Double multiple_factor_port3001) {
		this.multiple_factor_port3001 = multiple_factor_port3001;
	}

	public void unSetMultiple_factor_port3001() {
		this.multiple_factor_port3001 = null;
	}

	public Double getMultiple_factor_port3002() {
		return multiple_factor_port3002;
	}

	public double getMultiple_factor_port3002Ex() {
		return multiple_factor_port3002 != null ? multiple_factor_port3002 : 0;
	}

	public void setMultiple_factor_port3002(double multiple_factor_port3002) {
		this.multiple_factor_port3002 = multiple_factor_port3002;
	}

	public void setMultiple_factor_port3002(Double multiple_factor_port3002) {
		this.multiple_factor_port3002 = multiple_factor_port3002;
	}

	public void unSetMultiple_factor_port3002() {
		this.multiple_factor_port3002 = null;
	}

	public Double getMultiple_factor_port3003() {
		return multiple_factor_port3003;
	}

	public double getMultiple_factor_port3003Ex() {
		return multiple_factor_port3003 != null ? multiple_factor_port3003 : 0;
	}

	public void setMultiple_factor_port3003(double multiple_factor_port3003) {
		this.multiple_factor_port3003 = multiple_factor_port3003;
	}

	public void setMultiple_factor_port3003(Double multiple_factor_port3003) {
		this.multiple_factor_port3003 = multiple_factor_port3003;
	}

	public void unSetMultiple_factor_port3003() {
		this.multiple_factor_port3003 = null;
	}

	public Double getMultiple_factor_port3004() {
		return multiple_factor_port3004;
	}

	public double getMultiple_factor_port3004Ex() {
		return multiple_factor_port3004 != null ? multiple_factor_port3004 : 0;
	}

	public void setMultiple_factor_port3004(double multiple_factor_port3004) {
		this.multiple_factor_port3004 = multiple_factor_port3004;
	}

	public void setMultiple_factor_port3004(Double multiple_factor_port3004) {
		this.multiple_factor_port3004 = multiple_factor_port3004;
	}

	public void unSetMultiple_factor_port3004() {
		this.multiple_factor_port3004 = null;
	}

	public Double getMultiple_factor_port3005() {
		return multiple_factor_port3005;
	}

	public double getMultiple_factor_port3005Ex() {
		return multiple_factor_port3005 != null ? multiple_factor_port3005 : 0;
	}

	public void setMultiple_factor_port3005(double multiple_factor_port3005) {
		this.multiple_factor_port3005 = multiple_factor_port3005;
	}

	public void setMultiple_factor_port3005(Double multiple_factor_port3005) {
		this.multiple_factor_port3005 = multiple_factor_port3005;
	}

	public void unSetMultiple_factor_port3005() {
		this.multiple_factor_port3005 = null;
	}

	public Double getMultiple_factor_port3006() {
		return multiple_factor_port3006;
	}

	public double getMultiple_factor_port3006Ex() {
		return multiple_factor_port3006 != null ? multiple_factor_port3006 : 0;
	}

	public void setMultiple_factor_port3006(double multiple_factor_port3006) {
		this.multiple_factor_port3006 = multiple_factor_port3006;
	}

	public void setMultiple_factor_port3006(Double multiple_factor_port3006) {
		this.multiple_factor_port3006 = multiple_factor_port3006;
	}

	public void unSetMultiple_factor_port3006() {
		this.multiple_factor_port3006 = null;
	}

	public Double getMultiple_factor_port3007() {
		return multiple_factor_port3007;
	}

	public double getMultiple_factor_port3007Ex() {
		return multiple_factor_port3007 != null ? multiple_factor_port3007 : 0;
	}

	public void setMultiple_factor_port3007(double multiple_factor_port3007) {
		this.multiple_factor_port3007 = multiple_factor_port3007;
	}

	public void setMultiple_factor_port3007(Double multiple_factor_port3007) {
		this.multiple_factor_port3007 = multiple_factor_port3007;
	}

	public void unSetMultiple_factor_port3007() {
		this.multiple_factor_port3007 = null;
	}

	public Double getMultiple_factor_port3000() {
		return multiple_factor_port3000;
	}

	public double getMultiple_factor_port3000Ex() {
		return multiple_factor_port3000 != null ? multiple_factor_port3000 : 0;
	}

	public void setMultiple_factor_port3000(double multiple_factor_port3000) {
		this.multiple_factor_port3000 = multiple_factor_port3000;
	}

	public void setMultiple_factor_port3000(Double multiple_factor_port3000) {
		this.multiple_factor_port3000 = multiple_factor_port3000;
	}

	public void unSetMultiple_factor_port3000() {
		this.multiple_factor_port3000 = null;
	}

	public String getPacket_capture() {
		return packet_capture != null ? packet_capture : "N";
	}

	public void setPacket_capture(String packet_capture) {
		this.packet_capture = packet_capture;
	}

	public void unSetPacket_capture() {
		this.packet_capture = "N";
	}

	public String getDeployment_type() {
		return deployment_type != null ? deployment_type : "N";
	}

	public void setDeployment_type(String deployment_type) {
		this.deployment_type = deployment_type;
	}

	public void unSetDeployment_type() {
		this.deployment_type = "N";
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}