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
public abstract class Baseobjective_question_answer extends BaseResource {
	private String id = null;
	private String allocated_test_id = null;
	private String test_id = null;
	private String question_id = null;
	private String answer_1 = null;
	private String answer_2 = null;
	private String answer_3 = null;
	private String answer_4 = null;
	private String answer_5 = null;
	private String correct_answer_1 = null;
	private String correct_answer_2 = null;
	private String correct_answer_3 = null;
	private String correct_answer_4 = null;
	private String correct_answer_5 = null;
	private String correct_answer = null;
	private Double marks = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ALLOCATED_TEST_ID = "allocated_test_id";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_QUESTION_ID = "question_id";
	public static String FIELD_ANSWER_1 = "answer_1";
	public static String FIELD_ANSWER_2 = "answer_2";
	public static String FIELD_ANSWER_3 = "answer_3";
	public static String FIELD_ANSWER_4 = "answer_4";
	public static String FIELD_ANSWER_5 = "answer_5";
	public static String FIELD_CORRECT_ANSWER_1 = "correct_answer_1";
	public static String FIELD_CORRECT_ANSWER_2 = "correct_answer_2";
	public static String FIELD_CORRECT_ANSWER_3 = "correct_answer_3";
	public static String FIELD_CORRECT_ANSWER_4 = "correct_answer_4";
	public static String FIELD_CORRECT_ANSWER_5 = "correct_answer_5";
	public static String FIELD_CORRECT_ANSWER = "correct_answer";
	public static String FIELD_MARKS = "marks";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("objective_question_answer");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field allocated_test_idField = new Field("allocated_test_id", "String");
		allocated_test_idField.setLength(128);
		metaData.addField(allocated_test_idField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field question_idField = new Field("question_id", "String");
		question_idField.setLength(128);
		metaData.addField(question_idField);

		Field answer_1Field = new Field("answer_1", "String");
		answer_1Field.setLength(128);
		metaData.addField(answer_1Field);

		Field answer_2Field = new Field("answer_2", "String");
		answer_2Field.setLength(128);
		metaData.addField(answer_2Field);

		Field answer_3Field = new Field("answer_3", "String");
		answer_3Field.setLength(128);
		metaData.addField(answer_3Field);

		Field answer_4Field = new Field("answer_4", "String");
		answer_4Field.setLength(128);
		metaData.addField(answer_4Field);

		Field answer_5Field = new Field("answer_5", "String");
		answer_5Field.setLength(128);
		metaData.addField(answer_5Field);

		Field correct_answer_1Field = new Field("correct_answer_1", "String");
		correct_answer_1Field.setLength(128);
		metaData.addField(correct_answer_1Field);

		Field correct_answer_2Field = new Field("correct_answer_2", "String");
		correct_answer_2Field.setLength(128);
		metaData.addField(correct_answer_2Field);

		Field correct_answer_3Field = new Field("correct_answer_3", "String");
		correct_answer_3Field.setLength(128);
		metaData.addField(correct_answer_3Field);

		Field correct_answer_4Field = new Field("correct_answer_4", "String");
		correct_answer_4Field.setLength(128);
		metaData.addField(correct_answer_4Field);

		Field correct_answer_5Field = new Field("correct_answer_5", "String");
		correct_answer_5Field.setLength(128);
		metaData.addField(correct_answer_5Field);

		Field correct_answerField = new Field("correct_answer", "String");
		correct_answerField.setLength(128);
		metaData.addField(correct_answerField);

		Field marksField = new Field("marks", "double");
		metaData.addField(marksField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("objective_question_answer");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseobjective_question_answer() {}

	public Baseobjective_question_answer(Baseobjective_question_answer obj) {
		this.id = obj.id;
		this.allocated_test_id = obj.allocated_test_id;
		this.test_id = obj.test_id;
		this.question_id = obj.question_id;
		this.answer_1 = obj.answer_1;
		this.answer_2 = obj.answer_2;
		this.answer_3 = obj.answer_3;
		this.answer_4 = obj.answer_4;
		this.answer_5 = obj.answer_5;
		this.correct_answer_1 = obj.correct_answer_1;
		this.correct_answer_2 = obj.correct_answer_2;
		this.correct_answer_3 = obj.correct_answer_3;
		this.correct_answer_4 = obj.correct_answer_4;
		this.correct_answer_5 = obj.correct_answer_5;
		this.correct_answer = obj.correct_answer;
		this.marks = obj.marks;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(allocated_test_id != null)
			map.put("allocated_test_id", allocated_test_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(question_id != null)
			map.put("question_id", question_id);
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
		if(correct_answer_1 != null)
			map.put("correct_answer_1", correct_answer_1);
		if(correct_answer_2 != null)
			map.put("correct_answer_2", correct_answer_2);
		if(correct_answer_3 != null)
			map.put("correct_answer_3", correct_answer_3);
		if(correct_answer_4 != null)
			map.put("correct_answer_4", correct_answer_4);
		if(correct_answer_5 != null)
			map.put("correct_answer_5", correct_answer_5);
		if(correct_answer != null)
			map.put("correct_answer", correct_answer);
		if(marks != null)
			map.put("marks", marks);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(allocated_test_id != null)
			map.put("allocated_test_id", allocated_test_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(question_id != null)
			map.put("question_id", question_id);
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
		if(correct_answer_1 != null)
			map.put("correct_answer_1", correct_answer_1);
		if(correct_answer_2 != null)
			map.put("correct_answer_2", correct_answer_2);
		if(correct_answer_3 != null)
			map.put("correct_answer_3", correct_answer_3);
		if(correct_answer_4 != null)
			map.put("correct_answer_4", correct_answer_4);
		if(correct_answer_5 != null)
			map.put("correct_answer_5", correct_answer_5);
		if(correct_answer != null)
			map.put("correct_answer", correct_answer);
		if(marks != null)
			map.put("marks", marks);
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
		allocated_test_id = (String) map.get("allocated_test_id");
		test_id = (String) map.get("test_id");
		question_id = (String) map.get("question_id");
		answer_1 = (String) map.get("answer_1");
		answer_2 = (String) map.get("answer_2");
		answer_3 = (String) map.get("answer_3");
		answer_4 = (String) map.get("answer_4");
		answer_5 = (String) map.get("answer_5");
		correct_answer_1 = (String) map.get("correct_answer_1");
		correct_answer_2 = (String) map.get("correct_answer_2");
		correct_answer_3 = (String) map.get("correct_answer_3");
		correct_answer_4 = (String) map.get("correct_answer_4");
		correct_answer_5 = (String) map.get("correct_answer_5");
		correct_answer = (String) map.get("correct_answer");
		marks = (Double) map.get("marks");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object allocated_test_idObj = map.get("allocated_test_id");
		if(allocated_test_idObj != null)
			allocated_test_id = allocated_test_idObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object question_idObj = map.get("question_id");
		if(question_idObj != null)
			question_id = question_idObj.toString();

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

		Object correct_answer_1Obj = map.get("correct_answer_1");
		if(correct_answer_1Obj != null)
			correct_answer_1 = correct_answer_1Obj.toString();

		Object correct_answer_2Obj = map.get("correct_answer_2");
		if(correct_answer_2Obj != null)
			correct_answer_2 = correct_answer_2Obj.toString();

		Object correct_answer_3Obj = map.get("correct_answer_3");
		if(correct_answer_3Obj != null)
			correct_answer_3 = correct_answer_3Obj.toString();

		Object correct_answer_4Obj = map.get("correct_answer_4");
		if(correct_answer_4Obj != null)
			correct_answer_4 = correct_answer_4Obj.toString();

		Object correct_answer_5Obj = map.get("correct_answer_5");
		if(correct_answer_5Obj != null)
			correct_answer_5 = correct_answer_5Obj.toString();

		Object correct_answerObj = map.get("correct_answer");
		if(correct_answerObj != null)
			correct_answer = correct_answerObj.toString();

		Object marksObj = map.get("marks");
		if(marksObj != null)
			marks = new Double(marksObj.toString());

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

	public String getAllocated_test_id() {
		return allocated_test_id;
	}

	public String getAllocated_test_idEx() {
		return allocated_test_id != null ? allocated_test_id : "";
	}

	public void setAllocated_test_id(String allocated_test_id) {
		this.allocated_test_id = allocated_test_id;
	}

	public void unSetAllocated_test_id() {
		this.allocated_test_id = null;
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

	public String getQuestion_id() {
		return question_id;
	}

	public String getQuestion_idEx() {
		return question_id != null ? question_id : "";
	}

	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}

	public void unSetQuestion_id() {
		this.question_id = null;
	}

	public String getAnswer_1() {
		return answer_1;
	}

	public String getAnswer_1Ex() {
		return answer_1 != null ? answer_1 : "";
	}

	public void setAnswer_1(String answer_1) {
		this.answer_1 = answer_1;
	}

	public void unSetAnswer_1() {
		this.answer_1 = null;
	}

	public String getAnswer_2() {
		return answer_2;
	}

	public String getAnswer_2Ex() {
		return answer_2 != null ? answer_2 : "";
	}

	public void setAnswer_2(String answer_2) {
		this.answer_2 = answer_2;
	}

	public void unSetAnswer_2() {
		this.answer_2 = null;
	}

	public String getAnswer_3() {
		return answer_3;
	}

	public String getAnswer_3Ex() {
		return answer_3 != null ? answer_3 : "";
	}

	public void setAnswer_3(String answer_3) {
		this.answer_3 = answer_3;
	}

	public void unSetAnswer_3() {
		this.answer_3 = null;
	}

	public String getAnswer_4() {
		return answer_4;
	}

	public String getAnswer_4Ex() {
		return answer_4 != null ? answer_4 : "";
	}

	public void setAnswer_4(String answer_4) {
		this.answer_4 = answer_4;
	}

	public void unSetAnswer_4() {
		this.answer_4 = null;
	}

	public String getAnswer_5() {
		return answer_5;
	}

	public String getAnswer_5Ex() {
		return answer_5 != null ? answer_5 : "";
	}

	public void setAnswer_5(String answer_5) {
		this.answer_5 = answer_5;
	}

	public void unSetAnswer_5() {
		this.answer_5 = null;
	}

	public String getCorrect_answer_1() {
		return correct_answer_1;
	}

	public String getCorrect_answer_1Ex() {
		return correct_answer_1 != null ? correct_answer_1 : "";
	}

	public void setCorrect_answer_1(String correct_answer_1) {
		this.correct_answer_1 = correct_answer_1;
	}

	public void unSetCorrect_answer_1() {
		this.correct_answer_1 = null;
	}

	public String getCorrect_answer_2() {
		return correct_answer_2;
	}

	public String getCorrect_answer_2Ex() {
		return correct_answer_2 != null ? correct_answer_2 : "";
	}

	public void setCorrect_answer_2(String correct_answer_2) {
		this.correct_answer_2 = correct_answer_2;
	}

	public void unSetCorrect_answer_2() {
		this.correct_answer_2 = null;
	}

	public String getCorrect_answer_3() {
		return correct_answer_3;
	}

	public String getCorrect_answer_3Ex() {
		return correct_answer_3 != null ? correct_answer_3 : "";
	}

	public void setCorrect_answer_3(String correct_answer_3) {
		this.correct_answer_3 = correct_answer_3;
	}

	public void unSetCorrect_answer_3() {
		this.correct_answer_3 = null;
	}

	public String getCorrect_answer_4() {
		return correct_answer_4;
	}

	public String getCorrect_answer_4Ex() {
		return correct_answer_4 != null ? correct_answer_4 : "";
	}

	public void setCorrect_answer_4(String correct_answer_4) {
		this.correct_answer_4 = correct_answer_4;
	}

	public void unSetCorrect_answer_4() {
		this.correct_answer_4 = null;
	}

	public String getCorrect_answer_5() {
		return correct_answer_5;
	}

	public String getCorrect_answer_5Ex() {
		return correct_answer_5 != null ? correct_answer_5 : "";
	}

	public void setCorrect_answer_5(String correct_answer_5) {
		this.correct_answer_5 = correct_answer_5;
	}

	public void unSetCorrect_answer_5() {
		this.correct_answer_5 = null;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public String getCorrect_answerEx() {
		return correct_answer != null ? correct_answer : "";
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public void unSetCorrect_answer() {
		this.correct_answer = null;
	}

	public Double getMarks() {
		return marks;
	}

	public double getMarksEx() {
		return marks != null ? marks : 0;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public void unSetMarks() {
		this.marks = null;
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