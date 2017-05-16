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
public abstract class Basenews extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String customer_id = null;
	private String type = null;
	private String title = null;
	private String description = null;
	private Long date = null;
	private String date_str = null;
	private Long creation_time = null;
	private String sent = null;
	private String send_sms = null;
	private Integer total_student_sent = null;
	private Integer total_user_sent = null;
	private Integer total_sms_sent = null;
	private Integer total_email_sent = null;
	private Integer total_app_notification_sent = null;
	private String send_email = null;
	private String send_father_mother = null;
	private String source_name = null;
	private String source_link = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_SENT = "sent";
	public static String FIELD_SEND_SMS = "send_sms";
	public static String FIELD_TOTAL_STUDENT_SENT = "total_student_sent";
	public static String FIELD_TOTAL_USER_SENT = "total_user_sent";
	public static String FIELD_TOTAL_SMS_SENT = "total_sms_sent";
	public static String FIELD_TOTAL_EMAIL_SENT = "total_email_sent";
	public static String FIELD_TOTAL_APP_NOTIFICATION_SENT = "total_app_notification_sent";
	public static String FIELD_SEND_EMAIL = "send_email";
	public static String FIELD_SEND_FATHER_MOTHER = "send_father_mother";
	public static String FIELD_SOURCE_NAME = "source_name";
	public static String FIELD_SOURCE_LINK = "source_link";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("news");

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

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(32);
		metaData.addField(date_strField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field sentField = new Field("sent", "String");
		sentField.setDefaultValue("N");
		sentField.setLength(1);
		metaData.addField(sentField);

		Field send_smsField = new Field("send_sms", "String");
		send_smsField.setDefaultValue("N");
		send_smsField.setLength(1);
		metaData.addField(send_smsField);

		Field total_student_sentField = new Field("total_student_sent", "int");
		metaData.addField(total_student_sentField);

		Field total_user_sentField = new Field("total_user_sent", "int");
		metaData.addField(total_user_sentField);

		Field total_sms_sentField = new Field("total_sms_sent", "int");
		metaData.addField(total_sms_sentField);

		Field total_email_sentField = new Field("total_email_sent", "int");
		metaData.addField(total_email_sentField);

		Field total_app_notification_sentField = new Field("total_app_notification_sent", "int");
		metaData.addField(total_app_notification_sentField);

		Field send_emailField = new Field("send_email", "String");
		send_emailField.setDefaultValue("N");
		send_emailField.setLength(1);
		metaData.addField(send_emailField);

		Field send_father_motherField = new Field("send_father_mother", "String");
		send_father_motherField.setDefaultValue("N");
		send_father_motherField.setLength(1);
		metaData.addField(send_father_motherField);

		Field source_nameField = new Field("source_name", "String");
		source_nameField.setLength(128);
		metaData.addField(source_nameField);

		Field source_linkField = new Field("source_link", "String");
		source_linkField.setLength(128);
		metaData.addField(source_linkField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("news");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basenews() {}

	public Basenews(Basenews obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.type = obj.type;
		this.title = obj.title;
		this.description = obj.description;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.creation_time = obj.creation_time;
		this.sent = obj.sent;
		this.send_sms = obj.send_sms;
		this.total_student_sent = obj.total_student_sent;
		this.total_user_sent = obj.total_user_sent;
		this.total_sms_sent = obj.total_sms_sent;
		this.total_email_sent = obj.total_email_sent;
		this.total_app_notification_sent = obj.total_app_notification_sent;
		this.send_email = obj.send_email;
		this.send_father_mother = obj.send_father_mother;
		this.source_name = obj.source_name;
		this.source_link = obj.source_link;
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
		if(send_father_mother == null)
			send_father_mother = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
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
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(total_student_sent != null)
			map.put("total_student_sent", total_student_sent);
		if(total_user_sent != null)
			map.put("total_user_sent", total_user_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
		if(send_email != null)
			map.put("send_email", send_email);
		if(send_father_mother != null)
			map.put("send_father_mother", send_father_mother);
		if(source_name != null)
			map.put("source_name", source_name);
		if(source_link != null)
			map.put("source_link", source_link);
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(type != null)
			map.put("type", type);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(sent != null)
			map.put("sent", sent);
		if(send_sms != null)
			map.put("send_sms", send_sms);
		if(total_student_sent != null)
			map.put("total_student_sent", total_student_sent);
		if(total_user_sent != null)
			map.put("total_user_sent", total_user_sent);
		if(total_sms_sent != null)
			map.put("total_sms_sent", total_sms_sent);
		if(total_email_sent != null)
			map.put("total_email_sent", total_email_sent);
		if(total_app_notification_sent != null)
			map.put("total_app_notification_sent", total_app_notification_sent);
		if(send_email != null)
			map.put("send_email", send_email);
		if(send_father_mother != null)
			map.put("send_father_mother", send_father_mother);
		if(source_name != null)
			map.put("source_name", source_name);
		if(source_link != null)
			map.put("source_link", source_link);
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
		customer_id = (String) map.get("customer_id");
		type = (String) map.get("type");
		title = (String) map.get("title");
		description = (String) map.get("description");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		creation_time = (Long) map.get("creation_time");
		sent = (String) map.get("sent");
		send_sms = (String) map.get("send_sms");
		total_student_sent = (Integer) map.get("total_student_sent");
		total_user_sent = (Integer) map.get("total_user_sent");
		total_sms_sent = (Integer) map.get("total_sms_sent");
		total_email_sent = (Integer) map.get("total_email_sent");
		total_app_notification_sent = (Integer) map.get("total_app_notification_sent");
		send_email = (String) map.get("send_email");
		send_father_mother = (String) map.get("send_father_mother");
		source_name = (String) map.get("source_name");
		source_link = (String) map.get("source_link");
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

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = new Long(dateObj.toString());

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object sentObj = map.get("sent");
		if(sentObj != null)
			sent = sentObj.toString();

		Object send_smsObj = map.get("send_sms");
		if(send_smsObj != null)
			send_sms = send_smsObj.toString();

		Object total_student_sentObj = map.get("total_student_sent");
		if(total_student_sentObj != null)
			total_student_sent = new Integer(total_student_sentObj.toString());

		Object total_user_sentObj = map.get("total_user_sent");
		if(total_user_sentObj != null)
			total_user_sent = new Integer(total_user_sentObj.toString());

		Object total_sms_sentObj = map.get("total_sms_sent");
		if(total_sms_sentObj != null)
			total_sms_sent = new Integer(total_sms_sentObj.toString());

		Object total_email_sentObj = map.get("total_email_sent");
		if(total_email_sentObj != null)
			total_email_sent = new Integer(total_email_sentObj.toString());

		Object total_app_notification_sentObj = map.get("total_app_notification_sent");
		if(total_app_notification_sentObj != null)
			total_app_notification_sent = new Integer(total_app_notification_sentObj.toString());

		Object send_emailObj = map.get("send_email");
		if(send_emailObj != null)
			send_email = send_emailObj.toString();

		Object send_father_motherObj = map.get("send_father_mother");
		if(send_father_motherObj != null)
			send_father_mother = send_father_motherObj.toString();

		Object source_nameObj = map.get("source_name");
		if(source_nameObj != null)
			source_name = source_nameObj.toString();

		Object source_linkObj = map.get("source_link");
		if(source_linkObj != null)
			source_link = source_linkObj.toString();

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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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

	public Integer getTotal_student_sent() {
		return total_student_sent;
	}

	public int getTotal_student_sentEx() {
		return total_student_sent != null ? total_student_sent : 0;
	}

	public void setTotal_student_sent(int total_student_sent) {
		this.total_student_sent = total_student_sent;
	}

	public void setTotal_student_sent(Integer total_student_sent) {
		this.total_student_sent = total_student_sent;
	}

	public void unSetTotal_student_sent() {
		this.total_student_sent = null;
	}

	public Integer getTotal_user_sent() {
		return total_user_sent;
	}

	public int getTotal_user_sentEx() {
		return total_user_sent != null ? total_user_sent : 0;
	}

	public void setTotal_user_sent(int total_user_sent) {
		this.total_user_sent = total_user_sent;
	}

	public void setTotal_user_sent(Integer total_user_sent) {
		this.total_user_sent = total_user_sent;
	}

	public void unSetTotal_user_sent() {
		this.total_user_sent = null;
	}

	public Integer getTotal_sms_sent() {
		return total_sms_sent;
	}

	public int getTotal_sms_sentEx() {
		return total_sms_sent != null ? total_sms_sent : 0;
	}

	public void setTotal_sms_sent(int total_sms_sent) {
		this.total_sms_sent = total_sms_sent;
	}

	public void setTotal_sms_sent(Integer total_sms_sent) {
		this.total_sms_sent = total_sms_sent;
	}

	public void unSetTotal_sms_sent() {
		this.total_sms_sent = null;
	}

	public Integer getTotal_email_sent() {
		return total_email_sent;
	}

	public int getTotal_email_sentEx() {
		return total_email_sent != null ? total_email_sent : 0;
	}

	public void setTotal_email_sent(int total_email_sent) {
		this.total_email_sent = total_email_sent;
	}

	public void setTotal_email_sent(Integer total_email_sent) {
		this.total_email_sent = total_email_sent;
	}

	public void unSetTotal_email_sent() {
		this.total_email_sent = null;
	}

	public Integer getTotal_app_notification_sent() {
		return total_app_notification_sent;
	}

	public int getTotal_app_notification_sentEx() {
		return total_app_notification_sent != null ? total_app_notification_sent : 0;
	}

	public void setTotal_app_notification_sent(int total_app_notification_sent) {
		this.total_app_notification_sent = total_app_notification_sent;
	}

	public void setTotal_app_notification_sent(Integer total_app_notification_sent) {
		this.total_app_notification_sent = total_app_notification_sent;
	}

	public void unSetTotal_app_notification_sent() {
		this.total_app_notification_sent = null;
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

	public String getSend_father_mother() {
		return send_father_mother != null ? send_father_mother : "N";
	}

	public void setSend_father_mother(String send_father_mother) {
		this.send_father_mother = send_father_mother;
	}

	public void unSetSend_father_mother() {
		this.send_father_mother = "N";
	}

	public String getSource_name() {
		return source_name;
	}

	public String getSource_nameEx() {
		return source_name != null ? source_name : "";
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public void unSetSource_name() {
		this.source_name = null;
	}

	public String getSource_link() {
		return source_link;
	}

	public String getSource_linkEx() {
		return source_link != null ? source_link : "";
	}

	public void setSource_link(String source_link) {
		this.source_link = source_link;
	}

	public void unSetSource_link() {
		this.source_link = null;
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