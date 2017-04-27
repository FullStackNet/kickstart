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
public abstract class Baseconversation_summary extends BaseResource {
	private String id = null;
	private String user_id = null;
	private String from_user_id = null;
	private String from_user_name = null;
	private Long message_time = null;
	private Long last_open_time = null;
	private String message_text = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_FROM_USER_ID = "from_user_id";
	public static String FIELD_FROM_USER_NAME = "from_user_name";
	public static String FIELD_MESSAGE_TIME = "message_time";
	public static String FIELD_LAST_OPEN_TIME = "last_open_time";
	public static String FIELD_MESSAGE_TEXT = "message_text";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("conversation_summary");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setIndexed(true);
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field from_user_idField = new Field("from_user_id", "String");
		from_user_idField.setRequired(true);
		from_user_idField.setLength(128);
		metaData.addField(from_user_idField);

		Field from_user_nameField = new Field("from_user_name", "String");
		from_user_nameField.setRequired(true);
		from_user_nameField.setLength(128);
		metaData.addField(from_user_nameField);

		Field message_timeField = new Field("message_time", "long");
		metaData.addField(message_timeField);

		Field last_open_timeField = new Field("last_open_time", "long");
		metaData.addField(last_open_timeField);

		Field message_textField = new Field("message_text", "String");
		metaData.addField(message_textField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("conversation_summary");

		metaData.setCluster("DB_LOG");
	}

	public Baseconversation_summary() {}

	public Baseconversation_summary(Baseconversation_summary obj) {
		this.id = obj.id;
		this.user_id = obj.user_id;
		this.from_user_id = obj.from_user_id;
		this.from_user_name = obj.from_user_name;
		this.message_time = obj.message_time;
		this.last_open_time = obj.last_open_time;
		this.message_text = obj.message_text;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(from_user_id != null)
			map.put("from_user_id", from_user_id);
		if(from_user_name != null)
			map.put("from_user_name", from_user_name);
		if(message_time != null)
			map.put("message_time", message_time);
		if(last_open_time != null)
			map.put("last_open_time", last_open_time);
		if(message_text != null)
			map.put("message_text", message_text);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(validateFrom_user_id(add))
			map.put("from_user_id", from_user_id);
		if(validateFrom_user_name(add))
			map.put("from_user_name", from_user_name);
		if(message_time != null)
			map.put("message_time", message_time);
		if(last_open_time != null)
			map.put("last_open_time", last_open_time);
		if(message_text != null)
			map.put("message_text", message_text);
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
		user_id = (String) map.get("user_id");
		from_user_id = (String) map.get("from_user_id");
		from_user_name = (String) map.get("from_user_name");
		message_time = (Long) map.get("message_time");
		last_open_time = (Long) map.get("last_open_time");
		message_text = (String) map.get("message_text");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object from_user_idObj = map.get("from_user_id");
		if(from_user_idObj != null)
			from_user_id = from_user_idObj.toString();

		Object from_user_nameObj = map.get("from_user_name");
		if(from_user_nameObj != null)
			from_user_name = from_user_nameObj.toString();

		Object message_timeObj = map.get("message_time");
		if(message_timeObj != null)
			message_time = new Long(message_timeObj.toString());

		Object last_open_timeObj = map.get("last_open_time");
		if(last_open_timeObj != null)
			last_open_time = new Long(last_open_timeObj.toString());

		Object message_textObj = map.get("message_text");
		if(message_textObj != null)
			message_text = message_textObj.toString();

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

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getFrom_user_id() {
		return from_user_id;
	}

	public String getFrom_user_idEx() {
		return from_user_id != null ? from_user_id : "";
	}

	public void setFrom_user_id(String from_user_id) {
		this.from_user_id = from_user_id;
	}

	public void unSetFrom_user_id() {
		this.from_user_id = null;
	}

	public boolean validateFrom_user_id(boolean add) throws ApplicationException {
		if(add && from_user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[from_user_id]");
		return from_user_id != null;
	}

	public String getFrom_user_name() {
		return from_user_name;
	}

	public String getFrom_user_nameEx() {
		return from_user_name != null ? from_user_name : "";
	}

	public void setFrom_user_name(String from_user_name) {
		this.from_user_name = from_user_name;
	}

	public void unSetFrom_user_name() {
		this.from_user_name = null;
	}

	public boolean validateFrom_user_name(boolean add) throws ApplicationException {
		if(add && from_user_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[from_user_name]");
		return from_user_name != null;
	}

	public Long getMessage_time() {
		return message_time;
	}

	public long getMessage_timeEx() {
		return message_time != null ? message_time : 0L;
	}

	public void setMessage_time(long message_time) {
		this.message_time = message_time;
	}

	public void setMessage_time(Long message_time) {
		this.message_time = message_time;
	}

	public void unSetMessage_time() {
		this.message_time = null;
	}

	public Long getLast_open_time() {
		return last_open_time;
	}

	public long getLast_open_timeEx() {
		return last_open_time != null ? last_open_time : 0L;
	}

	public void setLast_open_time(long last_open_time) {
		this.last_open_time = last_open_time;
	}

	public void setLast_open_time(Long last_open_time) {
		this.last_open_time = last_open_time;
	}

	public void unSetLast_open_time() {
		this.last_open_time = null;
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