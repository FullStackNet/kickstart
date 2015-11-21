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
public abstract class Basetimetable extends BaseResource {
	private String id = null;
	private String class_name = null;
	private String section_name = null;
	private String teacher_id = null;
	private String teacher_name = null;
	private String subject_id = null;
	private String subject_name = null;
	private String customer_id = null;
	private String school_id = null;
	private Integer timetable_order = null;
	private Integer day = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_TEACHER_ID = "teacher_id";
	public static String FIELD_TEACHER_NAME = "teacher_name";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_TIMETABLE_ORDER = "timetable_order";
	public static String FIELD_DAY = "day";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("timetable");

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

		Field teacher_idField = new Field("teacher_id", "String");
		teacher_idField.setLength(128);
		metaData.addField(teacher_idField);

		Field teacher_nameField = new Field("teacher_name", "String");
		teacher_nameField.setLength(128);
		metaData.addField(teacher_nameField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field subject_nameField = new Field("subject_name", "String");
		subject_nameField.setLength(128);
		metaData.addField(subject_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field timetable_orderField = new Field("timetable_order", "int");
		metaData.addField(timetable_orderField);

		Field dayField = new Field("day", "int");
		metaData.addField(dayField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("timetable");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetimetable() {}

	public Basetimetable(Basetimetable obj) {
		this.id = obj.id;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.teacher_id = obj.teacher_id;
		this.teacher_name = obj.teacher_name;
		this.subject_id = obj.subject_id;
		this.subject_name = obj.subject_name;
		this.customer_id = obj.customer_id;
		this.school_id = obj.school_id;
		this.timetable_order = obj.timetable_order;
		this.day = obj.day;
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(timetable_order != null)
			map.put("timetable_order", timetable_order);
		if(day != null)
			map.put("day", day);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(timetable_order != null)
			map.put("timetable_order", timetable_order);
		if(day != null)
			map.put("day", day);
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
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		teacher_id = (String) map.get("teacher_id");
		teacher_name = (String) map.get("teacher_name");
		subject_id = (String) map.get("subject_id");
		subject_name = (String) map.get("subject_name");
		customer_id = (String) map.get("customer_id");
		school_id = (String) map.get("school_id");
		timetable_order = (Integer) map.get("timetable_order");
		day = (Integer) map.get("day");
		creation_time = (Long) map.get("creation_time");
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

		Object teacher_idObj = map.get("teacher_id");
		if(teacher_idObj != null)
			teacher_id = teacher_idObj.toString();

		Object teacher_nameObj = map.get("teacher_name");
		if(teacher_nameObj != null)
			teacher_name = teacher_nameObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object subject_nameObj = map.get("subject_name");
		if(subject_nameObj != null)
			subject_name = subject_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object timetable_orderObj = map.get("timetable_order");
		if(timetable_orderObj != null)
			timetable_order = new Integer(timetable_orderObj.toString());

		Object dayObj = map.get("day");
		if(dayObj != null)
			day = new Integer(dayObj.toString());

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

	public String getTeacher_name() {
		return teacher_name;
	}

	public String getTeacher_nameEx() {
		return teacher_name != null ? teacher_name : "";
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void unSetTeacher_name() {
		this.teacher_name = null;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public String getSubject_idEx() {
		return subject_id != null ? subject_id : "";
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public void unSetSubject_id() {
		this.subject_id = null;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public String getSubject_nameEx() {
		return subject_name != null ? subject_name : "";
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public void unSetSubject_name() {
		this.subject_name = null;
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

	public Integer getTimetable_order() {
		return timetable_order;
	}

	public int getTimetable_orderEx() {
		return timetable_order != null ? timetable_order : 0;
	}

	public void setTimetable_order(int timetable_order) {
		this.timetable_order = timetable_order;
	}

	public void setTimetable_order(Integer timetable_order) {
		this.timetable_order = timetable_order;
	}

	public void unSetTimetable_order() {
		this.timetable_order = null;
	}

	public Integer getDay() {
		return day;
	}

	public int getDayEx() {
		return day != null ? day : 0;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public void unSetDay() {
		this.day = null;
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