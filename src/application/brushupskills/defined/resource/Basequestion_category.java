/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
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
public abstract class Basequestion_category extends BaseResource {
	private String id = null;
	private String name = null;
	private String description = null;
	private String parent_category_id = null;
	private String parent_category_name = null;
	private Long order = null;
	private Long total_type = null;
	private Long total_question = null;
	private Long total_sub_categories = null;
	private String type = null; //Q-Question,C-Category
	private Map<String, Object> questions = null;
	private String visible = null;
	private ArrayList<String> sub_categories = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_PARENT_CATEGORY_ID = "parent_category_id";
	public static String FIELD_PARENT_CATEGORY_NAME = "parent_category_name";
	public static String FIELD_ORDER = "order";
	public static String FIELD_TOTAL_TYPE = "total_type";
	public static String FIELD_TOTAL_QUESTION = "total_question";
	public static String FIELD_TOTAL_SUB_CATEGORIES = "total_sub_categories";
	public static String FIELD_TYPE = "type";
	public static String FIELD_QUESTIONS = "questions";
	public static String FIELD_VISIBLE = "visible";
	public static String FIELD_SUB_CATEGORIES = "sub_categories";
	public static String FIELD_CREATION_TIME = "creation_time";
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

		Field descriptionField = new Field("description", "String");
		descriptionField.setIndexed(true);
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field parent_category_idField = new Field("parent_category_id", "String");
		parent_category_idField.setIndexed(true);
		parent_category_idField.setLength(512);
		metaData.addField(parent_category_idField);

		Field parent_category_nameField = new Field("parent_category_name", "String");
		parent_category_nameField.setLength(512);
		metaData.addField(parent_category_nameField);

		Field orderField = new Field("order", "long");
		metaData.addField(orderField);

		Field total_typeField = new Field("total_type", "long");
		metaData.addField(total_typeField);

		Field total_questionField = new Field("total_question", "long");
		metaData.addField(total_questionField);

		Field total_sub_categoriesField = new Field("total_sub_categories", "long");
		metaData.addField(total_sub_categoriesField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field questionsField = new Field("questions", "Map");
		questionsField.setValueType("Object");
		metaData.addField(questionsField);

		Field visibleField = new Field("visible", "String");
		visibleField.setDefaultValue("N");
		visibleField.setLength(1);
		metaData.addField(visibleField);

		Field sub_categoriesField = new Field("sub_categories", "Array");
		metaData.addField(sub_categoriesField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

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
		this.description = obj.description;
		this.parent_category_id = obj.parent_category_id;
		this.parent_category_name = obj.parent_category_name;
		this.order = obj.order;
		this.total_type = obj.total_type;
		this.total_question = obj.total_question;
		this.total_sub_categories = obj.total_sub_categories;
		this.type = obj.type;
		this.questions = obj.questions;
		this.visible = obj.visible;
		this.sub_categories = obj.sub_categories;
		this.creation_time = obj.creation_time;
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
		if(description != null)
			map.put("description", description);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(parent_category_name != null)
			map.put("parent_category_name", parent_category_name);
		if(order != null)
			map.put("order", order);
		if(total_type != null)
			map.put("total_type", total_type);
		if(total_question != null)
			map.put("total_question", total_question);
		if(total_sub_categories != null)
			map.put("total_sub_categories", total_sub_categories);
		if(type != null)
			map.put("type", type);
		if(questions != null)
			map.put("questions", questions);
		if(visible != null)
			map.put("visible", visible);
		if(sub_categories != null)
			map.put("sub_categories", sub_categories);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(description != null)
			map.put("description", description);
		if(parent_category_id != null)
			map.put("parent_category_id", parent_category_id);
		if(parent_category_name != null)
			map.put("parent_category_name", parent_category_name);
		if(order != null)
			map.put("order", order);
		if(total_type != null)
			map.put("total_type", total_type);
		if(total_question != null)
			map.put("total_question", total_question);
		if(total_sub_categories != null)
			map.put("total_sub_categories", total_sub_categories);
		if(type != null)
			map.put("type", type);
		if(questions != null)
			map.put("questions", questions);
		if(visible != null)
			map.put("visible", visible);
		if(sub_categories != null)
			map.put("sub_categories", sub_categories);
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
		name = (String) map.get("name");
		description = (String) map.get("description");
		parent_category_id = (String) map.get("parent_category_id");
		parent_category_name = (String) map.get("parent_category_name");
		order = (Long) map.get("order");
		total_type = (Long) map.get("total_type");
		total_question = (Long) map.get("total_question");
		total_sub_categories = (Long) map.get("total_sub_categories");
		type = (String) map.get("type");
		questions = (Map<String, Object>) map.get("questions");
		visible = (String) map.get("visible");
		sub_categories = (ArrayList<String>) map.get("sub_categories");
		creation_time = (Long) map.get("creation_time");
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

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object parent_category_idObj = map.get("parent_category_id");
		if(parent_category_idObj != null)
			parent_category_id = parent_category_idObj.toString();

		Object parent_category_nameObj = map.get("parent_category_name");
		if(parent_category_nameObj != null)
			parent_category_name = parent_category_nameObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object total_typeObj = map.get("total_type");
		if(total_typeObj != null)
			total_type = new Long(total_typeObj.toString());

		Object total_questionObj = map.get("total_question");
		if(total_questionObj != null)
			total_question = new Long(total_questionObj.toString());

		Object total_sub_categoriesObj = map.get("total_sub_categories");
		if(total_sub_categoriesObj != null)
			total_sub_categories = new Long(total_sub_categoriesObj.toString());

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		questions = (Map<String, Object>) map.get("questions");
		Object visibleObj = map.get("visible");
		if(visibleObj != null)
			visible = visibleObj.toString();

		sub_categories = (ArrayList<String>) map.get("sub_categories");
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

	public Long getOrder() {
		return order;
	}

	public long getOrderEx() {
		return order != null ? order : 0L;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
	}

	public Long getTotal_type() {
		return total_type;
	}

	public long getTotal_typeEx() {
		return total_type != null ? total_type : 0L;
	}

	public void setTotal_type(long total_type) {
		this.total_type = total_type;
	}

	public void setTotal_type(Long total_type) {
		this.total_type = total_type;
	}

	public void unSetTotal_type() {
		this.total_type = null;
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

	public Long getTotal_sub_categories() {
		return total_sub_categories;
	}

	public long getTotal_sub_categoriesEx() {
		return total_sub_categories != null ? total_sub_categories : 0L;
	}

	public void setTotal_sub_categories(long total_sub_categories) {
		this.total_sub_categories = total_sub_categories;
	}

	public void setTotal_sub_categories(Long total_sub_categories) {
		this.total_sub_categories = total_sub_categories;
	}

	public void unSetTotal_sub_categories() {
		this.total_sub_categories = null;
	}

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public Map<String, Object> getQuestions() {
		return questions;
	}

	public Object getQuestions(String key) {
		return questions == null ? null : questions.get(key);
	}

	public void setQuestions(Map<String, Object> questions) {
		this.questions = questions;
	}

	public void setQuestions(String key, Object value) {
		if(questions == null)
			questions = new HashMap<String, Object>();
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

	public ArrayList<String> getSub_categories() {
		return sub_categories;
	}


	public void setSub_categories(ArrayList<String> sub_categories) {
		this.sub_categories = sub_categories;
	}

	public void addSub_categories(String value) {
		if(sub_categories == null)
			sub_categories = new ArrayList<String>();
		sub_categories.add(value);
	}

	public void unSetSub_categories() {
		this.sub_categories = null;
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
		return "DB_QUESTION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}