/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basequestion_category extends BaseResource {
	private String id = null;
	private String name = null;
	private String parent_category_id = null;
	private String parent_category_name = null;
	private Long total_question = null;
	private Map<String, String> questions = null;
	private String visible = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PARENT_CATEGORY_ID = "parent_category_id";
	public static String FIELD_PARENT_CATEGORY_NAME = "parent_category_name";
	public static String FIELD_TOTAL_QUESTION = "total_question";
	public static String FIELD_QUESTIONS = "questions";
	public static String FIELD_VISIBLE = "visible";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("question_category");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field parent_category_idField = new Field("parent_category_id", "String");
		parent_category_idField.setIndexed(true);
		parent_category_idField.setLength(512);
		metaData.addField(parent_category_idField);

		Field parent_category_nameField = new Field("parent_category_name", "String");
		parent_category_nameField.setLength(512);
		metaData.addField(parent_category_nameField);

		Field total_questionField = new Field("total_question", "long");
		metaData.addField(total_questionField);

		Field questionsField = new Field("questions", "Map");
		questionsField.setValueType("String");
		metaData.addField(questionsField);

		Field visibleField = new Field("visible", "String");
		visibleField.setDefaultValue("N");
		visibleField.setLength(1);
		metaData.addField(visibleField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("question_category");

		metaData.setCluster("DB_QUESTION");
	}

	public Basequestion_category() {}

	public Basequestion_category(Basequestion_category obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.parent_category_id = obj.parent_category_id;
		this.parent_category_name = obj.parent_category_name;
		this.total_question = obj.total_question;
		this.questions = obj.questions;
		this.visible = obj.visible;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(visible == null)
			visible = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(parent_category_name != null)
			map.put("parent_category_name", parent_category_name);
		if(total_question != null)
			map.put("total_question", total_question);
		if(questions != null)
			map.put("questions", questions);
		if(visible != null)
			map.put("visible", visible);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		if(add)
			setDefaultValues();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(parent_category_name != null)
			map.put("parent_category_name", parent_category_name);
		if(total_question != null)
			map.put("total_question", total_question);
		if(questions != null)
			map.put("questions", questions);
		if(visible != null)
			map.put("visible", visible);
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
		parent_category_id = (String) map.get("parent_category_id");
		parent_category_name = (String) map.get("parent_category_name");
		total_question = (Long) map.get("total_question");
		questions = (Map<String, String>) map.get("questions");
		visible = (String) map.get("visible");
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

		Object parent_category_idObj = map.get("parent_category_id");
		if(parent_category_idObj != null)
			parent_category_id = parent_category_idObj.toString();

		Object parent_category_nameObj = map.get("parent_category_name");
		if(parent_category_nameObj != null)
			parent_category_name = parent_category_nameObj.toString();

		Object total_questionObj = map.get("total_question");
		if(total_questionObj != null)
			total_question = new Long(total_questionObj.toString());

		questions = (Map<String, String>) map.get("questions");
		Object visibleObj = map.get("visible");
		if(visibleObj != null)
			visible = visibleObj.toString();

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

	public String getParent_category_id() {
		return parent_category_id;
	}

	public String getParent_category_idEx() {
		return parent_category_id != null ? parent_category_id : "";
	}

	public void setParent_category_id(String parent_category_id) {
		this.parent_category_id = parent_category_id;
	}

	public void unSetParent_category_id() {
		this.parent_category_id = null;
	}

	public String getParent_category_name() {
		return parent_category_name;
	}

	public String getParent_category_nameEx() {
		return parent_category_name != null ? parent_category_name : "";
	}

	public void setParent_category_name(String parent_category_name) {
		this.parent_category_name = parent_category_name;
	}

	public void unSetParent_category_name() {
		this.parent_category_name = null;
	}

	public Long getTotal_question() {
		return total_question;
	}

	public long getTotal_questionEx() {
		return total_question != null ? total_question : 0L;
	}

	public void setTotal_question(long total_question) {
		this.total_question = total_question;
	}

	public void setTotal_question(Long total_question) {
		this.total_question = total_question;
	}

	public void unSetTotal_question() {
		this.total_question = null;
	}

	public Map<String, String> getQuestions() {
		return questions;
	}

	public String getQuestions(String key) {
		return questions == null ? null : questions.get(key);
	}

	public void setQuestions(Map<String, String> questions) {
		this.questions = questions;
	}

	public void setQuestions(String key, String value) {
		if(questions == null)
			questions = new HashMap<String, String>();
		questions.put(key, value);
	}

	public void unSetQuestions() {
		this.questions = null;
	}

	public String getVisible() {
		return visible != null ? visible : "N";
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public void unSetVisible() {
		this.visible = "N";
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
		return "DB_QUESTION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}