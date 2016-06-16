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
public abstract class Basetest extends BaseResource {
	private String id = null;
	private String code = null;
	private String title = null;
	private String title_hindi = null;
	private String instruction = null;
	private String instruction_hindi = null;
	private String subject_id = null;
	private String course_id = null;
	private String course_name = null;
	private String subject_name = null;
	private Long total_questions = null;
	private Double total_marks = null;
	private String test_hindi = null;
	private String test_english = null;
	private Double positive_mark = null;
	private Double negative_mark = null;
	private String customer_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CODE = "code";
	public static String FIELD_TITLE = "title";
	public static String FIELD_TITLE_HINDI = "title_hindi";
	public static String FIELD_INSTRUCTION = "instruction";
	public static String FIELD_INSTRUCTION_HINDI = "instruction_hindi";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_TOTAL_QUESTIONS = "total_questions";
	public static String FIELD_TOTAL_MARKS = "total_marks";
	public static String FIELD_TEST_HINDI = "test_hindi";
	public static String FIELD_TEST_ENGLISH = "test_english";
	public static String FIELD_POSITIVE_MARK = "positive_mark";
	public static String FIELD_NEGATIVE_MARK = "negative_mark";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("test");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field codeField = new Field("code", "String");
		codeField.setLength(128);
		metaData.addField(codeField);

		Field titleField = new Field("title", "String");
		titleField.setLength(128);
		metaData.addField(titleField);

		Field title_hindiField = new Field("title_hindi", "String");
		title_hindiField.setLength(128);
		metaData.addField(title_hindiField);

		Field instructionField = new Field("instruction", "String");
		instructionField.setLength(4096);
		metaData.addField(instructionField);

