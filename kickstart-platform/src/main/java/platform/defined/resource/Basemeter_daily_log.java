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
public abstract class Basemeter_daily_log extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String location_id = null;
	private String location_name = null;
	private String customer_id = null;
	private String source = null;
	private Long log_date = null;
	private String log_date_str = null;
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
	public static String FIELD_LOG_DATE = "log_date";
	public static String FIELD_LOG_DATE_STR = "log_date_str";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_OPENING_KWH = "opening_kwh";
	public static String FIELD_KWH = "kwh";
	public static String FIELD_CLOSING_KWH = "closing_kwh";
	public static String FIELD_OPENING_KVAH = "opening_kvah";
	public static String FIELD_KVAH = "kvah";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("meter_daily_log");

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

		Field log_dateField = new Field("log_date", "timestamp");
		metaData.addField(log_dateField);

		Field log_date_strField = new Field("log_date_str", "String");
		log_date_strField.setLength(32);
		metaData.addField(log_date_strField);

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


		metaData.setTableName("meter_daily_log");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Basemeter_daily_log() {}

	public Basemeter_daily_log(Basemeter_daily_log obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.location_id = obj.location_id;
		this.location_name = obj.location_name;
		this.customer_id = obj.customer_id;
		this.source = obj.source;
		this.log_date = obj.log_date;
		this.log_date_str = obj.log_date_str;
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
		if(log_date != null)
			map.put("log_date", log_date);
		if(log_date_str != null)
			map.put("log_date_str", log_date_str);
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
		if(log_date != null)
			map.put("log_date", log_date);
		if(log_date_str != null)
			map.put("log_date_str", log_date_str);
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
		log_date = (Long) map.get("log_date");
		log_date_str = (String) map.get("log_date_str");
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

		Object log_dateObj = map.get("log_date");
		if(log_dateObj != null)
			log_date = new Long(log_dateObj.toString());

		Object log_date_strObj = map.get("log_date_str");
		if(log_date_strObj != null)
			log_date_str = log_date_strObj.toString();

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

	public Long getLog_date() {
		return log_date;
	}

	public void setLog_date(Long log_date) {
		this.log_date = log_date;
	}


	public String getLog_date_str() {
		return log_date_str;
	}

	public String getLog_date_strEx() {
		return log_date_str != null ? log_date_str : "";
	}

	public void setLog_date_str(String log_date_str) {
		this.log_date_str = log_date_str;
	}

	public void unSetLog_date_str() {
		this.log_date_str = null;
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