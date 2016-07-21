/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Baseobjective_question extends BaseResource {
	private String id = null;
	private String name = null;
	private String description = null;
	private String description_hindi = null;
	private String question = null;
	private String question_hindi = null;
	private String test_id = null;
	private String customer_id = null;
	private String user_id = null;
	private String tutorial_id = null;
	private String subject_id = null;
	private String class_name = null;
	private String option_1 = null;
	private String option_2 = null;
	private String option_3 = null;
	private String option_4 = null;
	private String option_5 = null;
	private String option_hindi_1 = null;
	private String option_hindi_2 = null;
	private String option_hindi_3 = null;
	private String option_hindi_4 = null;
	private String option_hindi_5 = null;
	private String answer = null;
	private String answer_1 = null;
	private String answer_2 = null;
	private String answer_3 = null;
	private String answer_4 = null;
	private String answer_5 = null;
	private String answer_explanation = null;
	private String answer_explanation_hindi = null;
	private Long order_no = null;
	private Double positive_mark = null;
	private Double negative_mark = null;
	private String mutiple_options = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_DESCRIPTION_HINDI = "description_hindi";
	public static String FIELD_QUESTION = "question";
	public static String FIELD_QUESTION_HINDI = "question_hindi";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_TUTORIAL_ID = "tutorial_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_OPTION_1 = "option_1";
	public static String FIELD_OPTION_2 = "option_2";
	public static String FIELD_OPTION_3 = "option_3";
	public static String FIELD_OPTION_4 = "option_4";
	public static String FIELD_OPTION_5 = "option_5";
	public static String FIELD_OPTION_HINDI_1 = "option_hindi_1";
	public static String FIELD_OPTION_HINDI_2 = "option_hindi_2";
	public static String FIELD_OPTION_HINDI_3 = "option_hindi_3";
	public static String FIELD_OPTION_HINDI_4 = "option_hindi_4";
	public static String FIELD_OPTION_HINDI_5 = "option_hindi_5";
	public static String FIELD_ANSWER = "answer";
	public static String FIELD_ANSWER_1 = "answer_1";
	public static String FIELD_ANSWER_2 = "answer_2";
	public static String FIELD_ANSWER_3 = "answer_3";
	public static String FIELD_ANSWER_4 = "answer_4";
	public static String FIELD_ANSWER_5 = "answer_5";
	public static String FIELD_ANSWER_EXPLANATION = "answer_explanation";
	public static String FIELD_ANSWER_EXPLANATION_HINDI = "answer_explanation_hindi";
	public static String FIELD_ORDER_NO = "order_no";
	public static String FIELD_POSITIVE_MARK = "positive_mark";
	public static String FIELD_NEGATIVE_MARK = "negative_mark";
	public static String FIELD_MUTIPLE_OPTIONS = "mutiple_options";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("objective_question");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(32);
		metaData.addField(descriptionField);

		Field description_hindiField = new Field("description_hindi", "String");
		description_hindiField.setLength(32);
		metaData.addField(description_hindiField);

		Field questionField = new Field("question", "String");
		questionField.setLength(32);
		metaData.addField(questionField);

		Field question_hindiField = new Field("question_hindi", "String");
		question_hindiField.setLength(32);
		metaData.addField(question_hindiField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field tutorial_idField = new Field("tutorial_id", "String");
		tutorial_idField.setLength(128);
		metaData.addField(tutorial_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field option_1Field = new Field("option_1", "String");
		option_1Field.setLength(128);
		metaData.addField(option_1Field);

		Field option_2Field = new Field("option_2", "String");
		option_2Field.setLength(128);
		metaData.addField(option_2Field);

		Field option_3Field = new Field("option_3", "String");
		option_3Field.setLength(128);
		metaData.addField(option_3Field);

		Field option_4Field = new Field("option_4", "String");
		option_4Field.setLength(128);
		metaData.addField(option_4Field);

		Field option_5Field = new Field("option_5", "String");
		option_5Field.setLength(128);
		metaData.addField(option_5Field);

		Field option_hindi_1Field = new Field("option_hindi_1", "String");
		option_hindi_1Field.setLength(128);
		metaData.addField(option_hindi_1Field);

		Field option_hindi_2Field = new Field("option_hindi_2", "String");
		option_hindi_2Field.setLength(128);
		metaData.addField(option_hindi_2Field);

		Field option_hindi_3Field = new Field("option_hindi_3", "String");
		option_hindi_3Field.setLength(128);
		metaData.addField(option_hindi_3Field);

		Field option_hindi_4Field = new Field("option_hindi_4", "String");
		option_hindi_4Field.setLength(128);
		metaData.addField(option_hindi_4Field);

		Field option_hindi_5Field = new Field("option_hindi_5", "String");
		option_hindi_5Field.setLength(128);
		metaData.addField(option_hindi_5Field);

		Field answerField = new Field("answer", "String");
		answerField.setLength(128);
		metaData.addField(answerField);

		Field answer_1Field = new Field("answer_1", "String");
		answer_1Field.setDefaultValue("N");
		answer_1Field.setLength(1);
		metaData.addField(answer_1Field);

		Field answer_2Field = new Field("answer_2", "String");
		answer_2Field.setDefaultValue("N");
		answer_2Field.setLength(1);
		metaData.addField(answer_2Field);

		Field answer_3Field = new Field("answer_3", "String");
		answer_3Field.setDefaultValue("N");
		answer_3Field.setLength(1);
		metaData.addField(answer_3Field);

		Field answer_4Field = new Field("answer_4", "String");
		answer_4Field.setDefaultValue("N");
		answer_4Field.setLength(1);
		metaData.addField(answer_4Field);

		Field answer_5Field = new Field("answer_5", "String");
		answer_5Field.setDefaultValue("N");
		answer_5Field.setLength(1);
		metaData.addField(answer_5Field);

		Field answer_explanationField = new Field("answer_explanation", "String");
		answer_explanationField.setLength(128);
		metaData.addField(answer_explanationField);

		Field answer_explanation_hindiField = new Field("answer_explanation_hindi", "String");
		answer_explanation_hindiField.setLength(128);
		metaData.addField(answer_explanation_hindiField);

		Field order_noField = new Field("order_no", "long");
		metaData.addField(order_noField);

		Field positive_markField = new Field("positive_mark", "Double");
		metaData.addField(positive_markField);

		Field negative_markField = new Field("negative_mark", "Double");
		metaData.addField(negative_markField);

		Field mutiple_optionsField = new Field("mutiple_options", "String");
		mutiple_optionsField.setDefaultValue("N");
		mutiple_optionsField.setLength(1);
		metaData.addField(mutiple_optionsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("objective_question");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseobjective_question() {}

	public Baseobjective_question(Baseobjective_question obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.description = obj.description;
		this.description_hindi = obj.description_hindi;
		this.question = obj.question;
		this.question_hindi = obj.question_hindi;
		this.test_id = obj.test_id;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.tutorial_id = obj.tutorial_id;
		this.subject_id = obj.subject_id;
		this.class_name = obj.class_name;
		this.option_1 = obj.option_1;
		this.option_2 = obj.option_2;
		this.option_3 = obj.option_3;
		this.option_4 = obj.option_4;
		this.option_5 = obj.option_5;
		this.option_hindi_1 = obj.option_hindi_1;
		this.option_hindi_2 = obj.option_hindi_2;
		this.option_hindi_3 = obj.option_hindi_3;
		this.option_hindi_4 = obj.option_hindi_4;
		this.option_hindi_5 = obj.option_hindi_5;
		this.answer = obj.answer;
		this.answer_1 = obj.answer_1;
		this.answer_2 = obj.answer_2;
		this.answer_3 = obj.answer_3;
		this.answer_4 = obj.answer_4;
		this.answer_5 = obj.answer_5;
		this.answer_explanation = obj.answer_explanation;
		this.answer_explanation_hindi = obj.answer_explanation_hindi;
		this.order_no = obj.order_no;
		this.positive_mark = obj.positive_mark;
		this.negative_mark = obj.negative_mark;
		this.mutiple_options = obj.mutiple_options;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(answer_1 == null)
			answer_1 = "N";
		if(answer_2 == null)
			answer_2 = "N";
		if(answer_3 == null)
			answer_3 = "N";
		if(answer_4 == null)
			answer_4 = "N";
		if(answer_5 == null)
			answer_5 = "N";
		if(mutiple_options == null)
			mutiple_options = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(description != null)
			map.put("description", description);
		if(description_hindi != null)
			map.put("description_hindi", description_hindi);
		if(question != null)
			map.put("question", question);
		if(question_hindi != null)
			map.put("question_hindi", question_hindi);
		if(test_id != null)
			map.put("test_id", test_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(option_1 != null)
			map.put("option_1", option_1);
		if(option_2 != null)
			map.put("option_2", option_2);
		if(option_3 != null)
			map.put("option_3", option_3);
		if(option_4 != null)
			map.put("option_4", option_4);
		if(option_5 != null)
			map.put("option_5", option_5);
		if(option_hindi_1 != null)
			map.put("option_hindi_1", option_hindi_1);
		if(option_hindi_2 != null)
			map.put("option_hindi_2", option_hindi_2);
		if(option_hindi_3 != null)
			map.put("option_hindi_3", option_hindi_3);
		if(option_hindi_4 != null)
			map.put("option_hindi_4", option_hindi_4);
		if(option_hindi_5 != null)
			map.put("option_hindi_5", option_hindi_5);
		if(answer != null)
			map.put("answer", answer);
		if(answer_1 != null)
			map.put("answer_1", answer_1);
		if(answer_2 != null)
			map.put("answer_2", answer_2);
		if(answer_3 != null)
			map.put("answer_3", answer_3);
		if(answer_4 != null)
			map.put("answer_4", answer_4);
		if(answer_5 != null)
			map.put("answer_5", answer_5);
		if(answer_explanation != null)
			map.put("answer_explanation", answer_explanation);
		if(answer_explanation_hindi != null)
			map.put("answer_explanation_hindi", answer_explanation_hindi);
		if(order_no != null)
			map.put("order_no", order_no);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
		if(mutiple_options != null)
			map.put("mutiple_options", mutiple_options);
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
		if(description_hindi != null)
			map.put("description_hindi", description_hindi);
		if(question != null)
			map.put("question", question);
		if(question_hindi != null)
			map.put("question_hindi", question_hindi);
		if(test_id != null)
			map.put("test_id", test_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(tutorial_id != null)
			map.put("tutorial_id", tutorial_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(option_1 != null)
			map.put("option_1", option_1);
		if(option_2 != null)
			map.put("option_2", option_2);
		if(option_3 != null)
			map.put("option_3", option_3);
		if(option_4 != null)
			map.put("option_4", option_4);
		if(option_5 != null)
			map.put("option_5", option_5);
		if(option_hindi_1 != null)
			map.put("option_hindi_1", option_hindi_1);
		if(option_hindi_2 != null)
			map.put("option_hindi_2", option_hindi_2);
		if(option_hindi_3 != null)
			map.put("option_hindi_3", option_hindi_3);
		if(option_hindi_4 != null)
			map.put("option_hindi_4", option_hindi_4);
		if(option_hindi_5 != null)
			map.put("option_hindi_5", option_hindi_5);
		if(answer != null)
			map.put("answer", answer);
		if(answer_1 != null)
			map.put("answer_1", answer_1);
		if(answer_2 != null)
			map.put("answer_2", answer_2);
		if(answer_3 != null)
			map.put("answer_3", answer_3);
		if(answer_4 != null)
			map.put("answer_4", answer_4);
		if(answer_5 != null)
			map.put("answer_5", answer_5);
		if(answer_explanation != null)
			map.put("answer_explanation", answer_explanation);
		if(answer_explanation_hindi != null)
			map.put("answer_explanation_hindi", answer_explanation_hindi);
		if(order_no != null)
			map.put("order_no", order_no);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
		if(mutiple_options != null)
			map.put("mutiple_options", mutiple_options);
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
		description_hindi = (String) map.get("description_hindi");
		question = (String) map.get("question");
		question_hindi = (String) map.get("question_hindi");
		test_id = (String) map.get("test_id");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		tutorial_id = (String) map.get("tutorial_id");
		subject_id = (String) map.get("subject_id");
		class_name = (String) map.get("class_name");
		option_1 = (String) map.get("option_1");
		option_2 = (String) map.get("option_2");
		option_3 = (String) map.get("option_3");
		option_4 = (String) map.get("option_4");
		option_5 = (String) map.get("option_5");
		option_hindi_1 = (String) map.get("option_hindi_1");
		option_hindi_2 = (String) map.get("option_hindi_2");
		option_hindi_3 = (String) map.get("option_hindi_3");
		option_hindi_4 = (String) map.get("option_hindi_4");
		option_hindi_5 = (String) map.get("option_hindi_5");
		answer = (String) map.get("answer");
		answer_1 = (String) map.get("answer_1");
		answer_2 = (String) map.get("answer_2");
		answer_3 = (String) map.get("answer_3");
		answer_4 = (String) map.get("answer_4");
		answer_5 = (String) map.get("answer_5");
		answer_explanation = (String) map.get("answer_explanation");
		answer_explanation_hindi = (String) map.get("answer_explanation_hindi");
		order_no = (Long) map.get("order_no");
		positive_mark = (Double) map.get("positive_mark");
		negative_mark = (Double) map.get("negative_mark");
		mutiple_options = (String) map.get("mutiple_options");
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

		Object description_hindiObj = map.get("description_hindi");
		if(description_hindiObj != null)
			description_hindi = description_hindiObj.toString();

		Object questionObj = map.get("question");
		if(questionObj != null)
			question = questionObj.toString();

		Object question_hindiObj = map.get("question_hindi");
		if(question_hindiObj != null)
			question_hindi = question_hindiObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object tutorial_idObj = map.get("tutorial_id");
		if(tutorial_idObj != null)
			tutorial_id = tutorial_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object option_1Obj = map.get("option_1");
		if(option_1Obj != null)
			option_1 = option_1Obj.toString();

		Object option_2Obj = map.get("option_2");
		if(option_2Obj != null)
			option_2 = option_2Obj.toString();

		Object option_3Obj = map.get("option_3");
		if(option_3Obj != null)
			option_3 = option_3Obj.toString();

		Object option_4Obj = map.get("option_4");
		if(option_4Obj != null)
			option_4 = option_4Obj.toString();

		Object option_5Obj = map.get("option_5");
		if(option_5Obj != null)
			option_5 = option_5Obj.toString();

		Object option_hindi_1Obj = map.get("option_hindi_1");
		if(option_hindi_1Obj != null)
			option_hindi_1 = option_hindi_1Obj.toString();

		Object option_hindi_2Obj = map.get("option_hindi_2");
		if(option_hindi_2Obj != null)
			option_hindi_2 = option_hindi_2Obj.toString();

		Object option_hindi_3Obj = map.get("option_hindi_3");
		if(option_hindi_3Obj != null)
			option_hindi_3 = option_hindi_3Obj.toString();

		Object option_hindi_4Obj = map.get("option_hindi_4");
		if(option_hindi_4Obj != null)
			option_hindi_4 = option_hindi_4Obj.toString();

		Object option_hindi_5Obj = map.get("option_hindi_5");
		if(option_hindi_5Obj != null)
			option_hindi_5 = option_hindi_5Obj.toString();

		Object answerObj = map.get("answer");
		if(answerObj != null)
			answer = answerObj.toString();

		Object answer_1Obj = map.get("answer_1");
		if(answer_1Obj != null)
			answer_1 = answer_1Obj.toString();

		Object answer_2Obj = map.get("answer_2");
		if(answer_2Obj != null)
			answer_2 = answer_2Obj.toString();

		Object answer_3Obj = map.get("answer_3");
		if(answer_3Obj != null)
			answer_3 = answer_3Obj.toString();

		Object answer_4Obj = map.get("answer_4");
		if(answer_4Obj != null)
			answer_4 = answer_4Obj.toString();

		Object answer_5Obj = map.get("answer_5");
		if(answer_5Obj != null)
			answer_5 = answer_5Obj.toString();

		Object answer_explanationObj = map.get("answer_explanation");
		if(answer_explanationObj != null)
			answer_explanation = answer_explanationObj.toString();

		Object answer_explanation_hindiObj = map.get("answer_explanation_hindi");
		if(answer_explanation_hindiObj != null)
			answer_explanation_hindi = answer_explanation_hindiObj.toString();

		Object order_noObj = map.get("order_no");
		if(order_noObj != null)
			order_no = new Long(order_noObj.toString());

		Object positive_markObj = map.get("positive_mark");
		if(positive_markObj != null)
			positive_mark = new Double(positive_markObj.toString());

		Object negative_markObj = map.get("negative_mark");
		if(negative_markObj != null)
			negative_mark = new Double(negative_markObj.toString());

		Object mutiple_optionsObj = map.get("mutiple_options");
		if(mutiple_optionsObj != null)
			mutiple_options = mutiple_optionsObj.toString();

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

	public String getDescription_hindi() {
		return description_hindi;
	}

	public String getDescription_hindiEx() {
		return description_hindi != null ? description_hindi : "";
	}

	public void setDescription_hindi(String description_hindi) {
		this.description_hindi = description_hindi;
	}

	public void unSetDescription_hindi() {
		this.description_hindi = null;
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

	public String getQuestion_hindi() {
		return question_hindi;
	}

	public String getQuestion_hindiEx() {
		return question_hindi != null ? question_hindi : "";
	}

	public void setQuestion_hindi(String question_hindi) {
		this.question_hindi = question_hindi;
	}

	public void unSetQuestion_hindi() {
		this.question_hindi = null;
	}

	public String getTest_id() {
		return test_id;
	}

	public String getTest_idEx() {
		return test_id != null ? test_id : "";
	}

	public void setTest_id(String test_id) {
		this.test_id = test_id;
	}

	public void unSetTest_id() {
		this.test_id = null;
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

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public String getTutorial_id() {
		return tutorial_id;
	}

	public String getTutorial_idEx() {
		return tutorial_id != null ? tutorial_id : "";
	}

	public void setTutorial_id(String tutorial_id) {
		this.tutorial_id = tutorial_id;
	}

	public void unSetTutorial_id() {
		this.tutorial_id = null;
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

	public String getOption_1() {
		return option_1;
	}

	public String getOption_1Ex() {
		return option_1 != null ? option_1 : "";
	}

	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}

	public void unSetOption_1() {
		this.option_1 = null;
	}

	public String getOption_2() {
		return option_2;
	}

	public String getOption_2Ex() {
		return option_2 != null ? option_2 : "";
	}

	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}

	public void unSetOption_2() {
		this.option_2 = null;
	}

	public String getOption_3() {
		return option_3;
	}

	public String getOption_3Ex() {
		return option_3 != null ? option_3 : "";
	}

	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}

	public void unSetOption_3() {
		this.option_3 = null;
	}

	public String getOption_4() {
		return option_4;
	}

	public String getOption_4Ex() {
		return option_4 != null ? option_4 : "";
	}

	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}

	public void unSetOption_4() {
		this.option_4 = null;
	}

	public String getOption_5() {
		return option_5;
	}

	public String getOption_5Ex() {
		return option_5 != null ? option_5 : "";
	}

	public void setOption_5(String option_5) {
		this.option_5 = option_5;
	}

	public void unSetOption_5() {
		this.option_5 = null;
	}

	public String getOption_hindi_1() {
		return option_hindi_1;
	}

	public String getOption_hindi_1Ex() {
		return option_hindi_1 != null ? option_hindi_1 : "";
	}

	public void setOption_hindi_1(String option_hindi_1) {
		this.option_hindi_1 = option_hindi_1;
	}

	public void unSetOption_hindi_1() {
		this.option_hindi_1 = null;
	}

	public String getOption_hindi_2() {
		return option_hindi_2;
	}

	public String getOption_hindi_2Ex() {
		return option_hindi_2 != null ? option_hindi_2 : "";
	}

	public void setOption_hindi_2(String option_hindi_2) {
		this.option_hindi_2 = option_hindi_2;
	}

	public void unSetOption_hindi_2() {
		this.option_hindi_2 = null;
	}

	public String getOption_hindi_3() {
		return option_hindi_3;
	}

	public String getOption_hindi_3Ex() {
		return option_hindi_3 != null ? option_hindi_3 : "";
	}

	public void setOption_hindi_3(String option_hindi_3) {
		this.option_hindi_3 = option_hindi_3;
	}

	public void unSetOption_hindi_3() {
		this.option_hindi_3 = null;
	}

	public String getOption_hindi_4() {
		return option_hindi_4;
	}

	public String getOption_hindi_4Ex() {
		return option_hindi_4 != null ? option_hindi_4 : "";
	}

	public void setOption_hindi_4(String option_hindi_4) {
		this.option_hindi_4 = option_hindi_4;
	}

	public void unSetOption_hindi_4() {
		this.option_hindi_4 = null;
	}

	public String getOption_hindi_5() {
		return option_hindi_5;
	}

	public String getOption_hindi_5Ex() {
		return option_hindi_5 != null ? option_hindi_5 : "";
	}

	public void setOption_hindi_5(String option_hindi_5) {
		this.option_hindi_5 = option_hindi_5;
	}

	public void unSetOption_hindi_5() {
		this.option_hindi_5 = null;
	}

	public String getAnswer() {
		return answer;
	}

	public String getAnswerEx() {
		return answer != null ? answer : "";
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void unSetAnswer() {
		this.answer = null;
	}

	public String getAnswer_1() {
		return answer_1 != null ? answer_1 : "N";
	}

	public void setAnswer_1(String answer_1) {
		this.answer_1 = answer_1;
	}

	public void unSetAnswer_1() {
		this.answer_1 = "N";
	}

	public String getAnswer_2() {
		return answer_2 != null ? answer_2 : "N";
	}

	public void setAnswer_2(String answer_2) {
		this.answer_2 = answer_2;
	}

	public void unSetAnswer_2() {
		this.answer_2 = "N";
	}

	public String getAnswer_3() {
		return answer_3 != null ? answer_3 : "N";
	}

	public void setAnswer_3(String answer_3) {
		this.answer_3 = answer_3;
	}

	public void unSetAnswer_3() {
		this.answer_3 = "N";
	}

	public String getAnswer_4() {
		return answer_4 != null ? answer_4 : "N";
	}

	public void setAnswer_4(String answer_4) {
		this.answer_4 = answer_4;
	}

	public void unSetAnswer_4() {
		this.answer_4 = "N";
	}

	public String getAnswer_5() {
		return answer_5 != null ? answer_5 : "N";
	}

	public void setAnswer_5(String answer_5) {
		this.answer_5 = answer_5;
	}

	public void unSetAnswer_5() {
		this.answer_5 = "N";
	}

	public String getAnswer_explanation() {
		return answer_explanation;
	}

	public String getAnswer_explanationEx() {
		return answer_explanation != null ? answer_explanation : "";
	}

	public void setAnswer_explanation(String answer_explanation) {
		this.answer_explanation = answer_explanation;
	}

	public void unSetAnswer_explanation() {
		this.answer_explanation = null;
	}

	public String getAnswer_explanation_hindi() {
		return answer_explanation_hindi;
	}

	public String getAnswer_explanation_hindiEx() {
		return answer_explanation_hindi != null ? answer_explanation_hindi : "";
	}

	public void setAnswer_explanation_hindi(String answer_explanation_hindi) {
		this.answer_explanation_hindi = answer_explanation_hindi;
	}

	public void unSetAnswer_explanation_hindi() {
		this.answer_explanation_hindi = null;
	}

	public Long getOrder_no() {
		return order_no;
	}

	public long getOrder_noEx() {
		return order_no != null ? order_no : 0L;
	}

	public void setOrder_no(long order_no) {
		this.order_no = order_no;
	}

	public void setOrder_no(Long order_no) {
		this.order_no = order_no;
	}

	public void unSetOrder_no() {
		this.order_no = null;
	}

	public Double getPositive_mark() {
		return positive_mark;
	}

	public void setPositive_mark(Double positive_mark) {
		this.positive_mark = positive_mark;
	}

	public void unSetPositive_mark() {
		this.positive_mark = null;
	}

	public Double getNegative_mark() {
		return negative_mark;
	}

	public void setNegative_mark(Double negative_mark) {
		this.negative_mark = negative_mark;
	}

	public void unSetNegative_mark() {
		this.negative_mark = null;
	}

	public String getMutiple_options() {
		return mutiple_options != null ? mutiple_options : "N";
	}

	public void setMutiple_options(String mutiple_options) {
		this.mutiple_options = mutiple_options;
	}

	public void unSetMutiple_options() {
		this.mutiple_options = "N";
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