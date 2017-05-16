/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseholiday extends BaseResource {
	private String id = null;
	private String school_id = null;
	private List<String> schools = null;
	private String customer_id = null;
	private String type = null;
	private String class_name = null;
	private String section_name = null;
	private String title = null;
	private Long holiday_date = null;
	private String holiday_date_str = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOLS = "schools";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_TITLE = "title";
	public static String FIELD_HOLIDAY_DATE = "holiday_date";
	public static String FIELD_HOLIDAY_DATE_STR = "holiday_date_str";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("holiday");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field schoolsField = new Field("schools", "Array");
		metaData.addField(schoolsField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(512);
		metaData.addField(typeField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(512);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(512);
		metaData.addField(section_nameField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field holiday_dateField = new Field("holiday_date", "timestamp");
		metaData.addField(holiday_dateField);

		Field holiday_date_strField = new Field("holiday_date_str", "String");
		holiday_date_strField.setLength(32);
		metaData.addField(holiday_date_strField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("holiday");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseholiday() {}

	public Baseholiday(Baseholiday obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.schools = obj.schools;
		this.customer_id = obj.customer_id;
		this.type = obj.type;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.title = obj.title;
		this.holiday_date = obj.holiday_date;
		this.holiday_date_str = obj.holiday_date_str;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(schools != null)
			map.put("schools", schools);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(type != null)
			map.put("type", type);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(title != null)
			map.put("title", title);
		if(holiday_date != null)
			map.put("holiday_date", holiday_date);
		if(holiday_date_str != null)
			map.put("holiday_date_str", holiday_date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(schools != null)
			map.put("schools", schools);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(type != null)
			map.put("type", type);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(title != null)
			map.put("title", title);
		if(holiday_date != null)
			map.put("holiday_date", holiday_date);
		if(holiday_date_str != null)
			map.put("holiday_date_str", holiday_date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		school_id = (String) map.get("school_id");
		schools = (List<String>) map.get("schools");
		customer_id = (String) map.get("customer_id");
		type = (String) map.get("type");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		title = (String) map.get("title");
		holiday_date = (Long) map.get("holiday_date");
		holiday_date_str = (String) map.get("holiday_date_str");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		schools = (List<String>) map.get("schools");
		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object holiday_dateObj = map.get("holiday_date");
		if(holiday_dateObj != null)
			holiday_date = new Long(holiday_dateObj.toString());

		Object holiday_date_strObj = map.get("holiday_date_str");
		if(holiday_date_strObj != null)
			holiday_date_str = holiday_date_strObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public List<String> getSchools() {
		return schools;
	}


	public void setSchools(List<String> schools) {
		this.schools = schools;
	}

	public void addSchools(String value) {
		if(schools == null)
			schools = new ArrayList<String>();
		schools.add(value);
	}

	public void unSetSchools() {
		this.schools = null;
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

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
	}

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public Long getHoliday_date() {
		return holiday_date;
	}

	public void setHoliday_date(Long holiday_date) {
		this.holiday_date = holiday_date;
	}


	public String getHoliday_date_str() {
		return holiday_date_str;
	}

	public String getHoliday_date_strEx() {
		return holiday_date_str != null ? holiday_date_str : "";
	}

	public void setHoliday_date_str(String holiday_date_str) {
		this.holiday_date_str = holiday_date_str;
	}

	public void unSetHoliday_date_str() {
		this.holiday_date_str = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}