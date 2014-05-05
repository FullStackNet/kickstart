/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseconversation extends BaseResource {
	private String id = null;
	private String to_user_id = null;
	private Long message_time = null;
	private String message_text = null;
	private ArrayList<Object> messages = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TO_USER_ID = "to_user_id";
	public static String FIELD_MESSAGE_TIME = "message_time";
	public static String FIELD_MESSAGE_TEXT = "message_text";
	public static String FIELD_MESSAGES = "messages";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("conversation");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(260);
		metaData.addField(idField);

		Field messagesField = new Field("messages", "Array");
		metaData.addField(messagesField);


		metaData.setTableName("conversation");

		metaData.setCluster("DB_LOG");
	}

	public Baseconversation() {}

	public Baseconversation(Baseconversation obj) {
		this.id = obj.id;
		this.to_user_id = obj.to_user_id;
		this.message_time = obj.message_time;
		this.message_text = obj.message_text;
		this.messages = obj.messages;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(to_user_id != null)
			map.put("to_user_id", to_user_id);
		if(message_time != null)
			map.put("message_time", message_time);
		if(message_text != null)
			map.put("message_text", message_text);
		if(messages != null)
			map.put("messages", messages);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(to_user_id != null)
			map.put("to_user_id", to_user_id);
		if(message_time != null)
			map.put("message_time", message_time);
		if(message_text != null)
			map.put("message_text", message_text);
		if(messages != null)
			map.put("messages", messages);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		messages = (ArrayList<Object>) map.get("messages");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		messages = (ArrayList<Object>) map.get("messages");
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

	public String getTo_user_id() {
		return to_user_id;
	}

	public String getTo_user_idEx() {
		return to_user_id != null ? to_user_id : "";
	}

	public void setTo_user_id(String to_user_id) {
		this.to_user_id = to_user_id;
	}

	public void unSetTo_user_id() {
		this.to_user_id = null;
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

	public ArrayList<Object> getMessages() {
		return messages;
	}


	public void setMessages(ArrayList<Object> messages) {
		this.messages = messages;
	}

	public void addMessages(Object value) {
		if(messages == null)
			messages = new ArrayList<Object>();
		messages.add(value);
	}

	public void unSetMessages() {
		this.messages = null;
	}
	public String getCluster() {
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}