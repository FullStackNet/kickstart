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
public abstract class Basegateway extends BaseResource {
	private String id = null;
	private String name = null;
	private String model = null;
	private String machine_id = null;
	private String serial_number = null;
	private String login_id = null;
	private String password = null;
	private String mfg_date = null;
	private String hardware_version = null;
	private String gateway_type = null;
	private String software_version = null;
	private String sdp_protocol_version = null;
	private String application = null;
	private String community_id = null;
	private String community_name = null;
	private Integer data_read_interval = null;
	private Integer data_push_interval = null;
	private Integer heartbeat_interval = null;
	private String alarm_server = null;
	private Integer alarm_server_port = null;
	private String sftp_server = null;
	private Integer sftp_port = null;
	private String sftp_username = null;
	private String sftp_password = null;
	private String datalog_server = null;
	private Integer datalog_server_port = null;
	private String gateway_ip = null;
	private String license_key = null;
	private Long creation_time = null;
	private Long last_modified_time = null;
	private String created_by_profile_id = null;
	private String created_by_profile_name = null;
	private String last_updated_by_profile_id = null;
	private String last_updated_by_profile_name = null;
	private String remark = null;
	private String status = null;
	private String gateway_local_id = null;
	private String inventory_state = null;
	private String simnumber_1 = null;
	private String simnumber_2 = null;
	private String mobileno_1 = null;
	private String mobileno_2 = null;
	private String lat = null;
	private String longitude = null;
	private String access_key_handling = null;
	private String db_enabled = null;
	private Integer controller_heartbeat_interval = null;
	private Integer controller_reconnect = null;
	private String controller_type = null;
	private String controller_ip = null;
	private Integer controller_port = null;
	private String controller_usb_port = null;
	private Integer controller_baudrate = null;
	private String modules = null;
	private String power_priority = null;
	private String customer_id = null;
	private String activated = null;
	private String connected = null;
	private String config = null;
	private String deployed_version = null;
	private Number cpu_usage = null;
	private Number process_cpu_usage = null;
	private Number total_memory = null;
	private Number free_memory = null;
	private Number free_disk_space = null;
	private Number total_disk_space = null;
	private String admin_status = null;
	private List<Object> controllers = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MODEL = "model";
	public static String FIELD_MACHINE_ID = "machine_id";
	public static String FIELD_SERIAL_NUMBER = "serial_number";
	public static String FIELD_LOGIN_ID = "login_id";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_MFG_DATE = "mfg_date";
	public static String FIELD_HARDWARE_VERSION = "hardware_version";
	public static String FIELD_GATEWAY_TYPE = "gateway_type";
	public static String FIELD_SOFTWARE_VERSION = "software_version";
	public static String FIELD_SDP_PROTOCOL_VERSION = "sdp_protocol_version";
	public static String FIELD_APPLICATION = "application";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_DATA_READ_INTERVAL = "data_read_interval";
	public static String FIELD_DATA_PUSH_INTERVAL = "data_push_interval";
	public static String FIELD_HEARTBEAT_INTERVAL = "heartbeat_interval";
	public static String FIELD_ALARM_SERVER = "alarm_server";
	public static String FIELD_ALARM_SERVER_PORT = "alarm_server_port";
	public static String FIELD_SFTP_SERVER = "sftp_server";
	public static String FIELD_SFTP_PORT = "sftp_port";
	public static String FIELD_SFTP_USERNAME = "sftp_username";
	public static String FIELD_SFTP_PASSWORD = "sftp_password";
	public static String FIELD_DATALOG_SERVER = "datalog_server";
	public static String FIELD_DATALOG_SERVER_PORT = "datalog_server_port";
	public static String FIELD_GATEWAY_IP = "gateway_ip";
	public static String FIELD_LICENSE_KEY = "license_key";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_MODIFIED_TIME = "last_modified_time";
	public static String FIELD_CREATED_BY_PROFILE_ID = "created_by_profile_id";
	public static String FIELD_CREATED_BY_PROFILE_NAME = "created_by_profile_name";
	public static String FIELD_LAST_UPDATED_BY_PROFILE_ID = "last_updated_by_profile_id";
	public static String FIELD_LAST_UPDATED_BY_PROFILE_NAME = "last_updated_by_profile_name";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_STATUS = "status";
	public static String FIELD_GATEWAY_LOCAL_ID = "gateway_local_id";
	public static String FIELD_INVENTORY_STATE = "inventory_state";
	public static String FIELD_SIMNUMBER_1 = "simnumber_1";
	public static String FIELD_SIMNUMBER_2 = "simnumber_2";
	public static String FIELD_MOBILENO_1 = "mobileno_1";
	public static String FIELD_MOBILENO_2 = "mobileno_2";
	public static String FIELD_LAT = "lat";
	public static String FIELD_LONGITUDE = "longitude";
	public static String FIELD_ACCESS_KEY_HANDLING = "access_key_handling";
	public static String FIELD_DB_ENABLED = "db_enabled";
	public static String FIELD_CONTROLLER_HEARTBEAT_INTERVAL = "controller_heartbeat_interval";
	public static String FIELD_CONTROLLER_RECONNECT = "controller_reconnect";
	public static String FIELD_CONTROLLER_TYPE = "controller_type";
	public static String FIELD_CONTROLLER_IP = "controller_ip";
	public static String FIELD_CONTROLLER_PORT = "controller_port";
	public static String FIELD_CONTROLLER_USB_PORT = "controller_usb_port";
	public static String FIELD_CONTROLLER_BAUDRATE = "controller_baudrate";
	public static String FIELD_MODULES = "modules";
	public static String FIELD_POWER_PRIORITY = "power_priority";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ACTIVATED = "activated";
	public static String FIELD_CONNECTED = "connected";
	public static String FIELD_CONFIG = "config";
	public static String FIELD_DEPLOYED_VERSION = "deployed_version";
	public static String FIELD_CPU_USAGE = "cpu_usage";
	public static String FIELD_PROCESS_CPU_USAGE = "process_cpu_usage";
	public static String FIELD_TOTAL_MEMORY = "total_memory";
	public static String FIELD_FREE_MEMORY = "free_memory";
	public static String FIELD_FREE_DISK_SPACE = "free_disk_space";
	public static String FIELD_TOTAL_DISK_SPACE = "total_disk_space";
	public static String FIELD_ADMIN_STATUS = "admin_status";
	public static String FIELD_CONTROLLERS = "controllers";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("gateway");

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

		Field modelField = new Field("model", "String");
		modelField.setLength(50);
		metaData.addField(modelField);

		Field machine_idField = new Field("machine_id", "String");
		machine_idField.setLength(32);
		metaData.addField(machine_idField);

		Field serial_numberField = new Field("serial_number", "String");
		serial_numberField.setLength(32);
		metaData.addField(serial_numberField);

