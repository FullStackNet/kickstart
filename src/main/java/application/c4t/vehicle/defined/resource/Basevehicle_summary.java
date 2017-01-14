/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basevehicle_summary extends BaseResource {
	private Number group_name = null;
	private Number appliance_type = null;
	private Number today_fuel_consumed = null;
	private Number today_fuel_loss = null;
	private Number fuel_quantity = null;
	private Integer number_of_low_fuel = null;
	private Integer number_of_high_water_temp = null;
	private Integer number_of_high_canopy_temp = null;
	private Integer number_of_high_coolant_temp = null;
	private Integer number_of_dg_on = null;
	private Integer number_of_dg_off = null;
	private Integer number_of_dg_grid_both_running = null;
	private Integer number_of_dg_grid_both_not_running = null;
	private Integer number_of_start_failed = null;
	private Integer number_of_not_performed = null;
	private Integer number_of_not_performed_well = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_GROUP_NAME = "group_name";
	public static String FIELD_APPLIANCE_TYPE = "appliance_type";
	public static String FIELD_TODAY_FUEL_CONSUMED = "today_fuel_consumed";
	public static String FIELD_TODAY_FUEL_LOSS = "today_fuel_loss";
	public static String FIELD_FUEL_QUANTITY = "fuel_quantity";
	public static String FIELD_NUMBER_OF_LOW_FUEL = "number_of_low_fuel";
	public static String FIELD_NUMBER_OF_HIGH_WATER_TEMP = "number_of_high_water_temp";
	public static String FIELD_NUMBER_OF_HIGH_CANOPY_TEMP = "number_of_high_canopy_temp";
	public static String FIELD_NUMBER_OF_HIGH_COOLANT_TEMP = "number_of_high_coolant_temp";
	public static String FIELD_NUMBER_OF_DG_ON = "number_of_dg_on";
	public static String FIELD_NUMBER_OF_DG_OFF = "number_of_dg_off";
	public static String FIELD_NUMBER_OF_DG_GRID_BOTH_RUNNING = "number_of_dg_grid_both_running";
	public static String FIELD_NUMBER_OF_DG_GRID_BOTH_NOT_RUNNING = "number_of_dg_grid_both_not_running";
	public static String FIELD_NUMBER_OF_START_FAILED = "number_of_start_failed";
	public static String FIELD_NUMBER_OF_NOT_PERFORMED = "number_of_not_performed";
	public static String FIELD_NUMBER_OF_NOT_PERFORMED_WELL = "number_of_not_performed_well";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("vehicle_summary");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field group_nameField = new Field("group_name", "Number");
		group_nameField.setDefaultValue(0.00);
		group_nameField.setLength(10);
		group_nameField.setPrecision(2);
		metaData.addField(group_nameField);

		Field appliance_typeField = new Field("appliance_type", "Number");
		appliance_typeField.setDefaultValue(0.00);
		appliance_typeField.setLength(10);
		appliance_typeField.setPrecision(2);
		metaData.addField(appliance_typeField);

		Field today_fuel_consumedField = new Field("today_fuel_consumed", "Number");
		today_fuel_consumedField.setDefaultValue(0.00);
		today_fuel_consumedField.setLength(10);
		today_fuel_consumedField.setPrecision(2);
		metaData.addField(today_fuel_consumedField);

		Field today_fuel_lossField = new Field("today_fuel_loss", "Number");
		today_fuel_lossField.setDefaultValue(0.00);
		today_fuel_lossField.setLength(10);
		today_fuel_lossField.setPrecision(2);
		metaData.addField(today_fuel_lossField);

		Field fuel_quantityField = new Field("fuel_quantity", "Number");
		fuel_quantityField.setDefaultValue(0.00);
		fuel_quantityField.setLength(10);
		fuel_quantityField.setPrecision(2);
		metaData.addField(fuel_quantityField);

		Field number_of_low_fuelField = new Field("number_of_low_fuel", "int");
		number_of_low_fuelField.setDefaultValue(0);
		number_of_low_fuelField.setLength(10);
		metaData.addField(number_of_low_fuelField);

		Field number_of_high_water_tempField = new Field("number_of_high_water_temp", "int");
		number_of_high_water_tempField.setDefaultValue(0);
		number_of_high_water_tempField.setLength(10);
		metaData.addField(number_of_high_water_tempField);

		Field number_of_high_canopy_tempField = new Field("number_of_high_canopy_temp", "int");
		number_of_high_canopy_tempField.setDefaultValue(0);
		number_of_high_canopy_tempField.setLength(10);
		metaData.addField(number_of_high_canopy_tempField);

		Field number_of_high_coolant_tempField = new Field("number_of_high_coolant_temp", "int");
		number_of_high_coolant_tempField.setDefaultValue(0);
		number_of_high_coolant_tempField.setLength(10);
		metaData.addField(number_of_high_coolant_tempField);

		Field number_of_dg_onField = new Field("number_of_dg_on", "int");
		number_of_dg_onField.setDefaultValue(0);
		number_of_dg_onField.setLength(10);
		metaData.addField(number_of_dg_onField);

		Field number_of_dg_offField = new Field("number_of_dg_off", "int");
		number_of_dg_offField.setDefaultValue(0);
		number_of_dg_offField.setLength(10);
		metaData.addField(number_of_dg_offField);

		Field number_of_dg_grid_both_runningField = new Field("number_of_dg_grid_both_running", "int");
		number_of_dg_grid_both_runningField.setDefaultValue(0);
		number_of_dg_grid_both_runningField.setLength(10);
		metaData.addField(number_of_dg_grid_both_runningField);

		Field number_of_dg_grid_both_not_runningField = new Field("number_of_dg_grid_both_not_running", "int");
		number_of_dg_grid_both_not_runningField.setDefaultValue(0);
		number_of_dg_grid_both_not_runningField.setLength(10);
		metaData.addField(number_of_dg_grid_both_not_runningField);

		Field number_of_start_failedField = new Field("number_of_start_failed", "int");
		number_of_start_failedField.setDefaultValue(0);
		number_of_start_failedField.setLength(10);
		metaData.addField(number_of_start_failedField);

		Field number_of_not_performedField = new Field("number_of_not_performed", "int");
		number_of_not_performedField.setDefaultValue(0);
		number_of_not_performedField.setLength(10);
		metaData.addField(number_of_not_performedField);

		Field number_of_not_performed_wellField = new Field("number_of_not_performed_well", "int");
		number_of_not_performed_wellField.setDefaultValue(0);
		number_of_not_performed_wellField.setLength(10);
		metaData.addField(number_of_not_performed_wellField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("vehicle_summary");

		metaData.setCluster("DB_DEVICE");
	}

	public Basevehicle_summary() {}

	public Basevehicle_summary(Basevehicle_summary obj) {
		this.group_name = obj.group_name;
		this.appliance_type = obj.appliance_type;
		this.today_fuel_consumed = obj.today_fuel_consumed;
		this.today_fuel_loss = obj.today_fuel_loss;
		this.fuel_quantity = obj.fuel_quantity;
		this.number_of_low_fuel = obj.number_of_low_fuel;
		this.number_of_high_water_temp = obj.number_of_high_water_temp;
		this.number_of_high_canopy_temp = obj.number_of_high_canopy_temp;
		this.number_of_high_coolant_temp = obj.number_of_high_coolant_temp;
		this.number_of_dg_on = obj.number_of_dg_on;
		this.number_of_dg_off = obj.number_of_dg_off;
		this.number_of_dg_grid_both_running = obj.number_of_dg_grid_both_running;
		this.number_of_dg_grid_both_not_running = obj.number_of_dg_grid_both_not_running;
		this.number_of_start_failed = obj.number_of_start_failed;
		this.number_of_not_performed = obj.number_of_not_performed;
		this.number_of_not_performed_well = obj.number_of_not_performed_well;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(group_name == null)
			group_name = 0.00;
		if(appliance_type == null)
			appliance_type = 0.00;
		if(today_fuel_consumed == null)
			today_fuel_consumed = 0.00;
		if(today_fuel_loss == null)
			today_fuel_loss = 0.00;
		if(fuel_quantity == null)
			fuel_quantity = 0.00;
		if(number_of_low_fuel == null)
			number_of_low_fuel = 0;
		if(number_of_high_water_temp == null)
			number_of_high_water_temp = 0;
		if(number_of_high_canopy_temp == null)
			number_of_high_canopy_temp = 0;
		if(number_of_high_coolant_temp == null)
			number_of_high_coolant_temp = 0;
		if(number_of_dg_on == null)
			number_of_dg_on = 0;
		if(number_of_dg_off == null)
			number_of_dg_off = 0;
		if(number_of_dg_grid_both_running == null)
			number_of_dg_grid_both_running = 0;
		if(number_of_dg_grid_both_not_running == null)
			number_of_dg_grid_both_not_running = 0;
		if(number_of_start_failed == null)
			number_of_start_failed = 0;
		if(number_of_not_performed == null)
			number_of_not_performed = 0;
		if(number_of_not_performed_well == null)
			number_of_not_performed_well = 0;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(group_name != null)
			map.put("group_name", group_name);
		if(appliance_type != null)
			map.put("appliance_type", appliance_type);
		if(today_fuel_consumed != null)
			map.put("today_fuel_consumed", today_fuel_consumed);
		if(today_fuel_loss != null)
			map.put("today_fuel_loss", today_fuel_loss);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(number_of_low_fuel != null)
			map.put("number_of_low_fuel", number_of_low_fuel);
		if(number_of_high_water_temp != null)
			map.put("number_of_high_water_temp", number_of_high_water_temp);
		if(number_of_high_canopy_temp != null)
			map.put("number_of_high_canopy_temp", number_of_high_canopy_temp);
		if(number_of_high_coolant_temp != null)
			map.put("number_of_high_coolant_temp", number_of_high_coolant_temp);
		if(number_of_dg_on != null)
			map.put("number_of_dg_on", number_of_dg_on);
		if(number_of_dg_off != null)
			map.put("number_of_dg_off", number_of_dg_off);
		if(number_of_dg_grid_both_running != null)
			map.put("number_of_dg_grid_both_running", number_of_dg_grid_both_running);
		if(number_of_dg_grid_both_not_running != null)
			map.put("number_of_dg_grid_both_not_running", number_of_dg_grid_both_not_running);
		if(number_of_start_failed != null)
			map.put("number_of_start_failed", number_of_start_failed);
		if(number_of_not_performed != null)
			map.put("number_of_not_performed", number_of_not_performed);
		if(number_of_not_performed_well != null)
			map.put("number_of_not_performed_well", number_of_not_performed_well);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(group_name != null)
			map.put("group_name", group_name);
		if(appliance_type != null)
			map.put("appliance_type", appliance_type);
		if(today_fuel_consumed != null)
			map.put("today_fuel_consumed", today_fuel_consumed);
		if(today_fuel_loss != null)
			map.put("today_fuel_loss", today_fuel_loss);
		if(fuel_quantity != null)
			map.put("fuel_quantity", fuel_quantity);
		if(number_of_low_fuel != null)
			map.put("number_of_low_fuel", number_of_low_fuel);
		if(number_of_high_water_temp != null)
			map.put("number_of_high_water_temp", number_of_high_water_temp);
		if(number_of_high_canopy_temp != null)
			map.put("number_of_high_canopy_temp", number_of_high_canopy_temp);
		if(number_of_high_coolant_temp != null)
			map.put("number_of_high_coolant_temp", number_of_high_coolant_temp);
		if(number_of_dg_on != null)
			map.put("number_of_dg_on", number_of_dg_on);
		if(number_of_dg_off != null)
			map.put("number_of_dg_off", number_of_dg_off);
		if(number_of_dg_grid_both_running != null)
			map.put("number_of_dg_grid_both_running", number_of_dg_grid_both_running);
		if(number_of_dg_grid_both_not_running != null)
			map.put("number_of_dg_grid_both_not_running", number_of_dg_grid_both_not_running);
		if(number_of_start_failed != null)
			map.put("number_of_start_failed", number_of_start_failed);
		if(number_of_not_performed != null)
			map.put("number_of_not_performed", number_of_not_performed);
		if(number_of_not_performed_well != null)
			map.put("number_of_not_performed_well", number_of_not_performed_well);
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
		group_name = (Number) map.get("group_name");
		appliance_type = (Number) map.get("appliance_type");
		today_fuel_consumed = (Number) map.get("today_fuel_consumed");
		today_fuel_loss = (Number) map.get("today_fuel_loss");
		fuel_quantity = (Number) map.get("fuel_quantity");
		number_of_low_fuel = (Integer) map.get("number_of_low_fuel");
		number_of_high_water_temp = (Integer) map.get("number_of_high_water_temp");
		number_of_high_canopy_temp = (Integer) map.get("number_of_high_canopy_temp");
		number_of_high_coolant_temp = (Integer) map.get("number_of_high_coolant_temp");
		number_of_dg_on = (Integer) map.get("number_of_dg_on");
		number_of_dg_off = (Integer) map.get("number_of_dg_off");
		number_of_dg_grid_both_running = (Integer) map.get("number_of_dg_grid_both_running");
		number_of_dg_grid_both_not_running = (Integer) map.get("number_of_dg_grid_both_not_running");
		number_of_start_failed = (Integer) map.get("number_of_start_failed");
		number_of_not_performed = (Integer) map.get("number_of_not_performed");
		number_of_not_performed_well = (Integer) map.get("number_of_not_performed_well");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object group_nameObj = map.get("group_name");
		if(group_nameObj != null)
			group_name = new Double(group_nameObj.toString());

		Object appliance_typeObj = map.get("appliance_type");
		if(appliance_typeObj != null)
			appliance_type = new Double(appliance_typeObj.toString());

		Object today_fuel_consumedObj = map.get("today_fuel_consumed");
		if(today_fuel_consumedObj != null)
			today_fuel_consumed = new Double(today_fuel_consumedObj.toString());

		Object today_fuel_lossObj = map.get("today_fuel_loss");
		if(today_fuel_lossObj != null)
			today_fuel_loss = new Double(today_fuel_lossObj.toString());

		Object fuel_quantityObj = map.get("fuel_quantity");
		if(fuel_quantityObj != null)
			fuel_quantity = new Double(fuel_quantityObj.toString());

		Object number_of_low_fuelObj = map.get("number_of_low_fuel");
		if(number_of_low_fuelObj != null)
			number_of_low_fuel = new Integer(number_of_low_fuelObj.toString());

		Object number_of_high_water_tempObj = map.get("number_of_high_water_temp");
		if(number_of_high_water_tempObj != null)
			number_of_high_water_temp = new Integer(number_of_high_water_tempObj.toString());

		Object number_of_high_canopy_tempObj = map.get("number_of_high_canopy_temp");
		if(number_of_high_canopy_tempObj != null)
			number_of_high_canopy_temp = new Integer(number_of_high_canopy_tempObj.toString());

		Object number_of_high_coolant_tempObj = map.get("number_of_high_coolant_temp");
		if(number_of_high_coolant_tempObj != null)
			number_of_high_coolant_temp = new Integer(number_of_high_coolant_tempObj.toString());

		Object number_of_dg_onObj = map.get("number_of_dg_on");
		if(number_of_dg_onObj != null)
			number_of_dg_on = new Integer(number_of_dg_onObj.toString());

		Object number_of_dg_offObj = map.get("number_of_dg_off");
		if(number_of_dg_offObj != null)
			number_of_dg_off = new Integer(number_of_dg_offObj.toString());

		Object number_of_dg_grid_both_runningObj = map.get("number_of_dg_grid_both_running");
		if(number_of_dg_grid_both_runningObj != null)
			number_of_dg_grid_both_running = new Integer(number_of_dg_grid_both_runningObj.toString());

		Object number_of_dg_grid_both_not_runningObj = map.get("number_of_dg_grid_both_not_running");
		if(number_of_dg_grid_both_not_runningObj != null)
			number_of_dg_grid_both_not_running = new Integer(number_of_dg_grid_both_not_runningObj.toString());

		Object number_of_start_failedObj = map.get("number_of_start_failed");
		if(number_of_start_failedObj != null)
			number_of_start_failed = new Integer(number_of_start_failedObj.toString());

		Object number_of_not_performedObj = map.get("number_of_not_performed");
		if(number_of_not_performedObj != null)
			number_of_not_performed = new Integer(number_of_not_performedObj.toString());

		Object number_of_not_performed_wellObj = map.get("number_of_not_performed_well");
		if(number_of_not_performed_wellObj != null)
			number_of_not_performed_well = new Integer(number_of_not_performed_wellObj.toString());

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

	public Number getGroup_name() {
		return group_name != null ? group_name : 0.00;
	}

	public void setGroup_name(Number group_name) {
		this.group_name = group_name;
	}

	public void unSetGroup_name() {
		this.group_name = 0.00;
	}

	public Number getAppliance_type() {
		return appliance_type != null ? appliance_type : 0.00;
	}

	public void setAppliance_type(Number appliance_type) {
		this.appliance_type = appliance_type;
	}

	public void unSetAppliance_type() {
		this.appliance_type = 0.00;
	}

	public Number getToday_fuel_consumed() {
		return today_fuel_consumed != null ? today_fuel_consumed : 0.00;
	}

	public void setToday_fuel_consumed(Number today_fuel_consumed) {
		this.today_fuel_consumed = today_fuel_consumed;
	}

	public void unSetToday_fuel_consumed() {
		this.today_fuel_consumed = 0.00;
	}

	public Number getToday_fuel_loss() {
		return today_fuel_loss != null ? today_fuel_loss : 0.00;
	}

	public void setToday_fuel_loss(Number today_fuel_loss) {
		this.today_fuel_loss = today_fuel_loss;
	}

	public void unSetToday_fuel_loss() {
		this.today_fuel_loss = 0.00;
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

	public Integer getNumber_of_low_fuel() {
		return number_of_low_fuel != null ? number_of_low_fuel : 0;
	}

	public void setNumber_of_low_fuel(int number_of_low_fuel) {
		this.number_of_low_fuel = number_of_low_fuel;
	}

	public void setNumber_of_low_fuel(Integer number_of_low_fuel) {
		this.number_of_low_fuel = number_of_low_fuel;
	}

	public void unSetNumber_of_low_fuel() {
		this.number_of_low_fuel = 0;
	}

	public Integer getNumber_of_high_water_temp() {
		return number_of_high_water_temp != null ? number_of_high_water_temp : 0;
	}

	public void setNumber_of_high_water_temp(int number_of_high_water_temp) {
		this.number_of_high_water_temp = number_of_high_water_temp;
	}

	public void setNumber_of_high_water_temp(Integer number_of_high_water_temp) {
		this.number_of_high_water_temp = number_of_high_water_temp;
	}

	public void unSetNumber_of_high_water_temp() {
		this.number_of_high_water_temp = 0;
	}

	public Integer getNumber_of_high_canopy_temp() {
		return number_of_high_canopy_temp != null ? number_of_high_canopy_temp : 0;
	}

	public void setNumber_of_high_canopy_temp(int number_of_high_canopy_temp) {
		this.number_of_high_canopy_temp = number_of_high_canopy_temp;
	}

	public void setNumber_of_high_canopy_temp(Integer number_of_high_canopy_temp) {
		this.number_of_high_canopy_temp = number_of_high_canopy_temp;
	}

	public void unSetNumber_of_high_canopy_temp() {
		this.number_of_high_canopy_temp = 0;
	}

	public Integer getNumber_of_high_coolant_temp() {
		return number_of_high_coolant_temp != null ? number_of_high_coolant_temp : 0;
	}

	public void setNumber_of_high_coolant_temp(int number_of_high_coolant_temp) {
		this.number_of_high_coolant_temp = number_of_high_coolant_temp;
	}

	public void setNumber_of_high_coolant_temp(Integer number_of_high_coolant_temp) {
		this.number_of_high_coolant_temp = number_of_high_coolant_temp;
	}

	public void unSetNumber_of_high_coolant_temp() {
		this.number_of_high_coolant_temp = 0;
	}

	public Integer getNumber_of_dg_on() {
		return number_of_dg_on != null ? number_of_dg_on : 0;
	}

	public void setNumber_of_dg_on(int number_of_dg_on) {
		this.number_of_dg_on = number_of_dg_on;
	}

	public void setNumber_of_dg_on(Integer number_of_dg_on) {
		this.number_of_dg_on = number_of_dg_on;
	}

	public void unSetNumber_of_dg_on() {
		this.number_of_dg_on = 0;
	}

	public Integer getNumber_of_dg_off() {
		return number_of_dg_off != null ? number_of_dg_off : 0;
	}

	public void setNumber_of_dg_off(int number_of_dg_off) {
		this.number_of_dg_off = number_of_dg_off;
	}

	public void setNumber_of_dg_off(Integer number_of_dg_off) {
		this.number_of_dg_off = number_of_dg_off;
	}

	public void unSetNumber_of_dg_off() {
		this.number_of_dg_off = 0;
	}

	public Integer getNumber_of_dg_grid_both_running() {
		return number_of_dg_grid_both_running != null ? number_of_dg_grid_both_running : 0;
	}

	public void setNumber_of_dg_grid_both_running(int number_of_dg_grid_both_running) {
		this.number_of_dg_grid_both_running = number_of_dg_grid_both_running;
	}

	public void setNumber_of_dg_grid_both_running(Integer number_of_dg_grid_both_running) {
		this.number_of_dg_grid_both_running = number_of_dg_grid_both_running;
	}

	public void unSetNumber_of_dg_grid_both_running() {
		this.number_of_dg_grid_both_running = 0;
	}

	public Integer getNumber_of_dg_grid_both_not_running() {
		return number_of_dg_grid_both_not_running != null ? number_of_dg_grid_both_not_running : 0;
	}

	public void setNumber_of_dg_grid_both_not_running(int number_of_dg_grid_both_not_running) {
		this.number_of_dg_grid_both_not_running = number_of_dg_grid_both_not_running;
	}

	public void setNumber_of_dg_grid_both_not_running(Integer number_of_dg_grid_both_not_running) {
		this.number_of_dg_grid_both_not_running = number_of_dg_grid_both_not_running;
	}

	public void unSetNumber_of_dg_grid_both_not_running() {
		this.number_of_dg_grid_both_not_running = 0;
	}

	public Integer getNumber_of_start_failed() {
		return number_of_start_failed != null ? number_of_start_failed : 0;
	}

	public void setNumber_of_start_failed(int number_of_start_failed) {
		this.number_of_start_failed = number_of_start_failed;
	}

	public void setNumber_of_start_failed(Integer number_of_start_failed) {
		this.number_of_start_failed = number_of_start_failed;
	}

	public void unSetNumber_of_start_failed() {
		this.number_of_start_failed = 0;
	}

	public Integer getNumber_of_not_performed() {
		return number_of_not_performed != null ? number_of_not_performed : 0;
	}

	public void setNumber_of_not_performed(int number_of_not_performed) {
		this.number_of_not_performed = number_of_not_performed;
	}

	public void setNumber_of_not_performed(Integer number_of_not_performed) {
		this.number_of_not_performed = number_of_not_performed;
	}

	public void unSetNumber_of_not_performed() {
		this.number_of_not_performed = 0;
	}

	public Integer getNumber_of_not_performed_well() {
		return number_of_not_performed_well != null ? number_of_not_performed_well : 0;
	}

	public void setNumber_of_not_performed_well(int number_of_not_performed_well) {
		this.number_of_not_performed_well = number_of_not_performed_well;
	}

	public void setNumber_of_not_performed_well(Integer number_of_not_performed_well) {
		this.number_of_not_performed_well = number_of_not_performed_well;
	}

	public void unSetNumber_of_not_performed_well() {
		this.number_of_not_performed_well = 0;
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