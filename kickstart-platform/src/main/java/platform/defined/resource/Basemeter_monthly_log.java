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
public abstract class Basemeter_monthly_log extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String location_id = null;
	private String location_name = null;
	private String customer_id = null;
	private String source = null;
	private Long log_year = null;
	private Long log_month = null;
	private Long log_hrs = null;
	private Long log_minute = null;
	private Long creation_time = null;
	private Double opening_kwh = null;
	private Double kwh = null;
	private Double closing_kwh = null;
	private Double opening_kvah = null;
	private Double kvah = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_LOCATION_NAME = "location_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SOURCE = "source";
	public static String FIELD_LOG_YEAR = "log_year";
	public static String FIELD_LOG_MONTH = "log_month";
	public static String FIELD_LOG_HRS = "log_hrs";
	public static String FIELD_LOG_MINUTE = "log_minute";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_OPENING_KWH = "opening_kwh";
	public static String FIELD_KWH = "kwh";
	public static String FIELD_CLOSING_KWH = "closing_kwh";
	public static String FIELD_OPENING_KVAH = "opening_kvah";
	public static String FIELD_KVAH = "kvah";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("meter_monthly_log");

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

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setRequired(true);
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field location_idField = new Field("location_id", "String");
		location_idField.setRequired(true);
		location_idField.setLength(128);
		metaData.addField(location_idField);

		Field location_nameField = new Field("location_name", "String");
		location_nameField.setRequired(true);
		location_nameField.setLength(128);
		metaData.addField(location_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field sourceField = new Field("source", "String");
		sourceField.setLength(128);
		metaData.addField(sourceField);

		Field log_yearField = new Field("log_year", "long");
		metaData.addField(log_yearField);

		Field log_monthField = new Field("log_month", "long");
		metaData.addField(log_monthField);

		Field log_hrsField = new Field("log_hrs", "timestamp");
		metaData.addField(log_hrsField);

		Field log_minuteField = new Field("log_minute", "timestamp");
		metaData.addField(log_minuteField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field opening_kwhField = new Field("opening_kwh", "Double");
		opening_kwhField.setDefaultValue(0.0000);
		opening_kwhField.setLength(12);
		opening_kwhField.setPrecision(4);
		metaData.addField(opening_kwhField);

		Field kwhField = new Field("kwh", "Double");
		kwhField.setDefaultValue(0.0000);
		kwhField.setLength(12);
		kwhField.setPrecision(4);
		metaData.addField(kwhField);

		Field closing_kwhField = new Field("closing_kwh", "Double");
		closing_kwhField.setDefaultValue(0.0000);
		closing_kwhField.setLength(12);
		closing_kwhField.setPrecision(4);
		metaData.addField(closing_kwhField);

		Field opening_kvahField = new Field("opening_kvah", "Double");
		opening_kvahField.setDefaultValue(0.0000);
		opening_kvahField.setLength(12);
		opening_kvahField.setPrecision(4);
		metaData.addField(opening_kvahField);

		Field kvahField = new Field("kvah", "Double");
		kvahField.setDefaultValue(0.0000);
		kvahField.setLength(12);
		kvahField.setPrecision(4);
		metaData.addField(kvahField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("meter_monthly_log");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Basemeter_monthly_log() {}

	public Basemeter_monthly_log(Basemeter_monthly_log obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.location_id = obj.location_id;
		this.location_name = obj.location_name;
		this.customer_id = obj.customer_id;
		this.source = obj.source;
		this.log_year = obj.log_year;
		this.log_month = obj.log_month;
		this.log_hrs = obj.log_hrs;
		this.log_minute = obj.log_minute;
		this.creation_time = obj.creation_time;
		this.opening_kwh = obj.opening_kwh;
		this.kwh = obj.kwh;
		this.closing_kwh = obj.closing_kwh;
		this.opening_kvah = obj.opening_kvah;
		this.kvah = obj.kvah;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(opening_kwh == null)
			opening_kwh = 0.0000;
		if(kwh == null)
			kwh = 0.0000;
		if(closing_kwh == null)
			closing_kwh = 0.0000;
		if(opening_kvah == null)
			opening_kvah = 0.0000;
		if(kvah == null)
			kvah = 0.0000;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_name != null)
			map.put("location_name", location_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(log_year != null)
			map.put("log_year", log_year);
		if(log_month != null)
			map.put("log_month", log_month);
		if(log_hrs != null)
			map.put("log_hrs", log_hrs);
		if(log_minute != null)
			map.put("log_minute", log_minute);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(opening_kwh != null)
			map.put("opening_kwh", opening_kwh);
		if(kwh != null)
			map.put("kwh", kwh);
		if(closing_kwh != null)
			map.put("closing_kwh", closing_kwh);
		if(opening_kvah != null)
			map.put("opening_kvah", opening_kvah);
		if(kvah != null)
			map.put("kvah", kvah);
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
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateAppliance_name(add))
			map.put("appliance_name", appliance_name);
		if(validateLocation_id(add))
			map.put("location_id", location_id);
		if(validateLocation_name(add))
			map.put("location_name", location_name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(log_year != null)
			map.put("log_year", log_year);
		if(log_month != null)
			map.put("log_month", log_month);
		if(log_hrs != null)
			map.put("log_hrs", log_hrs);
		if(log_minute != null)
			map.put("log_minute", log_minute);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(opening_kwh != null)
			map.put("opening_kwh", opening_kwh);
		if(kwh != null)
			map.put("kwh", kwh);
		if(closing_kwh != null)
			map.put("closing_kwh", closing_kwh);
		if(opening_kvah != null)
			map.put("opening_kvah", opening_kvah);
		if(kvah != null)
			map.put("kvah", kvah);
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
		appliance_name = (String) map.get("appliance_name");
		location_id = (String) map.get("location_id");
		location_name = (String) map.get("location_name");
		customer_id = (String) map.get("customer_id");
		source = (String) map.get("source");
		log_year = (Long) map.get("log_year");
		log_month = (Long) map.get("log_month");
		log_hrs = (Long) map.get("log_hrs");
		log_minute = (Long) map.get("log_minute");
		creation_time = (Long) map.get("creation_time");
		opening_kwh = (Double) map.get("opening_kwh");
		kwh = (Double) map.get("kwh");
		closing_kwh = (Double) map.get("closing_kwh");
		opening_kvah = (Double) map.get("opening_kvah");
		kvah = (Double) map.get("kvah");
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

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object location_idObj = map.get("location_id");
		if(location_idObj != null)
			location_id = location_idObj.toString();

		Object location_nameObj = map.get("location_name");
		if(location_nameObj != null)
			location_name = location_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object sourceObj = map.get("source");
		if(sourceObj != null)
			source = sourceObj.toString();

		Object log_yearObj = map.get("log_year");
		if(log_yearObj != null)
			log_year = new Long(log_yearObj.toString());

		Object log_monthObj = map.get("log_month");
		if(log_monthObj != null)
			log_month = new Long(log_monthObj.toString());

		Object log_hrsObj = map.get("log_hrs");
		if(log_hrsObj != null)
			log_hrs = new Long(log_hrsObj.toString());

		Object log_minuteObj = map.get("log_minute");
		if(log_minuteObj != null)
			log_minute = new Long(log_minuteObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object opening_kwhObj = map.get("opening_kwh");
		if(opening_kwhObj != null)
			opening_kwh = new Double(opening_kwhObj.toString());

		Object kwhObj = map.get("kwh");
		if(kwhObj != null)
			kwh = new Double(kwhObj.toString());

		Object closing_kwhObj = map.get("closing_kwh");
		if(closing_kwhObj != null)
			closing_kwh = new Double(closing_kwhObj.toString());

		Object opening_kvahObj = map.get("opening_kvah");
		if(opening_kvahObj != null)
			opening_kvah = new Double(opening_kvahObj.toString());

		Object kvahObj = map.get("kvah");
		if(kvahObj != null)
			kvah = new Double(kvahObj.toString());

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

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
	}

	public boolean validateAppliance_name(boolean add) throws ApplicationException {
		if(add && appliance_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_name]");
		return appliance_name != null;
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

	public boolean validateLocation_id(boolean add) throws ApplicationException {
		if(add && location_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[location_id]");
		return location_id != null;
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

	public boolean validateLocation_name(boolean add) throws ApplicationException {
		if(add && location_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[location_name]");
		return location_name != null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
	}

	public String getSource() {
		return source;
	}

	public String getSourceEx() {
		return source != null ? source : "";
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void unSetSource() {
		this.source = null;
	}

	public Long getLog_year() {
		return log_year;
	}

	public long getLog_yearEx() {
		return log_year != null ? log_year : 0L;
	}

	public void setLog_year(long log_year) {
		this.log_year = log_year;
	}

	public void setLog_year(Long log_year) {
		this.log_year = log_year;
	}

	public void unSetLog_year() {
		this.log_year = null;
	}

	public Long getLog_month() {
		return log_month;
	}

	public long getLog_monthEx() {
		return log_month != null ? log_month : 0L;
	}

	public void setLog_month(long log_month) {
		this.log_month = log_month;
	}

	public void setLog_month(Long log_month) {
		this.log_month = log_month;
	}

	public void unSetLog_month() {
		this.log_month = null;
	}

	public Long getLog_hrs() {
		return log_hrs;
	}

	public void setLog_hrs(Long log_hrs) {
		this.log_hrs = log_hrs;
	}


	public Long getLog_minute() {
		return log_minute;
	}

	public void setLog_minute(Long log_minute) {
		this.log_minute = log_minute;
	}


	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Double getOpening_kwh() {
		return opening_kwh != null ? opening_kwh : 0.0000;
	}

	public void setOpening_kwh(Double opening_kwh) {
		this.opening_kwh = opening_kwh;
	}

	public void unSetOpening_kwh() {
		this.opening_kwh = 0.0000;
	}

	public Double getKwh() {
		return kwh != null ? kwh : 0.0000;
	}

	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	public void unSetKwh() {
		this.kwh = 0.0000;
	}

	public Double getClosing_kwh() {
		return closing_kwh != null ? closing_kwh : 0.0000;
	}

	public void setClosing_kwh(Double closing_kwh) {
		this.closing_kwh = closing_kwh;
	}

	public void unSetClosing_kwh() {
		this.closing_kwh = 0.0000;
	}

	public Double getOpening_kvah() {
		return opening_kvah != null ? opening_kvah : 0.0000;
	}

	public void setOpening_kvah(Double opening_kvah) {
		this.opening_kvah = opening_kvah;
	}

	public void unSetOpening_kvah() {
		this.opening_kvah = 0.0000;
	}

	public Double getKvah() {
		return kvah != null ? kvah : 0.0000;
	}

	public void setKvah(Double kvah) {
		this.kvah = kvah;
	}

	public void unSetKvah() {
		this.kvah = 0.0000;
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