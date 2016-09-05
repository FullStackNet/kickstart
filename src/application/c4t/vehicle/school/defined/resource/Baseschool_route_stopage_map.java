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
public abstract class Baseschool_route_stopage_map extends BaseResource {
	private String id = null;
	private List<Object> students = null;
	private List<Object> teachers = null;
	private List<Object> alert_students = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_TEACHERS = "teachers";
	public static String FIELD_ALERT_STUDENTS = "alert_students";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_route_stopage_map");

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

		Field alert_studentsField = new Field("alert_students", "Array");
		metaData.addField(alert_studentsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school_route_stopage_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseschool_route_stopage_map() {}

	public Baseschool_route_stopage_map(Baseschool_route_stopage_map obj) {
		this.id = obj.id;
		this.students = obj.students;
		this.teachers = obj.teachers;
		this.alert_students = obj.alert_students;
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
		if(alert_students != null)
			map.put("alert_students", alert_students);
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
		if(alert_students != null)
			map.put("alert_students", alert_students);
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
		alert_students = (List<Object>) map.get("alert_students");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		students = (List<Object>) map.get("students");
		teachers = (List<Object>) map.get("teachers");
		alert_students = (List<Object>) map.get("alert_students");
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
			students = new ArrayList<Object>();
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
			teachers = new ArrayList<Object>();
		teachers.add(value);
	}

	public void unSetTeachers() {
		this.teachers = null;
	}

	public List<Object> getAlert_students() {
		return alert_students;
	}


	public void setAlert_students(List<Object> alert_students) {
		this.alert_students = alert_students;
	}

	public void addAlert_students(Object value) {
		if(alert_students == null)
			alert_students = new ArrayList<Object>();
		alert_students.add(value);
	}

	public void unSetAlert_students() {
		this.alert_students = null;
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}