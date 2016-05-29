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
public abstract class Basebatch extends BaseResource {
	private String id = null;
	private String name = null;
	private String course_id = null;
	private String course_name = null;
	private String school_name = null;
	private String school_id = null;
	private String customer_id = null;
	private Long start_date = null;
	private String start_date_str = null;
	private Long end_date = null;
	private String end_date_str = null;
	private String status = null; //Active/Deactive
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_START_DATE = "start_date";
	public static String FIELD_START_DATE_STR = "start_date_str";
	public static String FIELD_END_DATE = "end_date";
	public static String FIELD_END_DATE_STR = "end_date_str";
	public static String FIELD_STATUS = "status";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("batch");

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

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(128);
		metaData.addField(course_idField);

		Field course_nameField = new Field("course_name", "String");
		course_nameField.setLength(128);
		metaData.addField(course_nameField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setLength(128);
		metaData.addField(school_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field start_dateField = new Field("start_date", "timestamp");
		metaData.addField(start_dateField);

		Field start_date_strField = new Field("start_date_str", "String");
		start_date_strField.setLength(32);
		metaData.addField(start_date_strField);

		Field end_dateField = new Field("end_date", "timestamp");
		metaData.addField(end_dateField);

		Field end_date_strField = new Field("end_date_str", "String");
		end_date_strField.setLength(32);
		metaData.addField(end_date_strField);

		Field statusField = new Field("status", "String");
		statusField.setLength(32);
		metaData.addField(statusField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("batch");

		metaData.setCluster("DB_PROFILE");
	}

	public Basebatch() {}

	public Basebatch(Basebatch obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.course_id = obj.course_id;
		this.course_name = obj.course_name;
		this.school_name = obj.school_name;
		this.school_id = obj.school_id;
		this.customer_id = obj.customer_id;
		this.start_date = obj.start_date;
		this.start_date_str = obj.start_date_str;
		this.end_date = obj.end_date;
		this.end_date_str = obj.end_date_str;
		this.status = obj.status;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
		if(end_date != null)
			map.put("end_date", end_date);
		if(end_date_str != null)
			map.put("end_date_str", end_date_str);
		if(status != null)
			map.put("status", status);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
		if(end_date != null)
			map.put("end_date", end_date);
		if(end_date_str != null)
			map.put("end_date_str", end_date_str);
		if(status != null)
			map.put("status", status);
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
		course_id = (String) map.get("course_id");
		course_name = (String) map.get("course_name");
		school_name = (String) map.get("school_name");
		school_id = (String) map.get("school_id");
		customer_id = (String) map.get("customer_id");
		start_date = (Long) map.get("start_date");
		start_date_str = (String) map.get("start_date_str");
		end_date = (Long) map.get("end_date");
		end_date_str = (String) map.get("end_date_str");
		status = (String) map.get("status");
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

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object course_nameObj = map.get("course_name");
		if(course_nameObj != null)
			course_name = course_nameObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object start_dateObj = map.get("start_date");
		if(start_dateObj != null)
			start_date = (Long) start_dateObj;

		Object start_date_strObj = map.get("start_date_str");
		if(start_date_strObj != null)
			start_date_str = start_date_strObj.toString();

		Object end_dateObj = map.get("end_date");
		if(end_dateObj != null)
			end_date = (Long) end_dateObj;

		Object end_date_strObj = map.get("end_date_str");
		if(end_date_strObj != null)
			end_date_str = end_date_strObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

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

	public String getCourse_id() {
		return course_id;
	}

	public String getCourse_idEx() {
		return course_id != null ? course_id : "";
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public void unSetCourse_id() {
		this.course_id = null;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getCourse_nameEx() {
		return course_name != null ? course_name : "";
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void unSetCourse_name() {
		this.course_name = null;
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

	public Long getStart_date() {
		return start_date;
	}

	public void setStart_date(Long start_date) {
		this.start_date = start_date;
	}


	public String getStart_date_str() {
		return start_date_str;
	}

	public String getStart_date_strEx() {
		return start_date_str != null ? start_date_str : "";
	}

	public void setStart_date_str(String start_date_str) {
		this.start_date_str = start_date_str;
	}

	public void unSetStart_date_str() {
		this.start_date_str = null;
	}

	public Long getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Long end_date) {
		this.end_date = end_date;
	}


	public String getEnd_date_str() {
		return end_date_str;
	}

	public String getEnd_date_strEx() {
		return end_date_str != null ? end_date_str : "";
	}

	public void setEnd_date_str(String end_date_str) {
		this.end_date_str = end_date_str;
	}

	public void unSetEnd_date_str() {
		this.end_date_str = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}