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
public abstract class Basemanaged_object extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private Integer monitor_type = null;
	private String location = null;
	private String ip_address = null;
	private String message_bus_url = null;
	private String modules = null;
	private String db_enabled = null;
	private Integer client_message_queue_size = null;
	private Integer server_message_queue_size = null;
	private String process_id = null;
	private String version = null;
	private Integer port = null;
	private String state = null;
	private Long last_up_detected = null;
	private Double cpu_usage = null;
	private Long free_memory = null;
	private Long total_memory = null;
	private Long usage_memory = null;
	private Long free_disk = null;
	private Long total_disk = null;
	private Long usage_disk = null;
	private Long number_of_connections = null;
	private Long number_of_controllers = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_MONITOR_TYPE = "monitor_type";
	public static String FIELD_LOCATION = "location";
	public static String FIELD_IP_ADDRESS = "ip_address";
	public static String FIELD_MESSAGE_BUS_URL = "message_bus_url";
	public static String FIELD_MODULES = "modules";
	public static String FIELD_DB_ENABLED = "db_enabled";
	public static String FIELD_CLIENT_MESSAGE_QUEUE_SIZE = "client_message_queue_size";
	public static String FIELD_SERVER_MESSAGE_QUEUE_SIZE = "server_message_queue_size";
	public static String FIELD_PROCESS_ID = "process_id";
	public static String FIELD_VERSION = "version";
	public static String FIELD_PORT = "port";
	public static String FIELD_STATE = "state";
	public static String FIELD_LAST_UP_DETECTED = "last_up_detected";
	public static String FIELD_CPU_USAGE = "cpu_usage";
	public static String FIELD_FREE_MEMORY = "free_memory";
	public static String FIELD_TOTAL_MEMORY = "total_memory";
	public static String FIELD_USAGE_MEMORY = "usage_memory";
	public static String FIELD_FREE_DISK = "free_disk";
	public static String FIELD_TOTAL_DISK = "total_disk";
	public static String FIELD_USAGE_DISK = "usage_disk";
	public static String FIELD_NUMBER_OF_CONNECTIONS = "number_of_connections";
	public static String FIELD_NUMBER_OF_CONTROLLERS = "number_of_controllers";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("managed_object");

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

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field monitor_typeField = new Field("monitor_type", "int");
		metaData.addField(monitor_typeField);

		Field locationField = new Field("location", "String");
		locationField.setLength(128);
		metaData.addField(locationField);

		Field ip_addressField = new Field("ip_address", "String");
		ip_addressField.setLength(128);
		metaData.addField(ip_addressField);

		Field message_bus_urlField = new Field("message_bus_url", "String");
		message_bus_urlField.setLength(128);
		metaData.addField(message_bus_urlField);

		Field modulesField = new Field("modules", "String");
		modulesField.setLength(128);
		metaData.addField(modulesField);

		Field db_enabledField = new Field("db_enabled", "String");
		db_enabledField.setDefaultValue("N");
		db_enabledField.setLength(1);
		metaData.addField(db_enabledField);

		Field client_message_queue_sizeField = new Field("client_message_queue_size", "int");
		metaData.addField(client_message_queue_sizeField);

		Field server_message_queue_sizeField = new Field("server_message_queue_size", "int");
		metaData.addField(server_message_queue_sizeField);

		Field process_idField = new Field("process_id", "String");
		process_idField.setLength(20);
		metaData.addField(process_idField);

		Field versionField = new Field("version", "String");
		versionField.setLength(32);
		metaData.addField(versionField);

		Field portField = new Field("port", "int");
		metaData.addField(portField);

		Field stateField = new Field("state", "String");
		stateField.setLength(1);
		metaData.addField(stateField);

		Field last_up_detectedField = new Field("last_up_detected", "timestamp");
		metaData.addField(last_up_detectedField);

		Field cpu_usageField = new Field("cpu_usage", "double");
		metaData.addField(cpu_usageField);

		Field free_memoryField = new Field("free_memory", "long");
		metaData.addField(free_memoryField);

		Field total_memoryField = new Field("total_memory", "long");
		metaData.addField(total_memoryField);

		Field usage_memoryField = new Field("usage_memory", "long");
		metaData.addField(usage_memoryField);

		Field free_diskField = new Field("free_disk", "long");
		metaData.addField(free_diskField);

		Field total_diskField = new Field("total_disk", "long");
		metaData.addField(total_diskField);

		Field usage_diskField = new Field("usage_disk", "long");
		metaData.addField(usage_diskField);

		Field number_of_connectionsField = new Field("number_of_connections", "long");
		metaData.addField(number_of_connectionsField);

		Field number_of_controllersField = new Field("number_of_controllers", "long");
		metaData.addField(number_of_controllersField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("managed_object");

		metaData.setCluster("DB_CONFIG");
	}

	public Basemanaged_object() {}

	public Basemanaged_object(Basemanaged_object obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.monitor_type = obj.monitor_type;
		this.location = obj.location;
		this.ip_address = obj.ip_address;
		this.message_bus_url = obj.message_bus_url;
		this.modules = obj.modules;
		this.db_enabled = obj.db_enabled;
		this.client_message_queue_size = obj.client_message_queue_size;
		this.server_message_queue_size = obj.server_message_queue_size;
		this.process_id = obj.process_id;
		this.version = obj.version;
		this.port = obj.port;
		this.state = obj.state;
		this.last_up_detected = obj.last_up_detected;
		this.cpu_usage = obj.cpu_usage;
		this.free_memory = obj.free_memory;
		this.total_memory = obj.total_memory;
		this.usage_memory = obj.usage_memory;
		this.free_disk = obj.free_disk;
		this.total_disk = obj.total_disk;
		this.usage_disk = obj.usage_disk;
		this.number_of_connections = obj.number_of_connections;
		this.number_of_controllers = obj.number_of_controllers;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(db_enabled == null)
			db_enabled = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(monitor_type != null)
			map.put("monitor_type", monitor_type);
		if(location != null)
			map.put("location", location);
		if(ip_address != null)
			map.put("ip_address", ip_address);
		if(message_bus_url != null)
			map.put("message_bus_url", message_bus_url);
		if(modules != null)
			map.put("modules", modules);
		if(db_enabled != null)
			map.put("db_enabled", db_enabled);
		if(client_message_queue_size != null)
			map.put("client_message_queue_size", client_message_queue_size);
		if(server_message_queue_size != null)
			map.put("server_message_queue_size", server_message_queue_size);
		if(process_id != null)
			map.put("process_id", process_id);
		if(version != null)
			map.put("version", version);
		if(port != null)
			map.put("port", port);
		if(state != null)
			map.put("state", state);
		if(last_up_detected != null)
			map.put("last_up_detected", last_up_detected);
		if(cpu_usage != null)
			map.put("cpu_usage", cpu_usage);
		if(free_memory != null)
			map.put("free_memory", free_memory);
		if(total_memory != null)
			map.put("total_memory", total_memory);
		if(usage_memory != null)
			map.put("usage_memory", usage_memory);
		if(free_disk != null)
			map.put("free_disk", free_disk);
		if(total_disk != null)
			map.put("total_disk", total_disk);
		if(usage_disk != null)
			map.put("usage_disk", usage_disk);
		if(number_of_connections != null)
			map.put("number_of_connections", number_of_connections);
		if(number_of_controllers != null)
			map.put("number_of_controllers", number_of_controllers);
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
		if(type != null)
			map.put("type", type);
		if(monitor_type != null)
			map.put("monitor_type", monitor_type);
		if(location != null)
			map.put("location", location);
		if(ip_address != null)
			map.put("ip_address", ip_address);
		if(message_bus_url != null)
			map.put("message_bus_url", message_bus_url);
		if(modules != null)
			map.put("modules", modules);
		if(db_enabled != null)
			map.put("db_enabled", db_enabled);
		if(client_message_queue_size != null)
			map.put("client_message_queue_size", client_message_queue_size);
		if(server_message_queue_size != null)
			map.put("server_message_queue_size", server_message_queue_size);
		if(process_id != null)
			map.put("process_id", process_id);
		if(version != null)
			map.put("version", version);
		if(port != null)
			map.put("port", port);
		if(state != null)
			map.put("state", state);
		if(last_up_detected != null)
			map.put("last_up_detected", last_up_detected);
		if(cpu_usage != null)
			map.put("cpu_usage", cpu_usage);
		if(free_memory != null)
			map.put("free_memory", free_memory);
		if(total_memory != null)
			map.put("total_memory", total_memory);
		if(usage_memory != null)
			map.put("usage_memory", usage_memory);
		if(free_disk != null)
			map.put("free_disk", free_disk);
		if(total_disk != null)
			map.put("total_disk", total_disk);
		if(usage_disk != null)
			map.put("usage_disk", usage_disk);
		if(number_of_connections != null)
			map.put("number_of_connections", number_of_connections);
		if(number_of_controllers != null)
			map.put("number_of_controllers", number_of_controllers);
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
		type = (String) map.get("type");
		monitor_type = (Integer) map.get("monitor_type");
		location = (String) map.get("location");
		ip_address = (String) map.get("ip_address");
		message_bus_url = (String) map.get("message_bus_url");
		modules = (String) map.get("modules");
		db_enabled = (String) map.get("db_enabled");
		client_message_queue_size = (Integer) map.get("client_message_queue_size");
		server_message_queue_size = (Integer) map.get("server_message_queue_size");
		process_id = (String) map.get("process_id");
		version = (String) map.get("version");
		port = (Integer) map.get("port");
		state = (String) map.get("state");
		last_up_detected = (Long) map.get("last_up_detected");
		cpu_usage = (Double) map.get("cpu_usage");
		free_memory = (Long) map.get("free_memory");
		total_memory = (Long) map.get("total_memory");
		usage_memory = (Long) map.get("usage_memory");
		free_disk = (Long) map.get("free_disk");
		total_disk = (Long) map.get("total_disk");
		usage_disk = (Long) map.get("usage_disk");
		number_of_connections = (Long) map.get("number_of_connections");
		number_of_controllers = (Long) map.get("number_of_controllers");
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

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object monitor_typeObj = map.get("monitor_type");
		if(monitor_typeObj != null)
			monitor_type = new Integer(monitor_typeObj.toString());

		Object locationObj = map.get("location");
		if(locationObj != null)
			location = locationObj.toString();

		Object ip_addressObj = map.get("ip_address");
		if(ip_addressObj != null)
			ip_address = ip_addressObj.toString();

		Object message_bus_urlObj = map.get("message_bus_url");
		if(message_bus_urlObj != null)
			message_bus_url = message_bus_urlObj.toString();

		Object modulesObj = map.get("modules");
		if(modulesObj != null)
			modules = modulesObj.toString();

		Object db_enabledObj = map.get("db_enabled");
		if(db_enabledObj != null)
			db_enabled = db_enabledObj.toString();

		Object client_message_queue_sizeObj = map.get("client_message_queue_size");
		if(client_message_queue_sizeObj != null)
			client_message_queue_size = new Integer(client_message_queue_sizeObj.toString());

		Object server_message_queue_sizeObj = map.get("server_message_queue_size");
		if(server_message_queue_sizeObj != null)
			server_message_queue_size = new Integer(server_message_queue_sizeObj.toString());

		Object process_idObj = map.get("process_id");
		if(process_idObj != null)
			process_id = process_idObj.toString();

		Object versionObj = map.get("version");
		if(versionObj != null)
			version = versionObj.toString();

		Object portObj = map.get("port");
		if(portObj != null)
			port = new Integer(portObj.toString());

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object last_up_detectedObj = map.get("last_up_detected");
		if(last_up_detectedObj != null)
			last_up_detected = (Long) last_up_detectedObj;

		Object cpu_usageObj = map.get("cpu_usage");
		if(cpu_usageObj != null)
			cpu_usage = new Double(cpu_usageObj.toString());

		Object free_memoryObj = map.get("free_memory");
		if(free_memoryObj != null)
			free_memory = new Long(free_memoryObj.toString());

		Object total_memoryObj = map.get("total_memory");
		if(total_memoryObj != null)
			total_memory = new Long(total_memoryObj.toString());

		Object usage_memoryObj = map.get("usage_memory");
		if(usage_memoryObj != null)
			usage_memory = new Long(usage_memoryObj.toString());

		Object free_diskObj = map.get("free_disk");
		if(free_diskObj != null)
			free_disk = new Long(free_diskObj.toString());

		Object total_diskObj = map.get("total_disk");
		if(total_diskObj != null)
			total_disk = new Long(total_diskObj.toString());

		Object usage_diskObj = map.get("usage_disk");
		if(usage_diskObj != null)
			usage_disk = new Long(usage_diskObj.toString());

		Object number_of_connectionsObj = map.get("number_of_connections");
		if(number_of_connectionsObj != null)
			number_of_connections = new Long(number_of_connectionsObj.toString());

		Object number_of_controllersObj = map.get("number_of_controllers");
		if(number_of_controllersObj != null)
			number_of_controllers = new Long(number_of_controllersObj.toString());

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

	public Integer getMonitor_type() {
		return monitor_type;
	}

	public int getMonitor_typeEx() {
		return monitor_type != null ? monitor_type : 0;
	}

	public void setMonitor_type(int monitor_type) {
		this.monitor_type = monitor_type;
	}

	public void setMonitor_type(Integer monitor_type) {
		this.monitor_type = monitor_type;
	}

	public void unSetMonitor_type() {
		this.monitor_type = null;
	}

	public String getLocation() {
		return location;
	}

	public String getLocationEx() {
		return location != null ? location : "";
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void unSetLocation() {
		this.location = null;
	}

	public String getIp_address() {
		return ip_address;
	}

	public String getIp_addressEx() {
		return ip_address != null ? ip_address : "";
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public void unSetIp_address() {
		this.ip_address = null;
	}

	public String getMessage_bus_url() {
		return message_bus_url;
	}

	public String getMessage_bus_urlEx() {
		return message_bus_url != null ? message_bus_url : "";
	}

	public void setMessage_bus_url(String message_bus_url) {
		this.message_bus_url = message_bus_url;
	}

	public void unSetMessage_bus_url() {
		this.message_bus_url = null;
	}

	public String getModules() {
		return modules;
	}

	public String getModulesEx() {
		return modules != null ? modules : "";
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public void unSetModules() {
		this.modules = null;
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

	public Integer getClient_message_queue_size() {
		return client_message_queue_size;
	}

	public int getClient_message_queue_sizeEx() {
		return client_message_queue_size != null ? client_message_queue_size : 0;
	}

	public void setClient_message_queue_size(int client_message_queue_size) {
		this.client_message_queue_size = client_message_queue_size;
	}

	public void setClient_message_queue_size(Integer client_message_queue_size) {
		this.client_message_queue_size = client_message_queue_size;
	}

	public void unSetClient_message_queue_size() {
		this.client_message_queue_size = null;
	}

	public Integer getServer_message_queue_size() {
		return server_message_queue_size;
	}

	public int getServer_message_queue_sizeEx() {
		return server_message_queue_size != null ? server_message_queue_size : 0;
	}

	public void setServer_message_queue_size(int server_message_queue_size) {
		this.server_message_queue_size = server_message_queue_size;
	}

	public void setServer_message_queue_size(Integer server_message_queue_size) {
		this.server_message_queue_size = server_message_queue_size;
	}

	public void unSetServer_message_queue_size() {
		this.server_message_queue_size = null;
	}

	public String getProcess_id() {
		return process_id;
	}

	public String getProcess_idEx() {
		return process_id != null ? process_id : "";
	}

	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}

	public void unSetProcess_id() {
		this.process_id = null;
	}

	public String getVersion() {
		return version;
	}

	public String getVersionEx() {
		return version != null ? version : "";
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void unSetVersion() {
		this.version = null;
	}

	public Integer getPort() {
		return port;
	}

	public int getPortEx() {
		return port != null ? port : 0;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public void unSetPort() {
		this.port = null;
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

	public Long getLast_up_detected() {
		return last_up_detected;
	}

	public void setLast_up_detected(Long last_up_detected) {
		this.last_up_detected = last_up_detected;
	}


	public Double getCpu_usage() {
		return cpu_usage;
	}

	public double getCpu_usageEx() {
		return cpu_usage != null ? cpu_usage : 0;
	}

	public void setCpu_usage(double cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	public void setCpu_usage(Double cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	public void unSetCpu_usage() {
		this.cpu_usage = null;
	}

	public Long getFree_memory() {
		return free_memory;
	}

	public long getFree_memoryEx() {
		return free_memory != null ? free_memory : 0L;
	}

	public void setFree_memory(long free_memory) {
		this.free_memory = free_memory;
	}

	public void setFree_memory(Long free_memory) {
		this.free_memory = free_memory;
	}

	public void unSetFree_memory() {
		this.free_memory = null;
	}

	public Long getTotal_memory() {
		return total_memory;
	}

	public long getTotal_memoryEx() {
		return total_memory != null ? total_memory : 0L;
	}

	public void setTotal_memory(long total_memory) {
		this.total_memory = total_memory;
	}

	public void setTotal_memory(Long total_memory) {
		this.total_memory = total_memory;
	}

	public void unSetTotal_memory() {
		this.total_memory = null;
	}

	public Long getUsage_memory() {
		return usage_memory;
	}

	public long getUsage_memoryEx() {
		return usage_memory != null ? usage_memory : 0L;
	}

	public void setUsage_memory(long usage_memory) {
		this.usage_memory = usage_memory;
	}

	public void setUsage_memory(Long usage_memory) {
		this.usage_memory = usage_memory;
	}

	public void unSetUsage_memory() {
		this.usage_memory = null;
	}

	public Long getFree_disk() {
		return free_disk;
	}

	public long getFree_diskEx() {
		return free_disk != null ? free_disk : 0L;
	}

	public void setFree_disk(long free_disk) {
		this.free_disk = free_disk;
	}

	public void setFree_disk(Long free_disk) {
		this.free_disk = free_disk;
	}

	public void unSetFree_disk() {
		this.free_disk = null;
	}

	public Long getTotal_disk() {
		return total_disk;
	}

	public long getTotal_diskEx() {
		return total_disk != null ? total_disk : 0L;
	}

	public void setTotal_disk(long total_disk) {
		this.total_disk = total_disk;
	}

	public void setTotal_disk(Long total_disk) {
		this.total_disk = total_disk;
	}

	public void unSetTotal_disk() {
		this.total_disk = null;
	}

	public Long getUsage_disk() {
		return usage_disk;
	}

	public long getUsage_diskEx() {
		return usage_disk != null ? usage_disk : 0L;
	}

	public void setUsage_disk(long usage_disk) {
		this.usage_disk = usage_disk;
	}

	public void setUsage_disk(Long usage_disk) {
		this.usage_disk = usage_disk;
	}

	public void unSetUsage_disk() {
		this.usage_disk = null;
	}

	public Long getNumber_of_connections() {
		return number_of_connections;
	}

	public long getNumber_of_connectionsEx() {
		return number_of_connections != null ? number_of_connections : 0L;
	}

	public void setNumber_of_connections(long number_of_connections) {
		this.number_of_connections = number_of_connections;
	}

	public void setNumber_of_connections(Long number_of_connections) {
		this.number_of_connections = number_of_connections;
	}

	public void unSetNumber_of_connections() {
		this.number_of_connections = null;
	}

	public Long getNumber_of_controllers() {
		return number_of_controllers;
	}

	public long getNumber_of_controllersEx() {
		return number_of_controllers != null ? number_of_controllers : 0L;
	}

	public void setNumber_of_controllers(long number_of_controllers) {
		this.number_of_controllers = number_of_controllers;
	}

	public void setNumber_of_controllers(Long number_of_controllers) {
		this.number_of_controllers = number_of_controllers;
	}

	public void unSetNumber_of_controllers() {
		this.number_of_controllers = null;
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