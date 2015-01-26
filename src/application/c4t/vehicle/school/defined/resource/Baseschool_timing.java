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
public abstract class Baseschool_timing extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String class_name = null;
	private String section_name = null;
	private String customer_id = null;
	private Integer attendance_bufferInMin = null;
	private String start_time = null;
	private String end_time = null;
	private String status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ATTENDANCE_BUFFERINMIN = "attendance_bufferInMin";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_STATUS = "status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_timing");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setRequired(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(32);
		metaData.addField(section_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field attendance_bufferInMinField = new Field("attendance_bufferInMin", "int");
		metaData.addField(attendance_bufferInMinField);

		Field start_timeField = new Field("start_time", "String");
		start_timeField.setLength(16);
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "String");
		end_timeField.setLength(16);
		metaData.addField(end_timeField);

		Field statusField = new Field("status", "String");
		statusField.setDefaultValue("N");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school_timing");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseschool_timing() {}

	public Baseschool_timing(Baseschool_timing obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.customer_id = obj.customer_id;
		this.attendance_bufferInMin = obj.attendance_bufferInMin;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.status = obj.status;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(status == null)
			status = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(attendance_bufferInMin != null)
			map.put("attendance_bufferInMin", attendance_bufferInMin);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(status != null)
			map.put("status", status);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(validateSchool_id(add))
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(attendance_bufferInMin != null)
			map.put("attendance_bufferInMin", attendance_bufferInMin);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(status != null)
			map.put("status", status);
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
		school_id = (String) map.get("school_id");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		customer_id = (String) map.get("customer_id");
		attendance_bufferInMin = (Integer) map.get("attendance_bufferInMin");
		start_time = (String) map.get("start_time");
		end_time = (String) map.get("end_time");
		status = (String) map.get("status");
		creation_time = (Long) map.get("creation_time");
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

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object attendance_bufferInMinObj = map.get("attendance_bufferInMin");
		if(attendance_bufferInMinObj != null)
			attendance_bufferInMin = new Integer(attendance_bufferInMinObj.toString());

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = start_timeObj.toString();

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = end_timeObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

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

	public boolean validateSchool_id(boolean add) throws ApplicationException {
		if(add && school_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[school_id]");
		return school_id != null;
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

	public Integer getAttendance_bufferInMin() {
		return attendance_bufferInMin;
	}

	public int getAttendance_bufferInMinEx() {
		return attendance_bufferInMin != null ? attendance_bufferInMin : 0;
	}

	public void setAttendance_bufferInMin(int attendance_bufferInMin) {
		this.attendance_bufferInMin = attendance_bufferInMin;
	}

	public void setAttendance_bufferInMin(Integer attendance_bufferInMin) {
		this.attendance_bufferInMin = attendance_bufferInMin;
	}

	public void unSetAttendance_bufferInMin() {
		this.attendance_bufferInMin = null;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getStart_timeEx() {
		return start_time != null ? start_time : "";
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void unSetStart_time() {
		this.start_time = null;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getEnd_timeEx() {
		return end_time != null ? end_time : "";
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void unSetEnd_time() {
		this.end_time = null;
	}

	public String getStatus() {
		return status != null ? status : "N";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = "N";
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