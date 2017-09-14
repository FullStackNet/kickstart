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
public abstract class Basetest_allocation extends BaseResource {
	private String id = null;
	private String allocation_type = null;
	private String teacher_id = null;
	private String multi_choice = null;
	private String teacher_name = null;
	private String test_id = null;
	private String test_name = null;
	private String test_code = null;
	private String subject_id = null;
	private String subject_name = null;
	private String course_id = null;
	private String batch_id = null;
	private String batch_name = null;
	private String course_name = null;
	private String duplicate_allocation = null;
	private Long start_date = null;
	private String start_time_s = null;
	private String start_date_str = null;
	private String end_time_s = null;
	private Long end_date = null;
	private String end_date_str = null;
	private String resuffle_question = null;
	private String test_hindi = null;
	private String test_english = null;
	private String resuffle_option = null;
	private String immediate_result = null;
	private String allocate_again = null;
	private Long result_date = null;
	private String result_date_s = null;
	private String result_time_s = null;
	private Long total_time_in_min = null;
	private String allocated = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_ALLOCATION_TYPE = "allocation_type";
	public static String FIELD_TEACHER_ID = "teacher_id";
	public static String FIELD_MULTI_CHOICE = "multi_choice";
	public static String FIELD_TEACHER_NAME = "teacher_name";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_TEST_CODE = "test_code";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_DUPLICATE_ALLOCATION = "duplicate_allocation";
	public static String FIELD_START_DATE = "start_date";
	public static String FIELD_START_TIME_S = "start_time_s";
	public static String FIELD_START_DATE_STR = "start_date_str";
	public static String FIELD_END_TIME_S = "end_time_s";
	public static String FIELD_END_DATE = "end_date";
	public static String FIELD_END_DATE_STR = "end_date_str";
	public static String FIELD_RESUFFLE_QUESTION = "resuffle_question";
	public static String FIELD_TEST_HINDI = "test_hindi";
	public static String FIELD_TEST_ENGLISH = "test_english";
	public static String FIELD_RESUFFLE_OPTION = "resuffle_option";
	public static String FIELD_IMMEDIATE_RESULT = "immediate_result";
	public static String FIELD_ALLOCATE_AGAIN = "allocate_again";
	public static String FIELD_RESULT_DATE = "result_date";
	public static String FIELD_RESULT_DATE_S = "result_date_s";
	public static String FIELD_RESULT_TIME_S = "result_time_s";
	public static String FIELD_TOTAL_TIME_IN_MIN = "total_time_in_min";
	public static String FIELD_ALLOCATED = "allocated";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("test_allocation");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field allocation_typeField = new Field("allocation_type", "String");
		allocation_typeField.setLength(128);
		metaData.addField(allocation_typeField);

		Field teacher_idField = new Field("teacher_id", "String");
		teacher_idField.setLength(128);
		metaData.addField(teacher_idField);

		Field multi_choiceField = new Field("multi_choice", "String");
		multi_choiceField.setLength(1);
		metaData.addField(multi_choiceField);

