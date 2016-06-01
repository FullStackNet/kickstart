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
public abstract class Basetest_allocation_student extends BaseResource {
	private String id = null;
	private String name = null;
	private String test_allocation_id = null;
	private String test_id = null;
	private String test_name = null;
	private String test_code = null;
	private String student_id = null;
	private String student_name = null;
	private String subject_id = null;
	private String course_id = null;
	private String course_name = null;
	private String subject_name = null;
	private String allocation_type = null;
	private String immediate_result = null;
	private Long start_date = null;
	private String start_time_s = null;
	private String start_date_str = null;
	private String end_time_s = null;
	private Long end_date = null;
	private String end_date_str = null;
	private String resuffle_question = null;
	private String resuffle_option = null;
	private Double total_marks = null;
	private Double total_marks_got = null;
	private Double total_questions = null;
	private Long total_correct_answers = null;
	private String status = null;
	private String customer_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TEST_ALLOCATION_ID = "test_allocation_id";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_TEST_CODE = "test_code";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_ALLOCATION_TYPE = "allocation_type";
	public static String FIELD_IMMEDIATE_RESULT = "immediate_result";
	public static String FIELD_START_DATE = "start_date";
	public static String FIELD_START_TIME_S = "start_time_s";
	public static String FIELD_START_DATE_STR = "start_date_str";
	public static String FIELD_END_TIME_S = "end_time_s";
	public static String FIELD_END_DATE = "end_date";
	public static String FIELD_END_DATE_STR = "end_date_str";
	public static String FIELD_RESUFFLE_QUESTION = "resuffle_question";
	public static String FIELD_RESUFFLE_OPTION = "resuffle_option";
	public static String FIELD_TOTAL_MARKS = "total_marks";
	public static String FIELD_TOTAL_MARKS_GOT = "total_marks_got";
	public static String FIELD_TOTAL_QUESTIONS = "total_questions";
	public static String FIELD_TOTAL_CORRECT_ANSWERS = "total_correct_answers";
	public static String FIELD_STATUS = "status";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("test_allocation_student");

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

