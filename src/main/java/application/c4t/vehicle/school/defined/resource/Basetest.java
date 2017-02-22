/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basetest extends BaseResource {
	private String id = null;
	private String code = null;
	private String available_for_sale = null;
	private String free = null;
	private String free_centre_student = null;
	private Long allowed_attempts = null;
	private String context_enabled = null;
	private Double price = null;
	private Double discount = null;
	private Long duration = null;
	private Long total_time_in_min = null;
	private String title = null;
	private String title_hindi = null;
	private String instruction = null;
	private String instruction_hindi = null;
	private String subject_id = null;
	private String course_id = null;
	private String course_name = null;
	private String provider_id = null;
	private String provider_name = null;
	private String user_id = null;
	private String user_name = null;
	private String subject_name = null;
	private Long total_questions = null;
	private Double total_marks = null;
	private String test_hindi = null;
	private String test_english = null;
	private Double positive_mark = null;
	private Double negative_mark = null;
	private String customer_id = null;
	private Long last_update_time = null;
	private Long total_student_allocations = null;
	private Long total_student_attempted = null;
	private Long start_date = null;
	private String start_time_s = null;
	private String start_date_str = null;
	private String end_time_s = null;
	private Long end_date = null;
	private String end_date_str = null;
	private String immediate_result = null;
	private Long result_date = null;
	private String result_date_s = null;
	private String result_time_s = null;
	private Long highest_marks = null;
	private Long average_marks = null;
	private Long total_test_marks = null;
	private Long average_duration = null;
	private Long min_duration = null;
	private String multi_choice = null;
	private String published = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CODE = "code";
	public static String FIELD_AVAILABLE_FOR_SALE = "available_for_sale";
	public static String FIELD_FREE = "free";
	public static String FIELD_FREE_CENTRE_STUDENT = "free_centre_student";
	public static String FIELD_ALLOWED_ATTEMPTS = "allowed_attempts";
	public static String FIELD_CONTEXT_ENABLED = "context_enabled";
	public static String FIELD_PRICE = "price";
	public static String FIELD_DISCOUNT = "discount";
	public static String FIELD_DURATION = "duration";
	public static String FIELD_TOTAL_TIME_IN_MIN = "total_time_in_min";
	public static String FIELD_TITLE = "title";
	public static String FIELD_TITLE_HINDI = "title_hindi";
	public static String FIELD_INSTRUCTION = "instruction";
	public static String FIELD_INSTRUCTION_HINDI = "instruction_hindi";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_PROVIDER_ID = "provider_id";
	public static String FIELD_PROVIDER_NAME = "provider_name";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_TOTAL_QUESTIONS = "total_questions";
	public static String FIELD_TOTAL_MARKS = "total_marks";
	public static String FIELD_TEST_HINDI = "test_hindi";
	public static String FIELD_TEST_ENGLISH = "test_english";
	public static String FIELD_POSITIVE_MARK = "positive_mark";
	public static String FIELD_NEGATIVE_MARK = "negative_mark";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_TOTAL_STUDENT_ALLOCATIONS = "total_student_allocations";
	public static String FIELD_TOTAL_STUDENT_ATTEMPTED = "total_student_attempted";
	public static String FIELD_START_DATE = "start_date";
	public static String FIELD_START_TIME_S = "start_time_s";
	public static String FIELD_START_DATE_STR = "start_date_str";
	public static String FIELD_END_TIME_S = "end_time_s";
	public static String FIELD_END_DATE = "end_date";
	public static String FIELD_END_DATE_STR = "end_date_str";
	public static String FIELD_IMMEDIATE_RESULT = "immediate_result";
	public static String FIELD_RESULT_DATE = "result_date";
	public static String FIELD_RESULT_DATE_S = "result_date_s";
	public static String FIELD_RESULT_TIME_S = "result_time_s";
	public static String FIELD_HIGHEST_MARKS = "highest_marks";
	public static String FIELD_AVERAGE_MARKS = "average_marks";
	public static String FIELD_TOTAL_TEST_MARKS = "total_test_marks";
	public static String FIELD_AVERAGE_DURATION = "average_duration";
	public static String FIELD_MIN_DURATION = "min_duration";
	public static String FIELD_MULTI_CHOICE = "multi_choice";
	public static String FIELD_PUBLISHED = "published";
	public static String FIELD_CREATION_TIME = "creation_time";
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

		Field available_for_saleField = new Field("available_for_sale", "String");
		metaData.addField(available_for_saleField);

		Field freeField = new Field("free", "String");
		freeField.setLength(1);
		metaData.addField(freeField);

		Field free_centre_studentField = new Field("free_centre_student", "String");
		free_centre_studentField.setLength(1);
		metaData.addField(free_centre_studentField);

		Field allowed_attemptsField = new Field("allowed_attempts", "long");
		metaData.addField(allowed_attemptsField);

		Field context_enabledField = new Field("context_enabled", "String");
		context_enabledField.setLength(1);
		metaData.addField(context_enabledField);

		Field priceField = new Field("price", "double");
		metaData.addField(priceField);

		Field discountField = new Field("discount", "double");
		metaData.addField(discountField);

		Field durationField = new Field("duration", "long");
		metaData.addField(durationField);

		Field total_time_in_minField = new Field("total_time_in_min", "long");
		metaData.addField(total_time_in_minField);

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

		Field provider_idField = new Field("provider_id", "String");
		provider_idField.setLength(128);
		metaData.addField(provider_idField);

		Field provider_nameField = new Field("provider_name", "String");
		provider_nameField.setLength(128);
		metaData.addField(provider_nameField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

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

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field total_student_allocationsField = new Field("total_student_allocations", "long");
		metaData.addField(total_student_allocationsField);

		Field total_student_attemptedField = new Field("total_student_attempted", "long");
		metaData.addField(total_student_attemptedField);

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

		Field immediate_resultField = new Field("immediate_result", "String");
		immediate_resultField.setLength(1);
		metaData.addField(immediate_resultField);

		Field result_dateField = new Field("result_date", "timestamp");
		metaData.addField(result_dateField);

		Field result_date_sField = new Field("result_date_s", "String");
		metaData.addField(result_date_sField);

		Field result_time_sField = new Field("result_time_s", "String");
		metaData.addField(result_time_sField);

		Field highest_marksField = new Field("highest_marks", "long");
		metaData.addField(highest_marksField);

		Field average_marksField = new Field("average_marks", "long");
		metaData.addField(average_marksField);

		Field total_test_marksField = new Field("total_test_marks", "long");
		metaData.addField(total_test_marksField);

		Field average_durationField = new Field("average_duration", "long");
		metaData.addField(average_durationField);

		Field min_durationField = new Field("min_duration", "long");
		metaData.addField(min_durationField);

		Field multi_choiceField = new Field("multi_choice", "String");
		multi_choiceField.setLength(1);
		metaData.addField(multi_choiceField);

		Field publishedField = new Field("published", "String");
		publishedField.setLength(1);
		metaData.addField(publishedField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

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
		this.available_for_sale = obj.available_for_sale;
		this.free = obj.free;
		this.free_centre_student = obj.free_centre_student;
		this.allowed_attempts = obj.allowed_attempts;
		this.context_enabled = obj.context_enabled;
		this.price = obj.price;
		this.discount = obj.discount;
		this.duration = obj.duration;
		this.total_time_in_min = obj.total_time_in_min;
		this.title = obj.title;
		this.title_hindi = obj.title_hindi;
		this.instruction = obj.instruction;
		this.instruction_hindi = obj.instruction_hindi;
		this.subject_id = obj.subject_id;
		this.course_id = obj.course_id;
		this.course_name = obj.course_name;
		this.provider_id = obj.provider_id;
		this.provider_name = obj.provider_name;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.subject_name = obj.subject_name;
		this.total_questions = obj.total_questions;
		this.total_marks = obj.total_marks;
		this.test_hindi = obj.test_hindi;
		this.test_english = obj.test_english;
		this.positive_mark = obj.positive_mark;
		this.negative_mark = obj.negative_mark;
		this.customer_id = obj.customer_id;
		this.last_update_time = obj.last_update_time;
		this.total_student_allocations = obj.total_student_allocations;
		this.total_student_attempted = obj.total_student_attempted;
		this.start_date = obj.start_date;
		this.start_time_s = obj.start_time_s;
		this.start_date_str = obj.start_date_str;
		this.end_time_s = obj.end_time_s;
		this.end_date = obj.end_date;
		this.end_date_str = obj.end_date_str;
		this.immediate_result = obj.immediate_result;
		this.result_date = obj.result_date;
		this.result_date_s = obj.result_date_s;
		this.result_time_s = obj.result_time_s;
		this.highest_marks = obj.highest_marks;
		this.average_marks = obj.average_marks;
		this.total_test_marks = obj.total_test_marks;
		this.average_duration = obj.average_duration;
		this.min_duration = obj.min_duration;
		this.multi_choice = obj.multi_choice;
		this.published = obj.published;
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
		if(code != null)
			map.put("code", code);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(free != null)
			map.put("free", free);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if (context_enabled != null)
			map.put("context_enabled", context_enabled);
		if(price != null)
			map.put("price", price);
		if(discount != null)
			map.put("discount", discount);
		if(duration != null)
			map.put("duration", duration);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
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
		if(provider_id != null)
			map.put("provider_id", provider_id);
		if(provider_name != null)
			map.put("provider_name", provider_name);
		if (user_id != null)
			map.put("user_id", user_id);
		if (user_name != null)
			map.put("user_name", user_name);
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
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(total_student_allocations != null)
			map.put("total_student_allocations", total_student_allocations);
		if(total_student_attempted != null)
			map.put("total_student_attempted", total_student_attempted);
		if (start_date != null)
			map.put("start_date", start_date);
		if (start_time_s != null)
			map.put("start_time_s", start_time_s);
		if (start_date_str != null)
			map.put("start_date_str", start_date_str);
		if (end_time_s != null)
			map.put("end_time_s", end_time_s);
		if (end_date != null)
			map.put("end_date", end_date);
		if (end_date_str != null)
			map.put("end_date_str", end_date_str);
		if (immediate_result != null)
			map.put("immediate_result", immediate_result);
		if (result_date != null)
			map.put("result_date", result_date);
		if (result_date_s != null)
			map.put("result_date_s", result_date_s);
		if (result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(highest_marks != null)
			map.put("highest_marks", highest_marks);
		if(average_marks != null)
			map.put("average_marks", average_marks);
		if(total_test_marks != null)
			map.put("total_test_marks", total_test_marks);
		if(average_duration != null)
			map.put("average_duration", average_duration);
		if(min_duration != null)
			map.put("min_duration", min_duration);
		if(multi_choice != null)
			map.put("multi_choice", multi_choice);
		if(published != null)
			map.put("published", published);
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
		if(code != null)
			map.put("code", code);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(free != null)
			map.put("free", free);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if (context_enabled != null)
			map.put("context_enabled", context_enabled);
		if(price != null)
			map.put("price", price);
		if(discount != null)
			map.put("discount", discount);
		if(duration != null)
			map.put("duration", duration);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
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
		if(provider_id != null)
			map.put("provider_id", provider_id);
		if(provider_name != null)
			map.put("provider_name", provider_name);
		if (user_id != null)
			map.put("user_id", user_id);
		if (user_name != null)
			map.put("user_name", user_name);
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
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(total_student_allocations != null)
			map.put("total_student_allocations", total_student_allocations);
		if(total_student_attempted != null)
			map.put("total_student_attempted", total_student_attempted);
		if (start_date != null)
			map.put("start_date", start_date);
		if (start_time_s != null)
			map.put("start_time_s", start_time_s);
		if (start_date_str != null)
			map.put("start_date_str", start_date_str);
		if (end_time_s != null)
			map.put("end_time_s", end_time_s);
		if (end_date != null)
			map.put("end_date", end_date);
		if (end_date_str != null)
			map.put("end_date_str", end_date_str);
		if (immediate_result != null)
			map.put("immediate_result", immediate_result);
		if (result_date != null)
			map.put("result_date", result_date);
		if (result_date_s != null)
			map.put("result_date_s", result_date_s);
		if (result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(highest_marks != null)
			map.put("highest_marks", highest_marks);
		if(average_marks != null)
			map.put("average_marks", average_marks);
		if(total_test_marks != null)
			map.put("total_test_marks", total_test_marks);
		if(average_duration != null)
			map.put("average_duration", average_duration);
		if(min_duration != null)
			map.put("min_duration", min_duration);
		if(multi_choice != null)
			map.put("multi_choice", multi_choice);
		if(published != null)
			map.put("published", published);
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
		code = (String) map.get("code");
		available_for_sale = (String) map.get("available_for_sale");
		free = (String) map.get("free");
		free_centre_student = (String) map.get("free_centre_student");
		allowed_attempts = (Long) map.get("allowed_attempts");
		context_enabled = (String) map.get("context_enabled");
		price = (Double) map.get("price");
		discount = (Double) map.get("discount");
		duration = (Long) map.get("duration");
		total_time_in_min = (Long) map.get("total_time_in_min");
		title = (String) map.get("title");
		title_hindi = (String) map.get("title_hindi");
		instruction = (String) map.get("instruction");
		instruction_hindi = (String) map.get("instruction_hindi");
		subject_id = (String) map.get("subject_id");
		course_id = (String) map.get("course_id");
		course_name = (String) map.get("course_name");
		provider_id = (String) map.get("provider_id");
		provider_name = (String) map.get("provider_name");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		subject_name = (String) map.get("subject_name");
		total_questions = (Long) map.get("total_questions");
		total_marks = (Double) map.get("total_marks");
		test_hindi = (String) map.get("test_hindi");
		test_english = (String) map.get("test_english");
		positive_mark = (Double) map.get("positive_mark");
		negative_mark = (Double) map.get("negative_mark");
		customer_id = (String) map.get("customer_id");
		last_update_time = (Long) map.get("last_update_time");
		total_student_allocations = (Long) map.get("total_student_allocations");
		total_student_attempted = (Long) map.get("total_student_attempted");
		start_date = (Long) map.get("start_date");
		start_time_s = (String) map.get("start_time_s");
		start_date_str = (String) map.get("start_date_str");
		end_time_s = (String) map.get("end_time_s");
		end_date = (Long) map.get("end_date");
		end_date_str = (String) map.get("end_date_str");
		immediate_result = (String) map.get("immediate_result");
		result_date = (Long) map.get("result_date");
		result_date_s = (String) map.get("result_date_s");
		result_time_s = (String) map.get("result_time_s");
		highest_marks = (Long) map.get("highest_marks");
		average_marks = (Long) map.get("average_marks");
		total_test_marks = (Long) map.get("total_test_marks");
		average_duration = (Long) map.get("average_duration");
		min_duration = (Long) map.get("min_duration");
		multi_choice = (String) map.get("multi_choice");
		published = (String) map.get("published");
		creation_time = (Long) map.get("creation_time");
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

		Object available_for_saleObj = map.get("available_for_sale");
		if(available_for_saleObj != null)
			available_for_sale = available_for_saleObj.toString();

		Object freeObj = map.get("free");
		if(freeObj != null)
			free = freeObj.toString();

		Object free_centre_studentObj = map.get("free_centre_student");
		if(free_centre_studentObj != null)
			free_centre_student = free_centre_studentObj.toString();

		Object allowed_attemptsObj = map.get("allowed_attempts");
		if(allowed_attemptsObj != null)
			allowed_attempts = new Long(allowed_attemptsObj.toString());

		Object context_enabledObj = map.get("context_enabled");
		if (context_enabledObj != null)
			context_enabled = context_enabledObj.toString();

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

		Object provider_idObj = map.get("provider_id");
		if(provider_idObj != null)
			provider_id = provider_idObj.toString();

		Object provider_nameObj = map.get("provider_name");
		if(provider_nameObj != null)
			provider_name = provider_nameObj.toString();

		Object user_idObj = map.get("user_id");
		if (user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if (user_nameObj != null)
			user_name = user_nameObj.toString();

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

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

		Object total_student_allocationsObj = map.get("total_student_allocations");
		if(total_student_allocationsObj != null)
			total_student_allocations = new Long(total_student_allocationsObj.toString());

		Object total_student_attemptedObj = map.get("total_student_attempted");
		if(total_student_attemptedObj != null)
			total_student_attempted = new Long(total_student_attemptedObj.toString());

		Object start_dateObj = map.get("start_date");
		if (start_dateObj != null)
			start_date = new Long(start_dateObj.toString());

		Object start_time_sObj = map.get("start_time_s");
		if (start_time_sObj != null)
			start_time_s = start_time_sObj.toString();

		Object start_date_strObj = map.get("start_date_str");
		if (start_date_strObj != null)
			start_date_str = start_date_strObj.toString();

		Object end_time_sObj = map.get("end_time_s");
		if (end_time_sObj != null)
			end_time_s = end_time_sObj.toString();

		Object end_dateObj = map.get("end_date");
		if (end_dateObj != null)
			end_date = new Long(end_dateObj.toString());

		Object end_date_strObj = map.get("end_date_str");
		if (end_date_strObj != null)
			end_date_str = end_date_strObj.toString();

		Object immediate_resultObj = map.get("immediate_result");
		if (immediate_resultObj != null)
			immediate_result = immediate_resultObj.toString();

		Object result_dateObj = map.get("result_date");
		if (result_dateObj != null)
			result_date = new Long(result_dateObj.toString());

		Object result_date_sObj = map.get("result_date_s");
		if (result_date_sObj != null)
			result_date_s = result_date_sObj.toString();

		Object result_time_sObj = map.get("result_time_s");
		if (result_time_sObj != null)
			result_time_s = result_time_sObj.toString();

		Object highest_marksObj = map.get("highest_marks");
		if(highest_marksObj != null)
			highest_marks = new Long(highest_marksObj.toString());

		Object average_marksObj = map.get("average_marks");
		if(average_marksObj != null)
			average_marks = new Long(average_marksObj.toString());

		Object total_test_marksObj = map.get("total_test_marks");
		if(total_test_marksObj != null)
			total_test_marks = new Long(total_test_marksObj.toString());

		Object average_durationObj = map.get("average_duration");
		if(average_durationObj != null)
			average_duration = new Long(average_durationObj.toString());

		Object min_durationObj = map.get("min_duration");
		if(min_durationObj != null)
			min_duration = new Long(min_durationObj.toString());

		Object multi_choiceObj = map.get("multi_choice");
		if(multi_choiceObj != null)
			multi_choice = multi_choiceObj.toString();

		Object publishedObj = map.get("published");
		if(publishedObj != null)
			published = publishedObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public String getContext_enabled() {
		return context_enabled;
	}

	public String getContext_enabledEx() {
		return context_enabled != null ? context_enabled : "";
	}

	public void setContext_enabled(String context_enabled) {
		this.context_enabled = context_enabled;
	}

	public void unSetContext_enabled() {
		this.context_enabled = null;
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

	public String getProvider_id() {
		return provider_id;
	}

	public String getProvider_idEx() {
		return provider_id != null ? provider_id : "";
	}

	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}

	public void unSetProvider_id() {
		this.provider_id = null;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public String getProvider_nameEx() {
		return provider_name != null ? provider_name : "";
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public void unSetProvider_name() {
		this.provider_name = null;
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

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
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

	public Long getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}


	public Long getTotal_student_allocations() {
		return total_student_allocations;
	}

	public long getTotal_student_allocationsEx() {
		return total_student_allocations != null ? total_student_allocations : 0L;
	}

	public void setTotal_student_allocations(long total_student_allocations) {
		this.total_student_allocations = total_student_allocations;
	}

	public void setTotal_student_allocations(Long total_student_allocations) {
		this.total_student_allocations = total_student_allocations;
	}

	public void unSetTotal_student_allocations() {
		this.total_student_allocations = null;
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

	public Long getTotal_test_marks() {
		return total_test_marks;
	}

	public long getTotal_test_marksEx() {
		return total_test_marks != null ? total_test_marks : 0L;
	}

	public void setTotal_test_marks(long total_test_marks) {
		this.total_test_marks = total_test_marks;
	}

	public void setTotal_test_marks(Long total_test_marks) {
		this.total_test_marks = total_test_marks;
	}

	public void unSetTotal_test_marks() {
		this.total_test_marks = null;
	}

	public Long getAverage_duration() {
		return average_duration;
	}

	public long getAverage_durationEx() {
		return average_duration != null ? average_duration : 0L;
	}

	public void setAverage_duration(long average_duration) {
		this.average_duration = average_duration;
	}

	public void setAverage_duration(Long average_duration) {
		this.average_duration = average_duration;
	}

	public void unSetAverage_duration() {
		this.average_duration = null;
	}

	public Long getMin_duration() {
		return min_duration;
	}

	public long getMin_durationEx() {
		return min_duration != null ? min_duration : 0L;
	}

	public void setMin_duration(long min_duration) {
		this.min_duration = min_duration;
	}

	public void setMin_duration(Long min_duration) {
		this.min_duration = min_duration;
	}

	public void unSetMin_duration() {
		this.min_duration = null;
	}

	public String getMulti_choice() {
		return multi_choice;
	}

	public String getMulti_choiceEx() {
		return multi_choice != null ? multi_choice : "";
	}

	public void setMulti_choice(String multi_choice) {
		this.multi_choice = multi_choice;
	}

	public void unSetMulti_choice() {
		this.multi_choice = null;
	}

	public String getPublished() {
		return published;
	}

	public String getPublishedEx() {
		return published != null ? published : "";
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public void unSetPublished() {
		this.published = null;
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