		Field login_idField = new Field("login_id", "String");
		login_idField.setLength(128);
		metaData.addField(login_idField);

		Field passwordField = new Field("password", "String");
		passwordField.setLength(128);
		metaData.addField(passwordField);

		Field mfg_dateField = new Field("mfg_date", "String");
		mfg_dateField.setLength(20);
		metaData.addField(mfg_dateField);

		Field hardware_versionField = new Field("hardware_version", "String");
		hardware_versionField.setLength(50);
		metaData.addField(hardware_versionField);

		Field gateway_typeField = new Field("gateway_type", "String");
		gateway_typeField.setLength(50);
		metaData.addField(gateway_typeField);

		Field software_versionField = new Field("software_version", "String");
		software_versionField.setLength(50);
		metaData.addField(software_versionField);

		Field sdp_protocol_versionField = new Field("sdp_protocol_version", "String");
		sdp_protocol_versionField.setLength(10);
		metaData.addField(sdp_protocol_versionField);

		Field applicationField = new Field("application", "String");
		applicationField.setLength(50);
		metaData.addField(applicationField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field data_read_intervalField = new Field("data_read_interval", "int");
		data_read_intervalField.setDefaultValue(30);
		data_read_intervalField.setLength(8);
		metaData.addField(data_read_intervalField);

		Field data_push_intervalField = new Field("data_push_interval", "int");
		data_push_intervalField.setDefaultValue(3600);
		data_push_intervalField.setLength(8);
		metaData.addField(data_push_intervalField);

		Field heartbeat_intervalField = new Field("heartbeat_interval", "int");
		heartbeat_intervalField.setDefaultValue(3600);
		heartbeat_intervalField.setLength(8);
		metaData.addField(heartbeat_intervalField);

		Field alarm_serverField = new Field("alarm_server", "String");
		alarm_serverField.setLength(128);
		metaData.addField(alarm_serverField);

		Field alarm_server_portField = new Field("alarm_server_port", "int");
		alarm_server_portField.setLength(5);
		metaData.addField(alarm_server_portField);

		Field sftp_serverField = new Field("sftp_server", "String");
		sftp_serverField.setLength(128);
		metaData.addField(sftp_serverField);

		Field sftp_portField = new Field("sftp_port", "int");
		sftp_portField.setLength(5);
		metaData.addField(sftp_portField);

		Field sftp_usernameField = new Field("sftp_username", "String");
		sftp_usernameField.setLength(128);
		metaData.addField(sftp_usernameField);

		Field sftp_passwordField = new Field("sftp_password", "String");
		sftp_passwordField.setLength(128);
		metaData.addField(sftp_passwordField);

		Field datalog_serverField = new Field("datalog_server", "String");
		datalog_serverField.setLength(128);
		metaData.addField(datalog_serverField);

		Field datalog_server_portField = new Field("datalog_server_port", "int");
		datalog_server_portField.setLength(5);
		metaData.addField(datalog_server_portField);

		Field gateway_ipField = new Field("gateway_ip", "String");
		gateway_ipField.setLength(128);
		metaData.addField(gateway_ipField);

		Field license_keyField = new Field("license_key", "String");
		license_keyField.setLength(128);
		metaData.addField(license_keyField);

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
		statusField.setDefaultValue("U");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field gateway_local_idField = new Field("gateway_local_id", "String");
		gateway_local_idField.setLength(64);
		metaData.addField(gateway_local_idField);

		Field inventory_stateField = new Field("inventory_state", "String");
		inventory_stateField.setLength(16);
		metaData.addField(inventory_stateField);

		Field simnumber_1Field = new Field("simnumber_1", "String");
		simnumber_1Field.setLength(64);
		metaData.addField(simnumber_1Field);

		Field simnumber_2Field = new Field("simnumber_2", "String");
		simnumber_2Field.setLength(64);
		metaData.addField(simnumber_2Field);

		Field mobileno_1Field = new Field("mobileno_1", "String");
		mobileno_1Field.setLength(64);
		metaData.addField(mobileno_1Field);

		Field mobileno_2Field = new Field("mobileno_2", "String");
		mobileno_2Field.setLength(64);
		metaData.addField(mobileno_2Field);

		Field latField = new Field("lat", "String");
		latField.setLength(10);
		metaData.addField(latField);

		Field longitudeField = new Field("longitude", "String");
		longitudeField.setLength(10);
		metaData.addField(longitudeField);

		Field access_key_handlingField = new Field("access_key_handling", "String");
		access_key_handlingField.setLength(16);
		metaData.addField(access_key_handlingField);

		Field db_enabledField = new Field("db_enabled", "String");
		db_enabledField.setDefaultValue("N");
		db_enabledField.setLength(1);
		metaData.addField(db_enabledField);

		Field controller_heartbeat_intervalField = new Field("controller_heartbeat_interval", "int");
		controller_heartbeat_intervalField.setDefaultValue(30);
		controller_heartbeat_intervalField.setLength(8);
		metaData.addField(controller_heartbeat_intervalField);

		Field controller_reconnectField = new Field("controller_reconnect", "int");
		controller_reconnectField.setDefaultValue(30);
		controller_reconnectField.setLength(8);
		metaData.addField(controller_reconnectField);

		Field controller_typeField = new Field("controller_type", "String");
		controller_typeField.setDefaultValue("TCP");
		controller_typeField.setLength(8);
		metaData.addField(controller_typeField);

		Field controller_ipField = new Field("controller_ip", "String");
		controller_ipField.setDefaultValue("127.0.0.1");
		controller_ipField.setLength(20);
		metaData.addField(controller_ipField);

		Field controller_portField = new Field("controller_port", "int");
		controller_portField.setDefaultValue(1001);
		controller_portField.setLength(8);
		metaData.addField(controller_portField);

		Field controller_usb_portField = new Field("controller_usb_port", "String");
		controller_usb_portField.setDefaultValue("/dev/ttyUSB0");
		controller_usb_portField.setLength(32);
		metaData.addField(controller_usb_portField);

		Field controller_baudrateField = new Field("controller_baudrate", "int");
		controller_baudrateField.setDefaultValue(115200);
		controller_baudrateField.setLength(8);
		metaData.addField(controller_baudrateField);

		Field modulesField = new Field("modules", "String");
		modulesField.setDefaultValue("DIC");
		modulesField.setLength(128);
		metaData.addField(modulesField);

		Field power_priorityField = new Field("power_priority", "String");
		power_priorityField.setDefaultValue("GRID");
		power_priorityField.setLength(10);
		metaData.addField(power_priorityField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field activatedField = new Field("activated", "String");
		activatedField.setDefaultValue("Y");
		activatedField.setLength(1);
		metaData.addField(activatedField);

		Field connectedField = new Field("connected", "String");
		connectedField.setDefaultValue("Y");
		connectedField.setLength(1);
		metaData.addField(connectedField);

		Field configField = new Field("config", "String");
		configField.setDefaultValue("Y");
		configField.setLength(1);
		metaData.addField(configField);

		Field deployed_versionField = new Field("deployed_version", "String");
		deployed_versionField.setLength(16);
		metaData.addField(deployed_versionField);

		Field cpu_usageField = new Field("cpu_usage", "Number");
		cpu_usageField.setDefaultValue(0.00);
		cpu_usageField.setLength(12);
		cpu_usageField.setPrecision(2);
		metaData.addField(cpu_usageField);

		Field process_cpu_usageField = new Field("process_cpu_usage", "Number");
		process_cpu_usageField.setDefaultValue(0.00);
		process_cpu_usageField.setLength(12);
		process_cpu_usageField.setPrecision(2);
		metaData.addField(process_cpu_usageField);

		Field total_memoryField = new Field("total_memory", "Number");
		total_memoryField.setDefaultValue(0);
		total_memoryField.setLength(12);
		metaData.addField(total_memoryField);

		Field free_memoryField = new Field("free_memory", "Number");
		free_memoryField.setDefaultValue(0);
		free_memoryField.setLength(12);
		metaData.addField(free_memoryField);

		Field free_disk_spaceField = new Field("free_disk_space", "Number");
		free_disk_spaceField.setDefaultValue(0);
		free_disk_spaceField.setLength(12);
		metaData.addField(free_disk_spaceField);

		Field total_disk_spaceField = new Field("total_disk_space", "Number");
		total_disk_spaceField.setDefaultValue(0);
		total_disk_spaceField.setLength(12);
		metaData.addField(total_disk_spaceField);

		Field admin_statusField = new Field("admin_status", "String");
		admin_statusField.setDefaultValue("S");
		admin_statusField.setLength(1);
		metaData.addField(admin_statusField);

		Field controllersField = new Field("controllers", "Array");
		metaData.addField(controllersField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("gateway");

		metaData.setCluster("DB_DEVICE");
	}

	public Basegateway() {}

	public Basegateway(Basegateway obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.model = obj.model;
		this.machine_id = obj.machine_id;
		this.serial_number = obj.serial_number;
		this.login_id = obj.login_id;
		this.password = obj.password;
		this.mfg_date = obj.mfg_date;
		this.hardware_version = obj.hardware_version;
		this.gateway_type = obj.gateway_type;
		this.software_version = obj.software_version;
		this.sdp_protocol_version = obj.sdp_protocol_version;
		this.application = obj.application;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.data_read_interval = obj.data_read_interval;
		this.data_push_interval = obj.data_push_interval;
		this.heartbeat_interval = obj.heartbeat_interval;
		this.alarm_server = obj.alarm_server;
		this.alarm_server_port = obj.alarm_server_port;
		this.sftp_server = obj.sftp_server;
		this.sftp_port = obj.sftp_port;
		this.sftp_username = obj.sftp_username;
		this.sftp_password = obj.sftp_password;
		this.datalog_server = obj.datalog_server;
		this.datalog_server_port = obj.datalog_server_port;
		this.gateway_ip = obj.gateway_ip;
		this.license_key = obj.license_key;
		this.creation_time = obj.creation_time;
		this.last_modified_time = obj.last_modified_time;
		this.created_by_profile_id = obj.created_by_profile_id;
		this.created_by_profile_name = obj.created_by_profile_name;
		this.last_updated_by_profile_id = obj.last_updated_by_profile_id;
		this.last_updated_by_profile_name = obj.last_updated_by_profile_name;
		this.remark = obj.remark;
		this.status = obj.status;
		this.gateway_local_id = obj.gateway_local_id;
		this.inventory_state = obj.inventory_state;
		this.simnumber_1 = obj.simnumber_1;
		this.simnumber_2 = obj.simnumber_2;
		this.mobileno_1 = obj.mobileno_1;
		this.mobileno_2 = obj.mobileno_2;
		this.lat = obj.lat;
		this.longitude = obj.longitude;
		this.access_key_handling = obj.access_key_handling;
		this.db_enabled = obj.db_enabled;
		this.controller_heartbeat_interval = obj.controller_heartbeat_interval;
		this.controller_reconnect = obj.controller_reconnect;
		this.controller_type = obj.controller_type;
		this.controller_ip = obj.controller_ip;
		this.controller_port = obj.controller_port;
		this.controller_usb_port = obj.controller_usb_port;
		this.controller_baudrate = obj.controller_baudrate;
		this.modules = obj.modules;
		this.power_priority = obj.power_priority;
		this.customer_id = obj.customer_id;
		this.activated = obj.activated;
		this.connected = obj.connected;
		this.config = obj.config;
		this.deployed_version = obj.deployed_version;
		this.cpu_usage = obj.cpu_usage;
		this.process_cpu_usage = obj.process_cpu_usage;
		this.total_memory = obj.total_memory;
		this.free_memory = obj.free_memory;
		this.free_disk_space = obj.free_disk_space;
		this.total_disk_space = obj.total_disk_space;
		this.admin_status = obj.admin_status;
		this.controllers = obj.controllers;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(data_read_interval == null)
			data_read_interval = 30;
		if(data_push_interval == null)
			data_push_interval = 3600;
		if(heartbeat_interval == null)
			heartbeat_interval = 3600;
		if(status == null)
			status = "U";
		if(db_enabled == null)
			db_enabled = "N";
		if(controller_heartbeat_interval == null)
			controller_heartbeat_interval = 30;
		if(controller_reconnect == null)
			controller_reconnect = 30;
		if(controller_type == null)
			controller_type = "TCP";
		if(controller_ip == null)
			controller_ip = "127.0.0.1";
		if(controller_port == null)
			controller_port = 1001;
		if(controller_usb_port == null)
			controller_usb_port = "/dev/ttyUSB0";
		if(controller_baudrate == null)
			controller_baudrate = 115200;
		if(modules == null)
			modules = "DIC";
		if(power_priority == null)
			power_priority = "GRID";
		if(activated == null)
			activated = "Y";
		if(connected == null)
			connected = "Y";
		if(config == null)
			config = "Y";
		if(cpu_usage == null)
			cpu_usage = 0.00;
		if(process_cpu_usage == null)
			process_cpu_usage = 0.00;
		if(total_memory == null)
			total_memory = 0;
		if(free_memory == null)
			free_memory = 0;
		if(free_disk_space == null)
			free_disk_space = 0;
		if(total_disk_space == null)
			total_disk_space = 0;
		if(admin_status == null)
			admin_status = "S";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(model != null)
			map.put("model", model);
		if(machine_id != null)
			map.put("machine_id", machine_id);
		if(serial_number != null)
			map.put("serial_number", serial_number);
		if(login_id != null)
			map.put("login_id", login_id);
		if(password != null)
			map.put("password", password);
		if(mfg_date != null)
			map.put("mfg_date", mfg_date);
		if(hardware_version != null)
			map.put("hardware_version", hardware_version);
		if(gateway_type != null)
			map.put("gateway_type", gateway_type);
		if(software_version != null)
			map.put("software_version", software_version);
		if(sdp_protocol_version != null)
			map.put("sdp_protocol_version", sdp_protocol_version);
		if(application != null)
			map.put("application", application);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(data_read_interval != null)
			map.put("data_read_interval", data_read_interval);
		if(data_push_interval != null)
			map.put("data_push_interval", data_push_interval);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
		if(alarm_server != null)
			map.put("alarm_server", alarm_server);
		if(alarm_server_port != null)
			map.put("alarm_server_port", alarm_server_port);
		if(sftp_server != null)
			map.put("sftp_server", sftp_server);
		if(sftp_port != null)
			map.put("sftp_port", sftp_port);
		if(sftp_username != null)
			map.put("sftp_username", sftp_username);
		if(sftp_password != null)
			map.put("sftp_password", sftp_password);
		if(datalog_server != null)
			map.put("datalog_server", datalog_server);
		if(datalog_server_port != null)
			map.put("datalog_server_port", datalog_server_port);
		if(gateway_ip != null)
			map.put("gateway_ip", gateway_ip);
		if(license_key != null)
			map.put("license_key", license_key);
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
		if(gateway_local_id != null)
			map.put("gateway_local_id", gateway_local_id);
		if(inventory_state != null)
			map.put("inventory_state", inventory_state);
		if(simnumber_1 != null)
			map.put("simnumber_1", simnumber_1);
		if(simnumber_2 != null)
			map.put("simnumber_2", simnumber_2);
		if(mobileno_1 != null)
			map.put("mobileno_1", mobileno_1);
		if(mobileno_2 != null)
			map.put("mobileno_2", mobileno_2);
		if(lat != null)
			map.put("lat", lat);
		if(longitude != null)
			map.put("longitude", longitude);
		if(access_key_handling != null)
			map.put("access_key_handling", access_key_handling);
		if(db_enabled != null)
			map.put("db_enabled", db_enabled);
		if(controller_heartbeat_interval != null)
			map.put("controller_heartbeat_interval", controller_heartbeat_interval);
		if(controller_reconnect != null)
			map.put("controller_reconnect", controller_reconnect);
		if(controller_type != null)
			map.put("controller_type", controller_type);
		if(controller_ip != null)
			map.put("controller_ip", controller_ip);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(controller_usb_port != null)
			map.put("controller_usb_port", controller_usb_port);
		if(controller_baudrate != null)
			map.put("controller_baudrate", controller_baudrate);
		if(modules != null)
			map.put("modules", modules);
		if(power_priority != null)
			map.put("power_priority", power_priority);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(activated != null)
			map.put("activated", activated);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(deployed_version != null)
			map.put("deployed_version", deployed_version);
		if(cpu_usage != null)
			map.put("cpu_usage", cpu_usage);
		if(process_cpu_usage != null)
			map.put("process_cpu_usage", process_cpu_usage);
		if(total_memory != null)
			map.put("total_memory", total_memory);
		if(free_memory != null)
			map.put("free_memory", free_memory);
		if(free_disk_space != null)
			map.put("free_disk_space", free_disk_space);
		if(total_disk_space != null)
			map.put("total_disk_space", total_disk_space);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(controllers != null)
			map.put("controllers", controllers);
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
		if(name != null)
			map.put("name", name);
		if(model != null)
			map.put("model", model);
		if(machine_id != null)
			map.put("machine_id", machine_id);
		if(serial_number != null)
			map.put("serial_number", serial_number);
		if(login_id != null)
			map.put("login_id", login_id);
		if(password != null)
			map.put("password", password);
		if(mfg_date != null)
			map.put("mfg_date", mfg_date);
		if(hardware_version != null)
			map.put("hardware_version", hardware_version);
		if(gateway_type != null)
			map.put("gateway_type", gateway_type);
		if(software_version != null)
			map.put("software_version", software_version);
		if(sdp_protocol_version != null)
			map.put("sdp_protocol_version", sdp_protocol_version);
		if(application != null)
			map.put("application", application);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(data_read_interval != null)
			map.put("data_read_interval", data_read_interval);
		if(data_push_interval != null)
			map.put("data_push_interval", data_push_interval);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
		if(alarm_server != null)
			map.put("alarm_server", alarm_server);
		if(alarm_server_port != null)
			map.put("alarm_server_port", alarm_server_port);
		if(sftp_server != null)
			map.put("sftp_server", sftp_server);
		if(sftp_port != null)
			map.put("sftp_port", sftp_port);
		if(sftp_username != null)
			map.put("sftp_username", sftp_username);
		if(sftp_password != null)
			map.put("sftp_password", sftp_password);
		if(datalog_server != null)
			map.put("datalog_server", datalog_server);
		if(datalog_server_port != null)
			map.put("datalog_server_port", datalog_server_port);
		if(gateway_ip != null)
			map.put("gateway_ip", gateway_ip);
		if(license_key != null)
			map.put("license_key", license_key);
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
		if(gateway_local_id != null)
			map.put("gateway_local_id", gateway_local_id);
		if(inventory_state != null)
			map.put("inventory_state", inventory_state);
		if(simnumber_1 != null)
			map.put("simnumber_1", simnumber_1);
		if(simnumber_2 != null)
			map.put("simnumber_2", simnumber_2);
		if(mobileno_1 != null)
			map.put("mobileno_1", mobileno_1);
		if(mobileno_2 != null)
			map.put("mobileno_2", mobileno_2);
		if(lat != null)
			map.put("lat", lat);
		if(longitude != null)
			map.put("longitude", longitude);
		if(access_key_handling != null)
			map.put("access_key_handling", access_key_handling);
		if(db_enabled != null)
			map.put("db_enabled", db_enabled);
		if(controller_heartbeat_interval != null)
			map.put("controller_heartbeat_interval", controller_heartbeat_interval);
		if(controller_reconnect != null)
			map.put("controller_reconnect", controller_reconnect);
		if(controller_type != null)
			map.put("controller_type", controller_type);
		if(controller_ip != null)
			map.put("controller_ip", controller_ip);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(controller_usb_port != null)
			map.put("controller_usb_port", controller_usb_port);
		if(controller_baudrate != null)
			map.put("controller_baudrate", controller_baudrate);
		if(modules != null)
			map.put("modules", modules);
		if(power_priority != null)
			map.put("power_priority", power_priority);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(activated != null)
			map.put("activated", activated);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(deployed_version != null)
			map.put("deployed_version", deployed_version);
		if(cpu_usage != null)
			map.put("cpu_usage", cpu_usage);
		if(process_cpu_usage != null)
			map.put("process_cpu_usage", process_cpu_usage);
		if(total_memory != null)
			map.put("total_memory", total_memory);
		if(free_memory != null)
			map.put("free_memory", free_memory);
		if(free_disk_space != null)
			map.put("free_disk_space", free_disk_space);
		if(total_disk_space != null)
			map.put("total_disk_space", total_disk_space);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(controllers != null)
			map.put("controllers", controllers);
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
		model = (String) map.get("model");
		machine_id = (String) map.get("machine_id");
		serial_number = (String) map.get("serial_number");
		login_id = (String) map.get("login_id");
		password = (String) map.get("password");
		mfg_date = (String) map.get("mfg_date");
		hardware_version = (String) map.get("hardware_version");
		gateway_type = (String) map.get("gateway_type");
		software_version = (String) map.get("software_version");
		sdp_protocol_version = (String) map.get("sdp_protocol_version");
		application = (String) map.get("application");
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		data_read_interval = (Integer) map.get("data_read_interval");
		data_push_interval = (Integer) map.get("data_push_interval");
		heartbeat_interval = (Integer) map.get("heartbeat_interval");
		alarm_server = (String) map.get("alarm_server");
		alarm_server_port = (Integer) map.get("alarm_server_port");
		sftp_server = (String) map.get("sftp_server");
		sftp_port = (Integer) map.get("sftp_port");
		sftp_username = (String) map.get("sftp_username");
		sftp_password = (String) map.get("sftp_password");
		datalog_server = (String) map.get("datalog_server");
		datalog_server_port = (Integer) map.get("datalog_server_port");
		gateway_ip = (String) map.get("gateway_ip");
		license_key = (String) map.get("license_key");
		creation_time = (Long) map.get("creation_time");
		last_modified_time = (Long) map.get("last_modified_time");
		created_by_profile_id = (String) map.get("created_by_profile_id");
		created_by_profile_name = (String) map.get("created_by_profile_name");
		last_updated_by_profile_id = (String) map.get("last_updated_by_profile_id");
		last_updated_by_profile_name = (String) map.get("last_updated_by_profile_name");
		remark = (String) map.get("remark");
		status = (String) map.get("status");
		gateway_local_id = (String) map.get("gateway_local_id");
		inventory_state = (String) map.get("inventory_state");
		simnumber_1 = (String) map.get("simnumber_1");
		simnumber_2 = (String) map.get("simnumber_2");
		mobileno_1 = (String) map.get("mobileno_1");
		mobileno_2 = (String) map.get("mobileno_2");
		lat = (String) map.get("lat");
		longitude = (String) map.get("longitude");
		access_key_handling = (String) map.get("access_key_handling");
		db_enabled = (String) map.get("db_enabled");
		controller_heartbeat_interval = (Integer) map.get("controller_heartbeat_interval");
		controller_reconnect = (Integer) map.get("controller_reconnect");
		controller_type = (String) map.get("controller_type");
		controller_ip = (String) map.get("controller_ip");
		controller_port = (Integer) map.get("controller_port");
		controller_usb_port = (String) map.get("controller_usb_port");
		controller_baudrate = (Integer) map.get("controller_baudrate");
		modules = (String) map.get("modules");
		power_priority = (String) map.get("power_priority");
		customer_id = (String) map.get("customer_id");
		activated = (String) map.get("activated");
		connected = (String) map.get("connected");
		config = (String) map.get("config");
		deployed_version = (String) map.get("deployed_version");
		cpu_usage = (Number) map.get("cpu_usage");
		process_cpu_usage = (Number) map.get("process_cpu_usage");
		total_memory = (Number) map.get("total_memory");
		free_memory = (Number) map.get("free_memory");
		free_disk_space = (Number) map.get("free_disk_space");
		total_disk_space = (Number) map.get("total_disk_space");
		admin_status = (String) map.get("admin_status");
		controllers = (List<Object>) map.get("controllers");
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

		Object modelObj = map.get("model");
		if(modelObj != null)
			model = modelObj.toString();

		Object machine_idObj = map.get("machine_id");
		if(machine_idObj != null)
			machine_id = machine_idObj.toString();

		Object serial_numberObj = map.get("serial_number");
		if(serial_numberObj != null)
			serial_number = serial_numberObj.toString();

		Object login_idObj = map.get("login_id");
		if(login_idObj != null)
			login_id = login_idObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object mfg_dateObj = map.get("mfg_date");
		if(mfg_dateObj != null)
			mfg_date = mfg_dateObj.toString();

		Object hardware_versionObj = map.get("hardware_version");
		if(hardware_versionObj != null)
			hardware_version = hardware_versionObj.toString();

		Object gateway_typeObj = map.get("gateway_type");
		if(gateway_typeObj != null)
			gateway_type = gateway_typeObj.toString();

		Object software_versionObj = map.get("software_version");
		if(software_versionObj != null)
			software_version = software_versionObj.toString();

		Object sdp_protocol_versionObj = map.get("sdp_protocol_version");
		if(sdp_protocol_versionObj != null)
			sdp_protocol_version = sdp_protocol_versionObj.toString();

		Object applicationObj = map.get("application");
		if(applicationObj != null)
			application = applicationObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object data_read_intervalObj = map.get("data_read_interval");
		if(data_read_intervalObj != null)
			data_read_interval = new Integer(data_read_intervalObj.toString());

		Object data_push_intervalObj = map.get("data_push_interval");
		if(data_push_intervalObj != null)
			data_push_interval = new Integer(data_push_intervalObj.toString());

		Object heartbeat_intervalObj = map.get("heartbeat_interval");
		if(heartbeat_intervalObj != null)
			heartbeat_interval = new Integer(heartbeat_intervalObj.toString());

		Object alarm_serverObj = map.get("alarm_server");
		if(alarm_serverObj != null)
			alarm_server = alarm_serverObj.toString();

		Object alarm_server_portObj = map.get("alarm_server_port");
		if(alarm_server_portObj != null)
			alarm_server_port = new Integer(alarm_server_portObj.toString());

		Object sftp_serverObj = map.get("sftp_server");
		if(sftp_serverObj != null)
			sftp_server = sftp_serverObj.toString();

		Object sftp_portObj = map.get("sftp_port");
		if(sftp_portObj != null)
			sftp_port = new Integer(sftp_portObj.toString());

		Object sftp_usernameObj = map.get("sftp_username");
		if(sftp_usernameObj != null)
			sftp_username = sftp_usernameObj.toString();

		Object sftp_passwordObj = map.get("sftp_password");
		if(sftp_passwordObj != null)
			sftp_password = sftp_passwordObj.toString();

		Object datalog_serverObj = map.get("datalog_server");
		if(datalog_serverObj != null)
			datalog_server = datalog_serverObj.toString();

		Object datalog_server_portObj = map.get("datalog_server_port");
		if(datalog_server_portObj != null)
			datalog_server_port = new Integer(datalog_server_portObj.toString());

		Object gateway_ipObj = map.get("gateway_ip");
		if(gateway_ipObj != null)
			gateway_ip = gateway_ipObj.toString();

		Object license_keyObj = map.get("license_key");
		if(license_keyObj != null)
			license_key = license_keyObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_modified_timeObj = map.get("last_modified_time");
		if(last_modified_timeObj != null)
			last_modified_time = new Long(last_modified_timeObj.toString());

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

		Object gateway_local_idObj = map.get("gateway_local_id");
		if(gateway_local_idObj != null)
			gateway_local_id = gateway_local_idObj.toString();

		Object inventory_stateObj = map.get("inventory_state");
		if(inventory_stateObj != null)
			inventory_state = inventory_stateObj.toString();

		Object simnumber_1Obj = map.get("simnumber_1");
		if(simnumber_1Obj != null)
			simnumber_1 = simnumber_1Obj.toString();

		Object simnumber_2Obj = map.get("simnumber_2");
		if(simnumber_2Obj != null)
			simnumber_2 = simnumber_2Obj.toString();

		Object mobileno_1Obj = map.get("mobileno_1");
		if(mobileno_1Obj != null)
			mobileno_1 = mobileno_1Obj.toString();

		Object mobileno_2Obj = map.get("mobileno_2");
		if(mobileno_2Obj != null)
			mobileno_2 = mobileno_2Obj.toString();

		Object latObj = map.get("lat");
		if(latObj != null)
			lat = latObj.toString();

		Object longitudeObj = map.get("longitude");
		if(longitudeObj != null)
			longitude = longitudeObj.toString();

		Object access_key_handlingObj = map.get("access_key_handling");
		if(access_key_handlingObj != null)
			access_key_handling = access_key_handlingObj.toString();

		Object db_enabledObj = map.get("db_enabled");
		if(db_enabledObj != null)
			db_enabled = db_enabledObj.toString();

		Object controller_heartbeat_intervalObj = map.get("controller_heartbeat_interval");
		if(controller_heartbeat_intervalObj != null)
			controller_heartbeat_interval = new Integer(controller_heartbeat_intervalObj.toString());

		Object controller_reconnectObj = map.get("controller_reconnect");
		if(controller_reconnectObj != null)
			controller_reconnect = new Integer(controller_reconnectObj.toString());

		Object controller_typeObj = map.get("controller_type");
		if(controller_typeObj != null)
			controller_type = controller_typeObj.toString();

		Object controller_ipObj = map.get("controller_ip");
		if(controller_ipObj != null)
			controller_ip = controller_ipObj.toString();

		Object controller_portObj = map.get("controller_port");
		if(controller_portObj != null)
			controller_port = new Integer(controller_portObj.toString());

		Object controller_usb_portObj = map.get("controller_usb_port");
		if(controller_usb_portObj != null)
			controller_usb_port = controller_usb_portObj.toString();

		Object controller_baudrateObj = map.get("controller_baudrate");
		if(controller_baudrateObj != null)
			controller_baudrate = new Integer(controller_baudrateObj.toString());

		Object modulesObj = map.get("modules");
		if(modulesObj != null)
			modules = modulesObj.toString();

		Object power_priorityObj = map.get("power_priority");
		if(power_priorityObj != null)
			power_priority = power_priorityObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object activatedObj = map.get("activated");
		if(activatedObj != null)
			activated = activatedObj.toString();

		Object connectedObj = map.get("connected");
		if(connectedObj != null)
			connected = connectedObj.toString();

		Object configObj = map.get("config");
		if(configObj != null)
			config = configObj.toString();

		Object deployed_versionObj = map.get("deployed_version");
		if(deployed_versionObj != null)
			deployed_version = deployed_versionObj.toString();

		Object cpu_usageObj = map.get("cpu_usage");
		if(cpu_usageObj != null)
			cpu_usage = new Double(cpu_usageObj.toString());

		Object process_cpu_usageObj = map.get("process_cpu_usage");
		if(process_cpu_usageObj != null)
			process_cpu_usage = new Double(process_cpu_usageObj.toString());

		Object total_memoryObj = map.get("total_memory");
		if(total_memoryObj != null)
			total_memory = new Double(total_memoryObj.toString());

		Object free_memoryObj = map.get("free_memory");
		if(free_memoryObj != null)
			free_memory = new Double(free_memoryObj.toString());

		Object free_disk_spaceObj = map.get("free_disk_space");
		if(free_disk_spaceObj != null)
			free_disk_space = new Double(free_disk_spaceObj.toString());

		Object total_disk_spaceObj = map.get("total_disk_space");
		if(total_disk_spaceObj != null)
			total_disk_space = new Double(total_disk_spaceObj.toString());

		Object admin_statusObj = map.get("admin_status");
		if(admin_statusObj != null)
			admin_status = admin_statusObj.toString();

		controllers = (List<Object>) map.get("controllers");
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

	public String getMachine_id() {
		return machine_id;
	}

	public String getMachine_idEx() {
		return machine_id != null ? machine_id : "";
	}

	public void setMachine_id(String machine_id) {
		this.machine_id = machine_id;
	}

	public void unSetMachine_id() {
		this.machine_id = null;
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

	public String getLogin_id() {
		return login_id;
	}

	public String getLogin_idEx() {
		return login_id != null ? login_id : "";
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public void unSetLogin_id() {
		this.login_id = null;
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

	public String getGateway_type() {
		return gateway_type;
	}

	public String getGateway_typeEx() {
		return gateway_type != null ? gateway_type : "";
	}

	public void setGateway_type(String gateway_type) {
		this.gateway_type = gateway_type;
	}

	public void unSetGateway_type() {
		this.gateway_type = null;
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

	public String getSdp_protocol_version() {
		return sdp_protocol_version;
	}

	public String getSdp_protocol_versionEx() {
		return sdp_protocol_version != null ? sdp_protocol_version : "";
	}

	public void setSdp_protocol_version(String sdp_protocol_version) {
		this.sdp_protocol_version = sdp_protocol_version;
	}

	public void unSetSdp_protocol_version() {
		this.sdp_protocol_version = null;
	}

	public String getApplication() {
		return application;
	}

	public String getApplicationEx() {
		return application != null ? application : "";
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public void unSetApplication() {
		this.application = null;
	}

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
	}

	public String getCommunity_name() {
		return community_name;
	}

	public String getCommunity_nameEx() {
		return community_name != null ? community_name : "";
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}

	public void unSetCommunity_name() {
		this.community_name = null;
	}

	public Integer getData_read_interval() {
		return data_read_interval != null ? data_read_interval : 30;
	}

	public void setData_read_interval(int data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void setData_read_interval(Integer data_read_interval) {
		this.data_read_interval = data_read_interval;
	}

	public void unSetData_read_interval() {
		this.data_read_interval = 30;
	}

	public Integer getData_push_interval() {
		return data_push_interval != null ? data_push_interval : 3600;
	}

	public void setData_push_interval(int data_push_interval) {
		this.data_push_interval = data_push_interval;
	}

	public void setData_push_interval(Integer data_push_interval) {
		this.data_push_interval = data_push_interval;
	}

	public void unSetData_push_interval() {
		this.data_push_interval = 3600;
	}

	public Integer getHeartbeat_interval() {
		return heartbeat_interval != null ? heartbeat_interval : 3600;
	}

	public void setHeartbeat_interval(int heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void setHeartbeat_interval(Integer heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void unSetHeartbeat_interval() {
		this.heartbeat_interval = 3600;
	}

	public String getAlarm_server() {
		return alarm_server;
	}

	public String getAlarm_serverEx() {
		return alarm_server != null ? alarm_server : "";
	}

	public void setAlarm_server(String alarm_server) {
		this.alarm_server = alarm_server;
	}

	public void unSetAlarm_server() {
		this.alarm_server = null;
	}

	public Integer getAlarm_server_port() {
		return alarm_server_port;
	}

	public int getAlarm_server_portEx() {
		return alarm_server_port != null ? alarm_server_port : 0;
	}

	public void setAlarm_server_port(int alarm_server_port) {
		this.alarm_server_port = alarm_server_port;
	}

	public void setAlarm_server_port(Integer alarm_server_port) {
		this.alarm_server_port = alarm_server_port;
	}

	public void unSetAlarm_server_port() {
		this.alarm_server_port = null;
	}

	public String getSftp_server() {
		return sftp_server;
	}

	public String getSftp_serverEx() {
		return sftp_server != null ? sftp_server : "";
	}

	public void setSftp_server(String sftp_server) {
		this.sftp_server = sftp_server;
	}

	public void unSetSftp_server() {
		this.sftp_server = null;
	}

	public Integer getSftp_port() {
		return sftp_port;
	}

	public int getSftp_portEx() {
		return sftp_port != null ? sftp_port : 0;
	}

	public void setSftp_port(int sftp_port) {
		this.sftp_port = sftp_port;
	}

	public void setSftp_port(Integer sftp_port) {
		this.sftp_port = sftp_port;
	}

	public void unSetSftp_port() {
		this.sftp_port = null;
	}

	public String getSftp_username() {
		return sftp_username;
	}

	public String getSftp_usernameEx() {
		return sftp_username != null ? sftp_username : "";
	}

	public void setSftp_username(String sftp_username) {
		this.sftp_username = sftp_username;
	}

	public void unSetSftp_username() {
		this.sftp_username = null;
	}

	public String getSftp_password() {
		return sftp_password;
	}

	public String getSftp_passwordEx() {
		return sftp_password != null ? sftp_password : "";
	}

	public void setSftp_password(String sftp_password) {
		this.sftp_password = sftp_password;
	}

	public void unSetSftp_password() {
		this.sftp_password = null;
	}

	public String getDatalog_server() {
		return datalog_server;
	}

	public String getDatalog_serverEx() {
		return datalog_server != null ? datalog_server : "";
	}

	public void setDatalog_server(String datalog_server) {
		this.datalog_server = datalog_server;
	}

	public void unSetDatalog_server() {
		this.datalog_server = null;
	}

	public Integer getDatalog_server_port() {
		return datalog_server_port;
	}

	public int getDatalog_server_portEx() {
		return datalog_server_port != null ? datalog_server_port : 0;
	}

	public void setDatalog_server_port(int datalog_server_port) {
		this.datalog_server_port = datalog_server_port;
	}

	public void setDatalog_server_port(Integer datalog_server_port) {
		this.datalog_server_port = datalog_server_port;
	}

	public void unSetDatalog_server_port() {
		this.datalog_server_port = null;
	}

	public String getGateway_ip() {
		return gateway_ip;
	}

	public String getGateway_ipEx() {
		return gateway_ip != null ? gateway_ip : "";
	}

	public void setGateway_ip(String gateway_ip) {
		this.gateway_ip = gateway_ip;
	}

	public void unSetGateway_ip() {
		this.gateway_ip = null;
	}

	public String getLicense_key() {
		return license_key;
	}

	public String getLicense_keyEx() {
		return license_key != null ? license_key : "";
	}

	public void setLicense_key(String license_key) {
		this.license_key = license_key;
	}

	public void unSetLicense_key() {
		this.license_key = null;
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
		return status != null ? status : "U";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = "U";
	}

	public String getGateway_local_id() {
		return gateway_local_id;
	}

	public String getGateway_local_idEx() {
		return gateway_local_id != null ? gateway_local_id : "";
	}

	public void setGateway_local_id(String gateway_local_id) {
		this.gateway_local_id = gateway_local_id;
	}

	public void unSetGateway_local_id() {
		this.gateway_local_id = null;
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

	public String getSimnumber_1() {
		return simnumber_1;
	}

	public String getSimnumber_1Ex() {
		return simnumber_1 != null ? simnumber_1 : "";
	}

	public void setSimnumber_1(String simnumber_1) {
		this.simnumber_1 = simnumber_1;
	}

	public void unSetSimnumber_1() {
		this.simnumber_1 = null;
	}

	public String getSimnumber_2() {
		return simnumber_2;
	}

	public String getSimnumber_2Ex() {
		return simnumber_2 != null ? simnumber_2 : "";
	}

	public void setSimnumber_2(String simnumber_2) {
		this.simnumber_2 = simnumber_2;
	}

	public void unSetSimnumber_2() {
		this.simnumber_2 = null;
	}

	public String getMobileno_1() {
		return mobileno_1;
	}

	public String getMobileno_1Ex() {
		return mobileno_1 != null ? mobileno_1 : "";
	}

	public void setMobileno_1(String mobileno_1) {
		this.mobileno_1 = mobileno_1;
	}

	public void unSetMobileno_1() {
		this.mobileno_1 = null;
	}

	public String getMobileno_2() {
		return mobileno_2;
	}

	public String getMobileno_2Ex() {
		return mobileno_2 != null ? mobileno_2 : "";
	}

	public void setMobileno_2(String mobileno_2) {
		this.mobileno_2 = mobileno_2;
	}

	public void unSetMobileno_2() {
		this.mobileno_2 = null;
	}

	public String getLat() {
		return lat;
	}

	public String getLatEx() {
		return lat != null ? lat : "";
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public void unSetLat() {
		this.lat = null;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLongitudeEx() {
		return longitude != null ? longitude : "";
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void unSetLongitude() {
		this.longitude = null;
	}

	public String getAccess_key_handling() {
		return access_key_handling;
	}

	public String getAccess_key_handlingEx() {
		return access_key_handling != null ? access_key_handling : "";
	}

	public void setAccess_key_handling(String access_key_handling) {
		this.access_key_handling = access_key_handling;
	}

	public void unSetAccess_key_handling() {
		this.access_key_handling = null;
	}

	public String getDb_enabled() {
		return db_enabled != null ? db_enabled : "N";
	}

	public void setDb_enabled(String db_enabled) {
		this.db_enabled = db_enabled;
	}

	public void unSetDb_enabled() {
		this.db_enabled = "N";
	}

	public Integer getController_heartbeat_interval() {
		return controller_heartbeat_interval != null ? controller_heartbeat_interval : 30;
	}

	public void setController_heartbeat_interval(int controller_heartbeat_interval) {
		this.controller_heartbeat_interval = controller_heartbeat_interval;
	}

	public void setController_heartbeat_interval(Integer controller_heartbeat_interval) {
		this.controller_heartbeat_interval = controller_heartbeat_interval;
	}

	public void unSetController_heartbeat_interval() {
		this.controller_heartbeat_interval = 30;
	}

	public Integer getController_reconnect() {
		return controller_reconnect != null ? controller_reconnect : 30;
	}

	public void setController_reconnect(int controller_reconnect) {
		this.controller_reconnect = controller_reconnect;
	}

	public void setController_reconnect(Integer controller_reconnect) {
		this.controller_reconnect = controller_reconnect;
	}

	public void unSetController_reconnect() {
		this.controller_reconnect = 30;
	}

	public String getController_type() {
		return controller_type != null ? controller_type : "TCP";
	}

	public void setController_type(String controller_type) {
		this.controller_type = controller_type;
	}

	public void unSetController_type() {
		this.controller_type = "TCP";
	}

	public String getController_ip() {
		return controller_ip != null ? controller_ip : "127.0.0.1";
	}

	public void setController_ip(String controller_ip) {
		this.controller_ip = controller_ip;
	}

	public void unSetController_ip() {
		this.controller_ip = "127.0.0.1";
	}

	public Integer getController_port() {
		return controller_port != null ? controller_port : 1001;
	}

	public void setController_port(int controller_port) {
		this.controller_port = controller_port;
	}

	public void setController_port(Integer controller_port) {
		this.controller_port = controller_port;
	}

	public void unSetController_port() {
		this.controller_port = 1001;
	}

	public String getController_usb_port() {
		return controller_usb_port != null ? controller_usb_port : "/dev/ttyUSB0";
	}

	public void setController_usb_port(String controller_usb_port) {
		this.controller_usb_port = controller_usb_port;
	}

	public void unSetController_usb_port() {
		this.controller_usb_port = "/dev/ttyUSB0";
	}

	public Integer getController_baudrate() {
		return controller_baudrate != null ? controller_baudrate : 115200;
	}

	public void setController_baudrate(int controller_baudrate) {
		this.controller_baudrate = controller_baudrate;
	}

	public void setController_baudrate(Integer controller_baudrate) {
		this.controller_baudrate = controller_baudrate;
	}

	public void unSetController_baudrate() {
		this.controller_baudrate = 115200;
	}

	public String getModules() {
		return modules != null ? modules : "DIC";
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public void unSetModules() {
		this.modules = "DIC";
	}

	public String getPower_priority() {
		return power_priority != null ? power_priority : "GRID";
	}

	public void setPower_priority(String power_priority) {
		this.power_priority = power_priority;
	}

	public void unSetPower_priority() {
		this.power_priority = "GRID";
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

	public String getActivated() {
		return activated != null ? activated : "Y";
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public void unSetActivated() {
		this.activated = "Y";
	}

	public String getConnected() {
		return connected != null ? connected : "Y";
	}

	public void setConnected(String connected) {
		this.connected = connected;
	}

	public void unSetConnected() {
		this.connected = "Y";
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

	public String getDeployed_version() {
		return deployed_version;
	}

	public String getDeployed_versionEx() {
		return deployed_version != null ? deployed_version : "";
	}

	public void setDeployed_version(String deployed_version) {
		this.deployed_version = deployed_version;
	}

	public void unSetDeployed_version() {
		this.deployed_version = null;
	}

	public Number getCpu_usage() {
		return cpu_usage != null ? cpu_usage : 0.00;
	}

	public void setCpu_usage(Number cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	public void unSetCpu_usage() {
		this.cpu_usage = 0.00;
	}

	public Number getProcess_cpu_usage() {
		return process_cpu_usage != null ? process_cpu_usage : 0.00;
	}

	public void setProcess_cpu_usage(Number process_cpu_usage) {
		this.process_cpu_usage = process_cpu_usage;
	}

	public void unSetProcess_cpu_usage() {
		this.process_cpu_usage = 0.00;
	}

	public Number getTotal_memory() {
		return total_memory != null ? total_memory : 0;
	}

	public void setTotal_memory(Number total_memory) {
		this.total_memory = total_memory;
	}

	public void unSetTotal_memory() {
		this.total_memory = 0;
	}

	public Number getFree_memory() {
		return free_memory != null ? free_memory : 0;
	}

	public void setFree_memory(Number free_memory) {
		this.free_memory = free_memory;
	}

	public void unSetFree_memory() {
		this.free_memory = 0;
	}

	public Number getFree_disk_space() {
		return free_disk_space != null ? free_disk_space : 0;
	}

	public void setFree_disk_space(Number free_disk_space) {
		this.free_disk_space = free_disk_space;
	}

	public void unSetFree_disk_space() {
		this.free_disk_space = 0;
	}

	public Number getTotal_disk_space() {
		return total_disk_space != null ? total_disk_space : 0;
	}

	public void setTotal_disk_space(Number total_disk_space) {
		this.total_disk_space = total_disk_space;
	}

	public void unSetTotal_disk_space() {
		this.total_disk_space = 0;
	}

	public String getAdmin_status() {
		return admin_status != null ? admin_status : "S";
	}

	public void setAdmin_status(String admin_status) {
		this.admin_status = admin_status;
	}

	public void unSetAdmin_status() {
		this.admin_status = "S";
	}

	public List<Object> getControllers() {
		return controllers;
	}


	public void setControllers(List<Object> controllers) {
		this.controllers = controllers;
	}

	public void addControllers(Object value) {
		if(controllers == null)
			controllers = new ArrayList<Object>();
		controllers.add(value);
	}

	public void unSetControllers() {
		this.controllers = null;
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