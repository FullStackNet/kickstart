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
public abstract class Baseappliance extends BaseResource {
	private String id = null;
	private String name = null;
	private String threshold_templete_id = null;
	private String threshold_templete_name = null;
	private String controller_name = null;
	private String controller_id = null;
	private Long controller_port = null;
	private String imei = null;
	private String vin = null;
	private String make_id = null;
	private String make_name = null;
	private String model_id = null;
	private String model_name = null;
	private Double power_rating = null;
	private String type = null;
	private String sub_type = null;
	private String applaince_type_id = null;
	private String consumer_id = null;
	private String manager = null;
	private String model = null;
	private String location_id = null;
	private String location_name = null;
	private String sub_location_id = null;
	private String site_id = null;
	private String tank_id = null;
	private Double dg_unit_opening = null;
	private Double dg_unit_consumed = null;
	private Double dg_unit_closing = null;
	private Double grid_unit_opening = null;
	private Double grid_unit_consumed = null;
	private Double grid_unit_closing = null;
	private String serial_no = null;
	private String rf_tag_id = null;
	private String manufecturing_date = null;
	private String next_servicing_date = null;
	private Double threshold_fuel_level = null;
	private Integer threshold_over_speed = null;
	private Double capacity = null;
	private Integer maintainace_run_hour = null;
	private Integer today_run_time = null;
	private Double today_fuel_consumption = null;
	private Double average_fuel_consumption = null;
	private Double today_fuel_loss = null;
	private Integer current_month_run_time = null;
	private Double current_month_fuel_consumption = null;
	private Double current_month_fuel_loss = null;
	private Double threshold_temperature_min_level = null;
	private Double threshold_temperature_max_level = null;
	private Double threshold_voltage_min_level = null;
	private Double threshold_voltage_max_level = null;
	private Double threshold_current_min_level = null;
	private Double threshold_current_max_level = null;
	private Double threshold_duration = null;
	private String alert_dg_grid_on = null;
	private String alert_dg_grid_off = null;
	private String asset_id = null;
	private String partner_id = null;
	private String tenent_id = null;
	private String customer_id = null;
	private String user_id = null;
	private String community_id = null;
	private String community_name = null;
	private String ex_type = null;
	private String interface_type = null;
	private Integer battery_number = null;
	private Integer number_of_batteries = null;
	private String deploy_type = null;
	private String connected = null;
	private String config = null;
	private String battery_status = null;
	private Integer battery_level = null;
	private Double last_reading = null;
	private Long last_reading_updated = null;
	private Long last_grid_reading_updated = null;
	private Long last_dg_reading_updated = null;
	private Double dg_reading = null;
	private Double grid_reading = null;
	private Integer voltage = null;
	private Integer current = null;
	private Double power = null;
	private Double energy = null;
	private Double grid_reading_kvah = null;
	private Double grid_reading_kwh = null;
	private Double grid_today_kwh = null;
	private Double grid_current_month_kwh = null;
	private Double grid_today_kvah = null;
	private Double grid_current_month_kvah = null;
	private Double grid_load_kva = null;
	private Double grid_load_kw = null;
	private Double grid_voltage = null;
	private Double grid_current = null;
	private Double grid_pf = null;
	private Double grid_md = null;
	private Double grid_tdh = null;
	private Double grid_kvarh = null;
	private Long grid_frequency = null;
	private Double grid_p1_reading_kvah = null;
	private Double grid_p1_reading_kwh = null;
	private Double grid_p1_load_kva = null;
	private Double grid_p1_load_kw = null;
	private Double grid_p1_voltage = null;
	private Double grid_p1_current = null;
	private Double grid_p1_pf = null;
	private Double grid_p1_md = null;
	private Double grid_p1_tdh = null;
	private Double grid_p1_kvarh = null;
	private Double grid_p1_frequency = null;
	private Double grid_p2_reading_kvah = null;
	private Double grid_p2_reading_kwh = null;
	private Double grid_p2_load_kva = null;
	private Double grid_p2_load_kw = null;
	private Double grid_p2_voltage = null;
	private Double grid_p2_current = null;
	private Double grid_p2_pf = null;
	private Double grid_p2_md = null;
	private Double grid_p2_tdh = null;
	private Double grid_p2_kvarh = null;
	private Double grid_p2_frequency = null;
	private Double grid_p3_reading_kvah = null;
	private Double grid_p3_reading_kwh = null;
	private Double grid_p3_load_kva = null;
	private Double grid_p3_load_kw = null;
	private Double grid_p3_voltage = null;
	private Double grid_p3_current = null;
	private Double grid_p3_pf = null;
	private Double grid_p3_md = null;
	private Double grid_p3_tdh = null;
	private Double grid_p3_kvarh = null;
	private Double grid_p3_frequency = null;
	private Double dg_reading_kwh = null;
	private Double dg_reading_kvah = null;
	private Double dg_today_kwh = null;
	private Double dg_current_month_kwh = null;
	private Double dg_today_kvah = null;
	private Double dg_current_month_kvah = null;
	private Double dg_load_kw = null;
	private Double dg_load_kva = null;
	private Double dg_voltage = null;
	private Double dg_current = null;
	private Double dg_pf = null;
	private Double dg_md = null;
	private Double dg_tdh = null;
	private Double dg_kvarh = null;
	private Double dg_frequency = null;
	private Double dg_p1_reading_kvah = null;
	private Double dg_p1_reading_kwh = null;
	private Double dg_p1_load_kva = null;
	private Double dg_p1_load_kw = null;
	private Double dg_p1_voltage = null;
	private Double dg_p1_current = null;
	private Double dg_p1_pf = null;
	private Double dg_p1_md = null;
	private Double dg_p1_tdh = null;
	private Double dg_p1_kvarh = null;
	private Double dg_p1_frequency = null;
	private Double dg_p2_reading_kvah = null;
	private Double dg_p2_reading_kwh = null;
	private Double dg_p2_load_kva = null;
	private Double dg_p2_load_kw = null;
	private Double dg_p2_voltage = null;
	private Double dg_p2_current = null;
	private Double dg_p2_pf = null;
	private Double dg_p2_md = null;
	private Double dg_p2_tdh = null;
	private Double dg_p2_kvarh = null;
	private Double dg_p2_frequency = null;
	private Double dg_p3_reading_kvah = null;
	private Double dg_p3_reading_kwh = null;
	private Double dg_p3_load_kva = null;
	private Double dg_p3_load_kw = null;
	private Double dg_p3_voltage = null;
	private Double dg_p3_current = null;
	private Double dg_p3_pf = null;
	private Double dg_p3_md = null;
	private Double dg_p3_tdh = null;
	private Double dg_p3_kvarh = null;
	private Double dg_p3_frequency = null;
	private Double temperature = null;
	private Double humidity = null;
	private String mode = null;
	private Integer level = null;
	private Double level_float = null;
	private Double fuel_level = null;
	private Double fuel_quantity = null;
	private String state = null;
	private String maintaince_mode = null;
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
	private String high_coolant_temperature = null;
	private Double canopy_temperature = null;
	private Double coolant_temperature = null;
	private String high_canopy_temperature = null;
	private String lastProcessedState = null;
	private Long lastProcessedTime = null;
	private String charging_state = null;
	private Double last_processed_fuel_quantity = null;
	private Double last_processed_db_reading = null;
	private Double last_processed_grid_reading = null;
	private String langitude = null;
	private String latitude = null;
	private Integer speed = null;
	private String driveType = null;
	private String currentDriverId = null;
	private Double engineTemperature = null;
	private String ignitionState = null;
	private String engineOverHeatState = null;
	private String lowBatteryState = null;
	private String obdLowBatteryState = null;
	private Double batteryLevel = null;
	private Integer airFlow = null;
	private Double atmoshericPressure = null;
	private Integer engineLoad = null;
	private String gpsStatus = null;
	private Integer intakeAirTemperature = null;
	private Double oilPressure = null;
	private Integer rpm = null;
	private Integer trottlePosition = null;
	private Double batteryVoltage = null;
	private Double intakeTubeAbsolutePressure = null;
	private Integer numberOfDTC = null;
	private Long lastEngineStarted = null;
	private Long lastEngineStopped = null;
	private String timeZone = null;
	private String fuel_type = null;
	private Double start_reading = null;
	private String grid_state = null;
	private Integer timing_advance = null;
	private Integer manifoldABSPressure = null;
	private Long start_time = null;
	private Double current_fuel_consumption = null;
	private Double fuel_calibration_factor = null;
	private String lowFuelState = null;
	private Long lowFuelStateEnterTime = null;
	private String lowOilPressureState = null;
	private String overSpeedState = null;
	private String starterTriggered = null;
	private String waterInFuel = null;
	private String remoteControl = null;
	private String test = null;
	private String tempered = null;
	private String featureEngineMonitoring = null;
	private String featureTracking = null;
	private String currentRouteId = null;
	private String lastStopageId = null;
	private Long sittingCapacity = null;
	private String insuranceExpiry = null;
	private String pollutionCertificateExpiry = null;
	private String vehicleFitnessExpiry = null;
	private String lastService = null;
	private String current_route_name = null;
	private String current_route_schedule = null;
	private String last_stopage_name = null;
	private Long last_stopage_reached_time = null;
	private Long critical_alerts = null;
	private Long major_alerts = null;
	private Long wanring_alerts = null;
	private Long minor_alerts = null;
	private Double cost = null;
	private String cost_unit = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_THRESHOLD_TEMPLETE_ID = "threshold_templete_id";
	public static String FIELD_THRESHOLD_TEMPLETE_NAME = "threshold_templete_name";
	public static String FIELD_CONTROLLER_NAME = "controller_name";
	public static String FIELD_CONTROLLER_ID = "controller_id";
	public static String FIELD_CONTROLLER_PORT = "controller_port";
	public static String FIELD_IMEI = "imei";
	public static String FIELD_VIN = "vin";
	public static String FIELD_MAKE_ID = "make_id";
	public static String FIELD_MAKE_NAME = "make_name";
	public static String FIELD_MODEL_ID = "model_id";
	public static String FIELD_MODEL_NAME = "model_name";
	public static String FIELD_POWER_RATING = "power_rating";
	public static String FIELD_TYPE = "type";
	public static String FIELD_SUB_TYPE = "sub_type";
	public static String FIELD_APPLAINCE_TYPE_ID = "applaince_type_id";
	public static String FIELD_CONSUMER_ID = "consumer_id";
	public static String FIELD_MANAGER = "manager";
	public static String FIELD_MODEL = "model";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_LOCATION_NAME = "location_name";
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
	public static String FIELD_THRESHOLD_OVER_SPEED = "threshold_over_speed";
	public static String FIELD_CAPACITY = "capacity";
	public static String FIELD_MAINTAINACE_RUN_HOUR = "maintainace_run_hour";
	public static String FIELD_TODAY_RUN_TIME = "today_run_time";
	public static String FIELD_TODAY_FUEL_CONSUMPTION = "today_fuel_consumption";
	public static String FIELD_AVERAGE_FUEL_CONSUMPTION = "average_fuel_consumption";
	public static String FIELD_TODAY_FUEL_LOSS = "today_fuel_loss";
	public static String FIELD_CURRENT_MONTH_RUN_TIME = "current_month_run_time";
	public static String FIELD_CURRENT_MONTH_FUEL_CONSUMPTION = "current_month_fuel_consumption";
	public static String FIELD_CURRENT_MONTH_FUEL_LOSS = "current_month_fuel_loss";
	public static String FIELD_THRESHOLD_TEMPERATURE_MIN_LEVEL = "threshold_temperature_min_level";
	public static String FIELD_THRESHOLD_TEMPERATURE_MAX_LEVEL = "threshold_temperature_max_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MIN_LEVEL = "threshold_voltage_min_level";
	public static String FIELD_THRESHOLD_VOLTAGE_MAX_LEVEL = "threshold_voltage_max_level";
	public static String FIELD_THRESHOLD_CURRENT_MIN_LEVEL = "threshold_current_min_level";
	public static String FIELD_THRESHOLD_CURRENT_MAX_LEVEL = "threshold_current_max_level";
	public static String FIELD_THRESHOLD_DURATION = "threshold_duration";
	public static String FIELD_ALERT_DG_GRID_ON = "alert_dg_grid_on";
	public static String FIELD_ALERT_DG_GRID_OFF = "alert_dg_grid_off";
	public static String FIELD_ASSET_ID = "asset_id";
	public static String FIELD_PARTNER_ID = "partner_id";
	public static String FIELD_TENENT_ID = "tenent_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
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
	public static String FIELD_LAST_GRID_READING_UPDATED = "last_grid_reading_updated";
	public static String FIELD_LAST_DG_READING_UPDATED = "last_dg_reading_updated";
	public static String FIELD_DG_READING = "dg_reading";
	public static String FIELD_GRID_READING = "grid_reading";
	public static String FIELD_VOLTAGE = "voltage";
	public static String FIELD_CURRENT = "current";
	public static String FIELD_POWER = "power";
	public static String FIELD_ENERGY = "energy";
	public static String FIELD_GRID_READING_KVAH = "grid_reading_kvah";
	public static String FIELD_GRID_READING_KWH = "grid_reading_kwh";
	public static String FIELD_GRID_TODAY_KWH = "grid_today_kwh";
	public static String FIELD_GRID_CURRENT_MONTH_KWH = "grid_current_month_kwh";
	public static String FIELD_GRID_TODAY_KVAH = "grid_today_kvah";
	public static String FIELD_GRID_CURRENT_MONTH_KVAH = "grid_current_month_kvah";
	public static String FIELD_GRID_LOAD_KVA = "grid_load_kva";
	public static String FIELD_GRID_LOAD_KW = "grid_load_kw";
	public static String FIELD_GRID_VOLTAGE = "grid_voltage";
	public static String FIELD_GRID_CURRENT = "grid_current";
	public static String FIELD_GRID_PF = "grid_pf";
	public static String FIELD_GRID_MD = "grid_md";
	public static String FIELD_GRID_TDH = "grid_tdh";
	public static String FIELD_GRID_KVARH = "grid_kvarh";
	public static String FIELD_GRID_FREQUENCY = "grid_frequency";
	public static String FIELD_GRID_P1_READING_KVAH = "grid_p1_reading_kvah";
	public static String FIELD_GRID_P1_READING_KWH = "grid_p1_reading_kwh";
	public static String FIELD_GRID_P1_LOAD_KVA = "grid_p1_load_kva";
	public static String FIELD_GRID_P1_LOAD_KW = "grid_p1_load_kw";
	public static String FIELD_GRID_P1_VOLTAGE = "grid_p1_voltage";
	public static String FIELD_GRID_P1_CURRENT = "grid_p1_current";
	public static String FIELD_GRID_P1_PF = "grid_p1_pf";
	public static String FIELD_GRID_P1_MD = "grid_p1_md";
	public static String FIELD_GRID_P1_TDH = "grid_p1_tdh";
	public static String FIELD_GRID_P1_KVARH = "grid_p1_kvarh";
	public static String FIELD_GRID_P1_FREQUENCY = "grid_p1_frequency";
	public static String FIELD_GRID_P2_READING_KVAH = "grid_p2_reading_kvah";
	public static String FIELD_GRID_P2_READING_KWH = "grid_p2_reading_kwh";
	public static String FIELD_GRID_P2_LOAD_KVA = "grid_p2_load_kva";
	public static String FIELD_GRID_P2_LOAD_KW = "grid_p2_load_kw";
	public static String FIELD_GRID_P2_VOLTAGE = "grid_p2_voltage";
	public static String FIELD_GRID_P2_CURRENT = "grid_p2_current";
	public static String FIELD_GRID_P2_PF = "grid_p2_pf";
	public static String FIELD_GRID_P2_MD = "grid_p2_md";
	public static String FIELD_GRID_P2_TDH = "grid_p2_tdh";
	public static String FIELD_GRID_P2_KVARH = "grid_p2_kvarh";
	public static String FIELD_GRID_P2_FREQUENCY = "grid_p2_frequency";
	public static String FIELD_GRID_P3_READING_KVAH = "grid_p3_reading_kvah";
	public static String FIELD_GRID_P3_READING_KWH = "grid_p3_reading_kwh";
	public static String FIELD_GRID_P3_LOAD_KVA = "grid_p3_load_kva";
	public static String FIELD_GRID_P3_LOAD_KW = "grid_p3_load_kw";
	public static String FIELD_GRID_P3_VOLTAGE = "grid_p3_voltage";
	public static String FIELD_GRID_P3_CURRENT = "grid_p3_current";
	public static String FIELD_GRID_P3_PF = "grid_p3_pf";
	public static String FIELD_GRID_P3_MD = "grid_p3_md";
	public static String FIELD_GRID_P3_TDH = "grid_p3_tdh";
	public static String FIELD_GRID_P3_KVARH = "grid_p3_kvarh";
	public static String FIELD_GRID_P3_FREQUENCY = "grid_p3_frequency";
	public static String FIELD_DG_READING_KWH = "dg_reading_kwh";
	public static String FIELD_DG_READING_KVAH = "dg_reading_kvah";
	public static String FIELD_DG_TODAY_KWH = "dg_today_kwh";
	public static String FIELD_DG_CURRENT_MONTH_KWH = "dg_current_month_kwh";
	public static String FIELD_DG_TODAY_KVAH = "dg_today_kvah";
	public static String FIELD_DG_CURRENT_MONTH_KVAH = "dg_current_month_kvah";
	public static String FIELD_DG_LOAD_KW = "dg_load_kw";
	public static String FIELD_DG_LOAD_KVA = "dg_load_kva";
	public static String FIELD_DG_VOLTAGE = "dg_voltage";
	public static String FIELD_DG_CURRENT = "dg_current";
	public static String FIELD_DG_PF = "dg_pf";
	public static String FIELD_DG_MD = "dg_md";
	public static String FIELD_DG_TDH = "dg_tdh";
	public static String FIELD_DG_KVARH = "dg_kvarh";
	public static String FIELD_DG_FREQUENCY = "dg_frequency";
	public static String FIELD_DG_P1_READING_KVAH = "dg_p1_reading_kvah";
	public static String FIELD_DG_P1_READING_KWH = "dg_p1_reading_kwh";
	public static String FIELD_DG_P1_LOAD_KVA = "dg_p1_load_kva";
	public static String FIELD_DG_P1_LOAD_KW = "dg_p1_load_kw";
	public static String FIELD_DG_P1_VOLTAGE = "dg_p1_voltage";
	public static String FIELD_DG_P1_CURRENT = "dg_p1_current";
	public static String FIELD_DG_P1_PF = "dg_p1_pf";
	public static String FIELD_DG_P1_MD = "dg_p1_md";
	public static String FIELD_DG_P1_TDH = "dg_p1_tdh";
	public static String FIELD_DG_P1_KVARH = "dg_p1_kvarh";
	public static String FIELD_DG_P1_FREQUENCY = "dg_p1_frequency";
	public static String FIELD_DG_P2_READING_KVAH = "dg_p2_reading_kvah";
	public static String FIELD_DG_P2_READING_KWH = "dg_p2_reading_kwh";
	public static String FIELD_DG_P2_LOAD_KVA = "dg_p2_load_kva";
	public static String FIELD_DG_P2_LOAD_KW = "dg_p2_load_kw";
	public static String FIELD_DG_P2_VOLTAGE = "dg_p2_voltage";
	public static String FIELD_DG_P2_CURRENT = "dg_p2_current";
	public static String FIELD_DG_P2_PF = "dg_p2_pf";
	public static String FIELD_DG_P2_MD = "dg_p2_md";
	public static String FIELD_DG_P2_TDH = "dg_p2_tdh";
	public static String FIELD_DG_P2_KVARH = "dg_p2_kvarh";
	public static String FIELD_DG_P2_FREQUENCY = "dg_p2_frequency";
	public static String FIELD_DG_P3_READING_KVAH = "dg_p3_reading_kvah";
	public static String FIELD_DG_P3_READING_KWH = "dg_p3_reading_kwh";
	public static String FIELD_DG_P3_LOAD_KVA = "dg_p3_load_kva";
	public static String FIELD_DG_P3_LOAD_KW = "dg_p3_load_kw";
	public static String FIELD_DG_P3_VOLTAGE = "dg_p3_voltage";
	public static String FIELD_DG_P3_CURRENT = "dg_p3_current";
	public static String FIELD_DG_P3_PF = "dg_p3_pf";
	public static String FIELD_DG_P3_MD = "dg_p3_md";
	public static String FIELD_DG_P3_TDH = "dg_p3_tdh";
	public static String FIELD_DG_P3_KVARH = "dg_p3_kvarh";
	public static String FIELD_DG_P3_FREQUENCY = "dg_p3_frequency";
	public static String FIELD_TEMPERATURE = "temperature";
	public static String FIELD_HUMIDITY = "humidity";
	public static String FIELD_MODE = "mode";
	public static String FIELD_LEVEL = "level";
	public static String FIELD_LEVEL_FLOAT = "level_float";
	public static String FIELD_FUEL_LEVEL = "fuel_level";
	public static String FIELD_FUEL_QUANTITY = "fuel_quantity";
	public static String FIELD_STATE = "state";
	public static String FIELD_MAINTAINCE_MODE = "maintaince_mode";
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
	public static String FIELD_HIGH_COOLANT_TEMPERATURE = "high_coolant_temperature";
	public static String FIELD_CANOPY_TEMPERATURE = "canopy_temperature";
	public static String FIELD_COOLANT_TEMPERATURE = "coolant_temperature";
	public static String FIELD_HIGH_CANOPY_TEMPERATURE = "high_canopy_temperature";
	public static String FIELD_LASTPROCESSEDSTATE = "lastProcessedState";
	public static String FIELD_LASTPROCESSEDTIME = "lastProcessedTime";
	public static String FIELD_CHARGING_STATE = "charging_state";
	public static String FIELD_LAST_PROCESSED_FUEL_QUANTITY = "last_processed_fuel_quantity";
	public static String FIELD_LAST_PROCESSED_DB_READING = "last_processed_db_reading";
	public static String FIELD_LAST_PROCESSED_GRID_READING = "last_processed_grid_reading";
	public static String FIELD_LANGITUDE = "langitude";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_SPEED = "speed";
	public static String FIELD_DRIVETYPE = "driveType";
	public static String FIELD_CURRENTDRIVERID = "currentDriverId";
	public static String FIELD_ENGINETEMPERATURE = "engineTemperature";
	public static String FIELD_IGNITIONSTATE = "ignitionState";
	public static String FIELD_ENGINEOVERHEATSTATE = "engineOverHeatState";
	public static String FIELD_LOWBATTERYSTATE = "lowBatteryState";
	public static String FIELD_OBDLOWBATTERYSTATE = "obdLowBatteryState";
	public static String FIELD_BATTERYLEVEL = "batteryLevel";
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
	public static String FIELD_LASTENGINESTARTED = "lastEngineStarted";
	public static String FIELD_LASTENGINESTOPPED = "lastEngineStopped";
	public static String FIELD_TIMEZONE = "timeZone";
	public static String FIELD_FUEL_TYPE = "fuel_type";
	public static String FIELD_START_READING = "start_reading";
	public static String FIELD_GRID_STATE = "grid_state";
	public static String FIELD_TIMING_ADVANCE = "timing_advance";
	public static String FIELD_MANIFOLDABSPRESSURE = "manifoldABSPressure";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_CURRENT_FUEL_CONSUMPTION = "current_fuel_consumption";
	public static String FIELD_FUEL_CALIBRATION_FACTOR = "fuel_calibration_factor";
	public static String FIELD_LOWFUELSTATE = "lowFuelState";
	public static String FIELD_LOWFUELSTATEENTERTIME = "lowFuelStateEnterTime";
	public static String FIELD_LOWOILPRESSURESTATE = "lowOilPressureState";
	public static String FIELD_OVERSPEEDSTATE = "overSpeedState";
	public static String FIELD_STARTERTRIGGERED = "starterTriggered";
	public static String FIELD_WATERINFUEL = "waterInFuel";
	public static String FIELD_REMOTECONTROL = "remoteControl";
	public static String FIELD_TEST = "test";
	public static String FIELD_TEMPERED = "tempered";
	public static String FIELD_FEATUREENGINEMONITORING = "featureEngineMonitoring";
	public static String FIELD_FEATURETRACKING = "featureTracking";
	public static String FIELD_CURRENTROUTEID = "currentRouteId";
	public static String FIELD_LASTSTOPAGEID = "lastStopageId";
	public static String FIELD_SITTINGCAPACITY = "sittingCapacity";
	public static String FIELD_INSURANCEEXPIRY = "insuranceExpiry";
	public static String FIELD_POLLUTIONCERTIFICATEEXPIRY = "pollutionCertificateExpiry";
	public static String FIELD_VEHICLEFITNESSEXPIRY = "vehicleFitnessExpiry";
	public static String FIELD_LASTSERVICE = "lastService";
	public static String FIELD_CURRENT_ROUTE_NAME = "current_route_name";
	public static String FIELD_CURRENT_ROUTE_SCHEDULE = "current_route_schedule";
	public static String FIELD_LAST_STOPAGE_NAME = "last_stopage_name";
	public static String FIELD_LAST_STOPAGE_REACHED_TIME = "last_stopage_reached_time";
	public static String FIELD_CRITICAL_ALERTS = "critical_alerts";
	public static String FIELD_MAJOR_ALERTS = "major_alerts";
	public static String FIELD_WANRING_ALERTS = "wanring_alerts";
	public static String FIELD_MINOR_ALERTS = "minor_alerts";
	public static String FIELD_COST = "cost";
	public static String FIELD_COST_UNIT = "cost_unit";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance");

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

		Field threshold_templete_idField = new Field("threshold_templete_id", "String");
		threshold_templete_idField.setLength(128);
		metaData.addField(threshold_templete_idField);

		Field threshold_templete_nameField = new Field("threshold_templete_name", "String");
		threshold_templete_nameField.setLength(128);
		metaData.addField(threshold_templete_nameField);

		Field controller_nameField = new Field("controller_name", "String");
		controller_nameField.setLength(128);
		metaData.addField(controller_nameField);

		Field controller_idField = new Field("controller_id", "String");
		controller_idField.setLength(128);
		metaData.addField(controller_idField);

		Field controller_portField = new Field("controller_port", "long");
		metaData.addField(controller_portField);

		Field imeiField = new Field("imei", "String");
		imeiField.setIndexed(true);
		imeiField.setLength(16);
		metaData.addField(imeiField);

		Field vinField = new Field("vin", "String");
		vinField.setLength(32);
		metaData.addField(vinField);

		Field make_idField = new Field("make_id", "String");
		make_idField.setLength(128);
		metaData.addField(make_idField);

		Field model_idField = new Field("model_id", "String");
		model_idField.setLength(128);
		metaData.addField(model_idField);