		Field test_allocation_idField = new Field("test_allocation_id", "String");
		test_allocation_idField.setLength(128);
		metaData.addField(test_allocation_idField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field test_nameField = new Field("test_name", "String");
		test_nameField.setLength(128);
		metaData.addField(test_nameField);

		Field test_codeField = new Field("test_code", "String");
		test_codeField.setLength(128);
		metaData.addField(test_codeField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

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

		Field allocation_typeField = new Field("allocation_type", "String");
		allocation_typeField.setLength(1);
		metaData.addField(allocation_typeField);

		Field immediate_resultField = new Field("immediate_result", "String");
		immediate_resultField.setLength(1);
		metaData.addField(immediate_resultField);

		Field start_dateField = new Field("start_date", "timestamp");
		metaData.addField(start_dateField);

		Field start_time_sField = new Field("start_time_s", "String");
		metaData.addField(start_time_sField);

		Field start_date_strField = new Field("start_date_str", "String");
		start_date_strField.setLength(32);
		metaData.addField(start_date_strField);

		Field end_time_sField = new Field("end_time_s", "String");
		metaData.addField(end_time_sField);

		Field end_dateField = new Field("end_date", "timestamp");
		metaData.addField(end_dateField);

		Field end_date_strField = new Field("end_date_str", "String");
		end_date_strField.setLength(32);
		metaData.addField(end_date_strField);

		Field resuffle_questionField = new Field("resuffle_question", "String");
		resuffle_questionField.setLength(1);
		metaData.addField(resuffle_questionField);

		Field resuffle_optionField = new Field("resuffle_option", "String");
		resuffle_optionField.setLength(1);
		metaData.addField(resuffle_optionField);

		Field total_marksField = new Field("total_marks", "double");
		metaData.addField(total_marksField);

		Field total_marks_gotField = new Field("total_marks_got", "double");
		metaData.addField(total_marks_gotField);

		Field total_questionsField = new Field("total_questions", "double");
		metaData.addField(total_questionsField);

		Field total_correct_answersField = new Field("total_correct_answers", "long");
		metaData.addField(total_correct_answersField);

		Field statusField = new Field("status", "String");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("test_allocation_student");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetest_allocation_student() {}

	public Basetest_allocation_student(Basetest_allocation_student obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.test_allocation_id = obj.test_allocation_id;
		this.test_id = obj.test_id;
		this.test_name = obj.test_name;
		this.test_code = obj.test_code;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.subject_id = obj.subject_id;
		this.course_id = obj.course_id;
		this.course_name = obj.course_name;
		this.subject_name = obj.subject_name;
		this.allocation_type = obj.allocation_type;
		this.immediate_result = obj.immediate_result;
		this.start_date = obj.start_date;
		this.start_time_s = obj.start_time_s;
		this.start_date_str = obj.start_date_str;
		this.end_time_s = obj.end_time_s;
		this.end_date = obj.end_date;
		this.end_date_str = obj.end_date_str;
		this.resuffle_question = obj.resuffle_question;
		this.resuffle_option = obj.resuffle_option;
		this.total_marks = obj.total_marks;
		this.total_marks_got = obj.total_marks_got;
		this.total_questions = obj.total_questions;
		this.total_correct_answers = obj.total_correct_answers;
		this.status = obj.status;
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
		if(name != null)
			map.put("name", name);
		if(test_allocation_id != null)
			map.put("test_allocation_id", test_allocation_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_name != null)
			map.put("test_name", test_name);
		if(test_code != null)
			map.put("test_code", test_code);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(immediate_result != null)
			map.put("immediate_result", immediate_result);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_time_s != null)
			map.put("start_time_s", start_time_s);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
		if(end_time_s != null)
			map.put("end_time_s", end_time_s);
		if(end_date != null)
			map.put("end_date", end_date);
		if(end_date_str != null)
			map.put("end_date_str", end_date_str);
		if(resuffle_question != null)
			map.put("resuffle_question", resuffle_question);
		if(resuffle_option != null)
			map.put("resuffle_option", resuffle_option);
		if(total_marks != null)
			map.put("total_marks", total_marks);
		if(total_marks_got != null)
			map.put("total_marks_got", total_marks_got);
		if(total_questions != null)
			map.put("total_questions", total_questions);
		if(total_correct_answers != null)
			map.put("total_correct_answers", total_correct_answers);
		if(status != null)
			map.put("status", status);
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
		if(name != null)
			map.put("name", name);
		if(test_allocation_id != null)
			map.put("test_allocation_id", test_allocation_id);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_name != null)
			map.put("test_name", test_name);
		if(test_code != null)
			map.put("test_code", test_code);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(immediate_result != null)
			map.put("immediate_result", immediate_result);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_time_s != null)
			map.put("start_time_s", start_time_s);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
		if(end_time_s != null)
			map.put("end_time_s", end_time_s);
		if(end_date != null)
			map.put("end_date", end_date);
		if(end_date_str != null)
			map.put("end_date_str", end_date_str);
		if(resuffle_question != null)
			map.put("resuffle_question", resuffle_question);
		if(resuffle_option != null)
			map.put("resuffle_option", resuffle_option);
		if(total_marks != null)
			map.put("total_marks", total_marks);
		if(total_marks_got != null)
			map.put("total_marks_got", total_marks_got);
		if(total_questions != null)
			map.put("total_questions", total_questions);
		if(total_correct_answers != null)
			map.put("total_correct_answers", total_correct_answers);
		if(status != null)
			map.put("status", status);
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
		name = (String) map.get("name");
		test_allocation_id = (String) map.get("test_allocation_id");
		test_id = (String) map.get("test_id");
		test_name = (String) map.get("test_name");
		test_code = (String) map.get("test_code");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		subject_id = (String) map.get("subject_id");
		course_id = (String) map.get("course_id");
		course_name = (String) map.get("course_name");
		subject_name = (String) map.get("subject_name");
		allocation_type = (String) map.get("allocation_type");
		immediate_result = (String) map.get("immediate_result");
		start_date = (Long) map.get("start_date");
		start_time_s = (String) map.get("start_time_s");
		start_date_str = (String) map.get("start_date_str");
		end_time_s = (String) map.get("end_time_s");
		end_date = (Long) map.get("end_date");
		end_date_str = (String) map.get("end_date_str");
		resuffle_question = (String) map.get("resuffle_question");
		resuffle_option = (String) map.get("resuffle_option");
		total_marks = (Double) map.get("total_marks");
		total_marks_got = (Double) map.get("total_marks_got");
		total_questions = (Double) map.get("total_questions");
		total_correct_answers = (Long) map.get("total_correct_answers");
		status = (String) map.get("status");
		customer_id = (String) map.get("customer_id");
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