		Field teacher_nameField = new Field("teacher_name", "String");
		teacher_nameField.setLength(128);
		metaData.addField(teacher_nameField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field test_nameField = new Field("test_name", "String");
		test_nameField.setLength(128);
		metaData.addField(test_nameField);

		Field test_codeField = new Field("test_code", "String");
		test_codeField.setLength(128);
		metaData.addField(test_codeField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field subject_nameField = new Field("subject_name", "String");
		subject_nameField.setLength(128);
		metaData.addField(subject_nameField);

		Field course_idField = new Field("course_id", "String");
		course_idField.setLength(128);
		metaData.addField(course_idField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setLength(128);
		metaData.addField(batch_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setLength(128);
		metaData.addField(batch_nameField);

		Field course_nameField = new Field("course_name", "String");
		course_nameField.setLength(128);
		metaData.addField(course_nameField);

		Field duplicate_allocationField = new Field("duplicate_allocation", "String");
		metaData.addField(duplicate_allocationField);

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

		Field test_hindiField = new Field("test_hindi", "String");
		test_hindiField.setLength(128);
		metaData.addField(test_hindiField);

		Field test_englishField = new Field("test_english", "String");
		test_englishField.setLength(128);
		metaData.addField(test_englishField);

		Field resuffle_optionField = new Field("resuffle_option", "String");
		resuffle_optionField.setLength(1);
		metaData.addField(resuffle_optionField);

		Field immediate_resultField = new Field("immediate_result", "String");
		immediate_resultField.setLength(1);
		metaData.addField(immediate_resultField);

		Field allocate_againField = new Field("allocate_again", "String");
		allocate_againField.setLength(1);
		metaData.addField(allocate_againField);

		Field result_dateField = new Field("result_date", "timestamp");
		metaData.addField(result_dateField);

		Field result_date_sField = new Field("result_date_s", "String");
		metaData.addField(result_date_sField);

		Field result_time_sField = new Field("result_time_s", "String");
		metaData.addField(result_time_sField);

		Field total_time_in_minField = new Field("total_time_in_min", "long");
		metaData.addField(total_time_in_minField);

		Field allocatedField = new Field("allocated", "String");
		allocatedField.setLength(1);
		metaData.addField(allocatedField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("test_allocation");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetest_allocation() {}

	public Basetest_allocation(Basetest_allocation obj) {
		this.id = obj.id;
		this.allocation_type = obj.allocation_type;
		this.teacher_id = obj.teacher_id;
		this.multi_choice = obj.multi_choice;
		this.teacher_name = obj.teacher_name;
		this.test_id = obj.test_id;
		this.test_name = obj.test_name;
		this.test_code = obj.test_code;
		this.subject_id = obj.subject_id;
		this.subject_name = obj.subject_name;
		this.course_id = obj.course_id;
		this.batch_id = obj.batch_id;
		this.batch_name = obj.batch_name;
		this.course_name = obj.course_name;
		this.duplicate_allocation = obj.duplicate_allocation;
		this.start_date = obj.start_date;
		this.start_time_s = obj.start_time_s;
		this.start_date_str = obj.start_date_str;
		this.end_time_s = obj.end_time_s;
		this.end_date = obj.end_date;
		this.end_date_str = obj.end_date_str;
		this.resuffle_question = obj.resuffle_question;
		this.test_hindi = obj.test_hindi;
		this.test_english = obj.test_english;
		this.resuffle_option = obj.resuffle_option;
		this.immediate_result = obj.immediate_result;
		this.allocate_again = obj.allocate_again;
		this.result_date = obj.result_date;
		this.result_date_s = obj.result_date_s;
		this.result_time_s = obj.result_time_s;
		this.total_time_in_min = obj.total_time_in_min;
		this.allocated = obj.allocated;
		this.customer_id = obj.customer_id;
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
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(multi_choice != null)
			map.put("multi_choice", multi_choice);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_name != null)
			map.put("test_name", test_name);
		if(test_code != null)
			map.put("test_code", test_code);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(course_name != null)
			map.put("course_name", course_name);
		if(duplicate_allocation != null)
			map.put("duplicate_allocation", duplicate_allocation);
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
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(resuffle_option != null)
			map.put("resuffle_option", resuffle_option);
		if(immediate_result != null)
			map.put("immediate_result", immediate_result);
		if(allocate_again != null)
			map.put("allocate_again", allocate_again);
		if(result_date != null)
			map.put("result_date", result_date);
		if(result_date_s != null)
			map.put("result_date_s", result_date_s);
		if(result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
		if(allocated != null)
			map.put("allocated", allocated);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(allocation_type != null)
			map.put("allocation_type", allocation_type);
		if(teacher_id != null)
			map.put("teacher_id", teacher_id);
		if(multi_choice != null)
			map.put("multi_choice", multi_choice);
		if(teacher_name != null)
			map.put("teacher_name", teacher_name);
		if(test_id != null)
			map.put("test_id", test_id);
		if(test_name != null)
			map.put("test_name", test_name);
		if(test_code != null)
			map.put("test_code", test_code);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(course_id != null)
			map.put("course_id", course_id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(course_name != null)
			map.put("course_name", course_name);
		if(duplicate_allocation != null)
			map.put("duplicate_allocation", duplicate_allocation);
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
		if(test_hindi != null)
			map.put("test_hindi", test_hindi);
		if(test_english != null)
			map.put("test_english", test_english);
		if(resuffle_option != null)
			map.put("resuffle_option", resuffle_option);
		if(immediate_result != null)
			map.put("immediate_result", immediate_result);
		if(allocate_again != null)
			map.put("allocate_again", allocate_again);
		if(result_date != null)
			map.put("result_date", result_date);
		if(result_date_s != null)
			map.put("result_date_s", result_date_s);
		if(result_time_s != null)
			map.put("result_time_s", result_time_s);
		if(total_time_in_min != null)
			map.put("total_time_in_min", total_time_in_min);
		if(allocated != null)
			map.put("allocated", allocated);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		allocation_type = (String) map.get("allocation_type");
		teacher_id = (String) map.get("teacher_id");
		multi_choice = (String) map.get("multi_choice");
		teacher_name = (String) map.get("teacher_name");
		test_id = (String) map.get("test_id");
		test_name = (String) map.get("test_name");
		test_code = (String) map.get("test_code");
		subject_id = (String) map.get("subject_id");
		subject_name = (String) map.get("subject_name");
		course_id = (String) map.get("course_id");
		batch_id = (String) map.get("batch_id");
		batch_name = (String) map.get("batch_name");
		course_name = (String) map.get("course_name");
		duplicate_allocation = (String) map.get("duplicate_allocation");
		start_date = (Long) map.get("start_date");
		start_time_s = (String) map.get("start_time_s");
		start_date_str = (String) map.get("start_date_str");
		end_time_s = (String) map.get("end_time_s");
		end_date = (Long) map.get("end_date");
		end_date_str = (String) map.get("end_date_str");
		resuffle_question = (String) map.get("resuffle_question");
		test_hindi = (String) map.get("test_hindi");
		test_english = (String) map.get("test_english");
		resuffle_option = (String) map.get("resuffle_option");
		immediate_result = (String) map.get("immediate_result");
		allocate_again = (String) map.get("allocate_again");
		result_date = (Long) map.get("result_date");
		result_date_s = (String) map.get("result_date_s");
		result_time_s = (String) map.get("result_time_s");
		total_time_in_min = (Long) map.get("total_time_in_min");
		allocated = (String) map.get("allocated");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object allocation_typeObj = map.get("allocation_type");
		if(allocation_typeObj != null)
			allocation_type = allocation_typeObj.toString();

		Object teacher_idObj = map.get("teacher_id");
		if(teacher_idObj != null)
			teacher_id = teacher_idObj.toString();

		Object multi_choiceObj = map.get("multi_choice");
		if(multi_choiceObj != null)
			multi_choice = multi_choiceObj.toString();

		Object teacher_nameObj = map.get("teacher_name");
		if(teacher_nameObj != null)
			teacher_name = teacher_nameObj.toString();

		Object test_idObj = map.get("test_id");
		if(test_idObj != null)
			test_id = test_idObj.toString();

		Object test_nameObj = map.get("test_name");
		if(test_nameObj != null)
			test_name = test_nameObj.toString();

		Object test_codeObj = map.get("test_code");
		if(test_codeObj != null)
			test_code = test_codeObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object subject_nameObj = map.get("subject_name");
		if(subject_nameObj != null)
			subject_name = subject_nameObj.toString();

		Object course_idObj = map.get("course_id");
		if(course_idObj != null)
			course_id = course_idObj.toString();

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object course_nameObj = map.get("course_name");
		if(course_nameObj != null)
			course_name = course_nameObj.toString();

		Object duplicate_allocationObj = map.get("duplicate_allocation");
		if(duplicate_allocationObj != null)
			duplicate_allocation = duplicate_allocationObj.toString();

		Object start_dateObj = map.get("start_date");
		if(start_dateObj != null)
			start_date = new Long(start_dateObj.toString());

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
			end_date = new Long(end_dateObj.toString());

		Object end_date_strObj = map.get("end_date_str");
		if(end_date_strObj != null)
			end_date_str = end_date_strObj.toString();

		Object resuffle_questionObj = map.get("resuffle_question");
		if(resuffle_questionObj != null)
			resuffle_question = resuffle_questionObj.toString();

		Object test_hindiObj = map.get("test_hindi");
		if(test_hindiObj != null)
			test_hindi = test_hindiObj.toString();

		Object test_englishObj = map.get("test_english");
		if(test_englishObj != null)
			test_english = test_englishObj.toString();

		Object resuffle_optionObj = map.get("resuffle_option");
		if(resuffle_optionObj != null)
			resuffle_option = resuffle_optionObj.toString();

		Object immediate_resultObj = map.get("immediate_result");
		if(immediate_resultObj != null)
			immediate_result = immediate_resultObj.toString();

		Object allocate_againObj = map.get("allocate_again");
		if(allocate_againObj != null)
			allocate_again = allocate_againObj.toString();

		Object result_dateObj = map.get("result_date");
		if(result_dateObj != null)
			result_date = new Long(result_dateObj.toString());

		Object result_date_sObj = map.get("result_date_s");
		if(result_date_sObj != null)
			result_date_s = result_date_sObj.toString();

		Object result_time_sObj = map.get("result_time_s");
		if(result_time_sObj != null)
			result_time_s = result_time_sObj.toString();

		Object total_time_in_minObj = map.get("total_time_in_min");
		if(total_time_in_minObj != null)
			total_time_in_min = new Long(total_time_in_minObj.toString());

		Object allocatedObj = map.get("allocated");
		if(allocatedObj != null)
			allocated = allocatedObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public String getBatch_id() {
		return batch_id;
	}

	public String getBatch_idEx() {
		return batch_id != null ? batch_id : "";
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public void unSetBatch_id() {
		this.batch_id = null;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String getBatch_nameEx() {
		return batch_name != null ? batch_name : "";
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public void unSetBatch_name() {
		this.batch_name = null;
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

	public String getDuplicate_allocation() {
		return duplicate_allocation;
	}

	public String getDuplicate_allocationEx() {
		return duplicate_allocation != null ? duplicate_allocation : "";
	}

	public void setDuplicate_allocation(String duplicate_allocation) {
		this.duplicate_allocation = duplicate_allocation;
	}

	public void unSetDuplicate_allocation() {
		this.duplicate_allocation = null;
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

	public String getAllocate_again() {
		return allocate_again;
	}

	public String getAllocate_againEx() {
		return allocate_again != null ? allocate_again : "";
	}

	public void setAllocate_again(String allocate_again) {
		this.allocate_again = allocate_again;
	}

	public void unSetAllocate_again() {
		this.allocate_again = null;
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

	public String getAllocated() {
		return allocated;
	}

	public String getAllocatedEx() {
		return allocated != null ? allocated : "";
	}

	public void setAllocated(String allocated) {
		this.allocated = allocated;
	}

	public void unSetAllocated() {
		this.allocated = null;
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