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
public abstract class Basegrievance_conversation extends BaseResource {
	private String id = null;
	private String thread_id = null;
	private String message_text = null;
	private Long message_time = null;
	private String user_id = null;
	private String user_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_THREAD_ID = "thread_id";
	public static String FIELD_MESSAGE_TEXT = "message_text";
	public static String FIELD_MESSAGE_TIME = "message_time";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("grievance_conversation");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(260);
		metaData.addField(idField);

		Field thread_idField = new Field("thread_id", "String");
		thread_idField.setIndexed(true);
		thread_idField.setLength(260);
		metaData.addField(thread_idField);

		Field message_textField = new Field("message_text", "String");
		message_textField.setLength(1024);
		metaData.addField(message_textField);

		Field message_timeField = new Field("message_time", "timestamp");
		metaData.addField(message_timeField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(260);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(260);
		metaData.addField(user_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("grievance_conversation");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basegrievance_conversation() {}

	public Basegrievance_conversation(Basegrievance_conversation obj) {
		this.id = obj.id;
		this.thread_id = obj.thread_id;
		this.message_text = obj.message_text;
		this.message_time = obj.message_time;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(thread_id != null)
			map.put("thread_id", thread_id);
		if(message_text != null)
			map.put("message_text", message_text);
		if(message_time != null)
			map.put("message_time", message_time);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(thread_id != null)
			map.put("thread_id", thread_id);
		if(message_text != null)
			map.put("message_text", message_text);
		if(message_time != null)
			map.put("message_time", message_time);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
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
		thread_id = (String) map.get("thread_id");
		message_text = (String) map.get("message_text");
		message_time = (Long) map.get("message_time");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object thread_idObj = map.get("thread_id");
		if(thread_idObj != null)
			thread_id = thread_idObj.toString();

		Object message_textObj = map.get("message_text");
		if(message_textObj != null)
			message_text = message_textObj.toString();

		Object message_timeObj = map.get("message_time");
		if(message_timeObj != null)
			message_time = (Long) message_timeObj;

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

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

	public String getThread_id() {
		return thread_id;
	}

	public String getThread_idEx() {
		return thread_id != null ? thread_id : "";
	}

	public void setThread_id(String thread_id) {
		this.thread_id = thread_id;
	}

	public void unSetThread_id() {
		this.thread_id = null;
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

	public Long getMessage_time() {
		return message_time;
	}

	public void setMessage_time(Long message_time) {
		this.message_time = message_time;
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