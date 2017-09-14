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
public abstract class Basestudent_assignment extends BaseResource {
	private String id = null;
	private String student_id = null;
	private String tutorial_id = null;
	private String assigned_date_str = null;
	private Long assigned_date = null;
	private String sent_date_str = null;
	private Long sent_date = null;
	private String received_date_str = null;
	private Long received_date = null;
	private String current_status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_TUTORIAL_ID = "tutorial_id";
	public static String FIELD_ASSIGNED_DATE_STR = "assigned_date_str";
	public static String FIELD_ASSIGNED_DATE = "assigned_date";
	public static String FIELD_SENT_DATE_STR = "sent_date_str";
	public static String FIELD_SENT_DATE = "sent_date";
	public static String FIELD_RECEIVED_DATE_STR = "received_date_str";
	public static String FIELD_RECEIVED_DATE = "received_date";
	public static String FIELD_CURRENT_STATUS = "current_status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student_assignment");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(32);
		metaData.addField(student_idField);

		Field tutorial_idField = new Field("tutorial_id", "String");
		tutorial_idField.setIndexed(true);
		tutorial_idField.setLength(128);
		metaData.addField(tutorial_idField);

		Field assigned_date_strField = new Field("assigned_date_str", "String");
		metaData.addField(assigned_date_strField);

		Field assigned_dateField = new Field("assigned_date", "timestamp");
		metaData.addField(assigned_dateField);

		Field sent_date_strField = new Field("sent_date_str", "String");
		metaData.addField(sent_date_strField);

		Field sent_dateField = new Field("sent_date", "timestamp");
		metaData.addField(sent_dateField);

		Field received_date_strField = new Field("received_date_str", "String");
		metaData.addField(received_date_strField);

		Field received_dateField = new Field("received_date", "timestamp");
		metaData.addField(received_dateField);

		Field current_statusField = new Field("current_status", "String");
		metaData.addField(current_statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("student_assignment");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basestudent_assignment() {}

	public Basestudent_assignment(Basestudent_assignment obj) {
		this.id = obj.id;
		this.student_id = obj.student_id;
		this.tutorial_id = obj.tutorial_id;
		this.assigned_date_str = obj.assigned_date_str;
		this.assigned_date = obj.assigned_date;
		this.sent_date_str = obj.sent_date_str;
		this.sent_date = obj.sent_date;
		this.received_date_str = obj.received_date_str;
		this.received_date = obj.received_date;
		this.current_status = obj.current_status;
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(assigned_date_str != null)
			map.put("assigned_date_str", assigned_date_str);
		if(assigned_date != null)
			map.put("assigned_date", assigned_date);
		if(sent_date_str != null)
			map.put("sent_date_str", sent_date_str);
		if(sent_date != null)
			map.put("sent_date", sent_date);
		if(received_date_str != null)
			map.put("received_date_str", received_date_str);
		if(received_date != null)
			map.put("received_date", received_date);
		if(current_status != null)
			map.put("current_status", current_status);
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
		if(student_id != null)
			map.put("student_id", student_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(assigned_date_str != null)
			map.put("assigned_date_str", assigned_date_str);
		if(assigned_date != null)
			map.put("assigned_date", assigned_date);
		if(sent_date_str != null)
			map.put("sent_date_str", sent_date_str);
		if(sent_date != null)
			map.put("sent_date", sent_date);
		if(received_date_str != null)
			map.put("received_date_str", received_date_str);
		if(received_date != null)
			map.put("received_date", received_date);
		if(current_status != null)
			map.put("current_status", current_status);
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
		student_id = (String) map.get("student_id");
		tutorial_id = (String) map.get("tutorial_id");
		assigned_date_str = (String) map.get("assigned_date_str");
		assigned_date = (Long) map.get("assigned_date");
		sent_date_str = (String) map.get("sent_date_str");
		sent_date = (Long) map.get("sent_date");
		received_date_str = (String) map.get("received_date_str");
		received_date = (Long) map.get("received_date");
		current_status = (String) map.get("current_status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object tutorial_idObj = map.get("tutorial_id");
		if(tutorial_idObj != null)
			tutorial_id = tutorial_idObj.toString();

		Object assigned_date_strObj = map.get("assigned_date_str");
		if(assigned_date_strObj != null)
			assigned_date_str = assigned_date_strObj.toString();

		Object assigned_dateObj = map.get("assigned_date");
		if(assigned_dateObj != null)
			assigned_date = (Long) assigned_dateObj;

		Object sent_date_strObj = map.get("sent_date_str");
		if(sent_date_strObj != null)
			sent_date_str = sent_date_strObj.toString();

		Object sent_dateObj = map.get("sent_date");
		if(sent_dateObj != null)
			sent_date = (Long) sent_dateObj;

		Object received_date_strObj = map.get("received_date_str");
		if(received_date_strObj != null)
			received_date_str = received_date_strObj.toString();

		Object received_dateObj = map.get("received_date");
		if(received_dateObj != null)
			received_date = (Long) received_dateObj;

		Object current_statusObj = map.get("current_status");
		if(current_statusObj != null)
			current_status = current_statusObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getTutorial_id() {
		return tutorial_id;
	}

	public String getTutorial_idEx() {
		return tutorial_id != null ? tutorial_id : "";
	}

	public void setTutorial_id(String tutorial_id) {
		this.tutorial_id = tutorial_id;
	}

	public void unSetTutorial_id() {
		this.tutorial_id = null;
	}

	public String getAssigned_date_str() {
		return assigned_date_str;
	}

	public String getAssigned_date_strEx() {
		return assigned_date_str != null ? assigned_date_str : "";
	}

	public void setAssigned_date_str(String assigned_date_str) {
		this.assigned_date_str = assigned_date_str;
	}

	public void unSetAssigned_date_str() {
		this.assigned_date_str = null;
	}

	public Long getAssigned_date() {
		return assigned_date;
	}

	public void setAssigned_date(Long assigned_date) {
		this.assigned_date = assigned_date;
	}


	public String getSent_date_str() {
		return sent_date_str;
	}

	public String getSent_date_strEx() {
		return sent_date_str != null ? sent_date_str : "";
	}

	public void setSent_date_str(String sent_date_str) {
		this.sent_date_str = sent_date_str;
	}

	public void unSetSent_date_str() {
		this.sent_date_str = null;
	}

	public Long getSent_date() {
		return sent_date;
	}

	public void setSent_date(Long sent_date) {
		this.sent_date = sent_date;
	}


	public String getReceived_date_str() {
		return received_date_str;
	}

	public String getReceived_date_strEx() {
		return received_date_str != null ? received_date_str : "";
	}

	public void setReceived_date_str(String received_date_str) {
		this.received_date_str = received_date_str;
	}

	public void unSetReceived_date_str() {
		this.received_date_str = null;
	}

	public Long getReceived_date() {
		return received_date;
	}

	public void setReceived_date(Long received_date) {
		this.received_date = received_date;
	}


	public String getCurrent_status() {
		return current_status;
	}

	public String getCurrent_statusEx() {
		return current_status != null ? current_status : "";
	}

	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}

	public void unSetCurrent_status() {
		this.current_status = null;
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