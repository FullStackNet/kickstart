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
public abstract class Baseschool_customer_map extends BaseResource {
	private String id = null; //customer ids
	private ArrayList<Object> schools = null;
	private ArrayList<Object> students = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOLS = "schools";
	public static String FIELD_STUDENTS = "students";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_customer_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field schoolsField = new Field("schools", "Array");
		metaData.addField(schoolsField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);


		metaData.setTableName("school_customer_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool_customer_map() {}

	public Baseschool_customer_map(Baseschool_customer_map obj) {
		this.id = obj.id;
		this.schools = obj.schools;
		this.students = obj.students;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(schools != null)
			map.put("schools", schools);
		if(students != null)
			map.put("students", students);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(schools != null)
			map.put("schools", schools);
		if(students != null)
			map.put("students", students);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		schools = (ArrayList<Object>) map.get("schools");
		students = (ArrayList<Object>) map.get("students");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		schools = (ArrayList<Object>) map.get("schools");
		students = (ArrayList<Object>) map.get("students");
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

	public ArrayList<Object> getSchools() {
		return schools;
	}


	public void setSchools(ArrayList<Object> schools) {
		this.schools = schools;
	}

	public void addSchools(Object value) {
		if(schools == null)
			schools = new ArrayList<Object>();
		schools.add(value);
	}

	public void unSetSchools() {
		this.schools = null;
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
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}