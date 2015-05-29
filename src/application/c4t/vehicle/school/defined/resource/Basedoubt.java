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
public abstract class Basedoubt extends BaseResource {
	private String id = null;
	private String title = null;
	private String description = null;
	private String student_id = null;
	private String subject_id = null;
	private String school_id = null;
	private String class_name = null;
	private Long lastupdate_time = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_LASTUPDATE_TIME = "lastupdate_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("doubt");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(512);
		metaData.addField(descriptionField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field lastupdate_timeField = new Field("lastupdate_time", "timestamp");
		metaData.addField(lastupdate_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("doubt");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basedoubt() {}

	public Basedoubt(Basedoubt obj) {
		this.id = obj.id;
		this.title = obj.title;
		this.description = obj.description;
		this.student_id = obj.student_id;
		this.subject_id = obj.subject_id;
		this.school_id = obj.school_id;
		this.class_name = obj.class_name;
		this.lastupdate_time = obj.lastupdate_time;
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
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(student_id != null)
			map.put("student_id", student_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(lastupdate_time != null)
			map.put("lastupdate_time", lastupdate_time);
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
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(student_id != null)
			map.put("student_id", student_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(lastupdate_time != null)
			map.put("lastupdate_time", lastupdate_time);
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
		title = (String) map.get("title");
		description = (String) map.get("description");
		student_id = (String) map.get("student_id");
		subject_id = (String) map.get("subject_id");
		school_id = (String) map.get("school_id");
		class_name = (String) map.get("class_name");
		lastupdate_time = (Long) map.get("lastupdate_time");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object lastupdate_timeObj = map.get("lastupdate_time");
		if(lastupdate_timeObj != null)
			lastupdate_time = (Long) lastupdate_timeObj;

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

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
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

	public Long getLastupdate_time() {
		return lastupdate_time;
	}

	public void setLastupdate_time(Long lastupdate_time) {
		this.lastupdate_time = lastupdate_time;
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