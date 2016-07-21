/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basestaff_present extends BaseResource {
	private String id = null;
	private String name = null;
	private String school_id = null;
	private String route_id = null;
	private String route_name = null;
	private String present_type = null;
	private String sub_present_type = null;
	private String present_record_type = null;
	private Long date = null;
	private String date_str = null;
	private Integer total_present = null;
	private String customer_id = null;
	private String sent = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_ROUTE_NAME = "route_name";
	public static String FIELD_PRESENT_TYPE = "present_type";
	public static String FIELD_SUB_PRESENT_TYPE = "sub_present_type";
	public static String FIELD_PRESENT_RECORD_TYPE = "present_record_type";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_TOTAL_PRESENT = "total_present";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SENT = "sent";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("staff_present");

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

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setIndexed(true);
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field route_nameField = new Field("route_name", "String");
		route_nameField.setIndexed(true);
		route_nameField.setLength(128);
		metaData.addField(route_nameField);

		Field present_typeField = new Field("present_type", "String");
		present_typeField.setLength(128);
		metaData.addField(present_typeField);

		Field sub_present_typeField = new Field("sub_present_type", "String");
		sub_present_typeField.setLength(128);
		metaData.addField(sub_present_typeField);

		Field present_record_typeField = new Field("present_record_type", "String");
		present_record_typeField.setLength(128);
		metaData.addField(present_record_typeField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(16);
		metaData.addField(date_strField);

		Field total_presentField = new Field("total_present", "int");
		metaData.addField(total_presentField);

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


		metaData.setTableName("staff_present");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basestaff_present() {}

	public Basestaff_present(Basestaff_present obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.school_id = obj.school_id;
		this.route_id = obj.route_id;
		this.route_name = obj.route_name;
		this.present_type = obj.present_type;
		this.sub_present_type = obj.sub_present_type;
		this.present_record_type = obj.present_record_type;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.total_present = obj.total_present;
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
		if(name != null)
			map.put("name", name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(route_name != null)
			map.put("route_name", route_name);
		if(present_type != null)
			map.put("present_type", present_type);
		if(sub_present_type != null)
			map.put("sub_present_type", sub_present_type);
		if(present_record_type != null)
			map.put("present_record_type", present_record_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(total_present != null)
			map.put("total_present", total_present);
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
		if(name != null)
			map.put("name", name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(route_id != null)
			map.put("route_id", route_id);
		if(route_name != null)
			map.put("route_name", route_name);
		if(present_type != null)
			map.put("present_type", present_type);
		if(sub_present_type != null)
			map.put("sub_present_type", sub_present_type);
		if(present_record_type != null)
			map.put("present_record_type", present_record_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(total_present != null)
			map.put("total_present", total_present);
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
		name = (String) map.get("name");
		school_id = (String) map.get("school_id");
		route_id = (String) map.get("route_id");
		route_name = (String) map.get("route_name");
		present_type = (String) map.get("present_type");
		sub_present_type = (String) map.get("sub_present_type");
		present_record_type = (String) map.get("present_record_type");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		total_present = (Integer) map.get("total_present");
		customer_id = (String) map.get("customer_id");
		sent = (String) map.get("sent");
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

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object route_nameObj = map.get("route_name");
		if(route_nameObj != null)
			route_name = route_nameObj.toString();

		Object present_typeObj = map.get("present_type");
		if(present_typeObj != null)
			present_type = present_typeObj.toString();

		Object sub_present_typeObj = map.get("sub_present_type");
		if(sub_present_typeObj != null)
			sub_present_type = sub_present_typeObj.toString();

		Object present_record_typeObj = map.get("present_record_type");
		if(present_record_typeObj != null)
			present_record_type = present_record_typeObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object total_presentObj = map.get("total_present");
		if(total_presentObj != null)
			total_present = new Integer(total_presentObj.toString());

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

	public String getRoute_id() {
		return route_id;
	}

	public String getRoute_idEx() {
		return route_id != null ? route_id : "";
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public void unSetRoute_id() {
		this.route_id = null;
	}

	public String getRoute_name() {
		return route_name;
	}

	public String getRoute_nameEx() {
		return route_name != null ? route_name : "";
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	public void unSetRoute_name() {
		this.route_name = null;
	}

	public String getPresent_type() {
		return present_type;
	}

	public String getPresent_typeEx() {
		return present_type != null ? present_type : "";
	}

	public void setPresent_type(String present_type) {
		this.present_type = present_type;
	}

	public void unSetPresent_type() {
		this.present_type = null;
	}

	public String getSub_present_type() {
		return sub_present_type;
	}

	public String getSub_present_typeEx() {
		return sub_present_type != null ? sub_present_type : "";
	}

	public void setSub_present_type(String sub_present_type) {
		this.sub_present_type = sub_present_type;
	}

	public void unSetSub_present_type() {
		this.sub_present_type = null;
	}

	public String getPresent_record_type() {
		return present_record_type;
	}

	public String getPresent_record_typeEx() {
		return present_record_type != null ? present_record_type : "";
	}

	public void setPresent_record_type(String present_record_type) {
		this.present_record_type = present_record_type;
	}

	public void unSetPresent_record_type() {
		this.present_record_type = null;
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

	public Integer getTotal_present() {
		return total_present;
	}

	public int getTotal_presentEx() {
		return total_present != null ? total_present : 0;
	}

	public void setTotal_present(int total_present) {
		this.total_present = total_present;
	}

	public void setTotal_present(Integer total_present) {
		this.total_present = total_present;
	}

	public void unSetTotal_present() {
		this.total_present = null;
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