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
public abstract class Basesensor extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private String sub_type = null;
	private String consumer_id = null;
	private String manager = null;
	private String model = null;
	private String location_id = null;
	private String location_no = null;
	private String gateway_id = null;
	private String site_id = null;
	private Number start_grid_reading = null;
	private Number start_dg_reading = null;
	private Number initial_balance = null;
	private Number meter_ct_mf = null;
	private Long last_reading_updated = null;
	private Long start_reading_date = null;
	private java.util.Date initial_reading_date = null;
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
	private Number threshold_temperature_min_level = null;
	private Number threshold_temperature_max_level = null;
	private Number threshold_voltage_min_level = null;
	private Number threshold_voltage_max_level = null;
	private Number threshold_current_min_level = null;
	private Number threshold_current_max_level = null;
	private Number threshold_duration = null;
	private String asset_id = null;
	private String partner_id = null;
	private String customer_id = null;
	private String tenent_id = null;
	private String controller_id = null;
	private Integer controller_port = null;
	private Integer controller_physical_port = null;
	private String end_device = null;
	private String ex_type = null;
	private String interface_type = null;
	private Integer battery_number = null;
	private Integer number_of_batteries = null;
	private String appliance_id = null;
	private String deploy_type = null;
	private String dg_overload_enabled = null;
	private String grid_overload_enabled = null;
	private Integer dg_no = null;
	private Integer grid_overload_setting = null;
	private Integer dg_overload_setting = null;
	private Integer over_voltage = null;
	private Integer under_voltage = null;
	private Integer sampleing_time = null;
	private Integer reconnect_time = null;
	private Integer number_of_overload_events = null;
	private String connected = null;
	private String config = null;
	private String battery_status = null;
	private Integer battery_level = null;
	private Number last_reading = null;
	private Long last_reading_updated_dg = null;
	private Long last_reading_updated_grid = null;
	private Number dg_reading = null;
	private Number reading_validator_mf = null;
	private Number grid_reading = null;
	private Number dg_reading_dump = null;
	private Number grid_reading_dump = null;
	private Long last_power_cut_time = null;
	private Integer voltage = null;
	private Number voltage_float = null;
	private Integer current = null;
	private Integer power = null;
	private Number temperature = null;
	private Number humidity = null;
	private String mode = null;
	private Integer level = null;
	private Integer unhealthy_batteries = null;
	private Number level_float = null;
	private Number fuel_level = null;
	private String state = null;
	private String prefilege_detected = null;
	private Long last_prefilege_detected_time = null;
	private String move_state = null;
	private Long last_moved_in_time = null;
	private Long last_moved_out_time = null;
	private Long last_disconnect_time = null;
	private Long last_update_time = null;
	private String activated = null;
	private String overload_grid = null;
	private String overload_dg = null;
	private String dg_on = null;
	private String low_battery_state = null;
	private String deep_discharge_battery_state = null;
	private String charging_state = null;
	private String higher_reading_state = null;
	private String higher_dg_reading_state = null;
	private String higher_grid_reading_state = null;
	private String out_of_mf_reading_state = null;
	private String out_of_mf_dg_reading_state = null;
	private String out_of_mf_grid_reading_state = null;
	private String time_mismatch_state = null;
	private Long last_dg_reading_updated_dump = null;
	private Long last_grid_reading_updated_dump = null;
	private String zero_reading_state = null;
	private String zero_dg_reading_state = null;
	private String dg_grid_reading_limit_state = null;
	private Long started_zero_dg_reading = null;
	private String zero_grid_reading_state = null;
	private Long started_zero_grid_reading = null;
	private Long started_zero_reading = null;
	private String skip_limit_check = null;
	private String admin_status = null;
	private Number langitude = null;
	private Number latitude = null;
	private Integer speed = null;
	private Integer airFlow = null;
	private Number atmoshericPressure = null;
	private Integer engineLoad = null;
	private String gpsStatus = null;
	private Integer intakeAirTemperature = null;
	private Number oilPressure = null;
	private Integer rpm = null;
	private Integer trottlePosition = null;
	private Number batteryVoltage = null;
	private Number intakeTubeAbsolutePressure = null;
	private Integer numberOfDTC = null;
	private String engineState = null;
	private Long lastEngineStarted = null;
	private Long lastEngineStopped = null;
	private Integer heartbeat_interval = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_SUB_TYPE = "sub_type";
	public static String FIELD_CONSUMER_ID = "consumer_id";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_MODEL = "model";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_LOCATION_NO = "location_no";
	public static String FIELD_GATEWAY_ID = "gateway_id";
	public static String FIELD_SITE_ID = "site_id";
	public static String FIELD_START_GRID_READING = "start_grid_reading";
	public static String FIELD_START_DG_READING = "start_dg_reading";
	public static String FIELD_INITIAL_BALANCE = "initial_balance";
	public static String FIELD_METER_CT_MF = "meter_ct_mf";
	public static String FIELD_LAST_READING_UPDATED = "last_reading_updated";
	public static String FIELD_START_READING_DATE = "start_reading_date";
	public static String FIELD_INITIAL_READING_DATE = "initial_reading_date";
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
	public static String FIELD_THRESHOLD_TEMPERATURE_MIN_LEVEL = "threshold_temperature_min_level";
	public static String FIELD_THRESHOLD_TEMPERATURE_MAX_LEVEL = "threshold_temperature_max_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MIN_LEVEL = "threshold_voltage_min_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MAX_LEVEL = "threshold_voltage_max_level";
	public static String FIELD_THRESHOLD_CURRENT_MIN_LEVEL = "threshold_current_min_level";
	public static String FIELD_THRESHOLD_CURRENT_MAX_LEVEL = "threshold_current_max_level";
	public static String FIELD_THRESHOLD_DURATION = "threshold_duration";
	public static String FIELD_ASSET_ID = "asset_id";
	public static String FIELD_PARTNER_ID = "partner_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TENENT_ID = "tenent_id";
	public static String FIELD_CONTROLLER_ID = "controller_id";
	public static String FIELD_CONTROLLER_PORT = "controller_port";
	public static String FIELD_CONTROLLER_PHYSICAL_PORT = "controller_physical_port";
	public static String FIELD_END_DEVICE = "end_device";
	public static String FIELD_EX_TYPE = "ex_type";
	public static String FIELD_INTERFACE_TYPE = "interface_type";
	public static String FIELD_BATTERY_NUMBER = "battery_number";
	public static String FIELD_NUMBER_OF_BATTERIES = "number_of_batteries";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_DEPLOY_TYPE = "deploy_type";
	public static String FIELD_DG_OVERLOAD_ENABLED = "dg_overload_enabled";
	public static String FIELD_GRID_OVERLOAD_ENABLED = "grid_overload_enabled";
	public static String FIELD_DG_NO = "dg_no";
	public static String FIELD_GRID_OVERLOAD_SETTING = "grid_overload_setting";
	public static String FIELD_DG_OVERLOAD_SETTING = "dg_overload_setting";
	public static String FIELD_OVER_VOLTAGE = "over_voltage";
	public static String FIELD_UNDER_VOLTAGE = "under_voltage";
	public static String FIELD_SAMPLEING_TIME = "sampleing_time";
	public static String FIELD_RECONNECT_TIME = "reconnect_time";
	public static String FIELD_NUMBER_OF_OVERLOAD_EVENTS = "number_of_overload_events";
	public static String FIELD_CONNECTED = "connected";
	public static String FIELD_CONFIG = "config";
	public static String FIELD_BATTERY_STATUS = "battery_status";
	public static String FIELD_BATTERY_LEVEL = "battery_level";
	public static String FIELD_LAST_READING = "last_reading";
	public static String FIELD_LAST_READING_UPDATED_DG = "last_reading_updated_dg";
	public static String FIELD_LAST_READING_UPDATED_GRID = "last_reading_updated_grid";
	public static String FIELD_DG_READING = "dg_reading";
	public static String FIELD_READING_VALIDATOR_MF = "reading_validator_mf";
	public static String FIELD_GRID_READING = "grid_reading";
	public static String FIELD_DG_READING_DUMP = "dg_reading_dump";
	public static String FIELD_GRID_READING_DUMP = "grid_reading_dump";
	public static String FIELD_LAST_POWER_CUT_TIME = "last_power_cut_time";
	public static String FIELD_VOLTAGE = "voltage";
	public static String FIELD_VOLTAGE_FLOAT = "voltage_float";
	public static String FIELD_CURRENT = "current";
	public static String FIELD_POWER = "power";
	public static String FIELD_TEMPERATURE = "temperature";
	public static String FIELD_HUMIDITY = "humidity";
	public static String FIELD_MODE = "mode";
	public static String FIELD_LEVEL = "level";
	public static String FIELD_UNHEALTHY_BATTERIES = "unhealthy_batteries";
	public static String FIELD_LEVEL_FLOAT = "level_float";
	public static String FIELD_FUEL_LEVEL = "fuel_level";
	public static String FIELD_STATE = "state";
	public static String FIELD_PREFILEGE_DETECTED = "prefilege_detected";
	public static String FIELD_LAST_PREFILEGE_DETECTED_TIME = "last_prefilege_detected_time";
	public static String FIELD_MOVE_STATE = "move_state";
	public static String FIELD_LAST_MOVED_IN_TIME = "last_moved_in_time";
	public static String FIELD_LAST_MOVED_OUT_TIME = "last_moved_out_time";
	public static String FIELD_LAST_DISCONNECT_TIME = "last_disconnect_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_ACTIVATED = "activated";
	public static String FIELD_OVERLOAD_GRID = "overload_grid";
	public static String FIELD_OVERLOAD_DG = "overload_dg";
	public static String FIELD_DG_ON = "dg_on";
	public static String FIELD_LOW_BATTERY_STATE = "low_battery_state";
	public static String FIELD_DEEP_DISCHARGE_BATTERY_STATE = "deep_discharge_battery_state";
	public static String FIELD_CHARGING_STATE = "charging_state";
	public static String FIELD_HIGHER_READING_STATE = "higher_reading_state";
	public static String FIELD_HIGHER_DG_READING_STATE = "higher_dg_reading_state";
	public static String FIELD_HIGHER_GRID_READING_STATE = "higher_grid_reading_state";
	public static String FIELD_OUT_OF_MF_READING_STATE = "out_of_mf_reading_state";
	public static String FIELD_OUT_OF_MF_DG_READING_STATE = "out_of_mf_dg_reading_state";
	public static String FIELD_OUT_OF_MF_GRID_READING_STATE = "out_of_mf_grid_reading_state";
	public static String FIELD_TIME_MISMATCH_STATE = "time_mismatch_state";
	public static String FIELD_LAST_DG_READING_UPDATED_DUMP = "last_dg_reading_updated_dump";
	public static String FIELD_LAST_GRID_READING_UPDATED_DUMP = "last_grid_reading_updated_dump";
	public static String FIELD_ZERO_READING_STATE = "zero_reading_state";
	public static String FIELD_ZERO_DG_READING_STATE = "zero_dg_reading_state";
	public static String FIELD_DG_GRID_READING_LIMIT_STATE = "dg_grid_reading_limit_state";
	public static String FIELD_STARTED_ZERO_DG_READING = "started_zero_dg_reading";
	public static String FIELD_ZERO_GRID_READING_STATE = "zero_grid_reading_state";
	public static String FIELD_STARTED_ZERO_GRID_READING = "started_zero_grid_reading";
	public static String FIELD_STARTED_ZERO_READING = "started_zero_reading";
	public static String FIELD_SKIP_LIMIT_CHECK = "skip_limit_check";
	public static String FIELD_ADMIN_STATUS = "admin_status";
	public static String FIELD_LANGITUDE = "langitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_SPEED = "speed";
	public static String FIELD_AIRFLOW = "airFlow";
	public static String FIELD_ATMOSHERICPRESSURE = "atmoshericPressure";
	public static String FIELD_ENGINELOAD = "engineLoad";
	public static String FIELD_GPSSTATUS = "gpsStatus";
	public static String FIELD_INTAKEAIRTEMPERATURE = "intakeAirTemperature";
	public static String FIELD_OILPRESSURE = "oilPressure";
	public static String FIELD_RPM = "rpm";
	public static String FIELD_TROTTLEPOSITION = "trottlePosition";
	public static String FIELD_BATTERYVOLTAGE = "batteryVoltage";
	public static String FIELD_INTAKETUBEABSOLUTEPRESSURE = "intakeTubeAbsolutePressure";
	public static String FIELD_NUMBEROFDTC = "numberOfDTC";
	public static String FIELD_ENGINESTATE = "engineState";
	public static String FIELD_LASTENGINESTARTED = "lastEngineStarted";
	public static String FIELD_LASTENGINESTOPPED = "lastEngineStopped";
	public static String FIELD_HEARTBEAT_INTERVAL = "heartbeat_interval";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("sensor");

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

		Field sub_typeField = new Field("sub_type", "String");
		sub_typeField.setLength(32);
		metaData.addField(sub_typeField);

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

		Field location_noField = new Field("location_no", "String");
		location_noField.setLength(32);
		metaData.addField(location_noField);

		Field gateway_idField = new Field("gateway_id", "String");
		gateway_idField.setLength(128);
		metaData.addField(gateway_idField);

		Field site_idField = new Field("site_id", "String");
		site_idField.setLength(128);
		metaData.addField(site_idField);

		Field start_grid_readingField = new Field("start_grid_reading", "Number");
		start_grid_readingField.setDefaultValue(0.0000);
		start_grid_readingField.setLength(10);
		start_grid_readingField.setPrecision(4);
		metaData.addField(start_grid_readingField);

		Field start_dg_readingField = new Field("start_dg_reading", "Number");
		start_dg_readingField.setDefaultValue(0.0000);
		start_dg_readingField.setLength(10);
		start_dg_readingField.setPrecision(4);
		metaData.addField(start_dg_readingField);

		Field initial_balanceField = new Field("initial_balance", "Number");
		initial_balanceField.setDefaultValue(0);
		initial_balanceField.setLength(10);
		initial_balanceField.setPrecision(2);
		metaData.addField(initial_balanceField);

		Field meter_ct_mfField = new Field("meter_ct_mf", "Number");
		meter_ct_mfField.setDefaultValue(1);
		meter_ct_mfField.setLength(6);
		meter_ct_mfField.setPrecision(2);
		metaData.addField(meter_ct_mfField);

		Field last_reading_updatedField = new Field("last_reading_updated", "timestamp");
		last_reading_updatedField.setRequired(true);
		last_reading_updatedField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(last_reading_updatedField);

		Field start_reading_dateField = new Field("start_reading_date", "timestamp");
		metaData.addField(start_reading_dateField);

		Field initial_reading_dateField = new Field("initial_reading_date", "date");
		metaData.addField(initial_reading_dateField);

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
		threshold_voltage_min_levelField.setPrecision(2);
		metaData.addField(threshold_voltage_min_levelField);

		Field threshold_voltage_max_levelField = new Field("threshold_voltage_max_level", "Number");
		threshold_voltage_max_levelField.setLength(10);
		threshold_voltage_max_levelField.setPrecision(2);
		metaData.addField(threshold_voltage_max_levelField);

		Field threshold_current_min_levelField = new Field("threshold_current_min_level", "Number");
		threshold_current_min_levelField.setLength(10);
		threshold_current_min_levelField.setPrecision(2);
		metaData.addField(threshold_current_min_levelField);

		Field threshold_current_max_levelField = new Field("threshold_current_max_level", "Number");
		threshold_current_max_levelField.setLength(10);
		threshold_current_max_levelField.setPrecision(2);
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

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field tenent_idField = new Field("tenent_id", "String");
		tenent_idField.setLength(128);
		metaData.addField(tenent_idField);

		Field controller_idField = new Field("controller_id", "String");
		controller_idField.setLength(128);
		metaData.addField(controller_idField);

		Field controller_portField = new Field("controller_port", "int");
		controller_portField.setLength(4);
		metaData.addField(controller_portField);

		Field controller_physical_portField = new Field("controller_physical_port", "int");
		controller_physical_portField.setLength(4);
		metaData.addField(controller_physical_portField);

		Field end_deviceField = new Field("end_device", "String");
		end_deviceField.setLength(128);
		metaData.addField(end_deviceField);

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
		number_of_batteriesField.setDefaultValue(24);
		number_of_batteriesField.setLength(3);
		metaData.addField(number_of_batteriesField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field deploy_typeField = new Field("deploy_type", "String");
		deploy_typeField.setDefaultValue("LOCATION");
		deploy_typeField.setLength(16);
		metaData.addField(deploy_typeField);

		Field dg_overload_enabledField = new Field("dg_overload_enabled", "String");
		dg_overload_enabledField.setDefaultValue("N");
		dg_overload_enabledField.setLength(1);
		metaData.addField(dg_overload_enabledField);

		Field grid_overload_enabledField = new Field("grid_overload_enabled", "String");
		grid_overload_enabledField.setDefaultValue("Y");
		grid_overload_enabledField.setLength(1);
		metaData.addField(grid_overload_enabledField);

		Field dg_noField = new Field("dg_no", "int");
		dg_noField.setDefaultValue(0);
		dg_noField.setLength(4);
		metaData.addField(dg_noField);

		Field grid_overload_settingField = new Field("grid_overload_setting", "int");
		grid_overload_settingField.setDefaultValue(800);
		grid_overload_settingField.setLength(5);
		metaData.addField(grid_overload_settingField);

		Field dg_overload_settingField = new Field("dg_overload_setting", "int");
		dg_overload_settingField.setDefaultValue(500);
		dg_overload_settingField.setLength(5);
		metaData.addField(dg_overload_settingField);

		Field over_voltageField = new Field("over_voltage", "int");
		over_voltageField.setDefaultValue(280);
		over_voltageField.setLength(4);
		metaData.addField(over_voltageField);

		Field under_voltageField = new Field("under_voltage", "int");
		under_voltageField.setDefaultValue(150);
		under_voltageField.setLength(4);
		metaData.addField(under_voltageField);

		Field sampleing_timeField = new Field("sampleing_time", "int");
		sampleing_timeField.setDefaultValue(30);
		sampleing_timeField.setLength(8);
		metaData.addField(sampleing_timeField);

		Field reconnect_timeField = new Field("reconnect_time", "int");
		reconnect_timeField.setDefaultValue(30);
		reconnect_timeField.setLength(8);
		metaData.addField(reconnect_timeField);

		Field number_of_overload_eventsField = new Field("number_of_overload_events", "int");
		number_of_overload_eventsField.setDefaultValue(10);
		number_of_overload_eventsField.setLength(4);
		metaData.addField(number_of_overload_eventsField);

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

		Field last_reading_updated_dgField = new Field("last_reading_updated_dg", "timestamp");
		last_reading_updated_dgField.setRequired(true);
		metaData.addField(last_reading_updated_dgField);

		Field last_reading_updated_gridField = new Field("last_reading_updated_grid", "timestamp");
		last_reading_updated_gridField.setRequired(true);
		metaData.addField(last_reading_updated_gridField);

		Field dg_readingField = new Field("dg_reading", "Number");
		dg_readingField.setDefaultValue(0.0000);
		dg_readingField.setLength(12);
		dg_readingField.setPrecision(4);
		metaData.addField(dg_readingField);

		Field reading_validator_mfField = new Field("reading_validator_mf", "Number");
		reading_validator_mfField.setDefaultValue(7.0);
		reading_validator_mfField.setLength(8);
		reading_validator_mfField.setPrecision(4);
		metaData.addField(reading_validator_mfField);

		Field grid_readingField = new Field("grid_reading", "Number");
		grid_readingField.setDefaultValue(0.0000);
		grid_readingField.setLength(12);
		grid_readingField.setPrecision(4);
		metaData.addField(grid_readingField);

		Field dg_reading_dumpField = new Field("dg_reading_dump", "Number");
		dg_reading_dumpField.setDefaultValue(0.0000);
		dg_reading_dumpField.setLength(12);
		dg_reading_dumpField.setPrecision(4);
		metaData.addField(dg_reading_dumpField);

		Field grid_reading_dumpField = new Field("grid_reading_dump", "Number");
		grid_reading_dumpField.setDefaultValue(0.0000);
		grid_reading_dumpField.setLength(12);
		grid_reading_dumpField.setPrecision(4);
		metaData.addField(grid_reading_dumpField);

		Field last_power_cut_timeField = new Field("last_power_cut_time", "timestamp");
		metaData.addField(last_power_cut_timeField);

		Field voltageField = new Field("voltage", "int");
		voltageField.setDefaultValue(0);
		voltageField.setLength(5);
		metaData.addField(voltageField);

		Field voltage_floatField = new Field("voltage_float", "Number");
		voltage_floatField.setDefaultValue(0.0);
		voltage_floatField.setLength(6);
		voltage_floatField.setPrecision(2);
		metaData.addField(voltage_floatField);

		Field currentField = new Field("current", "int");
		currentField.setDefaultValue(0);
		currentField.setLength(5);
		metaData.addField(currentField);

		Field powerField = new Field("power", "int");
		powerField.setDefaultValue(0);
		powerField.setLength(5);
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

		Field unhealthy_batteriesField = new Field("unhealthy_batteries", "int");
		unhealthy_batteriesField.setDefaultValue(0);
		unhealthy_batteriesField.setLength(3);
		metaData.addField(unhealthy_batteriesField);

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

		Field stateField = new Field("state", "String");
		stateField.setDefaultValue("N");
		stateField.setLength(32);
		metaData.addField(stateField);

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

		Field overload_gridField = new Field("overload_grid", "String");
		overload_gridField.setDefaultValue("N");
		overload_gridField.setLength(1);
		metaData.addField(overload_gridField);

		Field overload_dgField = new Field("overload_dg", "String");
		overload_dgField.setDefaultValue("N");
		overload_dgField.setLength(1);
		metaData.addField(overload_dgField);

		Field dg_onField = new Field("dg_on", "String");
		dg_onField.setDefaultValue("N");
		dg_onField.setLength(1);
		metaData.addField(dg_onField);

		Field low_battery_stateField = new Field("low_battery_state", "String");
		low_battery_stateField.setDefaultValue("N");
		low_battery_stateField.setLength(1);
		metaData.addField(low_battery_stateField);

		Field deep_discharge_battery_stateField = new Field("deep_discharge_battery_state", "String");
		deep_discharge_battery_stateField.setDefaultValue("N");
		deep_discharge_battery_stateField.setLength(1);
		metaData.addField(deep_discharge_battery_stateField);

		Field charging_stateField = new Field("charging_state", "String");
		charging_stateField.setDefaultValue("N");
		charging_stateField.setLength(1);
		metaData.addField(charging_stateField);

		Field higher_reading_stateField = new Field("higher_reading_state", "String");
		higher_reading_stateField.setDefaultValue("N");
		higher_reading_stateField.setLength(1);
		metaData.addField(higher_reading_stateField);

		Field higher_dg_reading_stateField = new Field("higher_dg_reading_state", "String");
		higher_dg_reading_stateField.setDefaultValue("N");
		higher_dg_reading_stateField.setLength(1);
		metaData.addField(higher_dg_reading_stateField);

		Field higher_grid_reading_stateField = new Field("higher_grid_reading_state", "String");
		higher_grid_reading_stateField.setDefaultValue("N");
		higher_grid_reading_stateField.setLength(1);
		metaData.addField(higher_grid_reading_stateField);

		Field out_of_mf_reading_stateField = new Field("out_of_mf_reading_state", "String");
		out_of_mf_reading_stateField.setDefaultValue("N");
		out_of_mf_reading_stateField.setLength(1);
		metaData.addField(out_of_mf_reading_stateField);

		Field out_of_mf_dg_reading_stateField = new Field("out_of_mf_dg_reading_state", "String");
		out_of_mf_dg_reading_stateField.setDefaultValue("N");
		out_of_mf_dg_reading_stateField.setLength(1);
		metaData.addField(out_of_mf_dg_reading_stateField);

		Field out_of_mf_grid_reading_stateField = new Field("out_of_mf_grid_reading_state", "String");
		out_of_mf_grid_reading_stateField.setDefaultValue("N");
		out_of_mf_grid_reading_stateField.setLength(1);
		metaData.addField(out_of_mf_grid_reading_stateField);

		Field time_mismatch_stateField = new Field("time_mismatch_state", "String");
		time_mismatch_stateField.setDefaultValue("N");
		time_mismatch_stateField.setLength(1);
		metaData.addField(time_mismatch_stateField);

		Field last_dg_reading_updated_dumpField = new Field("last_dg_reading_updated_dump", "timestamp");
		metaData.addField(last_dg_reading_updated_dumpField);

		Field last_grid_reading_updated_dumpField = new Field("last_grid_reading_updated_dump", "timestamp");
		metaData.addField(last_grid_reading_updated_dumpField);

		Field zero_reading_stateField = new Field("zero_reading_state", "String");
		zero_reading_stateField.setDefaultValue("N");
		zero_reading_stateField.setLength(1);
		metaData.addField(zero_reading_stateField);

		Field zero_dg_reading_stateField = new Field("zero_dg_reading_state", "String");
		zero_dg_reading_stateField.setDefaultValue("N");
		zero_dg_reading_stateField.setLength(1);
		metaData.addField(zero_dg_reading_stateField);

		Field dg_grid_reading_limit_stateField = new Field("dg_grid_reading_limit_state", "String");
		dg_grid_reading_limit_stateField.setDefaultValue("N");
		dg_grid_reading_limit_stateField.setLength(1);
		metaData.addField(dg_grid_reading_limit_stateField);

		Field started_zero_dg_readingField = new Field("started_zero_dg_reading", "timestamp");
		metaData.addField(started_zero_dg_readingField);

		Field zero_grid_reading_stateField = new Field("zero_grid_reading_state", "String");
		zero_grid_reading_stateField.setDefaultValue("N");
		zero_grid_reading_stateField.setLength(1);
		metaData.addField(zero_grid_reading_stateField);

		Field started_zero_grid_readingField = new Field("started_zero_grid_reading", "timestamp");
		metaData.addField(started_zero_grid_readingField);

		Field started_zero_readingField = new Field("started_zero_reading", "timestamp");
		metaData.addField(started_zero_readingField);

		Field skip_limit_checkField = new Field("skip_limit_check", "String");
		skip_limit_checkField.setDefaultValue("N");
		skip_limit_checkField.setLength(1);
		metaData.addField(skip_limit_checkField);

		Field admin_statusField = new Field("admin_status", "String");
		admin_statusField.setDefaultValue("N");
		admin_statusField.setLength(1);
		metaData.addField(admin_statusField);

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

		Field speedField = new Field("speed", "int");
		speedField.setDefaultValue(0);
		speedField.setLength(4);
		metaData.addField(speedField);

		Field airFlowField = new Field("airFlow", "int");
		airFlowField.setDefaultValue(0);
		airFlowField.setLength(8);
		metaData.addField(airFlowField);

		Field atmoshericPressureField = new Field("atmoshericPressure", "Number");
		atmoshericPressureField.setDefaultValue(0);
		atmoshericPressureField.setLength(12);
		atmoshericPressureField.setPrecision(4);
		metaData.addField(atmoshericPressureField);

		Field engineLoadField = new Field("engineLoad", "int");
		engineLoadField.setDefaultValue(0);
		engineLoadField.setLength(12);
		metaData.addField(engineLoadField);

		Field gpsStatusField = new Field("gpsStatus", "String");
		gpsStatusField.setDefaultValue("A");
		gpsStatusField.setLength(1);
		metaData.addField(gpsStatusField);

		Field intakeAirTemperatureField = new Field("intakeAirTemperature", "int");
		intakeAirTemperatureField.setDefaultValue(0);
		intakeAirTemperatureField.setLength(12);
		metaData.addField(intakeAirTemperatureField);

		Field oilPressureField = new Field("oilPressure", "Number");
		oilPressureField.setDefaultValue(0);
		oilPressureField.setLength(12);
		oilPressureField.setPrecision(4);
		metaData.addField(oilPressureField);

		Field rpmField = new Field("rpm", "int");
		rpmField.setDefaultValue(0);
		rpmField.setLength(12);
		metaData.addField(rpmField);

		Field trottlePositionField = new Field("trottlePosition", "int");
		trottlePositionField.setDefaultValue(0);
		trottlePositionField.setLength(12);
		metaData.addField(trottlePositionField);

		Field batteryVoltageField = new Field("batteryVoltage", "Number");
		batteryVoltageField.setDefaultValue(0);
		batteryVoltageField.setLength(12);
		batteryVoltageField.setPrecision(2);
		metaData.addField(batteryVoltageField);

		Field intakeTubeAbsolutePressureField = new Field("intakeTubeAbsolutePressure", "Number");
		intakeTubeAbsolutePressureField.setDefaultValue(0);
		intakeTubeAbsolutePressureField.setLength(12);
		intakeTubeAbsolutePressureField.setPrecision(2);
		metaData.addField(intakeTubeAbsolutePressureField);

		Field numberOfDTCField = new Field("numberOfDTC", "int");
		numberOfDTCField.setDefaultValue(0);
		numberOfDTCField.setLength(12);
		metaData.addField(numberOfDTCField);

		Field engineStateField = new Field("engineState", "String");
		engineStateField.setDefaultValue("N");
		engineStateField.setLength(1);
		metaData.addField(engineStateField);

		Field lastEngineStartedField = new Field("lastEngineStarted", "timestamp");
		metaData.addField(lastEngineStartedField);

		Field lastEngineStoppedField = new Field("lastEngineStopped", "timestamp");
		metaData.addField(lastEngineStoppedField);

		Field heartbeat_intervalField = new Field("heartbeat_interval", "int");
		metaData.addField(heartbeat_intervalField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sensor");

		metaData.setCluster("DB_DEVICE");
	}

	public Basesensor() {}

	public Basesensor(Basesensor obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.sub_type = obj.sub_type;
		this.consumer_id = obj.consumer_id;
		this.manager = obj.manager;
		this.model = obj.model;
		this.location_id = obj.location_id;
		this.location_no = obj.location_no;
		this.gateway_id = obj.gateway_id;
		this.site_id = obj.site_id;
		this.start_grid_reading = obj.start_grid_reading;
		this.start_dg_reading = obj.start_dg_reading;
		this.initial_balance = obj.initial_balance;
		this.meter_ct_mf = obj.meter_ct_mf;
		this.last_reading_updated = obj.last_reading_updated;
		this.start_reading_date = obj.start_reading_date;
		this.initial_reading_date = obj.initial_reading_date;
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
		this.threshold_temperature_min_level = obj.threshold_temperature_min_level;
		this.threshold_temperature_max_level = obj.threshold_temperature_max_level;
		this.threshold_voltage_min_level = obj.threshold_voltage_min_level;
		this.threshold_voltage_max_level = obj.threshold_voltage_max_level;
		this.threshold_current_min_level = obj.threshold_current_min_level;
		this.threshold_current_max_level = obj.threshold_current_max_level;
		this.threshold_duration = obj.threshold_duration;
		this.asset_id = obj.asset_id;
		this.partner_id = obj.partner_id;
		this.customer_id = obj.customer_id;
		this.tenent_id = obj.tenent_id;
		this.controller_id = obj.controller_id;
		this.controller_port = obj.controller_port;
		this.controller_physical_port = obj.controller_physical_port;
		this.end_device = obj.end_device;
		this.ex_type = obj.ex_type;
		this.interface_type = obj.interface_type;
		this.battery_number = obj.battery_number;
		this.number_of_batteries = obj.number_of_batteries;
		this.appliance_id = obj.appliance_id;
		this.deploy_type = obj.deploy_type;
		this.dg_overload_enabled = obj.dg_overload_enabled;
		this.grid_overload_enabled = obj.grid_overload_enabled;
		this.dg_no = obj.dg_no;
		this.grid_overload_setting = obj.grid_overload_setting;
		this.dg_overload_setting = obj.dg_overload_setting;
		this.over_voltage = obj.over_voltage;
		this.under_voltage = obj.under_voltage;
		this.sampleing_time = obj.sampleing_time;
		this.reconnect_time = obj.reconnect_time;
		this.number_of_overload_events = obj.number_of_overload_events;
		this.connected = obj.connected;
		this.config = obj.config;
		this.battery_status = obj.battery_status;
		this.battery_level = obj.battery_level;
		this.last_reading = obj.last_reading;
		this.last_reading_updated_dg = obj.last_reading_updated_dg;
		this.last_reading_updated_grid = obj.last_reading_updated_grid;
		this.dg_reading = obj.dg_reading;
		this.reading_validator_mf = obj.reading_validator_mf;
		this.grid_reading = obj.grid_reading;
		this.dg_reading_dump = obj.dg_reading_dump;
		this.grid_reading_dump = obj.grid_reading_dump;
		this.last_power_cut_time = obj.last_power_cut_time;
		this.voltage = obj.voltage;
		this.voltage_float = obj.voltage_float;
		this.current = obj.current;
		this.power = obj.power;
		this.temperature = obj.temperature;
		this.humidity = obj.humidity;
		this.mode = obj.mode;
		this.level = obj.level;
		this.unhealthy_batteries = obj.unhealthy_batteries;
		this.level_float = obj.level_float;
		this.fuel_level = obj.fuel_level;
		this.state = obj.state;
		this.prefilege_detected = obj.prefilege_detected;
		this.last_prefilege_detected_time = obj.last_prefilege_detected_time;
		this.move_state = obj.move_state;
		this.last_moved_in_time = obj.last_moved_in_time;
		this.last_moved_out_time = obj.last_moved_out_time;
		this.last_disconnect_time = obj.last_disconnect_time;
		this.last_update_time = obj.last_update_time;
		this.activated = obj.activated;
		this.overload_grid = obj.overload_grid;
		this.overload_dg = obj.overload_dg;
		this.dg_on = obj.dg_on;
		this.low_battery_state = obj.low_battery_state;
		this.deep_discharge_battery_state = obj.deep_discharge_battery_state;
		this.charging_state = obj.charging_state;
		this.higher_reading_state = obj.higher_reading_state;
		this.higher_dg_reading_state = obj.higher_dg_reading_state;
		this.higher_grid_reading_state = obj.higher_grid_reading_state;
		this.out_of_mf_reading_state = obj.out_of_mf_reading_state;
		this.out_of_mf_dg_reading_state = obj.out_of_mf_dg_reading_state;
		this.out_of_mf_grid_reading_state = obj.out_of_mf_grid_reading_state;
		this.time_mismatch_state = obj.time_mismatch_state;
		this.last_dg_reading_updated_dump = obj.last_dg_reading_updated_dump;
		this.last_grid_reading_updated_dump = obj.last_grid_reading_updated_dump;
		this.zero_reading_state = obj.zero_reading_state;
		this.zero_dg_reading_state = obj.zero_dg_reading_state;
		this.dg_grid_reading_limit_state = obj.dg_grid_reading_limit_state;
		this.started_zero_dg_reading = obj.started_zero_dg_reading;
		this.zero_grid_reading_state = obj.zero_grid_reading_state;
		this.started_zero_grid_reading = obj.started_zero_grid_reading;
		this.started_zero_reading = obj.started_zero_reading;
		this.skip_limit_check = obj.skip_limit_check;
		this.admin_status = obj.admin_status;
		this.langitude = obj.langitude;
		this.latitude = obj.latitude;
		this.speed = obj.speed;
		this.airFlow = obj.airFlow;
		this.atmoshericPressure = obj.atmoshericPressure;
		this.engineLoad = obj.engineLoad;
		this.gpsStatus = obj.gpsStatus;
		this.intakeAirTemperature = obj.intakeAirTemperature;
		this.oilPressure = obj.oilPressure;
		this.rpm = obj.rpm;
		this.trottlePosition = obj.trottlePosition;
		this.batteryVoltage = obj.batteryVoltage;
		this.intakeTubeAbsolutePressure = obj.intakeTubeAbsolutePressure;
		this.numberOfDTC = obj.numberOfDTC;
		this.engineState = obj.engineState;
		this.lastEngineStarted = obj.lastEngineStarted;
		this.lastEngineStopped = obj.lastEngineStopped;
		this.heartbeat_interval = obj.heartbeat_interval;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(start_grid_reading == null)
			start_grid_reading = 0.0000;
		if(start_dg_reading == null)
			start_dg_reading = 0.0000;
		if(initial_balance == null)
			initial_balance = 0;
		if(meter_ct_mf == null)
			meter_ct_mf = 1;
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
		if(number_of_batteries == null)
			number_of_batteries = 24;
		if(deploy_type == null)
			deploy_type = "LOCATION";
		if(dg_overload_enabled == null)
			dg_overload_enabled = "N";
		if(grid_overload_enabled == null)
			grid_overload_enabled = "Y";
		if(dg_no == null)
			dg_no = 0;
		if(grid_overload_setting == null)
			grid_overload_setting = 800;
		if(dg_overload_setting == null)
			dg_overload_setting = 500;
		if(over_voltage == null)
			over_voltage = 280;
		if(under_voltage == null)
			under_voltage = 150;
		if(sampleing_time == null)
			sampleing_time = 30;
		if(reconnect_time == null)
			reconnect_time = 30;
		if(number_of_overload_events == null)
			number_of_overload_events = 10;
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
		if(reading_validator_mf == null)
			reading_validator_mf = 7.0;
		if(grid_reading == null)
			grid_reading = 0.0000;
		if(dg_reading_dump == null)
			dg_reading_dump = 0.0000;
		if(grid_reading_dump == null)
			grid_reading_dump = 0.0000;
		if(voltage == null)
			voltage = 0;
		if(voltage_float == null)
			voltage_float = 0.0;
		if(current == null)
			current = 0;
		if(power == null)
			power = 0;
		if(temperature == null)
			temperature = 0.00;
		if(humidity == null)
			humidity = 0.00;
		if(mode == null)
			mode = "D";
		if(level == null)
			level = 0;
		if(unhealthy_batteries == null)
			unhealthy_batteries = 0;
		if(level_float == null)
			level_float = 0.00;
		if(fuel_level == null)
			fuel_level = 0.00;
		if(state == null)
			state = "N";
		if(activated == null)
			activated = "N";
		if(overload_grid == null)
			overload_grid = "N";
		if(overload_dg == null)
			overload_dg = "N";
		if(dg_on == null)
			dg_on = "N";
		if(low_battery_state == null)
			low_battery_state = "N";
		if(deep_discharge_battery_state == null)
			deep_discharge_battery_state = "N";
		if(charging_state == null)
			charging_state = "N";
		if(higher_reading_state == null)
			higher_reading_state = "N";
		if(higher_dg_reading_state == null)
			higher_dg_reading_state = "N";
		if(higher_grid_reading_state == null)
			higher_grid_reading_state = "N";
		if(out_of_mf_reading_state == null)
			out_of_mf_reading_state = "N";
		if(out_of_mf_dg_reading_state == null)
			out_of_mf_dg_reading_state = "N";
		if(out_of_mf_grid_reading_state == null)
			out_of_mf_grid_reading_state = "N";
		if(time_mismatch_state == null)
			time_mismatch_state = "N";
		if(zero_reading_state == null)
			zero_reading_state = "N";
		if(zero_dg_reading_state == null)
			zero_dg_reading_state = "N";
		if(dg_grid_reading_limit_state == null)
			dg_grid_reading_limit_state = "N";
		if(zero_grid_reading_state == null)
			zero_grid_reading_state = "N";
		if(skip_limit_check == null)
			skip_limit_check = "N";
		if(admin_status == null)
			admin_status = "N";
		if(langitude == null)
			langitude = 0.00;
		if(latitude == null)
			latitude = 0.00;
		if(speed == null)
			speed = 0;
		if(airFlow == null)
			airFlow = 0;
		if(atmoshericPressure == null)
			atmoshericPressure = 0;
		if(engineLoad == null)
			engineLoad = 0;
		if(gpsStatus == null)
			gpsStatus = "A";
		if(intakeAirTemperature == null)
			intakeAirTemperature = 0;
		if(oilPressure == null)
			oilPressure = 0;
		if(rpm == null)
			rpm = 0;
		if(trottlePosition == null)
			trottlePosition = 0;
		if(batteryVoltage == null)
			batteryVoltage = 0;
		if(intakeTubeAbsolutePressure == null)
			intakeTubeAbsolutePressure = 0;
		if(numberOfDTC == null)
			numberOfDTC = 0;
		if(engineState == null)
			engineState = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(consumer_id != null)
			map.put("consumer_id", consumer_id);
		if(manager != null)
			map.put("manager", manager);
		if(model != null)
			map.put("model", model);
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_no != null)
			map.put("location_no", location_no);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(site_id != null)
			map.put("site_id", site_id);
		if(start_grid_reading != null)
			map.put("start_grid_reading", start_grid_reading);
		if(start_dg_reading != null)
			map.put("start_dg_reading", start_dg_reading);
		if(initial_balance != null)
			map.put("initial_balance", initial_balance);
		if(meter_ct_mf != null)
			map.put("meter_ct_mf", meter_ct_mf);
		if(last_reading_updated != null)
			map.put("last_reading_updated", last_reading_updated);
		if(start_reading_date != null)
			map.put("start_reading_date", start_reading_date);
		if(initial_reading_date != null)
			map.put("initial_reading_date", initial_reading_date);
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(controller_physical_port != null)
			map.put("controller_physical_port", controller_physical_port);
		if(end_device != null)
			map.put("end_device", end_device);
		if(ex_type != null)
			map.put("ex_type", ex_type);
		if(interface_type != null)
			map.put("interface_type", interface_type);
		if(battery_number != null)
			map.put("battery_number", battery_number);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(deploy_type != null)
			map.put("deploy_type", deploy_type);
		if(dg_overload_enabled != null)
			map.put("dg_overload_enabled", dg_overload_enabled);
		if(grid_overload_enabled != null)
			map.put("grid_overload_enabled", grid_overload_enabled);
		if(dg_no != null)
			map.put("dg_no", dg_no);
		if(grid_overload_setting != null)
			map.put("grid_overload_setting", grid_overload_setting);
		if(dg_overload_setting != null)
			map.put("dg_overload_setting", dg_overload_setting);
		if(over_voltage != null)
			map.put("over_voltage", over_voltage);
		if(under_voltage != null)
			map.put("under_voltage", under_voltage);
		if(sampleing_time != null)
			map.put("sampleing_time", sampleing_time);
		if(reconnect_time != null)
			map.put("reconnect_time", reconnect_time);
		if(number_of_overload_events != null)
			map.put("number_of_overload_events", number_of_overload_events);
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
		if(last_reading_updated_dg != null)
			map.put("last_reading_updated_dg", last_reading_updated_dg);
		if(last_reading_updated_grid != null)
			map.put("last_reading_updated_grid", last_reading_updated_grid);
		if(dg_reading != null)
			map.put("dg_reading", dg_reading);
		if(reading_validator_mf != null)
			map.put("reading_validator_mf", reading_validator_mf);
		if(grid_reading != null)
			map.put("grid_reading", grid_reading);
		if(dg_reading_dump != null)
			map.put("dg_reading_dump", dg_reading_dump);
		if(grid_reading_dump != null)
			map.put("grid_reading_dump", grid_reading_dump);
		if(last_power_cut_time != null)
			map.put("last_power_cut_time", last_power_cut_time);
		if(voltage != null)
			map.put("voltage", voltage);
		if(voltage_float != null)
			map.put("voltage_float", voltage_float);
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
		if(unhealthy_batteries != null)
			map.put("unhealthy_batteries", unhealthy_batteries);
		if(level_float != null)
			map.put("level_float", level_float);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(state != null)
			map.put("state", state);
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
		if(overload_grid != null)
			map.put("overload_grid", overload_grid);
		if(overload_dg != null)
			map.put("overload_dg", overload_dg);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(low_battery_state != null)
			map.put("low_battery_state", low_battery_state);
		if(deep_discharge_battery_state != null)
			map.put("deep_discharge_battery_state", deep_discharge_battery_state);
		if(charging_state != null)
			map.put("charging_state", charging_state);
		if(higher_reading_state != null)
			map.put("higher_reading_state", higher_reading_state);
		if(higher_dg_reading_state != null)
			map.put("higher_dg_reading_state", higher_dg_reading_state);
		if(higher_grid_reading_state != null)
			map.put("higher_grid_reading_state", higher_grid_reading_state);
		if(out_of_mf_reading_state != null)
			map.put("out_of_mf_reading_state", out_of_mf_reading_state);
		if(out_of_mf_dg_reading_state != null)
			map.put("out_of_mf_dg_reading_state", out_of_mf_dg_reading_state);
		if(out_of_mf_grid_reading_state != null)
			map.put("out_of_mf_grid_reading_state", out_of_mf_grid_reading_state);
		if(time_mismatch_state != null)
			map.put("time_mismatch_state", time_mismatch_state);
		if(last_dg_reading_updated_dump != null)
			map.put("last_dg_reading_updated_dump", last_dg_reading_updated_dump);
		if(last_grid_reading_updated_dump != null)
			map.put("last_grid_reading_updated_dump", last_grid_reading_updated_dump);
		if(zero_reading_state != null)
			map.put("zero_reading_state", zero_reading_state);
		if(zero_dg_reading_state != null)
			map.put("zero_dg_reading_state", zero_dg_reading_state);
		if(dg_grid_reading_limit_state != null)
			map.put("dg_grid_reading_limit_state", dg_grid_reading_limit_state);
		if(started_zero_dg_reading != null)
			map.put("started_zero_dg_reading", started_zero_dg_reading);
		if(zero_grid_reading_state != null)
			map.put("zero_grid_reading_state", zero_grid_reading_state);
		if(started_zero_grid_reading != null)
			map.put("started_zero_grid_reading", started_zero_grid_reading);
		if(started_zero_reading != null)
			map.put("started_zero_reading", started_zero_reading);
		if(skip_limit_check != null)
			map.put("skip_limit_check", skip_limit_check);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(speed != null)
			map.put("speed", speed);
		if(airFlow != null)
			map.put("airFlow", airFlow);
		if(atmoshericPressure != null)
			map.put("atmoshericPressure", atmoshericPressure);
		if(engineLoad != null)
			map.put("engineLoad", engineLoad);
		if(gpsStatus != null)
			map.put("gpsStatus", gpsStatus);
		if(intakeAirTemperature != null)
			map.put("intakeAirTemperature", intakeAirTemperature);
		if(oilPressure != null)
			map.put("oilPressure", oilPressure);
		if(rpm != null)
			map.put("rpm", rpm);
		if(trottlePosition != null)
			map.put("trottlePosition", trottlePosition);
		if(batteryVoltage != null)
			map.put("batteryVoltage", batteryVoltage);
		if(intakeTubeAbsolutePressure != null)
			map.put("intakeTubeAbsolutePressure", intakeTubeAbsolutePressure);
		if(numberOfDTC != null)
			map.put("numberOfDTC", numberOfDTC);
		if(engineState != null)
			map.put("engineState", engineState);
		if(lastEngineStarted != null)
			map.put("lastEngineStarted", lastEngineStarted);
		if(lastEngineStopped != null)
			map.put("lastEngineStopped", lastEngineStopped);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
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
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
		if(consumer_id != null)
			map.put("consumer_id", consumer_id);
		if(manager != null)
			map.put("manager", manager);
		if(model != null)
			map.put("model", model);
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_no != null)
			map.put("location_no", location_no);
		if(gateway_id != null)
			map.put("gateway_id", gateway_id);
		if(site_id != null)
			map.put("site_id", site_id);
		if(start_grid_reading != null)
			map.put("start_grid_reading", start_grid_reading);
		if(start_dg_reading != null)
			map.put("start_dg_reading", start_dg_reading);
		if(initial_balance != null)
			map.put("initial_balance", initial_balance);
		if(meter_ct_mf != null)
			map.put("meter_ct_mf", meter_ct_mf);
		if(validateLast_reading_updated(add))
			map.put("last_reading_updated", last_reading_updated);
		if(start_reading_date != null)
			map.put("start_reading_date", start_reading_date);
		if(initial_reading_date != null)
			map.put("initial_reading_date", initial_reading_date);
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(controller_physical_port != null)
			map.put("controller_physical_port", controller_physical_port);
		if(end_device != null)
			map.put("end_device", end_device);
		if(ex_type != null)
			map.put("ex_type", ex_type);
		if(interface_type != null)
			map.put("interface_type", interface_type);
		if(battery_number != null)
			map.put("battery_number", battery_number);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(deploy_type != null)
			map.put("deploy_type", deploy_type);
		if(dg_overload_enabled != null)
			map.put("dg_overload_enabled", dg_overload_enabled);
		if(grid_overload_enabled != null)
			map.put("grid_overload_enabled", grid_overload_enabled);
		if(dg_no != null)
			map.put("dg_no", dg_no);
		if(grid_overload_setting != null)
			map.put("grid_overload_setting", grid_overload_setting);
		if(dg_overload_setting != null)
			map.put("dg_overload_setting", dg_overload_setting);
		if(over_voltage != null)
			map.put("over_voltage", over_voltage);
		if(under_voltage != null)
			map.put("under_voltage", under_voltage);
		if(sampleing_time != null)
			map.put("sampleing_time", sampleing_time);
		if(reconnect_time != null)
			map.put("reconnect_time", reconnect_time);
		if(number_of_overload_events != null)
			map.put("number_of_overload_events", number_of_overload_events);
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
		if(validateLast_reading_updated_dg(add))
			map.put("last_reading_updated_dg", last_reading_updated_dg);
		if(validateLast_reading_updated_grid(add))
			map.put("last_reading_updated_grid", last_reading_updated_grid);
		if(dg_reading != null)
			map.put("dg_reading", dg_reading);
		if(reading_validator_mf != null)
			map.put("reading_validator_mf", reading_validator_mf);
		if(grid_reading != null)
			map.put("grid_reading", grid_reading);
		if(dg_reading_dump != null)
			map.put("dg_reading_dump", dg_reading_dump);
		if(grid_reading_dump != null)
			map.put("grid_reading_dump", grid_reading_dump);
		if(last_power_cut_time != null)
			map.put("last_power_cut_time", last_power_cut_time);
		if(voltage != null)
			map.put("voltage", voltage);
		if(voltage_float != null)
			map.put("voltage_float", voltage_float);
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
		if(unhealthy_batteries != null)
			map.put("unhealthy_batteries", unhealthy_batteries);
		if(level_float != null)
			map.put("level_float", level_float);
		if(fuel_level != null)
			map.put("fuel_level", fuel_level);
		if(state != null)
			map.put("state", state);
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
		if(overload_grid != null)
			map.put("overload_grid", overload_grid);
		if(overload_dg != null)
			map.put("overload_dg", overload_dg);
		if(dg_on != null)
			map.put("dg_on", dg_on);
		if(low_battery_state != null)
			map.put("low_battery_state", low_battery_state);
		if(deep_discharge_battery_state != null)
			map.put("deep_discharge_battery_state", deep_discharge_battery_state);
		if(charging_state != null)
			map.put("charging_state", charging_state);
		if(higher_reading_state != null)
			map.put("higher_reading_state", higher_reading_state);
		if(higher_dg_reading_state != null)
			map.put("higher_dg_reading_state", higher_dg_reading_state);
		if(higher_grid_reading_state != null)
			map.put("higher_grid_reading_state", higher_grid_reading_state);
		if(out_of_mf_reading_state != null)
			map.put("out_of_mf_reading_state", out_of_mf_reading_state);
		if(out_of_mf_dg_reading_state != null)
			map.put("out_of_mf_dg_reading_state", out_of_mf_dg_reading_state);
		if(out_of_mf_grid_reading_state != null)
			map.put("out_of_mf_grid_reading_state", out_of_mf_grid_reading_state);
		if(time_mismatch_state != null)
			map.put("time_mismatch_state", time_mismatch_state);
		if(last_dg_reading_updated_dump != null)
			map.put("last_dg_reading_updated_dump", last_dg_reading_updated_dump);
		if(last_grid_reading_updated_dump != null)
			map.put("last_grid_reading_updated_dump", last_grid_reading_updated_dump);
		if(zero_reading_state != null)
			map.put("zero_reading_state", zero_reading_state);
		if(zero_dg_reading_state != null)
			map.put("zero_dg_reading_state", zero_dg_reading_state);
		if(dg_grid_reading_limit_state != null)
			map.put("dg_grid_reading_limit_state", dg_grid_reading_limit_state);
		if(started_zero_dg_reading != null)
			map.put("started_zero_dg_reading", started_zero_dg_reading);
		if(zero_grid_reading_state != null)
			map.put("zero_grid_reading_state", zero_grid_reading_state);
		if(started_zero_grid_reading != null)
			map.put("started_zero_grid_reading", started_zero_grid_reading);
		if(started_zero_reading != null)
			map.put("started_zero_reading", started_zero_reading);
		if(skip_limit_check != null)
			map.put("skip_limit_check", skip_limit_check);
		if(admin_status != null)
			map.put("admin_status", admin_status);
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(speed != null)
			map.put("speed", speed);
		if(airFlow != null)
			map.put("airFlow", airFlow);
		if(atmoshericPressure != null)
			map.put("atmoshericPressure", atmoshericPressure);
		if(engineLoad != null)
			map.put("engineLoad", engineLoad);
		if(gpsStatus != null)
			map.put("gpsStatus", gpsStatus);
		if(intakeAirTemperature != null)
			map.put("intakeAirTemperature", intakeAirTemperature);
		if(oilPressure != null)
			map.put("oilPressure", oilPressure);
		if(rpm != null)
			map.put("rpm", rpm);
		if(trottlePosition != null)
			map.put("trottlePosition", trottlePosition);
		if(batteryVoltage != null)
			map.put("batteryVoltage", batteryVoltage);
		if(intakeTubeAbsolutePressure != null)
			map.put("intakeTubeAbsolutePressure", intakeTubeAbsolutePressure);
		if(numberOfDTC != null)
			map.put("numberOfDTC", numberOfDTC);
		if(engineState != null)
			map.put("engineState", engineState);
		if(lastEngineStarted != null)
			map.put("lastEngineStarted", lastEngineStarted);
		if(lastEngineStopped != null)
			map.put("lastEngineStopped", lastEngineStopped);
		if(heartbeat_interval != null)
			map.put("heartbeat_interval", heartbeat_interval);
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
		sub_type = (String) map.get("sub_type");
		consumer_id = (String) map.get("consumer_id");
		manager = (String) map.get("manager");
		model = (String) map.get("model");
		location_id = (String) map.get("location_id");
		location_no = (String) map.get("location_no");
		gateway_id = (String) map.get("gateway_id");
		site_id = (String) map.get("site_id");
		start_grid_reading = (Number) map.get("start_grid_reading");
		start_dg_reading = (Number) map.get("start_dg_reading");
		initial_balance = (Number) map.get("initial_balance");
		meter_ct_mf = (Number) map.get("meter_ct_mf");
		last_reading_updated = (Long) map.get("last_reading_updated");
		start_reading_date = (Long) map.get("start_reading_date");
		initial_reading_date = (java.util.Date) map.get("initial_reading_date");
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
		threshold_temperature_min_level = (Number) map.get("threshold_temperature_min_level");
		threshold_temperature_max_level = (Number) map.get("threshold_temperature_max_level");
		threshold_voltage_min_level = (Number) map.get("threshold_voltage_min_level");
		threshold_voltage_max_level = (Number) map.get("threshold_voltage_max_level");
		threshold_current_min_level = (Number) map.get("threshold_current_min_level");
		threshold_current_max_level = (Number) map.get("threshold_current_max_level");
		threshold_duration = (Number) map.get("threshold_duration");
		asset_id = (String) map.get("asset_id");
		partner_id = (String) map.get("partner_id");
		customer_id = (String) map.get("customer_id");
		tenent_id = (String) map.get("tenent_id");
		controller_id = (String) map.get("controller_id");
		controller_port = (Integer) map.get("controller_port");
		controller_physical_port = (Integer) map.get("controller_physical_port");
		end_device = (String) map.get("end_device");
		ex_type = (String) map.get("ex_type");
		interface_type = (String) map.get("interface_type");
		battery_number = (Integer) map.get("battery_number");
		number_of_batteries = (Integer) map.get("number_of_batteries");
		appliance_id = (String) map.get("appliance_id");
		deploy_type = (String) map.get("deploy_type");
		dg_overload_enabled = (String) map.get("dg_overload_enabled");
		grid_overload_enabled = (String) map.get("grid_overload_enabled");
		dg_no = (Integer) map.get("dg_no");
		grid_overload_setting = (Integer) map.get("grid_overload_setting");
		dg_overload_setting = (Integer) map.get("dg_overload_setting");
		over_voltage = (Integer) map.get("over_voltage");
		under_voltage = (Integer) map.get("under_voltage");
		sampleing_time = (Integer) map.get("sampleing_time");
		reconnect_time = (Integer) map.get("reconnect_time");
		number_of_overload_events = (Integer) map.get("number_of_overload_events");
		connected = (String) map.get("connected");
		config = (String) map.get("config");
		battery_status = (String) map.get("battery_status");
		battery_level = (Integer) map.get("battery_level");
		last_reading = (Number) map.get("last_reading");
		last_reading_updated_dg = (Long) map.get("last_reading_updated_dg");
		last_reading_updated_grid = (Long) map.get("last_reading_updated_grid");
		dg_reading = (Number) map.get("dg_reading");
		reading_validator_mf = (Number) map.get("reading_validator_mf");
		grid_reading = (Number) map.get("grid_reading");
		dg_reading_dump = (Number) map.get("dg_reading_dump");
		grid_reading_dump = (Number) map.get("grid_reading_dump");
		last_power_cut_time = (Long) map.get("last_power_cut_time");
		voltage = (Integer) map.get("voltage");
		voltage_float = (Number) map.get("voltage_float");
		current = (Integer) map.get("current");
		power = (Integer) map.get("power");
		temperature = (Number) map.get("temperature");
		humidity = (Number) map.get("humidity");
		mode = (String) map.get("mode");
		level = (Integer) map.get("level");
		unhealthy_batteries = (Integer) map.get("unhealthy_batteries");
		level_float = (Number) map.get("level_float");
		fuel_level = (Number) map.get("fuel_level");
		state = (String) map.get("state");
		prefilege_detected = (String) map.get("prefilege_detected");
		last_prefilege_detected_time = (Long) map.get("last_prefilege_detected_time");
		move_state = (String) map.get("move_state");
		last_moved_in_time = (Long) map.get("last_moved_in_time");
		last_moved_out_time = (Long) map.get("last_moved_out_time");
		last_disconnect_time = (Long) map.get("last_disconnect_time");
		last_update_time = (Long) map.get("last_update_time");
		activated = (String) map.get("activated");
		overload_grid = (String) map.get("overload_grid");
		overload_dg = (String) map.get("overload_dg");
		dg_on = (String) map.get("dg_on");
		low_battery_state = (String) map.get("low_battery_state");
		deep_discharge_battery_state = (String) map.get("deep_discharge_battery_state");
		charging_state = (String) map.get("charging_state");
		higher_reading_state = (String) map.get("higher_reading_state");
		higher_dg_reading_state = (String) map.get("higher_dg_reading_state");
		higher_grid_reading_state = (String) map.get("higher_grid_reading_state");
		out_of_mf_reading_state = (String) map.get("out_of_mf_reading_state");
		out_of_mf_dg_reading_state = (String) map.get("out_of_mf_dg_reading_state");
		out_of_mf_grid_reading_state = (String) map.get("out_of_mf_grid_reading_state");
		time_mismatch_state = (String) map.get("time_mismatch_state");
		last_dg_reading_updated_dump = (Long) map.get("last_dg_reading_updated_dump");
		last_grid_reading_updated_dump = (Long) map.get("last_grid_reading_updated_dump");
		zero_reading_state = (String) map.get("zero_reading_state");
		zero_dg_reading_state = (String) map.get("zero_dg_reading_state");
		dg_grid_reading_limit_state = (String) map.get("dg_grid_reading_limit_state");
		started_zero_dg_reading = (Long) map.get("started_zero_dg_reading");
		zero_grid_reading_state = (String) map.get("zero_grid_reading_state");
		started_zero_grid_reading = (Long) map.get("started_zero_grid_reading");
		started_zero_reading = (Long) map.get("started_zero_reading");
		skip_limit_check = (String) map.get("skip_limit_check");
		admin_status = (String) map.get("admin_status");
		langitude = (Number) map.get("langitude");
		latitude = (Number) map.get("latitude");
		speed = (Integer) map.get("speed");
		airFlow = (Integer) map.get("airFlow");
		atmoshericPressure = (Number) map.get("atmoshericPressure");
		engineLoad = (Integer) map.get("engineLoad");
		gpsStatus = (String) map.get("gpsStatus");
		intakeAirTemperature = (Integer) map.get("intakeAirTemperature");
		oilPressure = (Number) map.get("oilPressure");
		rpm = (Integer) map.get("rpm");
		trottlePosition = (Integer) map.get("trottlePosition");
		batteryVoltage = (Number) map.get("batteryVoltage");
		intakeTubeAbsolutePressure = (Number) map.get("intakeTubeAbsolutePressure");
		numberOfDTC = (Integer) map.get("numberOfDTC");
		engineState = (String) map.get("engineState");
		lastEngineStarted = (Long) map.get("lastEngineStarted");
		lastEngineStopped = (Long) map.get("lastEngineStopped");
		heartbeat_interval = (Integer) map.get("heartbeat_interval");
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

		Object sub_typeObj = map.get("sub_type");
		if(sub_typeObj != null)
			sub_type = sub_typeObj.toString();

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

		Object location_noObj = map.get("location_no");
		if(location_noObj != null)
			location_no = location_noObj.toString();

		Object gateway_idObj = map.get("gateway_id");
		if(gateway_idObj != null)
			gateway_id = gateway_idObj.toString();

		Object site_idObj = map.get("site_id");
		if(site_idObj != null)
			site_id = site_idObj.toString();

		Object start_grid_readingObj = map.get("start_grid_reading");
		if(start_grid_readingObj != null)
			start_grid_reading = new Double(start_grid_readingObj.toString());

		Object start_dg_readingObj = map.get("start_dg_reading");
		if(start_dg_readingObj != null)
			start_dg_reading = new Double(start_dg_readingObj.toString());

		Object initial_balanceObj = map.get("initial_balance");
		if(initial_balanceObj != null)
			initial_balance = new Double(initial_balanceObj.toString());

		Object meter_ct_mfObj = map.get("meter_ct_mf");
		if(meter_ct_mfObj != null)
			meter_ct_mf = new Double(meter_ct_mfObj.toString());

		Object last_reading_updatedObj = map.get("last_reading_updated");
		if(last_reading_updatedObj != null)
			last_reading_updated = (Long) last_reading_updatedObj;

		Object start_reading_dateObj = map.get("start_reading_date");
		if(start_reading_dateObj != null)
			start_reading_date = (Long) start_reading_dateObj;

		Object initial_reading_dateObj = map.get("initial_reading_date");
		if(initial_reading_dateObj != null)
			initial_reading_date = (java.util.Date) initial_reading_dateObj;

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

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object tenent_idObj = map.get("tenent_id");
		if(tenent_idObj != null)
			tenent_id = tenent_idObj.toString();

		Object controller_idObj = map.get("controller_id");
		if(controller_idObj != null)
			controller_id = controller_idObj.toString();

		Object controller_portObj = map.get("controller_port");
		if(controller_portObj != null)
			controller_port = new Integer(controller_portObj.toString());

		Object controller_physical_portObj = map.get("controller_physical_port");
		if(controller_physical_portObj != null)
			controller_physical_port = new Integer(controller_physical_portObj.toString());

		Object end_deviceObj = map.get("end_device");
		if(end_deviceObj != null)
			end_device = end_deviceObj.toString();

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

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object deploy_typeObj = map.get("deploy_type");
		if(deploy_typeObj != null)
			deploy_type = deploy_typeObj.toString();

		Object dg_overload_enabledObj = map.get("dg_overload_enabled");
		if(dg_overload_enabledObj != null)
			dg_overload_enabled = dg_overload_enabledObj.toString();

		Object grid_overload_enabledObj = map.get("grid_overload_enabled");
		if(grid_overload_enabledObj != null)
			grid_overload_enabled = grid_overload_enabledObj.toString();

		Object dg_noObj = map.get("dg_no");
		if(dg_noObj != null)
			dg_no = new Integer(dg_noObj.toString());

		Object grid_overload_settingObj = map.get("grid_overload_setting");
		if(grid_overload_settingObj != null)
			grid_overload_setting = new Integer(grid_overload_settingObj.toString());

		Object dg_overload_settingObj = map.get("dg_overload_setting");
		if(dg_overload_settingObj != null)
			dg_overload_setting = new Integer(dg_overload_settingObj.toString());

		Object over_voltageObj = map.get("over_voltage");
		if(over_voltageObj != null)
			over_voltage = new Integer(over_voltageObj.toString());

		Object under_voltageObj = map.get("under_voltage");
		if(under_voltageObj != null)
			under_voltage = new Integer(under_voltageObj.toString());

		Object sampleing_timeObj = map.get("sampleing_time");
		if(sampleing_timeObj != null)
			sampleing_time = new Integer(sampleing_timeObj.toString());

		Object reconnect_timeObj = map.get("reconnect_time");
		if(reconnect_timeObj != null)
			reconnect_time = new Integer(reconnect_timeObj.toString());

		Object number_of_overload_eventsObj = map.get("number_of_overload_events");
		if(number_of_overload_eventsObj != null)
			number_of_overload_events = new Integer(number_of_overload_eventsObj.toString());

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

		Object last_reading_updated_dgObj = map.get("last_reading_updated_dg");
		if(last_reading_updated_dgObj != null)
			last_reading_updated_dg = (Long) last_reading_updated_dgObj;

		Object last_reading_updated_gridObj = map.get("last_reading_updated_grid");
		if(last_reading_updated_gridObj != null)
			last_reading_updated_grid = (Long) last_reading_updated_gridObj;

		Object dg_readingObj = map.get("dg_reading");
		if(dg_readingObj != null)
			dg_reading = new Double(dg_readingObj.toString());

		Object reading_validator_mfObj = map.get("reading_validator_mf");
		if(reading_validator_mfObj != null)
			reading_validator_mf = new Double(reading_validator_mfObj.toString());

		Object grid_readingObj = map.get("grid_reading");
		if(grid_readingObj != null)
			grid_reading = new Double(grid_readingObj.toString());

		Object dg_reading_dumpObj = map.get("dg_reading_dump");
		if(dg_reading_dumpObj != null)
			dg_reading_dump = new Double(dg_reading_dumpObj.toString());

		Object grid_reading_dumpObj = map.get("grid_reading_dump");
		if(grid_reading_dumpObj != null)
			grid_reading_dump = new Double(grid_reading_dumpObj.toString());

		Object last_power_cut_timeObj = map.get("last_power_cut_time");
		if(last_power_cut_timeObj != null)
			last_power_cut_time = (Long) last_power_cut_timeObj;

		Object voltageObj = map.get("voltage");
		if(voltageObj != null)
			voltage = new Integer(voltageObj.toString());

		Object voltage_floatObj = map.get("voltage_float");
		if(voltage_floatObj != null)
			voltage_float = new Double(voltage_floatObj.toString());

		Object currentObj = map.get("current");
		if(currentObj != null)
			current = new Integer(currentObj.toString());

		Object powerObj = map.get("power");
		if(powerObj != null)
			power = new Integer(powerObj.toString());

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

		Object unhealthy_batteriesObj = map.get("unhealthy_batteries");
		if(unhealthy_batteriesObj != null)
			unhealthy_batteries = new Integer(unhealthy_batteriesObj.toString());

		Object level_floatObj = map.get("level_float");
		if(level_floatObj != null)
			level_float = new Double(level_floatObj.toString());

		Object fuel_levelObj = map.get("fuel_level");
		if(fuel_levelObj != null)
			fuel_level = new Double(fuel_levelObj.toString());

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

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

		Object overload_gridObj = map.get("overload_grid");
		if(overload_gridObj != null)
			overload_grid = overload_gridObj.toString();

		Object overload_dgObj = map.get("overload_dg");
		if(overload_dgObj != null)
			overload_dg = overload_dgObj.toString();

		Object dg_onObj = map.get("dg_on");
		if(dg_onObj != null)
			dg_on = dg_onObj.toString();

		Object low_battery_stateObj = map.get("low_battery_state");
		if(low_battery_stateObj != null)
			low_battery_state = low_battery_stateObj.toString();

		Object deep_discharge_battery_stateObj = map.get("deep_discharge_battery_state");
		if(deep_discharge_battery_stateObj != null)
			deep_discharge_battery_state = deep_discharge_battery_stateObj.toString();

		Object charging_stateObj = map.get("charging_state");
		if(charging_stateObj != null)
			charging_state = charging_stateObj.toString();

		Object higher_reading_stateObj = map.get("higher_reading_state");
		if(higher_reading_stateObj != null)
			higher_reading_state = higher_reading_stateObj.toString();

		Object higher_dg_reading_stateObj = map.get("higher_dg_reading_state");
		if(higher_dg_reading_stateObj != null)
			higher_dg_reading_state = higher_dg_reading_stateObj.toString();

		Object higher_grid_reading_stateObj = map.get("higher_grid_reading_state");
		if(higher_grid_reading_stateObj != null)
			higher_grid_reading_state = higher_grid_reading_stateObj.toString();

		Object out_of_mf_reading_stateObj = map.get("out_of_mf_reading_state");
		if(out_of_mf_reading_stateObj != null)
			out_of_mf_reading_state = out_of_mf_reading_stateObj.toString();

		Object out_of_mf_dg_reading_stateObj = map.get("out_of_mf_dg_reading_state");
		if(out_of_mf_dg_reading_stateObj != null)
			out_of_mf_dg_reading_state = out_of_mf_dg_reading_stateObj.toString();

		Object out_of_mf_grid_reading_stateObj = map.get("out_of_mf_grid_reading_state");
		if(out_of_mf_grid_reading_stateObj != null)
			out_of_mf_grid_reading_state = out_of_mf_grid_reading_stateObj.toString();

		Object time_mismatch_stateObj = map.get("time_mismatch_state");
		if(time_mismatch_stateObj != null)
			time_mismatch_state = time_mismatch_stateObj.toString();

		Object last_dg_reading_updated_dumpObj = map.get("last_dg_reading_updated_dump");
		if(last_dg_reading_updated_dumpObj != null)
			last_dg_reading_updated_dump = (Long) last_dg_reading_updated_dumpObj;

		Object last_grid_reading_updated_dumpObj = map.get("last_grid_reading_updated_dump");
		if(last_grid_reading_updated_dumpObj != null)
			last_grid_reading_updated_dump = (Long) last_grid_reading_updated_dumpObj;

		Object zero_reading_stateObj = map.get("zero_reading_state");
		if(zero_reading_stateObj != null)
			zero_reading_state = zero_reading_stateObj.toString();

		Object zero_dg_reading_stateObj = map.get("zero_dg_reading_state");
		if(zero_dg_reading_stateObj != null)
			zero_dg_reading_state = zero_dg_reading_stateObj.toString();

		Object dg_grid_reading_limit_stateObj = map.get("dg_grid_reading_limit_state");
		if(dg_grid_reading_limit_stateObj != null)
			dg_grid_reading_limit_state = dg_grid_reading_limit_stateObj.toString();

		Object started_zero_dg_readingObj = map.get("started_zero_dg_reading");
		if(started_zero_dg_readingObj != null)
			started_zero_dg_reading = (Long) started_zero_dg_readingObj;

		Object zero_grid_reading_stateObj = map.get("zero_grid_reading_state");
		if(zero_grid_reading_stateObj != null)
			zero_grid_reading_state = zero_grid_reading_stateObj.toString();

		Object started_zero_grid_readingObj = map.get("started_zero_grid_reading");
		if(started_zero_grid_readingObj != null)
			started_zero_grid_reading = (Long) started_zero_grid_readingObj;

		Object started_zero_readingObj = map.get("started_zero_reading");
		if(started_zero_readingObj != null)
			started_zero_reading = (Long) started_zero_readingObj;

		Object skip_limit_checkObj = map.get("skip_limit_check");
		if(skip_limit_checkObj != null)
			skip_limit_check = skip_limit_checkObj.toString();

		Object admin_statusObj = map.get("admin_status");
		if(admin_statusObj != null)
			admin_status = admin_statusObj.toString();

		Object langitudeObj = map.get("langitude");
		if(langitudeObj != null)
			langitude = new Double(langitudeObj.toString());

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = new Double(latitudeObj.toString());

		Object speedObj = map.get("speed");
		if(speedObj != null)
			speed = new Integer(speedObj.toString());

		Object airFlowObj = map.get("airFlow");
		if(airFlowObj != null)
			airFlow = new Integer(airFlowObj.toString());

		Object atmoshericPressureObj = map.get("atmoshericPressure");
		if(atmoshericPressureObj != null)
			atmoshericPressure = new Double(atmoshericPressureObj.toString());

		Object engineLoadObj = map.get("engineLoad");
		if(engineLoadObj != null)
			engineLoad = new Integer(engineLoadObj.toString());

		Object gpsStatusObj = map.get("gpsStatus");
		if(gpsStatusObj != null)
			gpsStatus = gpsStatusObj.toString();

		Object intakeAirTemperatureObj = map.get("intakeAirTemperature");
		if(intakeAirTemperatureObj != null)
			intakeAirTemperature = new Integer(intakeAirTemperatureObj.toString());

		Object oilPressureObj = map.get("oilPressure");
		if(oilPressureObj != null)
			oilPressure = new Double(oilPressureObj.toString());

		Object rpmObj = map.get("rpm");
		if(rpmObj != null)
			rpm = new Integer(rpmObj.toString());

		Object trottlePositionObj = map.get("trottlePosition");
		if(trottlePositionObj != null)
			trottlePosition = new Integer(trottlePositionObj.toString());

		Object batteryVoltageObj = map.get("batteryVoltage");
		if(batteryVoltageObj != null)
			batteryVoltage = new Double(batteryVoltageObj.toString());

		Object intakeTubeAbsolutePressureObj = map.get("intakeTubeAbsolutePressure");
		if(intakeTubeAbsolutePressureObj != null)
			intakeTubeAbsolutePressure = new Double(intakeTubeAbsolutePressureObj.toString());

		Object numberOfDTCObj = map.get("numberOfDTC");
		if(numberOfDTCObj != null)
			numberOfDTC = new Integer(numberOfDTCObj.toString());

		Object engineStateObj = map.get("engineState");
		if(engineStateObj != null)
			engineState = engineStateObj.toString();

		Object lastEngineStartedObj = map.get("lastEngineStarted");
		if(lastEngineStartedObj != null)
			lastEngineStarted = (Long) lastEngineStartedObj;

		Object lastEngineStoppedObj = map.get("lastEngineStopped");
		if(lastEngineStoppedObj != null)
			lastEngineStopped = (Long) lastEngineStoppedObj;

		Object heartbeat_intervalObj = map.get("heartbeat_interval");
		if(heartbeat_intervalObj != null)
			heartbeat_interval = new Integer(heartbeat_intervalObj.toString());

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

	public String getLocation_no() {
		return location_no;
	}

	public String getLocation_noEx() {
		return location_no != null ? location_no : "";
	}

	public void setLocation_no(String location_no) {
		this.location_no = location_no;
	}

	public void unSetLocation_no() {
		this.location_no = null;
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

	public Number getStart_grid_reading() {
		return start_grid_reading != null ? start_grid_reading : 0.0000;
	}

	public void setStart_grid_reading(Number start_grid_reading) {
		this.start_grid_reading = start_grid_reading;
	}

	public void unSetStart_grid_reading() {
		this.start_grid_reading = 0.0000;
	}

	public Number getStart_dg_reading() {
		return start_dg_reading != null ? start_dg_reading : 0.0000;
	}

	public void setStart_dg_reading(Number start_dg_reading) {
		this.start_dg_reading = start_dg_reading;
	}

	public void unSetStart_dg_reading() {
		this.start_dg_reading = 0.0000;
	}

	public Number getInitial_balance() {
		return initial_balance != null ? initial_balance : 0;
	}

	public void setInitial_balance(Number initial_balance) {
		this.initial_balance = initial_balance;
	}

	public void unSetInitial_balance() {
		this.initial_balance = 0;
	}

	public Number getMeter_ct_mf() {
		return meter_ct_mf != null ? meter_ct_mf : 1;
	}

	public void setMeter_ct_mf(Number meter_ct_mf) {
		this.meter_ct_mf = meter_ct_mf;
	}

	public void unSetMeter_ct_mf() {
		this.meter_ct_mf = 1;
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

	public Long getStart_reading_date() {
		return start_reading_date;
	}

	public void setStart_reading_date(Long start_reading_date) {
		this.start_reading_date = start_reading_date;
	}


	public java.util.Date getInitial_reading_date() {
		return initial_reading_date;
	}

	public void setInitial_reading_date(java.util.Date initial_reading_date) {
		this.initial_reading_date = initial_reading_date;
	}

	public void unSetInitial_reading_date() {
		this.initial_reading_date = null;
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

	public String getController_id() {
		return controller_id;
	}

	public String getController_idEx() {
		return controller_id != null ? controller_id : "";
	}

	public void setController_id(String controller_id) {
		this.controller_id = controller_id;
	}

	public void unSetController_id() {
		this.controller_id = null;
	}

	public Integer getController_port() {
		return controller_port;
	}

	public int getController_portEx() {
		return controller_port != null ? controller_port : 0;
	}

	public void setController_port(int controller_port) {
		this.controller_port = controller_port;
	}

	public void setController_port(Integer controller_port) {
		this.controller_port = controller_port;
	}

	public void unSetController_port() {
		this.controller_port = null;
	}

	public Integer getController_physical_port() {
		return controller_physical_port;
	}

	public int getController_physical_portEx() {
		return controller_physical_port != null ? controller_physical_port : 0;
	}

	public void setController_physical_port(int controller_physical_port) {
		this.controller_physical_port = controller_physical_port;
	}

	public void setController_physical_port(Integer controller_physical_port) {
		this.controller_physical_port = controller_physical_port;
	}

	public void unSetController_physical_port() {
		this.controller_physical_port = null;
	}

	public String getEnd_device() {
		return end_device;
	}

	public String getEnd_deviceEx() {
		return end_device != null ? end_device : "";
	}

	public void setEnd_device(String end_device) {
		this.end_device = end_device;
	}

	public void unSetEnd_device() {
		this.end_device = null;
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
		return number_of_batteries != null ? number_of_batteries : 24;
	}

	public void setNumber_of_batteries(int number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void setNumber_of_batteries(Integer number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void unSetNumber_of_batteries() {
		this.number_of_batteries = 24;
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

	public String getDeploy_type() {
		return deploy_type != null ? deploy_type : "LOCATION";
	}

	public void setDeploy_type(String deploy_type) {
		this.deploy_type = deploy_type;
	}

	public void unSetDeploy_type() {
		this.deploy_type = "LOCATION";
	}

	public String getDg_overload_enabled() {
		return dg_overload_enabled != null ? dg_overload_enabled : "N";
	}

	public void setDg_overload_enabled(String dg_overload_enabled) {
		this.dg_overload_enabled = dg_overload_enabled;
	}

	public void unSetDg_overload_enabled() {
		this.dg_overload_enabled = "N";
	}

	public String getGrid_overload_enabled() {
		return grid_overload_enabled != null ? grid_overload_enabled : "Y";
	}

	public void setGrid_overload_enabled(String grid_overload_enabled) {
		this.grid_overload_enabled = grid_overload_enabled;
	}

	public void unSetGrid_overload_enabled() {
		this.grid_overload_enabled = "Y";
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

	public Integer getGrid_overload_setting() {
		return grid_overload_setting != null ? grid_overload_setting : 800;
	}

	public void setGrid_overload_setting(int grid_overload_setting) {
		this.grid_overload_setting = grid_overload_setting;
	}

	public void setGrid_overload_setting(Integer grid_overload_setting) {
		this.grid_overload_setting = grid_overload_setting;
	}

	public void unSetGrid_overload_setting() {
		this.grid_overload_setting = 800;
	}

	public Integer getDg_overload_setting() {
		return dg_overload_setting != null ? dg_overload_setting : 500;
	}

	public void setDg_overload_setting(int dg_overload_setting) {
		this.dg_overload_setting = dg_overload_setting;
	}

	public void setDg_overload_setting(Integer dg_overload_setting) {
		this.dg_overload_setting = dg_overload_setting;
	}

	public void unSetDg_overload_setting() {
		this.dg_overload_setting = 500;
	}

	public Integer getOver_voltage() {
		return over_voltage != null ? over_voltage : 280;
	}

	public void setOver_voltage(int over_voltage) {
		this.over_voltage = over_voltage;
	}

	public void setOver_voltage(Integer over_voltage) {
		this.over_voltage = over_voltage;
	}

	public void unSetOver_voltage() {
		this.over_voltage = 280;
	}

	public Integer getUnder_voltage() {
		return under_voltage != null ? under_voltage : 150;
	}

	public void setUnder_voltage(int under_voltage) {
		this.under_voltage = under_voltage;
	}

	public void setUnder_voltage(Integer under_voltage) {
		this.under_voltage = under_voltage;
	}

	public void unSetUnder_voltage() {
		this.under_voltage = 150;
	}

	public Integer getSampleing_time() {
		return sampleing_time != null ? sampleing_time : 30;
	}

	public void setSampleing_time(int sampleing_time) {
		this.sampleing_time = sampleing_time;
	}

	public void setSampleing_time(Integer sampleing_time) {
		this.sampleing_time = sampleing_time;
	}

	public void unSetSampleing_time() {
		this.sampleing_time = 30;
	}

	public Integer getReconnect_time() {
		return reconnect_time != null ? reconnect_time : 30;
	}

	public void setReconnect_time(int reconnect_time) {
		this.reconnect_time = reconnect_time;
	}

	public void setReconnect_time(Integer reconnect_time) {
		this.reconnect_time = reconnect_time;
	}

	public void unSetReconnect_time() {
		this.reconnect_time = 30;
	}

	public Integer getNumber_of_overload_events() {
		return number_of_overload_events != null ? number_of_overload_events : 10;
	}

	public void setNumber_of_overload_events(int number_of_overload_events) {
		this.number_of_overload_events = number_of_overload_events;
	}

	public void setNumber_of_overload_events(Integer number_of_overload_events) {
		this.number_of_overload_events = number_of_overload_events;
	}

	public void unSetNumber_of_overload_events() {
		this.number_of_overload_events = 10;
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

	public Long getLast_reading_updated_dg() {
		return last_reading_updated_dg;
	}

	public void setLast_reading_updated_dg(Long last_reading_updated_dg) {
		this.last_reading_updated_dg = last_reading_updated_dg;
	}


	public boolean validateLast_reading_updated_dg(boolean add) throws ApplicationException {
		if(add && last_reading_updated_dg == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_reading_updated_dg]");
		return last_reading_updated_dg != null;
	}

	public Long getLast_reading_updated_grid() {
		return last_reading_updated_grid;
	}

	public void setLast_reading_updated_grid(Long last_reading_updated_grid) {
		this.last_reading_updated_grid = last_reading_updated_grid;
	}


	public boolean validateLast_reading_updated_grid(boolean add) throws ApplicationException {
		if(add && last_reading_updated_grid == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_reading_updated_grid]");
		return last_reading_updated_grid != null;
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

	public Number getReading_validator_mf() {
		return reading_validator_mf != null ? reading_validator_mf : 7.0;
	}

	public void setReading_validator_mf(Number reading_validator_mf) {
		this.reading_validator_mf = reading_validator_mf;
	}

	public void unSetReading_validator_mf() {
		this.reading_validator_mf = 7.0;
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

	public Number getDg_reading_dump() {
		return dg_reading_dump != null ? dg_reading_dump : 0.0000;
	}

	public void setDg_reading_dump(Number dg_reading_dump) {
		this.dg_reading_dump = dg_reading_dump;
	}

	public void unSetDg_reading_dump() {
		this.dg_reading_dump = 0.0000;
	}

	public Number getGrid_reading_dump() {
		return grid_reading_dump != null ? grid_reading_dump : 0.0000;
	}

	public void setGrid_reading_dump(Number grid_reading_dump) {
		this.grid_reading_dump = grid_reading_dump;
	}

	public void unSetGrid_reading_dump() {
		this.grid_reading_dump = 0.0000;
	}

	public Long getLast_power_cut_time() {
		return last_power_cut_time;
	}

	public void setLast_power_cut_time(Long last_power_cut_time) {
		this.last_power_cut_time = last_power_cut_time;
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

	public Number getVoltage_float() {
		return voltage_float != null ? voltage_float : 0.0;
	}

	public void setVoltage_float(Number voltage_float) {
		this.voltage_float = voltage_float;
	}

	public void unSetVoltage_float() {
		this.voltage_float = 0.0;
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

	public Integer getPower() {
		return power != null ? power : 0;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public void unSetPower() {
		this.power = 0;
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

	public String getState() {
		return state != null ? state : "N";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = "N";
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

	public String getOverload_grid() {
		return overload_grid != null ? overload_grid : "N";
	}

	public void setOverload_grid(String overload_grid) {
		this.overload_grid = overload_grid;
	}

	public void unSetOverload_grid() {
		this.overload_grid = "N";
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

	public String getDg_on() {
		return dg_on != null ? dg_on : "N";
	}

	public void setDg_on(String dg_on) {
		this.dg_on = dg_on;
	}

	public void unSetDg_on() {
		this.dg_on = "N";
	}

	public String getLow_battery_state() {
		return low_battery_state != null ? low_battery_state : "N";
	}

	public void setLow_battery_state(String low_battery_state) {
		this.low_battery_state = low_battery_state;
	}

	public void unSetLow_battery_state() {
		this.low_battery_state = "N";
	}

	public String getDeep_discharge_battery_state() {
		return deep_discharge_battery_state != null ? deep_discharge_battery_state : "N";
	}

	public void setDeep_discharge_battery_state(String deep_discharge_battery_state) {
		this.deep_discharge_battery_state = deep_discharge_battery_state;
	}

	public void unSetDeep_discharge_battery_state() {
		this.deep_discharge_battery_state = "N";
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

	public String getHigher_reading_state() {
		return higher_reading_state != null ? higher_reading_state : "N";
	}

	public void setHigher_reading_state(String higher_reading_state) {
		this.higher_reading_state = higher_reading_state;
	}

	public void unSetHigher_reading_state() {
		this.higher_reading_state = "N";
	}

	public String getHigher_dg_reading_state() {
		return higher_dg_reading_state != null ? higher_dg_reading_state : "N";
	}

	public void setHigher_dg_reading_state(String higher_dg_reading_state) {
		this.higher_dg_reading_state = higher_dg_reading_state;
	}

	public void unSetHigher_dg_reading_state() {
		this.higher_dg_reading_state = "N";
	}

	public String getHigher_grid_reading_state() {
		return higher_grid_reading_state != null ? higher_grid_reading_state : "N";
	}

	public void setHigher_grid_reading_state(String higher_grid_reading_state) {
		this.higher_grid_reading_state = higher_grid_reading_state;
	}

	public void unSetHigher_grid_reading_state() {
		this.higher_grid_reading_state = "N";
	}

	public String getOut_of_mf_reading_state() {
		return out_of_mf_reading_state != null ? out_of_mf_reading_state : "N";
	}

	public void setOut_of_mf_reading_state(String out_of_mf_reading_state) {
		this.out_of_mf_reading_state = out_of_mf_reading_state;
	}

	public void unSetOut_of_mf_reading_state() {
		this.out_of_mf_reading_state = "N";
	}

	public String getOut_of_mf_dg_reading_state() {
		return out_of_mf_dg_reading_state != null ? out_of_mf_dg_reading_state : "N";
	}

	public void setOut_of_mf_dg_reading_state(String out_of_mf_dg_reading_state) {
		this.out_of_mf_dg_reading_state = out_of_mf_dg_reading_state;
	}

	public void unSetOut_of_mf_dg_reading_state() {
		this.out_of_mf_dg_reading_state = "N";
	}

	public String getOut_of_mf_grid_reading_state() {
		return out_of_mf_grid_reading_state != null ? out_of_mf_grid_reading_state : "N";
	}

	public void setOut_of_mf_grid_reading_state(String out_of_mf_grid_reading_state) {
		this.out_of_mf_grid_reading_state = out_of_mf_grid_reading_state;
	}

	public void unSetOut_of_mf_grid_reading_state() {
		this.out_of_mf_grid_reading_state = "N";
	}

	public String getTime_mismatch_state() {
		return time_mismatch_state != null ? time_mismatch_state : "N";
	}

	public void setTime_mismatch_state(String time_mismatch_state) {
		this.time_mismatch_state = time_mismatch_state;
	}

	public void unSetTime_mismatch_state() {
		this.time_mismatch_state = "N";
	}

	public Long getLast_dg_reading_updated_dump() {
		return last_dg_reading_updated_dump;
	}

	public void setLast_dg_reading_updated_dump(Long last_dg_reading_updated_dump) {
		this.last_dg_reading_updated_dump = last_dg_reading_updated_dump;
	}


	public Long getLast_grid_reading_updated_dump() {
		return last_grid_reading_updated_dump;
	}

	public void setLast_grid_reading_updated_dump(Long last_grid_reading_updated_dump) {
		this.last_grid_reading_updated_dump = last_grid_reading_updated_dump;
	}


	public String getZero_reading_state() {
		return zero_reading_state != null ? zero_reading_state : "N";
	}

	public void setZero_reading_state(String zero_reading_state) {
		this.zero_reading_state = zero_reading_state;
	}

	public void unSetZero_reading_state() {
		this.zero_reading_state = "N";
	}

	public String getZero_dg_reading_state() {
		return zero_dg_reading_state != null ? zero_dg_reading_state : "N";
	}

	public void setZero_dg_reading_state(String zero_dg_reading_state) {
		this.zero_dg_reading_state = zero_dg_reading_state;
	}

	public void unSetZero_dg_reading_state() {
		this.zero_dg_reading_state = "N";
	}

	public String getDg_grid_reading_limit_state() {
		return dg_grid_reading_limit_state != null ? dg_grid_reading_limit_state : "N";
	}

	public void setDg_grid_reading_limit_state(String dg_grid_reading_limit_state) {
		this.dg_grid_reading_limit_state = dg_grid_reading_limit_state;
	}

	public void unSetDg_grid_reading_limit_state() {
		this.dg_grid_reading_limit_state = "N";
	}

	public Long getStarted_zero_dg_reading() {
		return started_zero_dg_reading;
	}

	public void setStarted_zero_dg_reading(Long started_zero_dg_reading) {
		this.started_zero_dg_reading = started_zero_dg_reading;
	}


	public String getZero_grid_reading_state() {
		return zero_grid_reading_state != null ? zero_grid_reading_state : "N";
	}

	public void setZero_grid_reading_state(String zero_grid_reading_state) {
		this.zero_grid_reading_state = zero_grid_reading_state;
	}

	public void unSetZero_grid_reading_state() {
		this.zero_grid_reading_state = "N";
	}

	public Long getStarted_zero_grid_reading() {
		return started_zero_grid_reading;
	}

	public void setStarted_zero_grid_reading(Long started_zero_grid_reading) {
		this.started_zero_grid_reading = started_zero_grid_reading;
	}


	public Long getStarted_zero_reading() {
		return started_zero_reading;
	}

	public void setStarted_zero_reading(Long started_zero_reading) {
		this.started_zero_reading = started_zero_reading;
	}


	public String getSkip_limit_check() {
		return skip_limit_check != null ? skip_limit_check : "N";
	}

	public void setSkip_limit_check(String skip_limit_check) {
		this.skip_limit_check = skip_limit_check;
	}

	public void unSetSkip_limit_check() {
		this.skip_limit_check = "N";
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

	public Integer getSpeed() {
		return speed != null ? speed : 0;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public void unSetSpeed() {
		this.speed = 0;
	}

	public Integer getAirFlow() {
		return airFlow != null ? airFlow : 0;
	}

	public void setAirFlow(int airFlow) {
		this.airFlow = airFlow;
	}

	public void setAirFlow(Integer airFlow) {
		this.airFlow = airFlow;
	}

	public void unSetAirFlow() {
		this.airFlow = 0;
	}

	public Number getAtmoshericPressure() {
		return atmoshericPressure != null ? atmoshericPressure : 0;
	}

	public void setAtmoshericPressure(Number atmoshericPressure) {
		this.atmoshericPressure = atmoshericPressure;
	}

	public void unSetAtmoshericPressure() {
		this.atmoshericPressure = 0;
	}

	public Integer getEngineLoad() {
		return engineLoad != null ? engineLoad : 0;
	}

	public void setEngineLoad(int engineLoad) {
		this.engineLoad = engineLoad;
	}

	public void setEngineLoad(Integer engineLoad) {
		this.engineLoad = engineLoad;
	}

	public void unSetEngineLoad() {
		this.engineLoad = 0;
	}

	public String getGpsStatus() {
		return gpsStatus != null ? gpsStatus : "A";
	}

	public void setGpsStatus(String gpsStatus) {
		this.gpsStatus = gpsStatus;
	}

	public void unSetGpsStatus() {
		this.gpsStatus = "A";
	}

	public Integer getIntakeAirTemperature() {
		return intakeAirTemperature != null ? intakeAirTemperature : 0;
	}

	public void setIntakeAirTemperature(int intakeAirTemperature) {
		this.intakeAirTemperature = intakeAirTemperature;
	}

	public void setIntakeAirTemperature(Integer intakeAirTemperature) {
		this.intakeAirTemperature = intakeAirTemperature;
	}

	public void unSetIntakeAirTemperature() {
		this.intakeAirTemperature = 0;
	}

	public Number getOilPressure() {
		return oilPressure != null ? oilPressure : 0;
	}

	public void setOilPressure(Number oilPressure) {
		this.oilPressure = oilPressure;
	}

	public void unSetOilPressure() {
		this.oilPressure = 0;
	}

	public Integer getRpm() {
		return rpm != null ? rpm : 0;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}

	public void unSetRpm() {
		this.rpm = 0;
	}

	public Integer getTrottlePosition() {
		return trottlePosition != null ? trottlePosition : 0;
	}

	public void setTrottlePosition(int trottlePosition) {
		this.trottlePosition = trottlePosition;
	}

	public void setTrottlePosition(Integer trottlePosition) {
		this.trottlePosition = trottlePosition;
	}

	public void unSetTrottlePosition() {
		this.trottlePosition = 0;
	}

	public Number getBatteryVoltage() {
		return batteryVoltage != null ? batteryVoltage : 0;
	}

	public void setBatteryVoltage(Number batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}

	public void unSetBatteryVoltage() {
		this.batteryVoltage = 0;
	}

	public Number getIntakeTubeAbsolutePressure() {
		return intakeTubeAbsolutePressure != null ? intakeTubeAbsolutePressure : 0;
	}

	public void setIntakeTubeAbsolutePressure(Number intakeTubeAbsolutePressure) {
		this.intakeTubeAbsolutePressure = intakeTubeAbsolutePressure;
	}

	public void unSetIntakeTubeAbsolutePressure() {
		this.intakeTubeAbsolutePressure = 0;
	}

	public Integer getNumberOfDTC() {
		return numberOfDTC != null ? numberOfDTC : 0;
	}

	public void setNumberOfDTC(int numberOfDTC) {
		this.numberOfDTC = numberOfDTC;
	}

	public void setNumberOfDTC(Integer numberOfDTC) {
		this.numberOfDTC = numberOfDTC;
	}

	public void unSetNumberOfDTC() {
		this.numberOfDTC = 0;
	}

	public String getEngineState() {
		return engineState != null ? engineState : "N";
	}

	public void setEngineState(String engineState) {
		this.engineState = engineState;
	}

	public void unSetEngineState() {
		this.engineState = "N";
	}

	public Long getLastEngineStarted() {
		return lastEngineStarted;
	}

	public void setLastEngineStarted(Long lastEngineStarted) {
		this.lastEngineStarted = lastEngineStarted;
	}


	public Long getLastEngineStopped() {
		return lastEngineStopped;
	}

	public void setLastEngineStopped(Long lastEngineStopped) {
		this.lastEngineStopped = lastEngineStopped;
	}


	public Integer getHeartbeat_interval() {
		return heartbeat_interval;
	}

	public int getHeartbeat_intervalEx() {
		return heartbeat_interval != null ? heartbeat_interval : 0;
	}

	public void setHeartbeat_interval(int heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void setHeartbeat_interval(Integer heartbeat_interval) {
		this.heartbeat_interval = heartbeat_interval;
	}

	public void unSetHeartbeat_interval() {
		this.heartbeat_interval = null;
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