/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

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
public abstract class Baseappliance_part extends BaseResource {
	private String id = null;
	private String name = null;
	private String make = null;
	private Number power_rating = null;
	private String type = null;
	private String applaince_type_id = null;
	private String consumer_id = null;
	private String manager = null;
	private String model = null;
	private String location_id = null;
	private String sub_location_id = null;
	private String site_id = null;
	private String tank_id = null;
	private Number dg_unit_opening = null;
	private Number dg_unit_consumed = null;
	private Number dg_unit_closing = null;
	private Number grid_unit_opening = null;
	private Number grid_unit_consumed = null;
	private Number grid_unit_closing = null;
	private String serial_no = null;
	private String rf_tag_id = null;
	private String manufecturing_date = null;
	private String next_servicing_date = null;
	private Number threshold_fuel_level = null;
	private Number capacity = null;
	private Integer maintainace_run_hour = null;
	private Number consumption_per_hour = null;
	private Number threshold_temperature_min_level = null;
	private Number threshold_temperature_max_level = null;
	private Number threshold_voltage_min_level = null;
	private Number threshold_voltage_max_level = null;
	private Number threshold_current_min_level = null;
	private Number threshold_current_max_level = null;
	private Number threshold_duration = null;
	private String asset_id = null;
	private String partner_id = null;
	private String tenent_id = null;
	private String customer_id = null;
	private String ex_type = null;
	private String interface_type = null;
	private Integer battery_number = null;
	private Integer number_of_batteries = null;
	private String deploy_type = null;
	private String connected = null;
	private String config = null;
	private String battery_status = null;
	private Integer battery_level = null;
	private Number last_reading = null;
	private Long last_reading_updated = null;
	private Number dg_reading = null;
	private Number grid_reading = null;
	private Integer voltage = null;
	private Integer current = null;
	private Number power = null;
	private Number temperature = null;
	private Number humidity = null;
	private String mode = null;
	private Integer level = null;
	private Number level_float = null;
	private Number fuel_level = null;
	private Number fuel_quantity = null;
	private String state = null;
	private String flow_state = null;
	private String load_state = null;
	private String vibration_state = null;
	private String prefilege_detected = null;
	private Long last_prefilege_detected_time = null;
	private String move_state = null;
	private Long last_moved_in_time = null;
	private Long last_moved_out_time = null;
	private Long last_disconnect_time = null;
	private Long last_update_time = null;
	private String activated = null;
	private String overload_dg = null;
	private String overload_grid = null;
	private String dg_on = null;
	private String appliance_id = null;
	private Integer unhealthy_batteries = null;
	private String bb_u_a = null;
	private String bb_n_u_a = null;
	private String bb_critical = null;
	private String bb_mains_fail = null;
	private String bb_rfa = null;
	private String bb_fuse_fail = null;
	private String lube_low_pressure = null;
	private String high_dg_water_temperature = null;
	private Number canopy_temperature = null;
	private String lastProcessedState = null;
	private Long lastProcessedTime = null;
	private String charging_state = null;
	private Number last_processed_fuel_quantity = null;
	private Number last_processed_db_reading = null;
	private Number last_processed_grid_reading = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MAKE = "make";
	public static String FIELD_POWER_RATING = "power_rating";
	public static String FIELD_TYPE = "type";
	public static String FIELD_APPLAINCE_TYPE_ID = "applaince_type_id";
	public static String FIELD_CONSUMER_ID = "consumer_id";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_MODEL = "model";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_SUB_LOCATION_ID = "sub_location_id";
	public static String FIELD_SITE_ID = "site_id";
	public static String FIELD_TANK_ID = "tank_id";
	public static String FIELD_DG_UNIT_OPENING = "dg_unit_opening";
	public static String FIELD_DG_UNIT_CONSUMED = "dg_unit_consumed";
	public static String FIELD_DG_UNIT_CLOSING = "dg_unit_closing";
	public static String FIELD_GRID_UNIT_OPENING = "grid_unit_opening";
	public static String FIELD_GRID_UNIT_CONSUMED = "grid_unit_consumed";
	public static String FIELD_GRID_UNIT_CLOSING = "grid_unit_closing";
	public static String FIELD_SERIAL_NO = "serial_no";
	public static String FIELD_RF_TAG_ID = "rf_tag_id";
	public static String FIELD_MANUFECTURING_DATE = "manufecturing_date";
	public static String FIELD_NEXT_SERVICING_DATE = "next_servicing_date";
	public static String FIELD_THRESHOLD_FUEL_LEVEL = "threshold_fuel_level";
	public static String FIELD_CAPACITY = "capacity";
	public static String FIELD_MAINTAINACE_RUN_HOUR = "maintainace_run_hour";
	public static String FIELD_CONSUMPTION_PER_HOUR = "consumption_per_hour";
	public static String FIELD_THRESHOLD_TEMPERATURE_MIN_LEVEL = "threshold_temperature_min_level";
	public static String FIELD_THRESHOLD_TEMPERATURE_MAX_LEVEL = "threshold_temperature_max_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MIN_LEVEL = "threshold_voltage_min_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MAX_LEVEL = "threshold_voltage_max_level";
	public static String FIELD_THRESHOLD_CURRENT_MIN_LEVEL = "threshold_current_min_level";
	public static String FIELD_THRESHOLD_CURRENT_MAX_LEVEL = "threshold_current_max_level";
	public static String FIELD_THRESHOLD_DURATION = "threshold_duration";
	public static String FIELD_ASSET_ID = "asset_id";
	public static String FIELD_PARTNER_ID = "partner_id";
	public static String FIELD_TENENT_ID = "tenent_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EX_TYPE = "ex_type";
	public static String FIELD_INTERFACE_TYPE = "interface_type";
	public static String FIELD_BATTERY_NUMBER = "battery_number";
	public static String FIELD_NUMBER_OF_BATTERIES = "number_of_batteries";
	public static String FIELD_DEPLOY_TYPE = "deploy_type";
	public static String FIELD_CONNECTED = "connected";
	public static String FIELD_CONFIG = "config";
	public static String FIELD_BATTERY_STATUS = "battery_status";
	public static String FIELD_BATTERY_LEVEL = "battery_level";
	public static String FIELD_LAST_READING = "last_reading";
	public static String FIELD_LAST_READING_UPDATED = "last_reading_updated";
	public static String FIELD_DG_READING = "dg_reading";
	public static String FIELD_GRID_READING = "grid_reading";
	public static String FIELD_VOLTAGE = "voltage";
	public static String FIELD_CURRENT = "current";
	public static String FIELD_POWER = "power";
	public static String FIELD_TEMPERATURE = "temperature";
	public static String FIELD_HUMIDITY = "humidity";
	public static String FIELD_MODE = "mode";
	public static String FIELD_LEVEL = "level";
	public static String FIELD_LEVEL_FLOAT = "level_float";
	public static String FIELD_FUEL_LEVEL = "fuel_level";
	public static String FIELD_FUEL_QUANTITY = "fuel_quantity";
	public static String FIELD_STATE = "state";
	public static String FIELD_FLOW_STATE = "flow_state";
	public static String FIELD_LOAD_STATE = "load_state";
	public static String FIELD_VIBRATION_STATE = "vibration_state";
	public static String FIELD_PREFILEGE_DETECTED = "prefilege_detected";
	public static String FIELD_LAST_PREFILEGE_DETECTED_TIME = "last_prefilege_detected_time";
	public static String FIELD_MOVE_STATE = "move_state";
	public static String FIELD_LAST_MOVED_IN_TIME = "last_moved_in_time";
	public static String FIELD_LAST_MOVED_OUT_TIME = "last_moved_out_time";
	public static String FIELD_LAST_DISCONNECT_TIME = "last_disconnect_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_ACTIVATED = "activated";
	public static String FIELD_OVERLOAD_DG = "overload_dg";
	public static String FIELD_OVERLOAD_GRID = "overload_grid";
	public static String FIELD_DG_ON = "dg_on";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_UNHEALTHY_BATTERIES = "unhealthy_batteries";
	public static String FIELD_BB_U_A = "bb_u_a";
	public static String FIELD_BB_N_U_A = "bb_n_u_a";
	public static String FIELD_BB_CRITICAL = "bb_critical";
	public static String FIELD_BB_MAINS_FAIL = "bb_mains_fail";
	public static String FIELD_BB_RFA = "bb_rfa";
	public static String FIELD_BB_FUSE_FAIL = "bb_fuse_fail";
	public static String FIELD_LUBE_LOW_PRESSURE = "lube_low_pressure";
	public static String FIELD_HIGH_DG_WATER_TEMPERATURE = "high_dg_water_temperature";
	public static String FIELD_CANOPY_TEMPERATURE = "canopy_temperature";
	public static String FIELD_LASTPROCESSEDSTATE = "lastProcessedState";
	public static String FIELD_LASTPROCESSEDTIME = "lastProcessedTime";
	public static String FIELD_CHARGING_STATE = "charging_state";
	public static String FIELD_LAST_PROCESSED_FUEL_QUANTITY = "last_processed_fuel_quantity";
	public static String FIELD_LAST_PROCESSED_DB_READING = "last_processed_db_reading";
	public static String FIELD_LAST_PROCESSED_GRID_READING = "last_processed_grid_reading";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_part");

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

		Field makeField = new Field("make", "String");
		makeField.setLength(128);
		metaData.addField(makeField);

