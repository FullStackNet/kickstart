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
public abstract class Baseschedule extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private Long schedule_time = null;
	private String date_str = null;
	private Long date = null;
	private String time = null;
	private String frequency = null; //Yearly,Monthly,Daily,Hourly,OneTime
	private String schedule_status = null; //N-Not Scheduled, P-Processing, D-Done
	private String school_id = null;
	private String customer_id = null;
	private String reference_id = null;
	private String reference_name = null;
	private String reference_date = null;
	private Long creation_time = null;
	private Map<String, String> params = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_SCHEDULE_TIME = "schedule_time";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_DATE = "date";
	public static String FIELD_TIME = "time";
	public static String FIELD_FREQUENCY = "frequency";
	public static String FIELD_SCHEDULE_STATUS = "schedule_status";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_REFERENCE_DATE = "reference_date";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_PARAMS = "params";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("schedule");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(512);
		metaData.addField(nameField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field schedule_timeField = new Field("schedule_time", "timestamp");
		metaData.addField(schedule_timeField);

		Field date_strField = new Field("date_str", "String");
		metaData.addField(date_strField);

		Field dateField = new Field("date", "long");
		metaData.addField(dateField);

		Field timeField = new Field("time", "String");
		metaData.addField(timeField);

		Field frequencyField = new Field("frequency", "String");
		frequencyField.setLength(32);
		metaData.addField(frequencyField);

		Field schedule_statusField = new Field("schedule_status", "String");
		schedule_statusField.setDefaultValue("N");
		schedule_statusField.setLength(1);
		metaData.addField(schedule_statusField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(32);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(128);
		metaData.addField(reference_nameField);

		Field reference_dateField = new Field("reference_date", "String");
		reference_dateField.setLength(128);
		metaData.addField(reference_dateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field paramsField = new Field("params", "Map");
		paramsField.setValueType("String");
		metaData.addField(paramsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("schedule");

		metaData.setCluster("DB_LOG");
	}

	public Baseschedule() {}

	public Baseschedule(Baseschedule obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.schedule_time = obj.schedule_time;
		this.date_str = obj.date_str;
		this.date = obj.date;
		this.time = obj.time;
		this.frequency = obj.frequency;
		this.schedule_status = obj.schedule_status;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.reference_id = obj.reference_id;
		this.reference_name = obj.reference_name;
		this.reference_date = obj.reference_date;
		this.creation_time = obj.creation_time;
		this.params = obj.params;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(schedule_status == null)
			schedule_status = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(schedule_time != null)
			map.put("schedule_time", schedule_time);
		if(date_str != null)
			map.put("date_str", date_str);
		if(date != null)
			map.put("date", date);
		if(time != null)
			map.put("time", time);
		if(frequency != null)
			map.put("frequency", frequency);
		if(schedule_status != null)
			map.put("schedule_status", schedule_status);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(reference_date != null)
			map.put("reference_date", reference_date);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(params != null)
			map.put("params", params);
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
		if(schedule_time != null)
			map.put("schedule_time", schedule_time);
		if(date_str != null)
			map.put("date_str", date_str);
		if(date != null)
			map.put("date", date);
		if(time != null)
			map.put("time", time);
		if(frequency != null)
			map.put("frequency", frequency);
		if(schedule_status != null)
			map.put("schedule_status", schedule_status);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(reference_date != null)
			map.put("reference_date", reference_date);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(params != null)
			map.put("params", params);
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
		schedule_time = (Long) map.get("schedule_time");
		date_str = (String) map.get("date_str");
		date = (Long) map.get("date");
		time = (String) map.get("time");
		frequency = (String) map.get("frequency");
		schedule_status = (String) map.get("schedule_status");
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		reference_id = (String) map.get("reference_id");
		reference_name = (String) map.get("reference_name");
		reference_date = (String) map.get("reference_date");
		creation_time = (Long) map.get("creation_time");
		params = (Map<String, String>) map.get("params");
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

		Object schedule_timeObj = map.get("schedule_time");
		if(schedule_timeObj != null)
			schedule_time = new Long(schedule_timeObj.toString());

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = new Long(dateObj.toString());

		Object timeObj = map.get("time");
		if(timeObj != null)
			time = timeObj.toString();

		Object frequencyObj = map.get("frequency");
		if(frequencyObj != null)
			frequency = frequencyObj.toString();

		Object schedule_statusObj = map.get("schedule_status");
		if(schedule_statusObj != null)
			schedule_status = schedule_statusObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

		Object reference_dateObj = map.get("reference_date");
		if(reference_dateObj != null)
			reference_date = reference_dateObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		params = (Map<String, String>) map.get("params");
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

	public Long getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(Long schedule_time) {
		this.schedule_time = schedule_time;
	}


	public String getDate_str() {
		return date_str;
	}

	public String getDate_strEx() {
		return date_str != null ? date_str : "";
	}

	public void setDate_str(String date_str) {
		this.date_str = date_str;
	}

	public void unSetDate_str() {
		this.date_str = null;
	}

	public Long getDate() {
		return date;
	}

	public long getDateEx() {
		return date != null ? date : 0L;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public void unSetDate() {
		this.date = null;
	}

	public String getTime() {
		return time;
	}

	public String getTimeEx() {
		return time != null ? time : "";
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void unSetTime() {
		this.time = null;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getFrequencyEx() {
		return frequency != null ? frequency : "";
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void unSetFrequency() {
		this.frequency = null;
	}

	public String getSchedule_status() {
		return schedule_status != null ? schedule_status : "N";
	}

	public void setSchedule_status(String schedule_status) {
		this.schedule_status = schedule_status;
	}

	public void unSetSchedule_status() {
		this.schedule_status = "N";
	}

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
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

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
	}

	public String getReference_name() {
		return reference_name;
	}

	public String getReference_nameEx() {
		return reference_name != null ? reference_name : "";
	}

	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}

	public void unSetReference_name() {
		this.reference_name = null;
	}

	public String getReference_date() {
		return reference_date;
	}

	public String getReference_dateEx() {
		return reference_date != null ? reference_date : "";
	}

	public void setReference_date(String reference_date) {
		this.reference_date = reference_date;
	}

	public void unSetReference_date() {
		this.reference_date = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Map<String, String> getParams() {
		return params;
	}

	public String getParams(String key) {
		return params == null ? null : params.get(key);
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public void setParams(String key, String value) {
		if(params == null)
			params = new HashMap<String, String>();
		params.put(key, value);
	}

	public void unSetParams() {
		this.params = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}