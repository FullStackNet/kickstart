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
	private String teacher_id = null;
	private String teacher_name = null;
	private String test_allocation_id = null;
	private String test_id = null;
	private String test_name = null;
	private String test_code = null;
	private String student_id = null;
	private String school_id = null;
	private String student_name = null;
	private String student_mobile_no = null;
	private String student_email_id = null;
	private String subject_id = null;
	private String test_hindi = null;
	private String test_english = null;
	private String available_for_sale = null;
	private String paid = null;
	private String free = null;
	private String type = null;
	private String test_group_id = null;
	private String free_centre_student = null;
	private Long allowed_attempts = null;
	private Double price = null;
	private Double discount = null;
	private Long duration = null;
	private Long total_time_in_min = null;
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
	private Long attempted_date = null;
	private String attempted_date_str = null;
	private String resuffle_question = null;
	private String resuffle_option = null;
	private Double total_marks = null;
	private Double total_marks_got = null;
	private Double total_questions = null;
	private Integer rank = null;
	private Long total_correct_answers = null;
	private Long total_wrong_answers = null;
	private Long total_not_attended = null;
	private String status = null;
	private String show_result = null;
	private Long result_date = null;
	private String result_date_s = null;
	private String result_time_s = null;
	private String customer_id = null;
	private Long total_student_attempted = null;
	private Long highest_marks = null;
	private Long average_marks = null;
	private Long last_update_time = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TEACHER_ID = "teacher_id";
	public static String FIELD_TEACHER_NAME = "teacher_name";
	public static String FIELD_TEST_ALLOCATION_ID = "test_allocation_id";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_TEST_CODE = "test_code";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_STUDENT_MOBILE_NO = "student_mobile_no";
	public static String FIELD_STUDENT_EMAIL_ID = "student_email_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_TEST_HINDI = "test_hindi";
	public static String FIELD_TEST_ENGLISH = "test_english";
	public static String FIELD_AVAILABLE_FOR_SALE = "available_for_sale";
	public static String FIELD_PAID = "paid";
	public static String FIELD_FREE = "free";
	public static String FIELD_TYPE = "type";
	public static String FIELD_TEST_GROUP_ID = "test_group_id";
	public static String FIELD_FREE_CENTRE_STUDENT = "free_centre_student";
	public static String FIELD_ALLOWED_ATTEMPTS = "allowed_attempts";
	public static String FIELD_PRICE = "price";
	public static String FIELD_DISCOUNT = "discount";
	public static String FIELD_DURATION = "duration";
	public static String FIELD_TOTAL_TIME_IN_MIN = "total_time_in_min";
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
	public static String FIELD_ATTEMPTED_DATE = "attempted_date";
	public static String FIELD_ATTEMPTED_DATE_STR = "attempted_date_str";
	public static String FIELD_RESUFFLE_QUESTION = "resuffle_question";
	public static String FIELD_RESUFFLE_OPTION = "resuffle_option";
	public static String FIELD_TOTAL_MARKS = "total_marks";
	public static String FIELD_TOTAL_MARKS_GOT = "total_marks_got";
	public static String FIELD_TOTAL_QUESTIONS = "total_questions";
	public static String FIELD_RANK = "rank";
	public static String FIELD_TOTAL_CORRECT_ANSWERS = "total_correct_answers";
	public static String FIELD_TOTAL_WRONG_ANSWERS = "total_wrong_answers";
	public static String FIELD_TOTAL_NOT_ATTENDED = "total_not_attended";
	public static String FIELD_STATUS = "status";
	public static String FIELD_SHOW_RESULT = "show_result";
	public static String FIELD_RESULT_DATE = "result_date";
	public static String FIELD_RESULT_DATE_S = "result_date_s";
	public static String FIELD_RESULT_TIME_S = "result_time_s";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_TOTAL_STUDENT_ATTEMPTED = "total_student_attempted";
	public static String FIELD_HIGHEST_MARKS = "highest_marks";
	public static String FIELD_AVERAGE_MARKS = "average_marks";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_CREATION_TIME = "creation_time";
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

		Field teacher_idField = new Field("teacher_id", "String");
		teacher_idField.setLength(128);
		metaData.addField(teacher_idField);

		Field teacher_nameField = new Field("teacher_name", "String");
		teacher_nameField.setLength(128);
		metaData.addField(teacher_nameField);

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

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field student_mobile_noField = new Field("student_mobile_no", "String");
		student_mobile_noField.setLength(128);
		metaData.addField(student_mobile_noField);

		Field student_email_idField = new Field("student_email_id", "String");
		student_email_idField.setLength(128);
		metaData.addField(student_email_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field test_hindiField = new Field("test_hindi", "String");
		test_hindiField.setLength(128);
		metaData.addField(test_hindiField);

		Field test_englishField = new Field("test_english", "String");
		test_englishField.setLength(128);
		metaData.addField(test_englishField);

		Field available_for_saleField = new Field("available_for_sale", "String");
		metaData.addField(available_for_saleField);

		Field paidField = new Field("paid", "String");
		paidField.setLength(1);
		metaData.addField(paidField);

		Field freeField = new Field("free", "String");
		freeField.setLength(1);
		metaData.addField(freeField);

		Field typeField = new Field("type", "String");
		typeField.setLength(1);
		metaData.addField(typeField);

		Field test_group_idField = new Field("test_group_id", "String");
		test_group_idField.setLength(1);
		metaData.addField(test_group_idField);

		Field free_centre_studentField = new Field("free_centre_student", "String");
		free_centre_studentField.setLength(1);
		metaData.addField(free_centre_studentField);

		Field allowed_attemptsField = new Field("allowed_attempts", "long");
		metaData.addField(allowed_attemptsField);

		Field priceField = new Field("price", "double");
		metaData.addField(priceField);

		Field discountField = new Field("discount", "double");
		metaData.addField(discountField);

		Field durationField = new Field("duration", "long");
		metaData.addField(durationField);

		Field total_time_in_minField = new Field("total_time_in_min", "long");
		metaData.addField(total_time_in_minField);

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

		Field attempted_dateField = new Field("attempted_date", "timestamp");
		metaData.addField(attempted_dateField);

		Field attempted_date_strField = new Field("attempted_date_str", "String");
		attempted_date_strField.setLength(32);
		metaData.addField(attempted_date_strField);

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

		Field rankField = new Field("rank", "int");
		metaData.addField(rankField);

		Field total_correct_answersField = new Field("total_correct_answers", "long");
		metaData.addField(total_correct_answersField);

		Field total_wrong_answersField = new Field("total_wrong_answers", "long");
		metaData.addField(total_wrong_answersField);

		Field total_not_attendedField = new Field("total_not_attended", "long");
		metaData.addField(total_not_attendedField);

		Field statusField = new Field("status", "String");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field show_resultField = new Field("show_result", "String");
		show_resultField.setLength(1);
		metaData.addField(show_resultField);

		Field result_dateField = new Field("result_date", "timestamp");
		metaData.addField(result_dateField);

		Field result_date_sField = new Field("result_date_s", "String");
		metaData.addField(result_date_sField);

		Field result_time_sField = new Field("result_time_s", "String");
		metaData.addField(result_time_sField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field total_student_attemptedField = new Field("total_student_attempted", "long");
		metaData.addField(total_student_attemptedField);

		Field highest_marksField = new Field("highest_marks", "long");
		metaData.addField(highest_marksField);

		Field average_marksField = new Field("average_marks", "long");
		metaData.addField(average_marksField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

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
		this.teacher_id = obj.teacher_id;
		this.teacher_name = obj.teacher_name;
		this.test_allocation_id = obj.test_allocation_id;
		this.test_id = obj.test_id;
		this.test_name = obj.test_name;
		this.test_code = obj.test_code;
		this.student_id = obj.student_id;
		this.school_id = obj.school_id;
		this.student_name = obj.student_name;
		this.student_mobile_no = obj.student_mobile_no;
		this.student_email_id = obj.student_email_id;
		this.subject_id = obj.subject_id;
		this.test_hindi = obj.test_hindi;
		this.test_english = obj.test_english;
		this.available_for_sale = obj.available_for_sale;
		this.paid = obj.paid;
		this.free = obj.free;
		this.type = obj.type;
		this.test_group_id = obj.test_group_id;
		this.free_centre_student = obj.free_centre_student;
		this.allowed_attempts = obj.allowed_attempts;
		this.price = obj.price;
		this.discount = obj.discount;
		this.duration = obj.duration;
		this.total_time_in_min = obj.total_time_in_min;
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
		this.attempted_date = obj.attempted_date;
		this.attempted_date_str = obj.attempted_date_str;
		this.resuffle_question = obj.resuffle_question;
		this.resuffle_option = obj.resuffle_option;
		this.total_marks = obj.total_marks;
		this.total_marks_got = obj.total_marks_got;
		this.total_questions = obj.total_questions;
		this.rank = obj.rank;
		this.total_correct_answers = obj.total_correct_answers;
		this.total_wrong_answers = obj.total_wrong_answers;
		this.total_not_attended = obj.total_not_attended;
		this.status = obj.status;
		this.show_result = obj.show_result;
		this.result_date = obj.result_date;
		this.result_date_s = obj.result_date_s;
		this.result_time_s = obj.result_time_s;
		this.customer_id = obj.customer_id;
		this.total_student_attempted = obj.total_student_attempted;
		this.highest_marks = obj.highest_marks;
		this.average_marks = obj.average_marks;
		this.last_update_time = obj.last_update_time;
		this.creation_time = obj.creation_time;
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
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(student_mobile_no != null)
			map.put("student_mobile_no", student_mobile_no);
		if(student_email_id != null)
			map.put("student_email_id", student_email_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(paid != null)
			map.put("paid", paid);
		if(free != null)
			map.put("free", free);
		if(type != null)
			map.put("type", type);
		if(test_group_id != null)
			map.put("test_group_id", test_group_id);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if(price != null)
			map.put("price", price);
		if(discount != null)
			map.put("discount", discount);
		if(duration != null)
			map.put("duration", duration);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
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
		if(attempted_date != null)
			map.put("attempted_date", attempted_date);
		if(attempted_date_str != null)
			map.put("attempted_date_str", attempted_date_str);
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
		if(rank != null)
			map.put("rank", rank);
		if(total_correct_answers != null)
			map.put("total_correct_answers", total_correct_answers);
		if(total_wrong_answers != null)
			map.put("total_wrong_answers", total_wrong_answers);
		if(total_not_attended != null)
			map.put("total_not_attended", total_not_attended);
		if(status != null)
			map.put("status", status);
		if(show_result != null)
			map.put("show_result", show_result);
		if(result_date != null)
			map.put("result_date", result_date);
		if(result_date_s != null)
			map.put("result_date_s", result_date_s);
		if(result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(total_student_attempted != null)
			map.put("total_student_attempted", total_student_attempted);
		if(highest_marks != null)
			map.put("highest_marks", highest_marks);
		if(average_marks != null)
			map.put("average_marks", average_marks);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(student_mobile_no != null)
			map.put("student_mobile_no", student_mobile_no);
		if(student_email_id != null)
			map.put("student_email_id", student_email_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(paid != null)
			map.put("paid", paid);
		if(free != null)
			map.put("free", free);
		if(type != null)
			map.put("type", type);
		if(test_group_id != null)
			map.put("test_group_id", test_group_id);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if(price != null)
			map.put("price", price);
		if(discount != null)
			map.put("discount", discount);
		if(duration != null)
			map.put("duration", duration);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
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
		if(attempted_date != null)
			map.put("attempted_date", attempted_date);
		if(attempted_date_str != null)
			map.put("attempted_date_str", attempted_date_str);
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
		if(rank != null)
			map.put("rank", rank);
		if(total_correct_answers != null)
			map.put("total_correct_answers", total_correct_answers);
		if(total_wrong_answers != null)
			map.put("total_wrong_answers", total_wrong_answers);
		if(total_not_attended != null)
			map.put("total_not_attended", total_not_attended);
		if(status != null)
			map.put("status", status);
		if(show_result != null)
			map.put("show_result", show_result);
		if(result_date != null)
			map.put("result_date", result_date);
		if(result_date_s != null)
			map.put("result_date_s", result_date_s);
		if(result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(total_student_attempted != null)
			map.put("total_student_attempted", total_student_attempted);
		if(highest_marks != null)
			map.put("highest_marks", highest_marks);
		if(average_marks != null)
			map.put("average_marks", average_marks);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		teacher_id = (String) map.get("teacher_id");
		teacher_name = (String) map.get("teacher_name");
		test_allocation_id = (String) map.get("test_allocation_id");
		test_id = (String) map.get("test_id");
		test_name = (String) map.get("test_name");
		test_code = (String) map.get("test_code");
		student_id = (String) map.get("student_id");
		school_id = (String) map.get("school_id");
		student_name = (String) map.get("student_name");
		student_mobile_no = (String) map.get("student_mobile_no");
		student_email_id = (String) map.get("student_email_id");
		subject_id = (String) map.get("subject_id");
		test_hindi = (String) map.get("test_hindi");
		test_english = (String) map.get("test_english");
		available_for_sale = (String) map.get("available_for_sale");
		paid = (String) map.get("paid");
		free = (String) map.get("free");
		type = (String) map.get("type");
		test_group_id = (String) map.get("test_group_id");
		free_centre_student = (String) map.get("free_centre_student");
		allowed_attempts = (Long) map.get("allowed_attempts");
		price = (Double) map.get("price");
		discount = (Double) map.get("discount");
		duration = (Long) map.get("duration");
		total_time_in_min = (Long) map.get("total_time_in_min");
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
		attempted_date = (Long) map.get("attempted_date");
		attempted_date_str = (String) map.get("attempted_date_str");
		resuffle_question = (String) map.get("resuffle_question");
		resuffle_option = (String) map.get("resuffle_option");
		total_marks = (Double) map.get("total_marks");
		total_marks_got = (Double) map.get("total_marks_got");
		total_questions = (Double) map.get("total_questions");
		rank = (Integer) map.get("rank");
		total_correct_answers = (Long) map.get("total_correct_answers");
		total_wrong_answers = (Long) map.get("total_wrong_answers");
		total_not_attended = (Long) map.get("total_not_attended");
		status = (String) map.get("status");
		show_result = (String) map.get("show_result");
		result_date = (Long) map.get("result_date");
		result_date_s = (String) map.get("result_date_s");
		result_time_s = (String) map.get("result_time_s");
		customer_id = (String) map.get("customer_id");
		total_student_attempted = (Long) map.get("total_student_attempted");
		highest_marks = (Long) map.get("highest_marks");
		average_marks = (Long) map.get("average_marks");
		last_update_time = (Long) map.get("last_update_time");
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

		Object teacher_idObj = map.get("teacher_id");
		if(teacher_idObj != null)
			teacher_id = teacher_idObj.toString();

		Object teacher_nameObj = map.get("teacher_name");
		if(teacher_nameObj != null)
			teacher_name = teacher_nameObj.toString();

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

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object student_mobile_noObj = map.get("student_mobile_no");
		if(student_mobile_noObj != null)
			student_mobile_no = student_mobile_noObj.toString();

		Object student_email_idObj = map.get("student_email_id");
		if(student_email_idObj != null)
			student_email_id = student_email_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object test_hindiObj = map.get("test_hindi");
		if(test_hindiObj != null)
			test_hindi = test_hindiObj.toString();

		Object test_englishObj = map.get("test_english");
		if(test_englishObj != null)
			test_english = test_englishObj.toString();

		Object available_for_saleObj = map.get("available_for_sale");
		if(available_for_saleObj != null)
			available_for_sale = available_for_saleObj.toString();

		Object paidObj = map.get("paid");
		if(paidObj != null)
			paid = paidObj.toString();

		Object freeObj = map.get("free");
		if(freeObj != null)
			free = freeObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object test_group_idObj = map.get("test_group_id");
		if(test_group_idObj != null)
			test_group_id = test_group_idObj.toString();

		Object free_centre_studentObj = map.get("free_centre_student");
		if(free_centre_studentObj != null)
			free_centre_student = free_centre_studentObj.toString();

		Object allowed_attemptsObj = map.get("allowed_attempts");
		if(allowed_attemptsObj != null)
			allowed_attempts = new Long(allowed_attemptsObj.toString());

		Object priceObj = map.get("price");
		if(priceObj != null)
			price = new Double(priceObj.toString());

		Object discountObj = map.get("discount");
		if(discountObj != null)
			discount = new Double(discountObj.toString());

		Object durationObj = map.get("duration");
		if(durationObj != null)
			duration = new Long(durationObj.toString());

		Object total_time_in_minObj = map.get("total_time_in_min");
		if(total_time_in_minObj != null)
			total_time_in_min = new Long(total_time_in_minObj.toString());

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

		Object attempted_dateObj = map.get("attempted_date");
		if(attempted_dateObj != null)
			attempted_date = (Long) attempted_dateObj;

		Object attempted_date_strObj = map.get("attempted_date_str");
		if(attempted_date_strObj != null)
			attempted_date_str = attempted_date_strObj.toString();

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

		Object rankObj = map.get("rank");
		if(rankObj != null)
			rank = new Integer(rankObj.toString());

		Object total_correct_answersObj = map.get("total_correct_answers");
		if(total_correct_answersObj != null)
			total_correct_answers = new Long(total_correct_answersObj.toString());

		Object total_wrong_answersObj = map.get("total_wrong_answers");
		if(total_wrong_answersObj != null)
			total_wrong_answers = new Long(total_wrong_answersObj.toString());

		Object total_not_attendedObj = map.get("total_not_attended");
		if(total_not_attendedObj != null)
			total_not_attended = new Long(total_not_attendedObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object show_resultObj = map.get("show_result");
		if(show_resultObj != null)
			show_result = show_resultObj.toString();

		Object result_dateObj = map.get("result_date");
		if(result_dateObj != null)
			result_date = (Long) result_dateObj;

		Object result_date_sObj = map.get("result_date_s");
		if(result_date_sObj != null)
			result_date_s = result_date_sObj.toString();

		Object result_time_sObj = map.get("result_time_s");
		if(result_time_sObj != null)
			result_time_s = result_time_sObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object total_student_attemptedObj = map.get("total_student_attempted");
		if(total_student_attemptedObj != null)
			total_student_attempted = new Long(total_student_attemptedObj.toString());

		Object highest_marksObj = map.get("highest_marks");
		if(highest_marksObj != null)
			highest_marks = new Long(highest_marksObj.toString());

		Object average_marksObj = map.get("average_marks");
		if(average_marksObj != null)
			average_marks = new Long(average_marksObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = (Long) last_update_timeObj;

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

	public String getTeacher_id() {
		return teacher_id;
	}

	public String getTeacher_idEx() {
		return teacher_id != null ? teacher_id : "";
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void unSetTeacher_id() {
		this.teacher_id = null;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public String getTeacher_nameEx() {
		return teacher_name != null ? teacher_name : "";
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void unSetTeacher_name() {
		this.teacher_name = null;
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

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
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

	public String getStudent_mobile_no() {
		return student_mobile_no;
	}

	public String getStudent_mobile_noEx() {
		return student_mobile_no != null ? student_mobile_no : "";
	}

	public void setStudent_mobile_no(String student_mobile_no) {
		this.student_mobile_no = student_mobile_no;
	}

	public void unSetStudent_mobile_no() {
		this.student_mobile_no = null;
	}

	public String getStudent_email_id() {
		return student_email_id;
	}

	public String getStudent_email_idEx() {
		return student_email_id != null ? student_email_id : "";
	}

	public void setStudent_email_id(String student_email_id) {
		this.student_email_id = student_email_id;
	}

	public void unSetStudent_email_id() {
		this.student_email_id = null;
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

	public String getAvailable_for_sale() {
		return available_for_sale;
	}

	public String getAvailable_for_saleEx() {
		return available_for_sale != null ? available_for_sale : "";
	}

	public void setAvailable_for_sale(String available_for_sale) {
		this.available_for_sale = available_for_sale;
	}

	public void unSetAvailable_for_sale() {
		this.available_for_sale = null;
	}

	public String getPaid() {
		return paid;
	}

	public String getPaidEx() {
		return paid != null ? paid : "";
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public void unSetPaid() {
		this.paid = null;
	}

	public String getFree() {
		return free;
	}

	public String getFreeEx() {
		return free != null ? free : "";
	}

	public void setFree(String free) {
		this.free = free;
	}

	public void unSetFree() {
		this.free = null;
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

	public String getTest_group_id() {
		return test_group_id;
	}

	public String getTest_group_idEx() {
		return test_group_id != null ? test_group_id : "";
	}

	public void setTest_group_id(String test_group_id) {
		this.test_group_id = test_group_id;
	}

	public void unSetTest_group_id() {
		this.test_group_id = null;
	}

	public String getFree_centre_student() {
		return free_centre_student;
	}

	public String getFree_centre_studentEx() {
		return free_centre_student != null ? free_centre_student : "";
	}

	public void setFree_centre_student(String free_centre_student) {
		this.free_centre_student = free_centre_student;
	}

	public void unSetFree_centre_student() {
		this.free_centre_student = null;
	}

	public Long getAllowed_attempts() {
		return allowed_attempts;
	}

	public long getAllowed_attemptsEx() {
		return allowed_attempts != null ? allowed_attempts : 0L;
	}

	public void setAllowed_attempts(long allowed_attempts) {
		this.allowed_attempts = allowed_attempts;
	}

	public void setAllowed_attempts(Long allowed_attempts) {
		this.allowed_attempts = allowed_attempts;
	}

	public void unSetAllowed_attempts() {
		this.allowed_attempts = null;
	}

	public Double getPrice() {
		return price;
	}

	public double getPriceEx() {
		return price != null ? price : 0;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void unSetPrice() {
		this.price = null;
	}

	public Double getDiscount() {
		return discount;
	}

	public double getDiscountEx() {
		return discount != null ? discount : 0;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public void unSetDiscount() {
		this.discount = null;
	}

	public Long getDuration() {
		return duration;
	}

	public long getDurationEx() {
		return duration != null ? duration : 0L;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public void unSetDuration() {
		this.duration = null;
	}

	public Long getTotal_time_in_min() {
		return total_time_in_min;
	}

	public long getTotal_time_in_minEx() {
		return total_time_in_min != null ? total_time_in_min : 0L;
	}

	public void setTotal_time_in_min(long total_time_in_min) {
		this.total_time_in_min = total_time_in_min;
	}

	public void setTotal_time_in_min(Long total_time_in_min) {
		this.total_time_in_min = total_time_in_min;
	}

	public void unSetTotal_time_in_min() {
		this.total_time_in_min = null;
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

	public Long getAttempted_date() {
		return attempted_date;
	}

	public void setAttempted_date(Long attempted_date) {
		this.attempted_date = attempted_date;
	}


	public String getAttempted_date_str() {
		return attempted_date_str;
	}

	public String getAttempted_date_strEx() {
		return attempted_date_str != null ? attempted_date_str : "";
	}

	public void setAttempted_date_str(String attempted_date_str) {
		this.attempted_date_str = attempted_date_str;
	}

	public void unSetAttempted_date_str() {
		this.attempted_date_str = null;
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

	public Integer getRank() {
		return rank;
	}

	public int getRankEx() {
		return rank != null ? rank : 0;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public void unSetRank() {
		this.rank = null;
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

	public Long getTotal_wrong_answers() {
		return total_wrong_answers;
	}

	public long getTotal_wrong_answersEx() {
		return total_wrong_answers != null ? total_wrong_answers : 0L;
	}

	public void setTotal_wrong_answers(long total_wrong_answers) {
		this.total_wrong_answers = total_wrong_answers;
	}

	public void setTotal_wrong_answers(Long total_wrong_answers) {
		this.total_wrong_answers = total_wrong_answers;
	}

	public void unSetTotal_wrong_answers() {
		this.total_wrong_answers = null;
	}

	public Long getTotal_not_attended() {
		return total_not_attended;
	}

	public long getTotal_not_attendedEx() {
		return total_not_attended != null ? total_not_attended : 0L;
	}

	public void setTotal_not_attended(long total_not_attended) {
		this.total_not_attended = total_not_attended;
	}

	public void setTotal_not_attended(Long total_not_attended) {
		this.total_not_attended = total_not_attended;
	}

	public void unSetTotal_not_attended() {
		this.total_not_attended = null;
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

	public String getShow_result() {
		return show_result;
	}

	public String getShow_resultEx() {
		return show_result != null ? show_result : "";
	}

	public void setShow_result(String show_result) {
		this.show_result = show_result;
	}

	public void unSetShow_result() {
		this.show_result = null;
	}

	public Long getResult_date() {
		return result_date;
	}

	public void setResult_date(Long result_date) {
		this.result_date = result_date;
	}


	public String getResult_date_s() {
		return result_date_s;
	}

	public String getResult_date_sEx() {
		return result_date_s != null ? result_date_s : "";
	}

	public void setResult_date_s(String result_date_s) {
		this.result_date_s = result_date_s;
	}

	public void unSetResult_date_s() {
		this.result_date_s = null;
	}

	public String getResult_time_s() {
		return result_time_s;
	}

	public String getResult_time_sEx() {
		return result_time_s != null ? result_time_s : "";
	}

	public void setResult_time_s(String result_time_s) {
		this.result_time_s = result_time_s;
	}

	public void unSetResult_time_s() {
		this.result_time_s = null;
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

	public Long getTotal_student_attempted() {
		return total_student_attempted;
	}

	public long getTotal_student_attemptedEx() {
		return total_student_attempted != null ? total_student_attempted : 0L;
	}

	public void setTotal_student_attempted(long total_student_attempted) {
		this.total_student_attempted = total_student_attempted;
	}

	public void setTotal_student_attempted(Long total_student_attempted) {
		this.total_student_attempted = total_student_attempted;
	}

	public void unSetTotal_student_attempted() {
		this.total_student_attempted = null;
	}

	public Long getHighest_marks() {
		return highest_marks;
	}

	public long getHighest_marksEx() {
		return highest_marks != null ? highest_marks : 0L;
	}

	public void setHighest_marks(long highest_marks) {
		this.highest_marks = highest_marks;
	}

	public void setHighest_marks(Long highest_marks) {
		this.highest_marks = highest_marks;
	}

	public void unSetHighest_marks() {
		this.highest_marks = null;
	}

	public Long getAverage_marks() {
		return average_marks;
	}

	public long getAverage_marksEx() {
		return average_marks != null ? average_marks : 0L;
	}

	public void setAverage_marks(long average_marks) {
		this.average_marks = average_marks;
	}

	public void setAverage_marks(Long average_marks) {
		this.average_marks = average_marks;
	}

	public void unSetAverage_marks() {
		this.average_marks = null;
	}

	public Long getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}