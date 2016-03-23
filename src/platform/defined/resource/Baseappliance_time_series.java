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
public abstract class Baseappliance_time_series extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private Long creation_date = null;
	private String timezone = null;
	private Long creation_time = null;
	private String counter = null;
	private Integer valueType = null; //1- int, 2-long, 3-double, 4-String
	private String value = null;
	private Map<String, Object> values = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_CREATION_DATE = "creation_date";
	public static String FIELD_TIMEZONE = "timezone";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_COUNTER = "counter";
	public static String FIELD_VALUETYPE = "valueType";
	public static String FIELD_VALUE = "value";
	public static String FIELD_VALUES = "values";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_time_series");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field creation_dateField = new Field("creation_date", "timestamp");
		creation_dateField.setRequired(true);
		metaData.addField(creation_dateField);

		Field timezoneField = new Field("timezone", "String");
		timezoneField.setLength(32);
		metaData.addField(timezoneField);

		Field counterField = new Field("counter", "String");
		counterField.setRequired(true);
		counterField.setLength(128);
		metaData.addField(counterField);

		Field valuesField = new Field("values", "Map");
		valuesField.setValueType("Object");
		metaData.addField(valuesField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_time_series");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Baseappliance_time_series() {}

	public Baseappliance_time_series(Baseappliance_time_series obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.creation_date = obj.creation_date;
		this.timezone = obj.timezone;
		this.creation_time = obj.creation_time;
		this.counter = obj.counter;
		this.valueType = obj.valueType;
		this.value = obj.value;
		this.values = obj.values;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(creation_date != null)
			map.put("creation_date", creation_date);
		if(timezone != null)
			map.put("timezone", timezone);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(counter != null)
			map.put("counter", counter);
		if(valueType != null)
			map.put("valueType", valueType);
		if(value != null)
			map.put("value", value);
		if(values != null)
			map.put("values", values);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateCreation_date(add))
			map.put("creation_date", creation_date);
		if(timezone != null)
			map.put("timezone", timezone);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(validateCounter(add))
			map.put("counter", counter);
		if(valueType != null)
			map.put("valueType", valueType);
		if(value != null)
			map.put("value", value);
		if(values != null)
			map.put("values", values);
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
		appliance_id = (String) map.get("appliance_id");
		creation_date = (Long) map.get("creation_date");
		timezone = (String) map.get("timezone");
		counter = (String) map.get("counter");
		values = (Map<String, Object>) map.get("values");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object creation_dateObj = map.get("creation_date");
		if(creation_dateObj != null)
			creation_date = (Long) creation_dateObj;

		Object timezoneObj = map.get("timezone");
		if(timezoneObj != null)
			timezone = timezoneObj.toString();

		Object counterObj = map.get("counter");
		if(counterObj != null)
			counter = counterObj.toString();

		values = (Map<String, Object>) map.get("values");
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

	public boolean validateAppliance_id(boolean add) throws ApplicationException {
		if(add && appliance_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_id]");
		return appliance_id != null;
	}

	public Long getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Long creation_date) {
		this.creation_date = creation_date;
	}


	public boolean validateCreation_date(boolean add) throws ApplicationException {
		if(add && creation_date == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_date]");
		return creation_date != null;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getTimezoneEx() {
		return timezone != null ? timezone : "";
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public void unSetTimezone() {
		this.timezone = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public String getCounter() {
		return counter;
	}

	public String getCounterEx() {
		return counter != null ? counter : "";
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public void unSetCounter() {
		this.counter = null;
	}

	public boolean validateCounter(boolean add) throws ApplicationException {
		if(add && counter == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[counter]");
		return counter != null;
	}

	public Integer getValueType() {
		return valueType;
	}

	public int getValueTypeEx() {
		return valueType != null ? valueType : 0;
	}

	public void setValueType(int valueType) {
		this.valueType = valueType;
	}

	public void setValueType(Integer valueType) {
		this.valueType = valueType;
	}

	public void unSetValueType() {
		this.valueType = null;
	}

	public String getValue() {
		return value;
	}

	public String getValueEx() {
		return value != null ? value : "";
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void unSetValue() {
		this.value = null;
	}

	public Map<String, Object> getValues() {
		return values;
	}

	public Object getValues(String key) {
		return values == null ? null : values.get(key);
	}

	public void setValues(Map<String, Object> values) {
		this.values = values;
	}

	public void setValues(String key, Object value) {
		if(values == null)
			values = new HashMap<String, Object>();
		values.put(key, value);
	}

	public void unSetValues() {
		this.values = null;
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
		return "DB_ANALYSIS";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}