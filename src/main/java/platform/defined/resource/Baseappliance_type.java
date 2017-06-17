/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseappliance_type extends BaseResource {
	private String id = null;
	private String name = null;
	private String make_id = null;
	private String model_id = null;
	private String type = null;
	private String meter_type = null;
	private String unit = null;
	private String customer_id = null;
	private String make = null;
	private Number dg_capacity = null;
	private Number tank_capacity = null;
	private Number consumption_per_hour = null;
	private Number maintaiance_hour = null;
	private Number fuel_threshold = null;
	private Integer number_of_batteries = null;
	private Number threshold_low_battery = null;
	private Number threshold_deep_discharge_battery = null;
	private Number threshold_charging_battery = null;
	private Number threshold_over_charged = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MAKE_ID = "make_id";
	public static String FIELD_MODEL_ID = "model_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_METER_TYPE = "meter_type";
	public static String FIELD_UNIT = "unit";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_MAKE = "make";
	public static String FIELD_DG_CAPACITY = "dg_capacity";
	public static String FIELD_TANK_CAPACITY = "tank_capacity";
	public static String FIELD_CONSUMPTION_PER_HOUR = "consumption_per_hour";
	public static String FIELD_MAINTAIANCE_HOUR = "maintaiance_hour";
	public static String FIELD_FUEL_THRESHOLD = "fuel_threshold";
	public static String FIELD_NUMBER_OF_BATTERIES = "number_of_batteries";
	public static String FIELD_THRESHOLD_LOW_BATTERY = "threshold_low_battery";
	public static String FIELD_THRESHOLD_DEEP_DISCHARGE_BATTERY = "threshold_deep_discharge_battery";
	public static String FIELD_THRESHOLD_CHARGING_BATTERY = "threshold_charging_battery";
	public static String FIELD_THRESHOLD_OVER_CHARGED = "threshold_over_charged";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_type");

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

		Field make_idField = new Field("make_id", "String");
		make_idField.setLength(128);
		metaData.addField(make_idField);

		Field model_idField = new Field("model_id", "String");
		model_idField.setLength(128);
		metaData.addField(model_idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field meter_typeField = new Field("meter_type", "String");
		meter_typeField.setLength(16);
		metaData.addField(meter_typeField);

		Field unitField = new Field("unit", "String");
		unitField.setLength(16);
		metaData.addField(unitField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field makeField = new Field("make", "String");
		makeField.setLength(128);
		metaData.addField(makeField);

		Field dg_capacityField = new Field("dg_capacity", "Number");
		dg_capacityField.setLength(10);
		dg_capacityField.setPrecision(3);
		metaData.addField(dg_capacityField);

		Field tank_capacityField = new Field("tank_capacity", "Number");
		tank_capacityField.setLength(10);
		tank_capacityField.setPrecision(2);
		metaData.addField(tank_capacityField);

		Field consumption_per_hourField = new Field("consumption_per_hour", "Number");
		consumption_per_hourField.setLength(10);
		consumption_per_hourField.setPrecision(2);
		metaData.addField(consumption_per_hourField);

		Field maintaiance_hourField = new Field("maintaiance_hour", "Number");
		maintaiance_hourField.setLength(10);
		maintaiance_hourField.setPrecision(2);
		metaData.addField(maintaiance_hourField);

		Field fuel_thresholdField = new Field("fuel_threshold", "Number");
		fuel_thresholdField.setLength(10);
		fuel_thresholdField.setPrecision(2);
		metaData.addField(fuel_thresholdField);

		Field number_of_batteriesField = new Field("number_of_batteries", "int");
		number_of_batteriesField.setLength(2);
		metaData.addField(number_of_batteriesField);

		Field threshold_low_batteryField = new Field("threshold_low_battery", "Number");
		threshold_low_batteryField.setLength(10);
		threshold_low_batteryField.setPrecision(2);
		metaData.addField(threshold_low_batteryField);

		Field threshold_deep_discharge_batteryField = new Field("threshold_deep_discharge_battery", "Number");
		threshold_deep_discharge_batteryField.setLength(10);
		threshold_deep_discharge_batteryField.setPrecision(2);
		metaData.addField(threshold_deep_discharge_batteryField);

		Field threshold_charging_batteryField = new Field("threshold_charging_battery", "Number");
		threshold_charging_batteryField.setLength(10);
		threshold_charging_batteryField.setPrecision(2);
		metaData.addField(threshold_charging_batteryField);

		Field threshold_over_chargedField = new Field("threshold_over_charged", "Number");
		threshold_over_chargedField.setLength(10);
		threshold_over_chargedField.setPrecision(2);
		metaData.addField(threshold_over_chargedField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_type");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_type() {}

	public Baseappliance_type(Baseappliance_type obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.make_id = obj.make_id;
		this.model_id = obj.model_id;
		this.type = obj.type;
		this.meter_type = obj.meter_type;
		this.unit = obj.unit;
		this.customer_id = obj.customer_id;
		this.make = obj.make;
		this.dg_capacity = obj.dg_capacity;
		this.tank_capacity = obj.tank_capacity;
		this.consumption_per_hour = obj.consumption_per_hour;
		this.maintaiance_hour = obj.maintaiance_hour;
		this.fuel_threshold = obj.fuel_threshold;
		this.number_of_batteries = obj.number_of_batteries;
		this.threshold_low_battery = obj.threshold_low_battery;
		this.threshold_deep_discharge_battery = obj.threshold_deep_discharge_battery;
		this.threshold_charging_battery = obj.threshold_charging_battery;
		this.threshold_over_charged = obj.threshold_over_charged;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(make_id != null)
			map.put("make_id", make_id);
		if(model_id != null)
			map.put("model_id", model_id);
		if(type != null)
			map.put("type", type);
		if(meter_type != null)
			map.put("meter_type", meter_type);
		if(unit != null)
			map.put("unit", unit);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(make != null)
			map.put("make", make);
		if(dg_capacity != null)
			map.put("dg_capacity", dg_capacity);
		if(tank_capacity != null)
			map.put("tank_capacity", tank_capacity);
		if(consumption_per_hour != null)
			map.put("consumption_per_hour", consumption_per_hour);
		if(maintaiance_hour != null)
			map.put("maintaiance_hour", maintaiance_hour);
		if(fuel_threshold != null)
			map.put("fuel_threshold", fuel_threshold);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(threshold_low_battery != null)
			map.put("threshold_low_battery", threshold_low_battery);
		if(threshold_deep_discharge_battery != null)
			map.put("threshold_deep_discharge_battery", threshold_deep_discharge_battery);
		if(threshold_charging_battery != null)
			map.put("threshold_charging_battery", threshold_charging_battery);
		if(threshold_over_charged != null)
			map.put("threshold_over_charged", threshold_over_charged);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(make_id != null)
			map.put("make_id", make_id);
		if(model_id != null)
			map.put("model_id", model_id);
		if(type != null)
			map.put("type", type);
		if(meter_type != null)
			map.put("meter_type", meter_type);
		if(unit != null)
			map.put("unit", unit);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(make != null)
			map.put("make", make);
		if(dg_capacity != null)
			map.put("dg_capacity", dg_capacity);
		if(tank_capacity != null)
			map.put("tank_capacity", tank_capacity);
		if(consumption_per_hour != null)
			map.put("consumption_per_hour", consumption_per_hour);
		if(maintaiance_hour != null)
			map.put("maintaiance_hour", maintaiance_hour);
		if(fuel_threshold != null)
			map.put("fuel_threshold", fuel_threshold);
		if(number_of_batteries != null)
			map.put("number_of_batteries", number_of_batteries);
		if(threshold_low_battery != null)
			map.put("threshold_low_battery", threshold_low_battery);
		if(threshold_deep_discharge_battery != null)
			map.put("threshold_deep_discharge_battery", threshold_deep_discharge_battery);
		if(threshold_charging_battery != null)
			map.put("threshold_charging_battery", threshold_charging_battery);
		if(threshold_over_charged != null)
			map.put("threshold_over_charged", threshold_over_charged);
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
		make_id = (String) map.get("make_id");
		model_id = (String) map.get("model_id");
		type = (String) map.get("type");
		meter_type = (String) map.get("meter_type");
		unit = (String) map.get("unit");
		customer_id = (String) map.get("customer_id");
		make = (String) map.get("make");
		dg_capacity = (Number) map.get("dg_capacity");
		tank_capacity = (Number) map.get("tank_capacity");
		consumption_per_hour = (Number) map.get("consumption_per_hour");
		maintaiance_hour = (Number) map.get("maintaiance_hour");
		fuel_threshold = (Number) map.get("fuel_threshold");
		number_of_batteries = (Integer) map.get("number_of_batteries");
		threshold_low_battery = (Number) map.get("threshold_low_battery");
		threshold_deep_discharge_battery = (Number) map.get("threshold_deep_discharge_battery");
		threshold_charging_battery = (Number) map.get("threshold_charging_battery");
		threshold_over_charged = (Number) map.get("threshold_over_charged");
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

		Object make_idObj = map.get("make_id");
		if(make_idObj != null)
			make_id = make_idObj.toString();

		Object model_idObj = map.get("model_id");
		if(model_idObj != null)
			model_id = model_idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object meter_typeObj = map.get("meter_type");
		if(meter_typeObj != null)
			meter_type = meter_typeObj.toString();

		Object unitObj = map.get("unit");
		if(unitObj != null)
			unit = unitObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object makeObj = map.get("make");
		if(makeObj != null)
			make = makeObj.toString();

		Object dg_capacityObj = map.get("dg_capacity");
		if(dg_capacityObj != null)
			dg_capacity = new Double(dg_capacityObj.toString());

		Object tank_capacityObj = map.get("tank_capacity");
		if(tank_capacityObj != null)
			tank_capacity = new Double(tank_capacityObj.toString());

		Object consumption_per_hourObj = map.get("consumption_per_hour");
		if(consumption_per_hourObj != null)
			consumption_per_hour = new Double(consumption_per_hourObj.toString());

		Object maintaiance_hourObj = map.get("maintaiance_hour");
		if(maintaiance_hourObj != null)
			maintaiance_hour = new Double(maintaiance_hourObj.toString());

		Object fuel_thresholdObj = map.get("fuel_threshold");
		if(fuel_thresholdObj != null)
			fuel_threshold = new Double(fuel_thresholdObj.toString());

		Object number_of_batteriesObj = map.get("number_of_batteries");
		if(number_of_batteriesObj != null)
			number_of_batteries = new Integer(number_of_batteriesObj.toString());

		Object threshold_low_batteryObj = map.get("threshold_low_battery");
		if(threshold_low_batteryObj != null)
			threshold_low_battery = new Double(threshold_low_batteryObj.toString());

		Object threshold_deep_discharge_batteryObj = map.get("threshold_deep_discharge_battery");
		if(threshold_deep_discharge_batteryObj != null)
			threshold_deep_discharge_battery = new Double(threshold_deep_discharge_batteryObj.toString());

		Object threshold_charging_batteryObj = map.get("threshold_charging_battery");
		if(threshold_charging_batteryObj != null)
			threshold_charging_battery = new Double(threshold_charging_batteryObj.toString());

		Object threshold_over_chargedObj = map.get("threshold_over_charged");
		if(threshold_over_chargedObj != null)
			threshold_over_charged = new Double(threshold_over_chargedObj.toString());

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

	public String getMeter_type() {
		return meter_type;
	}

	public String getMeter_typeEx() {
		return meter_type != null ? meter_type : "";
	}

	public void setMeter_type(String meter_type) {
		this.meter_type = meter_type;
	}

	public void unSetMeter_type() {
		this.meter_type = null;
	}

	public String getUnit() {
		return unit;
	}

	public String getUnitEx() {
		return unit != null ? unit : "";
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void unSetUnit() {
		this.unit = null;
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

	public Number getDg_capacity() {
		return dg_capacity;
	}

	public void setDg_capacity(Number dg_capacity) {
		this.dg_capacity = dg_capacity;
	}

	public void unSetDg_capacity() {
		this.dg_capacity = null;
	}

	public Number getTank_capacity() {
		return tank_capacity;
	}

	public void setTank_capacity(Number tank_capacity) {
		this.tank_capacity = tank_capacity;
	}

	public void unSetTank_capacity() {
		this.tank_capacity = null;
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

	public Number getMaintaiance_hour() {
		return maintaiance_hour;
	}

	public void setMaintaiance_hour(Number maintaiance_hour) {
		this.maintaiance_hour = maintaiance_hour;
	}

	public void unSetMaintaiance_hour() {
		this.maintaiance_hour = null;
	}

	public Number getFuel_threshold() {
		return fuel_threshold;
	}

	public void setFuel_threshold(Number fuel_threshold) {
		this.fuel_threshold = fuel_threshold;
	}

	public void unSetFuel_threshold() {
		this.fuel_threshold = null;
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

	public Number getThreshold_low_battery() {
		return threshold_low_battery;
	}

	public void setThreshold_low_battery(Number threshold_low_battery) {
		this.threshold_low_battery = threshold_low_battery;
	}

	public void unSetThreshold_low_battery() {
		this.threshold_low_battery = null;
	}

	public Number getThreshold_deep_discharge_battery() {
		return threshold_deep_discharge_battery;
	}

	public void setThreshold_deep_discharge_battery(Number threshold_deep_discharge_battery) {
		this.threshold_deep_discharge_battery = threshold_deep_discharge_battery;
	}

	public void unSetThreshold_deep_discharge_battery() {
		this.threshold_deep_discharge_battery = null;
	}

	public Number getThreshold_charging_battery() {
		return threshold_charging_battery;
	}

	public void setThreshold_charging_battery(Number threshold_charging_battery) {
		this.threshold_charging_battery = threshold_charging_battery;
	}

	public void unSetThreshold_charging_battery() {
		this.threshold_charging_battery = null;
	}

	public Number getThreshold_over_charged() {
		return threshold_over_charged;
	}

	public void setThreshold_over_charged(Number threshold_over_charged) {
		this.threshold_over_charged = threshold_over_charged;
	}

	public void unSetThreshold_over_charged() {
		this.threshold_over_charged = null;
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