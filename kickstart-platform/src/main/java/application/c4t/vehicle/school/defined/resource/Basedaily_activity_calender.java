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
public abstract class Basedaily_activity_calender extends BaseResource {
	private String id = null;
	private String class_name = null;
	private String section_name = null;
	private String class_section_name = null;
	private String school_id = null;
	private String customer_id = null;
	private String type = null;
	private String title = null;
	private String description = null;
	private Long creation_time = null;
	private Long activity_date = null;
	private List<String> schools = null;
	private String activity_date_str = null;
	private String sent = null;
	private String send_sms = null;
	private String send_email = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_ACTIVITY_DATE = "activity_date";
	public static String FIELD_SCHOOLS = "schools";
	public static String FIELD_ACTIVITY_DATE_STR = "activity_date_str";
	public static String FIELD_SENT = "sent";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("daily_activity_calender");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(32);
		metaData.addField(section_nameField);

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setLength(65);
		metaData.addField(class_section_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(512);
		metaData.addField(typeField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field activity_dateField = new Field("activity_date", "timestamp");
		metaData.addField(activity_dateField);

		Field schoolsField = new Field("schools", "Array");
		metaData.addField(schoolsField);

		Field activity_date_strField = new Field("activity_date_str", "String");
		activity_date_strField.setLength(32);
		metaData.addField(activity_date_strField);

		Field sentField = new Field("sent", "String");
		sentField.setDefaultValue("N");
		sentField.setLength(1);
		metaData.addField(sentField);

		Field send_smsField = new Field("send_sms", "String");
		send_smsField.setDefaultValue("N");
		send_smsField.setLength(1);
		metaData.addField(send_smsField);

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("N");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("daily_activity_calender");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basedaily_activity_calender() {}

	public Basedaily_activity_calender(Basedaily_activity_calender obj) {
		this.id = obj.id;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.class_section_name = obj.class_section_name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.type = obj.type;
		this.title = obj.title;
		this.description = obj.description;
		this.creation_time = obj.creation_time;
		this.activity_date = obj.activity_date;
		this.schools = obj.schools;
		this.activity_date_str = obj.activity_date_str;
		this.sent = obj.sent;
		this.send_sms = obj.send_sms;
		this.send_email = obj.send_email;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(sent == null)
			sent = "N";
		if(send_sms == null)
			send_sms = "N";
		if(send_email == null)
			send_email = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(type != null)
			map.put("type", type);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(activity_date != null)
			map.put("activity_date", activity_date);
		if(schools != null)
			map.put("schools", schools);
		if(activity_date_str != null)
			map.put("activity_date_str", activity_date_str);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(send_email != null)
			map.put("send_email", send_email);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(type != null)
			map.put("type", type);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(activity_date != null)
			map.put("activity_date", activity_date);
		if(schools != null)
			map.put("schools", schools);
		if(activity_date_str != null)
			map.put("activity_date_str", activity_date_str);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(send_email != null)
			map.put("send_email", send_email);
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
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		class_section_name = (String) map.get("class_section_name");
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		type = (String) map.get("type");
		title = (String) map.get("title");
		description = (String) map.get("description");
		creation_time = (Long) map.get("creation_time");
		activity_date = (Long) map.get("activity_date");
		schools = (List<String>) map.get("schools");
		activity_date_str = (String) map.get("activity_date_str");
		sent = (String) map.get("sent");
		send_sms = (String) map.get("send_sms");
		send_email = (String) map.get("send_email");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object activity_dateObj = map.get("activity_date");
		if(activity_dateObj != null)
			activity_date = new Long(activity_dateObj.toString());

		schools = (List<String>) map.get("schools");
		Object activity_date_strObj = map.get("activity_date_str");
		if(activity_date_strObj != null)
			activity_date_str = activity_date_strObj.toString();

		Object sentObj = map.get("sent");
		if(sentObj != null)
			sent = sentObj.toString();

		Object send_smsObj = map.get("send_sms");
		if(send_smsObj != null)
			send_sms = send_smsObj.toString();

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

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

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getActivity_date() {
		return activity_date;
	}

	public void setActivity_date(Long activity_date) {
		this.activity_date = activity_date;
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

	public String getActivity_date_str() {
		return activity_date_str;
	}

	public String getActivity_date_strEx() {
		return activity_date_str != null ? activity_date_str : "";
	}

	public void setActivity_date_str(String activity_date_str) {
		this.activity_date_str = activity_date_str;
	}

	public void unSetActivity_date_str() {
		this.activity_date_str = null;
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

	public String getSend_sms() {
		return send_sms != null ? send_sms : "N";
	}

	public void setSend_sms(String send_sms) {
		this.send_sms = send_sms;
	}

	public void unSetSend_sms() {
		this.send_sms = "N";
	}

	public String getSend_email() {
		return send_email != null ? send_email : "N";
	}

	public void setSend_email(String send_email) {
		this.send_email = send_email;
	}

	public void unSetSend_email() {
		this.send_email = "N";
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