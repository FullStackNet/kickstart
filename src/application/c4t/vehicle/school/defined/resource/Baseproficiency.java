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
public abstract class Baseproficiency extends BaseResource {
	private String id = null;
	private String title_id = null;
	private String title = null;
	private String description = null;
	private String proficiency = null;
	private String remark = null;
	private String class_name = null;
	private String class_section_name = null;
	private String customer_id = null;
	private String student_id = null;
	private String school_id = null;
	private Long last_updated = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TITLE_ID = "title_id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_PROFICIENCY = "proficiency";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_CLASS_SECTION_NAME = "class_section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_LAST_UPDATED = "last_updated";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("proficiency");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field title_idField = new Field("title_id", "String");
		title_idField.setLength(128);
		metaData.addField(title_idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(128);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field proficiencyField = new Field("proficiency", "String");
		proficiencyField.setLength(128);
		metaData.addField(proficiencyField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(1024);
		metaData.addField(remarkField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field class_section_nameField = new Field("class_section_name", "String");
		class_section_nameField.setLength(128);
		metaData.addField(class_section_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field last_updatedField = new Field("last_updated", "timestamp");
		metaData.addField(last_updatedField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("proficiency");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseproficiency() {}

	public Baseproficiency(Baseproficiency obj) {
		this.id = obj.id;
		this.title_id = obj.title_id;
		this.title = obj.title;
		this.description = obj.description;
		this.proficiency = obj.proficiency;
		this.remark = obj.remark;
		this.class_name = obj.class_name;
		this.class_section_name = obj.class_section_name;
		this.customer_id = obj.customer_id;
		this.student_id = obj.student_id;
		this.school_id = obj.school_id;
		this.last_updated = obj.last_updated;
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
		if(title_id != null)
			map.put("title_id", title_id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(proficiency != null)
			map.put("proficiency", proficiency);
		if(remark != null)
			map.put("remark", remark);
		if(class_name != null)
			map.put("class_name", class_name);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(last_updated != null)
			map.put("last_updated", last_updated);
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
		if(title_id != null)
			map.put("title_id", title_id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(proficiency != null)
			map.put("proficiency", proficiency);
		if(remark != null)
			map.put("remark", remark);
		if(class_name != null)
			map.put("class_name", class_name);
		if(class_section_name != null)
			map.put("class_section_name", class_section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(last_updated != null)
			map.put("last_updated", last_updated);
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
		title_id = (String) map.get("title_id");
		title = (String) map.get("title");
		description = (String) map.get("description");
		proficiency = (String) map.get("proficiency");
		remark = (String) map.get("remark");
		class_name = (String) map.get("class_name");
		class_section_name = (String) map.get("class_section_name");
		customer_id = (String) map.get("customer_id");
		student_id = (String) map.get("student_id");
		school_id = (String) map.get("school_id");
		last_updated = (Long) map.get("last_updated");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object title_idObj = map.get("title_id");
		if(title_idObj != null)
			title_id = title_idObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object proficiencyObj = map.get("proficiency");
		if(proficiencyObj != null)
			proficiency = proficiencyObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object class_section_nameObj = map.get("class_section_name");
		if(class_section_nameObj != null)
			class_section_name = class_section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object last_updatedObj = map.get("last_updated");
		if(last_updatedObj != null)
			last_updated = (Long) last_updatedObj;

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

	public String getTitle_id() {
		return title_id;
	}

	public String getTitle_idEx() {
		return title_id != null ? title_id : "";
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public void unSetTitle_id() {
		this.title_id = null;
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

	public String getProficiency() {
		return proficiency;
	}

	public String getProficiencyEx() {
		return proficiency != null ? proficiency : "";
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public void unSetProficiency() {
		this.proficiency = null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
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

	public String getClass_section_name() {
		return class_section_name;
	}

	public String getClass_section_nameEx() {
		return class_section_name != null ? class_section_name : "";
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public void unSetClass_section_name() {
		this.class_section_name = null;
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

	public Long getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Long last_updated) {
		this.last_updated = last_updated;
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