		Field power_ratingField = new Field("power_rating", "double");
		power_ratingField.setDefaultValue(0.0000);
		power_ratingField.setLength(16);
		power_ratingField.setPrecision(4);
		metaData.addField(power_ratingField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field sub_typeField = new Field("sub_type", "String");
		sub_typeField.setLength(32);
		metaData.addField(sub_typeField);

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

		Field location_nameField = new Field("location_name", "String");
		location_nameField.setLength(128);
		metaData.addField(location_nameField);

		Field sub_location_idField = new Field("sub_location_id", "String");
		sub_location_idField.setLength(128);
		metaData.addField(sub_location_idField);

		Field site_idField = new Field("site_id", "String");
		site_idField.setLength(128);
		metaData.addField(site_idField);

		Field tank_idField = new Field("tank_id", "String");
		tank_idField.setLength(128);
		metaData.addField(tank_idField);

		Field dg_unit_openingField = new Field("dg_unit_opening", "double");
		dg_unit_openingField.setDefaultValue(0.0000);
		dg_unit_openingField.setLength(12);
		dg_unit_openingField.setPrecision(4);
		metaData.addField(dg_unit_openingField);

		Field dg_unit_consumedField = new Field("dg_unit_consumed", "double");
		dg_unit_consumedField.setDefaultValue(0.0000);
		dg_unit_consumedField.setLength(12);
		dg_unit_consumedField.setPrecision(4);
		metaData.addField(dg_unit_consumedField);

		Field dg_unit_closingField = new Field("dg_unit_closing", "double");
		dg_unit_closingField.setDefaultValue(0.0000);
		dg_unit_closingField.setLength(12);
		dg_unit_closingField.setPrecision(4);
		metaData.addField(dg_unit_closingField);

		Field grid_unit_openingField = new Field("grid_unit_opening", "double");
		grid_unit_openingField.setDefaultValue(0.0000);
		grid_unit_openingField.setLength(12);
		grid_unit_openingField.setPrecision(4);
		metaData.addField(grid_unit_openingField);

		Field grid_unit_consumedField = new Field("grid_unit_consumed", "double");
		grid_unit_consumedField.setDefaultValue(0.0000);
		grid_unit_consumedField.setLength(12);
		grid_unit_consumedField.setPrecision(4);
		metaData.addField(grid_unit_consumedField);

		Field grid_unit_closingField = new Field("grid_unit_closing", "double");
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

		Field threshold_fuel_levelField = new Field("threshold_fuel_level", "double");
		threshold_fuel_levelField.setDefaultValue(0.0);
		threshold_fuel_levelField.setLength(10);
		threshold_fuel_levelField.setPrecision(2);
		metaData.addField(threshold_fuel_levelField);

		Field threshold_over_speedField = new Field("threshold_over_speed", "int");
		metaData.addField(threshold_over_speedField);

		Field capacityField = new Field("capacity", "double");
		capacityField.setDefaultValue(0.0);
		capacityField.setLength(10);
		capacityField.setPrecision(2);
		metaData.addField(capacityField);

		Field maintainace_run_hourField = new Field("maintainace_run_hour", "int");
		maintainace_run_hourField.setLength(10);
		metaData.addField(maintainace_run_hourField);

		Field today_run_timeField = new Field("today_run_time", "int");
		today_run_timeField.setLength(20);
		metaData.addField(today_run_timeField);

		Field today_fuel_consumptionField = new Field("today_fuel_consumption", "double");
		today_fuel_consumptionField.setDefaultValue(0.00);
		today_fuel_consumptionField.setLength(20);
		today_fuel_consumptionField.setPrecision(4);
		metaData.addField(today_fuel_consumptionField);

		Field average_fuel_consumptionField = new Field("average_fuel_consumption", "double");
		average_fuel_consumptionField.setDefaultValue(0.00);
		average_fuel_consumptionField.setLength(20);
		average_fuel_consumptionField.setPrecision(4);
		metaData.addField(average_fuel_consumptionField);

		Field today_fuel_lossField = new Field("today_fuel_loss", "double");
		today_fuel_lossField.setDefaultValue(0.00);
		today_fuel_lossField.setLength(20);
		today_fuel_lossField.setPrecision(4);
		metaData.addField(today_fuel_lossField);

		Field current_month_run_timeField = new Field("current_month_run_time", "int");
		current_month_run_timeField.setLength(20);
		metaData.addField(current_month_run_timeField);

		Field current_month_fuel_consumptionField = new Field("current_month_fuel_consumption", "double");
		current_month_fuel_consumptionField.setDefaultValue(0.00);
		current_month_fuel_consumptionField.setLength(20);
		current_month_fuel_consumptionField.setPrecision(4);
		metaData.addField(current_month_fuel_consumptionField);

		Field current_month_fuel_lossField = new Field("current_month_fuel_loss", "double");
		current_month_fuel_lossField.setDefaultValue(0.00);
		current_month_fuel_lossField.setLength(20);
		current_month_fuel_lossField.setPrecision(4);
		metaData.addField(current_month_fuel_lossField);

		Field threshold_temperature_min_levelField = new Field("threshold_temperature_min_level", "double");
		threshold_temperature_min_levelField.setDefaultValue(0.00);
		threshold_temperature_min_levelField.setLength(10);
		threshold_temperature_min_levelField.setPrecision(2);
		metaData.addField(threshold_temperature_min_levelField);

		Field threshold_temperature_max_levelField = new Field("threshold_temperature_max_level", "double");
		threshold_temperature_max_levelField.setDefaultValue(0.00);
		threshold_temperature_max_levelField.setLength(10);
		threshold_temperature_max_levelField.setPrecision(2);
		metaData.addField(threshold_temperature_max_levelField);

		Field threshold_voltage_min_levelField = new Field("threshold_voltage_min_level", "double");
		threshold_voltage_min_levelField.setDefaultValue(0.00);
		threshold_voltage_min_levelField.setLength(10);
		metaData.addField(threshold_voltage_min_levelField);

		Field threshold_voltage_max_levelField = new Field("threshold_voltage_max_level", "double");
		threshold_voltage_max_levelField.setDefaultValue(0.00);
		threshold_voltage_max_levelField.setLength(10);
		metaData.addField(threshold_voltage_max_levelField);

		Field threshold_current_min_levelField = new Field("threshold_current_min_level", "double");
		threshold_current_min_levelField.setDefaultValue(0.00);
		threshold_current_min_levelField.setLength(10);
		metaData.addField(threshold_current_min_levelField);

		Field threshold_current_max_levelField = new Field("threshold_current_max_level", "double");
		threshold_current_max_levelField.setDefaultValue(0.00);
		threshold_current_max_levelField.setLength(10);
		metaData.addField(threshold_current_max_levelField);

		Field threshold_durationField = new Field("threshold_duration", "double");
		threshold_durationField.setDefaultValue(0.00);
		threshold_durationField.setLength(10);
		metaData.addField(threshold_durationField);

		Field alert_dg_grid_onField = new Field("alert_dg_grid_on", "String");
		alert_dg_grid_onField.setLength(1);
		metaData.addField(alert_dg_grid_onField);

		Field alert_dg_grid_offField = new Field("alert_dg_grid_off", "String");
		alert_dg_grid_offField.setLength(1);
		metaData.addField(alert_dg_grid_offField);

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

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field ex_typeField = new Field("ex_type", "String");
		ex_typeField.setDefaultValue("ENABLED");
		ex_typeField.setLength(16);
		metaData.addField(ex_typeField);

		Field interface_typeField = new Field("interface_type", "String");
		interface_typeField.setLength(32);
		metaData.addField(interface_typeField);

		Field battery_numberField = new Field("battery_number", "int");
		battery_numberField.setDefaultValue(0);
		battery_numberField.setLength(3);
		metaData.addField(battery_numberField);

		Field number_of_batteriesField = new Field("number_of_batteries", "int");
		number_of_batteriesField.setDefaultValue(0);
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
		battery_levelField.setDefaultValue(0);
		battery_levelField.setLength(3);
		metaData.addField(battery_levelField);

		Field last_readingField = new Field("last_reading", "double");
		last_readingField.setDefaultValue(0.0000);
		last_readingField.setLength(16);
		last_readingField.setPrecision(4);
		metaData.addField(last_readingField);

		Field last_reading_updatedField = new Field("last_reading_updated", "timestamp");
		last_reading_updatedField.setRequired(true);
		last_reading_updatedField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(last_reading_updatedField);

		Field last_grid_reading_updatedField = new Field("last_grid_reading_updated", "timestamp");
		last_grid_reading_updatedField.setRequired(true);
		last_grid_reading_updatedField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(last_grid_reading_updatedField);

		Field last_dg_reading_updatedField = new Field("last_dg_reading_updated", "timestamp");
		last_dg_reading_updatedField.setRequired(true);
		last_dg_reading_updatedField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(last_dg_reading_updatedField);

		Field dg_readingField = new Field("dg_reading", "double");
		dg_readingField.setDefaultValue(0.0000);
		dg_readingField.setLength(12);
		dg_readingField.setPrecision(4);
		metaData.addField(dg_readingField);

		Field grid_readingField = new Field("grid_reading", "double");
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

		Field powerField = new Field("power", "double");
		powerField.setDefaultValue(0.0000);
		powerField.setLength(16);
		powerField.setPrecision(4);
		metaData.addField(powerField);

		Field energyField = new Field("energy", "double");
		energyField.setDefaultValue(0.0000);
		energyField.setLength(16);
		energyField.setPrecision(4);
		metaData.addField(energyField);

		Field grid_reading_kvahField = new Field("grid_reading_kvah", "double");
		grid_reading_kvahField.setDefaultValue(0.0000);
		grid_reading_kvahField.setLength(12);
		grid_reading_kvahField.setPrecision(4);
		metaData.addField(grid_reading_kvahField);

		Field grid_reading_kwhField = new Field("grid_reading_kwh", "double");
		grid_reading_kwhField.setDefaultValue(0.0000);
		grid_reading_kwhField.setLength(12);
		grid_reading_kwhField.setPrecision(4);
		metaData.addField(grid_reading_kwhField);

		Field grid_today_kwhField = new Field("grid_today_kwh", "double");
		grid_today_kwhField.setDefaultValue(0.0000);
		grid_today_kwhField.setLength(12);
		grid_today_kwhField.setPrecision(4);
		metaData.addField(grid_today_kwhField);

		Field grid_current_month_kwhField = new Field("grid_current_month_kwh", "double");
		grid_current_month_kwhField.setDefaultValue(0.0000);
		grid_current_month_kwhField.setLength(12);
		grid_current_month_kwhField.setPrecision(4);
		metaData.addField(grid_current_month_kwhField);

		Field grid_today_kvahField = new Field("grid_today_kvah", "double");
		grid_today_kvahField.setDefaultValue(0.0000);
		grid_today_kvahField.setLength(12);
		grid_today_kvahField.setPrecision(4);
		metaData.addField(grid_today_kvahField);

		Field grid_current_month_kvahField = new Field("grid_current_month_kvah", "double");
		grid_current_month_kvahField.setDefaultValue(0.0000);
		grid_current_month_kvahField.setLength(12);
		grid_current_month_kvahField.setPrecision(4);
		metaData.addField(grid_current_month_kvahField);

		Field grid_load_kvaField = new Field("grid_load_kva", "double");
		grid_load_kvaField.setDefaultValue(0.0000);
		grid_load_kvaField.setLength(12);
		grid_load_kvaField.setPrecision(4);
		metaData.addField(grid_load_kvaField);

		Field grid_load_kwField = new Field("grid_load_kw", "double");
		grid_load_kwField.setDefaultValue(0.0000);
		grid_load_kwField.setLength(12);
		grid_load_kwField.setPrecision(4);
		metaData.addField(grid_load_kwField);

		Field grid_voltageField = new Field("grid_voltage", "double");
		grid_voltageField.setDefaultValue(0.00);
		grid_voltageField.setLength(12);
		grid_voltageField.setPrecision(4);
		metaData.addField(grid_voltageField);

		Field grid_currentField = new Field("grid_current", "double");
		grid_currentField.setDefaultValue(0.00);
		grid_currentField.setLength(12);
		grid_currentField.setPrecision(4);
		metaData.addField(grid_currentField);

		Field grid_pfField = new Field("grid_pf", "double");
		grid_pfField.setDefaultValue(0.0000);
		grid_pfField.setLength(12);
		grid_pfField.setPrecision(4);
		metaData.addField(grid_pfField);

		Field grid_mdField = new Field("grid_md", "double");
		grid_mdField.setDefaultValue(0.0000);
		grid_mdField.setLength(12);
		grid_mdField.setPrecision(4);
		metaData.addField(grid_mdField);

		Field grid_tdhField = new Field("grid_tdh", "double");
		grid_tdhField.setDefaultValue(0.0000);
		grid_tdhField.setLength(12);
		grid_tdhField.setPrecision(4);
		metaData.addField(grid_tdhField);

		Field grid_kvarhField = new Field("grid_kvarh", "double");
		grid_kvarhField.setDefaultValue(0.0000);
		grid_kvarhField.setLength(12);
		grid_kvarhField.setPrecision(4);
		metaData.addField(grid_kvarhField);

		Field grid_frequencyField = new Field("grid_frequency", "long");
		grid_frequencyField.setDefaultValue(0L);
		metaData.addField(grid_frequencyField);

		Field grid_p1_reading_kvahField = new Field("grid_p1_reading_kvah", "double");
		grid_p1_reading_kvahField.setDefaultValue(0.0000);
		grid_p1_reading_kvahField.setLength(12);
		grid_p1_reading_kvahField.setPrecision(4);
		metaData.addField(grid_p1_reading_kvahField);

		Field grid_p1_reading_kwhField = new Field("grid_p1_reading_kwh", "double");
		grid_p1_reading_kwhField.setDefaultValue(0.0000);
		grid_p1_reading_kwhField.setLength(12);
		grid_p1_reading_kwhField.setPrecision(4);
		metaData.addField(grid_p1_reading_kwhField);

		Field grid_p1_load_kvaField = new Field("grid_p1_load_kva", "double");
		grid_p1_load_kvaField.setDefaultValue(0.0000);
		grid_p1_load_kvaField.setLength(12);
		grid_p1_load_kvaField.setPrecision(4);
		metaData.addField(grid_p1_load_kvaField);

		Field grid_p1_load_kwField = new Field("grid_p1_load_kw", "double");
		grid_p1_load_kwField.setDefaultValue(0.0000);
		grid_p1_load_kwField.setLength(12);
		grid_p1_load_kwField.setPrecision(4);
		metaData.addField(grid_p1_load_kwField);

		Field grid_p1_voltageField = new Field("grid_p1_voltage", "double");
		grid_p1_voltageField.setDefaultValue(0.0000);
		grid_p1_voltageField.setLength(12);
		grid_p1_voltageField.setPrecision(4);
		metaData.addField(grid_p1_voltageField);

		Field grid_p1_currentField = new Field("grid_p1_current", "double");
		grid_p1_currentField.setDefaultValue(0.0000);
		grid_p1_currentField.setLength(12);
		grid_p1_currentField.setPrecision(4);
		metaData.addField(grid_p1_currentField);

		Field grid_p1_pfField = new Field("grid_p1_pf", "double");
		grid_p1_pfField.setDefaultValue(0.0000);
		grid_p1_pfField.setLength(12);
		grid_p1_pfField.setPrecision(4);
		metaData.addField(grid_p1_pfField);

		Field grid_p1_mdField = new Field("grid_p1_md", "double");
		grid_p1_mdField.setDefaultValue(0.0000);
		grid_p1_mdField.setLength(12);
		grid_p1_mdField.setPrecision(4);
		metaData.addField(grid_p1_mdField);

		Field grid_p1_tdhField = new Field("grid_p1_tdh", "double");
		grid_p1_tdhField.setDefaultValue(0.0000);
		grid_p1_tdhField.setLength(12);
		grid_p1_tdhField.setPrecision(4);
		metaData.addField(grid_p1_tdhField);

		Field grid_p1_kvarhField = new Field("grid_p1_kvarh", "double");
		grid_p1_kvarhField.setDefaultValue(0.0000);
		grid_p1_kvarhField.setLength(12);
		grid_p1_kvarhField.setPrecision(4);
		metaData.addField(grid_p1_kvarhField);

		Field grid_p1_frequencyField = new Field("grid_p1_frequency", "double");
		grid_p1_frequencyField.setDefaultValue(0.0000);
		grid_p1_frequencyField.setLength(12);
		grid_p1_frequencyField.setPrecision(4);
		metaData.addField(grid_p1_frequencyField);

		Field grid_p2_reading_kvahField = new Field("grid_p2_reading_kvah", "double");
		grid_p2_reading_kvahField.setDefaultValue(0.0000);
		grid_p2_reading_kvahField.setLength(12);
		grid_p2_reading_kvahField.setPrecision(4);
		metaData.addField(grid_p2_reading_kvahField);

		Field grid_p2_reading_kwhField = new Field("grid_p2_reading_kwh", "double");
		grid_p2_reading_kwhField.setDefaultValue(0.0000);
		grid_p2_reading_kwhField.setLength(12);
		grid_p2_reading_kwhField.setPrecision(4);
		metaData.addField(grid_p2_reading_kwhField);

		Field grid_p2_load_kvaField = new Field("grid_p2_load_kva", "double");
		grid_p2_load_kvaField.setDefaultValue(0.0000);
		grid_p2_load_kvaField.setLength(12);
		grid_p2_load_kvaField.setPrecision(4);
		metaData.addField(grid_p2_load_kvaField);

		Field grid_p2_load_kwField = new Field("grid_p2_load_kw", "double");
		grid_p2_load_kwField.setDefaultValue(0.0000);
		grid_p2_load_kwField.setLength(12);
		grid_p2_load_kwField.setPrecision(4);
		metaData.addField(grid_p2_load_kwField);

		Field grid_p2_voltageField = new Field("grid_p2_voltage", "double");
		grid_p2_voltageField.setDefaultValue(0.0000);
		grid_p2_voltageField.setLength(12);
		grid_p2_voltageField.setPrecision(4);
		metaData.addField(grid_p2_voltageField);

		Field grid_p2_currentField = new Field("grid_p2_current", "double");
		grid_p2_currentField.setDefaultValue(0.0000);
		grid_p2_currentField.setLength(12);
		grid_p2_currentField.setPrecision(4);
		metaData.addField(grid_p2_currentField);

		Field grid_p2_pfField = new Field("grid_p2_pf", "double");
		grid_p2_pfField.setDefaultValue(0.0000);
		grid_p2_pfField.setLength(12);
		grid_p2_pfField.setPrecision(4);
		metaData.addField(grid_p2_pfField);

		Field grid_p2_mdField = new Field("grid_p2_md", "double");
		grid_p2_mdField.setDefaultValue(0.0000);
		grid_p2_mdField.setLength(12);
		grid_p2_mdField.setPrecision(4);
		metaData.addField(grid_p2_mdField);

		Field grid_p2_tdhField = new Field("grid_p2_tdh", "double");
		grid_p2_tdhField.setDefaultValue(0.0000);
		grid_p2_tdhField.setLength(12);
		grid_p2_tdhField.setPrecision(4);
		metaData.addField(grid_p2_tdhField);

		Field grid_p2_kvarhField = new Field("grid_p2_kvarh", "double");
		grid_p2_kvarhField.setDefaultValue(0.0000);
		grid_p2_kvarhField.setLength(12);
		grid_p2_kvarhField.setPrecision(4);
		metaData.addField(grid_p2_kvarhField);

		Field grid_p2_frequencyField = new Field("grid_p2_frequency", "double");
		grid_p2_frequencyField.setDefaultValue(0.0000);
		grid_p2_frequencyField.setLength(12);
		grid_p2_frequencyField.setPrecision(4);
		metaData.addField(grid_p2_frequencyField);

		Field grid_p3_reading_kvahField = new Field("grid_p3_reading_kvah", "double");
		grid_p3_reading_kvahField.setDefaultValue(0.0000);
		grid_p3_reading_kvahField.setLength(12);
		grid_p3_reading_kvahField.setPrecision(4);
		metaData.addField(grid_p3_reading_kvahField);

		Field grid_p3_reading_kwhField = new Field("grid_p3_reading_kwh", "double");
		grid_p3_reading_kwhField.setDefaultValue(0.0000);
		grid_p3_reading_kwhField.setLength(12);
		grid_p3_reading_kwhField.setPrecision(4);
		metaData.addField(grid_p3_reading_kwhField);

		Field grid_p3_load_kvaField = new Field("grid_p3_load_kva", "double");
		grid_p3_load_kvaField.setDefaultValue(0.0000);
		grid_p3_load_kvaField.setLength(12);
		grid_p3_load_kvaField.setPrecision(4);
		metaData.addField(grid_p3_load_kvaField);

		Field grid_p3_load_kwField = new Field("grid_p3_load_kw", "double");
		grid_p3_load_kwField.setDefaultValue(0.0000);
		grid_p3_load_kwField.setLength(12);
		grid_p3_load_kwField.setPrecision(4);
		metaData.addField(grid_p3_load_kwField);

		Field grid_p3_voltageField = new Field("grid_p3_voltage", "double");
		grid_p3_voltageField.setDefaultValue(0.0000);
		grid_p3_voltageField.setLength(12);
		grid_p3_voltageField.setPrecision(4);
		metaData.addField(grid_p3_voltageField);

		Field grid_p3_currentField = new Field("grid_p3_current", "double");
		grid_p3_currentField.setDefaultValue(0.0000);
		grid_p3_currentField.setLength(12);
		grid_p3_currentField.setPrecision(4);
		metaData.addField(grid_p3_currentField);

		Field grid_p3_pfField = new Field("grid_p3_pf", "double");
		grid_p3_pfField.setDefaultValue(0.0000);
		grid_p3_pfField.setLength(12);
		grid_p3_pfField.setPrecision(4);
		metaData.addField(grid_p3_pfField);

		Field grid_p3_mdField = new Field("grid_p3_md", "double");
		grid_p3_mdField.setDefaultValue(0.0000);
		grid_p3_mdField.setLength(12);
		grid_p3_mdField.setPrecision(4);
		metaData.addField(grid_p3_mdField);

		Field grid_p3_tdhField = new Field("grid_p3_tdh", "double");
		grid_p3_tdhField.setDefaultValue(0.0000);
		grid_p3_tdhField.setLength(12);
		grid_p3_tdhField.setPrecision(4);
		metaData.addField(grid_p3_tdhField);

		Field grid_p3_kvarhField = new Field("grid_p3_kvarh", "double");
		grid_p3_kvarhField.setDefaultValue(0.0000);
		grid_p3_kvarhField.setLength(12);
		grid_p3_kvarhField.setPrecision(4);
		metaData.addField(grid_p3_kvarhField);

		Field grid_p3_frequencyField = new Field("grid_p3_frequency", "double");
		grid_p3_frequencyField.setDefaultValue(0.0000);
		grid_p3_frequencyField.setLength(12);
		grid_p3_frequencyField.setPrecision(4);
		metaData.addField(grid_p3_frequencyField);

		Field dg_reading_kwhField = new Field("dg_reading_kwh", "double");
		dg_reading_kwhField.setDefaultValue(0.0000);
		dg_reading_kwhField.setLength(12);
		dg_reading_kwhField.setPrecision(4);
		metaData.addField(dg_reading_kwhField);

		Field dg_reading_kvahField = new Field("dg_reading_kvah", "double");
		dg_reading_kvahField.setDefaultValue(0.0000);
		dg_reading_kvahField.setLength(12);
		dg_reading_kvahField.setPrecision(4);
		metaData.addField(dg_reading_kvahField);

		Field dg_today_kwhField = new Field("dg_today_kwh", "double");
		dg_today_kwhField.setDefaultValue(0.0000);
		dg_today_kwhField.setLength(12);
		dg_today_kwhField.setPrecision(4);
		metaData.addField(dg_today_kwhField);

		Field dg_current_month_kwhField = new Field("dg_current_month_kwh", "double");
		dg_current_month_kwhField.setDefaultValue(0.0000);
		dg_current_month_kwhField.setLength(12);
		dg_current_month_kwhField.setPrecision(4);
		metaData.addField(dg_current_month_kwhField);

		Field dg_today_kvahField = new Field("dg_today_kvah", "double");
		dg_today_kvahField.setDefaultValue(0.0000);
		dg_today_kvahField.setLength(12);
		dg_today_kvahField.setPrecision(4);
		metaData.addField(dg_today_kvahField);

		Field dg_current_month_kvahField = new Field("dg_current_month_kvah", "double");
		dg_current_month_kvahField.setDefaultValue(0.0000);
		dg_current_month_kvahField.setLength(12);
		dg_current_month_kvahField.setPrecision(4);
		metaData.addField(dg_current_month_kvahField);

		Field dg_load_kwField = new Field("dg_load_kw", "double");
		dg_load_kwField.setDefaultValue(0.0000);
		dg_load_kwField.setLength(12);
		dg_load_kwField.setPrecision(4);
		metaData.addField(dg_load_kwField);

		Field dg_load_kvaField = new Field("dg_load_kva", "double");
		dg_load_kvaField.setDefaultValue(0.0000);
		dg_load_kvaField.setLength(12);
		dg_load_kvaField.setPrecision(4);
		metaData.addField(dg_load_kvaField);

		Field dg_voltageField = new Field("dg_voltage", "double");
		dg_voltageField.setDefaultValue(0.0000);
		dg_voltageField.setLength(12);
		dg_voltageField.setPrecision(4);
		metaData.addField(dg_voltageField);

		Field dg_currentField = new Field("dg_current", "double");
		dg_currentField.setDefaultValue(0.0000);
		dg_currentField.setLength(12);
		dg_currentField.setPrecision(4);
		metaData.addField(dg_currentField);

		Field dg_pfField = new Field("dg_pf", "double");
		dg_pfField.setDefaultValue(0.0000);
		dg_pfField.setLength(12);
		dg_pfField.setPrecision(4);
		metaData.addField(dg_pfField);

		Field dg_mdField = new Field("dg_md", "double");
		dg_mdField.setDefaultValue(0.0000);
		dg_mdField.setLength(12);
		dg_mdField.setPrecision(4);
		metaData.addField(dg_mdField);

		Field dg_tdhField = new Field("dg_tdh", "double");
		dg_tdhField.setDefaultValue(0.0000);
		dg_tdhField.setLength(12);
		dg_tdhField.setPrecision(4);
		metaData.addField(dg_tdhField);

		Field dg_kvarhField = new Field("dg_kvarh", "double");
		dg_kvarhField.setDefaultValue(0.0000);
		dg_kvarhField.setLength(12);
		dg_kvarhField.setPrecision(4);
		metaData.addField(dg_kvarhField);

		Field dg_frequencyField = new Field("dg_frequency", "double");
		dg_frequencyField.setDefaultValue(0.0000);
		dg_frequencyField.setLength(12);
		dg_frequencyField.setPrecision(4);
		metaData.addField(dg_frequencyField);

		Field dg_p1_reading_kvahField = new Field("dg_p1_reading_kvah", "double");
		dg_p1_reading_kvahField.setDefaultValue(0.0000);
		dg_p1_reading_kvahField.setLength(12);
		dg_p1_reading_kvahField.setPrecision(4);
		metaData.addField(dg_p1_reading_kvahField);

		Field dg_p1_reading_kwhField = new Field("dg_p1_reading_kwh", "double");
		dg_p1_reading_kwhField.setDefaultValue(0.0000);
		dg_p1_reading_kwhField.setLength(12);
		dg_p1_reading_kwhField.setPrecision(4);
		metaData.addField(dg_p1_reading_kwhField);

		Field dg_p1_load_kvaField = new Field("dg_p1_load_kva", "double");
		dg_p1_load_kvaField.setDefaultValue(0.0000);
		dg_p1_load_kvaField.setLength(12);
		dg_p1_load_kvaField.setPrecision(4);
		metaData.addField(dg_p1_load_kvaField);

		Field dg_p1_load_kwField = new Field("dg_p1_load_kw", "double");
		dg_p1_load_kwField.setDefaultValue(0.0000);
		dg_p1_load_kwField.setLength(12);
		dg_p1_load_kwField.setPrecision(4);
		metaData.addField(dg_p1_load_kwField);

		Field dg_p1_voltageField = new Field("dg_p1_voltage", "double");
		dg_p1_voltageField.setDefaultValue(0.0000);
		dg_p1_voltageField.setLength(12);
		dg_p1_voltageField.setPrecision(4);
		metaData.addField(dg_p1_voltageField);

		Field dg_p1_currentField = new Field("dg_p1_current", "double");
		dg_p1_currentField.setDefaultValue(0.0000);
		dg_p1_currentField.setLength(12);
		dg_p1_currentField.setPrecision(4);
		metaData.addField(dg_p1_currentField);

		Field dg_p1_pfField = new Field("dg_p1_pf", "double");
		dg_p1_pfField.setDefaultValue(0.0000);
		dg_p1_pfField.setLength(12);
		dg_p1_pfField.setPrecision(4);
		metaData.addField(dg_p1_pfField);

		Field dg_p1_mdField = new Field("dg_p1_md", "double");
		dg_p1_mdField.setDefaultValue(0.0000);
		dg_p1_mdField.setLength(12);
		dg_p1_mdField.setPrecision(4);
		metaData.addField(dg_p1_mdField);

		Field dg_p1_tdhField = new Field("dg_p1_tdh", "double");
		dg_p1_tdhField.setDefaultValue(0.0000);
		dg_p1_tdhField.setLength(12);
		dg_p1_tdhField.setPrecision(4);
		metaData.addField(dg_p1_tdhField);

		Field dg_p1_kvarhField = new Field("dg_p1_kvarh", "double");
		dg_p1_kvarhField.setDefaultValue(0.0000);
		dg_p1_kvarhField.setLength(12);
		dg_p1_kvarhField.setPrecision(4);
		metaData.addField(dg_p1_kvarhField);

		Field dg_p1_frequencyField = new Field("dg_p1_frequency", "double");
		dg_p1_frequencyField.setDefaultValue(0.0000);
		dg_p1_frequencyField.setLength(12);
		dg_p1_frequencyField.setPrecision(4);
		metaData.addField(dg_p1_frequencyField);

		Field dg_p2_reading_kvahField = new Field("dg_p2_reading_kvah", "double");
		dg_p2_reading_kvahField.setDefaultValue(0.0000);
		dg_p2_reading_kvahField.setLength(12);
		dg_p2_reading_kvahField.setPrecision(4);
		metaData.addField(dg_p2_reading_kvahField);

		Field dg_p2_reading_kwhField = new Field("dg_p2_reading_kwh", "double");
		dg_p2_reading_kwhField.setDefaultValue(0.0000);
		dg_p2_reading_kwhField.setLength(12);
		dg_p2_reading_kwhField.setPrecision(4);
		metaData.addField(dg_p2_reading_kwhField);

		Field dg_p2_load_kvaField = new Field("dg_p2_load_kva", "double");
		dg_p2_load_kvaField.setDefaultValue(0.0000);
		dg_p2_load_kvaField.setLength(12);
		dg_p2_load_kvaField.setPrecision(4);
		metaData.addField(dg_p2_load_kvaField);

		Field dg_p2_load_kwField = new Field("dg_p2_load_kw", "double");
		dg_p2_load_kwField.setDefaultValue(0.0000);
		dg_p2_load_kwField.setLength(12);
		dg_p2_load_kwField.setPrecision(4);
		metaData.addField(dg_p2_load_kwField);

		Field dg_p2_voltageField = new Field("dg_p2_voltage", "double");
		dg_p2_voltageField.setDefaultValue(0.0000);
		dg_p2_voltageField.setLength(12);
		dg_p2_voltageField.setPrecision(4);
		metaData.addField(dg_p2_voltageField);

		Field dg_p2_currentField = new Field("dg_p2_current", "double");
		dg_p2_currentField.setDefaultValue(0.0000);
		dg_p2_currentField.setLength(12);
		dg_p2_currentField.setPrecision(4);
		metaData.addField(dg_p2_currentField);

		Field dg_p2_pfField = new Field("dg_p2_pf", "double");
		dg_p2_pfField.setDefaultValue(0.0000);
		dg_p2_pfField.setLength(12);
		dg_p2_pfField.setPrecision(4);
		metaData.addField(dg_p2_pfField);

		Field dg_p2_mdField = new Field("dg_p2_md", "double");
		dg_p2_mdField.setDefaultValue(0.0000);
		dg_p2_mdField.setLength(12);
		dg_p2_mdField.setPrecision(4);
		metaData.addField(dg_p2_mdField);

		Field dg_p2_tdhField = new Field("dg_p2_tdh", "double");
		dg_p2_tdhField.setDefaultValue(0.0000);
		dg_p2_tdhField.setLength(12);
		dg_p2_tdhField.setPrecision(4);
		metaData.addField(dg_p2_tdhField);

		Field dg_p2_kvarhField = new Field("dg_p2_kvarh", "double");
		dg_p2_kvarhField.setDefaultValue(0.0000);
		dg_p2_kvarhField.setLength(12);
		dg_p2_kvarhField.setPrecision(4);
		metaData.addField(dg_p2_kvarhField);

		Field dg_p2_frequencyField = new Field("dg_p2_frequency", "double");
		dg_p2_frequencyField.setDefaultValue(0.0000);
		dg_p2_frequencyField.setLength(12);
		dg_p2_frequencyField.setPrecision(4);
		metaData.addField(dg_p2_frequencyField);

		Field dg_p3_reading_kvahField = new Field("dg_p3_reading_kvah", "double");
		dg_p3_reading_kvahField.setDefaultValue(0.0000);
		dg_p3_reading_kvahField.setLength(12);
		dg_p3_reading_kvahField.setPrecision(4);
		metaData.addField(dg_p3_reading_kvahField);

		Field dg_p3_reading_kwhField = new Field("dg_p3_reading_kwh", "double");
		dg_p3_reading_kwhField.setDefaultValue(0.0000);
		dg_p3_reading_kwhField.setLength(12);
		dg_p3_reading_kwhField.setPrecision(4);
		metaData.addField(dg_p3_reading_kwhField);

		Field dg_p3_load_kvaField = new Field("dg_p3_load_kva", "double");
		dg_p3_load_kvaField.setDefaultValue(0.0000);
		dg_p3_load_kvaField.setLength(12);
		dg_p3_load_kvaField.setPrecision(4);
		metaData.addField(dg_p3_load_kvaField);

		Field dg_p3_load_kwField = new Field("dg_p3_load_kw", "double");
		dg_p3_load_kwField.setDefaultValue(0.0000);
		dg_p3_load_kwField.setLength(12);
		dg_p3_load_kwField.setPrecision(4);
		metaData.addField(dg_p3_load_kwField);

		Field dg_p3_voltageField = new Field("dg_p3_voltage", "double");
		dg_p3_voltageField.setDefaultValue(0.0000);
		dg_p3_voltageField.setLength(12);
		dg_p3_voltageField.setPrecision(4);
		metaData.addField(dg_p3_voltageField);

		Field dg_p3_currentField = new Field("dg_p3_current", "double");
		dg_p3_currentField.setDefaultValue(0.0000);
		dg_p3_currentField.setLength(12);
		dg_p3_currentField.setPrecision(4);
		metaData.addField(dg_p3_currentField);

		Field dg_p3_pfField = new Field("dg_p3_pf", "double");
		dg_p3_pfField.setDefaultValue(0.0000);
		dg_p3_pfField.setLength(12);
		dg_p3_pfField.setPrecision(4);
		metaData.addField(dg_p3_pfField);

		Field dg_p3_mdField = new Field("dg_p3_md", "double");
		dg_p3_mdField.setDefaultValue(0.0000);
		dg_p3_mdField.setLength(12);
		dg_p3_mdField.setPrecision(4);
		metaData.addField(dg_p3_mdField);

		Field dg_p3_tdhField = new Field("dg_p3_tdh", "double");
		dg_p3_tdhField.setDefaultValue(0.0000);
		dg_p3_tdhField.setLength(12);
		dg_p3_tdhField.setPrecision(4);
		metaData.addField(dg_p3_tdhField);

		Field dg_p3_kvarhField = new Field("dg_p3_kvarh", "double");
		dg_p3_kvarhField.setDefaultValue(0.0000);
		dg_p3_kvarhField.setLength(12);
		dg_p3_kvarhField.setPrecision(4);
		metaData.addField(dg_p3_kvarhField);

		Field dg_p3_frequencyField = new Field("dg_p3_frequency", "double");
		dg_p3_frequencyField.setDefaultValue(0.0000);
		dg_p3_frequencyField.setLength(12);
		dg_p3_frequencyField.setPrecision(4);
		metaData.addField(dg_p3_frequencyField);

		Field temperatureField = new Field("temperature", "double");
		temperatureField.setDefaultValue(0.00);
		temperatureField.setLength(6);
		temperatureField.setPrecision(2);
		metaData.addField(temperatureField);

		Field humidityField = new Field("humidity", "double");
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

		Field level_floatField = new Field("level_float", "double");
		level_floatField.setDefaultValue(0.00);
		level_floatField.setLength(10);
		level_floatField.setPrecision(2);
		metaData.addField(level_floatField);

		Field fuel_levelField = new Field("fuel_level", "double");
		fuel_levelField.setDefaultValue(0.00);
		fuel_levelField.setLength(10);
		fuel_levelField.setPrecision(2);
		metaData.addField(fuel_levelField);

		Field fuel_quantityField = new Field("fuel_quantity", "double");
		fuel_quantityField.setDefaultValue(0.00);
		fuel_quantityField.setLength(10);
		fuel_quantityField.setPrecision(2);
		metaData.addField(fuel_quantityField);

		Field stateField = new Field("state", "String");
		stateField.setDefaultValue("N");
		stateField.setLength(32);
		metaData.addField(stateField);

		Field maintaince_modeField = new Field("maintaince_mode", "String");
		maintaince_modeField.setDefaultValue("N");
		maintaince_modeField.setLength(1);
		metaData.addField(maintaince_modeField);

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

		Field high_coolant_temperatureField = new Field("high_coolant_temperature", "String");
		high_coolant_temperatureField.setDefaultValue("N");
		high_coolant_temperatureField.setLength(1);
		metaData.addField(high_coolant_temperatureField);

		Field canopy_temperatureField = new Field("canopy_temperature", "double");
		canopy_temperatureField.setDefaultValue(0.00);
		canopy_temperatureField.setLength(6);
		canopy_temperatureField.setPrecision(2);
		metaData.addField(canopy_temperatureField);

		Field coolant_temperatureField = new Field("coolant_temperature", "double");
		coolant_temperatureField.setDefaultValue(0.00);
		coolant_temperatureField.setLength(6);
		coolant_temperatureField.setPrecision(2);
		metaData.addField(coolant_temperatureField);

		Field high_canopy_temperatureField = new Field("high_canopy_temperature", "String");
		high_canopy_temperatureField.setDefaultValue("N");
		high_canopy_temperatureField.setLength(1);
		metaData.addField(high_canopy_temperatureField);

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

		Field last_processed_fuel_quantityField = new Field("last_processed_fuel_quantity", "double");
		last_processed_fuel_quantityField.setDefaultValue(0.00);
		last_processed_fuel_quantityField.setLength(15);
		last_processed_fuel_quantityField.setPrecision(4);
		metaData.addField(last_processed_fuel_quantityField);

		Field last_processed_db_readingField = new Field("last_processed_db_reading", "double");
		last_processed_db_readingField.setDefaultValue(0.00);
		last_processed_db_readingField.setLength(15);
		last_processed_db_readingField.setPrecision(4);
		metaData.addField(last_processed_db_readingField);

		Field last_processed_grid_readingField = new Field("last_processed_grid_reading", "double");
		last_processed_grid_readingField.setDefaultValue(0.00);
		last_processed_grid_readingField.setLength(15);
		last_processed_grid_readingField.setPrecision(4);
		metaData.addField(last_processed_grid_readingField);

		Field langitudeField = new Field("langitude", "String");
		langitudeField.setLength(32);
		metaData.addField(langitudeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setLength(32);
		metaData.addField(latitudeField);

		Field speedField = new Field("speed", "int");
		speedField.setDefaultValue(0);
		speedField.setLength(6);
		metaData.addField(speedField);

		Field driveTypeField = new Field("driveType", "String");
		driveTypeField.setDefaultValue("OWN");
		driveTypeField.setLength(32);
		metaData.addField(driveTypeField);

		Field currentDriverIdField = new Field("currentDriverId", "String");
		currentDriverIdField.setLength(32);
		metaData.addField(currentDriverIdField);

		Field engineTemperatureField = new Field("engineTemperature", "double");
		engineTemperatureField.setDefaultValue(0.0);
		engineTemperatureField.setLength(6);
		engineTemperatureField.setPrecision(2);
		metaData.addField(engineTemperatureField);

		Field ignitionStateField = new Field("ignitionState", "String");
		ignitionStateField.setDefaultValue("N");
		ignitionStateField.setLength(1);
		metaData.addField(ignitionStateField);

		Field engineOverHeatStateField = new Field("engineOverHeatState", "String");
		engineOverHeatStateField.setDefaultValue("N");
		engineOverHeatStateField.setLength(1);
		metaData.addField(engineOverHeatStateField);

		Field lowBatteryStateField = new Field("lowBatteryState", "String");
		lowBatteryStateField.setDefaultValue("N");
		lowBatteryStateField.setLength(1);
		metaData.addField(lowBatteryStateField);

		Field obdLowBatteryStateField = new Field("obdLowBatteryState", "String");
		obdLowBatteryStateField.setDefaultValue("N");
		obdLowBatteryStateField.setLength(1);
		metaData.addField(obdLowBatteryStateField);

		Field batteryLevelField = new Field("batteryLevel", "double");
		batteryLevelField.setDefaultValue(0.0);
		batteryLevelField.setLength(6);
		batteryLevelField.setPrecision(2);
		metaData.addField(batteryLevelField);

		Field airFlowField = new Field("airFlow", "int");
		airFlowField.setDefaultValue(0);
		airFlowField.setLength(8);
		metaData.addField(airFlowField);

		Field atmoshericPressureField = new Field("atmoshericPressure", "double");
		atmoshericPressureField.setDefaultValue(0.0);
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

		Field oilPressureField = new Field("oilPressure", "double");
		oilPressureField.setDefaultValue(0.0);
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

		Field batteryVoltageField = new Field("batteryVoltage", "double");
		batteryVoltageField.setDefaultValue(0.0);
		batteryVoltageField.setLength(12);
		batteryVoltageField.setPrecision(2);
		metaData.addField(batteryVoltageField);

		Field intakeTubeAbsolutePressureField = new Field("intakeTubeAbsolutePressure", "double");
		intakeTubeAbsolutePressureField.setDefaultValue(0.0);
		intakeTubeAbsolutePressureField.setLength(12);
		intakeTubeAbsolutePressureField.setPrecision(2);
		metaData.addField(intakeTubeAbsolutePressureField);

		Field numberOfDTCField = new Field("numberOfDTC", "int");
		numberOfDTCField.setDefaultValue(0);
		numberOfDTCField.setLength(12);
		metaData.addField(numberOfDTCField);

		Field lastEngineStartedField = new Field("lastEngineStarted", "timestamp");
		metaData.addField(lastEngineStartedField);

		Field lastEngineStoppedField = new Field("lastEngineStopped", "timestamp");
		metaData.addField(lastEngineStoppedField);

		Field timeZoneField = new Field("timeZone", "String");
		timeZoneField.setDefaultValue("IST");
		timeZoneField.setLength(32);
		metaData.addField(timeZoneField);

		Field fuel_typeField = new Field("fuel_type", "String");
		fuel_typeField.setLength(32);
		metaData.addField(fuel_typeField);

		Field start_readingField = new Field("start_reading", "double");
		start_readingField.setDefaultValue(0.0);
		start_readingField.setLength(12);
		start_readingField.setPrecision(2);
		metaData.addField(start_readingField);

		Field grid_stateField = new Field("grid_state", "String");
		grid_stateField.setDefaultValue("N");
		grid_stateField.setLength(1);
		metaData.addField(grid_stateField);

		Field timing_advanceField = new Field("timing_advance", "int");
		timing_advanceField.setLength(10);
		metaData.addField(timing_advanceField);

		Field manifoldABSPressureField = new Field("manifoldABSPressure", "int");
		manifoldABSPressureField.setLength(10);
		metaData.addField(manifoldABSPressureField);

		Field start_timeField = new Field("start_time", "timestamp");
		metaData.addField(start_timeField);

		Field current_fuel_consumptionField = new Field("current_fuel_consumption", "double");
		current_fuel_consumptionField.setDefaultValue(0.0);
		current_fuel_consumptionField.setLength(15);
		current_fuel_consumptionField.setPrecision(4);
		metaData.addField(current_fuel_consumptionField);

		Field fuel_calibration_factorField = new Field("fuel_calibration_factor", "double");
		fuel_calibration_factorField.setDefaultValue(0.0);
		fuel_calibration_factorField.setLength(15);
		fuel_calibration_factorField.setPrecision(4);
		metaData.addField(fuel_calibration_factorField);

		Field lowFuelStateField = new Field("lowFuelState", "String");
		lowFuelStateField.setDefaultValue("N");
		lowFuelStateField.setLength(1);
		metaData.addField(lowFuelStateField);

		Field lowFuelStateEnterTimeField = new Field("lowFuelStateEnterTime", "timestamp");
		metaData.addField(lowFuelStateEnterTimeField);

		Field lowOilPressureStateField = new Field("lowOilPressureState", "String");
		lowOilPressureStateField.setDefaultValue("N");
		lowOilPressureStateField.setLength(1);
		metaData.addField(lowOilPressureStateField);

		Field overSpeedStateField = new Field("overSpeedState", "String");
		overSpeedStateField.setDefaultValue("N");
		overSpeedStateField.setLength(1);
		metaData.addField(overSpeedStateField);

		Field starterTriggeredField = new Field("starterTriggered", "String");
		starterTriggeredField.setDefaultValue("N");
		starterTriggeredField.setLength(1);
		metaData.addField(starterTriggeredField);

		Field waterInFuelField = new Field("waterInFuel", "String");
		waterInFuelField.setDefaultValue("N");
		waterInFuelField.setLength(1);
		metaData.addField(waterInFuelField);

		Field remoteControlField = new Field("remoteControl", "String");
		remoteControlField.setDefaultValue("N");
		remoteControlField.setLength(1);
		metaData.addField(remoteControlField);

		Field testField = new Field("test", "String");
		testField.setDefaultValue("N");
		testField.setLength(1);
		metaData.addField(testField);

		Field temperedField = new Field("tempered", "String");
		temperedField.setDefaultValue("N");
		temperedField.setLength(1);
		metaData.addField(temperedField);

		Field featureEngineMonitoringField = new Field("featureEngineMonitoring", "String");
		featureEngineMonitoringField.setDefaultValue("N");
		featureEngineMonitoringField.setLength(1);
		metaData.addField(featureEngineMonitoringField);

		Field featureTrackingField = new Field("featureTracking", "String");
		featureTrackingField.setDefaultValue("N");
		featureTrackingField.setLength(1);
		metaData.addField(featureTrackingField);

		Field currentRouteIdField = new Field("currentRouteId", "String");
		currentRouteIdField.setLength(128);
		metaData.addField(currentRouteIdField);

		Field lastStopageIdField = new Field("lastStopageId", "String");
		lastStopageIdField.setLength(128);
		metaData.addField(lastStopageIdField);

		Field sittingCapacityField = new Field("sittingCapacity", "long");
		metaData.addField(sittingCapacityField);

		Field insuranceExpiryField = new Field("insuranceExpiry", "String");
		insuranceExpiryField.setLength(28);
		metaData.addField(insuranceExpiryField);

		Field pollutionCertificateExpiryField = new Field("pollutionCertificateExpiry", "String");
		pollutionCertificateExpiryField.setLength(28);
		metaData.addField(pollutionCertificateExpiryField);

		Field vehicleFitnessExpiryField = new Field("vehicleFitnessExpiry", "String");
		vehicleFitnessExpiryField.setLength(28);
		metaData.addField(vehicleFitnessExpiryField);

		Field lastServiceField = new Field("lastService", "String");
		lastServiceField.setLength(28);
		metaData.addField(lastServiceField);

		Field critical_alertsField = new Field("critical_alerts", "long");
		critical_alertsField.setDefaultValue(0L);
		metaData.addField(critical_alertsField);

		Field major_alertsField = new Field("major_alerts", "long");
		major_alertsField.setDefaultValue(0L);
		metaData.addField(major_alertsField);

		Field wanring_alertsField = new Field("wanring_alerts", "long");
		wanring_alertsField.setDefaultValue(0L);
		metaData.addField(wanring_alertsField);

		Field minor_alertsField = new Field("minor_alerts", "long");
		minor_alertsField.setDefaultValue(0L);
		metaData.addField(minor_alertsField);

		Field costField = new Field("cost", "double");
		metaData.addField(costField);

		Field cost_unitField = new Field("cost_unit", "String");
		cost_unitField.setLength(32);
		metaData.addField(cost_unitField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance() {}

	public Baseappliance(Baseappliance obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.threshold_templete_id = obj.threshold_templete_id;
		this.threshold_templete_name = obj.threshold_templete_name;
		this.controller_name = obj.controller_name;
		this.controller_id = obj.controller_id;
		this.controller_port = obj.controller_port;
		this.imei = obj.imei;
		this.vin = obj.vin;
		this.make_id = obj.make_id;
		this.make_name = obj.make_name;
		this.model_id = obj.model_id;
		this.model_name = obj.model_name;
		this.power_rating = obj.power_rating;
		this.type = obj.type;
		this.sub_type = obj.sub_type;
		this.applaince_type_id = obj.applaince_type_id;
		this.consumer_id = obj.consumer_id;
		this.manager = obj.manager;
		this.model = obj.model;
		this.location_id = obj.location_id;
		this.location_name = obj.location_name;
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
		this.threshold_over_speed = obj.threshold_over_speed;
		this.capacity = obj.capacity;
		this.maintainace_run_hour = obj.maintainace_run_hour;
		this.today_run_time = obj.today_run_time;
		this.today_fuel_consumption = obj.today_fuel_consumption;
		this.average_fuel_consumption = obj.average_fuel_consumption;
		this.today_fuel_loss = obj.today_fuel_loss;
		this.current_month_run_time = obj.current_month_run_time;
		this.current_month_fuel_consumption = obj.current_month_fuel_consumption;
		this.current_month_fuel_loss = obj.current_month_fuel_loss;
		this.threshold_temperature_min_level = obj.threshold_temperature_min_level;
		this.threshold_temperature_max_level = obj.threshold_temperature_max_level;
		this.threshold_voltage_min_level = obj.threshold_voltage_min_level;
		this.threshold_voltage_max_level = obj.threshold_voltage_max_level;
		this.threshold_current_min_level = obj.threshold_current_min_level;
		this.threshold_current_max_level = obj.threshold_current_max_level;
		this.threshold_duration = obj.threshold_duration;
		this.alert_dg_grid_on = obj.alert_dg_grid_on;
		this.alert_dg_grid_off = obj.alert_dg_grid_off;
		this.asset_id = obj.asset_id;
		this.partner_id = obj.partner_id;
		this.tenent_id = obj.tenent_id;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
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
		this.last_grid_reading_updated = obj.last_grid_reading_updated;
		this.last_dg_reading_updated = obj.last_dg_reading_updated;
		this.dg_reading = obj.dg_reading;
		this.grid_reading = obj.grid_reading;
		this.voltage = obj.voltage;
		this.current = obj.current;
		this.power = obj.power;
		this.energy = obj.energy;
		this.grid_reading_kvah = obj.grid_reading_kvah;
		this.grid_reading_kwh = obj.grid_reading_kwh;
		this.grid_today_kwh = obj.grid_today_kwh;
		this.grid_current_month_kwh = obj.grid_current_month_kwh;
		this.grid_today_kvah = obj.grid_today_kvah;
		this.grid_current_month_kvah = obj.grid_current_month_kvah;
		this.grid_load_kva = obj.grid_load_kva;
		this.grid_load_kw = obj.grid_load_kw;
		this.grid_voltage = obj.grid_voltage;
		this.grid_current = obj.grid_current;
		this.grid_pf = obj.grid_pf;
		this.grid_md = obj.grid_md;
		this.grid_tdh = obj.grid_tdh;
		this.grid_kvarh = obj.grid_kvarh;
		this.grid_frequency = obj.grid_frequency;
		this.grid_p1_reading_kvah = obj.grid_p1_reading_kvah;
		this.grid_p1_reading_kwh = obj.grid_p1_reading_kwh;
		this.grid_p1_load_kva = obj.grid_p1_load_kva;
		this.grid_p1_load_kw = obj.grid_p1_load_kw;
		this.grid_p1_voltage = obj.grid_p1_voltage;
		this.grid_p1_current = obj.grid_p1_current;
		this.grid_p1_pf = obj.grid_p1_pf;
		this.grid_p1_md = obj.grid_p1_md;
		this.grid_p1_tdh = obj.grid_p1_tdh;
		this.grid_p1_kvarh = obj.grid_p1_kvarh;
		this.grid_p1_frequency = obj.grid_p1_frequency;
		this.grid_p2_reading_kvah = obj.grid_p2_reading_kvah;
		this.grid_p2_reading_kwh = obj.grid_p2_reading_kwh;
		this.grid_p2_load_kva = obj.grid_p2_load_kva;
		this.grid_p2_load_kw = obj.grid_p2_load_kw;
		this.grid_p2_voltage = obj.grid_p2_voltage;
		this.grid_p2_current = obj.grid_p2_current;
		this.grid_p2_pf = obj.grid_p2_pf;
		this.grid_p2_md = obj.grid_p2_md;
		this.grid_p2_tdh = obj.grid_p2_tdh;
		this.grid_p2_kvarh = obj.grid_p2_kvarh;
		this.grid_p2_frequency = obj.grid_p2_frequency;
		this.grid_p3_reading_kvah = obj.grid_p3_reading_kvah;
		this.grid_p3_reading_kwh = obj.grid_p3_reading_kwh;
		this.grid_p3_load_kva = obj.grid_p3_load_kva;
		this.grid_p3_load_kw = obj.grid_p3_load_kw;
		this.grid_p3_voltage = obj.grid_p3_voltage;
		this.grid_p3_current = obj.grid_p3_current;
		this.grid_p3_pf = obj.grid_p3_pf;
		this.grid_p3_md = obj.grid_p3_md;
		this.grid_p3_tdh = obj.grid_p3_tdh;
		this.grid_p3_kvarh = obj.grid_p3_kvarh;
		this.grid_p3_frequency = obj.grid_p3_frequency;
		this.dg_reading_kwh = obj.dg_reading_kwh;
		this.dg_reading_kvah = obj.dg_reading_kvah;
		this.dg_today_kwh = obj.dg_today_kwh;
		this.dg_current_month_kwh = obj.dg_current_month_kwh;
		this.dg_today_kvah = obj.dg_today_kvah;
		this.dg_current_month_kvah = obj.dg_current_month_kvah;
		this.dg_load_kw = obj.dg_load_kw;
		this.dg_load_kva = obj.dg_load_kva;
		this.dg_voltage = obj.dg_voltage;
		this.dg_current = obj.dg_current;
		this.dg_pf = obj.dg_pf;
		this.dg_md = obj.dg_md;
		this.dg_tdh = obj.dg_tdh;
		this.dg_kvarh = obj.dg_kvarh;
		this.dg_frequency = obj.dg_frequency;
		this.dg_p1_reading_kvah = obj.dg_p1_reading_kvah;
		this.dg_p1_reading_kwh = obj.dg_p1_reading_kwh;
		this.dg_p1_load_kva = obj.dg_p1_load_kva;
		this.dg_p1_load_kw = obj.dg_p1_load_kw;
		this.dg_p1_voltage = obj.dg_p1_voltage;
		this.dg_p1_current = obj.dg_p1_current;
		this.dg_p1_pf = obj.dg_p1_pf;
		this.dg_p1_md = obj.dg_p1_md;
		this.dg_p1_tdh = obj.dg_p1_tdh;
		this.dg_p1_kvarh = obj.dg_p1_kvarh;
		this.dg_p1_frequency = obj.dg_p1_frequency;
		this.dg_p2_reading_kvah = obj.dg_p2_reading_kvah;
		this.dg_p2_reading_kwh = obj.dg_p2_reading_kwh;
		this.dg_p2_load_kva = obj.dg_p2_load_kva;
		this.dg_p2_load_kw = obj.dg_p2_load_kw;
		this.dg_p2_voltage = obj.dg_p2_voltage;
		this.dg_p2_current = obj.dg_p2_current;
		this.dg_p2_pf = obj.dg_p2_pf;
		this.dg_p2_md = obj.dg_p2_md;
		this.dg_p2_tdh = obj.dg_p2_tdh;
		this.dg_p2_kvarh = obj.dg_p2_kvarh;
		this.dg_p2_frequency = obj.dg_p2_frequency;
		this.dg_p3_reading_kvah = obj.dg_p3_reading_kvah;
		this.dg_p3_reading_kwh = obj.dg_p3_reading_kwh;
		this.dg_p3_load_kva = obj.dg_p3_load_kva;
		this.dg_p3_load_kw = obj.dg_p3_load_kw;
		this.dg_p3_voltage = obj.dg_p3_voltage;
		this.dg_p3_current = obj.dg_p3_current;
		this.dg_p3_pf = obj.dg_p3_pf;
		this.dg_p3_md = obj.dg_p3_md;
		this.dg_p3_tdh = obj.dg_p3_tdh;
		this.dg_p3_kvarh = obj.dg_p3_kvarh;
		this.dg_p3_frequency = obj.dg_p3_frequency;
		this.temperature = obj.temperature;
		this.humidity = obj.humidity;
		this.mode = obj.mode;
		this.level = obj.level;
		this.level_float = obj.level_float;
		this.fuel_level = obj.fuel_level;
		this.fuel_quantity = obj.fuel_quantity;
		this.state = obj.state;
		this.maintaince_mode = obj.maintaince_mode;
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
		this.high_coolant_temperature = obj.high_coolant_temperature;
		this.canopy_temperature = obj.canopy_temperature;
		this.coolant_temperature = obj.coolant_temperature;
		this.high_canopy_temperature = obj.high_canopy_temperature;
		this.lastProcessedState = obj.lastProcessedState;
		this.lastProcessedTime = obj.lastProcessedTime;
		this.charging_state = obj.charging_state;
		this.last_processed_fuel_quantity = obj.last_processed_fuel_quantity;
		this.last_processed_db_reading = obj.last_processed_db_reading;
		this.last_processed_grid_reading = obj.last_processed_grid_reading;
		this.langitude = obj.langitude;
		this.latitude = obj.latitude;
		this.speed = obj.speed;
		this.driveType = obj.driveType;
		this.currentDriverId = obj.currentDriverId;
		this.engineTemperature = obj.engineTemperature;
		this.ignitionState = obj.ignitionState;
		this.engineOverHeatState = obj.engineOverHeatState;
		this.lowBatteryState = obj.lowBatteryState;
		this.obdLowBatteryState = obj.obdLowBatteryState;
		this.batteryLevel = obj.batteryLevel;
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
		this.lastEngineStarted = obj.lastEngineStarted;
		this.lastEngineStopped = obj.lastEngineStopped;
		this.timeZone = obj.timeZone;
		this.fuel_type = obj.fuel_type;
		this.start_reading = obj.start_reading;
		this.grid_state = obj.grid_state;
		this.timing_advance = obj.timing_advance;
		this.manifoldABSPressure = obj.manifoldABSPressure;
		this.start_time = obj.start_time;
		this.current_fuel_consumption = obj.current_fuel_consumption;
		this.fuel_calibration_factor = obj.fuel_calibration_factor;
		this.lowFuelState = obj.lowFuelState;
		this.lowFuelStateEnterTime = obj.lowFuelStateEnterTime;
		this.lowOilPressureState = obj.lowOilPressureState;
		this.overSpeedState = obj.overSpeedState;
		this.starterTriggered = obj.starterTriggered;
		this.waterInFuel = obj.waterInFuel;
		this.remoteControl = obj.remoteControl;
		this.test = obj.test;
		this.tempered = obj.tempered;
		this.featureEngineMonitoring = obj.featureEngineMonitoring;
		this.featureTracking = obj.featureTracking;
		this.currentRouteId = obj.currentRouteId;
		this.lastStopageId = obj.lastStopageId;
		this.sittingCapacity = obj.sittingCapacity;
		this.insuranceExpiry = obj.insuranceExpiry;
		this.pollutionCertificateExpiry = obj.pollutionCertificateExpiry;
		this.vehicleFitnessExpiry = obj.vehicleFitnessExpiry;
		this.lastService = obj.lastService;
		this.current_route_name = obj.current_route_name;
		this.current_route_schedule = obj.current_route_schedule;
		this.last_stopage_name = obj.last_stopage_name;
		this.last_stopage_reached_time = obj.last_stopage_reached_time;
		this.critical_alerts = obj.critical_alerts;
		this.major_alerts = obj.major_alerts;
		this.wanring_alerts = obj.wanring_alerts;
		this.minor_alerts = obj.minor_alerts;
		this.cost = obj.cost;
		this.cost_unit = obj.cost_unit;
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
		if(threshold_fuel_level == null)
			threshold_fuel_level = 0.0;
		if(capacity == null)
			capacity = 0.0;
		if(today_fuel_consumption == null)
			today_fuel_consumption = 0.00;
		if(average_fuel_consumption == null)
			average_fuel_consumption = 0.00;
		if(today_fuel_loss == null)
			today_fuel_loss = 0.00;
		if(current_month_fuel_consumption == null)
			current_month_fuel_consumption = 0.00;
		if(current_month_fuel_loss == null)
			current_month_fuel_loss = 0.00;
		if(threshold_temperature_min_level == null)
			threshold_temperature_min_level = 0.00;
		if(threshold_temperature_max_level == null)
			threshold_temperature_max_level = 0.00;
		if(threshold_voltage_min_level == null)
			threshold_voltage_min_level = 0.00;
		if(threshold_voltage_max_level == null)
			threshold_voltage_max_level = 0.00;
		if(threshold_current_min_level == null)
			threshold_current_min_level = 0.00;
		if(threshold_current_max_level == null)
			threshold_current_max_level = 0.00;
		if(threshold_duration == null)
			threshold_duration = 0.00;
		if(ex_type == null)
			ex_type = "ENABLED";
		if(battery_number == null)
			battery_number = 0;
		if(number_of_batteries == null)
			number_of_batteries = 0;
		if(deploy_type == null)
			deploy_type = "LOCATION";
		if(connected == null)
			connected = "Y";
		if(config == null)
			config = "Y";
		if(battery_status == null)
			battery_status = "O";
		if(battery_level == null)
			battery_level = 0;
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
		if(energy == null)
			energy = 0.0000;
		if(grid_reading_kvah == null)
			grid_reading_kvah = 0.0000;
		if(grid_reading_kwh == null)
			grid_reading_kwh = 0.0000;
		if(grid_today_kwh == null)
			grid_today_kwh = 0.0000;
		if(grid_current_month_kwh == null)
			grid_current_month_kwh = 0.0000;
		if(grid_today_kvah == null)
			grid_today_kvah = 0.0000;
		if(grid_current_month_kvah == null)
			grid_current_month_kvah = 0.0000;
		if(grid_load_kva == null)
			grid_load_kva = 0.0000;
		if(grid_load_kw == null)
			grid_load_kw = 0.0000;
		if(grid_voltage == null)
			grid_voltage = 0.00;
		if(grid_current == null)
			grid_current = 0.00;
		if(grid_pf == null)
			grid_pf = 0.0000;
		if(grid_md == null)
			grid_md = 0.0000;
		if(grid_tdh == null)
			grid_tdh = 0.0000;
		if(grid_kvarh == null)
			grid_kvarh = 0.0000;
		if(grid_frequency == null)
			grid_frequency = 0L;
		if(grid_p1_reading_kvah == null)
			grid_p1_reading_kvah = 0.0000;
		if(grid_p1_reading_kwh == null)
			grid_p1_reading_kwh = 0.0000;
		if(grid_p1_load_kva == null)
			grid_p1_load_kva = 0.0000;
		if(grid_p1_load_kw == null)
			grid_p1_load_kw = 0.0000;
		if(grid_p1_voltage == null)
			grid_p1_voltage = 0.0000;
		if(grid_p1_current == null)
			grid_p1_current = 0.0000;
		if(grid_p1_pf == null)
			grid_p1_pf = 0.0000;
		if(grid_p1_md == null)
			grid_p1_md = 0.0000;
		if(grid_p1_tdh == null)
			grid_p1_tdh = 0.0000;
		if(grid_p1_kvarh == null)
			grid_p1_kvarh = 0.0000;
		if(grid_p1_frequency == null)
			grid_p1_frequency = 0.0000;
		if(grid_p2_reading_kvah == null)
			grid_p2_reading_kvah = 0.0000;
		if(grid_p2_reading_kwh == null)
			grid_p2_reading_kwh = 0.0000;
		if(grid_p2_load_kva == null)
			grid_p2_load_kva = 0.0000;
		if(grid_p2_load_kw == null)
			grid_p2_load_kw = 0.0000;
		if(grid_p2_voltage == null)
			grid_p2_voltage = 0.0000;
		if(grid_p2_current == null)
			grid_p2_current = 0.0000;
		if(grid_p2_pf == null)
			grid_p2_pf = 0.0000;
		if(grid_p2_md == null)
			grid_p2_md = 0.0000;
		if(grid_p2_tdh == null)
			grid_p2_tdh = 0.0000;
		if(grid_p2_kvarh == null)
			grid_p2_kvarh = 0.0000;
		if(grid_p2_frequency == null)
			grid_p2_frequency = 0.0000;
		if(grid_p3_reading_kvah == null)
			grid_p3_reading_kvah = 0.0000;
		if(grid_p3_reading_kwh == null)
			grid_p3_reading_kwh = 0.0000;
		if(grid_p3_load_kva == null)
			grid_p3_load_kva = 0.0000;
		if(grid_p3_load_kw == null)
			grid_p3_load_kw = 0.0000;
		if(grid_p3_voltage == null)
			grid_p3_voltage = 0.0000;
		if(grid_p3_current == null)
			grid_p3_current = 0.0000;
		if(grid_p3_pf == null)
			grid_p3_pf = 0.0000;
		if(grid_p3_md == null)
			grid_p3_md = 0.0000;
		if(grid_p3_tdh == null)
			grid_p3_tdh = 0.0000;
		if(grid_p3_kvarh == null)
			grid_p3_kvarh = 0.0000;
		if(grid_p3_frequency == null)
			grid_p3_frequency = 0.0000;
		if(dg_reading_kwh == null)
			dg_reading_kwh = 0.0000;
		if(dg_reading_kvah == null)
			dg_reading_kvah = 0.0000;
		if(dg_today_kwh == null)
			dg_today_kwh = 0.0000;
		if(dg_current_month_kwh == null)
			dg_current_month_kwh = 0.0000;
		if(dg_today_kvah == null)
			dg_today_kvah = 0.0000;
		if(dg_current_month_kvah == null)
			dg_current_month_kvah = 0.0000;
		if(dg_load_kw == null)
			dg_load_kw = 0.0000;
		if(dg_load_kva == null)
			dg_load_kva = 0.0000;
		if(dg_voltage == null)
			dg_voltage = 0.0000;
		if(dg_current == null)
			dg_current = 0.0000;
		if(dg_pf == null)
			dg_pf = 0.0000;
		if(dg_md == null)
			dg_md = 0.0000;
		if(dg_tdh == null)
			dg_tdh = 0.0000;
		if(dg_kvarh == null)
			dg_kvarh = 0.0000;
		if(dg_frequency == null)
			dg_frequency = 0.0000;
		if(dg_p1_reading_kvah == null)
			dg_p1_reading_kvah = 0.0000;
		if(dg_p1_reading_kwh == null)
			dg_p1_reading_kwh = 0.0000;
		if(dg_p1_load_kva == null)
			dg_p1_load_kva = 0.0000;
		if(dg_p1_load_kw == null)
			dg_p1_load_kw = 0.0000;
		if(dg_p1_voltage == null)
			dg_p1_voltage = 0.0000;
		if(dg_p1_current == null)
			dg_p1_current = 0.0000;
		if(dg_p1_pf == null)
			dg_p1_pf = 0.0000;
		if(dg_p1_md == null)
			dg_p1_md = 0.0000;
		if(dg_p1_tdh == null)
			dg_p1_tdh = 0.0000;
		if(dg_p1_kvarh == null)
			dg_p1_kvarh = 0.0000;
		if(dg_p1_frequency == null)
			dg_p1_frequency = 0.0000;
		if(dg_p2_reading_kvah == null)
			dg_p2_reading_kvah = 0.0000;
		if(dg_p2_reading_kwh == null)
			dg_p2_reading_kwh = 0.0000;
		if(dg_p2_load_kva == null)
			dg_p2_load_kva = 0.0000;
		if(dg_p2_load_kw == null)
			dg_p2_load_kw = 0.0000;
		if(dg_p2_voltage == null)
			dg_p2_voltage = 0.0000;
		if(dg_p2_current == null)
			dg_p2_current = 0.0000;
		if(dg_p2_pf == null)
			dg_p2_pf = 0.0000;
		if(dg_p2_md == null)
			dg_p2_md = 0.0000;
		if(dg_p2_tdh == null)
			dg_p2_tdh = 0.0000;
		if(dg_p2_kvarh == null)
			dg_p2_kvarh = 0.0000;
		if(dg_p2_frequency == null)
			dg_p2_frequency = 0.0000;
		if(dg_p3_reading_kvah == null)
			dg_p3_reading_kvah = 0.0000;
		if(dg_p3_reading_kwh == null)
			dg_p3_reading_kwh = 0.0000;
		if(dg_p3_load_kva == null)
			dg_p3_load_kva = 0.0000;
		if(dg_p3_load_kw == null)
			dg_p3_load_kw = 0.0000;
		if(dg_p3_voltage == null)
			dg_p3_voltage = 0.0000;
		if(dg_p3_current == null)
			dg_p3_current = 0.0000;
		if(dg_p3_pf == null)
			dg_p3_pf = 0.0000;
		if(dg_p3_md == null)
			dg_p3_md = 0.0000;
		if(dg_p3_tdh == null)
			dg_p3_tdh = 0.0000;
		if(dg_p3_kvarh == null)
			dg_p3_kvarh = 0.0000;
		if(dg_p3_frequency == null)
			dg_p3_frequency = 0.0000;
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
		if(maintaince_mode == null)
			maintaince_mode = "N";
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
		if(high_coolant_temperature == null)
			high_coolant_temperature = "N";
		if(canopy_temperature == null)
			canopy_temperature = 0.00;
		if(coolant_temperature == null)
			coolant_temperature = 0.00;
		if(high_canopy_temperature == null)
			high_canopy_temperature = "N";
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
		if(speed == null)
			speed = 0;
		if(driveType == null)
			driveType = "OWN";
		if(engineTemperature == null)
			engineTemperature = 0.0;
		if(ignitionState == null)
			ignitionState = "N";
		if(engineOverHeatState == null)
			engineOverHeatState = "N";
		if(lowBatteryState == null)
			lowBatteryState = "N";
		if(obdLowBatteryState == null)
			obdLowBatteryState = "N";
		if(batteryLevel == null)
			batteryLevel = 0.0;
		if(airFlow == null)
			airFlow = 0;
		if(atmoshericPressure == null)
			atmoshericPressure = 0.0;
		if(engineLoad == null)
			engineLoad = 0;
		if(gpsStatus == null)
			gpsStatus = "A";
		if(intakeAirTemperature == null)
			intakeAirTemperature = 0;
		if(oilPressure == null)
			oilPressure = 0.0;
		if(rpm == null)
			rpm = 0;
		if(trottlePosition == null)
			trottlePosition = 0;
		if(batteryVoltage == null)
			batteryVoltage = 0.0;
		if(intakeTubeAbsolutePressure == null)
			intakeTubeAbsolutePressure = 0.0;
		if(numberOfDTC == null)
			numberOfDTC = 0;
		if(timeZone == null)
			timeZone = "IST";
		if(start_reading == null)
			start_reading = 0.0;
		if(grid_state == null)
			grid_state = "N";
		if(current_fuel_consumption == null)
			current_fuel_consumption = 0.0;
		if(fuel_calibration_factor == null)
			fuel_calibration_factor = 0.0;
		if(lowFuelState == null)
			lowFuelState = "N";
		if(lowOilPressureState == null)
			lowOilPressureState = "N";
		if(overSpeedState == null)
			overSpeedState = "N";
		if(starterTriggered == null)
			starterTriggered = "N";
		if(waterInFuel == null)
			waterInFuel = "N";
		if(remoteControl == null)
			remoteControl = "N";
		if(test == null)
			test = "N";
		if(tempered == null)
			tempered = "N";
		if(featureEngineMonitoring == null)
			featureEngineMonitoring = "N";
		if(featureTracking == null)
			featureTracking = "N";
		if(critical_alerts == null)
			critical_alerts = 0L;
		if(major_alerts == null)
			major_alerts = 0L;
		if(wanring_alerts == null)
			wanring_alerts = 0L;
		if(minor_alerts == null)
			minor_alerts = 0L;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(threshold_templete_id != null)
			map.put("threshold_templete_id", threshold_templete_id);
		if(threshold_templete_name != null)
			map.put("threshold_templete_name", threshold_templete_name);
		if(controller_name != null)
			map.put("controller_name", controller_name);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(imei != null)
			map.put("imei", imei);
		if(vin != null)
			map.put("vin", vin);
		if(make_id != null)
			map.put("make_id", make_id);
		if(make_name != null)
			map.put("make_name", make_name);
		if(model_id != null)
			map.put("model_id", model_id);
		if(model_name != null)
			map.put("model_name", model_name);
		if(power_rating != null)
			map.put("power_rating", power_rating);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
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
		if(location_name != null)
			map.put("location_name", location_name);
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
		if(threshold_over_speed != null)
			map.put("threshold_over_speed", threshold_over_speed);
		if(capacity != null)
			map.put("capacity", capacity);
		if(maintainace_run_hour != null)
			map.put("maintainace_run_hour", maintainace_run_hour);
		if(today_run_time != null)
			map.put("today_run_time", today_run_time);
		if(today_fuel_consumption != null)
			map.put("today_fuel_consumption", today_fuel_consumption);
		if(average_fuel_consumption != null)
			map.put("average_fuel_consumption", average_fuel_consumption);
		if(today_fuel_loss != null)
			map.put("today_fuel_loss", today_fuel_loss);
		if(current_month_run_time != null)
			map.put("current_month_run_time", current_month_run_time);
		if(current_month_fuel_consumption != null)
			map.put("current_month_fuel_consumption", current_month_fuel_consumption);
		if(current_month_fuel_loss != null)
			map.put("current_month_fuel_loss", current_month_fuel_loss);
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
		if(alert_dg_grid_on != null)
			map.put("alert_dg_grid_on", alert_dg_grid_on);
		if(alert_dg_grid_off != null)
			map.put("alert_dg_grid_off", alert_dg_grid_off);
		if(asset_id != null)
			map.put("asset_id", asset_id);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
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
		if(last_grid_reading_updated != null)
			map.put("last_grid_reading_updated", last_grid_reading_updated);
		if(last_dg_reading_updated != null)
			map.put("last_dg_reading_updated", last_dg_reading_updated);
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
		if(energy != null)
			map.put("energy", energy);
		if(grid_reading_kvah != null)
			map.put("grid_reading_kvah", grid_reading_kvah);
		if(grid_reading_kwh != null)
			map.put("grid_reading_kwh", grid_reading_kwh);
		if(grid_today_kwh != null)
			map.put("grid_today_kwh", grid_today_kwh);
		if(grid_current_month_kwh != null)
			map.put("grid_current_month_kwh", grid_current_month_kwh);
		if(grid_today_kvah != null)
			map.put("grid_today_kvah", grid_today_kvah);
		if(grid_current_month_kvah != null)
			map.put("grid_current_month_kvah", grid_current_month_kvah);
		if(grid_load_kva != null)
			map.put("grid_load_kva", grid_load_kva);
		if(grid_load_kw != null)
			map.put("grid_load_kw", grid_load_kw);
		if(grid_voltage != null)
			map.put("grid_voltage", grid_voltage);
		if(grid_current != null)
			map.put("grid_current", grid_current);
		if(grid_pf != null)
			map.put("grid_pf", grid_pf);
		if(grid_md != null)
			map.put("grid_md", grid_md);
		if(grid_tdh != null)
			map.put("grid_tdh", grid_tdh);
		if(grid_kvarh != null)
			map.put("grid_kvarh", grid_kvarh);
		if(grid_frequency != null)
			map.put("grid_frequency", grid_frequency);
		if(grid_p1_reading_kvah != null)
			map.put("grid_p1_reading_kvah", grid_p1_reading_kvah);
		if(grid_p1_reading_kwh != null)
			map.put("grid_p1_reading_kwh", grid_p1_reading_kwh);
		if(grid_p1_load_kva != null)
			map.put("grid_p1_load_kva", grid_p1_load_kva);
		if(grid_p1_load_kw != null)
			map.put("grid_p1_load_kw", grid_p1_load_kw);
		if(grid_p1_voltage != null)
			map.put("grid_p1_voltage", grid_p1_voltage);
		if(grid_p1_current != null)
			map.put("grid_p1_current", grid_p1_current);
		if(grid_p1_pf != null)
			map.put("grid_p1_pf", grid_p1_pf);
		if(grid_p1_md != null)
			map.put("grid_p1_md", grid_p1_md);
		if(grid_p1_tdh != null)
			map.put("grid_p1_tdh", grid_p1_tdh);
		if(grid_p1_kvarh != null)
			map.put("grid_p1_kvarh", grid_p1_kvarh);
		if(grid_p1_frequency != null)
			map.put("grid_p1_frequency", grid_p1_frequency);
		if(grid_p2_reading_kvah != null)
			map.put("grid_p2_reading_kvah", grid_p2_reading_kvah);
		if(grid_p2_reading_kwh != null)
			map.put("grid_p2_reading_kwh", grid_p2_reading_kwh);
		if(grid_p2_load_kva != null)
			map.put("grid_p2_load_kva", grid_p2_load_kva);
		if(grid_p2_load_kw != null)
			map.put("grid_p2_load_kw", grid_p2_load_kw);
		if(grid_p2_voltage != null)
			map.put("grid_p2_voltage", grid_p2_voltage);
		if(grid_p2_current != null)
			map.put("grid_p2_current", grid_p2_current);
		if(grid_p2_pf != null)
			map.put("grid_p2_pf", grid_p2_pf);
		if(grid_p2_md != null)
			map.put("grid_p2_md", grid_p2_md);
		if(grid_p2_tdh != null)
			map.put("grid_p2_tdh", grid_p2_tdh);
		if(grid_p2_kvarh != null)
			map.put("grid_p2_kvarh", grid_p2_kvarh);
		if(grid_p2_frequency != null)
			map.put("grid_p2_frequency", grid_p2_frequency);
		if(grid_p3_reading_kvah != null)
			map.put("grid_p3_reading_kvah", grid_p3_reading_kvah);
		if(grid_p3_reading_kwh != null)
			map.put("grid_p3_reading_kwh", grid_p3_reading_kwh);
		if(grid_p3_load_kva != null)
			map.put("grid_p3_load_kva", grid_p3_load_kva);
		if(grid_p3_load_kw != null)
			map.put("grid_p3_load_kw", grid_p3_load_kw);
		if(grid_p3_voltage != null)
			map.put("grid_p3_voltage", grid_p3_voltage);
		if(grid_p3_current != null)
			map.put("grid_p3_current", grid_p3_current);
		if(grid_p3_pf != null)
			map.put("grid_p3_pf", grid_p3_pf);
		if(grid_p3_md != null)
			map.put("grid_p3_md", grid_p3_md);
		if(grid_p3_tdh != null)
			map.put("grid_p3_tdh", grid_p3_tdh);
		if(grid_p3_kvarh != null)
			map.put("grid_p3_kvarh", grid_p3_kvarh);
		if(grid_p3_frequency != null)
			map.put("grid_p3_frequency", grid_p3_frequency);
		if(dg_reading_kwh != null)
			map.put("dg_reading_kwh", dg_reading_kwh);
		if(dg_reading_kvah != null)
			map.put("dg_reading_kvah", dg_reading_kvah);
		if(dg_today_kwh != null)
			map.put("dg_today_kwh", dg_today_kwh);
		if(dg_current_month_kwh != null)
			map.put("dg_current_month_kwh", dg_current_month_kwh);
		if(dg_today_kvah != null)
			map.put("dg_today_kvah", dg_today_kvah);
		if(dg_current_month_kvah != null)
			map.put("dg_current_month_kvah", dg_current_month_kvah);
		if(dg_load_kw != null)
			map.put("dg_load_kw", dg_load_kw);
		if(dg_load_kva != null)
			map.put("dg_load_kva", dg_load_kva);
		if(dg_voltage != null)
			map.put("dg_voltage", dg_voltage);
		if(dg_current != null)
			map.put("dg_current", dg_current);
		if(dg_pf != null)
			map.put("dg_pf", dg_pf);
		if(dg_md != null)
			map.put("dg_md", dg_md);
		if(dg_tdh != null)
			map.put("dg_tdh", dg_tdh);
		if(dg_kvarh != null)
			map.put("dg_kvarh", dg_kvarh);
		if(dg_frequency != null)
			map.put("dg_frequency", dg_frequency);
		if(dg_p1_reading_kvah != null)
			map.put("dg_p1_reading_kvah", dg_p1_reading_kvah);
		if(dg_p1_reading_kwh != null)
			map.put("dg_p1_reading_kwh", dg_p1_reading_kwh);
		if(dg_p1_load_kva != null)
			map.put("dg_p1_load_kva", dg_p1_load_kva);
		if(dg_p1_load_kw != null)
			map.put("dg_p1_load_kw", dg_p1_load_kw);
		if(dg_p1_voltage != null)
			map.put("dg_p1_voltage", dg_p1_voltage);
		if(dg_p1_current != null)
			map.put("dg_p1_current", dg_p1_current);
		if(dg_p1_pf != null)
			map.put("dg_p1_pf", dg_p1_pf);
		if(dg_p1_md != null)
			map.put("dg_p1_md", dg_p1_md);
		if(dg_p1_tdh != null)
			map.put("dg_p1_tdh", dg_p1_tdh);
		if(dg_p1_kvarh != null)
			map.put("dg_p1_kvarh", dg_p1_kvarh);
		if(dg_p1_frequency != null)
			map.put("dg_p1_frequency", dg_p1_frequency);
		if(dg_p2_reading_kvah != null)
			map.put("dg_p2_reading_kvah", dg_p2_reading_kvah);
		if(dg_p2_reading_kwh != null)
			map.put("dg_p2_reading_kwh", dg_p2_reading_kwh);
		if(dg_p2_load_kva != null)
			map.put("dg_p2_load_kva", dg_p2_load_kva);
		if(dg_p2_load_kw != null)
			map.put("dg_p2_load_kw", dg_p2_load_kw);
		if(dg_p2_voltage != null)
			map.put("dg_p2_voltage", dg_p2_voltage);
		if(dg_p2_current != null)
			map.put("dg_p2_current", dg_p2_current);
		if(dg_p2_pf != null)
			map.put("dg_p2_pf", dg_p2_pf);
		if(dg_p2_md != null)
			map.put("dg_p2_md", dg_p2_md);
		if(dg_p2_tdh != null)
			map.put("dg_p2_tdh", dg_p2_tdh);
		if(dg_p2_kvarh != null)
			map.put("dg_p2_kvarh", dg_p2_kvarh);
		if(dg_p2_frequency != null)
			map.put("dg_p2_frequency", dg_p2_frequency);
		if(dg_p3_reading_kvah != null)
			map.put("dg_p3_reading_kvah", dg_p3_reading_kvah);
		if(dg_p3_reading_kwh != null)
			map.put("dg_p3_reading_kwh", dg_p3_reading_kwh);
		if(dg_p3_load_kva != null)
			map.put("dg_p3_load_kva", dg_p3_load_kva);
		if(dg_p3_load_kw != null)
			map.put("dg_p3_load_kw", dg_p3_load_kw);
		if(dg_p3_voltage != null)
			map.put("dg_p3_voltage", dg_p3_voltage);
		if(dg_p3_current != null)
			map.put("dg_p3_current", dg_p3_current);
		if(dg_p3_pf != null)
			map.put("dg_p3_pf", dg_p3_pf);
		if(dg_p3_md != null)
			map.put("dg_p3_md", dg_p3_md);
		if(dg_p3_tdh != null)
			map.put("dg_p3_tdh", dg_p3_tdh);
		if(dg_p3_kvarh != null)
			map.put("dg_p3_kvarh", dg_p3_kvarh);
		if(dg_p3_frequency != null)
			map.put("dg_p3_frequency", dg_p3_frequency);
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
		if(maintaince_mode != null)
			map.put("maintaince_mode", maintaince_mode);
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
		if(high_coolant_temperature != null)
			map.put("high_coolant_temperature", high_coolant_temperature);
		if(canopy_temperature != null)
			map.put("canopy_temperature", canopy_temperature);
		if(coolant_temperature != null)
			map.put("coolant_temperature", coolant_temperature);
		if(high_canopy_temperature != null)
			map.put("high_canopy_temperature", high_canopy_temperature);
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
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(speed != null)
			map.put("speed", speed);
		if(driveType != null)
			map.put("driveType", driveType);
		if(currentDriverId != null)
			map.put("currentDriverId", currentDriverId);
		if(engineTemperature != null)
			map.put("engineTemperature", engineTemperature);
		if(ignitionState != null)
			map.put("ignitionState", ignitionState);
		if(engineOverHeatState != null)
			map.put("engineOverHeatState", engineOverHeatState);
		if(lowBatteryState != null)
			map.put("lowBatteryState", lowBatteryState);
		if(obdLowBatteryState != null)
			map.put("obdLowBatteryState", obdLowBatteryState);
		if(batteryLevel != null)
			map.put("batteryLevel", batteryLevel);
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
		if(lastEngineStarted != null)
			map.put("lastEngineStarted", lastEngineStarted);
		if(lastEngineStopped != null)
			map.put("lastEngineStopped", lastEngineStopped);
		if(timeZone != null)
			map.put("timeZone", timeZone);
		if(fuel_type != null)
			map.put("fuel_type", fuel_type);
		if(start_reading != null)
			map.put("start_reading", start_reading);
		if(grid_state != null)
			map.put("grid_state", grid_state);
		if(timing_advance != null)
			map.put("timing_advance", timing_advance);
		if(manifoldABSPressure != null)
			map.put("manifoldABSPressure", manifoldABSPressure);
		if(start_time != null)
			map.put("start_time", start_time);
		if(current_fuel_consumption != null)
			map.put("current_fuel_consumption", current_fuel_consumption);
		if(fuel_calibration_factor != null)
			map.put("fuel_calibration_factor", fuel_calibration_factor);
		if(lowFuelState != null)
			map.put("lowFuelState", lowFuelState);
		if(lowFuelStateEnterTime != null)
			map.put("lowFuelStateEnterTime", lowFuelStateEnterTime);
		if(lowOilPressureState != null)
			map.put("lowOilPressureState", lowOilPressureState);
		if(overSpeedState != null)
			map.put("overSpeedState", overSpeedState);
		if(starterTriggered != null)
			map.put("starterTriggered", starterTriggered);
		if(waterInFuel != null)
			map.put("waterInFuel", waterInFuel);
		if(remoteControl != null)
			map.put("remoteControl", remoteControl);
		if(test != null)
			map.put("test", test);
		if(tempered != null)
			map.put("tempered", tempered);
		if(featureEngineMonitoring != null)
			map.put("featureEngineMonitoring", featureEngineMonitoring);
		if(featureTracking != null)
			map.put("featureTracking", featureTracking);
		if(currentRouteId != null)
			map.put("currentRouteId", currentRouteId);
		if(lastStopageId != null)
			map.put("lastStopageId", lastStopageId);
		if(sittingCapacity != null)
			map.put("sittingCapacity", sittingCapacity);
		if(insuranceExpiry != null)
			map.put("insuranceExpiry", insuranceExpiry);
		if(pollutionCertificateExpiry != null)
			map.put("pollutionCertificateExpiry", pollutionCertificateExpiry);
		if(vehicleFitnessExpiry != null)
			map.put("vehicleFitnessExpiry", vehicleFitnessExpiry);
		if(lastService != null)
			map.put("lastService", lastService);
		if(current_route_name != null)
			map.put("current_route_name", current_route_name);
		if(current_route_schedule != null)
			map.put("current_route_schedule", current_route_schedule);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_reached_time != null)
			map.put("last_stopage_reached_time", last_stopage_reached_time);
		if(critical_alerts != null)
			map.put("critical_alerts", critical_alerts);
		if(major_alerts != null)
			map.put("major_alerts", major_alerts);
		if(wanring_alerts != null)
			map.put("wanring_alerts", wanring_alerts);
		if(minor_alerts != null)
			map.put("minor_alerts", minor_alerts);
		if(cost != null)
			map.put("cost", cost);
		if(cost_unit != null)
			map.put("cost_unit", cost_unit);
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
		if(threshold_templete_id != null)
			map.put("threshold_templete_id", threshold_templete_id);
		if(threshold_templete_name != null)
			map.put("threshold_templete_name", threshold_templete_name);
		if(controller_name != null)
			map.put("controller_name", controller_name);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(controller_port != null)
			map.put("controller_port", controller_port);
		if(imei != null)
			map.put("imei", imei);
		if(vin != null)
			map.put("vin", vin);
		if(make_id != null)
			map.put("make_id", make_id);
		if(make_name != null)
			map.put("make_name", make_name);
		if(model_id != null)
			map.put("model_id", model_id);
		if(model_name != null)
			map.put("model_name", model_name);
		if(power_rating != null)
			map.put("power_rating", power_rating);
		if(type != null)
			map.put("type", type);
		if(sub_type != null)
			map.put("sub_type", sub_type);
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
		if(location_name != null)
			map.put("location_name", location_name);
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
		if(threshold_over_speed != null)
			map.put("threshold_over_speed", threshold_over_speed);
		if(capacity != null)
			map.put("capacity", capacity);
		if(maintainace_run_hour != null)
			map.put("maintainace_run_hour", maintainace_run_hour);
		if(today_run_time != null)
			map.put("today_run_time", today_run_time);
		if(today_fuel_consumption != null)
			map.put("today_fuel_consumption", today_fuel_consumption);
		if(average_fuel_consumption != null)
			map.put("average_fuel_consumption", average_fuel_consumption);
		if(today_fuel_loss != null)
			map.put("today_fuel_loss", today_fuel_loss);
		if(current_month_run_time != null)
			map.put("current_month_run_time", current_month_run_time);
		if(current_month_fuel_consumption != null)
			map.put("current_month_fuel_consumption", current_month_fuel_consumption);
		if(current_month_fuel_loss != null)
			map.put("current_month_fuel_loss", current_month_fuel_loss);
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
		if(alert_dg_grid_on != null)
			map.put("alert_dg_grid_on", alert_dg_grid_on);
		if(alert_dg_grid_off != null)
			map.put("alert_dg_grid_off", alert_dg_grid_off);
		if(asset_id != null)
			map.put("asset_id", asset_id);
		if(partner_id != null)
			map.put("partner_id", partner_id);
		if(tenent_id != null)
			map.put("tenent_id", tenent_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
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
		if(validateLast_grid_reading_updated(add))
			map.put("last_grid_reading_updated", last_grid_reading_updated);
		if(validateLast_dg_reading_updated(add))
			map.put("last_dg_reading_updated", last_dg_reading_updated);
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
		if(energy != null)
			map.put("energy", energy);
		if(grid_reading_kvah != null)
			map.put("grid_reading_kvah", grid_reading_kvah);
		if(grid_reading_kwh != null)
			map.put("grid_reading_kwh", grid_reading_kwh);
		if(grid_today_kwh != null)
			map.put("grid_today_kwh", grid_today_kwh);
		if(grid_current_month_kwh != null)
			map.put("grid_current_month_kwh", grid_current_month_kwh);
		if(grid_today_kvah != null)
			map.put("grid_today_kvah", grid_today_kvah);
		if(grid_current_month_kvah != null)
			map.put("grid_current_month_kvah", grid_current_month_kvah);
		if(grid_load_kva != null)
			map.put("grid_load_kva", grid_load_kva);
		if(grid_load_kw != null)
			map.put("grid_load_kw", grid_load_kw);
		if(grid_voltage != null)
			map.put("grid_voltage", grid_voltage);
		if(grid_current != null)
			map.put("grid_current", grid_current);
		if(grid_pf != null)
			map.put("grid_pf", grid_pf);
		if(grid_md != null)
			map.put("grid_md", grid_md);
		if(grid_tdh != null)
			map.put("grid_tdh", grid_tdh);
		if(grid_kvarh != null)
			map.put("grid_kvarh", grid_kvarh);
		if(grid_frequency != null)
			map.put("grid_frequency", grid_frequency);
		if(grid_p1_reading_kvah != null)
			map.put("grid_p1_reading_kvah", grid_p1_reading_kvah);
		if(grid_p1_reading_kwh != null)
			map.put("grid_p1_reading_kwh", grid_p1_reading_kwh);
		if(grid_p1_load_kva != null)
			map.put("grid_p1_load_kva", grid_p1_load_kva);
		if(grid_p1_load_kw != null)
			map.put("grid_p1_load_kw", grid_p1_load_kw);
		if(grid_p1_voltage != null)
			map.put("grid_p1_voltage", grid_p1_voltage);
		if(grid_p1_current != null)
			map.put("grid_p1_current", grid_p1_current);
		if(grid_p1_pf != null)
			map.put("grid_p1_pf", grid_p1_pf);
		if(grid_p1_md != null)
			map.put("grid_p1_md", grid_p1_md);
		if(grid_p1_tdh != null)
			map.put("grid_p1_tdh", grid_p1_tdh);
		if(grid_p1_kvarh != null)
			map.put("grid_p1_kvarh", grid_p1_kvarh);
		if(grid_p1_frequency != null)
			map.put("grid_p1_frequency", grid_p1_frequency);
		if(grid_p2_reading_kvah != null)
			map.put("grid_p2_reading_kvah", grid_p2_reading_kvah);
		if(grid_p2_reading_kwh != null)
			map.put("grid_p2_reading_kwh", grid_p2_reading_kwh);
		if(grid_p2_load_kva != null)
			map.put("grid_p2_load_kva", grid_p2_load_kva);
		if(grid_p2_load_kw != null)
			map.put("grid_p2_load_kw", grid_p2_load_kw);
		if(grid_p2_voltage != null)
			map.put("grid_p2_voltage", grid_p2_voltage);
		if(grid_p2_current != null)
			map.put("grid_p2_current", grid_p2_current);
		if(grid_p2_pf != null)
			map.put("grid_p2_pf", grid_p2_pf);
		if(grid_p2_md != null)
			map.put("grid_p2_md", grid_p2_md);
		if(grid_p2_tdh != null)
			map.put("grid_p2_tdh", grid_p2_tdh);
		if(grid_p2_kvarh != null)
			map.put("grid_p2_kvarh", grid_p2_kvarh);
		if(grid_p2_frequency != null)
			map.put("grid_p2_frequency", grid_p2_frequency);
		if(grid_p3_reading_kvah != null)
			map.put("grid_p3_reading_kvah", grid_p3_reading_kvah);
		if(grid_p3_reading_kwh != null)
			map.put("grid_p3_reading_kwh", grid_p3_reading_kwh);
		if(grid_p3_load_kva != null)
			map.put("grid_p3_load_kva", grid_p3_load_kva);
		if(grid_p3_load_kw != null)
			map.put("grid_p3_load_kw", grid_p3_load_kw);
		if(grid_p3_voltage != null)
			map.put("grid_p3_voltage", grid_p3_voltage);
		if(grid_p3_current != null)
			map.put("grid_p3_current", grid_p3_current);
		if(grid_p3_pf != null)
			map.put("grid_p3_pf", grid_p3_pf);
		if(grid_p3_md != null)
			map.put("grid_p3_md", grid_p3_md);
		if(grid_p3_tdh != null)
			map.put("grid_p3_tdh", grid_p3_tdh);
		if(grid_p3_kvarh != null)
			map.put("grid_p3_kvarh", grid_p3_kvarh);
		if(grid_p3_frequency != null)
			map.put("grid_p3_frequency", grid_p3_frequency);
		if(dg_reading_kwh != null)
			map.put("dg_reading_kwh", dg_reading_kwh);
		if(dg_reading_kvah != null)
			map.put("dg_reading_kvah", dg_reading_kvah);
		if(dg_today_kwh != null)
			map.put("dg_today_kwh", dg_today_kwh);
		if(dg_current_month_kwh != null)
			map.put("dg_current_month_kwh", dg_current_month_kwh);
		if(dg_today_kvah != null)
			map.put("dg_today_kvah", dg_today_kvah);
		if(dg_current_month_kvah != null)
			map.put("dg_current_month_kvah", dg_current_month_kvah);
		if(dg_load_kw != null)
			map.put("dg_load_kw", dg_load_kw);
		if(dg_load_kva != null)
			map.put("dg_load_kva", dg_load_kva);
		if(dg_voltage != null)
			map.put("dg_voltage", dg_voltage);
		if(dg_current != null)
			map.put("dg_current", dg_current);
		if(dg_pf != null)
			map.put("dg_pf", dg_pf);
		if(dg_md != null)
			map.put("dg_md", dg_md);
		if(dg_tdh != null)
			map.put("dg_tdh", dg_tdh);
		if(dg_kvarh != null)
			map.put("dg_kvarh", dg_kvarh);
		if(dg_frequency != null)
			map.put("dg_frequency", dg_frequency);
		if(dg_p1_reading_kvah != null)
			map.put("dg_p1_reading_kvah", dg_p1_reading_kvah);
		if(dg_p1_reading_kwh != null)
			map.put("dg_p1_reading_kwh", dg_p1_reading_kwh);
		if(dg_p1_load_kva != null)
			map.put("dg_p1_load_kva", dg_p1_load_kva);
		if(dg_p1_load_kw != null)
			map.put("dg_p1_load_kw", dg_p1_load_kw);
		if(dg_p1_voltage != null)
			map.put("dg_p1_voltage", dg_p1_voltage);
		if(dg_p1_current != null)
			map.put("dg_p1_current", dg_p1_current);
		if(dg_p1_pf != null)
			map.put("dg_p1_pf", dg_p1_pf);
		if(dg_p1_md != null)
			map.put("dg_p1_md", dg_p1_md);
		if(dg_p1_tdh != null)
			map.put("dg_p1_tdh", dg_p1_tdh);
		if(dg_p1_kvarh != null)
			map.put("dg_p1_kvarh", dg_p1_kvarh);
		if(dg_p1_frequency != null)
			map.put("dg_p1_frequency", dg_p1_frequency);
		if(dg_p2_reading_kvah != null)
			map.put("dg_p2_reading_kvah", dg_p2_reading_kvah);
		if(dg_p2_reading_kwh != null)
			map.put("dg_p2_reading_kwh", dg_p2_reading_kwh);
		if(dg_p2_load_kva != null)
			map.put("dg_p2_load_kva", dg_p2_load_kva);
		if(dg_p2_load_kw != null)
			map.put("dg_p2_load_kw", dg_p2_load_kw);
		if(dg_p2_voltage != null)
			map.put("dg_p2_voltage", dg_p2_voltage);
		if(dg_p2_current != null)
			map.put("dg_p2_current", dg_p2_current);
		if(dg_p2_pf != null)
			map.put("dg_p2_pf", dg_p2_pf);
		if(dg_p2_md != null)
			map.put("dg_p2_md", dg_p2_md);
		if(dg_p2_tdh != null)
			map.put("dg_p2_tdh", dg_p2_tdh);
		if(dg_p2_kvarh != null)
			map.put("dg_p2_kvarh", dg_p2_kvarh);
		if(dg_p2_frequency != null)
			map.put("dg_p2_frequency", dg_p2_frequency);
		if(dg_p3_reading_kvah != null)
			map.put("dg_p3_reading_kvah", dg_p3_reading_kvah);
		if(dg_p3_reading_kwh != null)
			map.put("dg_p3_reading_kwh", dg_p3_reading_kwh);
		if(dg_p3_load_kva != null)
			map.put("dg_p3_load_kva", dg_p3_load_kva);
		if(dg_p3_load_kw != null)
			map.put("dg_p3_load_kw", dg_p3_load_kw);
		if(dg_p3_voltage != null)
			map.put("dg_p3_voltage", dg_p3_voltage);
		if(dg_p3_current != null)
			map.put("dg_p3_current", dg_p3_current);
		if(dg_p3_pf != null)
			map.put("dg_p3_pf", dg_p3_pf);
		if(dg_p3_md != null)
			map.put("dg_p3_md", dg_p3_md);
		if(dg_p3_tdh != null)
			map.put("dg_p3_tdh", dg_p3_tdh);
		if(dg_p3_kvarh != null)
			map.put("dg_p3_kvarh", dg_p3_kvarh);
		if(dg_p3_frequency != null)
			map.put("dg_p3_frequency", dg_p3_frequency);
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
		if(maintaince_mode != null)
			map.put("maintaince_mode", maintaince_mode);
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
		if(high_coolant_temperature != null)
			map.put("high_coolant_temperature", high_coolant_temperature);
		if(canopy_temperature != null)
			map.put("canopy_temperature", canopy_temperature);
		if(coolant_temperature != null)
			map.put("coolant_temperature", coolant_temperature);
		if(high_canopy_temperature != null)
			map.put("high_canopy_temperature", high_canopy_temperature);
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
		if(langitude != null)
			map.put("langitude", langitude);
		if(latitude != null)
			map.put("latitude", latitude);
		if(speed != null)
			map.put("speed", speed);
		if(driveType != null)
			map.put("driveType", driveType);
		if(currentDriverId != null)
			map.put("currentDriverId", currentDriverId);
		if(engineTemperature != null)
			map.put("engineTemperature", engineTemperature);
		if(ignitionState != null)
			map.put("ignitionState", ignitionState);
		if(engineOverHeatState != null)
			map.put("engineOverHeatState", engineOverHeatState);
		if(lowBatteryState != null)
			map.put("lowBatteryState", lowBatteryState);
		if(obdLowBatteryState != null)
			map.put("obdLowBatteryState", obdLowBatteryState);
		if(batteryLevel != null)
			map.put("batteryLevel", batteryLevel);
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
		if(lastEngineStarted != null)
			map.put("lastEngineStarted", lastEngineStarted);
		if(lastEngineStopped != null)
			map.put("lastEngineStopped", lastEngineStopped);
		if(timeZone != null)
			map.put("timeZone", timeZone);
		if(fuel_type != null)
			map.put("fuel_type", fuel_type);
		if(start_reading != null)
			map.put("start_reading", start_reading);
		if(grid_state != null)
			map.put("grid_state", grid_state);
		if(timing_advance != null)
			map.put("timing_advance", timing_advance);
		if(manifoldABSPressure != null)
			map.put("manifoldABSPressure", manifoldABSPressure);
		if(start_time != null)
			map.put("start_time", start_time);
		if(current_fuel_consumption != null)
			map.put("current_fuel_consumption", current_fuel_consumption);
		if(fuel_calibration_factor != null)
			map.put("fuel_calibration_factor", fuel_calibration_factor);
		if(lowFuelState != null)
			map.put("lowFuelState", lowFuelState);
		if(lowFuelStateEnterTime != null)
			map.put("lowFuelStateEnterTime", lowFuelStateEnterTime);
		if(lowOilPressureState != null)
			map.put("lowOilPressureState", lowOilPressureState);
		if(overSpeedState != null)
			map.put("overSpeedState", overSpeedState);
		if(starterTriggered != null)
			map.put("starterTriggered", starterTriggered);
		if(waterInFuel != null)
			map.put("waterInFuel", waterInFuel);
		if(remoteControl != null)
			map.put("remoteControl", remoteControl);
		if(test != null)
			map.put("test", test);
		if(tempered != null)
			map.put("tempered", tempered);
		if(featureEngineMonitoring != null)
			map.put("featureEngineMonitoring", featureEngineMonitoring);
		if(featureTracking != null)
			map.put("featureTracking", featureTracking);
		if(currentRouteId != null)
			map.put("currentRouteId", currentRouteId);
		if(lastStopageId != null)
			map.put("lastStopageId", lastStopageId);
		if(sittingCapacity != null)
			map.put("sittingCapacity", sittingCapacity);
		if(insuranceExpiry != null)
			map.put("insuranceExpiry", insuranceExpiry);
		if(pollutionCertificateExpiry != null)
			map.put("pollutionCertificateExpiry", pollutionCertificateExpiry);
		if(vehicleFitnessExpiry != null)
			map.put("vehicleFitnessExpiry", vehicleFitnessExpiry);
		if(lastService != null)
			map.put("lastService", lastService);
		if(current_route_name != null)
			map.put("current_route_name", current_route_name);
		if(current_route_schedule != null)
			map.put("current_route_schedule", current_route_schedule);
		if(last_stopage_name != null)
			map.put("last_stopage_name", last_stopage_name);
		if(last_stopage_reached_time != null)
			map.put("last_stopage_reached_time", last_stopage_reached_time);
		if(critical_alerts != null)
			map.put("critical_alerts", critical_alerts);
		if(major_alerts != null)
			map.put("major_alerts", major_alerts);
		if(wanring_alerts != null)
			map.put("wanring_alerts", wanring_alerts);
		if(minor_alerts != null)
			map.put("minor_alerts", minor_alerts);
		if(cost != null)
			map.put("cost", cost);
		if(cost_unit != null)
			map.put("cost_unit", cost_unit);
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
		threshold_templete_id = (String) map.get("threshold_templete_id");
		threshold_templete_name = (String) map.get("threshold_templete_name");
		controller_name = (String) map.get("controller_name");
		controller_id = (String) map.get("controller_id");
		controller_port = (Long) map.get("controller_port");
		imei = (String) map.get("imei");
		vin = (String) map.get("vin");
		make_id = (String) map.get("make_id");
		model_id = (String) map.get("model_id");
		power_rating = (Double) map.get("power_rating");
		type = (String) map.get("type");
		sub_type = (String) map.get("sub_type");
		applaince_type_id = (String) map.get("applaince_type_id");
		consumer_id = (String) map.get("consumer_id");
		manager = (String) map.get("manager");
		model = (String) map.get("model");
		location_id = (String) map.get("location_id");
		location_name = (String) map.get("location_name");
		sub_location_id = (String) map.get("sub_location_id");
		site_id = (String) map.get("site_id");
		tank_id = (String) map.get("tank_id");
		dg_unit_opening = (Double) map.get("dg_unit_opening");
		dg_unit_consumed = (Double) map.get("dg_unit_consumed");
		dg_unit_closing = (Double) map.get("dg_unit_closing");
		grid_unit_opening = (Double) map.get("grid_unit_opening");
		grid_unit_consumed = (Double) map.get("grid_unit_consumed");
		grid_unit_closing = (Double) map.get("grid_unit_closing");
		serial_no = (String) map.get("serial_no");
		rf_tag_id = (String) map.get("rf_tag_id");
		manufecturing_date = (String) map.get("manufecturing_date");
		next_servicing_date = (String) map.get("next_servicing_date");
		threshold_fuel_level = (Double) map.get("threshold_fuel_level");
		threshold_over_speed = (Integer) map.get("threshold_over_speed");
		capacity = (Double) map.get("capacity");
		maintainace_run_hour = (Integer) map.get("maintainace_run_hour");
		today_run_time = (Integer) map.get("today_run_time");
		today_fuel_consumption = (Double) map.get("today_fuel_consumption");
		average_fuel_consumption = (Double) map.get("average_fuel_consumption");
		today_fuel_loss = (Double) map.get("today_fuel_loss");
		current_month_run_time = (Integer) map.get("current_month_run_time");
		current_month_fuel_consumption = (Double) map.get("current_month_fuel_consumption");
		current_month_fuel_loss = (Double) map.get("current_month_fuel_loss");
		threshold_temperature_min_level = (Double) map.get("threshold_temperature_min_level");
		threshold_temperature_max_level = (Double) map.get("threshold_temperature_max_level");
		threshold_voltage_min_level = (Double) map.get("threshold_voltage_min_level");
		threshold_voltage_max_level = (Double) map.get("threshold_voltage_max_level");
		threshold_current_min_level = (Double) map.get("threshold_current_min_level");
		threshold_current_max_level = (Double) map.get("threshold_current_max_level");
		threshold_duration = (Double) map.get("threshold_duration");
		alert_dg_grid_on = (String) map.get("alert_dg_grid_on");
		alert_dg_grid_off = (String) map.get("alert_dg_grid_off");
		asset_id = (String) map.get("asset_id");
		partner_id = (String) map.get("partner_id");
		tenent_id = (String) map.get("tenent_id");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		ex_type = (String) map.get("ex_type");
		interface_type = (String) map.get("interface_type");
		battery_number = (Integer) map.get("battery_number");
		number_of_batteries = (Integer) map.get("number_of_batteries");
		deploy_type = (String) map.get("deploy_type");
		connected = (String) map.get("connected");
		config = (String) map.get("config");
		battery_status = (String) map.get("battery_status");
		battery_level = (Integer) map.get("battery_level");
		last_reading = (Double) map.get("last_reading");
		last_reading_updated = (Long) map.get("last_reading_updated");
		last_grid_reading_updated = (Long) map.get("last_grid_reading_updated");
		last_dg_reading_updated = (Long) map.get("last_dg_reading_updated");
		dg_reading = (Double) map.get("dg_reading");
		grid_reading = (Double) map.get("grid_reading");
		voltage = (Integer) map.get("voltage");
		current = (Integer) map.get("current");
		power = (Double) map.get("power");
		energy = (Double) map.get("energy");
		grid_reading_kvah = (Double) map.get("grid_reading_kvah");
		grid_reading_kwh = (Double) map.get("grid_reading_kwh");
		grid_today_kwh = (Double) map.get("grid_today_kwh");
		grid_current_month_kwh = (Double) map.get("grid_current_month_kwh");
		grid_today_kvah = (Double) map.get("grid_today_kvah");
		grid_current_month_kvah = (Double) map.get("grid_current_month_kvah");
		grid_load_kva = (Double) map.get("grid_load_kva");
		grid_load_kw = (Double) map.get("grid_load_kw");
		grid_voltage = (Double) map.get("grid_voltage");
		grid_current = (Double) map.get("grid_current");
		grid_pf = (Double) map.get("grid_pf");
		grid_md = (Double) map.get("grid_md");
		grid_tdh = (Double) map.get("grid_tdh");
		grid_kvarh = (Double) map.get("grid_kvarh");
		grid_frequency = (Long) map.get("grid_frequency");
		grid_p1_reading_kvah = (Double) map.get("grid_p1_reading_kvah");
		grid_p1_reading_kwh = (Double) map.get("grid_p1_reading_kwh");
		grid_p1_load_kva = (Double) map.get("grid_p1_load_kva");
		grid_p1_load_kw = (Double) map.get("grid_p1_load_kw");
		grid_p1_voltage = (Double) map.get("grid_p1_voltage");
		grid_p1_current = (Double) map.get("grid_p1_current");
		grid_p1_pf = (Double) map.get("grid_p1_pf");
		grid_p1_md = (Double) map.get("grid_p1_md");
		grid_p1_tdh = (Double) map.get("grid_p1_tdh");
		grid_p1_kvarh = (Double) map.get("grid_p1_kvarh");
		grid_p1_frequency = (Double) map.get("grid_p1_frequency");
		grid_p2_reading_kvah = (Double) map.get("grid_p2_reading_kvah");
		grid_p2_reading_kwh = (Double) map.get("grid_p2_reading_kwh");
		grid_p2_load_kva = (Double) map.get("grid_p2_load_kva");
		grid_p2_load_kw = (Double) map.get("grid_p2_load_kw");
		grid_p2_voltage = (Double) map.get("grid_p2_voltage");
		grid_p2_current = (Double) map.get("grid_p2_current");
		grid_p2_pf = (Double) map.get("grid_p2_pf");
		grid_p2_md = (Double) map.get("grid_p2_md");
		grid_p2_tdh = (Double) map.get("grid_p2_tdh");
		grid_p2_kvarh = (Double) map.get("grid_p2_kvarh");
		grid_p2_frequency = (Double) map.get("grid_p2_frequency");
		grid_p3_reading_kvah = (Double) map.get("grid_p3_reading_kvah");
		grid_p3_reading_kwh = (Double) map.get("grid_p3_reading_kwh");
		grid_p3_load_kva = (Double) map.get("grid_p3_load_kva");
		grid_p3_load_kw = (Double) map.get("grid_p3_load_kw");
		grid_p3_voltage = (Double) map.get("grid_p3_voltage");
		grid_p3_current = (Double) map.get("grid_p3_current");
		grid_p3_pf = (Double) map.get("grid_p3_pf");
		grid_p3_md = (Double) map.get("grid_p3_md");
		grid_p3_tdh = (Double) map.get("grid_p3_tdh");
		grid_p3_kvarh = (Double) map.get("grid_p3_kvarh");
		grid_p3_frequency = (Double) map.get("grid_p3_frequency");
		dg_reading_kwh = (Double) map.get("dg_reading_kwh");
		dg_reading_kvah = (Double) map.get("dg_reading_kvah");
		dg_today_kwh = (Double) map.get("dg_today_kwh");
		dg_current_month_kwh = (Double) map.get("dg_current_month_kwh");
		dg_today_kvah = (Double) map.get("dg_today_kvah");
		dg_current_month_kvah = (Double) map.get("dg_current_month_kvah");
		dg_load_kw = (Double) map.get("dg_load_kw");
		dg_load_kva = (Double) map.get("dg_load_kva");
		dg_voltage = (Double) map.get("dg_voltage");
		dg_current = (Double) map.get("dg_current");
		dg_pf = (Double) map.get("dg_pf");
		dg_md = (Double) map.get("dg_md");
		dg_tdh = (Double) map.get("dg_tdh");
		dg_kvarh = (Double) map.get("dg_kvarh");
		dg_frequency = (Double) map.get("dg_frequency");
		dg_p1_reading_kvah = (Double) map.get("dg_p1_reading_kvah");
		dg_p1_reading_kwh = (Double) map.get("dg_p1_reading_kwh");
		dg_p1_load_kva = (Double) map.get("dg_p1_load_kva");
		dg_p1_load_kw = (Double) map.get("dg_p1_load_kw");
		dg_p1_voltage = (Double) map.get("dg_p1_voltage");
		dg_p1_current = (Double) map.get("dg_p1_current");
		dg_p1_pf = (Double) map.get("dg_p1_pf");
		dg_p1_md = (Double) map.get("dg_p1_md");
		dg_p1_tdh = (Double) map.get("dg_p1_tdh");
		dg_p1_kvarh = (Double) map.get("dg_p1_kvarh");
		dg_p1_frequency = (Double) map.get("dg_p1_frequency");
		dg_p2_reading_kvah = (Double) map.get("dg_p2_reading_kvah");
		dg_p2_reading_kwh = (Double) map.get("dg_p2_reading_kwh");
		dg_p2_load_kva = (Double) map.get("dg_p2_load_kva");
		dg_p2_load_kw = (Double) map.get("dg_p2_load_kw");
		dg_p2_voltage = (Double) map.get("dg_p2_voltage");
		dg_p2_current = (Double) map.get("dg_p2_current");
		dg_p2_pf = (Double) map.get("dg_p2_pf");
		dg_p2_md = (Double) map.get("dg_p2_md");
		dg_p2_tdh = (Double) map.get("dg_p2_tdh");
		dg_p2_kvarh = (Double) map.get("dg_p2_kvarh");
		dg_p2_frequency = (Double) map.get("dg_p2_frequency");
		dg_p3_reading_kvah = (Double) map.get("dg_p3_reading_kvah");
		dg_p3_reading_kwh = (Double) map.get("dg_p3_reading_kwh");
		dg_p3_load_kva = (Double) map.get("dg_p3_load_kva");
		dg_p3_load_kw = (Double) map.get("dg_p3_load_kw");
		dg_p3_voltage = (Double) map.get("dg_p3_voltage");
		dg_p3_current = (Double) map.get("dg_p3_current");
		dg_p3_pf = (Double) map.get("dg_p3_pf");
		dg_p3_md = (Double) map.get("dg_p3_md");
		dg_p3_tdh = (Double) map.get("dg_p3_tdh");
		dg_p3_kvarh = (Double) map.get("dg_p3_kvarh");
		dg_p3_frequency = (Double) map.get("dg_p3_frequency");
		temperature = (Double) map.get("temperature");
		humidity = (Double) map.get("humidity");
		mode = (String) map.get("mode");
		level = (Integer) map.get("level");
		level_float = (Double) map.get("level_float");
		fuel_level = (Double) map.get("fuel_level");
		fuel_quantity = (Double) map.get("fuel_quantity");
		state = (String) map.get("state");
		maintaince_mode = (String) map.get("maintaince_mode");
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
		high_coolant_temperature = (String) map.get("high_coolant_temperature");
		canopy_temperature = (Double) map.get("canopy_temperature");
		coolant_temperature = (Double) map.get("coolant_temperature");
		high_canopy_temperature = (String) map.get("high_canopy_temperature");
		lastProcessedState = (String) map.get("lastProcessedState");
		lastProcessedTime = (Long) map.get("lastProcessedTime");
		charging_state = (String) map.get("charging_state");
		last_processed_fuel_quantity = (Double) map.get("last_processed_fuel_quantity");
		last_processed_db_reading = (Double) map.get("last_processed_db_reading");
		last_processed_grid_reading = (Double) map.get("last_processed_grid_reading");
		langitude = (String) map.get("langitude");
		latitude = (String) map.get("latitude");
		speed = (Integer) map.get("speed");
		driveType = (String) map.get("driveType");
		currentDriverId = (String) map.get("currentDriverId");
		engineTemperature = (Double) map.get("engineTemperature");
		ignitionState = (String) map.get("ignitionState");
		engineOverHeatState = (String) map.get("engineOverHeatState");
		lowBatteryState = (String) map.get("lowBatteryState");
		obdLowBatteryState = (String) map.get("obdLowBatteryState");
		batteryLevel = (Double) map.get("batteryLevel");
		airFlow = (Integer) map.get("airFlow");
		atmoshericPressure = (Double) map.get("atmoshericPressure");
		engineLoad = (Integer) map.get("engineLoad");
		gpsStatus = (String) map.get("gpsStatus");
		intakeAirTemperature = (Integer) map.get("intakeAirTemperature");
		oilPressure = (Double) map.get("oilPressure");
		rpm = (Integer) map.get("rpm");
		trottlePosition = (Integer) map.get("trottlePosition");
		batteryVoltage = (Double) map.get("batteryVoltage");
		intakeTubeAbsolutePressure = (Double) map.get("intakeTubeAbsolutePressure");
		numberOfDTC = (Integer) map.get("numberOfDTC");
		lastEngineStarted = (Long) map.get("lastEngineStarted");
		lastEngineStopped = (Long) map.get("lastEngineStopped");
		timeZone = (String) map.get("timeZone");
		fuel_type = (String) map.get("fuel_type");
		start_reading = (Double) map.get("start_reading");
		grid_state = (String) map.get("grid_state");
		timing_advance = (Integer) map.get("timing_advance");
		manifoldABSPressure = (Integer) map.get("manifoldABSPressure");
		start_time = (Long) map.get("start_time");
		current_fuel_consumption = (Double) map.get("current_fuel_consumption");
		fuel_calibration_factor = (Double) map.get("fuel_calibration_factor");
		lowFuelState = (String) map.get("lowFuelState");
		lowFuelStateEnterTime = (Long) map.get("lowFuelStateEnterTime");
		lowOilPressureState = (String) map.get("lowOilPressureState");
		overSpeedState = (String) map.get("overSpeedState");
		starterTriggered = (String) map.get("starterTriggered");
		waterInFuel = (String) map.get("waterInFuel");
		remoteControl = (String) map.get("remoteControl");
		test = (String) map.get("test");
		tempered = (String) map.get("tempered");
		featureEngineMonitoring = (String) map.get("featureEngineMonitoring");
		featureTracking = (String) map.get("featureTracking");
		currentRouteId = (String) map.get("currentRouteId");
		lastStopageId = (String) map.get("lastStopageId");
		sittingCapacity = (Long) map.get("sittingCapacity");
		insuranceExpiry = (String) map.get("insuranceExpiry");
		pollutionCertificateExpiry = (String) map.get("pollutionCertificateExpiry");
		vehicleFitnessExpiry = (String) map.get("vehicleFitnessExpiry");
		lastService = (String) map.get("lastService");
		critical_alerts = (Long) map.get("critical_alerts");
		major_alerts = (Long) map.get("major_alerts");
		wanring_alerts = (Long) map.get("wanring_alerts");
		minor_alerts = (Long) map.get("minor_alerts");
		cost = (Double) map.get("cost");
		cost_unit = (String) map.get("cost_unit");
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

		Object threshold_templete_idObj = map.get("threshold_templete_id");
		if(threshold_templete_idObj != null)
			threshold_templete_id = threshold_templete_idObj.toString();

		Object threshold_templete_nameObj = map.get("threshold_templete_name");
		if(threshold_templete_nameObj != null)
			threshold_templete_name = threshold_templete_nameObj.toString();

		Object controller_nameObj = map.get("controller_name");
		if(controller_nameObj != null)
			controller_name = controller_nameObj.toString();

		Object controller_idObj = map.get("controller_id");
		if(controller_idObj != null)
			controller_id = controller_idObj.toString();

		Object controller_portObj = map.get("controller_port");
		if(controller_portObj != null)
			controller_port = new Long(controller_portObj.toString());

		Object imeiObj = map.get("imei");
		if(imeiObj != null)
			imei = imeiObj.toString();

		Object vinObj = map.get("vin");
		if(vinObj != null)
			vin = vinObj.toString();

		Object make_idObj = map.get("make_id");
		if(make_idObj != null)
			make_id = make_idObj.toString();

		Object model_idObj = map.get("model_id");
		if(model_idObj != null)
			model_id = model_idObj.toString();

		Object power_ratingObj = map.get("power_rating");
		if(power_ratingObj != null)
			power_rating = new Double(power_ratingObj.toString());

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object sub_typeObj = map.get("sub_type");
		if(sub_typeObj != null)
			sub_type = sub_typeObj.toString();

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

		Object location_nameObj = map.get("location_name");
		if(location_nameObj != null)
			location_name = location_nameObj.toString();

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

		Object threshold_over_speedObj = map.get("threshold_over_speed");
		if(threshold_over_speedObj != null)
			threshold_over_speed = new Integer(threshold_over_speedObj.toString());

		Object capacityObj = map.get("capacity");
		if(capacityObj != null)
			capacity = new Double(capacityObj.toString());

		Object maintainace_run_hourObj = map.get("maintainace_run_hour");
		if(maintainace_run_hourObj != null)
			maintainace_run_hour = new Integer(maintainace_run_hourObj.toString());

		Object today_run_timeObj = map.get("today_run_time");
		if(today_run_timeObj != null)
			today_run_time = new Integer(today_run_timeObj.toString());

		Object today_fuel_consumptionObj = map.get("today_fuel_consumption");
		if(today_fuel_consumptionObj != null)
			today_fuel_consumption = new Double(today_fuel_consumptionObj.toString());

		Object average_fuel_consumptionObj = map.get("average_fuel_consumption");
		if(average_fuel_consumptionObj != null)
			average_fuel_consumption = new Double(average_fuel_consumptionObj.toString());

		Object today_fuel_lossObj = map.get("today_fuel_loss");
		if(today_fuel_lossObj != null)
			today_fuel_loss = new Double(today_fuel_lossObj.toString());

		Object current_month_run_timeObj = map.get("current_month_run_time");
		if(current_month_run_timeObj != null)
			current_month_run_time = new Integer(current_month_run_timeObj.toString());

		Object current_month_fuel_consumptionObj = map.get("current_month_fuel_consumption");
		if(current_month_fuel_consumptionObj != null)
			current_month_fuel_consumption = new Double(current_month_fuel_consumptionObj.toString());

		Object current_month_fuel_lossObj = map.get("current_month_fuel_loss");
		if(current_month_fuel_lossObj != null)
			current_month_fuel_loss = new Double(current_month_fuel_lossObj.toString());

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

		Object alert_dg_grid_onObj = map.get("alert_dg_grid_on");
		if(alert_dg_grid_onObj != null)
			alert_dg_grid_on = alert_dg_grid_onObj.toString();

		Object alert_dg_grid_offObj = map.get("alert_dg_grid_off");
		if(alert_dg_grid_offObj != null)
			alert_dg_grid_off = alert_dg_grid_offObj.toString();

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

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

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
			last_reading_updated = new Long(last_reading_updatedObj.toString());

		Object last_grid_reading_updatedObj = map.get("last_grid_reading_updated");
		if(last_grid_reading_updatedObj != null)
			last_grid_reading_updated = new Long(last_grid_reading_updatedObj.toString());

		Object last_dg_reading_updatedObj = map.get("last_dg_reading_updated");
		if(last_dg_reading_updatedObj != null)
			last_dg_reading_updated = new Long(last_dg_reading_updatedObj.toString());

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

		Object energyObj = map.get("energy");
		if(energyObj != null)
			energy = new Double(energyObj.toString());

		Object grid_reading_kvahObj = map.get("grid_reading_kvah");
		if(grid_reading_kvahObj != null)
			grid_reading_kvah = new Double(grid_reading_kvahObj.toString());

		Object grid_reading_kwhObj = map.get("grid_reading_kwh");
		if(grid_reading_kwhObj != null)
			grid_reading_kwh = new Double(grid_reading_kwhObj.toString());

		Object grid_today_kwhObj = map.get("grid_today_kwh");
		if(grid_today_kwhObj != null)
			grid_today_kwh = new Double(grid_today_kwhObj.toString());

		Object grid_current_month_kwhObj = map.get("grid_current_month_kwh");
		if(grid_current_month_kwhObj != null)
			grid_current_month_kwh = new Double(grid_current_month_kwhObj.toString());

		Object grid_today_kvahObj = map.get("grid_today_kvah");
		if(grid_today_kvahObj != null)
			grid_today_kvah = new Double(grid_today_kvahObj.toString());

		Object grid_current_month_kvahObj = map.get("grid_current_month_kvah");
		if(grid_current_month_kvahObj != null)
			grid_current_month_kvah = new Double(grid_current_month_kvahObj.toString());

		Object grid_load_kvaObj = map.get("grid_load_kva");
		if(grid_load_kvaObj != null)
			grid_load_kva = new Double(grid_load_kvaObj.toString());

		Object grid_load_kwObj = map.get("grid_load_kw");
		if(grid_load_kwObj != null)
			grid_load_kw = new Double(grid_load_kwObj.toString());

		Object grid_voltageObj = map.get("grid_voltage");
		if(grid_voltageObj != null)
			grid_voltage = new Double(grid_voltageObj.toString());

		Object grid_currentObj = map.get("grid_current");
		if(grid_currentObj != null)
			grid_current = new Double(grid_currentObj.toString());

		Object grid_pfObj = map.get("grid_pf");
		if(grid_pfObj != null)
			grid_pf = new Double(grid_pfObj.toString());

		Object grid_mdObj = map.get("grid_md");
		if(grid_mdObj != null)
			grid_md = new Double(grid_mdObj.toString());

		Object grid_tdhObj = map.get("grid_tdh");
		if(grid_tdhObj != null)
			grid_tdh = new Double(grid_tdhObj.toString());

		Object grid_kvarhObj = map.get("grid_kvarh");
		if(grid_kvarhObj != null)
			grid_kvarh = new Double(grid_kvarhObj.toString());

		Object grid_frequencyObj = map.get("grid_frequency");
		if(grid_frequencyObj != null)
			grid_frequency = new Long(grid_frequencyObj.toString());

		Object grid_p1_reading_kvahObj = map.get("grid_p1_reading_kvah");
		if(grid_p1_reading_kvahObj != null)
			grid_p1_reading_kvah = new Double(grid_p1_reading_kvahObj.toString());

		Object grid_p1_reading_kwhObj = map.get("grid_p1_reading_kwh");
		if(grid_p1_reading_kwhObj != null)
			grid_p1_reading_kwh = new Double(grid_p1_reading_kwhObj.toString());

		Object grid_p1_load_kvaObj = map.get("grid_p1_load_kva");
		if(grid_p1_load_kvaObj != null)
			grid_p1_load_kva = new Double(grid_p1_load_kvaObj.toString());

		Object grid_p1_load_kwObj = map.get("grid_p1_load_kw");
		if(grid_p1_load_kwObj != null)
			grid_p1_load_kw = new Double(grid_p1_load_kwObj.toString());

		Object grid_p1_voltageObj = map.get("grid_p1_voltage");
		if(grid_p1_voltageObj != null)
			grid_p1_voltage = new Double(grid_p1_voltageObj.toString());

		Object grid_p1_currentObj = map.get("grid_p1_current");
		if(grid_p1_currentObj != null)
			grid_p1_current = new Double(grid_p1_currentObj.toString());

		Object grid_p1_pfObj = map.get("grid_p1_pf");
		if(grid_p1_pfObj != null)
			grid_p1_pf = new Double(grid_p1_pfObj.toString());

		Object grid_p1_mdObj = map.get("grid_p1_md");
		if(grid_p1_mdObj != null)
			grid_p1_md = new Double(grid_p1_mdObj.toString());

		Object grid_p1_tdhObj = map.get("grid_p1_tdh");
		if(grid_p1_tdhObj != null)
			grid_p1_tdh = new Double(grid_p1_tdhObj.toString());

		Object grid_p1_kvarhObj = map.get("grid_p1_kvarh");
		if(grid_p1_kvarhObj != null)
			grid_p1_kvarh = new Double(grid_p1_kvarhObj.toString());

		Object grid_p1_frequencyObj = map.get("grid_p1_frequency");
		if(grid_p1_frequencyObj != null)
			grid_p1_frequency = new Double(grid_p1_frequencyObj.toString());

		Object grid_p2_reading_kvahObj = map.get("grid_p2_reading_kvah");
		if(grid_p2_reading_kvahObj != null)
			grid_p2_reading_kvah = new Double(grid_p2_reading_kvahObj.toString());

		Object grid_p2_reading_kwhObj = map.get("grid_p2_reading_kwh");
		if(grid_p2_reading_kwhObj != null)
			grid_p2_reading_kwh = new Double(grid_p2_reading_kwhObj.toString());

		Object grid_p2_load_kvaObj = map.get("grid_p2_load_kva");
		if(grid_p2_load_kvaObj != null)
			grid_p2_load_kva = new Double(grid_p2_load_kvaObj.toString());

		Object grid_p2_load_kwObj = map.get("grid_p2_load_kw");
		if(grid_p2_load_kwObj != null)
			grid_p2_load_kw = new Double(grid_p2_load_kwObj.toString());

		Object grid_p2_voltageObj = map.get("grid_p2_voltage");
		if(grid_p2_voltageObj != null)
			grid_p2_voltage = new Double(grid_p2_voltageObj.toString());

		Object grid_p2_currentObj = map.get("grid_p2_current");
		if(grid_p2_currentObj != null)
			grid_p2_current = new Double(grid_p2_currentObj.toString());

		Object grid_p2_pfObj = map.get("grid_p2_pf");
		if(grid_p2_pfObj != null)
			grid_p2_pf = new Double(grid_p2_pfObj.toString());

		Object grid_p2_mdObj = map.get("grid_p2_md");
		if(grid_p2_mdObj != null)
			grid_p2_md = new Double(grid_p2_mdObj.toString());

		Object grid_p2_tdhObj = map.get("grid_p2_tdh");
		if(grid_p2_tdhObj != null)
			grid_p2_tdh = new Double(grid_p2_tdhObj.toString());

		Object grid_p2_kvarhObj = map.get("grid_p2_kvarh");
		if(grid_p2_kvarhObj != null)
			grid_p2_kvarh = new Double(grid_p2_kvarhObj.toString());

		Object grid_p2_frequencyObj = map.get("grid_p2_frequency");
		if(grid_p2_frequencyObj != null)
			grid_p2_frequency = new Double(grid_p2_frequencyObj.toString());

		Object grid_p3_reading_kvahObj = map.get("grid_p3_reading_kvah");
		if(grid_p3_reading_kvahObj != null)
			grid_p3_reading_kvah = new Double(grid_p3_reading_kvahObj.toString());

		Object grid_p3_reading_kwhObj = map.get("grid_p3_reading_kwh");
		if(grid_p3_reading_kwhObj != null)
			grid_p3_reading_kwh = new Double(grid_p3_reading_kwhObj.toString());

		Object grid_p3_load_kvaObj = map.get("grid_p3_load_kva");
		if(grid_p3_load_kvaObj != null)
			grid_p3_load_kva = new Double(grid_p3_load_kvaObj.toString());

		Object grid_p3_load_kwObj = map.get("grid_p3_load_kw");
		if(grid_p3_load_kwObj != null)
			grid_p3_load_kw = new Double(grid_p3_load_kwObj.toString());

		Object grid_p3_voltageObj = map.get("grid_p3_voltage");
		if(grid_p3_voltageObj != null)
			grid_p3_voltage = new Double(grid_p3_voltageObj.toString());

		Object grid_p3_currentObj = map.get("grid_p3_current");
		if(grid_p3_currentObj != null)
			grid_p3_current = new Double(grid_p3_currentObj.toString());

		Object grid_p3_pfObj = map.get("grid_p3_pf");
		if(grid_p3_pfObj != null)
			grid_p3_pf = new Double(grid_p3_pfObj.toString());

		Object grid_p3_mdObj = map.get("grid_p3_md");
		if(grid_p3_mdObj != null)
			grid_p3_md = new Double(grid_p3_mdObj.toString());

		Object grid_p3_tdhObj = map.get("grid_p3_tdh");
		if(grid_p3_tdhObj != null)
			grid_p3_tdh = new Double(grid_p3_tdhObj.toString());

		Object grid_p3_kvarhObj = map.get("grid_p3_kvarh");
		if(grid_p3_kvarhObj != null)
			grid_p3_kvarh = new Double(grid_p3_kvarhObj.toString());

		Object grid_p3_frequencyObj = map.get("grid_p3_frequency");
		if(grid_p3_frequencyObj != null)
			grid_p3_frequency = new Double(grid_p3_frequencyObj.toString());

		Object dg_reading_kwhObj = map.get("dg_reading_kwh");
		if(dg_reading_kwhObj != null)
			dg_reading_kwh = new Double(dg_reading_kwhObj.toString());

		Object dg_reading_kvahObj = map.get("dg_reading_kvah");
		if(dg_reading_kvahObj != null)
			dg_reading_kvah = new Double(dg_reading_kvahObj.toString());

		Object dg_today_kwhObj = map.get("dg_today_kwh");
		if(dg_today_kwhObj != null)
			dg_today_kwh = new Double(dg_today_kwhObj.toString());

		Object dg_current_month_kwhObj = map.get("dg_current_month_kwh");
		if(dg_current_month_kwhObj != null)
			dg_current_month_kwh = new Double(dg_current_month_kwhObj.toString());

		Object dg_today_kvahObj = map.get("dg_today_kvah");
		if(dg_today_kvahObj != null)
			dg_today_kvah = new Double(dg_today_kvahObj.toString());

		Object dg_current_month_kvahObj = map.get("dg_current_month_kvah");
		if(dg_current_month_kvahObj != null)
			dg_current_month_kvah = new Double(dg_current_month_kvahObj.toString());

		Object dg_load_kwObj = map.get("dg_load_kw");
		if(dg_load_kwObj != null)
			dg_load_kw = new Double(dg_load_kwObj.toString());

		Object dg_load_kvaObj = map.get("dg_load_kva");
		if(dg_load_kvaObj != null)
			dg_load_kva = new Double(dg_load_kvaObj.toString());

		Object dg_voltageObj = map.get("dg_voltage");
		if(dg_voltageObj != null)
			dg_voltage = new Double(dg_voltageObj.toString());

		Object dg_currentObj = map.get("dg_current");
		if(dg_currentObj != null)
			dg_current = new Double(dg_currentObj.toString());

		Object dg_pfObj = map.get("dg_pf");
		if(dg_pfObj != null)
			dg_pf = new Double(dg_pfObj.toString());

		Object dg_mdObj = map.get("dg_md");
		if(dg_mdObj != null)
			dg_md = new Double(dg_mdObj.toString());

		Object dg_tdhObj = map.get("dg_tdh");
		if(dg_tdhObj != null)
			dg_tdh = new Double(dg_tdhObj.toString());

		Object dg_kvarhObj = map.get("dg_kvarh");
		if(dg_kvarhObj != null)
			dg_kvarh = new Double(dg_kvarhObj.toString());

		Object dg_frequencyObj = map.get("dg_frequency");
		if(dg_frequencyObj != null)
			dg_frequency = new Double(dg_frequencyObj.toString());

		Object dg_p1_reading_kvahObj = map.get("dg_p1_reading_kvah");
		if(dg_p1_reading_kvahObj != null)
			dg_p1_reading_kvah = new Double(dg_p1_reading_kvahObj.toString());

		Object dg_p1_reading_kwhObj = map.get("dg_p1_reading_kwh");
		if(dg_p1_reading_kwhObj != null)
			dg_p1_reading_kwh = new Double(dg_p1_reading_kwhObj.toString());

		Object dg_p1_load_kvaObj = map.get("dg_p1_load_kva");
		if(dg_p1_load_kvaObj != null)
			dg_p1_load_kva = new Double(dg_p1_load_kvaObj.toString());

		Object dg_p1_load_kwObj = map.get("dg_p1_load_kw");
		if(dg_p1_load_kwObj != null)
			dg_p1_load_kw = new Double(dg_p1_load_kwObj.toString());

		Object dg_p1_voltageObj = map.get("dg_p1_voltage");
		if(dg_p1_voltageObj != null)
			dg_p1_voltage = new Double(dg_p1_voltageObj.toString());

		Object dg_p1_currentObj = map.get("dg_p1_current");
		if(dg_p1_currentObj != null)
			dg_p1_current = new Double(dg_p1_currentObj.toString());

		Object dg_p1_pfObj = map.get("dg_p1_pf");
		if(dg_p1_pfObj != null)
			dg_p1_pf = new Double(dg_p1_pfObj.toString());

		Object dg_p1_mdObj = map.get("dg_p1_md");
		if(dg_p1_mdObj != null)
			dg_p1_md = new Double(dg_p1_mdObj.toString());

		Object dg_p1_tdhObj = map.get("dg_p1_tdh");
		if(dg_p1_tdhObj != null)
			dg_p1_tdh = new Double(dg_p1_tdhObj.toString());

		Object dg_p1_kvarhObj = map.get("dg_p1_kvarh");
		if(dg_p1_kvarhObj != null)
			dg_p1_kvarh = new Double(dg_p1_kvarhObj.toString());

		Object dg_p1_frequencyObj = map.get("dg_p1_frequency");
		if(dg_p1_frequencyObj != null)
			dg_p1_frequency = new Double(dg_p1_frequencyObj.toString());

		Object dg_p2_reading_kvahObj = map.get("dg_p2_reading_kvah");
		if(dg_p2_reading_kvahObj != null)
			dg_p2_reading_kvah = new Double(dg_p2_reading_kvahObj.toString());

		Object dg_p2_reading_kwhObj = map.get("dg_p2_reading_kwh");
		if(dg_p2_reading_kwhObj != null)
			dg_p2_reading_kwh = new Double(dg_p2_reading_kwhObj.toString());

		Object dg_p2_load_kvaObj = map.get("dg_p2_load_kva");
		if(dg_p2_load_kvaObj != null)
			dg_p2_load_kva = new Double(dg_p2_load_kvaObj.toString());

		Object dg_p2_load_kwObj = map.get("dg_p2_load_kw");
		if(dg_p2_load_kwObj != null)
			dg_p2_load_kw = new Double(dg_p2_load_kwObj.toString());

		Object dg_p2_voltageObj = map.get("dg_p2_voltage");
		if(dg_p2_voltageObj != null)
			dg_p2_voltage = new Double(dg_p2_voltageObj.toString());

		Object dg_p2_currentObj = map.get("dg_p2_current");
		if(dg_p2_currentObj != null)
			dg_p2_current = new Double(dg_p2_currentObj.toString());

		Object dg_p2_pfObj = map.get("dg_p2_pf");
		if(dg_p2_pfObj != null)
			dg_p2_pf = new Double(dg_p2_pfObj.toString());

		Object dg_p2_mdObj = map.get("dg_p2_md");
		if(dg_p2_mdObj != null)
			dg_p2_md = new Double(dg_p2_mdObj.toString());

		Object dg_p2_tdhObj = map.get("dg_p2_tdh");
		if(dg_p2_tdhObj != null)
			dg_p2_tdh = new Double(dg_p2_tdhObj.toString());

		Object dg_p2_kvarhObj = map.get("dg_p2_kvarh");
		if(dg_p2_kvarhObj != null)
			dg_p2_kvarh = new Double(dg_p2_kvarhObj.toString());

		Object dg_p2_frequencyObj = map.get("dg_p2_frequency");
		if(dg_p2_frequencyObj != null)
			dg_p2_frequency = new Double(dg_p2_frequencyObj.toString());

		Object dg_p3_reading_kvahObj = map.get("dg_p3_reading_kvah");
		if(dg_p3_reading_kvahObj != null)
			dg_p3_reading_kvah = new Double(dg_p3_reading_kvahObj.toString());

		Object dg_p3_reading_kwhObj = map.get("dg_p3_reading_kwh");
		if(dg_p3_reading_kwhObj != null)
			dg_p3_reading_kwh = new Double(dg_p3_reading_kwhObj.toString());

		Object dg_p3_load_kvaObj = map.get("dg_p3_load_kva");
		if(dg_p3_load_kvaObj != null)
			dg_p3_load_kva = new Double(dg_p3_load_kvaObj.toString());

		Object dg_p3_load_kwObj = map.get("dg_p3_load_kw");
		if(dg_p3_load_kwObj != null)
			dg_p3_load_kw = new Double(dg_p3_load_kwObj.toString());

		Object dg_p3_voltageObj = map.get("dg_p3_voltage");
		if(dg_p3_voltageObj != null)
			dg_p3_voltage = new Double(dg_p3_voltageObj.toString());

		Object dg_p3_currentObj = map.get("dg_p3_current");
		if(dg_p3_currentObj != null)
			dg_p3_current = new Double(dg_p3_currentObj.toString());

		Object dg_p3_pfObj = map.get("dg_p3_pf");
		if(dg_p3_pfObj != null)
			dg_p3_pf = new Double(dg_p3_pfObj.toString());

		Object dg_p3_mdObj = map.get("dg_p3_md");
		if(dg_p3_mdObj != null)
			dg_p3_md = new Double(dg_p3_mdObj.toString());

		Object dg_p3_tdhObj = map.get("dg_p3_tdh");
		if(dg_p3_tdhObj != null)
			dg_p3_tdh = new Double(dg_p3_tdhObj.toString());

		Object dg_p3_kvarhObj = map.get("dg_p3_kvarh");
		if(dg_p3_kvarhObj != null)
			dg_p3_kvarh = new Double(dg_p3_kvarhObj.toString());

		Object dg_p3_frequencyObj = map.get("dg_p3_frequency");
		if(dg_p3_frequencyObj != null)
			dg_p3_frequency = new Double(dg_p3_frequencyObj.toString());

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

		Object maintaince_modeObj = map.get("maintaince_mode");
		if(maintaince_modeObj != null)
			maintaince_mode = maintaince_modeObj.toString();

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
			last_prefilege_detected_time = new Long(last_prefilege_detected_timeObj.toString());

		Object move_stateObj = map.get("move_state");
		if(move_stateObj != null)
			move_state = move_stateObj.toString();

		Object last_moved_in_timeObj = map.get("last_moved_in_time");
		if(last_moved_in_timeObj != null)
			last_moved_in_time = new Long(last_moved_in_timeObj.toString());

		Object last_moved_out_timeObj = map.get("last_moved_out_time");
		if(last_moved_out_timeObj != null)
			last_moved_out_time = new Long(last_moved_out_timeObj.toString());

		Object last_disconnect_timeObj = map.get("last_disconnect_time");
		if(last_disconnect_timeObj != null)
			last_disconnect_time = new Long(last_disconnect_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

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

		Object high_coolant_temperatureObj = map.get("high_coolant_temperature");
		if(high_coolant_temperatureObj != null)
			high_coolant_temperature = high_coolant_temperatureObj.toString();

		Object canopy_temperatureObj = map.get("canopy_temperature");
		if(canopy_temperatureObj != null)
			canopy_temperature = new Double(canopy_temperatureObj.toString());

		Object coolant_temperatureObj = map.get("coolant_temperature");
		if(coolant_temperatureObj != null)
			coolant_temperature = new Double(coolant_temperatureObj.toString());

		Object high_canopy_temperatureObj = map.get("high_canopy_temperature");
		if(high_canopy_temperatureObj != null)
			high_canopy_temperature = high_canopy_temperatureObj.toString();

		Object lastProcessedStateObj = map.get("lastProcessedState");
		if(lastProcessedStateObj != null)
			lastProcessedState = lastProcessedStateObj.toString();

		Object lastProcessedTimeObj = map.get("lastProcessedTime");
		if(lastProcessedTimeObj != null)
			lastProcessedTime = new Long(lastProcessedTimeObj.toString());

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

		Object langitudeObj = map.get("langitude");
		if(langitudeObj != null)
			langitude = langitudeObj.toString();

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object speedObj = map.get("speed");
		if(speedObj != null)
			speed = new Integer(speedObj.toString());

		Object driveTypeObj = map.get("driveType");
		if(driveTypeObj != null)
			driveType = driveTypeObj.toString();

		Object currentDriverIdObj = map.get("currentDriverId");
		if(currentDriverIdObj != null)
			currentDriverId = currentDriverIdObj.toString();

		Object engineTemperatureObj = map.get("engineTemperature");
		if(engineTemperatureObj != null)
			engineTemperature = new Double(engineTemperatureObj.toString());

		Object ignitionStateObj = map.get("ignitionState");
		if(ignitionStateObj != null)
			ignitionState = ignitionStateObj.toString();

		Object engineOverHeatStateObj = map.get("engineOverHeatState");
		if(engineOverHeatStateObj != null)
			engineOverHeatState = engineOverHeatStateObj.toString();

		Object lowBatteryStateObj = map.get("lowBatteryState");
		if(lowBatteryStateObj != null)
			lowBatteryState = lowBatteryStateObj.toString();

		Object obdLowBatteryStateObj = map.get("obdLowBatteryState");
		if(obdLowBatteryStateObj != null)
			obdLowBatteryState = obdLowBatteryStateObj.toString();

		Object batteryLevelObj = map.get("batteryLevel");
		if(batteryLevelObj != null)
			batteryLevel = new Double(batteryLevelObj.toString());

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

		Object lastEngineStartedObj = map.get("lastEngineStarted");
		if(lastEngineStartedObj != null)
			lastEngineStarted = new Long(lastEngineStartedObj.toString());

		Object lastEngineStoppedObj = map.get("lastEngineStopped");
		if(lastEngineStoppedObj != null)
			lastEngineStopped = new Long(lastEngineStoppedObj.toString());

		Object timeZoneObj = map.get("timeZone");
		if(timeZoneObj != null)
			timeZone = timeZoneObj.toString();

		Object fuel_typeObj = map.get("fuel_type");
		if(fuel_typeObj != null)
			fuel_type = fuel_typeObj.toString();

		Object start_readingObj = map.get("start_reading");
		if(start_readingObj != null)
			start_reading = new Double(start_readingObj.toString());

		Object grid_stateObj = map.get("grid_state");
		if(grid_stateObj != null)
			grid_state = grid_stateObj.toString();

		Object timing_advanceObj = map.get("timing_advance");
		if(timing_advanceObj != null)
			timing_advance = new Integer(timing_advanceObj.toString());

		Object manifoldABSPressureObj = map.get("manifoldABSPressure");
		if(manifoldABSPressureObj != null)
			manifoldABSPressure = new Integer(manifoldABSPressureObj.toString());

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = new Long(start_timeObj.toString());

		Object current_fuel_consumptionObj = map.get("current_fuel_consumption");
		if(current_fuel_consumptionObj != null)
			current_fuel_consumption = new Double(current_fuel_consumptionObj.toString());

		Object fuel_calibration_factorObj = map.get("fuel_calibration_factor");
		if(fuel_calibration_factorObj != null)
			fuel_calibration_factor = new Double(fuel_calibration_factorObj.toString());

		Object lowFuelStateObj = map.get("lowFuelState");
		if(lowFuelStateObj != null)
			lowFuelState = lowFuelStateObj.toString();

		Object lowFuelStateEnterTimeObj = map.get("lowFuelStateEnterTime");
		if(lowFuelStateEnterTimeObj != null)
			lowFuelStateEnterTime = new Long(lowFuelStateEnterTimeObj.toString());

		Object lowOilPressureStateObj = map.get("lowOilPressureState");
		if(lowOilPressureStateObj != null)
			lowOilPressureState = lowOilPressureStateObj.toString();

		Object overSpeedStateObj = map.get("overSpeedState");
		if(overSpeedStateObj != null)
			overSpeedState = overSpeedStateObj.toString();

		Object starterTriggeredObj = map.get("starterTriggered");
		if(starterTriggeredObj != null)
			starterTriggered = starterTriggeredObj.toString();

		Object waterInFuelObj = map.get("waterInFuel");
		if(waterInFuelObj != null)
			waterInFuel = waterInFuelObj.toString();

		Object remoteControlObj = map.get("remoteControl");
		if(remoteControlObj != null)
			remoteControl = remoteControlObj.toString();

		Object testObj = map.get("test");
		if(testObj != null)
			test = testObj.toString();

		Object temperedObj = map.get("tempered");
		if(temperedObj != null)
			tempered = temperedObj.toString();

		Object featureEngineMonitoringObj = map.get("featureEngineMonitoring");
		if(featureEngineMonitoringObj != null)
			featureEngineMonitoring = featureEngineMonitoringObj.toString();

		Object featureTrackingObj = map.get("featureTracking");
		if(featureTrackingObj != null)
			featureTracking = featureTrackingObj.toString();

		Object currentRouteIdObj = map.get("currentRouteId");
		if(currentRouteIdObj != null)
			currentRouteId = currentRouteIdObj.toString();

		Object lastStopageIdObj = map.get("lastStopageId");
		if(lastStopageIdObj != null)
			lastStopageId = lastStopageIdObj.toString();

		Object sittingCapacityObj = map.get("sittingCapacity");
		if(sittingCapacityObj != null)
			sittingCapacity = new Long(sittingCapacityObj.toString());

		Object insuranceExpiryObj = map.get("insuranceExpiry");
		if(insuranceExpiryObj != null)
			insuranceExpiry = insuranceExpiryObj.toString();

		Object pollutionCertificateExpiryObj = map.get("pollutionCertificateExpiry");
		if(pollutionCertificateExpiryObj != null)
			pollutionCertificateExpiry = pollutionCertificateExpiryObj.toString();

		Object vehicleFitnessExpiryObj = map.get("vehicleFitnessExpiry");
		if(vehicleFitnessExpiryObj != null)
			vehicleFitnessExpiry = vehicleFitnessExpiryObj.toString();

		Object lastServiceObj = map.get("lastService");
		if(lastServiceObj != null)
			lastService = lastServiceObj.toString();

		Object critical_alertsObj = map.get("critical_alerts");
		if(critical_alertsObj != null)
			critical_alerts = new Long(critical_alertsObj.toString());

		Object major_alertsObj = map.get("major_alerts");
		if(major_alertsObj != null)
			major_alerts = new Long(major_alertsObj.toString());

		Object wanring_alertsObj = map.get("wanring_alerts");
		if(wanring_alertsObj != null)
			wanring_alerts = new Long(wanring_alertsObj.toString());

		Object minor_alertsObj = map.get("minor_alerts");
		if(minor_alertsObj != null)
			minor_alerts = new Long(minor_alertsObj.toString());

		Object costObj = map.get("cost");
		if(costObj != null)
			cost = new Double(costObj.toString());

		Object cost_unitObj = map.get("cost_unit");
		if(cost_unitObj != null)
			cost_unit = cost_unitObj.toString();

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

	public String getThreshold_templete_id() {
		return threshold_templete_id;
	}

	public String getThreshold_templete_idEx() {
		return threshold_templete_id != null ? threshold_templete_id : "";
	}

	public void setThreshold_templete_id(String threshold_templete_id) {
		this.threshold_templete_id = threshold_templete_id;
	}

	public void unSetThreshold_templete_id() {
		this.threshold_templete_id = null;
	}

	public String getThreshold_templete_name() {
		return threshold_templete_name;
	}

	public String getThreshold_templete_nameEx() {
		return threshold_templete_name != null ? threshold_templete_name : "";
	}

	public void setThreshold_templete_name(String threshold_templete_name) {
		this.threshold_templete_name = threshold_templete_name;
	}

	public void unSetThreshold_templete_name() {
		this.threshold_templete_name = null;
	}

	public String getController_name() {
		return controller_name;
	}

	public String getController_nameEx() {
		return controller_name != null ? controller_name : "";
	}

	public void setController_name(String controller_name) {
		this.controller_name = controller_name;
	}

	public void unSetController_name() {
		this.controller_name = null;
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

	public Long getController_port() {
		return controller_port;
	}

	public long getController_portEx() {
		return controller_port != null ? controller_port : 0L;
	}

	public void setController_port(long controller_port) {
		this.controller_port = controller_port;
	}

	public void setController_port(Long controller_port) {
		this.controller_port = controller_port;
	}

	public void unSetController_port() {
		this.controller_port = null;
	}

	public String getImei() {
		return imei;
	}

	public String getImeiEx() {
		return imei != null ? imei : "";
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public void unSetImei() {
		this.imei = null;
	}

	public String getVin() {
		return vin;
	}

	public String getVinEx() {
		return vin != null ? vin : "";
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void unSetVin() {
		this.vin = null;
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

	public String getMake_name() {
		return make_name;
	}

	public String getMake_nameEx() {
		return make_name != null ? make_name : "";
	}

	public void setMake_name(String make_name) {
		this.make_name = make_name;
	}

	public void unSetMake_name() {
		this.make_name = null;
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

	public String getModel_name() {
		return model_name;
	}

	public String getModel_nameEx() {
		return model_name != null ? model_name : "";
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public void unSetModel_name() {
		this.model_name = null;
	}

	public Double getPower_rating() {
		return power_rating != null ? power_rating : 0.0000;
	}

	public void setPower_rating(double power_rating) {
		this.power_rating = power_rating;
	}

	public void setPower_rating(Double power_rating) {
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

	public String getLocation_name() {
		return location_name;
	}

	public String getLocation_nameEx() {
		return location_name != null ? location_name : "";
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public void unSetLocation_name() {
		this.location_name = null;
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

	public Double getDg_unit_opening() {
		return dg_unit_opening != null ? dg_unit_opening : 0.0000;
	}

	public void setDg_unit_opening(double dg_unit_opening) {
		this.dg_unit_opening = dg_unit_opening;
	}

	public void setDg_unit_opening(Double dg_unit_opening) {
		this.dg_unit_opening = dg_unit_opening;
	}

	public void unSetDg_unit_opening() {
		this.dg_unit_opening = 0.0000;
	}

	public Double getDg_unit_consumed() {
		return dg_unit_consumed != null ? dg_unit_consumed : 0.0000;
	}

	public void setDg_unit_consumed(double dg_unit_consumed) {
		this.dg_unit_consumed = dg_unit_consumed;
	}

	public void setDg_unit_consumed(Double dg_unit_consumed) {
		this.dg_unit_consumed = dg_unit_consumed;
	}

	public void unSetDg_unit_consumed() {
		this.dg_unit_consumed = 0.0000;
	}

	public Double getDg_unit_closing() {
		return dg_unit_closing != null ? dg_unit_closing : 0.0000;
	}

	public void setDg_unit_closing(double dg_unit_closing) {
		this.dg_unit_closing = dg_unit_closing;
	}

	public void setDg_unit_closing(Double dg_unit_closing) {
		this.dg_unit_closing = dg_unit_closing;
	}

	public void unSetDg_unit_closing() {
		this.dg_unit_closing = 0.0000;
	}

	public Double getGrid_unit_opening() {
		return grid_unit_opening != null ? grid_unit_opening : 0.0000;
	}

	public void setGrid_unit_opening(double grid_unit_opening) {
		this.grid_unit_opening = grid_unit_opening;
	}

	public void setGrid_unit_opening(Double grid_unit_opening) {
		this.grid_unit_opening = grid_unit_opening;
	}

	public void unSetGrid_unit_opening() {
		this.grid_unit_opening = 0.0000;
	}

	public Double getGrid_unit_consumed() {
		return grid_unit_consumed != null ? grid_unit_consumed : 0.0000;
	}

	public void setGrid_unit_consumed(double grid_unit_consumed) {
		this.grid_unit_consumed = grid_unit_consumed;
	}

	public void setGrid_unit_consumed(Double grid_unit_consumed) {
		this.grid_unit_consumed = grid_unit_consumed;
	}

	public void unSetGrid_unit_consumed() {
		this.grid_unit_consumed = 0.0000;
	}

	public Double getGrid_unit_closing() {
		return grid_unit_closing != null ? grid_unit_closing : 0.0000;
	}

	public void setGrid_unit_closing(double grid_unit_closing) {
		this.grid_unit_closing = grid_unit_closing;
	}

	public void setGrid_unit_closing(Double grid_unit_closing) {
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

	public Double getThreshold_fuel_level() {
		return threshold_fuel_level != null ? threshold_fuel_level : 0.0;
	}

	public void setThreshold_fuel_level(double threshold_fuel_level) {
		this.threshold_fuel_level = threshold_fuel_level;
	}

	public void setThreshold_fuel_level(Double threshold_fuel_level) {
		this.threshold_fuel_level = threshold_fuel_level;
	}

	public void unSetThreshold_fuel_level() {
		this.threshold_fuel_level = 0.0;
	}

	public Integer getThreshold_over_speed() {
		return threshold_over_speed;
	}

	public int getThreshold_over_speedEx() {
		return threshold_over_speed != null ? threshold_over_speed : 0;
	}

	public void setThreshold_over_speed(int threshold_over_speed) {
		this.threshold_over_speed = threshold_over_speed;
	}

	public void setThreshold_over_speed(Integer threshold_over_speed) {
		this.threshold_over_speed = threshold_over_speed;
	}

	public void unSetThreshold_over_speed() {
		this.threshold_over_speed = null;
	}

	public Double getCapacity() {
		return capacity != null ? capacity : 0.0;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public void unSetCapacity() {
		this.capacity = 0.0;
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

	public Integer getToday_run_time() {
		return today_run_time;
	}

	public int getToday_run_timeEx() {
		return today_run_time != null ? today_run_time : 0;
	}

	public void setToday_run_time(int today_run_time) {
		this.today_run_time = today_run_time;
	}

	public void setToday_run_time(Integer today_run_time) {
		this.today_run_time = today_run_time;
	}

	public void unSetToday_run_time() {
		this.today_run_time = null;
	}

	public Double getToday_fuel_consumption() {
		return today_fuel_consumption != null ? today_fuel_consumption : 0.00;
	}

	public void setToday_fuel_consumption(double today_fuel_consumption) {
		this.today_fuel_consumption = today_fuel_consumption;
	}

	public void setToday_fuel_consumption(Double today_fuel_consumption) {
		this.today_fuel_consumption = today_fuel_consumption;
	}

	public void unSetToday_fuel_consumption() {
		this.today_fuel_consumption = 0.00;
	}

	public Double getAverage_fuel_consumption() {
		return average_fuel_consumption != null ? average_fuel_consumption : 0.00;
	}

	public void setAverage_fuel_consumption(double average_fuel_consumption) {
		this.average_fuel_consumption = average_fuel_consumption;
	}

	public void setAverage_fuel_consumption(Double average_fuel_consumption) {
		this.average_fuel_consumption = average_fuel_consumption;
	}

	public void unSetAverage_fuel_consumption() {
		this.average_fuel_consumption = 0.00;
	}

	public Double getToday_fuel_loss() {
		return today_fuel_loss != null ? today_fuel_loss : 0.00;
	}

	public void setToday_fuel_loss(double today_fuel_loss) {
		this.today_fuel_loss = today_fuel_loss;
	}

	public void setToday_fuel_loss(Double today_fuel_loss) {
		this.today_fuel_loss = today_fuel_loss;
	}

	public void unSetToday_fuel_loss() {
		this.today_fuel_loss = 0.00;
	}

	public Integer getCurrent_month_run_time() {
		return current_month_run_time;
	}

	public int getCurrent_month_run_timeEx() {
		return current_month_run_time != null ? current_month_run_time : 0;
	}

	public void setCurrent_month_run_time(int current_month_run_time) {
		this.current_month_run_time = current_month_run_time;
	}

	public void setCurrent_month_run_time(Integer current_month_run_time) {
		this.current_month_run_time = current_month_run_time;
	}

	public void unSetCurrent_month_run_time() {
		this.current_month_run_time = null;
	}

	public Double getCurrent_month_fuel_consumption() {
		return current_month_fuel_consumption != null ? current_month_fuel_consumption : 0.00;
	}

	public void setCurrent_month_fuel_consumption(double current_month_fuel_consumption) {
		this.current_month_fuel_consumption = current_month_fuel_consumption;
	}

	public void setCurrent_month_fuel_consumption(Double current_month_fuel_consumption) {
		this.current_month_fuel_consumption = current_month_fuel_consumption;
	}

	public void unSetCurrent_month_fuel_consumption() {
		this.current_month_fuel_consumption = 0.00;
	}

	public Double getCurrent_month_fuel_loss() {
		return current_month_fuel_loss != null ? current_month_fuel_loss : 0.00;
	}

	public void setCurrent_month_fuel_loss(double current_month_fuel_loss) {
		this.current_month_fuel_loss = current_month_fuel_loss;
	}

	public void setCurrent_month_fuel_loss(Double current_month_fuel_loss) {
		this.current_month_fuel_loss = current_month_fuel_loss;
	}

	public void unSetCurrent_month_fuel_loss() {
		this.current_month_fuel_loss = 0.00;
	}

	public Double getThreshold_temperature_min_level() {
		return threshold_temperature_min_level != null ? threshold_temperature_min_level : 0.00;
	}

	public void setThreshold_temperature_min_level(double threshold_temperature_min_level) {
		this.threshold_temperature_min_level = threshold_temperature_min_level;
	}

	public void setThreshold_temperature_min_level(Double threshold_temperature_min_level) {
		this.threshold_temperature_min_level = threshold_temperature_min_level;
	}

	public void unSetThreshold_temperature_min_level() {
		this.threshold_temperature_min_level = 0.00;
	}

	public Double getThreshold_temperature_max_level() {
		return threshold_temperature_max_level != null ? threshold_temperature_max_level : 0.00;
	}

	public void setThreshold_temperature_max_level(double threshold_temperature_max_level) {
		this.threshold_temperature_max_level = threshold_temperature_max_level;
	}

	public void setThreshold_temperature_max_level(Double threshold_temperature_max_level) {
		this.threshold_temperature_max_level = threshold_temperature_max_level;
	}

	public void unSetThreshold_temperature_max_level() {
		this.threshold_temperature_max_level = 0.00;
	}

	public Double getThreshold_voltage_min_level() {
		return threshold_voltage_min_level != null ? threshold_voltage_min_level : 0.00;
	}

	public void setThreshold_voltage_min_level(double threshold_voltage_min_level) {
		this.threshold_voltage_min_level = threshold_voltage_min_level;
	}

	public void setThreshold_voltage_min_level(Double threshold_voltage_min_level) {
		this.threshold_voltage_min_level = threshold_voltage_min_level;
	}

	public void unSetThreshold_voltage_min_level() {
		this.threshold_voltage_min_level = 0.00;
	}

	public Double getThreshold_voltage_max_level() {
		return threshold_voltage_max_level != null ? threshold_voltage_max_level : 0.00;
	}

	public void setThreshold_voltage_max_level(double threshold_voltage_max_level) {
		this.threshold_voltage_max_level = threshold_voltage_max_level;
	}

	public void setThreshold_voltage_max_level(Double threshold_voltage_max_level) {
		this.threshold_voltage_max_level = threshold_voltage_max_level;
	}

	public void unSetThreshold_voltage_max_level() {
		this.threshold_voltage_max_level = 0.00;
	}

	public Double getThreshold_current_min_level() {
		return threshold_current_min_level != null ? threshold_current_min_level : 0.00;
	}

	public void setThreshold_current_min_level(double threshold_current_min_level) {
		this.threshold_current_min_level = threshold_current_min_level;
	}

	public void setThreshold_current_min_level(Double threshold_current_min_level) {
		this.threshold_current_min_level = threshold_current_min_level;
	}

	public void unSetThreshold_current_min_level() {
		this.threshold_current_min_level = 0.00;
	}

	public Double getThreshold_current_max_level() {
		return threshold_current_max_level != null ? threshold_current_max_level : 0.00;
	}

	public void setThreshold_current_max_level(double threshold_current_max_level) {
		this.threshold_current_max_level = threshold_current_max_level;
	}

	public void setThreshold_current_max_level(Double threshold_current_max_level) {
		this.threshold_current_max_level = threshold_current_max_level;
	}

	public void unSetThreshold_current_max_level() {
		this.threshold_current_max_level = 0.00;
	}

	public Double getThreshold_duration() {
		return threshold_duration != null ? threshold_duration : 0.00;
	}

	public void setThreshold_duration(double threshold_duration) {
		this.threshold_duration = threshold_duration;
	}

	public void setThreshold_duration(Double threshold_duration) {
		this.threshold_duration = threshold_duration;
	}

	public void unSetThreshold_duration() {
		this.threshold_duration = 0.00;
	}

	public String getAlert_dg_grid_on() {
		return alert_dg_grid_on;
	}

	public String getAlert_dg_grid_onEx() {
		return alert_dg_grid_on != null ? alert_dg_grid_on : "";
	}

	public void setAlert_dg_grid_on(String alert_dg_grid_on) {
		this.alert_dg_grid_on = alert_dg_grid_on;
	}

	public void unSetAlert_dg_grid_on() {
		this.alert_dg_grid_on = null;
	}

	public String getAlert_dg_grid_off() {
		return alert_dg_grid_off;
	}

	public String getAlert_dg_grid_offEx() {
		return alert_dg_grid_off != null ? alert_dg_grid_off : "";
	}

	public void setAlert_dg_grid_off(String alert_dg_grid_off) {
		this.alert_dg_grid_off = alert_dg_grid_off;
	}

	public void unSetAlert_dg_grid_off() {
		this.alert_dg_grid_off = null;
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
		return battery_number != null ? battery_number : 0;
	}

	public void setBattery_number(int battery_number) {
		this.battery_number = battery_number;
	}

	public void setBattery_number(Integer battery_number) {
		this.battery_number = battery_number;
	}

	public void unSetBattery_number() {
		this.battery_number = 0;
	}

	public Integer getNumber_of_batteries() {
		return number_of_batteries != null ? number_of_batteries : 0;
	}

	public void setNumber_of_batteries(int number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void setNumber_of_batteries(Integer number_of_batteries) {
		this.number_of_batteries = number_of_batteries;
	}

	public void unSetNumber_of_batteries() {
		this.number_of_batteries = 0;
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
		return battery_level != null ? battery_level : 0;
	}

	public void setBattery_level(int battery_level) {
		this.battery_level = battery_level;
	}

	public void setBattery_level(Integer battery_level) {
		this.battery_level = battery_level;
	}

	public void unSetBattery_level() {
		this.battery_level = 0;
	}

	public Double getLast_reading() {
		return last_reading != null ? last_reading : 0.0000;
	}

	public void setLast_reading(double last_reading) {
		this.last_reading = last_reading;
	}

	public void setLast_reading(Double last_reading) {
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

	public Long getLast_grid_reading_updated() {
		return last_grid_reading_updated;
	}

	public void setLast_grid_reading_updated(Long last_grid_reading_updated) {
		this.last_grid_reading_updated = last_grid_reading_updated;
	}


	public boolean validateLast_grid_reading_updated(boolean add) throws ApplicationException {
		if(add && last_grid_reading_updated == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_grid_reading_updated]");
		return last_grid_reading_updated != null;
	}

	public Long getLast_dg_reading_updated() {
		return last_dg_reading_updated;
	}

	public void setLast_dg_reading_updated(Long last_dg_reading_updated) {
		this.last_dg_reading_updated = last_dg_reading_updated;
	}


	public boolean validateLast_dg_reading_updated(boolean add) throws ApplicationException {
		if(add && last_dg_reading_updated == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_dg_reading_updated]");
		return last_dg_reading_updated != null;
	}

	public Double getDg_reading() {
		return dg_reading != null ? dg_reading : 0.0000;
	}

	public void setDg_reading(double dg_reading) {
		this.dg_reading = dg_reading;
	}

	public void setDg_reading(Double dg_reading) {
		this.dg_reading = dg_reading;
	}

	public void unSetDg_reading() {
		this.dg_reading = 0.0000;
	}

	public Double getGrid_reading() {
		return grid_reading != null ? grid_reading : 0.0000;
	}

	public void setGrid_reading(double grid_reading) {
		this.grid_reading = grid_reading;
	}

	public void setGrid_reading(Double grid_reading) {
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

	public Double getPower() {
		return power != null ? power : 0.0000;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void setPower(Double power) {
		this.power = power;
	}

	public void unSetPower() {
		this.power = 0.0000;
	}

	public Double getEnergy() {
		return energy != null ? energy : 0.0000;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public void unSetEnergy() {
		this.energy = 0.0000;
	}

	public Double getGrid_reading_kvah() {
		return grid_reading_kvah != null ? grid_reading_kvah : 0.0000;
	}

	public void setGrid_reading_kvah(double grid_reading_kvah) {
		this.grid_reading_kvah = grid_reading_kvah;
	}

	public void setGrid_reading_kvah(Double grid_reading_kvah) {
		this.grid_reading_kvah = grid_reading_kvah;
	}

	public void unSetGrid_reading_kvah() {
		this.grid_reading_kvah = 0.0000;
	}

	public Double getGrid_reading_kwh() {
		return grid_reading_kwh != null ? grid_reading_kwh : 0.0000;
	}

	public void setGrid_reading_kwh(double grid_reading_kwh) {
		this.grid_reading_kwh = grid_reading_kwh;
	}

	public void setGrid_reading_kwh(Double grid_reading_kwh) {
		this.grid_reading_kwh = grid_reading_kwh;
	}

	public void unSetGrid_reading_kwh() {
		this.grid_reading_kwh = 0.0000;
	}

	public Double getGrid_today_kwh() {
		return grid_today_kwh != null ? grid_today_kwh : 0.0000;
	}

	public void setGrid_today_kwh(double grid_today_kwh) {
		this.grid_today_kwh = grid_today_kwh;
	}

	public void setGrid_today_kwh(Double grid_today_kwh) {
		this.grid_today_kwh = grid_today_kwh;
	}

	public void unSetGrid_today_kwh() {
		this.grid_today_kwh = 0.0000;
	}

	public Double getGrid_current_month_kwh() {
		return grid_current_month_kwh != null ? grid_current_month_kwh : 0.0000;
	}

	public void setGrid_current_month_kwh(double grid_current_month_kwh) {
		this.grid_current_month_kwh = grid_current_month_kwh;
	}

	public void setGrid_current_month_kwh(Double grid_current_month_kwh) {
		this.grid_current_month_kwh = grid_current_month_kwh;
	}

	public void unSetGrid_current_month_kwh() {
		this.grid_current_month_kwh = 0.0000;
	}

	public Double getGrid_today_kvah() {
		return grid_today_kvah != null ? grid_today_kvah : 0.0000;
	}

	public void setGrid_today_kvah(double grid_today_kvah) {
		this.grid_today_kvah = grid_today_kvah;
	}

	public void setGrid_today_kvah(Double grid_today_kvah) {
		this.grid_today_kvah = grid_today_kvah;
	}

	public void unSetGrid_today_kvah() {
		this.grid_today_kvah = 0.0000;
	}

	public Double getGrid_current_month_kvah() {
		return grid_current_month_kvah != null ? grid_current_month_kvah : 0.0000;
	}

	public void setGrid_current_month_kvah(double grid_current_month_kvah) {
		this.grid_current_month_kvah = grid_current_month_kvah;
	}

	public void setGrid_current_month_kvah(Double grid_current_month_kvah) {
		this.grid_current_month_kvah = grid_current_month_kvah;
	}

	public void unSetGrid_current_month_kvah() {
		this.grid_current_month_kvah = 0.0000;
	}

	public Double getGrid_load_kva() {
		return grid_load_kva != null ? grid_load_kva : 0.0000;
	}

	public void setGrid_load_kva(double grid_load_kva) {
		this.grid_load_kva = grid_load_kva;
	}

	public void setGrid_load_kva(Double grid_load_kva) {
		this.grid_load_kva = grid_load_kva;
	}

	public void unSetGrid_load_kva() {
		this.grid_load_kva = 0.0000;
	}

	public Double getGrid_load_kw() {
		return grid_load_kw != null ? grid_load_kw : 0.0000;
	}

	public void setGrid_load_kw(double grid_load_kw) {
		this.grid_load_kw = grid_load_kw;
	}

	public void setGrid_load_kw(Double grid_load_kw) {
		this.grid_load_kw = grid_load_kw;
	}

	public void unSetGrid_load_kw() {
		this.grid_load_kw = 0.0000;
	}

	public Double getGrid_voltage() {
		return grid_voltage != null ? grid_voltage : 0.00;
	}

	public void setGrid_voltage(double grid_voltage) {
		this.grid_voltage = grid_voltage;
	}

	public void setGrid_voltage(Double grid_voltage) {
		this.grid_voltage = grid_voltage;
	}

	public void unSetGrid_voltage() {
		this.grid_voltage = 0.00;
	}

	public Double getGrid_current() {
		return grid_current != null ? grid_current : 0.00;
	}

	public void setGrid_current(double grid_current) {
		this.grid_current = grid_current;
	}

	public void setGrid_current(Double grid_current) {
		this.grid_current = grid_current;
	}

	public void unSetGrid_current() {
		this.grid_current = 0.00;
	}

	public Double getGrid_pf() {
		return grid_pf != null ? grid_pf : 0.0000;
	}

	public void setGrid_pf(double grid_pf) {
		this.grid_pf = grid_pf;
	}

	public void setGrid_pf(Double grid_pf) {
		this.grid_pf = grid_pf;
	}

	public void unSetGrid_pf() {
		this.grid_pf = 0.0000;
	}

	public Double getGrid_md() {
		return grid_md != null ? grid_md : 0.0000;
	}

	public void setGrid_md(double grid_md) {
		this.grid_md = grid_md;
	}

	public void setGrid_md(Double grid_md) {
		this.grid_md = grid_md;
	}

	public void unSetGrid_md() {
		this.grid_md = 0.0000;
	}

	public Double getGrid_tdh() {
		return grid_tdh != null ? grid_tdh : 0.0000;
	}

	public void setGrid_tdh(double grid_tdh) {
		this.grid_tdh = grid_tdh;
	}

	public void setGrid_tdh(Double grid_tdh) {
		this.grid_tdh = grid_tdh;
	}

	public void unSetGrid_tdh() {
		this.grid_tdh = 0.0000;
	}

	public Double getGrid_kvarh() {
		return grid_kvarh != null ? grid_kvarh : 0.0000;
	}

	public void setGrid_kvarh(double grid_kvarh) {
		this.grid_kvarh = grid_kvarh;
	}

	public void setGrid_kvarh(Double grid_kvarh) {
		this.grid_kvarh = grid_kvarh;
	}

	public void unSetGrid_kvarh() {
		this.grid_kvarh = 0.0000;
	}

	public Long getGrid_frequency() {
		return grid_frequency != null ? grid_frequency : 0L;
	}

	public void setGrid_frequency(long grid_frequency) {
		this.grid_frequency = grid_frequency;
	}

	public void setGrid_frequency(Long grid_frequency) {
		this.grid_frequency = grid_frequency;
	}

	public void unSetGrid_frequency() {
		this.grid_frequency = 0L;
	}

	public Double getGrid_p1_reading_kvah() {
		return grid_p1_reading_kvah != null ? grid_p1_reading_kvah : 0.0000;
	}

	public void setGrid_p1_reading_kvah(double grid_p1_reading_kvah) {
		this.grid_p1_reading_kvah = grid_p1_reading_kvah;
	}

	public void setGrid_p1_reading_kvah(Double grid_p1_reading_kvah) {
		this.grid_p1_reading_kvah = grid_p1_reading_kvah;
	}

	public void unSetGrid_p1_reading_kvah() {
		this.grid_p1_reading_kvah = 0.0000;
	}

	public Double getGrid_p1_reading_kwh() {
		return grid_p1_reading_kwh != null ? grid_p1_reading_kwh : 0.0000;
	}

	public void setGrid_p1_reading_kwh(double grid_p1_reading_kwh) {
		this.grid_p1_reading_kwh = grid_p1_reading_kwh;
	}

	public void setGrid_p1_reading_kwh(Double grid_p1_reading_kwh) {
		this.grid_p1_reading_kwh = grid_p1_reading_kwh;
	}

	public void unSetGrid_p1_reading_kwh() {
		this.grid_p1_reading_kwh = 0.0000;
	}

	public Double getGrid_p1_load_kva() {
		return grid_p1_load_kva != null ? grid_p1_load_kva : 0.0000;
	}

	public void setGrid_p1_load_kva(double grid_p1_load_kva) {
		this.grid_p1_load_kva = grid_p1_load_kva;
	}

	public void setGrid_p1_load_kva(Double grid_p1_load_kva) {
		this.grid_p1_load_kva = grid_p1_load_kva;
	}

	public void unSetGrid_p1_load_kva() {
		this.grid_p1_load_kva = 0.0000;
	}

	public Double getGrid_p1_load_kw() {
		return grid_p1_load_kw != null ? grid_p1_load_kw : 0.0000;
	}

	public void setGrid_p1_load_kw(double grid_p1_load_kw) {
		this.grid_p1_load_kw = grid_p1_load_kw;
	}

	public void setGrid_p1_load_kw(Double grid_p1_load_kw) {
		this.grid_p1_load_kw = grid_p1_load_kw;
	}

	public void unSetGrid_p1_load_kw() {
		this.grid_p1_load_kw = 0.0000;
	}

	public Double getGrid_p1_voltage() {
		return grid_p1_voltage != null ? grid_p1_voltage : 0.0000;
	}

	public void setGrid_p1_voltage(double grid_p1_voltage) {
		this.grid_p1_voltage = grid_p1_voltage;
	}

	public void setGrid_p1_voltage(Double grid_p1_voltage) {
		this.grid_p1_voltage = grid_p1_voltage;
	}

	public void unSetGrid_p1_voltage() {
		this.grid_p1_voltage = 0.0000;
	}

	public Double getGrid_p1_current() {
		return grid_p1_current != null ? grid_p1_current : 0.0000;
	}

	public void setGrid_p1_current(double grid_p1_current) {
		this.grid_p1_current = grid_p1_current;
	}

	public void setGrid_p1_current(Double grid_p1_current) {
		this.grid_p1_current = grid_p1_current;
	}

	public void unSetGrid_p1_current() {
		this.grid_p1_current = 0.0000;
	}

	public Double getGrid_p1_pf() {
		return grid_p1_pf != null ? grid_p1_pf : 0.0000;
	}

	public void setGrid_p1_pf(double grid_p1_pf) {
		this.grid_p1_pf = grid_p1_pf;
	}

	public void setGrid_p1_pf(Double grid_p1_pf) {
		this.grid_p1_pf = grid_p1_pf;
	}

	public void unSetGrid_p1_pf() {
		this.grid_p1_pf = 0.0000;
	}

	public Double getGrid_p1_md() {
		return grid_p1_md != null ? grid_p1_md : 0.0000;
	}

	public void setGrid_p1_md(double grid_p1_md) {
		this.grid_p1_md = grid_p1_md;
	}

	public void setGrid_p1_md(Double grid_p1_md) {
		this.grid_p1_md = grid_p1_md;
	}

	public void unSetGrid_p1_md() {
		this.grid_p1_md = 0.0000;
	}

	public Double getGrid_p1_tdh() {
		return grid_p1_tdh != null ? grid_p1_tdh : 0.0000;
	}

	public void setGrid_p1_tdh(double grid_p1_tdh) {
		this.grid_p1_tdh = grid_p1_tdh;
	}

	public void setGrid_p1_tdh(Double grid_p1_tdh) {
		this.grid_p1_tdh = grid_p1_tdh;
	}

	public void unSetGrid_p1_tdh() {
		this.grid_p1_tdh = 0.0000;
	}

	public Double getGrid_p1_kvarh() {
		return grid_p1_kvarh != null ? grid_p1_kvarh : 0.0000;
	}

	public void setGrid_p1_kvarh(double grid_p1_kvarh) {
		this.grid_p1_kvarh = grid_p1_kvarh;
	}

	public void setGrid_p1_kvarh(Double grid_p1_kvarh) {
		this.grid_p1_kvarh = grid_p1_kvarh;
	}

	public void unSetGrid_p1_kvarh() {
		this.grid_p1_kvarh = 0.0000;
	}

	public Double getGrid_p1_frequency() {
		return grid_p1_frequency != null ? grid_p1_frequency : 0.0000;
	}

	public void setGrid_p1_frequency(double grid_p1_frequency) {
		this.grid_p1_frequency = grid_p1_frequency;
	}

	public void setGrid_p1_frequency(Double grid_p1_frequency) {
		this.grid_p1_frequency = grid_p1_frequency;
	}

	public void unSetGrid_p1_frequency() {
		this.grid_p1_frequency = 0.0000;
	}

	public Double getGrid_p2_reading_kvah() {
		return grid_p2_reading_kvah != null ? grid_p2_reading_kvah : 0.0000;
	}

	public void setGrid_p2_reading_kvah(double grid_p2_reading_kvah) {
		this.grid_p2_reading_kvah = grid_p2_reading_kvah;
	}

	public void setGrid_p2_reading_kvah(Double grid_p2_reading_kvah) {
		this.grid_p2_reading_kvah = grid_p2_reading_kvah;
	}

	public void unSetGrid_p2_reading_kvah() {
		this.grid_p2_reading_kvah = 0.0000;
	}

	public Double getGrid_p2_reading_kwh() {
		return grid_p2_reading_kwh != null ? grid_p2_reading_kwh : 0.0000;
	}

	public void setGrid_p2_reading_kwh(double grid_p2_reading_kwh) {
		this.grid_p2_reading_kwh = grid_p2_reading_kwh;
	}

	public void setGrid_p2_reading_kwh(Double grid_p2_reading_kwh) {
		this.grid_p2_reading_kwh = grid_p2_reading_kwh;
	}

	public void unSetGrid_p2_reading_kwh() {
		this.grid_p2_reading_kwh = 0.0000;
	}

	public Double getGrid_p2_load_kva() {
		return grid_p2_load_kva != null ? grid_p2_load_kva : 0.0000;
	}

	public void setGrid_p2_load_kva(double grid_p2_load_kva) {
		this.grid_p2_load_kva = grid_p2_load_kva;
	}

	public void setGrid_p2_load_kva(Double grid_p2_load_kva) {
		this.grid_p2_load_kva = grid_p2_load_kva;
	}

	public void unSetGrid_p2_load_kva() {
		this.grid_p2_load_kva = 0.0000;
	}

	public Double getGrid_p2_load_kw() {
		return grid_p2_load_kw != null ? grid_p2_load_kw : 0.0000;
	}

	public void setGrid_p2_load_kw(double grid_p2_load_kw) {
		this.grid_p2_load_kw = grid_p2_load_kw;
	}

	public void setGrid_p2_load_kw(Double grid_p2_load_kw) {
		this.grid_p2_load_kw = grid_p2_load_kw;
	}

	public void unSetGrid_p2_load_kw() {
		this.grid_p2_load_kw = 0.0000;
	}

	public Double getGrid_p2_voltage() {
		return grid_p2_voltage != null ? grid_p2_voltage : 0.0000;
	}

	public void setGrid_p2_voltage(double grid_p2_voltage) {
		this.grid_p2_voltage = grid_p2_voltage;
	}

	public void setGrid_p2_voltage(Double grid_p2_voltage) {
		this.grid_p2_voltage = grid_p2_voltage;
	}

	public void unSetGrid_p2_voltage() {
		this.grid_p2_voltage = 0.0000;
	}

	public Double getGrid_p2_current() {
		return grid_p2_current != null ? grid_p2_current : 0.0000;
	}

	public void setGrid_p2_current(double grid_p2_current) {
		this.grid_p2_current = grid_p2_current;
	}

	public void setGrid_p2_current(Double grid_p2_current) {
		this.grid_p2_current = grid_p2_current;
	}

	public void unSetGrid_p2_current() {
		this.grid_p2_current = 0.0000;
	}

	public Double getGrid_p2_pf() {
		return grid_p2_pf != null ? grid_p2_pf : 0.0000;
	}

	public void setGrid_p2_pf(double grid_p2_pf) {
		this.grid_p2_pf = grid_p2_pf;
	}

	public void setGrid_p2_pf(Double grid_p2_pf) {
		this.grid_p2_pf = grid_p2_pf;
	}

	public void unSetGrid_p2_pf() {
		this.grid_p2_pf = 0.0000;
	}

	public Double getGrid_p2_md() {
		return grid_p2_md != null ? grid_p2_md : 0.0000;
	}

	public void setGrid_p2_md(double grid_p2_md) {
		this.grid_p2_md = grid_p2_md;
	}

	public void setGrid_p2_md(Double grid_p2_md) {
		this.grid_p2_md = grid_p2_md;
	}

	public void unSetGrid_p2_md() {
		this.grid_p2_md = 0.0000;
	}

	public Double getGrid_p2_tdh() {
		return grid_p2_tdh != null ? grid_p2_tdh : 0.0000;
	}

	public void setGrid_p2_tdh(double grid_p2_tdh) {
		this.grid_p2_tdh = grid_p2_tdh;
	}

	public void setGrid_p2_tdh(Double grid_p2_tdh) {
		this.grid_p2_tdh = grid_p2_tdh;
	}

	public void unSetGrid_p2_tdh() {
		this.grid_p2_tdh = 0.0000;
	}

	public Double getGrid_p2_kvarh() {
		return grid_p2_kvarh != null ? grid_p2_kvarh : 0.0000;
	}

	public void setGrid_p2_kvarh(double grid_p2_kvarh) {
		this.grid_p2_kvarh = grid_p2_kvarh;
	}

	public void setGrid_p2_kvarh(Double grid_p2_kvarh) {
		this.grid_p2_kvarh = grid_p2_kvarh;
	}

	public void unSetGrid_p2_kvarh() {
		this.grid_p2_kvarh = 0.0000;
	}

	public Double getGrid_p2_frequency() {
		return grid_p2_frequency != null ? grid_p2_frequency : 0.0000;
	}

	public void setGrid_p2_frequency(double grid_p2_frequency) {
		this.grid_p2_frequency = grid_p2_frequency;
	}

	public void setGrid_p2_frequency(Double grid_p2_frequency) {
		this.grid_p2_frequency = grid_p2_frequency;
	}

	public void unSetGrid_p2_frequency() {
		this.grid_p2_frequency = 0.0000;
	}

	public Double getGrid_p3_reading_kvah() {
		return grid_p3_reading_kvah != null ? grid_p3_reading_kvah : 0.0000;
	}

	public void setGrid_p3_reading_kvah(double grid_p3_reading_kvah) {
		this.grid_p3_reading_kvah = grid_p3_reading_kvah;
	}

	public void setGrid_p3_reading_kvah(Double grid_p3_reading_kvah) {
		this.grid_p3_reading_kvah = grid_p3_reading_kvah;
	}

	public void unSetGrid_p3_reading_kvah() {
		this.grid_p3_reading_kvah = 0.0000;
	}

	public Double getGrid_p3_reading_kwh() {
		return grid_p3_reading_kwh != null ? grid_p3_reading_kwh : 0.0000;
	}

	public void setGrid_p3_reading_kwh(double grid_p3_reading_kwh) {
		this.grid_p3_reading_kwh = grid_p3_reading_kwh;
	}

	public void setGrid_p3_reading_kwh(Double grid_p3_reading_kwh) {
		this.grid_p3_reading_kwh = grid_p3_reading_kwh;
	}

	public void unSetGrid_p3_reading_kwh() {
		this.grid_p3_reading_kwh = 0.0000;
	}

	public Double getGrid_p3_load_kva() {
		return grid_p3_load_kva != null ? grid_p3_load_kva : 0.0000;
	}

	public void setGrid_p3_load_kva(double grid_p3_load_kva) {
		this.grid_p3_load_kva = grid_p3_load_kva;
	}

	public void setGrid_p3_load_kva(Double grid_p3_load_kva) {
		this.grid_p3_load_kva = grid_p3_load_kva;
	}

	public void unSetGrid_p3_load_kva() {
		this.grid_p3_load_kva = 0.0000;
	}

	public Double getGrid_p3_load_kw() {
		return grid_p3_load_kw != null ? grid_p3_load_kw : 0.0000;
	}

	public void setGrid_p3_load_kw(double grid_p3_load_kw) {
		this.grid_p3_load_kw = grid_p3_load_kw;
	}

	public void setGrid_p3_load_kw(Double grid_p3_load_kw) {
		this.grid_p3_load_kw = grid_p3_load_kw;
	}

	public void unSetGrid_p3_load_kw() {
		this.grid_p3_load_kw = 0.0000;
	}

	public Double getGrid_p3_voltage() {
		return grid_p3_voltage != null ? grid_p3_voltage : 0.0000;
	}

	public void setGrid_p3_voltage(double grid_p3_voltage) {
		this.grid_p3_voltage = grid_p3_voltage;
	}

	public void setGrid_p3_voltage(Double grid_p3_voltage) {
		this.grid_p3_voltage = grid_p3_voltage;
	}

	public void unSetGrid_p3_voltage() {
		this.grid_p3_voltage = 0.0000;
	}

	public Double getGrid_p3_current() {
		return grid_p3_current != null ? grid_p3_current : 0.0000;
	}

	public void setGrid_p3_current(double grid_p3_current) {
		this.grid_p3_current = grid_p3_current;
	}

	public void setGrid_p3_current(Double grid_p3_current) {
		this.grid_p3_current = grid_p3_current;
	}

	public void unSetGrid_p3_current() {
		this.grid_p3_current = 0.0000;
	}

	public Double getGrid_p3_pf() {
		return grid_p3_pf != null ? grid_p3_pf : 0.0000;
	}

	public void setGrid_p3_pf(double grid_p3_pf) {
		this.grid_p3_pf = grid_p3_pf;
	}

	public void setGrid_p3_pf(Double grid_p3_pf) {
		this.grid_p3_pf = grid_p3_pf;
	}

	public void unSetGrid_p3_pf() {
		this.grid_p3_pf = 0.0000;
	}

	public Double getGrid_p3_md() {
		return grid_p3_md != null ? grid_p3_md : 0.0000;
	}

	public void setGrid_p3_md(double grid_p3_md) {
		this.grid_p3_md = grid_p3_md;
	}

	public void setGrid_p3_md(Double grid_p3_md) {
		this.grid_p3_md = grid_p3_md;
	}

	public void unSetGrid_p3_md() {
		this.grid_p3_md = 0.0000;
	}

	public Double getGrid_p3_tdh() {
		return grid_p3_tdh != null ? grid_p3_tdh : 0.0000;
	}

	public void setGrid_p3_tdh(double grid_p3_tdh) {
		this.grid_p3_tdh = grid_p3_tdh;
	}

	public void setGrid_p3_tdh(Double grid_p3_tdh) {
		this.grid_p3_tdh = grid_p3_tdh;
	}

	public void unSetGrid_p3_tdh() {
		this.grid_p3_tdh = 0.0000;
	}

	public Double getGrid_p3_kvarh() {
		return grid_p3_kvarh != null ? grid_p3_kvarh : 0.0000;
	}

	public void setGrid_p3_kvarh(double grid_p3_kvarh) {
		this.grid_p3_kvarh = grid_p3_kvarh;
	}

	public void setGrid_p3_kvarh(Double grid_p3_kvarh) {
		this.grid_p3_kvarh = grid_p3_kvarh;
	}

	public void unSetGrid_p3_kvarh() {
		this.grid_p3_kvarh = 0.0000;
	}

	public Double getGrid_p3_frequency() {
		return grid_p3_frequency != null ? grid_p3_frequency : 0.0000;
	}

	public void setGrid_p3_frequency(double grid_p3_frequency) {
		this.grid_p3_frequency = grid_p3_frequency;
	}

	public void setGrid_p3_frequency(Double grid_p3_frequency) {
		this.grid_p3_frequency = grid_p3_frequency;
	}

	public void unSetGrid_p3_frequency() {
		this.grid_p3_frequency = 0.0000;
	}

	public Double getDg_reading_kwh() {
		return dg_reading_kwh != null ? dg_reading_kwh : 0.0000;
	}

	public void setDg_reading_kwh(double dg_reading_kwh) {
		this.dg_reading_kwh = dg_reading_kwh;
	}

	public void setDg_reading_kwh(Double dg_reading_kwh) {
		this.dg_reading_kwh = dg_reading_kwh;
	}

	public void unSetDg_reading_kwh() {
		this.dg_reading_kwh = 0.0000;
	}

	public Double getDg_reading_kvah() {
		return dg_reading_kvah != null ? dg_reading_kvah : 0.0000;
	}

	public void setDg_reading_kvah(double dg_reading_kvah) {
		this.dg_reading_kvah = dg_reading_kvah;
	}

	public void setDg_reading_kvah(Double dg_reading_kvah) {
		this.dg_reading_kvah = dg_reading_kvah;
	}

	public void unSetDg_reading_kvah() {
		this.dg_reading_kvah = 0.0000;
	}

	public Double getDg_today_kwh() {
		return dg_today_kwh != null ? dg_today_kwh : 0.0000;
	}

	public void setDg_today_kwh(double dg_today_kwh) {
		this.dg_today_kwh = dg_today_kwh;
	}

	public void setDg_today_kwh(Double dg_today_kwh) {
		this.dg_today_kwh = dg_today_kwh;
	}

	public void unSetDg_today_kwh() {
		this.dg_today_kwh = 0.0000;
	}

	public Double getDg_current_month_kwh() {
		return dg_current_month_kwh != null ? dg_current_month_kwh : 0.0000;
	}

	public void setDg_current_month_kwh(double dg_current_month_kwh) {
		this.dg_current_month_kwh = dg_current_month_kwh;
	}

	public void setDg_current_month_kwh(Double dg_current_month_kwh) {
		this.dg_current_month_kwh = dg_current_month_kwh;
	}

	public void unSetDg_current_month_kwh() {
		this.dg_current_month_kwh = 0.0000;
	}

	public Double getDg_today_kvah() {
		return dg_today_kvah != null ? dg_today_kvah : 0.0000;
	}

	public void setDg_today_kvah(double dg_today_kvah) {
		this.dg_today_kvah = dg_today_kvah;
	}

	public void setDg_today_kvah(Double dg_today_kvah) {
		this.dg_today_kvah = dg_today_kvah;
	}

	public void unSetDg_today_kvah() {
		this.dg_today_kvah = 0.0000;
	}

	public Double getDg_current_month_kvah() {
		return dg_current_month_kvah != null ? dg_current_month_kvah : 0.0000;
	}

	public void setDg_current_month_kvah(double dg_current_month_kvah) {
		this.dg_current_month_kvah = dg_current_month_kvah;
	}

	public void setDg_current_month_kvah(Double dg_current_month_kvah) {
		this.dg_current_month_kvah = dg_current_month_kvah;
	}

	public void unSetDg_current_month_kvah() {
		this.dg_current_month_kvah = 0.0000;
	}

	public Double getDg_load_kw() {
		return dg_load_kw != null ? dg_load_kw : 0.0000;
	}

	public void setDg_load_kw(double dg_load_kw) {
		this.dg_load_kw = dg_load_kw;
	}

	public void setDg_load_kw(Double dg_load_kw) {
		this.dg_load_kw = dg_load_kw;
	}

	public void unSetDg_load_kw() {
		this.dg_load_kw = 0.0000;
	}

	public Double getDg_load_kva() {
		return dg_load_kva != null ? dg_load_kva : 0.0000;
	}

	public void setDg_load_kva(double dg_load_kva) {
		this.dg_load_kva = dg_load_kva;
	}

	public void setDg_load_kva(Double dg_load_kva) {
		this.dg_load_kva = dg_load_kva;
	}

	public void unSetDg_load_kva() {
		this.dg_load_kva = 0.0000;
	}

	public Double getDg_voltage() {
		return dg_voltage != null ? dg_voltage : 0.0000;
	}

	public void setDg_voltage(double dg_voltage) {
		this.dg_voltage = dg_voltage;
	}

	public void setDg_voltage(Double dg_voltage) {
		this.dg_voltage = dg_voltage;
	}

	public void unSetDg_voltage() {
		this.dg_voltage = 0.0000;
	}

	public Double getDg_current() {
		return dg_current != null ? dg_current : 0.0000;
	}

	public void setDg_current(double dg_current) {
		this.dg_current = dg_current;
	}

	public void setDg_current(Double dg_current) {
		this.dg_current = dg_current;
	}

	public void unSetDg_current() {
		this.dg_current = 0.0000;
	}

	public Double getDg_pf() {
		return dg_pf != null ? dg_pf : 0.0000;
	}

	public void setDg_pf(double dg_pf) {
		this.dg_pf = dg_pf;
	}

	public void setDg_pf(Double dg_pf) {
		this.dg_pf = dg_pf;
	}

	public void unSetDg_pf() {
		this.dg_pf = 0.0000;
	}

	public Double getDg_md() {
		return dg_md != null ? dg_md : 0.0000;
	}

	public void setDg_md(double dg_md) {
		this.dg_md = dg_md;
	}

	public void setDg_md(Double dg_md) {
		this.dg_md = dg_md;
	}

	public void unSetDg_md() {
		this.dg_md = 0.0000;
	}

	public Double getDg_tdh() {
		return dg_tdh != null ? dg_tdh : 0.0000;
	}

	public void setDg_tdh(double dg_tdh) {
		this.dg_tdh = dg_tdh;
	}

	public void setDg_tdh(Double dg_tdh) {
		this.dg_tdh = dg_tdh;
	}

	public void unSetDg_tdh() {
		this.dg_tdh = 0.0000;
	}

	public Double getDg_kvarh() {
		return dg_kvarh != null ? dg_kvarh : 0.0000;
	}

	public void setDg_kvarh(double dg_kvarh) {
		this.dg_kvarh = dg_kvarh;
	}

	public void setDg_kvarh(Double dg_kvarh) {
		this.dg_kvarh = dg_kvarh;
	}

	public void unSetDg_kvarh() {
		this.dg_kvarh = 0.0000;
	}

	public Double getDg_frequency() {
		return dg_frequency != null ? dg_frequency : 0.0000;
	}

	public void setDg_frequency(double dg_frequency) {
		this.dg_frequency = dg_frequency;
	}

	public void setDg_frequency(Double dg_frequency) {
		this.dg_frequency = dg_frequency;
	}

	public void unSetDg_frequency() {
		this.dg_frequency = 0.0000;
	}

	public Double getDg_p1_reading_kvah() {
		return dg_p1_reading_kvah != null ? dg_p1_reading_kvah : 0.0000;
	}

	public void setDg_p1_reading_kvah(double dg_p1_reading_kvah) {
		this.dg_p1_reading_kvah = dg_p1_reading_kvah;
	}

	public void setDg_p1_reading_kvah(Double dg_p1_reading_kvah) {
		this.dg_p1_reading_kvah = dg_p1_reading_kvah;
	}

	public void unSetDg_p1_reading_kvah() {
		this.dg_p1_reading_kvah = 0.0000;
	}

	public Double getDg_p1_reading_kwh() {
		return dg_p1_reading_kwh != null ? dg_p1_reading_kwh : 0.0000;
	}

	public void setDg_p1_reading_kwh(double dg_p1_reading_kwh) {
		this.dg_p1_reading_kwh = dg_p1_reading_kwh;
	}

	public void setDg_p1_reading_kwh(Double dg_p1_reading_kwh) {
		this.dg_p1_reading_kwh = dg_p1_reading_kwh;
	}

	public void unSetDg_p1_reading_kwh() {
		this.dg_p1_reading_kwh = 0.0000;
	}

	public Double getDg_p1_load_kva() {
		return dg_p1_load_kva != null ? dg_p1_load_kva : 0.0000;
	}

	public void setDg_p1_load_kva(double dg_p1_load_kva) {
		this.dg_p1_load_kva = dg_p1_load_kva;
	}

	public void setDg_p1_load_kva(Double dg_p1_load_kva) {
		this.dg_p1_load_kva = dg_p1_load_kva;
	}

	public void unSetDg_p1_load_kva() {
		this.dg_p1_load_kva = 0.0000;
	}

	public Double getDg_p1_load_kw() {
		return dg_p1_load_kw != null ? dg_p1_load_kw : 0.0000;
	}

	public void setDg_p1_load_kw(double dg_p1_load_kw) {
		this.dg_p1_load_kw = dg_p1_load_kw;
	}

	public void setDg_p1_load_kw(Double dg_p1_load_kw) {
		this.dg_p1_load_kw = dg_p1_load_kw;
	}

	public void unSetDg_p1_load_kw() {
		this.dg_p1_load_kw = 0.0000;
	}

	public Double getDg_p1_voltage() {
		return dg_p1_voltage != null ? dg_p1_voltage : 0.0000;
	}

	public void setDg_p1_voltage(double dg_p1_voltage) {
		this.dg_p1_voltage = dg_p1_voltage;
	}

	public void setDg_p1_voltage(Double dg_p1_voltage) {
		this.dg_p1_voltage = dg_p1_voltage;
	}

	public void unSetDg_p1_voltage() {
		this.dg_p1_voltage = 0.0000;
	}

	public Double getDg_p1_current() {
		return dg_p1_current != null ? dg_p1_current : 0.0000;
	}

	public void setDg_p1_current(double dg_p1_current) {
		this.dg_p1_current = dg_p1_current;
	}

	public void setDg_p1_current(Double dg_p1_current) {
		this.dg_p1_current = dg_p1_current;
	}

	public void unSetDg_p1_current() {
		this.dg_p1_current = 0.0000;
	}

	public Double getDg_p1_pf() {
		return dg_p1_pf != null ? dg_p1_pf : 0.0000;
	}

	public void setDg_p1_pf(double dg_p1_pf) {
		this.dg_p1_pf = dg_p1_pf;
	}

	public void setDg_p1_pf(Double dg_p1_pf) {
		this.dg_p1_pf = dg_p1_pf;
	}

	public void unSetDg_p1_pf() {
		this.dg_p1_pf = 0.0000;
	}

	public Double getDg_p1_md() {
		return dg_p1_md != null ? dg_p1_md : 0.0000;
	}

	public void setDg_p1_md(double dg_p1_md) {
		this.dg_p1_md = dg_p1_md;
	}

	public void setDg_p1_md(Double dg_p1_md) {
		this.dg_p1_md = dg_p1_md;
	}

	public void unSetDg_p1_md() {
		this.dg_p1_md = 0.0000;
	}

	public Double getDg_p1_tdh() {
		return dg_p1_tdh != null ? dg_p1_tdh : 0.0000;
	}

	public void setDg_p1_tdh(double dg_p1_tdh) {
		this.dg_p1_tdh = dg_p1_tdh;
	}

	public void setDg_p1_tdh(Double dg_p1_tdh) {
		this.dg_p1_tdh = dg_p1_tdh;
	}

	public void unSetDg_p1_tdh() {
		this.dg_p1_tdh = 0.0000;
	}

	public Double getDg_p1_kvarh() {
		return dg_p1_kvarh != null ? dg_p1_kvarh : 0.0000;
	}

	public void setDg_p1_kvarh(double dg_p1_kvarh) {
		this.dg_p1_kvarh = dg_p1_kvarh;
	}

	public void setDg_p1_kvarh(Double dg_p1_kvarh) {
		this.dg_p1_kvarh = dg_p1_kvarh;
	}

	public void unSetDg_p1_kvarh() {
		this.dg_p1_kvarh = 0.0000;
	}

	public Double getDg_p1_frequency() {
		return dg_p1_frequency != null ? dg_p1_frequency : 0.0000;
	}

	public void setDg_p1_frequency(double dg_p1_frequency) {
		this.dg_p1_frequency = dg_p1_frequency;
	}

	public void setDg_p1_frequency(Double dg_p1_frequency) {
		this.dg_p1_frequency = dg_p1_frequency;
	}

	public void unSetDg_p1_frequency() {
		this.dg_p1_frequency = 0.0000;
	}

	public Double getDg_p2_reading_kvah() {
		return dg_p2_reading_kvah != null ? dg_p2_reading_kvah : 0.0000;
	}

	public void setDg_p2_reading_kvah(double dg_p2_reading_kvah) {
		this.dg_p2_reading_kvah = dg_p2_reading_kvah;
	}

	public void setDg_p2_reading_kvah(Double dg_p2_reading_kvah) {
		this.dg_p2_reading_kvah = dg_p2_reading_kvah;
	}

	public void unSetDg_p2_reading_kvah() {
		this.dg_p2_reading_kvah = 0.0000;
	}

	public Double getDg_p2_reading_kwh() {
		return dg_p2_reading_kwh != null ? dg_p2_reading_kwh : 0.0000;
	}

	public void setDg_p2_reading_kwh(double dg_p2_reading_kwh) {
		this.dg_p2_reading_kwh = dg_p2_reading_kwh;
	}

	public void setDg_p2_reading_kwh(Double dg_p2_reading_kwh) {
		this.dg_p2_reading_kwh = dg_p2_reading_kwh;
	}

	public void unSetDg_p2_reading_kwh() {
		this.dg_p2_reading_kwh = 0.0000;
	}

	public Double getDg_p2_load_kva() {
		return dg_p2_load_kva != null ? dg_p2_load_kva : 0.0000;
	}

	public void setDg_p2_load_kva(double dg_p2_load_kva) {
		this.dg_p2_load_kva = dg_p2_load_kva;
	}

	public void setDg_p2_load_kva(Double dg_p2_load_kva) {
		this.dg_p2_load_kva = dg_p2_load_kva;
	}

	public void unSetDg_p2_load_kva() {
		this.dg_p2_load_kva = 0.0000;
	}

	public Double getDg_p2_load_kw() {
		return dg_p2_load_kw != null ? dg_p2_load_kw : 0.0000;
	}

	public void setDg_p2_load_kw(double dg_p2_load_kw) {
		this.dg_p2_load_kw = dg_p2_load_kw;
	}

	public void setDg_p2_load_kw(Double dg_p2_load_kw) {
		this.dg_p2_load_kw = dg_p2_load_kw;
	}

	public void unSetDg_p2_load_kw() {
		this.dg_p2_load_kw = 0.0000;
	}

	public Double getDg_p2_voltage() {
		return dg_p2_voltage != null ? dg_p2_voltage : 0.0000;
	}

	public void setDg_p2_voltage(double dg_p2_voltage) {
		this.dg_p2_voltage = dg_p2_voltage;
	}

	public void setDg_p2_voltage(Double dg_p2_voltage) {
		this.dg_p2_voltage = dg_p2_voltage;
	}

	public void unSetDg_p2_voltage() {
		this.dg_p2_voltage = 0.0000;
	}

	public Double getDg_p2_current() {
		return dg_p2_current != null ? dg_p2_current : 0.0000;
	}

	public void setDg_p2_current(double dg_p2_current) {
		this.dg_p2_current = dg_p2_current;
	}

	public void setDg_p2_current(Double dg_p2_current) {
		this.dg_p2_current = dg_p2_current;
	}

	public void unSetDg_p2_current() {
		this.dg_p2_current = 0.0000;
	}

	public Double getDg_p2_pf() {
		return dg_p2_pf != null ? dg_p2_pf : 0.0000;
	}

	public void setDg_p2_pf(double dg_p2_pf) {
		this.dg_p2_pf = dg_p2_pf;
	}

	public void setDg_p2_pf(Double dg_p2_pf) {
		this.dg_p2_pf = dg_p2_pf;
	}

	public void unSetDg_p2_pf() {
		this.dg_p2_pf = 0.0000;
	}

	public Double getDg_p2_md() {
		return dg_p2_md != null ? dg_p2_md : 0.0000;
	}

	public void setDg_p2_md(double dg_p2_md) {
		this.dg_p2_md = dg_p2_md;
	}

	public void setDg_p2_md(Double dg_p2_md) {
		this.dg_p2_md = dg_p2_md;
	}

	public void unSetDg_p2_md() {
		this.dg_p2_md = 0.0000;
	}

	public Double getDg_p2_tdh() {
		return dg_p2_tdh != null ? dg_p2_tdh : 0.0000;
	}

	public void setDg_p2_tdh(double dg_p2_tdh) {
		this.dg_p2_tdh = dg_p2_tdh;
	}

	public void setDg_p2_tdh(Double dg_p2_tdh) {
		this.dg_p2_tdh = dg_p2_tdh;
	}

	public void unSetDg_p2_tdh() {
		this.dg_p2_tdh = 0.0000;
	}

	public Double getDg_p2_kvarh() {
		return dg_p2_kvarh != null ? dg_p2_kvarh : 0.0000;
	}

	public void setDg_p2_kvarh(double dg_p2_kvarh) {
		this.dg_p2_kvarh = dg_p2_kvarh;
	}

	public void setDg_p2_kvarh(Double dg_p2_kvarh) {
		this.dg_p2_kvarh = dg_p2_kvarh;
	}

	public void unSetDg_p2_kvarh() {
		this.dg_p2_kvarh = 0.0000;
	}

	public Double getDg_p2_frequency() {
		return dg_p2_frequency != null ? dg_p2_frequency : 0.0000;
	}

	public void setDg_p2_frequency(double dg_p2_frequency) {
		this.dg_p2_frequency = dg_p2_frequency;
	}

	public void setDg_p2_frequency(Double dg_p2_frequency) {
		this.dg_p2_frequency = dg_p2_frequency;
	}

	public void unSetDg_p2_frequency() {
		this.dg_p2_frequency = 0.0000;
	}

	public Double getDg_p3_reading_kvah() {
		return dg_p3_reading_kvah != null ? dg_p3_reading_kvah : 0.0000;
	}

	public void setDg_p3_reading_kvah(double dg_p3_reading_kvah) {
		this.dg_p3_reading_kvah = dg_p3_reading_kvah;
	}

	public void setDg_p3_reading_kvah(Double dg_p3_reading_kvah) {
		this.dg_p3_reading_kvah = dg_p3_reading_kvah;
	}

	public void unSetDg_p3_reading_kvah() {
		this.dg_p3_reading_kvah = 0.0000;
	}

	public Double getDg_p3_reading_kwh() {
		return dg_p3_reading_kwh != null ? dg_p3_reading_kwh : 0.0000;
	}

	public void setDg_p3_reading_kwh(double dg_p3_reading_kwh) {
		this.dg_p3_reading_kwh = dg_p3_reading_kwh;
	}

	public void setDg_p3_reading_kwh(Double dg_p3_reading_kwh) {
		this.dg_p3_reading_kwh = dg_p3_reading_kwh;
	}

	public void unSetDg_p3_reading_kwh() {
		this.dg_p3_reading_kwh = 0.0000;
	}

	public Double getDg_p3_load_kva() {
		return dg_p3_load_kva != null ? dg_p3_load_kva : 0.0000;
	}

	public void setDg_p3_load_kva(double dg_p3_load_kva) {
		this.dg_p3_load_kva = dg_p3_load_kva;
	}

	public void setDg_p3_load_kva(Double dg_p3_load_kva) {
		this.dg_p3_load_kva = dg_p3_load_kva;
	}

	public void unSetDg_p3_load_kva() {
		this.dg_p3_load_kva = 0.0000;
	}

	public Double getDg_p3_load_kw() {
		return dg_p3_load_kw != null ? dg_p3_load_kw : 0.0000;
	}

	public void setDg_p3_load_kw(double dg_p3_load_kw) {
		this.dg_p3_load_kw = dg_p3_load_kw;
	}

	public void setDg_p3_load_kw(Double dg_p3_load_kw) {
		this.dg_p3_load_kw = dg_p3_load_kw;
	}

	public void unSetDg_p3_load_kw() {
		this.dg_p3_load_kw = 0.0000;
	}

	public Double getDg_p3_voltage() {
		return dg_p3_voltage != null ? dg_p3_voltage : 0.0000;
	}

	public void setDg_p3_voltage(double dg_p3_voltage) {
		this.dg_p3_voltage = dg_p3_voltage;
	}

	public void setDg_p3_voltage(Double dg_p3_voltage) {
		this.dg_p3_voltage = dg_p3_voltage;
	}

	public void unSetDg_p3_voltage() {
		this.dg_p3_voltage = 0.0000;
	}

	public Double getDg_p3_current() {
		return dg_p3_current != null ? dg_p3_current : 0.0000;
	}

	public void setDg_p3_current(double dg_p3_current) {
		this.dg_p3_current = dg_p3_current;
	}

	public void setDg_p3_current(Double dg_p3_current) {
		this.dg_p3_current = dg_p3_current;
	}

	public void unSetDg_p3_current() {
		this.dg_p3_current = 0.0000;
	}

	public Double getDg_p3_pf() {
		return dg_p3_pf != null ? dg_p3_pf : 0.0000;
	}

	public void setDg_p3_pf(double dg_p3_pf) {
		this.dg_p3_pf = dg_p3_pf;
	}

	public void setDg_p3_pf(Double dg_p3_pf) {
		this.dg_p3_pf = dg_p3_pf;
	}

	public void unSetDg_p3_pf() {
		this.dg_p3_pf = 0.0000;
	}

	public Double getDg_p3_md() {
		return dg_p3_md != null ? dg_p3_md : 0.0000;
	}

	public void setDg_p3_md(double dg_p3_md) {
		this.dg_p3_md = dg_p3_md;
	}

	public void setDg_p3_md(Double dg_p3_md) {
		this.dg_p3_md = dg_p3_md;
	}

	public void unSetDg_p3_md() {
		this.dg_p3_md = 0.0000;
	}

	public Double getDg_p3_tdh() {
		return dg_p3_tdh != null ? dg_p3_tdh : 0.0000;
	}

	public void setDg_p3_tdh(double dg_p3_tdh) {
		this.dg_p3_tdh = dg_p3_tdh;
	}

	public void setDg_p3_tdh(Double dg_p3_tdh) {
		this.dg_p3_tdh = dg_p3_tdh;
	}

	public void unSetDg_p3_tdh() {
		this.dg_p3_tdh = 0.0000;
	}

	public Double getDg_p3_kvarh() {
		return dg_p3_kvarh != null ? dg_p3_kvarh : 0.0000;
	}

	public void setDg_p3_kvarh(double dg_p3_kvarh) {
		this.dg_p3_kvarh = dg_p3_kvarh;
	}

	public void setDg_p3_kvarh(Double dg_p3_kvarh) {
		this.dg_p3_kvarh = dg_p3_kvarh;
	}

	public void unSetDg_p3_kvarh() {
		this.dg_p3_kvarh = 0.0000;
	}

	public Double getDg_p3_frequency() {
		return dg_p3_frequency != null ? dg_p3_frequency : 0.0000;
	}

	public void setDg_p3_frequency(double dg_p3_frequency) {
		this.dg_p3_frequency = dg_p3_frequency;
	}

	public void setDg_p3_frequency(Double dg_p3_frequency) {
		this.dg_p3_frequency = dg_p3_frequency;
	}

	public void unSetDg_p3_frequency() {
		this.dg_p3_frequency = 0.0000;
	}

	public Double getTemperature() {
		return temperature != null ? temperature : 0.00;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public void unSetTemperature() {
		this.temperature = 0.00;
	}

	public Double getHumidity() {
		return humidity != null ? humidity : 0.00;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public void setHumidity(Double humidity) {
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

	public Double getLevel_float() {
		return level_float != null ? level_float : 0.00;
	}

	public void setLevel_float(double level_float) {
		this.level_float = level_float;
	}

	public void setLevel_float(Double level_float) {
		this.level_float = level_float;
	}

	public void unSetLevel_float() {
		this.level_float = 0.00;
	}

	public Double getFuel_level() {
		return fuel_level != null ? fuel_level : 0.00;
	}

	public void setFuel_level(double fuel_level) {
		this.fuel_level = fuel_level;
	}

	public void setFuel_level(Double fuel_level) {
		this.fuel_level = fuel_level;
	}

	public void unSetFuel_level() {
		this.fuel_level = 0.00;
	}

	public Double getFuel_quantity() {
		return fuel_quantity != null ? fuel_quantity : 0.00;
	}

	public void setFuel_quantity(double fuel_quantity) {
		this.fuel_quantity = fuel_quantity;
	}

	public void setFuel_quantity(Double fuel_quantity) {
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

	public String getMaintaince_mode() {
		return maintaince_mode != null ? maintaince_mode : "N";
	}

	public void setMaintaince_mode(String maintaince_mode) {
		this.maintaince_mode = maintaince_mode;
	}

	public void unSetMaintaince_mode() {
		this.maintaince_mode = "N";
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

	public String getHigh_coolant_temperature() {
		return high_coolant_temperature != null ? high_coolant_temperature : "N";
	}

	public void setHigh_coolant_temperature(String high_coolant_temperature) {
		this.high_coolant_temperature = high_coolant_temperature;
	}

	public void unSetHigh_coolant_temperature() {
		this.high_coolant_temperature = "N";
	}

	public Double getCanopy_temperature() {
		return canopy_temperature != null ? canopy_temperature : 0.00;
	}

	public void setCanopy_temperature(double canopy_temperature) {
		this.canopy_temperature = canopy_temperature;
	}

	public void setCanopy_temperature(Double canopy_temperature) {
		this.canopy_temperature = canopy_temperature;
	}

	public void unSetCanopy_temperature() {
		this.canopy_temperature = 0.00;
	}

	public Double getCoolant_temperature() {
		return coolant_temperature != null ? coolant_temperature : 0.00;
	}

	public void setCoolant_temperature(double coolant_temperature) {
		this.coolant_temperature = coolant_temperature;
	}

	public void setCoolant_temperature(Double coolant_temperature) {
		this.coolant_temperature = coolant_temperature;
	}

	public void unSetCoolant_temperature() {
		this.coolant_temperature = 0.00;
	}

	public String getHigh_canopy_temperature() {
		return high_canopy_temperature != null ? high_canopy_temperature : "N";
	}

	public void setHigh_canopy_temperature(String high_canopy_temperature) {
		this.high_canopy_temperature = high_canopy_temperature;
	}

	public void unSetHigh_canopy_temperature() {
		this.high_canopy_temperature = "N";
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

	public Double getLast_processed_fuel_quantity() {
		return last_processed_fuel_quantity != null ? last_processed_fuel_quantity : 0.00;
	}

	public void setLast_processed_fuel_quantity(double last_processed_fuel_quantity) {
		this.last_processed_fuel_quantity = last_processed_fuel_quantity;
	}

	public void setLast_processed_fuel_quantity(Double last_processed_fuel_quantity) {
		this.last_processed_fuel_quantity = last_processed_fuel_quantity;
	}

	public void unSetLast_processed_fuel_quantity() {
		this.last_processed_fuel_quantity = 0.00;
	}

	public Double getLast_processed_db_reading() {
		return last_processed_db_reading != null ? last_processed_db_reading : 0.00;
	}

	public void setLast_processed_db_reading(double last_processed_db_reading) {
		this.last_processed_db_reading = last_processed_db_reading;
	}

	public void setLast_processed_db_reading(Double last_processed_db_reading) {
		this.last_processed_db_reading = last_processed_db_reading;
	}

	public void unSetLast_processed_db_reading() {
		this.last_processed_db_reading = 0.00;
	}

	public Double getLast_processed_grid_reading() {
		return last_processed_grid_reading != null ? last_processed_grid_reading : 0.00;
	}

	public void setLast_processed_grid_reading(double last_processed_grid_reading) {
		this.last_processed_grid_reading = last_processed_grid_reading;
	}

	public void setLast_processed_grid_reading(Double last_processed_grid_reading) {
		this.last_processed_grid_reading = last_processed_grid_reading;
	}

	public void unSetLast_processed_grid_reading() {
		this.last_processed_grid_reading = 0.00;
	}

	public String getLangitude() {
		return langitude;
	}

	public String getLangitudeEx() {
		return langitude != null ? langitude : "";
	}

	public void setLangitude(String langitude) {
		this.langitude = langitude;
	}

	public void unSetLangitude() {
		this.langitude = null;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLatitudeEx() {
		return latitude != null ? latitude : "";
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void unSetLatitude() {
		this.latitude = null;
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

	public String getDriveType() {
		return driveType != null ? driveType : "OWN";
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public void unSetDriveType() {
		this.driveType = "OWN";
	}

	public String getCurrentDriverId() {
		return currentDriverId;
	}

	public String getCurrentDriverIdEx() {
		return currentDriverId != null ? currentDriverId : "";
	}

	public void setCurrentDriverId(String currentDriverId) {
		this.currentDriverId = currentDriverId;
	}

	public void unSetCurrentDriverId() {
		this.currentDriverId = null;
	}

	public Double getEngineTemperature() {
		return engineTemperature != null ? engineTemperature : 0.0;
	}

	public void setEngineTemperature(double engineTemperature) {
		this.engineTemperature = engineTemperature;
	}

	public void setEngineTemperature(Double engineTemperature) {
		this.engineTemperature = engineTemperature;
	}

	public void unSetEngineTemperature() {
		this.engineTemperature = 0.0;
	}

	public String getIgnitionState() {
		return ignitionState != null ? ignitionState : "N";
	}

	public void setIgnitionState(String ignitionState) {
		this.ignitionState = ignitionState;
	}

	public void unSetIgnitionState() {
		this.ignitionState = "N";
	}

	public String getEngineOverHeatState() {
		return engineOverHeatState != null ? engineOverHeatState : "N";
	}

	public void setEngineOverHeatState(String engineOverHeatState) {
		this.engineOverHeatState = engineOverHeatState;
	}

	public void unSetEngineOverHeatState() {
		this.engineOverHeatState = "N";
	}

	public String getLowBatteryState() {
		return lowBatteryState != null ? lowBatteryState : "N";
	}

	public void setLowBatteryState(String lowBatteryState) {
		this.lowBatteryState = lowBatteryState;
	}

	public void unSetLowBatteryState() {
		this.lowBatteryState = "N";
	}

	public String getObdLowBatteryState() {
		return obdLowBatteryState != null ? obdLowBatteryState : "N";
	}

	public void setObdLowBatteryState(String obdLowBatteryState) {
		this.obdLowBatteryState = obdLowBatteryState;
	}

	public void unSetObdLowBatteryState() {
		this.obdLowBatteryState = "N";
	}

	public Double getBatteryLevel() {
		return batteryLevel != null ? batteryLevel : 0.0;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setBatteryLevel(Double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void unSetBatteryLevel() {
		this.batteryLevel = 0.0;
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

	public Double getAtmoshericPressure() {
		return atmoshericPressure != null ? atmoshericPressure : 0.0;
	}

	public void setAtmoshericPressure(double atmoshericPressure) {
		this.atmoshericPressure = atmoshericPressure;
	}

	public void setAtmoshericPressure(Double atmoshericPressure) {
		this.atmoshericPressure = atmoshericPressure;
	}

	public void unSetAtmoshericPressure() {
		this.atmoshericPressure = 0.0;
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

	public Double getOilPressure() {
		return oilPressure != null ? oilPressure : 0.0;
	}

	public void setOilPressure(double oilPressure) {
		this.oilPressure = oilPressure;
	}

	public void setOilPressure(Double oilPressure) {
		this.oilPressure = oilPressure;
	}

	public void unSetOilPressure() {
		this.oilPressure = 0.0;
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

	public Double getBatteryVoltage() {
		return batteryVoltage != null ? batteryVoltage : 0.0;
	}

	public void setBatteryVoltage(double batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}

	public void setBatteryVoltage(Double batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}

	public void unSetBatteryVoltage() {
		this.batteryVoltage = 0.0;
	}

	public Double getIntakeTubeAbsolutePressure() {
		return intakeTubeAbsolutePressure != null ? intakeTubeAbsolutePressure : 0.0;
	}

	public void setIntakeTubeAbsolutePressure(double intakeTubeAbsolutePressure) {
		this.intakeTubeAbsolutePressure = intakeTubeAbsolutePressure;
	}

	public void setIntakeTubeAbsolutePressure(Double intakeTubeAbsolutePressure) {
		this.intakeTubeAbsolutePressure = intakeTubeAbsolutePressure;
	}

	public void unSetIntakeTubeAbsolutePressure() {
		this.intakeTubeAbsolutePressure = 0.0;
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


	public String getTimeZone() {
		return timeZone != null ? timeZone : "IST";
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public void unSetTimeZone() {
		this.timeZone = "IST";
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public String getFuel_typeEx() {
		return fuel_type != null ? fuel_type : "";
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public void unSetFuel_type() {
		this.fuel_type = null;
	}

	public Double getStart_reading() {
		return start_reading != null ? start_reading : 0.0;
	}

	public void setStart_reading(double start_reading) {
		this.start_reading = start_reading;
	}

	public void setStart_reading(Double start_reading) {
		this.start_reading = start_reading;
	}

	public void unSetStart_reading() {
		this.start_reading = 0.0;
	}

	public String getGrid_state() {
		return grid_state != null ? grid_state : "N";
	}

	public void setGrid_state(String grid_state) {
		this.grid_state = grid_state;
	}

	public void unSetGrid_state() {
		this.grid_state = "N";
	}

	public Integer getTiming_advance() {
		return timing_advance;
	}

	public int getTiming_advanceEx() {
		return timing_advance != null ? timing_advance : 0;
	}

	public void setTiming_advance(int timing_advance) {
		this.timing_advance = timing_advance;
	}

	public void setTiming_advance(Integer timing_advance) {
		this.timing_advance = timing_advance;
	}

	public void unSetTiming_advance() {
		this.timing_advance = null;
	}

	public Integer getManifoldABSPressure() {
		return manifoldABSPressure;
	}

	public int getManifoldABSPressureEx() {
		return manifoldABSPressure != null ? manifoldABSPressure : 0;
	}

	public void setManifoldABSPressure(int manifoldABSPressure) {
		this.manifoldABSPressure = manifoldABSPressure;
	}

	public void setManifoldABSPressure(Integer manifoldABSPressure) {
		this.manifoldABSPressure = manifoldABSPressure;
	}

	public void unSetManifoldABSPressure() {
		this.manifoldABSPressure = null;
	}

	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}


	public Double getCurrent_fuel_consumption() {
		return current_fuel_consumption != null ? current_fuel_consumption : 0.0;
	}

	public void setCurrent_fuel_consumption(double current_fuel_consumption) {
		this.current_fuel_consumption = current_fuel_consumption;
	}

	public void setCurrent_fuel_consumption(Double current_fuel_consumption) {
		this.current_fuel_consumption = current_fuel_consumption;
	}

	public void unSetCurrent_fuel_consumption() {
		this.current_fuel_consumption = 0.0;
	}

	public Double getFuel_calibration_factor() {
		return fuel_calibration_factor != null ? fuel_calibration_factor : 0.0;
	}

	public void setFuel_calibration_factor(double fuel_calibration_factor) {
		this.fuel_calibration_factor = fuel_calibration_factor;
	}

	public void setFuel_calibration_factor(Double fuel_calibration_factor) {
		this.fuel_calibration_factor = fuel_calibration_factor;
	}

	public void unSetFuel_calibration_factor() {
		this.fuel_calibration_factor = 0.0;
	}

	public String getLowFuelState() {
		return lowFuelState != null ? lowFuelState : "N";
	}

	public void setLowFuelState(String lowFuelState) {
		this.lowFuelState = lowFuelState;
	}

	public void unSetLowFuelState() {
		this.lowFuelState = "N";
	}

	public Long getLowFuelStateEnterTime() {
		return lowFuelStateEnterTime;
	}

	public void setLowFuelStateEnterTime(Long lowFuelStateEnterTime) {
		this.lowFuelStateEnterTime = lowFuelStateEnterTime;
	}


	public String getLowOilPressureState() {
		return lowOilPressureState != null ? lowOilPressureState : "N";
	}

	public void setLowOilPressureState(String lowOilPressureState) {
		this.lowOilPressureState = lowOilPressureState;
	}

	public void unSetLowOilPressureState() {
		this.lowOilPressureState = "N";
	}

	public String getOverSpeedState() {
		return overSpeedState != null ? overSpeedState : "N";
	}

	public void setOverSpeedState(String overSpeedState) {
		this.overSpeedState = overSpeedState;
	}

	public void unSetOverSpeedState() {
		this.overSpeedState = "N";
	}

	public String getStarterTriggered() {
		return starterTriggered != null ? starterTriggered : "N";
	}

	public void setStarterTriggered(String starterTriggered) {
		this.starterTriggered = starterTriggered;
	}

	public void unSetStarterTriggered() {
		this.starterTriggered = "N";
	}

	public String getWaterInFuel() {
		return waterInFuel != null ? waterInFuel : "N";
	}

	public void setWaterInFuel(String waterInFuel) {
		this.waterInFuel = waterInFuel;
	}

	public void unSetWaterInFuel() {
		this.waterInFuel = "N";
	}

	public String getRemoteControl() {
		return remoteControl != null ? remoteControl : "N";
	}

	public void setRemoteControl(String remoteControl) {
		this.remoteControl = remoteControl;
	}

	public void unSetRemoteControl() {
		this.remoteControl = "N";
	}

	public String getTest() {
		return test != null ? test : "N";
	}

	public void setTest(String test) {
		this.test = test;
	}

	public void unSetTest() {
		this.test = "N";
	}

	public String getTempered() {
		return tempered != null ? tempered : "N";
	}

	public void setTempered(String tempered) {
		this.tempered = tempered;
	}

	public void unSetTempered() {
		this.tempered = "N";
	}

	public String getFeatureEngineMonitoring() {
		return featureEngineMonitoring != null ? featureEngineMonitoring : "N";
	}

	public void setFeatureEngineMonitoring(String featureEngineMonitoring) {
		this.featureEngineMonitoring = featureEngineMonitoring;
	}

	public void unSetFeatureEngineMonitoring() {
		this.featureEngineMonitoring = "N";
	}

	public String getFeatureTracking() {
		return featureTracking != null ? featureTracking : "N";
	}

	public void setFeatureTracking(String featureTracking) {
		this.featureTracking = featureTracking;
	}

	public void unSetFeatureTracking() {
		this.featureTracking = "N";
	}

	public String getCurrentRouteId() {
		return currentRouteId;
	}

	public String getCurrentRouteIdEx() {
		return currentRouteId != null ? currentRouteId : "";
	}

	public void setCurrentRouteId(String currentRouteId) {
		this.currentRouteId = currentRouteId;
	}

	public void unSetCurrentRouteId() {
		this.currentRouteId = null;
	}

	public String getLastStopageId() {
		return lastStopageId;
	}

	public String getLastStopageIdEx() {
		return lastStopageId != null ? lastStopageId : "";
	}

	public void setLastStopageId(String lastStopageId) {
		this.lastStopageId = lastStopageId;
	}

	public void unSetLastStopageId() {
		this.lastStopageId = null;
	}

	public Long getSittingCapacity() {
		return sittingCapacity;
	}

	public long getSittingCapacityEx() {
		return sittingCapacity != null ? sittingCapacity : 0L;
	}

	public void setSittingCapacity(long sittingCapacity) {
		this.sittingCapacity = sittingCapacity;
	}

	public void setSittingCapacity(Long sittingCapacity) {
		this.sittingCapacity = sittingCapacity;
	}

	public void unSetSittingCapacity() {
		this.sittingCapacity = null;
	}

	public String getInsuranceExpiry() {
		return insuranceExpiry;
	}

	public String getInsuranceExpiryEx() {
		return insuranceExpiry != null ? insuranceExpiry : "";
	}

	public void setInsuranceExpiry(String insuranceExpiry) {
		this.insuranceExpiry = insuranceExpiry;
	}

	public void unSetInsuranceExpiry() {
		this.insuranceExpiry = null;
	}

	public String getPollutionCertificateExpiry() {
		return pollutionCertificateExpiry;
	}

	public String getPollutionCertificateExpiryEx() {
		return pollutionCertificateExpiry != null ? pollutionCertificateExpiry : "";
	}

	public void setPollutionCertificateExpiry(String pollutionCertificateExpiry) {
		this.pollutionCertificateExpiry = pollutionCertificateExpiry;
	}

	public void unSetPollutionCertificateExpiry() {
		this.pollutionCertificateExpiry = null;
	}

	public String getVehicleFitnessExpiry() {
		return vehicleFitnessExpiry;
	}

	public String getVehicleFitnessExpiryEx() {
		return vehicleFitnessExpiry != null ? vehicleFitnessExpiry : "";
	}

	public void setVehicleFitnessExpiry(String vehicleFitnessExpiry) {
		this.vehicleFitnessExpiry = vehicleFitnessExpiry;
	}

	public void unSetVehicleFitnessExpiry() {
		this.vehicleFitnessExpiry = null;
	}

	public String getLastService() {
		return lastService;
	}

	public String getLastServiceEx() {
		return lastService != null ? lastService : "";
	}

	public void setLastService(String lastService) {
		this.lastService = lastService;
	}

	public void unSetLastService() {
		this.lastService = null;
	}

	public String getCurrent_route_name() {
		return current_route_name;
	}

	public String getCurrent_route_nameEx() {
		return current_route_name != null ? current_route_name : "";
	}

	public void setCurrent_route_name(String current_route_name) {
		this.current_route_name = current_route_name;
	}

	public void unSetCurrent_route_name() {
		this.current_route_name = null;
	}

	public String getCurrent_route_schedule() {
		return current_route_schedule;
	}

	public String getCurrent_route_scheduleEx() {
		return current_route_schedule != null ? current_route_schedule : "";
	}

	public void setCurrent_route_schedule(String current_route_schedule) {
		this.current_route_schedule = current_route_schedule;
	}

	public void unSetCurrent_route_schedule() {
		this.current_route_schedule = null;
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

	public Long getLast_stopage_reached_time() {
		return last_stopage_reached_time;
	}

	public long getLast_stopage_reached_timeEx() {
		return last_stopage_reached_time != null ? last_stopage_reached_time : 0L;
	}

	public void setLast_stopage_reached_time(long last_stopage_reached_time) {
		this.last_stopage_reached_time = last_stopage_reached_time;
	}

	public void setLast_stopage_reached_time(Long last_stopage_reached_time) {
		this.last_stopage_reached_time = last_stopage_reached_time;
	}

	public void unSetLast_stopage_reached_time() {
		this.last_stopage_reached_time = null;
	}

	public Long getCritical_alerts() {
		return critical_alerts != null ? critical_alerts : 0L;
	}

	public void setCritical_alerts(long critical_alerts) {
		this.critical_alerts = critical_alerts;
	}

	public void setCritical_alerts(Long critical_alerts) {
		this.critical_alerts = critical_alerts;
	}

	public void unSetCritical_alerts() {
		this.critical_alerts = 0L;
	}

	public Long getMajor_alerts() {
		return major_alerts != null ? major_alerts : 0L;
	}

	public void setMajor_alerts(long major_alerts) {
		this.major_alerts = major_alerts;
	}

	public void setMajor_alerts(Long major_alerts) {
		this.major_alerts = major_alerts;
	}

	public void unSetMajor_alerts() {
		this.major_alerts = 0L;
	}

	public Long getWanring_alerts() {
		return wanring_alerts != null ? wanring_alerts : 0L;
	}

	public void setWanring_alerts(long wanring_alerts) {
		this.wanring_alerts = wanring_alerts;
	}

	public void setWanring_alerts(Long wanring_alerts) {
		this.wanring_alerts = wanring_alerts;
	}

	public void unSetWanring_alerts() {
		this.wanring_alerts = 0L;
	}

	public Long getMinor_alerts() {
		return minor_alerts != null ? minor_alerts : 0L;
	}

	public void setMinor_alerts(long minor_alerts) {
		this.minor_alerts = minor_alerts;
	}

	public void setMinor_alerts(Long minor_alerts) {
		this.minor_alerts = minor_alerts;
	}

	public void unSetMinor_alerts() {
		this.minor_alerts = 0L;
	}

	public Double getCost() {
		return cost;
	}

	public double getCostEx() {
		return cost != null ? cost : 0;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public void unSetCost() {
		this.cost = null;
	}

	public String getCost_unit() {
		return cost_unit;
	}

	public String getCost_unitEx() {
		return cost_unit != null ? cost_unit : "";
	}

	public void setCost_unit(String cost_unit) {
		this.cost_unit = cost_unit;
	}

	public void unSetCost_unit() {
		this.cost_unit = null;
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