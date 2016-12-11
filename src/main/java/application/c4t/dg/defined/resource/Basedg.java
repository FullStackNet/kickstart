/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.dg.defined.resource;

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
public abstract class Basedg extends BaseResource {
	private String id = null;
	private String name = null;
	private String make_id = null;
	private String customer_id = null;
	private String user_id = null;
	private String model_id = null;
	private String type = null;
	private String sub_type = null;
	private String manager = null;
	private String serial_no = null;
	private String manufecturing_date = null;
	private String next_servicing_date = null;
	private Number threshold_fuel_level = null;
	private Number capacity = null;
	private Integer maintainace_run_hour = null;
	private String connected = null;
	private String config = null;
	private Number fuel_level = null;
	private Number fuel_quantity = null;
	private String state = null;
	private Long last_disconnect_time = null;
	private Long last_update_time = null;
	private Number langitude = null;
	private Number latitude = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MAKE_ID = "make_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_MODEL_ID = "model_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_SUB_TYPE = "sub_type";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_SERIAL_NO = "serial_no";
	public static String FIELD_MANUFECTURING_DATE = "manufecturing_date";
	public static String FIELD_NEXT_SERVICING_DATE = "next_servicing_date";
	public static String FIELD_THRESHOLD_FUEL_LEVEL = "threshold_fuel_level";
	public static String FIELD_CAPACITY = "capacity";
	public static String FIELD_MAINTAINACE_RUN_HOUR = "maintainace_run_hour";
	public static String FIELD_CONNECTED = "connected";
	public static String FIELD_CONFIG = "config";
	public static String FIELD_FUEL_LEVEL = "fuel_level";
	public static String FIELD_FUEL_QUANTITY = "fuel_quantity";
	public static String FIELD_STATE = "state";
	public static String FIELD_LAST_DISCONNECT_TIME = "last_disconnect_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_LANGITUDE = "langitude";
	public static String FIELD_LATITUDE = "latitude";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("dg");

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

