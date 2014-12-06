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
	private String question_description = null;
	private String answer1 = null;
	private String answer2 = null;
	private String answer3 = null;
	private String answer4 = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_QUESTION = "question";
	public static String FIELD_QUESTION_DESCRIPTION = "question_description";
	public static String FIELD_ANSWER1 = "answer1";
	public static String FIELD_ANSWER2 = "answer2";
	public static String FIELD_ANSWER3 = "answer3";
	public static String FIELD_ANSWER4 = "answer4";
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

		Field question_descriptionField = new Field("question_description", "String");
		question_descriptionField.setIndexed(true);
		question_descriptionField.setLength(512);
		metaData.addField(question_descriptionField);

		Field answer1Field = new Field("answer1", "String");
		answer1Field.setIndexed(true);
		answer1Field.setLength(4096);
		metaData.addField(answer1Field);

		Field answer2Field = new Field("answer2", "String");
		answer2Field.setIndexed(true);
		answer2Field.setLength(4096);
		metaData.addField(answer2Field);

		Field answer3Field = new Field("answer3", "String");
		answer3Field.setIndexed(true);
		answer3Field.setLength(4096);
		metaData.addField(answer3Field);

		Field answer4Field = new Field("answer4", "String");
		answer4Field.setIndexed(true);
		answer4Field.setLength(4096);
		metaData.addField(answer4Field);

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
		this.question_description = obj.question_description;
		this.answer1 = obj.answer1;
		this.answer2 = obj.answer2;
		this.answer3 = obj.answer3;
		this.answer4 = obj.answer4;
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
		if(question_description != null)
			map.put("question_description", question_description);
		if(answer1 != null)
			map.put("answer1", answer1);
		if(answer2 != null)
			map.put("answer2", answer2);
		if(answer3 != null)
			map.put("answer3", answer3);
		if(answer4 != null)
			map.put("answer4", answer4);
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
		if(question_description != null)
			map.put("question_description", question_description);
		if(answer1 != null)
			map.put("answer1", answer1);
		if(answer2 != null)
			map.put("answer2", answer2);
		if(answer3 != null)
			map.put("answer3", answer3);
		if(answer4 != null)
			map.put("answer4", answer4);
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
		question_description = (String) map.get("question_description");
		answer1 = (String) map.get("answer1");
		answer2 = (String) map.get("answer2");
		answer3 = (String) map.get("answer3");
		answer4 = (String) map.get("answer4");
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

		Object question_descriptionObj = map.get("question_description");
		if(question_descriptionObj != null)
			question_description = question_descriptionObj.toString();

		Object answer1Obj = map.get("answer1");
		if(answer1Obj != null)
			answer1 = answer1Obj.toString();

		Object answer2Obj = map.get("answer2");
		if(answer2Obj != null)
			answer2 = answer2Obj.toString();

		Object answer3Obj = map.get("answer3");
		if(answer3Obj != null)
			answer3 = answer3Obj.toString();

		Object answer4Obj = map.get("answer4");
		if(answer4Obj != null)
			answer4 = answer4Obj.toString();

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

	public String getAnswer1() {
		return answer1;
	}

	public String getAnswer1Ex() {
		return answer1 != null ? answer1 : "";
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public void unSetAnswer1() {
		this.answer1 = null;
	}

	public String getAnswer2() {
		return answer2;
	}

	public String getAnswer2Ex() {
		return answer2 != null ? answer2 : "";
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public void unSetAnswer2() {
		this.answer2 = null;
	}

	public String getAnswer3() {
		return answer3;
	}

	public String getAnswer3Ex() {
		return answer3 != null ? answer3 : "";
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public void unSetAnswer3() {
		this.answer3 = null;
	}

	public String getAnswer4() {
		return answer4;
	}

	public String getAnswer4Ex() {
		return answer4 != null ? answer4 : "";
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public void unSetAnswer4() {
		this.answer4 = null;
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