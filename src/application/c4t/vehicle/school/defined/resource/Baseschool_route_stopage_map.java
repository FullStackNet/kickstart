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
public abstract class Baseschool_route_stopage_map extends BaseResource {
	private String id = null;
	private ArrayList<Object> students = null;
	private ArrayList<Object> teachers = null;
	private ArrayList<Object> alert_students = null;

	public static String FIELD_ID = "id";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_TEACHERS = "teachers";
	public static String FIELD_ALERT_STUDENTS = "alert_students";

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


		metaData.setTableName("school_route_stopage_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseschool_route_stopage_map() {}

	public Baseschool_route_stopage_map(Baseschool_route_stopage_map obj) {
		this.id = obj.id;
		this.students = obj.students;
		this.teachers = obj.teachers;
		this.alert_students = obj.alert_students;
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
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		students = (ArrayList<Object>) map.get("students");
		teachers = (ArrayList<Object>) map.get("teachers");
		alert_students = (ArrayList<Object>) map.get("alert_students");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		students = (ArrayList<Object>) map.get("students");
		teachers = (ArrayList<Object>) map.get("teachers");
		alert_students = (ArrayList<Object>) map.get("alert_students");
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

	public ArrayList<Object> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Object> students) {
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

	public ArrayList<Object> getTeachers() {
		return teachers;
	}


	public void setTeachers(ArrayList<Object> teachers) {
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

	public ArrayList<Object> getAlert_students() {
		return alert_students;
	}


	public void setAlert_students(ArrayList<Object> alert_students) {
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
	public String getCluster() {
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}