		Field make_idField = new Field("make_id", "String");
		make_idField.setRequired(true);
		make_idField.setLength(128);
		metaData.addField(make_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field model_idField = new Field("model_id", "String");
		model_idField.setRequired(true);
		model_idField.setLength(128);
		metaData.addField(model_idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field sub_typeField = new Field("sub_type", "String");
		sub_typeField.setLength(32);
		metaData.addField(sub_typeField);

		Field managerField = new Field("manager", "String");
		managerField.setRequired(true);
		managerField.setLength(128);
		metaData.addField(managerField);

		Field serial_noField = new Field("serial_no", "String");
		serial_noField.setLength(64);
		metaData.addField(serial_noField);

		Field manufecturing_dateField = new Field("manufecturing_date", "String");
		manufecturing_dateField.setLength(32);
		metaData.addField(manufecturing_dateField);

		Field next_servicing_dateField = new Field("next_servicing_date", "String");
		next_servicing_dateField.setLength(32);
		metaData.addField(next_servicing_dateField);

		Field threshold_fuel_levelField = new Field("threshold_fuel_level", "Number");
		threshold_fuel_levelField.setLength(10);
		threshold_fuel_levelField.setPrecision(2);
		metaData.addField(threshold_fuel_levelField);

		Field capacityField = new Field("capacity", "Number");
		capacityField.setLength(10);
		capacityField.setPrecision(2);
		metaData.addField(capacityField);

		Field maintainace_run_hourField = new Field("maintainace_run_hour", "int");
		maintainace_run_hourField.setLength(10);
		metaData.addField(maintainace_run_hourField);

		Field connectedField = new Field("connected", "String");
		connectedField.setDefaultValue("Y");
		connectedField.setLength(1);
		metaData.addField(connectedField);

		Field configField = new Field("config", "String");
		configField.setDefaultValue("Y");
		configField.setLength(1);
		metaData.addField(configField);

		Field fuel_levelField = new Field("fuel_level", "Number");
		fuel_levelField.setDefaultValue(0.00);
		fuel_levelField.setLength(10);
		fuel_levelField.setPrecision(2);
		metaData.addField(fuel_levelField);

		Field fuel_quantityField = new Field("fuel_quantity", "Number");
		fuel_quantityField.setDefaultValue(0.00);
		fuel_quantityField.setLength(10);
		fuel_quantityField.setPrecision(2);
		metaData.addField(fuel_quantityField);

		Field stateField = new Field("state", "String");
		stateField.setDefaultValue("N");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field last_disconnect_timeField = new Field("last_disconnect_time", "timestamp");
		metaData.addField(last_disconnect_timeField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field langitudeField = new Field("langitude", "Number");
		langitudeField.setDefaultValue(0.00);
		langitudeField.setLength(20);
		langitudeField.setPrecision(8);
		metaData.addField(langitudeField);

		Field latitudeField = new Field("latitude", "Number");
		latitudeField.setDefaultValue(0.00);
		latitudeField.setLength(20);
		latitudeField.setPrecision(8);
		metaData.addField(latitudeField);


		metaData.setTableName("appliance");

		metaData.setCluster("DB_DEVICE");
	}

	public Basedg() {}

	public Basedg(Basedg obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.make_id = obj.make_id;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.model_id = obj.model_id;
		this.type = obj.type;
		this.sub_type = obj.sub_type;
		this.manager = obj.manager;
		this.serial_no = obj.serial_no;
		this.manufecturing_date = obj.manufecturing_date;
		this.next_servicing_date = obj.next_servicing_date;
		this.threshold_fuel_level = obj.threshold_fuel_level;
		this.capacity = obj.capacity;
		this.maintainace_run_hour = obj.maintainace_run_hour;
		this.connected = obj.connected;
		this.config = obj.config;
		this.fuel_level = obj.fuel_level;
		this.fuel_quantity = obj.fuel_quantity;
		this.state = obj.state;
		this.last_disconnect_time = obj.last_disconnect_time;
		this.last_update_time = obj.last_update_time;
		this.langitude = obj.langitude;
		this.latitude = obj.latitude;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(connected == null)
			connected = "Y";
		if(config == null)
			config = "Y";
		if(fuel_level == null)
			fuel_level = 0.00;
		if(fuel_quantity == null)
			fuel_quantity = 0.00;
		if(state == null)
			state = "N";
		if(langitude == null)
			langitude = 0.00;
		if(latitude == null)
			latitude = 0.00;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(make_id != null)
			map.put("make_id", make_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(model_id != null)
			map.put("model_id", model_id);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(manager != null)
			map.put("manager", manager);
		if(serial_no != null)
			map.put("serial_no", serial_no);
		if(manufecturing_date != null)
			map.put("manufecturing_date", manufecturing_date);
		if(next_servicing_date != null)
			map.put("next_servicing_date", next_servicing_date);
		if(threshold_fuel_level != null)
			map.put("threshold_fuel_level", threshold_fuel_level);
		if(capacity != null)
			map.put("capacity", capacity);
		if(maintainace_run_hour != null)
			map.put("maintainace_run_hour", maintainace_run_hour);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(state != null)
			map.put("state", state);
		if(last_disconnect_time != null)
			map.put("last_disconnect_time", last_disconnect_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
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
		if(validateMake_id(add))
			map.put("make_id", make_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(validateModel_id(add))
			map.put("model_id", model_id);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(validateManager(add))
			map.put("manager", manager);
		if(serial_no != null)
			map.put("serial_no", serial_no);
		if(manufecturing_date != null)
			map.put("manufecturing_date", manufecturing_date);
		if(next_servicing_date != null)
			map.put("next_servicing_date", next_servicing_date);
		if(threshold_fuel_level != null)
			map.put("threshold_fuel_level", threshold_fuel_level);
		if(capacity != null)
			map.put("capacity", capacity);
		if(maintainace_run_hour != null)
			map.put("maintainace_run_hour", maintainace_run_hour);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(state != null)
			map.put("state", state);
		if(last_disconnect_time != null)
			map.put("last_disconnect_time", last_disconnect_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		name = (String) map.get("name");
		make_id = (String) map.get("make_id");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		model_id = (String) map.get("model_id");
		type = (String) map.get("type");
		sub_type = (String) map.get("sub_type");
		manager = (String) map.get("manager");
		serial_no = (String) map.get("serial_no");
		manufecturing_date = (String) map.get("manufecturing_date");
		next_servicing_date = (String) map.get("next_servicing_date");
		threshold_fuel_level = (Number) map.get("threshold_fuel_level");
		capacity = (Number) map.get("capacity");
		maintainace_run_hour = (Integer) map.get("maintainace_run_hour");
		connected = (String) map.get("connected");
		config = (String) map.get("config");
		fuel_level = (Number) map.get("fuel_level");
		fuel_quantity = (Number) map.get("fuel_quantity");
		state = (String) map.get("state");
		last_disconnect_time = (Long) map.get("last_disconnect_time");
		last_update_time = (Long) map.get("last_update_time");
		langitude = (Number) map.get("langitude");
		latitude = (Number) map.get("latitude");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object make_idObj = map.get("make_id");
		if(make_idObj != null)
			make_id = make_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object model_idObj = map.get("model_id");
		if(model_idObj != null)
			model_id = model_idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object sub_typeObj = map.get("sub_type");
		if(sub_typeObj != null)
			sub_type = sub_typeObj.toString();

		Object managerObj = map.get("manager");
		if(managerObj != null)
			manager = managerObj.toString();

		Object serial_noObj = map.get("serial_no");
		if(serial_noObj != null)
			serial_no = serial_noObj.toString();

		Object manufecturing_dateObj = map.get("manufecturing_date");
		if(manufecturing_dateObj != null)
			manufecturing_date = manufecturing_dateObj.toString();

		Object next_servicing_dateObj = map.get("next_servicing_date");
		if(next_servicing_dateObj != null)
			next_servicing_date = next_servicing_dateObj.toString();

		Object threshold_fuel_levelObj = map.get("threshold_fuel_level");
		if(threshold_fuel_levelObj != null)
			threshold_fuel_level = new Double(threshold_fuel_levelObj.toString());

		Object capacityObj = map.get("capacity");
		if(capacityObj != null)
			capacity = new Double(capacityObj.toString());

		Object maintainace_run_hourObj = map.get("maintainace_run_hour");
		if(maintainace_run_hourObj != null)
			maintainace_run_hour = new Integer(maintainace_run_hourObj.toString());

		Object connectedObj = map.get("connected");
		if(connectedObj != null)
			connected = connectedObj.toString();

		Object configObj = map.get("config");
		if(configObj != null)
			config = configObj.toString();

		Object fuel_levelObj = map.get("fuel_level");
		if(fuel_levelObj != null)
			fuel_level = new Double(fuel_levelObj.toString());

		Object fuel_quantityObj = map.get("fuel_quantity");
		if(fuel_quantityObj != null)
			fuel_quantity = new Double(fuel_quantityObj.toString());

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object last_disconnect_timeObj = map.get("last_disconnect_time");
		if(last_disconnect_timeObj != null)
			last_disconnect_time = (Long) last_disconnect_timeObj;

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = (Long) last_update_timeObj;

		Object langitudeObj = map.get("langitude");
		if(langitudeObj != null)
			langitude = new Double(langitudeObj.toString());

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = new Double(latitudeObj.toString());

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

	public String getMake_id() {
		return make_id;
	}

	public String getMake_idEx() {
		return make_id != null ? make_id : "";
	}

	public void setMake_id(String make_id) {
		this.make_id = make_id;
	}

	public void unSetMake_id() {
		this.make_id = null;
	}

	public boolean validateMake_id(boolean add) throws ApplicationException {
		if(add && make_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[make_id]");
		return make_id != null;
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

	public String getModel_id() {
		return model_id;
	}

	public String getModel_idEx() {
		return model_id != null ? model_id : "";
	}

	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}

	public void unSetModel_id() {
		this.model_id = null;
	}

	public boolean validateModel_id(boolean add) throws ApplicationException {
		if(add && model_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[model_id]");
		return model_id != null;
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

	public String getSub_type() {
		return sub_type;
	}

	public String getSub_typeEx() {
		return sub_type != null ? sub_type : "";
	}

	public void setSub_type(String sub_type) {
		this.sub_type = sub_type;
	}

	public void unSetSub_type() {
		this.sub_type = null;
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

	public boolean validateManager(boolean add) throws ApplicationException {
		if(add && manager == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[manager]");
		return manager != null;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public String getSerial_noEx() {
		return serial_no != null ? serial_no : "";
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public void unSetSerial_no() {
		this.serial_no = null;
	}

	public String getManufecturing_date() {
		return manufecturing_date;
	}

	public String getManufecturing_dateEx() {
		return manufecturing_date != null ? manufecturing_date : "";
	}

	public void setManufecturing_date(String manufecturing_date) {
		this.manufecturing_date = manufecturing_date;
	}

	public void unSetManufecturing_date() {
		this.manufecturing_date = null;
	}

	public String getNext_servicing_date() {
		return next_servicing_date;
	}

	public String getNext_servicing_dateEx() {
		return next_servicing_date != null ? next_servicing_date : "";
	}

	public void setNext_servicing_date(String next_servicing_date) {
		this.next_servicing_date = next_servicing_date;
	}

	public void unSetNext_servicing_date() {
		this.next_servicing_date = null;
	}

	public Number getThreshold_fuel_level() {
		return threshold_fuel_level;
	}

	public void setThreshold_fuel_level(Number threshold_fuel_level) {
		this.threshold_fuel_level = threshold_fuel_level;
	}

	public void unSetThreshold_fuel_level() {
		this.threshold_fuel_level = null;
	}

	public Number getCapacity() {
		return capacity;
	}

	public void setCapacity(Number capacity) {
		this.capacity = capacity;
	}

	public void unSetCapacity() {
		this.capacity = null;
	}

	public Integer getMaintainace_run_hour() {
		return maintainace_run_hour;
	}

	public int getMaintainace_run_hourEx() {
		return maintainace_run_hour != null ? maintainace_run_hour : 0;
	}

	public void setMaintainace_run_hour(int maintainace_run_hour) {
		this.maintainace_run_hour = maintainace_run_hour;
	}

	public void setMaintainace_run_hour(Integer maintainace_run_hour) {
		this.maintainace_run_hour = maintainace_run_hour;
	}

	public void unSetMaintainace_run_hour() {
		this.maintainace_run_hour = null;
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

	public Number getFuel_level() {
		return fuel_level != null ? fuel_level : 0.00;
	}

	public void setFuel_level(Number fuel_level) {
		this.fuel_level = fuel_level;
	}

	public void unSetFuel_level() {
		this.fuel_level = 0.00;
	}

	public Number getFuel_quantity() {
		return fuel_quantity != null ? fuel_quantity : 0.00;
	}

	public void setFuel_quantity(Number fuel_quantity) {
		this.fuel_quantity = fuel_quantity;
	}

	public void unSetFuel_quantity() {
		this.fuel_quantity = 0.00;
	}

	public String getState() {
		return state != null ? state : "N";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = "N";
	}

	public Long getLast_disconnect_time() {
		return last_disconnect_time;
	}

	public void setLast_disconnect_time(Long last_disconnect_time) {
		this.last_disconnect_time = last_disconnect_time;
	}


	public Long getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}


	public Number getLangitude() {
		return langitude != null ? langitude : 0.00;
	}

	public void setLangitude(Number langitude) {
		this.langitude = langitude;
	}

	public void unSetLangitude() {
		this.langitude = 0.00;
	}

	public Number getLatitude() {
		return latitude != null ? latitude : 0.00;
	}

	public void setLatitude(Number latitude) {
		this.latitude = latitude;
	}

	public void unSetLatitude() {
		this.latitude = 0.00;
	}
	public String getCluster() {
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}