		Object test_allocation_idObj = map.get("test_allocation_id");
		if(test_allocation_idObj != null)
			test_allocation_id = test_allocation_idObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object test_nameObj = map.get("test_name");
		if(test_nameObj != null)
			test_name = test_nameObj.toString();

		Object test_codeObj = map.get("test_code");
		if(test_codeObj != null)
			test_code = test_codeObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

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

		Object allocation_typeObj = map.get("allocation_type");
		if(allocation_typeObj != null)
			allocation_type = allocation_typeObj.toString();

		Object immediate_resultObj = map.get("immediate_result");
		if(immediate_resultObj != null)
			immediate_result = immediate_resultObj.toString();

		Object start_dateObj = map.get("start_date");
		if(start_dateObj != null)
			start_date = (Long) start_dateObj;

		Object start_time_sObj = map.get("start_time_s");
		if(start_time_sObj != null)
			start_time_s = start_time_sObj.toString();

		Object start_date_strObj = map.get("start_date_str");
		if(start_date_strObj != null)
			start_date_str = start_date_strObj.toString();

		Object end_time_sObj = map.get("end_time_s");
		if(end_time_sObj != null)
			end_time_s = end_time_sObj.toString();

		Object end_dateObj = map.get("end_date");
		if(end_dateObj != null)
			end_date = (Long) end_dateObj;

		Object end_date_strObj = map.get("end_date_str");
		if(end_date_strObj != null)
			end_date_str = end_date_strObj.toString();

		Object resuffle_questionObj = map.get("resuffle_question");
		if(resuffle_questionObj != null)
			resuffle_question = resuffle_questionObj.toString();

		Object resuffle_optionObj = map.get("resuffle_option");
		if(resuffle_optionObj != null)
			resuffle_option = resuffle_optionObj.toString();

		Object total_marksObj = map.get("total_marks");
		if(total_marksObj != null)
			total_marks = new Double(total_marksObj.toString());

		Object total_marks_gotObj = map.get("total_marks_got");
		if(total_marks_gotObj != null)
			total_marks_got = new Double(total_marks_gotObj.toString());

		Object total_questionsObj = map.get("total_questions");
		if(total_questionsObj != null)
			total_questions = new Double(total_questionsObj.toString());

