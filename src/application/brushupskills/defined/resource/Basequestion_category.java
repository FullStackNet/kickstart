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
	private ArrayList<String> questions = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PARENT_CATEGORY_ID = "parent_category_id";
	public static String FIELD_QUESTIONS = "questions";
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

		Field questionsField = new Field("questions", "Array");
		metaData.addField(questionsField);

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
		this.questions = obj.questions;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(questions != null)
			map.put("questions", questions);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(questions != null)
			map.put("questions", questions);
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
		questions = (ArrayList<String>) map.get("questions");
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

		questions = (ArrayList<String>) map.get("questions");
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

	public ArrayList<String> getQuestions() {
		return questions;
	}


	public void setQuestions(ArrayList<String> questions) {
		this.questions = questions;
	}

	public void addQuestions(String value) {
		if(questions == null)
			questions = new ArrayList<String>();
		questions.add(value);
	}

	public void unSetQuestions() {
		this.questions = null;
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