		Field power_ratingField = new Field("power_rating", "Number");
		power_ratingField.setDefaultValue(0.0000);
		power_ratingField.setLength(16);
		power_ratingField.setPrecision(4);
		metaData.addField(power_ratingField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field applaince_type_idField = new Field("applaince_type_id", "String");
		applaince_type_idField.setLength(128);
		metaData.addField(applaince_type_idField);

		Field consumer_idField = new Field("consumer_id", "String");
		consumer_idField.setLength(128);
		metaData.addField(consumer_idField);

		Field managerField = new Field("manager", "String");
		managerField.setLength(128);
		metaData.addField(managerField);

		Field modelField = new Field("model", "String");
		modelField.setLength(128);
		metaData.addField(modelField);

		Field location_idField = new Field("location_id", "String");
		location_idField.setLength(128);
		metaData.addField(location_idField);

		Field sub_location_idField = new Field("sub_location_id", "String");
		sub_location_idField.setLength(128);
		metaData.addField(sub_location_idField);

		Field site_idField = new Field("site_id", "String");
		site_idField.setLength(128);
		metaData.addField(site_idField);

		Field tank_idField = new Field("tank_id", "String");
		tank_idField.setLength(128);
		metaData.addField(tank_idField);

		Field dg_unit_openingField = new Field("dg_unit_opening", "Number");
		dg_unit_openingField.setDefaultValue(0.0000);
		dg_unit_openingField.setLength(12);
		dg_unit_openingField.setPrecision(4);
		metaData.addField(dg_unit_openingField);

		Field dg_unit_consumedField = new Field("dg_unit_consumed", "Number");
		dg_unit_consumedField.setDefaultValue(0.0000);
		dg_unit_consumedField.setLength(12);
		dg_unit_consumedField.setPrecision(4);
		metaData.addField(dg_unit_consumedField);

		Field dg_unit_closingField = new Field("dg_unit_closing", "Number");
		dg_unit_closingField.setDefaultValue(0.0000);
		dg_unit_closingField.setLength(12);
		dg_unit_closingField.setPrecision(4);
		metaData.addField(dg_unit_closingField);

		Field grid_unit_openingField = new Field("grid_unit_opening", "Number");
		grid_unit_openingField.setDefaultValue(0.0000);
		grid_unit_openingField.setLength(12);
		grid_unit_openingField.setPrecision(4);
		metaData.addField(grid_unit_openingField);

		Field grid_unit_consumedField = new Field("grid_unit_consumed", "Number");
		grid_unit_consumedField.setDefaultValue(0.0000);
		grid_unit_consumedField.setLength(12);
		grid_unit_consumedField.setPrecision(4);
		metaData.addField(grid_unit_consumedField);

		Field grid_unit_closingField = new Field("grid_unit_closing", "Number");
		grid_unit_closingField.setDefaultValue(0.0000);
		grid_unit_closingField.setLength(12);
		grid_unit_closingField.setPrecision(4);
		metaData.addField(grid_unit_closingField);

		Field serial_noField = new Field("serial_no", "String");
		serial_noField.setLength(64);
		metaData.addField(serial_noField);

		Field rf_tag_idField = new Field("rf_tag_id", "String");
		rf_tag_idField.setLength(64);
		metaData.addField(rf_tag_idField);

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

		Field consumption_per_hourField = new Field("consumption_per_hour", "Number");
		consumption_per_hourField.setLength(10);
		consumption_per_hourField.setPrecision(2);
		metaData.addField(consumption_per_hourField);

		Field threshold_temperature_min_levelField = new Field("threshold_temperature_min_level", "Number");
		threshold_temperature_min_levelField.setLength(10);
		threshold_temperature_min_levelField.setPrecision(2);
		metaData.addField(threshold_temperature_min_levelField);

		Field threshold_temperature_max_levelField = new Field("threshold_temperature_max_level", "Number");
		threshold_temperature_max_levelField.setLength(10);
		threshold_temperature_max_levelField.setPrecision(2);
		metaData.addField(threshold_temperature_max_levelField);

		Field threshold_voltage_min_levelField = new Field("threshold_voltage_min_level", "Number");
		threshold_voltage_min_levelField.setLength(10);
		metaData.addField(threshold_voltage_min_levelField);

		Field threshold_voltage_max_levelField = new Field("threshold_voltage_max_level", "Number");
		threshold_voltage_max_levelField.setLength(10);
		metaData.addField(threshold_voltage_max_levelField);

		Field threshold_current_min_levelField = new Field("threshold_current_min_level", "Number");
		threshold_current_min_levelField.setLength(10);
		metaData.addField(threshold_current_min_levelField);

		Field threshold_current_max_levelField = new Field("threshold_current_max_level", "Number");
		threshold_current_max_levelField.setLength(10);
		metaData.addField(threshold_current_max_levelField);

		Field threshold_durationField = new Field("threshold_duration", "Number");
		threshold_durationField.setLength(10);
		metaData.addField(threshold_durationField);

		Field asset_idField = new Field("asset_id", "String");
		asset_idField.setLength(128);
		metaData.addField(asset_idField);

		Field partner_idField = new Field("partner_id", "String");
		partner_idField.setLength(128);
		metaData.addField(partner_idField);

		Field tenent_idField = new Field("tenent_id", "String");
		tenent_idField.setLength(128);
		metaData.addField(tenent_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field ex_typeField = new Field("ex_type", "String");
		ex_typeField.setDefaultValue("ENABLED");
		ex_typeField.setLength(16);
		metaData.addField(ex_typeField);

		Field interface_typeField = new Field("interface_type", "String");
		interface_typeField.setLength(32);
		metaData.addField(interface_typeField);

		Field battery_numberField = new Field("battery_number", "int");
		battery_numberField.setLength(3);
		metaData.addField(battery_numberField);

		Field number_of_batteriesField = new Field("number_of_batteries", "int");
		number_of_batteriesField.setLength(3);
		metaData.addField(number_of_batteriesField);

		Field deploy_typeField = new Field("deploy_type", "String");
		deploy_typeField.setDefaultValue("LOCATION");
		deploy_typeField.setLength(16);
		metaData.addField(deploy_typeField);

		Field connectedField = new Field("connected", "String");
		connectedField.setDefaultValue("Y");
		connectedField.setLength(1);
		metaData.addField(connectedField);

		Field configField = new Field("config", "String");
		configField.setDefaultValue("Y");
		configField.setLength(1);
		metaData.addField(configField);

		Field battery_statusField = new Field("battery_status", "String");
		battery_statusField.setDefaultValue("O");
		battery_statusField.setLength(1);
		metaData.addField(battery_statusField);

		Field battery_levelField = new Field("battery_level", "int");
		battery_levelField.setDefaultValue(100);
		battery_levelField.setLength(3);
		metaData.addField(battery_levelField);

		Field last_readingField = new Field("last_reading", "Number");
		last_readingField.setDefaultValue(0.0000);
		last_readingField.setLength(16);
		last_readingField.setPrecision(4);
		metaData.addField(last_readingField);

		Field last_reading_updatedField = new Field("last_reading_updated", "timestamp");
		last_reading_updatedField.setRequired(true);
		last_reading_updatedField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(last_reading_updatedField);

		Field dg_readingField = new Field("dg_reading", "Number");
		dg_readingField.setDefaultValue(0.0000);
		dg_readingField.setLength(12);
		dg_readingField.setPrecision(4);
		metaData.addField(dg_readingField);

		Field grid_readingField = new Field("grid_reading", "Number");
		grid_readingField.setDefaultValue(0.0000);
		grid_readingField.setLength(12);
		grid_readingField.setPrecision(4);
		metaData.addField(grid_readingField);

		Field voltageField = new Field("voltage", "int");
		voltageField.setDefaultValue(0);
		voltageField.setLength(5);
		metaData.addField(voltageField);

		Field currentField = new Field("current", "int");
		currentField.setDefaultValue(0);
		currentField.setLength(5);
		metaData.addField(currentField);

		Field powerField = new Field("power", "Number");
		powerField.setDefaultValue(0.0000);
		powerField.setLength(16);
		powerField.setPrecision(4);
		metaData.addField(powerField);

		Field temperatureField = new Field("temperature", "Number");
		temperatureField.setDefaultValue(0.00);
		temperatureField.setLength(6);
		temperatureField.setPrecision(2);
		metaData.addField(temperatureField);

		Field humidityField = new Field("humidity", "Number");
		humidityField.setDefaultValue(0.00);
		humidityField.setLength(6);
		humidityField.setPrecision(2);
		metaData.addField(humidityField);

		Field modeField = new Field("mode", "String");
		modeField.setDefaultValue("D");
		modeField.setLength(1);
		metaData.addField(modeField);

		Field levelField = new Field("level", "int");
		levelField.setDefaultValue(0);
		levelField.setLength(3);
		metaData.addField(levelField);

		Field level_floatField = new Field("level_float", "Number");
		level_floatField.setDefaultValue(0.00);
		level_floatField.setLength(10);
		level_floatField.setPrecision(2);
		metaData.addField(level_floatField);

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

		Field flow_stateField = new Field("flow_state", "String");
		flow_stateField.setDefaultValue("N");
		flow_stateField.setLength(4);
		metaData.addField(flow_stateField);

		Field load_stateField = new Field("load_state", "String");
		load_stateField.setDefaultValue("N");
		load_stateField.setLength(4);
		metaData.addField(load_stateField);

		Field vibration_stateField = new Field("vibration_state", "String");
		vibration_stateField.setDefaultValue("N");
		vibration_stateField.setLength(4);
		metaData.addField(vibration_stateField);

		Field prefilege_detectedField = new Field("prefilege_detected", "String");
		prefilege_detectedField.setLength(4);
		metaData.addField(prefilege_detectedField);

		Field last_prefilege_detected_timeField = new Field("last_prefilege_detected_time", "timestamp");
		metaData.addField(last_prefilege_detected_timeField);

		Field move_stateField = new Field("move_state", "String");
		move_stateField.setLength(32);
		metaData.addField(move_stateField);

		Field last_moved_in_timeField = new Field("last_moved_in_time", "timestamp");
		metaData.addField(last_moved_in_timeField);

		Field last_moved_out_timeField = new Field("last_moved_out_time", "timestamp");
		metaData.addField(last_moved_out_timeField);

		Field last_disconnect_timeField = new Field("last_disconnect_time", "timestamp");
		metaData.addField(last_disconnect_timeField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field activatedField = new Field("activated", "String");
		activatedField.setDefaultValue("N");
		activatedField.setLength(1);
		metaData.addField(activatedField);

		Field overload_dgField = new Field("overload_dg", "String");
		overload_dgField.setDefaultValue("N");
		overload_dgField.setLength(1);
		metaData.addField(overload_dgField);

		Field overload_gridField = new Field("overload_grid", "String");
		overload_gridField.setDefaultValue("N");
		overload_gridField.setLength(1);
		metaData.addField(overload_gridField);

		Field dg_onField = new Field("dg_on", "String");
		dg_onField.setDefaultValue("N");
		dg_onField.setLength(1);
		metaData.addField(dg_onField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field unhealthy_batteriesField = new Field("unhealthy_batteries", "int");
		unhealthy_batteriesField.setDefaultValue(0);
		unhealthy_batteriesField.setLength(3);
		metaData.addField(unhealthy_batteriesField);

		Field bb_u_aField = new Field("bb_u_a", "String");
		bb_u_aField.setDefaultValue("N");
		bb_u_aField.setLength(1);
		metaData.addField(bb_u_aField);

		Field bb_n_u_aField = new Field("bb_n_u_a", "String");
		bb_n_u_aField.setDefaultValue("N");
		bb_n_u_aField.setLength(1);
		metaData.addField(bb_n_u_aField);

		Field bb_criticalField = new Field("bb_critical", "String");
		bb_criticalField.setDefaultValue("N");
		bb_criticalField.setLength(1);
		metaData.addField(bb_criticalField);

		Field bb_mains_failField = new Field("bb_mains_fail", "String");
		bb_mains_failField.setDefaultValue("N");
		bb_mains_failField.setLength(1);
		metaData.addField(bb_mains_failField);

		Field bb_rfaField = new Field("bb_rfa", "String");
		bb_rfaField.setDefaultValue("N");
		bb_rfaField.setLength(1);
		metaData.addField(bb_rfaField);

		Field bb_fuse_failField = new Field("bb_fuse_fail", "String");
		bb_fuse_failField.setDefaultValue("N");
		bb_fuse_failField.setLength(1);
		metaData.addField(bb_fuse_failField);

		Field lube_low_pressureField = new Field("lube_low_pressure", "String");
		lube_low_pressureField.setDefaultValue("N");
		lube_low_pressureField.setLength(1);
		metaData.addField(lube_low_pressureField);

		Field high_dg_water_temperatureField = new Field("high_dg_water_temperature", "String");
		high_dg_water_temperatureField.setDefaultValue("N");
		high_dg_water_temperatureField.setLength(1);
		metaData.addField(high_dg_water_temperatureField);

		Field canopy_temperatureField = new Field("canopy_temperature", "Number");
		canopy_temperatureField.setDefaultValue(0.00);
		canopy_temperatureField.setLength(6);
		canopy_temperatureField.setPrecision(2);
		metaData.addField(canopy_temperatureField);

		Field lastProcessedStateField = new Field("lastProcessedState", "String");
		lastProcessedStateField.setDefaultValue("STOP");
		lastProcessedStateField.setLength(32);
		metaData.addField(lastProcessedStateField);

		Field lastProcessedTimeField = new Field("lastProcessedTime", "timestamp");
		metaData.addField(lastProcessedTimeField);

		Field charging_stateField = new Field("charging_state", "String");
		charging_stateField.setDefaultValue("N");
		charging_stateField.setLength(1);
		metaData.addField(charging_stateField);

		Field last_processed_fuel_quantityField = new Field("last_processed_fuel_quantity", "Number");
		last_processed_fuel_quantityField.setDefaultValue(0.00);
		last_processed_fuel_quantityField.setLength(15);
		last_processed_fuel_quantityField.setPrecision(4);
		metaData.addField(last_processed_fuel_quantityField);

		Field last_processed_db_readingField = new Field("last_processed_db_reading", "Number");
		last_processed_db_readingField.setDefaultValue(0.00);
		last_processed_db_readingField.setLength(15);
		last_processed_db_readingField.setPrecision(4);
		metaData.addField(last_processed_db_readingField);

		Field last_processed_grid_readingField = new Field("last_processed_grid_reading", "Number");
		last_processed_grid_readingField.setDefaultValue(0.00);
		last_processed_grid_readingField.setLength(15);
		last_processed_grid_readingField.setPrecision(4);
		metaData.addField(last_processed_grid_readingField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_part");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_part() {}

	public Baseappliance_part(Baseappliance_part obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.make = obj.make;
		this.power_rating = obj.power_rating;
		this.type = obj.type;
		this.applaince_type_id = obj.applaince_type_id;
		this.consumer_id = obj.consumer_id;
		this.manager = obj.manager;
		this.model = obj.model;
		this.location_id = obj.location_id;
		this.sub_location_id = obj.sub_location_id;
		this.site_id = obj.site_id;
		this.tank_id = obj.tank_id;
		this.dg_unit_opening = obj.dg_unit_opening;
		this.dg_unit_consumed = obj.dg_unit_consumed;
		this.dg_unit_closing = obj.dg_unit_closing;
		this.grid_unit_opening = obj.grid_unit_opening;
		this.grid_unit_consumed = obj.grid_unit_consumed;
		this.grid_unit_closing = obj.grid_unit_closing;
		this.serial_no = obj.serial_no;
		this.rf_tag_id = obj.rf_tag_id;
		this.manufecturing_date = obj.manufecturing_date;
		this.next_servicing_date = obj.next_servicing_date;
		this.threshold_fuel_level = obj.threshold_fuel_level;
		this.capacity = obj.capacity;
		this.maintainace_run_hour = obj.maintainace_run_hour;
		this.consumption_per_hour = obj.consumption_per_hour;
		this.threshold_temperature_min_level = obj.threshold_temperature_min_level;
		this.threshold_temperature_max_level = obj.threshold_temperature_max_level;
		this.threshold_voltage_min_level = obj.threshold_voltage_min_level;
		this.threshold_voltage_max_level = obj.threshold_voltage_max_level;
		this.threshold_current_min_level = obj.threshold_current_min_level;
		this.threshold_current_max_level = obj.threshold_current_max_level;
		this.threshold_duration = obj.threshold_duration;
		this.asset_id = obj.asset_id;
		this.partner_id = obj.partner_id;
		this.tenent_id = obj.tenent_id;
		this.customer_id = obj.customer_id;
		this.ex_type = obj.ex_type;
		this.interface_type = obj.interface_type;
		this.battery_number = obj.battery_number;
		this.number_of_batteries = obj.number_of_batteries;
		this.deploy_type = obj.deploy_type;
		this.connected = obj.connected;
		this.config = obj.config;
		this.battery_status = obj.battery_status;
		this.battery_level = obj.battery_level;
		this.last_reading = obj.last_reading;
		this.last_reading_updated = obj.last_reading_updated;
		this.dg_reading = obj.dg_reading;
		this.grid_reading = obj.grid_reading;
		this.voltage = obj.voltage;
		this.current = obj.current;
		this.power = obj.power;
		this.temperature = obj.temperature;
		this.humidity = obj.humidity;
		this.mode = obj.mode;
		this.level = obj.level;
		this.level_float = obj.level_float;
		this.fuel_level = obj.fuel_level;
		this.fuel_quantity = obj.fuel_quantity;
		this.state = obj.state;
		this.flow_state = obj.flow_state;
		this.load_state = obj.load_state;
		this.vibration_state = obj.vibration_state;
		this.prefilege_detected = obj.prefilege_detected;
		this.last_prefilege_detected_time = obj.last_prefilege_detected_time;
		this.move_state = obj.move_state;
		this.last_moved_in_time = obj.last_moved_in_time;
		this.last_moved_out_time = obj.last_moved_out_time;
		this.last_disconnect_time = obj.last_disconnect_time;
		this.last_update_time = obj.last_update_time;
		this.activated = obj.activated;
		this.overload_dg = obj.overload_dg;
		this.overload_grid = obj.overload_grid;
		this.dg_on = obj.dg_on;
		this.appliance_id = obj.appliance_id;
		this.unhealthy_batteries = obj.unhealthy_batteries;
		this.bb_u_a = obj.bb_u_a;
		this.bb_n_u_a = obj.bb_n_u_a;
		this.bb_critical = obj.bb_critical;
		this.bb_mains_fail = obj.bb_mains_fail;
		this.bb_rfa = obj.bb_rfa;
		this.bb_fuse_fail = obj.bb_fuse_fail;
		this.lube_low_pressure = obj.lube_low_pressure;
		this.high_dg_water_temperature = obj.high_dg_water_temperature;
		this.canopy_temperature = obj.canopy_temperature;
		this.lastProcessedState = obj.lastProcessedState;
		this.lastProcessedTime = obj.lastProcessedTime;
		this.charging_state = obj.charging_state;
		this.last_processed_fuel_quantity = obj.last_processed_fuel_quantity;
		this.last_processed_db_reading = obj.last_processed_db_reading;
		this.last_processed_grid_reading = obj.last_processed_grid_reading;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(power_rating == null)
			power_rating = 0.0000;
		if(dg_unit_opening == null)
			dg_unit_opening = 0.0000;
		if(dg_unit_consumed == null)
			dg_unit_consumed = 0.0000;
		if(dg_unit_closing == null)
			dg_unit_closing = 0.0000;
		if(grid_unit_opening == null)
			grid_unit_opening = 0.0000;
		if(grid_unit_consumed == null)
			grid_unit_consumed = 0.0000;
		if(grid_unit_closing == null)
			grid_unit_closing = 0.0000;
		if(ex_type == null)
			ex_type = "ENABLED";
		if(deploy_type == null)
			deploy_type = "LOCATION";
		if(connected == null)
			connected = "Y";
		if(config == null)
			config = "Y";
		if(battery_status == null)
			battery_status = "O";
		if(battery_level == null)
			battery_level = 100;
		if(last_reading == null)
			last_reading = 0.0000;
		if(dg_reading == null)
			dg_reading = 0.0000;
		if(grid_reading == null)
			grid_reading = 0.0000;
		if(voltage == null)
			voltage = 0;
		if(current == null)
			current = 0;
		if(power == null)
			power = 0.0000;
		if(temperature == null)
			temperature = 0.00;
		if(humidity == null)
			humidity = 0.00;
		if(mode == null)
			mode = "D";
		if(level == null)
			level = 0;
		if(level_float == null)
			level_float = 0.00;
		if(fuel_level == null)
			fuel_level = 0.00;
		if(fuel_quantity == null)
			fuel_quantity = 0.00;
		if(state == null)
			state = "N";
		if(flow_state == null)
			flow_state = "N";
		if(load_state == null)
			load_state = "N";
		if(vibration_state == null)
			vibration_state = "N";
		if(activated == null)
			activated = "N";
		if(overload_dg == null)
			overload_dg = "N";
		if(overload_grid == null)
			overload_grid = "N";
		if(dg_on == null)
			dg_on = "N";
		if(unhealthy_batteries == null)
			unhealthy_batteries = 0;
		if(bb_u_a == null)
			bb_u_a = "N";
		if(bb_n_u_a == null)
			bb_n_u_a = "N";
		if(bb_critical == null)
			bb_critical = "N";
		if(bb_mains_fail == null)
			bb_mains_fail = "N";
		if(bb_rfa == null)
			bb_rfa = "N";
		if(bb_fuse_fail == null)
			bb_fuse_fail = "N";
		if(lube_low_pressure == null)
			lube_low_pressure = "N";
		if(high_dg_water_temperature == null)
			high_dg_water_temperature = "N";
		if(canopy_temperature == null)
			canopy_temperature = 0.00;
		if(lastProcessedState == null)
			lastProcessedState = "STOP";
		if(charging_state == null)
			charging_state = "N";
		if(last_processed_fuel_quantity == null)
			last_processed_fuel_quantity = 0.00;
		if(last_processed_db_reading == null)
			last_processed_db_reading = 0.00;
		if(last_processed_grid_reading == null)
			last_processed_grid_reading = 0.00;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(make != null)
			map.put("make", make);
		if(power_rating != null)
			map.put("power_rating", power_rating);
		if(type != null)
			map.put("type", type);
		if(applaince_type_id != null)
			map.put("applaince_type_id", applaince_type_id);
		if(consumer_id != null)
			map.put("consumer_id", consumer_id);
		if(manager != null)
			map.put("manager", manager);
		if(model != null)
			map.put("model", model);
		if(location_id != null)
			map.put("location_id", location_id);
		if(sub_location_id != null)
			map.put("sub_location_id", sub_location_id);
		if(site_id != null)
			map.put("site_id", site_id);
		if(tank_id != null)
			map.put("tank_id", tank_id);
		if(dg_unit_opening != null)
			map.put("dg_unit_opening", dg_unit_opening);
		if(dg_unit_consumed != null)
			map.put("dg_unit_consumed", dg_unit_consumed);
		if(dg_unit_closing != null)
			map.put("dg_unit_closing", dg_unit_closing);
		if(grid_unit_opening != null)
			map.put("grid_unit_opening", grid_unit_opening);
		if(grid_unit_consumed != null)
			map.put("grid_unit_consumed", grid_unit_consumed);
		if(grid_unit_closing != null)
			map.put("grid_unit_closing", grid_unit_closing);
		if(serial_no != null)
			map.put("serial_no", serial_no);
		if(rf_tag_id != null)
			map.put("rf_tag_id", rf_tag_id);
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
		if(consumption_per_hour != null)
			map.put("consumption_per_hour", consumption_per_hour);
		if(threshold_temperature_min_level != null)
			map.put("threshold_temperature_min_level", threshold_temperature_min_level);
		if(threshold_temperature_max_level != null)
			map.put("threshold_temperature_max_level", threshold_temperature_max_level);
		if(threshold_voltage_min_level != null)
			map.put("threshold_voltage_min_level", threshold_voltage_min_level);
		if(threshold_voltage_max_level != null)
			map.put("threshold_voltage_max_level", threshold_voltage_max_level);
		if(threshold_current_min_level != null)
			map.put("threshold_current_min_level", threshold_current_min_level);
		if(threshold_current_max_level != null)
			map.put("threshold_current_max_level", threshold_current_max_level);
		if(threshold_duration != null)
			map.put("threshold_duration", threshold_duration);
		if(asset_id != null)
			map.put("asset_id", asset_id);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(ex_type != null)
			map.put("ex_type", ex_type);
		if(interface_type != null)
			map.put("interface_type", interface_type);
		if(battery_number != null)
			map.put("battery_number", battery_number);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(deploy_type != null)
			map.put("deploy_type", deploy_type);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(battery_status != null)
			map.put("battery_status", battery_status);
		if(battery_level != null)
			map.put("battery_level", battery_level);
		if(last_reading != null)
			map.put("last_reading", last_reading);
		if(last_reading_updated != null)
			map.put("last_reading_updated", last_reading_updated);
		if(dg_reading != null)
			map.put("dg_reading", dg_reading);
		if(grid_reading != null)
			map.put("grid_reading", grid_reading);
		if(voltage != null)
			map.put("voltage", voltage);
		if(current != null)
			map.put("current", current);
		if(power != null)
			map.put("power", power);
		if(temperature != null)
			map.put("temperature", temperature);
		if(humidity != null)
			map.put("humidity", humidity);
		if(mode != null)
			map.put("mode", mode);
		if(level != null)
			map.put("level", level);
		if(level_float != null)
			map.put("level_float", level_float);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(state != null)
			map.put("state", state);
		if(flow_state != null)
			map.put("flow_state", flow_state);
		if(load_state != null)
			map.put("load_state", load_state);
		if(vibration_state != null)
			map.put("vibration_state", vibration_state);
		if(prefilege_detected != null)
			map.put("prefilege_detected", prefilege_detected);
		if(last_prefilege_detected_time != null)
			map.put("last_prefilege_detected_time", last_prefilege_detected_time);
		if(move_state != null)
			map.put("move_state", move_state);
		if(last_moved_in_time != null)
			map.put("last_moved_in_time", last_moved_in_time);
		if(last_moved_out_time != null)
			map.put("last_moved_out_time", last_moved_out_time);
		if(last_disconnect_time != null)
			map.put("last_disconnect_time", last_disconnect_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(activated != null)
			map.put("activated", activated);
		if(overload_dg != null)
			map.put("overload_dg", overload_dg);
		if(overload_grid != null)
			map.put("overload_grid", overload_grid);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(unhealthy_batteries != null)
			map.put("unhealthy_batteries", unhealthy_batteries);
		if(bb_u_a != null)
			map.put("bb_u_a", bb_u_a);
		if(bb_n_u_a != null)
			map.put("bb_n_u_a", bb_n_u_a);
		if(bb_critical != null)
			map.put("bb_critical", bb_critical);
		if(bb_mains_fail != null)
			map.put("bb_mains_fail", bb_mains_fail);
		if(bb_rfa != null)
			map.put("bb_rfa", bb_rfa);
		if(bb_fuse_fail != null)
			map.put("bb_fuse_fail", bb_fuse_fail);
		if(lube_low_pressure != null)
			map.put("lube_low_pressure", lube_low_pressure);
		if(high_dg_water_temperature != null)
			map.put("high_dg_water_temperature", high_dg_water_temperature);
		if(canopy_temperature != null)
			map.put("canopy_temperature", canopy_temperature);
		if(lastProcessedState != null)
			map.put("lastProcessedState", lastProcessedState);
		if(lastProcessedTime != null)
			map.put("lastProcessedTime", lastProcessedTime);
		if(charging_state != null)
			map.put("charging_state", charging_state);
		if(last_processed_fuel_quantity != null)
			map.put("last_processed_fuel_quantity", last_processed_fuel_quantity);
		if(last_processed_db_reading != null)
			map.put("last_processed_db_reading", last_processed_db_reading);
		if(last_processed_grid_reading != null)
			map.put("last_processed_grid_reading", last_processed_grid_reading);
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
		if(make != null)
			map.put("make", make);
		if(power_rating != null)
			map.put("power_rating", power_rating);
		if(type != null)
			map.put("type", type);
		if(applaince_type_id != null)
			map.put("applaince_type_id", applaince_type_id);
		if(consumer_id != null)
			map.put("consumer_id", consumer_id);
		if(manager != null)
			map.put("manager", manager);
		if(model != null)
			map.put("model", model);
		if(location_id != null)
			map.put("location_id", location_id);
		if(sub_location_id != null)
			map.put("sub_location_id", sub_location_id);
		if(site_id != null)
			map.put("site_id", site_id);
		if(tank_id != null)
			map.put("tank_id", tank_id);
		if(dg_unit_opening != null)
			map.put("dg_unit_opening", dg_unit_opening);
		if(dg_unit_consumed != null)
			map.put("dg_unit_consumed", dg_unit_consumed);
		if(dg_unit_closing != null)
			map.put("dg_unit_closing", dg_unit_closing);
		if(grid_unit_opening != null)
			map.put("grid_unit_opening", grid_unit_opening);
		if(grid_unit_consumed != null)
			map.put("grid_unit_consumed", grid_unit_consumed);
		if(grid_unit_closing != null)
			map.put("grid_unit_closing", grid_unit_closing);
		if(serial_no != null)
			map.put("serial_no", serial_no);
		if(rf_tag_id != null)
			map.put("rf_tag_id", rf_tag_id);
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
		if(consumption_per_hour != null)
			map.put("consumption_per_hour", consumption_per_hour);
		if(threshold_temperature_min_level != null)
			map.put("threshold_temperature_min_level", threshold_temperature_min_level);
		if(threshold_temperature_max_level != null)
			map.put("threshold_temperature_max_level", threshold_temperature_max_level);
		if(threshold_voltage_min_level != null)
			map.put("threshold_voltage_min_level", threshold_voltage_min_level);
		if(threshold_voltage_max_level != null)
			map.put("threshold_voltage_max_level", threshold_voltage_max_level);
		if(threshold_current_min_level != null)
			map.put("threshold_current_min_level", threshold_current_min_level);
		if(threshold_current_max_level != null)
			map.put("threshold_current_max_level", threshold_current_max_level);
		if(threshold_duration != null)
			map.put("threshold_duration", threshold_duration);
		if(asset_id != null)
			map.put("asset_id", asset_id);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(ex_type != null)
			map.put("ex_type", ex_type);
		if(interface_type != null)
			map.put("interface_type", interface_type);
		if(battery_number != null)
			map.put("battery_number", battery_number);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(deploy_type != null)
			map.put("deploy_type", deploy_type);
		if(connected != null)
			map.put("connected", connected);
		if(config != null)
			map.put("config", config);
		if(battery_status != null)
			map.put("battery_status", battery_status);
		if(battery_level != null)
			map.put("battery_level", battery_level);
		if(last_reading != null)
			map.put("last_reading", last_reading);
		if(validateLast_reading_updated(add))
			map.put("last_reading_updated", last_reading_updated);
		if(dg_reading != null)
			map.put("dg_reading", dg_reading);
		if(grid_reading != null)
			map.put("grid_reading", grid_reading);
		if(voltage != null)
			map.put("voltage", voltage);
		if(current != null)
			map.put("current", current);
		if(power != null)
			map.put("power", power);
		if(temperature != null)
			map.put("temperature", temperature);
		if(humidity != null)
			map.put("humidity", humidity);
		if(mode != null)
			map.put("mode", mode);
		if(level != null)
			map.put("level", level);
		if(level_float != null)
			map.put("level_float", level_float);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(state != null)
			map.put("state", state);
		if(flow_state != null)
			map.put("flow_state", flow_state);
		if(load_state != null)
			map.put("load_state", load_state);
		if(vibration_state != null)
			map.put("vibration_state", vibration_state);
		if(prefilege_detected != null)
			map.put("prefilege_detected", prefilege_detected);
		if(last_prefilege_detected_time != null)
			map.put("last_prefilege_detected_time", last_prefilege_detected_time);
		if(move_state != null)
			map.put("move_state", move_state);
		if(last_moved_in_time != null)
			map.put("last_moved_in_time", last_moved_in_time);
		if(last_moved_out_time != null)
			map.put("last_moved_out_time", last_moved_out_time);
		if(last_disconnect_time != null)
			map.put("last_disconnect_time", last_disconnect_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(activated != null)
			map.put("activated", activated);
		if(overload_dg != null)
			map.put("overload_dg", overload_dg);
		if(overload_grid != null)
			map.put("overload_grid", overload_grid);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(unhealthy_batteries != null)
			map.put("unhealthy_batteries", unhealthy_batteries);
		if(bb_u_a != null)
			map.put("bb_u_a", bb_u_a);
		if(bb_n_u_a != null)
			map.put("bb_n_u_a", bb_n_u_a);
		if(bb_critical != null)
			map.put("bb_critical", bb_critical);
		if(bb_mains_fail != null)
			map.put("bb_mains_fail", bb_mains_fail);
		if(bb_rfa != null)
			map.put("bb_rfa", bb_rfa);
		if(bb_fuse_fail != null)
			map.put("bb_fuse_fail", bb_fuse_fail);
		if(lube_low_pressure != null)
			map.put("lube_low_pressure", lube_low_pressure);
		if(high_dg_water_temperature != null)
			map.put("high_dg_water_temperature", high_dg_water_temperature);
		if(canopy_temperature != null)
			map.put("canopy_temperature", canopy_temperature);
		if(lastProcessedState != null)
			map.put("lastProcessedState", lastProcessedState);
		if(lastProcessedTime != null)
			map.put("lastProcessedTime", lastProcessedTime);
		if(charging_state != null)
			map.put("charging_state", charging_state);
		if(last_processed_fuel_quantity != null)
			map.put("last_processed_fuel_quantity", last_processed_fuel_quantity);
		if(last_processed_db_reading != null)
			map.put("last_processed_db_reading", last_processed_db_reading);
		if(last_processed_grid_reading != null)
			map.put("last_processed_grid_reading", last_processed_grid_reading);
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
		make = (String) map.get("make");
		power_rating = (Number) map.get("power_rating");
		type = (String) map.get("type");
		applaince_type_id = (String) map.get("applaince_type_id");
		consumer_id = (String) map.get("consumer_id");
		manager = (String) map.get("manager");
		model = (String) map.get("model");
		location_id = (String) map.get("location_id");
		sub_location_id = (String) map.get("sub_location_id");
		site_id = (String) map.get("site_id");
		tank_id = (String) map.get("tank_id");
		dg_unit_opening = (Number) map.get("dg_unit_opening");
		dg_unit_consumed = (Number) map.get("dg_unit_consumed");
		dg_unit_closing = (Number) map.get("dg_unit_closing");
		grid_unit_opening = (Number) map.get("grid_unit_opening");
		grid_unit_consumed = (Number) map.get("grid_unit_consumed");
		grid_unit_closing = (Number) map.get("grid_unit_closing");
		serial_no = (String) map.get("serial_no");
		rf_tag_id = (String) map.get("rf_tag_id");
		manufecturing_date = (String) map.get("manufecturing_date");
		next_servicing_date = (String) map.get("next_servicing_date");
		threshold_fuel_level = (Number) map.get("threshold_fuel_level");
		capacity = (Number) map.get("capacity");
		maintainace_run_hour = (Integer) map.get("maintainace_run_hour");
		consumption_per_hour = (Number) map.get("consumption_per_hour");
		threshold_temperature_min_level = (Number) map.get("threshold_temperature_min_level");
		threshold_temperature_max_level = (Number) map.get("threshold_temperature_max_level");
		threshold_voltage_min_level = (Number) map.get("threshold_voltage_min_level");
		threshold_voltage_max_level = (Number) map.get("threshold_voltage_max_level");
		threshold_current_min_level = (Number) map.get("threshold_current_min_level");
		threshold_current_max_level = (Number) map.get("threshold_current_max_level");
		threshold_duration = (Number) map.get("threshold_duration");
		asset_id = (String) map.get("asset_id");
		partner_id = (String) map.get("partner_id");
		tenent_id = (String) map.get("tenent_id");
		customer_id = (String) map.get("customer_id");
		ex_type = (String) map.get("ex_type");
		interface_type = (String) map.get("interface_type");
		battery_number = (Integer) map.get("battery_number");
		number_of_batteries = (Integer) map.get("number_of_batteries");
		deploy_type = (String) map.get("deploy_type");
		connected = (String) map.get("connected");
		config = (String) map.get("config");
		battery_status = (String) map.get("battery_status");
		battery_level = (Integer) map.get("battery_level");
		last_reading = (Number) map.get("last_reading");
		last_reading_updated = (Long) map.get("last_reading_updated");
		dg_reading = (Number) map.get("dg_reading");
		grid_reading = (Number) map.get("grid_reading");
		voltage = (Integer) map.get("voltage");
		current = (Integer) map.get("current");
		power = (Number) map.get("power");
		temperature = (Number) map.get("temperature");
		humidity = (Number) map.get("humidity");
		mode = (String) map.get("mode");
		level = (Integer) map.get("level");
		level_float = (Number) map.get("level_float");
		fuel_level = (Number) map.get("fuel_level");
		fuel_quantity = (Number) map.get("fuel_quantity");
		state = (String) map.get("state");
		flow_state = (String) map.get("flow_state");
		load_state = (String) map.get("load_state");
		vibration_state = (String) map.get("vibration_state");
		prefilege_detected = (String) map.get("prefilege_detected");
		last_prefilege_detected_time = (Long) map.get("last_prefilege_detected_time");
		move_state = (String) map.get("move_state");
		last_moved_in_time = (Long) map.get("last_moved_in_time");
		last_moved_out_time = (Long) map.get("last_moved_out_time");
		last_disconnect_time = (Long) map.get("last_disconnect_time");
		last_update_time = (Long) map.get("last_update_time");
		activated = (String) map.get("activated");
		overload_dg = (String) map.get("overload_dg");
		overload_grid = (String) map.get("overload_grid");
		dg_on = (String) map.get("dg_on");
		appliance_id = (String) map.get("appliance_id");
		unhealthy_batteries = (Integer) map.get("unhealthy_batteries");
		bb_u_a = (String) map.get("bb_u_a");
		bb_n_u_a = (String) map.get("bb_n_u_a");
		bb_critical = (String) map.get("bb_critical");
		bb_mains_fail = (String) map.get("bb_mains_fail");
		bb_rfa = (String) map.get("bb_rfa");
		bb_fuse_fail = (String) map.get("bb_fuse_fail");
		lube_low_pressure = (String) map.get("lube_low_pressure");
		high_dg_water_temperature = (String) map.get("high_dg_water_temperature");
		canopy_temperature = (Number) map.get("canopy_temperature");
		lastProcessedState = (String) map.get("lastProcessedState");
		lastProcessedTime = (Long) map.get("lastProcessedTime");
		charging_state = (String) map.get("charging_state");
		last_processed_fuel_quantity = (Number) map.get("last_processed_fuel_quantity");
		last_processed_db_reading = (Number) map.get("last_processed_db_reading");
		last_processed_grid_reading = (Number) map.get("last_processed_grid_reading");
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

		Object makeObj = map.get("make");
		if(makeObj != null)
			make = makeObj.toString();

		Object power_ratingObj = map.get("power_rating");
		if(power_ratingObj != null)
			power_rating = new Double(power_ratingObj.toString());

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object applaince_type_idObj = map.get("applaince_type_id");
		if(applaince_type_idObj != null)
			applaince_type_id = applaince_type_idObj.toString();

		Object consumer_idObj = map.get("consumer_id");
		if(consumer_idObj != null)
			consumer_id = consumer_idObj.toString();

		Object managerObj = map.get("manager");
		if(managerObj != null)
			manager = managerObj.toString();

		Object modelObj = map.get("model");
		if(modelObj != null)
			model = modelObj.toString();

		Object location_idObj = map.get("location_id");
		if(location_idObj != null)
			location_id = location_idObj.toString();

		Object sub_location_idObj = map.get("sub_location_id");
		if(sub_location_idObj != null)
			sub_location_id = sub_location_idObj.toString();

		Object site_idObj = map.get("site_id");
		if(site_idObj != null)
			site_id = site_idObj.toString();

		Object tank_idObj = map.get("tank_id");
		if(tank_idObj != null)
			tank_id = tank_idObj.toString();

		Object dg_unit_openingObj = map.get("dg_unit_opening");
		if(dg_unit_openingObj != null)
			dg_unit_opening = new Double(dg_unit_openingObj.toString());

		Object dg_unit_consumedObj = map.get("dg_unit_consumed");
		if(dg_unit_consumedObj != null)
			dg_unit_consumed = new Double(dg_unit_consumedObj.toString());

		Object dg_unit_closingObj = map.get("dg_unit_closing");
		if(dg_unit_closingObj != null)
			dg_unit_closing = new Double(dg_unit_closingObj.toString());

		Object grid_unit_openingObj = map.get("grid_unit_opening");
		if(grid_unit_openingObj != null)
			grid_unit_opening = new Double(grid_unit_openingObj.toString());

		Object grid_unit_consumedObj = map.get("grid_unit_consumed");
		if(grid_unit_consumedObj != null)
			grid_unit_consumed = new Double(grid_unit_consumedObj.toString());

		Object grid_unit_closingObj = map.get("grid_unit_closing");
		if(grid_unit_closingObj != null)
			grid_unit_closing = new Double(grid_unit_closingObj.toString());

		Object serial_noObj = map.get("serial_no");
		if(serial_noObj != null)
			serial_no = serial_noObj.toString();

		Object rf_tag_idObj = map.get("rf_tag_id");
		if(rf_tag_idObj != null)
			rf_tag_id = rf_tag_idObj.toString();

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

		Object consumption_per_hourObj = map.get("consumption_per_hour");
		if(consumption_per_hourObj != null)
			consumption_per_hour = new Double(consumption_per_hourObj.toString());

		Object threshold_temperature_min_levelObj = map.get("threshold_temperature_min_level");
		if(threshold_temperature_min_levelObj != null)
			threshold_temperature_min_level = new Double(threshold_temperature_min_levelObj.toString());

		Object threshold_temperature_max_levelObj = map.get("threshold_temperature_max_level");
		if(threshold_temperature_max_levelObj != null)
			threshold_temperature_max_level = new Double(threshold_temperature_max_levelObj.toString());

		Object threshold_voltage_min_levelObj = map.get("threshold_voltage_min_level");
		if(threshold_voltage_min_levelObj != null)
			threshold_voltage_min_level = new Double(threshold_voltage_min_levelObj.toString());

		Object threshold_voltage_max_levelObj = map.get("threshold_voltage_max_level");
		if(threshold_voltage_max_levelObj != null)
			threshold_voltage_max_level = new Double(threshold_voltage_max_levelObj.toString());

		Object threshold_current_min_levelObj = map.get("threshold_current_min_level");
		if(threshold_current_min_levelObj != null)
			threshold_current_min_level = new Double(threshold_current_min_levelObj.toString());

		Object threshold_current_max_levelObj = map.get("threshold_current_max_level");
		if(threshold_current_max_levelObj != null)
			threshold_current_max_level = new Double(threshold_current_max_levelObj.toString());

		Object threshold_durationObj = map.get("threshold_duration");
		if(threshold_durationObj != null)
			threshold_duration = new Double(threshold_durationObj.toString());

		Object asset_idObj = map.get("asset_id");
		if(asset_idObj != null)
			asset_id = asset_idObj.toString();

		Object partner_idObj = map.get("partner_id");
		if(partner_idObj != null)
			partner_id = partner_idObj.toString();

		Object tenent_idObj = map.get("tenent_id");
		if(tenent_idObj != null)
			tenent_id = tenent_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object ex_typeObj = map.get("ex_type");
		if(ex_typeObj != null)
			ex_type = ex_typeObj.toString();

		Object interface_typeObj = map.get("interface_type");
		if(interface_typeObj != null)
			interface_type = interface_typeObj.toString();

		Object battery_numberObj = map.get("battery_number");
		if(battery_numberObj != null)
			battery_number = new Integer(battery_numberObj.toString());

		Object number_of_batteriesObj = map.get("number_of_batteries");
		if(number_of_batteriesObj != null)
			number_of_batteries = new Integer(number_of_batteriesObj.toString());

		Object deploy_typeObj = map.get("deploy_type");
		if(deploy_typeObj != null)
			deploy_type = deploy_typeObj.toString();

		Object connectedObj = map.get("connected");
		if(connectedObj != null)
			connected = connectedObj.toString();

		Object configObj = map.get("config");
		if(configObj != null)
			config = configObj.toString();

		Object battery_statusObj = map.get("battery_status");
		if(battery_statusObj != null)
			battery_status = battery_statusObj.toString();

		Object battery_levelObj = map.get("battery_level");
		if(battery_levelObj != null)
			battery_level = new Integer(battery_levelObj.toString());

		Object last_readingObj = map.get("last_reading");
		if(last_readingObj != null)
			last_reading = new Double(last_readingObj.toString());

		Object last_reading_updatedObj = map.get("last_reading_updated");
		if(last_reading_updatedObj != null)
			last_reading_updated = (Long) last_reading_updatedObj;

		Object dg_readingObj = map.get("dg_reading");
		if(dg_readingObj != null)
			dg_reading = new Double(dg_readingObj.toString());

		Object grid_readingObj = map.get("grid_reading");
		if(grid_readingObj != null)
			grid_reading = new Double(grid_readingObj.toString());

		Object voltageObj = map.get("voltage");
		if(voltageObj != null)
			voltage = new Integer(voltageObj.toString());

		Object currentObj = map.get("current");
		if(currentObj != null)
			current = new Integer(currentObj.toString());

		Object powerObj = map.get("power");
		if(powerObj != null)
			power = new Double(powerObj.toString());

		Object temperatureObj = map.get("temperature");
		if(temperatureObj != null)
			temperature = new Double(temperatureObj.toString());

		Object humidityObj = map.get("humidity");
		if(humidityObj != null)
			humidity = new Double(humidityObj.toString());

		Object modeObj = map.get("mode");
		if(modeObj != null)
			mode = modeObj.toString();

		Object levelObj = map.get("level");
		if(levelObj != null)
			level = new Integer(levelObj.toString());

		Object level_floatObj = map.get("level_float");
		if(level_floatObj != null)
			level_float = new Double(level_floatObj.toString());

		Object fuel_levelObj = map.get("fuel_level");
		if(fuel_levelObj != null)
			fuel_level = new Double(fuel_levelObj.toString());

		Object fuel_quantityObj = map.get("fuel_quantity");
		if(fuel_quantityObj != null)
			fuel_quantity = new Double(fuel_quantityObj.toString());

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object flow_stateObj = map.get("flow_state");
		if(flow_stateObj != null)
			flow_state = flow_stateObj.toString();

		Object load_stateObj = map.get("load_state");
		if(load_stateObj != null)
			load_state = load_stateObj.toString();

		Object vibration_stateObj = map.get("vibration_state");
		if(vibration_stateObj != null)
			vibration_state = vibration_stateObj.toString();

		Object prefilege_detectedObj = map.get("prefilege_detected");
		if(prefilege_detectedObj != null)
			prefilege_detected = prefilege_detectedObj.toString();

		Object last_prefilege_detected_timeObj = map.get("last_prefilege_detected_time");
		if(last_prefilege_detected_timeObj != null)
			last_prefilege_detected_time = (Long) last_prefilege_detected_timeObj;

		Object move_stateObj = map.get("move_state");
		if(move_stateObj != null)
			move_state = move_stateObj.toString();

		Object last_moved_in_timeObj = map.get("last_moved_in_time");
		if(last_moved_in_timeObj != null)
			last_moved_in_time = (Long) last_moved_in_timeObj;

		Object last_moved_out_timeObj = map.get("last_moved_out_time");
		if(last_moved_out_timeObj != null)
			last_moved_out_time = (Long) last_moved_out_timeObj;

		Object last_disconnect_timeObj = map.get("last_disconnect_time");
		if(last_disconnect_timeObj != null)
			last_disconnect_time = (Long) last_disconnect_timeObj;

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = (Long) last_update_timeObj;

		Object activatedObj = map.get("activated");
		if(activatedObj != null)
			activated = activatedObj.toString();

		Object overload_dgObj = map.get("overload_dg");
		if(overload_dgObj != null)
			overload_dg = overload_dgObj.toString();

		Object overload_gridObj = map.get("overload_grid");
		if(overload_gridObj != null)
			overload_grid = overload_gridObj.toString();

		Object dg_onObj = map.get("dg_on");
		if(dg_onObj != null)
			dg_on = dg_onObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object unhealthy_batteriesObj = map.get("unhealthy_batteries");
		if(unhealthy_batteriesObj != null)
			unhealthy_batteries = new Integer(unhealthy_batteriesObj.toString());

		Object bb_u_aObj = map.get("bb_u_a");
		if(bb_u_aObj != null)
			bb_u_a = bb_u_aObj.toString();

		Object bb_n_u_aObj = map.get("bb_n_u_a");
		if(bb_n_u_aObj != null)
			bb_n_u_a = bb_n_u_aObj.toString();

		Object bb_criticalObj = map.get("bb_critical");
		if(bb_criticalObj != null)
			bb_critical = bb_criticalObj.toString();

		Object bb_mains_failObj = map.get("bb_mains_fail");
		if(bb_mains_failObj != null)
			bb_mains_fail = bb_mains_failObj.toString();

		Object bb_rfaObj = map.get("bb_rfa");
		if(bb_rfaObj != null)
			bb_rfa = bb_rfaObj.toString();

		Object bb_fuse_failObj = map.get("bb_fuse_fail");
		if(bb_fuse_failObj != null)
			bb_fuse_fail = bb_fuse_failObj.toString();

		Object lube_low_pressureObj = map.get("lube_low_pressure");
		if(lube_low_pressureObj != null)
			lube_low_pressure = lube_low_pressureObj.toString();

		Object high_dg_water_temperatureObj = map.get("high_dg_water_temperature");
		if(high_dg_water_temperatureObj != null)
			high_dg_water_temperature = high_dg_water_temperatureObj.toString();

		Object canopy_temperatureObj = map.get("canopy_temperature");
		if(canopy_temperatureObj != null)
			canopy_temperature = new Double(canopy_temperatureObj.toString());

		Object lastProcessedStateObj = map.get("lastProcessedState");
		if(lastProcessedStateObj != null)
			lastProcessedState = lastProcessedStateObj.toString();

		Object lastProcessedTimeObj = map.get("lastProcessedTime");
		if(lastProcessedTimeObj != null)
			lastProcessedTime = (Long) lastProcessedTimeObj;

		Object charging_stateObj = map.get("charging_state");
		if(charging_stateObj != null)
			charging_state = charging_stateObj.toString();

		Object last_processed_fuel_quantityObj = map.get("last_processed_fuel_quantity");
		if(last_processed_fuel_quantityObj != null)
			last_processed_fuel_quantity = new Double(last_processed_fuel_quantityObj.toString());

		Object last_processed_db_readingObj = map.get("last_processed_db_reading");
		if(last_processed_db_readingObj != null)
			last_processed_db_reading = new Double(last_processed_db_readingObj.toString());

		Object last_processed_grid_readingObj = map.get("last_processed_grid_reading");
		if(last_processed_grid_readingObj != null)
			last_processed_grid_reading = new Double(last_processed_grid_readingObj.toString());

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

	public String getMake() {
		return make;
	}

	public String getMakeEx() {
		return make != null ? make : "";
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void unSetMake() {
		this.make = null;
	}

	public Number getPower_rating() {
		return power_rating != null ? power_rating : 0.0000;
	}

	public void setPower_rating(Number power_rating) {
		this.power_rating = power_rating;
	}

	public void unSetPower_rating() {
		this.power_rating = 0.0000;
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

	public String getApplaince_type_id() {
		return applaince_type_id;
	}

	public String getApplaince_type_idEx() {
		return applaince_type_id != null ? applaince_type_id : "";
	}

	public void setApplaince_type_id(String applaince_type_id) {
		this.applaince_type_id = applaince_type_id;
	}

	public void unSetApplaince_type_id() {
		this.applaince_type_id = null;
	}

	public String getConsumer_id() {
		return consumer_id;
	}

	public String getConsumer_idEx() {
		return consumer_id != null ? consumer_id : "";
	}

	public void setConsumer_id(String consumer_id) {
		this.consumer_id = consumer_id;
	}

	public void unSetConsumer_id() {
		this.consumer_id = null;
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

	public String getLocation_id() {
		return location_id;
	}

	public String getLocation_idEx() {
		return location_id != null ? location_id : "";
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public void unSetLocation_id() {
		this.location_id = null;
	}

	public String getSub_location_id() {
		return sub_location_id;
	}

	public String getSub_location_idEx() {
		return sub_location_id != null ? sub_location_id : "";
	}

	public void setSub_location_id(String sub_location_id) {
		this.sub_location_id = sub_location_id;
	}

	public void unSetSub_location_id() {
		this.sub_location_id = null;
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

	public String getTank_id() {
		return tank_id;
	}

	public String getTank_idEx() {
		return tank_id != null ? tank_id : "";
	}

	public void setTank_id(String tank_id) {
		this.tank_id = tank_id;
	}

	public void unSetTank_id() {
		this.tank_id = null;
	}

	public Number getDg_unit_opening() {
		return dg_unit_opening != null ? dg_unit_opening : 0.0000;
	}

	public void setDg_unit_opening(Number dg_unit_opening) {
		this.dg_unit_opening = dg_unit_opening;
	}

	public void unSetDg_unit_opening() {
		this.dg_unit_opening = 0.0000;
	}

	public Number getDg_unit_consumed() {
		return dg_unit_consumed != null ? dg_unit_consumed : 0.0000;
	}

	public void setDg_unit_consumed(Number dg_unit_consumed) {
		this.dg_unit_consumed = dg_unit_consumed;
	}

	public void unSetDg_unit_consumed() {
		this.dg_unit_consumed = 0.0000;
	}

	public Number getDg_unit_closing() {
		return dg_unit_closing != null ? dg_unit_closing : 0.0000;
	}

	public void setDg_unit_closing(Number dg_unit_closing) {
		this.dg_unit_closing = dg_unit_closing;
	}

	public void unSetDg_unit_closing() {
		this.dg_unit_closing = 0.0000;
	}

	public Number getGrid_unit_opening() {
		return grid_unit_opening != null ? grid_unit_opening : 0.0000;
	}

	public void setGrid_unit_opening(Number grid_unit_opening) {
		this.grid_unit_opening = grid_unit_opening;
	}

	public void unSetGrid_unit_opening() {
		this.grid_unit_opening = 0.0000;
	}

	public Number getGrid_unit_consumed() {
		return grid_unit_consumed != null ? grid_unit_consumed : 0.0000;
	}

	public void setGrid_unit_consumed(Number grid_unit_consumed) {
		this.grid_unit_consumed = grid_unit_consumed;
	}

	public void unSetGrid_unit_consumed() {
		this.grid_unit_consumed = 0.0000;
	}

	public Number getGrid_unit_closing() {
		return grid_unit_closing != null ? grid_unit_closing : 0.0000;
	}

	public void setGrid_unit_closing(Number grid_unit_closing) {
		this.grid_unit_closing = grid_unit_closing;
	}

	public void unSetGrid_unit_closing() {
		this.grid_unit_closing = 0.0000;
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

	public String getRf_tag_id() {
		return rf_tag_id;
	}

	public String getRf_tag_idEx() {
		return rf_tag_id != null ? rf_tag_id : "";
	}

	public void setRf_tag_id(String rf_tag_id) {
		this.rf_tag_id = rf_tag_id;
	}

	public void unSetRf_tag_id() {
		this.rf_tag_id = null;
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

	public Number getConsumption_per_hour() {
		return consumption_per_hour;
	}

	public void setConsumption_per_hour(Number consumption_per_hour) {
		this.consumption_per_hour = consumption_per_hour;
	}

	public void unSetConsumption_per_hour() {
		this.consumption_per_hour = null;
	}

	public Number getThreshold_temperature_min_level() {
		return threshold_temperature_min_level;
	}

	public void setThreshold_temperature_min_level(Number threshold_temperature_min_level) {
		this.threshold_temperature_min_level = threshold_temperature_min_level;
	}

	public void unSetThreshold_temperature_min_level() {
		this.threshold_temperature_min_level = null;
	}

	public Number getThreshold_temperature_max_level() {
		return threshold_temperature_max_level;
	}

	public void setThreshold_temperature_max_level(Number threshold_temperature_max_level) {
		this.threshold_temperature_max_level = threshold_temperature_max_level;
	}

	public void unSetThreshold_temperature_max_level() {
		this.threshold_temperature_max_level = null;
	}

	public Number getThreshold_voltage_min_level() {
		return threshold_voltage_min_level;
	}

	public void setThreshold_voltage_min_level(Number threshold_voltage_min_level) {
		this.threshold_voltage_min_level = threshold_voltage_min_level;
	}

	public void unSetThreshold_voltage_min_level() {
		this.threshold_voltage_min_level = null;
	}

	public Number getThreshold_voltage_max_level() {
		return threshold_voltage_max_level;
	}

	public void setThreshold_voltage_max_level(Number threshold_voltage_max_level) {
		this.threshold_voltage_max_level = threshold_voltage_max_level;
	}

	public void unSetThreshold_voltage_max_level() {
		this.threshold_voltage_max_level = null;
	}

	public Number getThreshold_current_min_level() {
		return threshold_current_min_level;
	}

	public void setThreshold_current_min_level(Number threshold_current_min_level) {
		this.threshold_current_min_level = threshold_current_min_level;
	}

	public void unSetThreshold_current_min_level() {
		this.threshold_current_min_level = null;
	}

	public Number getThreshold_current_max_level() {
		return threshold_current_max_level;
	}

	public void setThreshold_current_max_level(Number threshold_current_max_level) {
		this.threshold_current_max_level = threshold_current_max_level;
	}

	public void unSetThreshold_current_max_level() {
		this.threshold_current_max_level = null;
	}

	public Number getThreshold_duration() {
		return threshold_duration;
	}

	public void setThreshold_duration(Number threshold_duration) {
		this.threshold_duration = threshold_duration;
	}

	public void unSetThreshold_duration() {
		this.threshold_duration = null;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public String getAsset_idEx() {
		return asset_id != null ? asset_id : "";
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public void unSetAsset_id() {
		this.asset_id = null;
	}

	public String getPartner_id() {
		return partner_id;
	}

	public String getPartner_idEx() {
		return partner_id != null ? partner_id : "";
	}

	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}

	public void unSetPartner_id() {
		this.partner_id = null;
	}

	public String getTenent_id() {
		return tenent_id;
	}

	public String getTenent_idEx() {
		return tenent_id != null ? tenent_id : "";
	}

	public void setTenent_id(String tenent_id) {
		this.tenent_id = tenent_id;
	}

	public void unSetTenent_id() {
		this.tenent_id = null;
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

	public String getEx_type() {
		return ex_type != null ? ex_type : "ENABLED";
	}

	public void setEx_type(String ex_type) {
		this.ex_type = ex_type;
	}

	public void unSetEx_type() {
		this.ex_type = "ENABLED";
	}

	public String getInterface_type() {
		return interface_type;
	}

	public String getInterface_typeEx() {
		return interface_type != null ? interface_type : "";
	}

	public void setInterface_type(String interface_type) {
		this.interface_type = interface_type;
	}

	public void unSetInterface_type() {
		this.interface_type = null;
	}

	public Integer getBattery_number() {
		return battery_number;
	}

	public int getBattery_numberEx() {
		return battery_number != null ? battery_number : 0;
	}

	public void setBattery_number(int battery_number) {
		this.battery_number = battery_number;
	}

	public void setBattery_number(Integer battery_number) {
		this.battery_number = battery_number;
	}

	public void unSetBattery_number() {
		this.battery_number = null;
	}

	public Integer getNumber_of_batteries() {
		return number_of_batteries;
	}

	public int getNumber_of_batteriesEx() {
		return number_of_batteries != null ? number_of_batteries : 0;
	}

	public void setNumber_of_batteries(int number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void setNumber_of_batteries(Integer number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void unSetNumber_of_batteries() {
		this.number_of_batteries = null;
	}

	public String getDeploy_type() {
		return deploy_type != null ? deploy_type : "LOCATION";
	}

	public void setDeploy_type(String deploy_type) {
		this.deploy_type = deploy_type;
	}

	public void unSetDeploy_type() {
		this.deploy_type = "LOCATION";
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

	public String getBattery_status() {
		return battery_status != null ? battery_status : "O";
	}

	public void setBattery_status(String battery_status) {
		this.battery_status = battery_status;
	}

	public void unSetBattery_status() {
		this.battery_status = "O";
	}

	public Integer getBattery_level() {
		return battery_level != null ? battery_level : 100;
	}

	public void setBattery_level(int battery_level) {
		this.battery_level = battery_level;
	}

	public void setBattery_level(Integer battery_level) {
		this.battery_level = battery_level;
	}

	public void unSetBattery_level() {
		this.battery_level = 100;
	}

	public Number getLast_reading() {
		return last_reading != null ? last_reading : 0.0000;
	}

	public void setLast_reading(Number last_reading) {
		this.last_reading = last_reading;
	}

	public void unSetLast_reading() {
		this.last_reading = 0.0000;
	}

	public Long getLast_reading_updated() {
		return last_reading_updated;
	}

	public void setLast_reading_updated(Long last_reading_updated) {
		this.last_reading_updated = last_reading_updated;
	}


	public boolean validateLast_reading_updated(boolean add) throws ApplicationException {
		if(add && last_reading_updated == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_reading_updated]");
		return last_reading_updated != null;
	}

	public Number getDg_reading() {
		return dg_reading != null ? dg_reading : 0.0000;
	}

	public void setDg_reading(Number dg_reading) {
		this.dg_reading = dg_reading;
	}

	public void unSetDg_reading() {
		this.dg_reading = 0.0000;
	}

	public Number getGrid_reading() {
		return grid_reading != null ? grid_reading : 0.0000;
	}

	public void setGrid_reading(Number grid_reading) {
		this.grid_reading = grid_reading;
	}

	public void unSetGrid_reading() {
		this.grid_reading = 0.0000;
	}

	public Integer getVoltage() {
		return voltage != null ? voltage : 0;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}

	public void unSetVoltage() {
		this.voltage = 0;
	}

	public Integer getCurrent() {
		return current != null ? current : 0;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public void unSetCurrent() {
		this.current = 0;
	}

	public Number getPower() {
		return power != null ? power : 0.0000;
	}

	public void setPower(Number power) {
		this.power = power;
	}

	public void unSetPower() {
		this.power = 0.0000;
	}

	public Number getTemperature() {
		return temperature != null ? temperature : 0.00;
	}

	public void setTemperature(Number temperature) {
		this.temperature = temperature;
	}

	public void unSetTemperature() {
		this.temperature = 0.00;
	}

	public Number getHumidity() {
		return humidity != null ? humidity : 0.00;
	}

	public void setHumidity(Number humidity) {
		this.humidity = humidity;
	}

	public void unSetHumidity() {
		this.humidity = 0.00;
	}

	public String getMode() {
		return mode != null ? mode : "D";
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void unSetMode() {
		this.mode = "D";
	}

	public Integer getLevel() {
		return level != null ? level : 0;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public void unSetLevel() {
		this.level = 0;
	}

	public Number getLevel_float() {
		return level_float != null ? level_float : 0.00;
	}

	public void setLevel_float(Number level_float) {
		this.level_float = level_float;
	}

	public void unSetLevel_float() {
		this.level_float = 0.00;
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

	public String getFlow_state() {
		return flow_state != null ? flow_state : "N";
	}

	public void setFlow_state(String flow_state) {
		this.flow_state = flow_state;
	}

	public void unSetFlow_state() {
		this.flow_state = "N";
	}

	public String getLoad_state() {
		return load_state != null ? load_state : "N";
	}

	public void setLoad_state(String load_state) {
		this.load_state = load_state;
	}

	public void unSetLoad_state() {
		this.load_state = "N";
	}

	public String getVibration_state() {
		return vibration_state != null ? vibration_state : "N";
	}

	public void setVibration_state(String vibration_state) {
		this.vibration_state = vibration_state;
	}

	public void unSetVibration_state() {
		this.vibration_state = "N";
	}

	public String getPrefilege_detected() {
		return prefilege_detected;
	}

	public String getPrefilege_detectedEx() {
		return prefilege_detected != null ? prefilege_detected : "";
	}

	public void setPrefilege_detected(String prefilege_detected) {
		this.prefilege_detected = prefilege_detected;
	}

	public void unSetPrefilege_detected() {
		this.prefilege_detected = null;
	}

	public Long getLast_prefilege_detected_time() {
		return last_prefilege_detected_time;
	}

	public void setLast_prefilege_detected_time(Long last_prefilege_detected_time) {
		this.last_prefilege_detected_time = last_prefilege_detected_time;
	}


	public String getMove_state() {
		return move_state;
	}

	public String getMove_stateEx() {
		return move_state != null ? move_state : "";
	}

	public void setMove_state(String move_state) {
		this.move_state = move_state;
	}

	public void unSetMove_state() {
		this.move_state = null;
	}

	public Long getLast_moved_in_time() {
		return last_moved_in_time;
	}

	public void setLast_moved_in_time(Long last_moved_in_time) {
		this.last_moved_in_time = last_moved_in_time;
	}


	public Long getLast_moved_out_time() {
		return last_moved_out_time;
	}

	public void setLast_moved_out_time(Long last_moved_out_time) {
		this.last_moved_out_time = last_moved_out_time;
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


	public String getActivated() {
		return activated != null ? activated : "N";
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public void unSetActivated() {
		this.activated = "N";
	}

	public String getOverload_dg() {
		return overload_dg != null ? overload_dg : "N";
	}

	public void setOverload_dg(String overload_dg) {
		this.overload_dg = overload_dg;
	}

	public void unSetOverload_dg() {
		this.overload_dg = "N";
	}

	public String getOverload_grid() {
		return overload_grid != null ? overload_grid : "N";
	}

	public void setOverload_grid(String overload_grid) {
		this.overload_grid = overload_grid;
	}

	public void unSetOverload_grid() {
		this.overload_grid = "N";
	}

	public String getDg_on() {
		return dg_on != null ? dg_on : "N";
	}

	public void setDg_on(String dg_on) {
		this.dg_on = dg_on;
	}

	public void unSetDg_on() {
		this.dg_on = "N";
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

	public Integer getUnhealthy_batteries() {
		return unhealthy_batteries != null ? unhealthy_batteries : 0;
	}

	public void setUnhealthy_batteries(int unhealthy_batteries) {
		this.unhealthy_batteries = unhealthy_batteries;
	}

	public void setUnhealthy_batteries(Integer unhealthy_batteries) {
		this.unhealthy_batteries = unhealthy_batteries;
	}

	public void unSetUnhealthy_batteries() {
		this.unhealthy_batteries = 0;
	}

	public String getBb_u_a() {
		return bb_u_a != null ? bb_u_a : "N";
	}

	public void setBb_u_a(String bb_u_a) {
		this.bb_u_a = bb_u_a;
	}

	public void unSetBb_u_a() {
		this.bb_u_a = "N";
	}

	public String getBb_n_u_a() {
		return bb_n_u_a != null ? bb_n_u_a : "N";
	}

	public void setBb_n_u_a(String bb_n_u_a) {
		this.bb_n_u_a = bb_n_u_a;
	}

	public void unSetBb_n_u_a() {
		this.bb_n_u_a = "N";
	}

	public String getBb_critical() {
		return bb_critical != null ? bb_critical : "N";
	}

	public void setBb_critical(String bb_critical) {
		this.bb_critical = bb_critical;
	}

	public void unSetBb_critical() {
		this.bb_critical = "N";
	}

	public String getBb_mains_fail() {
		return bb_mains_fail != null ? bb_mains_fail : "N";
	}

	public void setBb_mains_fail(String bb_mains_fail) {
		this.bb_mains_fail = bb_mains_fail;
	}

	public void unSetBb_mains_fail() {
		this.bb_mains_fail = "N";
	}

	public String getBb_rfa() {
		return bb_rfa != null ? bb_rfa : "N";
	}

	public void setBb_rfa(String bb_rfa) {
		this.bb_rfa = bb_rfa;
	}

	public void unSetBb_rfa() {
		this.bb_rfa = "N";
	}

	public String getBb_fuse_fail() {
		return bb_fuse_fail != null ? bb_fuse_fail : "N";
	}

	public void setBb_fuse_fail(String bb_fuse_fail) {
		this.bb_fuse_fail = bb_fuse_fail;
	}

	public void unSetBb_fuse_fail() {
		this.bb_fuse_fail = "N";
	}

	public String getLube_low_pressure() {
		return lube_low_pressure != null ? lube_low_pressure : "N";
	}

	public void setLube_low_pressure(String lube_low_pressure) {
		this.lube_low_pressure = lube_low_pressure;
	}

	public void unSetLube_low_pressure() {
		this.lube_low_pressure = "N";
	}

	public String getHigh_dg_water_temperature() {
		return high_dg_water_temperature != null ? high_dg_water_temperature : "N";
	}

	public void setHigh_dg_water_temperature(String high_dg_water_temperature) {
		this.high_dg_water_temperature = high_dg_water_temperature;
	}

	public void unSetHigh_dg_water_temperature() {
		this.high_dg_water_temperature = "N";
	}

	public Number getCanopy_temperature() {
		return canopy_temperature != null ? canopy_temperature : 0.00;
	}

	public void setCanopy_temperature(Number canopy_temperature) {
		this.canopy_temperature = canopy_temperature;
	}

	public void unSetCanopy_temperature() {
		this.canopy_temperature = 0.00;
	}

	public String getLastProcessedState() {
		return lastProcessedState != null ? lastProcessedState : "STOP";
	}

	public void setLastProcessedState(String lastProcessedState) {
		this.lastProcessedState = lastProcessedState;
	}

	public void unSetLastProcessedState() {
		this.lastProcessedState = "STOP";
	}

	public Long getLastProcessedTime() {
		return lastProcessedTime;
	}

	public void setLastProcessedTime(Long lastProcessedTime) {
		this.lastProcessedTime = lastProcessedTime;
	}


	public String getCharging_state() {
		return charging_state != null ? charging_state : "N";
	}

	public void setCharging_state(String charging_state) {
		this.charging_state = charging_state;
	}

	public void unSetCharging_state() {
		this.charging_state = "N";
	}

	public Number getLast_processed_fuel_quantity() {
		return last_processed_fuel_quantity != null ? last_processed_fuel_quantity : 0.00;
	}

	public void setLast_processed_fuel_quantity(Number last_processed_fuel_quantity) {
		this.last_processed_fuel_quantity = last_processed_fuel_quantity;
	}

	public void unSetLast_processed_fuel_quantity() {
		this.last_processed_fuel_quantity = 0.00;
	}

	public Number getLast_processed_db_reading() {
		return last_processed_db_reading != null ? last_processed_db_reading : 0.00;
	}

	public void setLast_processed_db_reading(Number last_processed_db_reading) {
		this.last_processed_db_reading = last_processed_db_reading;
	}

	public void unSetLast_processed_db_reading() {
		this.last_processed_db_reading = 0.00;
	}

	public Number getLast_processed_grid_reading() {
		return last_processed_grid_reading != null ? last_processed_grid_reading : 0.00;
	}

	public void setLast_processed_grid_reading(Number last_processed_grid_reading) {
		this.last_processed_grid_reading = last_processed_grid_reading;
	}

	public void unSetLast_processed_grid_reading() {
		this.last_processed_grid_reading = 0.00;
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