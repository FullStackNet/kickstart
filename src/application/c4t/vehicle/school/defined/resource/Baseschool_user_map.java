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
public abstract class Baseschool_user_map extends BaseResource {
	private String id = null; //user ids
	private List<Object> students = null;
	private List<Object> teachers = null;
	private List<Object> schools = null;
	private List<Object> appliances = null;
	private List<Object> messageaFromSchool = null;
	private List<Object> messageaFromTeacher = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_TEACHERS = "teachers";
	public static String FIELD_SCHOOLS = "schools";
	public static String FIELD_APPLIANCES = "appliances";
	public static String FIELD_MESSAGEAFROMSCHOOL = "messageaFromSchool";
	public static String FIELD_MESSAGEAFROMTEACHER = "messageaFromTeacher";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_user_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

		Field teachersField = new Field("teachers", "Array");
		metaData.addField(teachersField);

		Field schoolsField = new Field("schools", "Array");
		metaData.addField(schoolsField);

		Field appliancesField = new Field("appliances", "Array");
		metaData.addField(appliancesField);

		Field messageaFromSchoolField = new Field("messageaFromSchool", "Array");
		metaData.addField(messageaFromSchoolField);

		Field messageaFromTeacherField = new Field("messageaFromTeacher", "Array");
		metaData.addField(messageaFromTeacherField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school_user_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool_user_map() {}

	public Baseschool_user_map(Baseschool_user_map obj) {
		this.id = obj.id;
		this.students = obj.students;
		this.teachers = obj.teachers;
		this.schools = obj.schools;
		this.appliances = obj.appliances;
		this.messageaFromSchool = obj.messageaFromSchool;
		this.messageaFromTeacher = obj.messageaFromTeacher;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(students != null)
			map.put("students", students);
		if(teachers != null)
			map.put("teachers", teachers);
		if(schools != null)
			map.put("schools", schools);
		if(appliances != null)
			map.put("appliances", appliances);
		if(messageaFromSchool != null)
			map.put("messageaFromSchool", messageaFromSchool);
		if(messageaFromTeacher != null)
			map.put("messageaFromTeacher", messageaFromTeacher);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(students != null)
			map.put("students", students);
		if(teachers != null)
			map.put("teachers", teachers);
		if(schools != null)
			map.put("schools", schools);
		if(appliances != null)
			map.put("appliances", appliances);
		if(messageaFromSchool != null)
			map.put("messageaFromSchool", messageaFromSchool);
		if(messageaFromTeacher != null)
			map.put("messageaFromTeacher", messageaFromTeacher);
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
		students = (List<Object>) map.get("students");
		teachers = (List<Object>) map.get("teachers");
		schools = (List<Object>) map.get("schools");
		appliances = (List<Object>) map.get("appliances");
		messageaFromSchool = (List<Object>) map.get("messageaFromSchool");
		messageaFromTeacher = (List<Object>) map.get("messageaFromTeacher");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		students = (List<Object>) map.get("students");
		teachers = (List<Object>) map.get("teachers");
		schools = (List<Object>) map.get("schools");
		appliances = (List<Object>) map.get("appliances");
		messageaFromSchool = (List<Object>) map.get("messageaFromSchool");
		messageaFromTeacher = (List<Object>) map.get("messageaFromTeacher");
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

	public List<Object> getStudents() {
		return students;
	}


	public void setStudents(List<Object> students) {
		this.students = students;
	}

	public void addStudents(Object value) {
		if(students == null)
			students = new ArrayList<>();
		students.add(value);
	}

	public void unSetStudents() {
		this.students = null;
	}

	public List<Object> getTeachers() {
		return teachers;
	}


	public void setTeachers(List<Object> teachers) {
		this.teachers = teachers;
	}

	public void addTeachers(Object value) {
		if(teachers == null)
			teachers = new ArrayList<>();
		teachers.add(value);
	}

	public void unSetTeachers() {
		this.teachers = null;
	}

	public List<Object> getSchools() {
		return schools;
	}


	public void setSchools(List<Object> schools) {
		this.schools = schools;
	}

	public void addSchools(Object value) {
		if(schools == null)
			schools = new ArrayList<>();
		schools.add(value);
	}

	public void unSetSchools() {
		this.schools = null;
	}

	public List<Object> getAppliances() {
		return appliances;
	}


	public void setAppliances(List<Object> appliances) {
		this.appliances = appliances;
	}

	public void addAppliances(Object value) {
		if(appliances == null)
			appliances = new ArrayList<>();
		appliances.add(value);
	}

	public void unSetAppliances() {
		this.appliances = null;
	}

	public List<Object> getMessageaFromSchool() {
		return messageaFromSchool;
	}


	public void setMessageaFromSchool(List<Object> messageaFromSchool) {
		this.messageaFromSchool = messageaFromSchool;
	}

	public void addMessageaFromSchool(Object value) {
		if(messageaFromSchool == null)
			messageaFromSchool = new ArrayList<>();
		messageaFromSchool.add(value);
	}

	public void unSetMessageaFromSchool() {
		this.messageaFromSchool = null;
	}

	public List<Object> getMessageaFromTeacher() {
		return messageaFromTeacher;
	}


	public void setMessageaFromTeacher(List<Object> messageaFromTeacher) {
		this.messageaFromTeacher = messageaFromTeacher;
	}

	public void addMessageaFromTeacher(Object value) {
		if(messageaFromTeacher == null)
			messageaFromTeacher = new ArrayList<>();
		messageaFromTeacher.add(value);
	}

	public void unSetMessageaFromTeacher() {
		this.messageaFromTeacher = null;
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