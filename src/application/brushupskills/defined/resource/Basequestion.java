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
public abstract class Basequestion extends BaseResource {
	private String id = null;
	private String question = null;
	private String content_type = null;
	private String question_category_id = null;
	private Long question_order = null;
	private String question_description = null;
	private ArrayList<String> answers = null;
	private ArrayList<String> categories = null;
	private Long creation_time = null;
	private Long answer_points = null;
	private Long remember_points = null;
	private String video_link = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_QUESTION = "question";
	public static String FIELD_CONTENT_TYPE = "content_type";
	public static String FIELD_QUESTION_CATEGORY_ID = "question_category_id";
	public static String FIELD_QUESTION_ORDER = "question_order";
	public static String FIELD_QUESTION_DESCRIPTION = "question_description";
	public static String FIELD_ANSWERS = "answers";
	public static String FIELD_CATEGORIES = "categories";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_ANSWER_POINTS = "answer_points";
	public static String FIELD_REMEMBER_POINTS = "remember_points";
	public static String FIELD_VIDEO_LINK = "video_link";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("question");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field questionField = new Field("question", "String");
		questionField.setIndexed(true);
		questionField.setLength(128);
		metaData.addField(questionField);

		Field content_typeField = new Field("content_type", "String");
		content_typeField.setDefaultValue("Q");
		content_typeField.setLength(1);
		metaData.addField(content_typeField);

		Field question_category_idField = new Field("question_category_id", "String");
		question_category_idField.setIndexed(true);
		question_category_idField.setLength(128);
		metaData.addField(question_category_idField);

		Field question_orderField = new Field("question_order", "long");
		metaData.addField(question_orderField);

		Field question_descriptionField = new Field("question_description", "String");
		question_descriptionField.setIndexed(true);
		question_descriptionField.setLength(512);
		metaData.addField(question_descriptionField);

		Field answersField = new Field("answers", "Array");
		metaData.addField(answersField);

