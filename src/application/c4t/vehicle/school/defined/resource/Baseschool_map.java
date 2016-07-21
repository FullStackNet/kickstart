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
public abstract class Baseschool_map extends BaseResource {
	private String id = null; //school id
	private List<Object> classes = null;
	private List<Object> class_sections = null;
	private List<Object> teachers = null;
	private List<Object> students = null;
	private List<String> card_readers = null;
	private List<String> trackers = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASSES = "classes";
	public static String FIELD_CLASS_SECTIONS = "class_sections";
	public static String FIELD_TEACHERS = "teachers";
	public static String FIELD_STUDENTS = "students";
	public static String FIELD_CARD_READERS = "card_readers";
	public static String FIELD_TRACKERS = "trackers";
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

		Field card_readersField = new Field("card_readers", "Array");
		metaData.addField(card_readersField);

		Field trackersField = new Field("trackers", "Array");
		metaData.addField(trackersField);

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
		this.card_readers = obj.card_readers;
		this.trackers = obj.trackers;
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
		if(card_readers != null)
			map.put("card_readers", card_readers);
		if(trackers != null)
			map.put("trackers", trackers);
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
		if(card_readers != null)
			map.put("card_readers", card_readers);
		if(trackers != null)
			map.put("trackers", trackers);
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
		classes = (List<Object>) map.get("classes");
		class_sections = (List<Object>) map.get("class_sections");
		teachers = (List<Object>) map.get("teachers");
		students = (List<Object>) map.get("students");
		card_readers = (List<String>) map.get("card_readers");
		trackers = (List<String>) map.get("trackers");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		classes = (List<Object>) map.get("classes");
		class_sections = (List<Object>) map.get("class_sections");
		teachers = (List<Object>) map.get("teachers");
		students = (List<Object>) map.get("students");
		card_readers = (List<String>) map.get("card_readers");
		trackers = (List<String>) map.get("trackers");
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

	public List<Object> getClasses() {
		return classes;
	}


	public void setClasses(List<Object> classes) {
		this.classes = classes;
	}

	public void addClasses(Object value) {
		if(classes == null)
			classes = new ArrayList<>();
		classes.add(value);
	}

	public void unSetClasses() {
		this.classes = null;
	}

	public List<Object> getClass_sections() {
		return class_sections;
	}


	public void setClass_sections(List<Object> class_sections) {
		this.class_sections = class_sections;
	}

	public void addClass_sections(Object value) {
		if(class_sections == null)
			class_sections = new ArrayList<>();
		class_sections.add(value);
	}

	public void unSetClass_sections() {
		this.class_sections = null;
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

	public List<String> getCard_readers() {
		return card_readers;
	}


	public void setCard_readers(List<String> card_readers) {
		this.card_readers = card_readers;
	}

	public void addCard_readers(String value) {
		if(card_readers == null)
			card_readers = new ArrayList<>();
		card_readers.add(value);
	}

	public void unSetCard_readers() {
		this.card_readers = null;
	}

	public List<String> getTrackers() {
		return trackers;
	}


	public void setTrackers(List<String> trackers) {
		this.trackers = trackers;
	}

	public void addTrackers(String value) {
		if(trackers == null)
			trackers = new ArrayList<>();
		trackers.add(value);
	}

	public void unSetTrackers() {
		this.trackers = null;
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