		Field instruction_hindiField = new Field("instruction_hindi", "String");
		instruction_hindiField.setLength(4096);
		metaData.addField(instruction_hindiField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(128);
		metaData.addField(course_idField);

		Field course_nameField = new Field("course_name", "String");
		course_nameField.setLength(128);
		metaData.addField(course_nameField);

		Field subject_nameField = new Field("subject_name", "String");
		subject_nameField.setLength(128);
		metaData.addField(subject_nameField);

		Field total_questionsField = new Field("total_questions", "long");
		metaData.addField(total_questionsField);

		Field total_marksField = new Field("total_marks", "Double");
		metaData.addField(total_marksField);

		Field test_hindiField = new Field("test_hindi", "String");
		test_hindiField.setLength(128);
		metaData.addField(test_hindiField);

		Field test_englishField = new Field("test_english", "String");
		test_englishField.setLength(128);
		metaData.addField(test_englishField);

		Field positive_markField = new Field("positive_mark", "Double");
		metaData.addField(positive_markField);

		Field negative_markField = new Field("negative_mark", "Double");
		metaData.addField(negative_markField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("test");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetest() {}

	public Basetest(Basetest obj) {
		this.id = obj.id;
		this.code = obj.code;
		this.title = obj.title;
		this.title_hindi = obj.title_hindi;
		this.instruction = obj.instruction;
		this.instruction_hindi = obj.instruction_hindi;
		this.subject_id = obj.subject_id;
		this.course_id = obj.course_id;
		this.course_name = obj.course_name;
		this.subject_name = obj.subject_name;
		this.total_questions = obj.total_questions;
		this.total_marks = obj.total_marks;
		this.test_hindi = obj.test_hindi;
		this.test_english = obj.test_english;
		this.positive_mark = obj.positive_mark;
		this.negative_mark = obj.negative_mark;
		this.customer_id = obj.customer_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(code != null)
			map.put("code", code);
		if(title != null)
			map.put("title", title);
		if(title_hindi != null)
			map.put("title_hindi", title_hindi);
		if(instruction != null)
			map.put("instruction", instruction);
		if(instruction_hindi != null)
			map.put("instruction_hindi", instruction_hindi);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(total_questions != null)
			map.put("total_questions", total_questions);
		if(total_marks != null)
			map.put("total_marks", total_marks);
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(code != null)
			map.put("code", code);
		if(title != null)
			map.put("title", title);
		if(title_hindi != null)
			map.put("title_hindi", title_hindi);
		if(instruction != null)
			map.put("instruction", instruction);
		if(instruction_hindi != null)
			map.put("instruction_hindi", instruction_hindi);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(total_questions != null)
			map.put("total_questions", total_questions);
		if(total_marks != null)
			map.put("total_marks", total_marks);
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(positive_mark != null)
			map.put("positive_mark", positive_mark);
		if(negative_mark != null)
			map.put("negative_mark", negative_mark);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		code = (String) map.get("code");
		title = (String) map.get("title");
		title_hindi = (String) map.get("title_hindi");
		instruction = (String) map.get("instruction");
		instruction_hindi = (String) map.get("instruction_hindi");
		subject_id = (String) map.get("subject_id");
		course_id = (String) map.get("course_id");
		course_name = (String) map.get("course_name");
		subject_name = (String) map.get("subject_name");
		total_questions = (Long) map.get("total_questions");
		total_marks = (Double) map.get("total_marks");
		test_hindi = (String) map.get("test_hindi");
		test_english = (String) map.get("test_english");
		positive_mark = (Double) map.get("positive_mark");
		negative_mark = (Double) map.get("negative_mark");
		customer_id = (String) map.get("customer_id");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object codeObj = map.get("code");
		if(codeObj != null)
			code = codeObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object title_hindiObj = map.get("title_hindi");
		if(title_hindiObj != null)
			title_hindi = title_hindiObj.toString();

		Object instructionObj = map.get("instruction");
		if(instructionObj != null)
			instruction = instructionObj.toString();

		Object instruction_hindiObj = map.get("instruction_hindi");
		if(instruction_hindiObj != null)
			instruction_hindi = instruction_hindiObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object course_nameObj = map.get("course_name");
		if(course_nameObj != null)
			course_name = course_nameObj.toString();

		Object subject_nameObj = map.get("subject_name");
		if(subject_nameObj != null)
			subject_name = subject_nameObj.toString();

		Object total_questionsObj = map.get("total_questions");
		if(total_questionsObj != null)
			total_questions = new Long(total_questionsObj.toString());

		Object total_marksObj = map.get("total_marks");
		if(total_marksObj != null)
			total_marks = new Double(total_marksObj.toString());

		Object test_hindiObj = map.get("test_hindi");
		if(test_hindiObj != null)
			test_hindi = test_hindiObj.toString();

		Object test_englishObj = map.get("test_english");
		if(test_englishObj != null)
			test_english = test_englishObj.toString();

		Object positive_markObj = map.get("positive_mark");
		if(positive_markObj != null)
			positive_mark = new Double(positive_markObj.toString());

		Object negative_markObj = map.get("negative_mark");
		if(negative_markObj != null)
			negative_mark = new Double(negative_markObj.toString());

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public String getCode() {
		return code;
	}

	public String getCodeEx() {
		return code != null ? code : "";
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void unSetCode() {
		this.code = null;
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

	public String getTitle_hindi() {
		return title_hindi;
	}

	public String getTitle_hindiEx() {
		return title_hindi != null ? title_hindi : "";
	}

	public void setTitle_hindi(String title_hindi) {
		this.title_hindi = title_hindi;
	}

	public void unSetTitle_hindi() {
		this.title_hindi = null;
	}

	public String getInstruction() {
		return instruction;
	}

	public String getInstructionEx() {
		return instruction != null ? instruction : "";
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public void unSetInstruction() {
		this.instruction = null;
	}

	public String getInstruction_hindi() {
		return instruction_hindi;
	}

	public String getInstruction_hindiEx() {
		return instruction_hindi != null ? instruction_hindi : "";
	}

	public void setInstruction_hindi(String instruction_hindi) {
		this.instruction_hindi = instruction_hindi;
	}

	public void unSetInstruction_hindi() {
		this.instruction_hindi = null;
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

	public String getCourse_id() {
		return course_id;
	}

	public String getCourse_idEx() {
		return course_id != null ? course_id : "";
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public void unSetCourse_id() {
		this.course_id = null;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getCourse_nameEx() {
		return course_name != null ? course_name : "";
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void unSetCourse_name() {
		this.course_name = null;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public String getSubject_nameEx() {
		return subject_name != null ? subject_name : "";
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public void unSetSubject_name() {
		this.subject_name = null;
	}

	public Long getTotal_questions() {
		return total_questions;
	}

	public long getTotal_questionsEx() {
		return total_questions != null ? total_questions : 0L;
	}

	public void setTotal_questions(long total_questions) {
		this.total_questions = total_questions;
	}

	public void setTotal_questions(Long total_questions) {
		this.total_questions = total_questions;
	}

	public void unSetTotal_questions() {
		this.total_questions = null;
	}

	public Double getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(Double total_marks) {
		this.total_marks = total_marks;
	}

	public void unSetTotal_marks() {
		this.total_marks = null;
	}

	public String getTest_hindi() {
		return test_hindi;
	}

	public String getTest_hindiEx() {
		return test_hindi != null ? test_hindi : "";
	}

	public void setTest_hindi(String test_hindi) {
		this.test_hindi = test_hindi;
	}

	public void unSetTest_hindi() {
		this.test_hindi = null;
	}

	public String getTest_english() {
		return test_english;
	}

	public String getTest_englishEx() {
		return test_english != null ? test_english : "";
	}

	public void setTest_english(String test_english) {
		this.test_english = test_english;
	}

	public void unSetTest_english() {
		this.test_english = null;
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