		Field categoriesField = new Field("categories", "Array");
		metaData.addField(categoriesField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field answer_pointsField = new Field("answer_points", "long");
		metaData.addField(answer_pointsField);

		Field remember_pointsField = new Field("remember_points", "long");
		metaData.addField(remember_pointsField);

		Field video_linkField = new Field("video_link", "String");
		metaData.addField(video_linkField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("question");

		metaData.setCluster("DB_QUESTION");
	}

	public Basequestion() {}

	public Basequestion(Basequestion obj) {
		this.id = obj.id;
		this.question = obj.question;
		this.content_type = obj.content_type;
		this.question_category_id = obj.question_category_id;
		this.question_order = obj.question_order;
		this.question_description = obj.question_description;
		this.answers = obj.answers;
		this.categories = obj.categories;
		this.creation_time = obj.creation_time;
		this.answer_points = obj.answer_points;
		this.remember_points = obj.remember_points;
		this.video_link = obj.video_link;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(content_type == null)
			content_type = "Q";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(question != null)
			map.put("question", question);
		if(content_type != null)
			map.put("content_type", content_type);
		if(question_category_id != null)
			map.put("question_category_id", question_category_id);
		if(question_order != null)
			map.put("question_order", question_order);
		if(question_description != null)
			map.put("question_description", question_description);
		if(answers != null)
			map.put("answers", answers);
		if(categories != null)
			map.put("categories", categories);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(answer_points != null)
			map.put("answer_points", answer_points);
		if(remember_points != null)
			map.put("remember_points", remember_points);
		if(video_link != null)
			map.put("video_link", video_link);
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
		if(question != null)
			map.put("question", question);
		if(content_type != null)
			map.put("content_type", content_type);
		if(question_category_id != null)
			map.put("question_category_id", question_category_id);
		if(question_order != null)
			map.put("question_order", question_order);
		if(question_description != null)
			map.put("question_description", question_description);
		if(answers != null)
			map.put("answers", answers);
		if(categories != null)
			map.put("categories", categories);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(answer_points != null)
			map.put("answer_points", answer_points);
		if(remember_points != null)
			map.put("remember_points", remember_points);
		if(video_link != null)
			map.put("video_link", video_link);
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
		question = (String) map.get("question");
		content_type = (String) map.get("content_type");
		question_category_id = (String) map.get("question_category_id");
		question_order = (Long) map.get("question_order");
		question_description = (String) map.get("question_description");
		answers = (ArrayList<String>) map.get("answers");
		categories = (ArrayList<String>) map.get("categories");
		creation_time = (Long) map.get("creation_time");
		answer_points = (Long) map.get("answer_points");
		remember_points = (Long) map.get("remember_points");
		video_link = (String) map.get("video_link");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object questionObj = map.get("question");
		if(questionObj != null)
			question = questionObj.toString();

		Object content_typeObj = map.get("content_type");
		if(content_typeObj != null)
			content_type = content_typeObj.toString();

		Object question_category_idObj = map.get("question_category_id");
		if(question_category_idObj != null)
			question_category_id = question_category_idObj.toString();

		Object question_orderObj = map.get("question_order");
		if(question_orderObj != null)
			question_order = new Long(question_orderObj.toString());

		Object question_descriptionObj = map.get("question_description");
		if(question_descriptionObj != null)
			question_description = question_descriptionObj.toString();

		answers = (ArrayList<String>) map.get("answers");
		categories = (ArrayList<String>) map.get("categories");
		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object answer_pointsObj = map.get("answer_points");
		if(answer_pointsObj != null)
			answer_points = new Long(answer_pointsObj.toString());

		Object remember_pointsObj = map.get("remember_points");
		if(remember_pointsObj != null)
			remember_points = new Long(remember_pointsObj.toString());

		Object video_linkObj = map.get("video_link");
		if(video_linkObj != null)
			video_link = video_linkObj.toString();

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

	public String getQuestion() {
		return question;
	}

	public String getQuestionEx() {
		return question != null ? question : "";
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void unSetQuestion() {
		this.question = null;
	}

	public String getContent_type() {
		return content_type != null ? content_type : "Q";
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public void unSetContent_type() {
		this.content_type = "Q";
	}

	public String getQuestion_category_id() {
		return question_category_id;
	}

	public String getQuestion_category_idEx() {
		return question_category_id != null ? question_category_id : "";
	}

	public void setQuestion_category_id(String question_category_id) {
		this.question_category_id = question_category_id;
	}

	public void unSetQuestion_category_id() {
		this.question_category_id = null;
	}

	public Long getQuestion_order() {
		return question_order;
	}

	public long getQuestion_orderEx() {
		return question_order != null ? question_order : 0L;
	}

	public void setQuestion_order(long question_order) {
		this.question_order = question_order;
	}

	public void setQuestion_order(Long question_order) {
		this.question_order = question_order;
	}

	public void unSetQuestion_order() {
		this.question_order = null;
	}

	public String getQuestion_description() {
		return question_description;
	}

	public String getQuestion_descriptionEx() {
		return question_description != null ? question_description : "";
	}

	public void setQuestion_description(String question_description) {
		this.question_description = question_description;
	}

	public void unSetQuestion_description() {
		this.question_description = null;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}


	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}

	public void addAnswers(String value) {
		if(answers == null)
			answers = new ArrayList<String>();
		answers.add(value);
	}

	public void unSetAnswers() {
		this.answers = null;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}


	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public void addCategories(String value) {
		if(categories == null)
			categories = new ArrayList<String>();
		categories.add(value);
	}

	public void unSetCategories() {
		this.categories = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getAnswer_points() {
		return answer_points;
	}

	public long getAnswer_pointsEx() {
		return answer_points != null ? answer_points : 0L;
	}

	public void setAnswer_points(long answer_points) {
		this.answer_points = answer_points;
	}

	public void setAnswer_points(Long answer_points) {
		this.answer_points = answer_points;
	}

	public void unSetAnswer_points() {
		this.answer_points = null;
	}

	public Long getRemember_points() {
		return remember_points;
	}

	public long getRemember_pointsEx() {
		return remember_points != null ? remember_points : 0L;
	}

	public void setRemember_points(long remember_points) {
		this.remember_points = remember_points;
	}

	public void setRemember_points(Long remember_points) {
		this.remember_points = remember_points;
	}

	public void unSetRemember_points() {
		this.remember_points = null;
	}

	public String getVideo_link() {
		return video_link;
	}

	public String getVideo_linkEx() {
		return video_link != null ? video_link : "";
	}

	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}

	public void unSetVideo_link() {
		this.video_link = null;
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