		Object total_correct_answersObj = map.get("total_correct_answers");
		if(total_correct_answersObj != null)
			total_correct_answers = new Long(total_correct_answersObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

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

	public String getTest_allocation_id() {
		return test_allocation_id;
	}

	public String getTest_allocation_idEx() {
		return test_allocation_id != null ? test_allocation_id : "";
	}

	public void setTest_allocation_id(String test_allocation_id) {
		this.test_allocation_id = test_allocation_id;
	}

	public void unSetTest_allocation_id() {
		this.test_allocation_id = null;
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

	public String getTest_name() {
		return test_name;
	}

	public String getTest_nameEx() {
		return test_name != null ? test_name : "";
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public void unSetTest_name() {
		this.test_name = null;
	}

	public String getTest_code() {
		return test_code;
	}

	public String getTest_codeEx() {
		return test_code != null ? test_code : "";
	}

	public void setTest_code(String test_code) {
		this.test_code = test_code;
	}

	public void unSetTest_code() {
		this.test_code = null;
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

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_nameEx() {
		return student_name != null ? student_name : "";
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void unSetStudent_name() {
		this.student_name = null;
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

	public String getAllocation_type() {
		return allocation_type;
	}

	public String getAllocation_typeEx() {
		return allocation_type != null ? allocation_type : "";
	}

	public void setAllocation_type(String allocation_type) {
		this.allocation_type = allocation_type;
	}

	public void unSetAllocation_type() {
		this.allocation_type = null;
	}

	public String getImmediate_result() {
		return immediate_result;
	}

	public String getImmediate_resultEx() {
		return immediate_result != null ? immediate_result : "";
	}

	public void setImmediate_result(String immediate_result) {
		this.immediate_result = immediate_result;
	}

	public void unSetImmediate_result() {
		this.immediate_result = null;
	}

	public Long getStart_date() {
		return start_date;
	}

	public void setStart_date(Long start_date) {
		this.start_date = start_date;
	}


	public String getStart_time_s() {
		return start_time_s;
	}

	public String getStart_time_sEx() {
		return start_time_s != null ? start_time_s : "";
	}

	public void setStart_time_s(String start_time_s) {
		this.start_time_s = start_time_s;
	}

	public void unSetStart_time_s() {
		this.start_time_s = null;
	}

	public String getStart_date_str() {
		return start_date_str;
	}

	public String getStart_date_strEx() {
		return start_date_str != null ? start_date_str : "";
	}

	public void setStart_date_str(String start_date_str) {
		this.start_date_str = start_date_str;
	}

	public void unSetStart_date_str() {
		this.start_date_str = null;
	}

	public String getEnd_time_s() {
		return end_time_s;
	}

	public String getEnd_time_sEx() {
		return end_time_s != null ? end_time_s : "";
	}

	public void setEnd_time_s(String end_time_s) {
		this.end_time_s = end_time_s;
	}

	public void unSetEnd_time_s() {
		this.end_time_s = null;
	}

	public Long getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Long end_date) {
		this.end_date = end_date;
	}


	public String getEnd_date_str() {
		return end_date_str;
	}

	public String getEnd_date_strEx() {
		return end_date_str != null ? end_date_str : "";
	}

	public void setEnd_date_str(String end_date_str) {
		this.end_date_str = end_date_str;
	}

	public void unSetEnd_date_str() {
		this.end_date_str = null;
	}

	public String getResuffle_question() {
		return resuffle_question;
	}

	public String getResuffle_questionEx() {
		return resuffle_question != null ? resuffle_question : "";
	}

	public void setResuffle_question(String resuffle_question) {
		this.resuffle_question = resuffle_question;
	}

	public void unSetResuffle_question() {
		this.resuffle_question = null;
	}

	public String getResuffle_option() {
		return resuffle_option;
	}

	public String getResuffle_optionEx() {
		return resuffle_option != null ? resuffle_option : "";
	}

	public void setResuffle_option(String resuffle_option) {
		this.resuffle_option = resuffle_option;
	}

	public void unSetResuffle_option() {
		this.resuffle_option = null;
	}

	public Double getTotal_marks() {
		return total_marks;
	}

	public double getTotal_marksEx() {
		return total_marks != null ? total_marks : 0;
	}

	public void setTotal_marks(double total_marks) {
		this.total_marks = total_marks;
	}

	public void setTotal_marks(Double total_marks) {
		this.total_marks = total_marks;
	}

	public void unSetTotal_marks() {
		this.total_marks = null;
	}

	public Double getTotal_marks_got() {
		return total_marks_got;
	}

	public double getTotal_marks_gotEx() {
		return total_marks_got != null ? total_marks_got : 0;
	}

	public void setTotal_marks_got(double total_marks_got) {
		this.total_marks_got = total_marks_got;
	}

	public void setTotal_marks_got(Double total_marks_got) {
		this.total_marks_got = total_marks_got;
	}

	public void unSetTotal_marks_got() {
		this.total_marks_got = null;
	}

	public Double getTotal_questions() {
		return total_questions;
	}

	public double getTotal_questionsEx() {
		return total_questions != null ? total_questions : 0;
	}

	public void setTotal_questions(double total_questions) {
		this.total_questions = total_questions;
	}

	public void setTotal_questions(Double total_questions) {
		this.total_questions = total_questions;
	}

	public void unSetTotal_questions() {
		this.total_questions = null;
	}

	public Long getTotal_correct_answers() {
		return total_correct_answers;
	}

	public long getTotal_correct_answersEx() {
		return total_correct_answers != null ? total_correct_answers : 0L;
	}

	public void setTotal_correct_answers(long total_correct_answers) {
		this.total_correct_answers = total_correct_answers;
	}

	public void setTotal_correct_answers(Long total_correct_answers) {
		this.total_correct_answers = total_correct_answers;
	}

	public void unSetTotal_correct_answers() {
		this.total_correct_answers = null;
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