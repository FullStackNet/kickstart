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
public abstract class Baseabsent extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String class_section_name = null;
	private String class_name = null;
	private String section_name = null;
	private Long date = null;
	private String date_str = null;
	private Integer total_absent = null;
	private String customer_id = null;
	private String sent = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_TOTAL_ABSENT = "total_absent";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SENT = "sent";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("absent");

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

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setIndexed(true);
		class_section_nameField.setLength(128);
		metaData.addField(class_section_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(128);
		metaData.addField(section_nameField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(16);
		metaData.addField(date_strField);

		Field total_absentField = new Field("total_absent", "int");
		metaData.addField(total_absentField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field sentField = new Field("sent", "String");
		sentField.setDefaultValue("N");
		sentField.setLength(1);
		metaData.addField(sentField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("absent");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseabsent() {}

	public Baseabsent(Baseabsent obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.class_section_name = obj.class_section_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.total_absent = obj.total_absent;
		this.customer_id = obj.customer_id;
		this.sent = obj.sent;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(sent == null)
			sent = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(total_absent != null)
			map.put("total_absent", total_absent);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(sent != null)
			map.put("sent", sent);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(total_absent != null)
			map.put("total_absent", total_absent);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(sent != null)
			map.put("sent", sent);
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
		class_section_name = (String) map.get("class_section_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		total_absent = (Integer) map.get("total_absent");
		customer_id = (String) map.get("customer_id");
		sent = (String) map.get("sent");
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

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = new Long(dateObj.toString());

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object total_absentObj = map.get("total_absent");
		if(total_absentObj != null)
			total_absent = new Integer(total_absentObj.toString());

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object sentObj = map.get("sent");
		if(sentObj != null)
			sent = sentObj.toString();

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

	public String getClass_section_name() {
		return class_section_name;
	}

	public String getClass_section_nameEx() {
		return class_section_name != null ? class_section_name : "";
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public void unSetClass_section_name() {
		this.class_section_name = null;
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

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
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

	public Integer getTotal_absent() {
		return total_absent;
	}

	public int getTotal_absentEx() {
		return total_absent != null ? total_absent : 0;
	}

	public void setTotal_absent(int total_absent) {
		this.total_absent = total_absent;
	}

	public void setTotal_absent(Integer total_absent) {
		this.total_absent = total_absent;
	}

	public void unSetTotal_absent() {
		this.total_absent = null;
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

	public String getSent() {
		return sent != null ? sent : "N";
	}

	public void setSent(String sent) {
		this.sent = sent;
	}

	public void unSetSent() {
		this.sent = "N";
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