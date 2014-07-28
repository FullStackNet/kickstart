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
public abstract class Baseschool_map extends BaseResource {
	private String id = null; //school id
	private ArrayList<Object> classes = null;
	private ArrayList<Object> class_sections = null;
	private ArrayList<Object> teachers = null;
	private ArrayList<Object> students = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASSES = "classes";
	public static String FIELD_CLASS_SECTIONS = "class_sections";
	public static String FIELD_TEACHERS = "teachers";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field classesField = new Field("classes", "Array");
		metaData.addField(classesField);

		Field class_sectionsField = new Field("class_sections", "Array");
		metaData.addField(class_sectionsField);

		Field teachersField = new Field("teachers", "Array");
		metaData.addField(teachersField);

		Field studentsField = new Field("students", "Array");
		metaData.addField(studentsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school_map");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseschool_map() {}

	public Baseschool_map(Baseschool_map obj) {
		this.id = obj.id;
		this.classes = obj.classes;
		this.class_sections = obj.class_sections;
		this.teachers = obj.teachers;
		this.students = obj.students;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(classes != null)
			map.put("classes", classes);
		if(class_sections != null)
			map.put("class_sections", class_sections);
		if(teachers != null)
			map.put("teachers", teachers);
		if(students != null)
			map.put("students", students);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(classes != null)
			map.put("classes", classes);
		if(class_sections != null)
			map.put("class_sections", class_sections);
		if(teachers != null)
			map.put("teachers", teachers);
		if(students != null)
			map.put("students", students);
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
		classes = (ArrayList<Object>) map.get("classes");
		class_sections = (ArrayList<Object>) map.get("class_sections");
		teachers = (ArrayList<Object>) map.get("teachers");
		students = (ArrayList<Object>) map.get("students");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		classes = (ArrayList<Object>) map.get("classes");
		class_sections = (ArrayList<Object>) map.get("class_sections");
		teachers = (ArrayList<Object>) map.get("teachers");
		students = (ArrayList<Object>) map.get("students");
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

	public ArrayList<Object> getClasses() {
		return classes;
	}


	public void setClasses(ArrayList<Object> classes) {
		this.classes = classes;
	}

	public void addClasses(Object value) {
		if(classes == null)
			classes = new ArrayList<Object>();
		classes.add(value);
	}

	public void unSetClasses() {
		this.classes = null;
	}

	public ArrayList<Object> getClass_sections() {
		return class_sections;
	}


	public void setClass_sections(ArrayList<Object> class_sections) {
		this.class_sections = class_sections;
	}

	public void addClass_sections(Object value) {
		if(class_sections == null)
			class_sections = new ArrayList<Object>();
		class_sections.add(value);
	}

	public void unSetClass_sections() {
		this.class_sections = null;
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