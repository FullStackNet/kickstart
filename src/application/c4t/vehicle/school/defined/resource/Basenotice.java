/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public abstract class Basenotice extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String student_id = null;
	private List<String> schools = null;
	private List<String> students = null;
	private String customer_id = null;
	private String type = null;
	private String class_name = null;
	private String section_name = null;
	private String title = null;
	private String description = null;
	private Long notice_date = null;
	private String notice_date_str = null;
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
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_SCHOOLS = "schools";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_NOTICE_DATE = "notice_date";
	public static String FIELD_NOTICE_DATE_STR = "notice_date_str";
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
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("notice");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field schoolsField = new Field("schools", "Array");
		metaData.addField(schoolsField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

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

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field notice_dateField = new Field("notice_date", "timestamp");
		metaData.addField(notice_dateField);

		Field notice_date_strField = new Field("notice_date_str", "String");
		notice_date_strField.setLength(32);
		metaData.addField(notice_date_strField);

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

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("notice");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basenotice() {}

	public Basenotice(Basenotice obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.student_id = obj.student_id;
		this.schools = obj.schools;
		this.students = obj.students;
		this.customer_id = obj.customer_id;
		this.type = obj.type;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.title = obj.title;
		this.description = obj.description;
		this.notice_date = obj.notice_date;
		this.notice_date_str = obj.notice_date_str;
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(schools != null)
			map.put("schools", schools);
		if(students != null)
			map.put("students", students);
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
		if(description != null)
			map.put("description", description);
		if(notice_date != null)
			map.put("notice_date", notice_date);
		if(notice_date_str != null)
			map.put("notice_date_str", notice_date_str);
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(schools != null)
			map.put("schools", schools);
		if(students != null)
			map.put("students", students);
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
		if(description != null)
			map.put("description", description);
		if(notice_date != null)
			map.put("notice_date", notice_date);
		if(notice_date_str != null)
			map.put("notice_date_str", notice_date_str);
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
		student_id = (String) map.get("student_id");
		schools = (List<String>) map.get("schools");
		students = (List<String>) map.get("students");
		customer_id = (String) map.get("customer_id");
		type = (String) map.get("type");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		title = (String) map.get("title");
		description = (String) map.get("description");
		notice_date = (Long) map.get("notice_date");
		notice_date_str = (String) map.get("notice_date_str");
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

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		schools = (List<String>) map.get("schools");
		students = (List<String>) map.get("students");
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

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object notice_dateObj = map.get("notice_date");
		if(notice_dateObj != null)
			notice_date = (Long) notice_dateObj;

		Object notice_date_strObj = map.get("notice_date_str");
		if(notice_date_strObj != null)
			notice_date_str = notice_date_strObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getStudent_id() {
		return student_id;
	}

	public String getStudent_idEx() {
		return student_id != null ? student_id : "";
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public void unSetStudent_id() {
		this.student_id = null;
	}

	public List<String> getSchools() {
		return schools;
	}


	public void setSchools(List<String> schools) {
		this.schools = schools;
	}

	public void addSchools(String value) {
		if(schools == null)
			schools = new ArrayList<>();
		schools.add(value);
	}

	public void unSetSchools() {
		this.schools = null;
	}

	public List<String> getStudents() {
		return students;
	}


	public void setStudents(List<String> students) {
		this.students = students;
	}

	public void addStudents(String value) {
		if(students == null)
			students = new ArrayList<>();
		students.add(value);
	}

	public void unSetStudents() {
		this.students = null;
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

	public Long getNotice_date() {
		return notice_date;
	}

	public void setNotice_date(Long notice_date) {
		this.notice_date = notice_date;
	}


	public String getNotice_date_str() {
		return notice_date_str;
	}

	public String getNotice_date_strEx() {
		return notice_date_str != null ? notice_date_str : "";
	}

	public void setNotice_date_str(String notice_date_str) {
		this.notice_date_str = notice_date_str;
	}

	public void unSetNotice_date_str() {
		this.notice_date_str = null;
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