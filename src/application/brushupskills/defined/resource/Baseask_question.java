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
public abstract class Baseask_question extends BaseResource {
	private String id = null;
	private String question = null;
	private Long question_order = null;
	private String question_description = null;
	private String reference_question_id = null;
	private String status = null;
	private Long creation_time = null;
	private String candidate_id = null;
	private String candidate_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_QUESTION = "question";
	public static String FIELD_QUESTION_ORDER = "question_order";
	public static String FIELD_QUESTION_DESCRIPTION = "question_description";
	public static String FIELD_REFERENCE_QUESTION_ID = "reference_question_id";
	public static String FIELD_STATUS = "status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_CANDIDATE_NAME = "candidate_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("ask_question");

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

		Field question_orderField = new Field("question_order", "long");
		metaData.addField(question_orderField);

		Field question_descriptionField = new Field("question_description", "String");
		question_descriptionField.setLength(512);
		metaData.addField(question_descriptionField);

		Field reference_question_idField = new Field("reference_question_id", "String");
		reference_question_idField.setLength(128);
		metaData.addField(reference_question_idField);

		Field statusField = new Field("status", "String");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field candidate_idField = new Field("candidate_id", "String");
		candidate_idField.setLength(128);
		metaData.addField(candidate_idField);

		Field candidate_nameField = new Field("candidate_name", "String");
		candidate_nameField.setLength(128);
		metaData.addField(candidate_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("ask_question");

		metaData.setCluster("DB_QUESTION");
	}

	public Baseask_question() {}

	public Baseask_question(Baseask_question obj) {
		this.id = obj.id;
		this.question = obj.question;
		this.question_order = obj.question_order;
		this.question_description = obj.question_description;
		this.reference_question_id = obj.reference_question_id;
		this.status = obj.status;
		this.creation_time = obj.creation_time;
		this.candidate_id = obj.candidate_id;
		this.candidate_name = obj.candidate_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(question != null)
			map.put("question", question);
		if(question_order != null)
			map.put("question_order", question_order);
		if(question_description != null)
			map.put("question_description", question_description);
		if(reference_question_id != null)
			map.put("reference_question_id", reference_question_id);
		if(status != null)
			map.put("status", status);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(candidate_name != null)
			map.put("candidate_name", candidate_name);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(question != null)
			map.put("question", question);
		if(question_order != null)
			map.put("question_order", question_order);
		if(question_description != null)
			map.put("question_description", question_description);
		if(reference_question_id != null)
			map.put("reference_question_id", reference_question_id);
		if(status != null)
			map.put("status", status);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(candidate_name != null)
			map.put("candidate_name", candidate_name);
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
		question_order = (Long) map.get("question_order");
		question_description = (String) map.get("question_description");
		reference_question_id = (String) map.get("reference_question_id");
		status = (String) map.get("status");
		creation_time = (Long) map.get("creation_time");
		candidate_id = (String) map.get("candidate_id");
		candidate_name = (String) map.get("candidate_name");
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

		Object question_orderObj = map.get("question_order");
		if(question_orderObj != null)
			question_order = new Long(question_orderObj.toString());

		Object question_descriptionObj = map.get("question_description");
		if(question_descriptionObj != null)
			question_description = question_descriptionObj.toString();

		Object reference_question_idObj = map.get("reference_question_id");
		if(reference_question_idObj != null)
			reference_question_id = reference_question_idObj.toString();

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object candidate_idObj = map.get("candidate_id");
		if(candidate_idObj != null)
			candidate_id = candidate_idObj.toString();

		Object candidate_nameObj = map.get("candidate_name");
		if(candidate_nameObj != null)
			candidate_name = candidate_nameObj.toString();

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

	public String getReference_question_id() {
		return reference_question_id;
	}

	public String getReference_question_idEx() {
		return reference_question_id != null ? reference_question_id : "";
	}

	public void setReference_question_id(String reference_question_id) {
		this.reference_question_id = reference_question_id;
	}

	public void unSetReference_question_id() {
		this.reference_question_id = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public String getCandidate_id() {
		return candidate_id;
	}

	public String getCandidate_idEx() {
		return candidate_id != null ? candidate_id : "";
	}

	public void setCandidate_id(String candidate_id) {
		this.candidate_id = candidate_id;
	}

	public void unSetCandidate_id() {
		this.candidate_id = null;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public String getCandidate_nameEx() {
		return candidate_name != null ? candidate_name : "";
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public void unSetCandidate_name() {
		this.candidate_name = null;
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