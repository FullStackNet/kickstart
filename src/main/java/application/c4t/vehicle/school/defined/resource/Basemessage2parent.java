/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basemessage2parent extends BaseResource {
	private String id = null;
	private Long message_time = null;
	private String message_text = null;
	private String school_id = null;
	private String school_name = null;
	private String user_id = null;
	private String user_name = null;
	private String student_id = null;
	private String customer_id = null;
	private String teacher_id = null;
	private String student_name = null;
	private Long last_updated = null;
	private String last_updated_id = null;
	private String last_updated_name = null;
	private String last_message = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_MESSAGE_TIME = "message_time";
	public static String FIELD_MESSAGE_TEXT = "message_text";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TEACHER_ID = "teacher_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_LAST_UPDATED = "last_updated";
	public static String FIELD_LAST_UPDATED_ID = "last_updated_id";
	public static String FIELD_LAST_UPDATED_NAME = "last_updated_name";
	public static String FIELD_LAST_MESSAGE = "last_message";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("message2parent");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(260);
		metaData.addField(idField);

		Field message_timeField = new Field("message_time", "timestamp");
		metaData.addField(message_timeField);

		Field message_textField = new Field("message_text", "String");
		message_textField.setLength(1024);
		metaData.addField(message_textField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setLength(128);
		metaData.addField(school_nameField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setIndexed(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setIndexed(true);
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field teacher_idField = new Field("teacher_id", "String");
		teacher_idField.setIndexed(true);
		teacher_idField.setLength(128);
		metaData.addField(teacher_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field last_updatedField = new Field("last_updated", "timestamp");
		metaData.addField(last_updatedField);

		Field last_updated_idField = new Field("last_updated_id", "String");
		last_updated_idField.setLength(128);
		metaData.addField(last_updated_idField);

		Field last_updated_nameField = new Field("last_updated_name", "String");
		last_updated_nameField.setLength(128);
		metaData.addField(last_updated_nameField);

		Field last_messageField = new Field("last_message", "String");
		last_messageField.setLength(1024);
		metaData.addField(last_messageField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("message2parent");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basemessage2parent() {}

	public Basemessage2parent(Basemessage2parent obj) {
		this.id = obj.id;
		this.message_time = obj.message_time;
		this.message_text = obj.message_text;
		this.school_id = obj.school_id;
		this.school_name = obj.school_name;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.student_id = obj.student_id;
		this.customer_id = obj.customer_id;
		this.teacher_id = obj.teacher_id;
		this.student_name = obj.student_name;
		this.last_updated = obj.last_updated;
		this.last_updated_id = obj.last_updated_id;
		this.last_updated_name = obj.last_updated_name;
		this.last_message = obj.last_message;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(message_time != null)
			map.put("message_time", message_time);
		if(message_text != null)
			map.put("message_text", message_text);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(last_updated != null)
			map.put("last_updated", last_updated);
		if(last_updated_id != null)
			map.put("last_updated_id", last_updated_id);
		if(last_updated_name != null)
			map.put("last_updated_name", last_updated_name);
		if(last_message != null)
			map.put("last_message", last_message);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(message_time != null)
			map.put("message_time", message_time);
		if(message_text != null)
			map.put("message_text", message_text);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(last_updated != null)
			map.put("last_updated", last_updated);
		if(last_updated_id != null)
			map.put("last_updated_id", last_updated_id);
		if(last_updated_name != null)
			map.put("last_updated_name", last_updated_name);
		if(last_message != null)
			map.put("last_message", last_message);
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
		message_time = (Long) map.get("message_time");
		message_text = (String) map.get("message_text");
		school_id = (String) map.get("school_id");
		school_name = (String) map.get("school_name");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		student_id = (String) map.get("student_id");
		customer_id = (String) map.get("customer_id");
		teacher_id = (String) map.get("teacher_id");
		student_name = (String) map.get("student_name");
		last_updated = (Long) map.get("last_updated");
		last_updated_id = (String) map.get("last_updated_id");
		last_updated_name = (String) map.get("last_updated_name");
		last_message = (String) map.get("last_message");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object message_timeObj = map.get("message_time");
		if(message_timeObj != null)
			message_time = new Long(message_timeObj.toString());

		Object message_textObj = map.get("message_text");
		if(message_textObj != null)
			message_text = message_textObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object teacher_idObj = map.get("teacher_id");
		if(teacher_idObj != null)
			teacher_id = teacher_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object last_updatedObj = map.get("last_updated");
		if(last_updatedObj != null)
			last_updated = new Long(last_updatedObj.toString());

		Object last_updated_idObj = map.get("last_updated_id");
		if(last_updated_idObj != null)
			last_updated_id = last_updated_idObj.toString();

		Object last_updated_nameObj = map.get("last_updated_name");
		if(last_updated_nameObj != null)
			last_updated_name = last_updated_nameObj.toString();

		Object last_messageObj = map.get("last_message");
		if(last_messageObj != null)
			last_message = last_messageObj.toString();

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

	public Long getMessage_time() {
		return message_time;
	}

	public void setMessage_time(Long message_time) {
		this.message_time = message_time;
	}


	public String getMessage_text() {
		return message_text;
	}

	public String getMessage_textEx() {
		return message_text != null ? message_text : "";
	}

	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}

	public void unSetMessage_text() {
		this.message_text = null;
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

	public String getSchool_name() {
		return school_name;
	}

	public String getSchool_nameEx() {
		return school_name != null ? school_name : "";
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void unSetSchool_name() {
		this.school_name = null;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
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

	public String getTeacher_id() {
		return teacher_id;
	}

	public String getTeacher_idEx() {
		return teacher_id != null ? teacher_id : "";
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void unSetTeacher_id() {
		this.teacher_id = null;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
	}

	public Long getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Long last_updated) {
		this.last_updated = last_updated;
	}


	public String getLast_updated_id() {
		return last_updated_id;
	}

	public String getLast_updated_idEx() {
		return last_updated_id != null ? last_updated_id : "";
	}

	public void setLast_updated_id(String last_updated_id) {
		this.last_updated_id = last_updated_id;
	}

	public void unSetLast_updated_id() {
		this.last_updated_id = null;
	}

	public String getLast_updated_name() {
		return last_updated_name;
	}

	public String getLast_updated_nameEx() {
		return last_updated_name != null ? last_updated_name : "";
	}

	public void setLast_updated_name(String last_updated_name) {
		this.last_updated_name = last_updated_name;
	}

	public void unSetLast_updated_name() {
		this.last_updated_name = null;
	}

	public String getLast_message() {
		return last_message;
	}

	public String getLast_messageEx() {
		return last_message != null ? last_message : "";
	}

	public void setLast_message(String last_message) {
		this.last_message = last_message;
	}

	public void unSetLast_message() {
		this.last_message = null;
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