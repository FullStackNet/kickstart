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
public abstract class Basetest_group extends BaseResource {
	private String id = null;
	private String name = null;
	private String free = null;
	private String free_centre_student = null;
	private String available_for_sale = null;
	private Double price = null;
	private Long allowed_attempts = null;
	private Long total_tests = null;
	private List<String> tests = null;
	private String subject_id = null;
	private String course_id = null;
	private String course_name = null;
	private String subject_name = null;
	private String customer_id = null;
	private Long last_update_time = null;
	private String published = null;
	private String provider_id = null;
	private String provider_name = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_FREE = "free";
	public static String FIELD_FREE_CENTRE_STUDENT = "free_centre_student";
	public static String FIELD_AVAILABLE_FOR_SALE = "available_for_sale";
	public static String FIELD_PRICE = "price";
	public static String FIELD_ALLOWED_ATTEMPTS = "allowed_attempts";
	public static String FIELD_TOTAL_TESTS = "total_tests";
	public static String FIELD_TESTS = "tests";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_COURSE_ID = "course_id";
	public static String FIELD_COURSE_NAME = "course_name";
	public static String FIELD_SUBJECT_NAME = "subject_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_PUBLISHED = "published";
	public static String FIELD_PROVIDER_ID = "provider_id";
	public static String FIELD_PROVIDER_NAME = "provider_name";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("test_group");

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

		Field freeField = new Field("free", "String");
		freeField.setLength(1);
		metaData.addField(freeField);

		Field free_centre_studentField = new Field("free_centre_student", "String");
		free_centre_studentField.setLength(1);
		metaData.addField(free_centre_studentField);

		Field available_for_saleField = new Field("available_for_sale", "String");
		metaData.addField(available_for_saleField);

		Field priceField = new Field("price", "double");
		metaData.addField(priceField);

		Field allowed_attemptsField = new Field("allowed_attempts", "long");
		metaData.addField(allowed_attemptsField);

		Field total_testsField = new Field("total_tests", "long");
		metaData.addField(total_testsField);

		Field testsField = new Field("tests", "Array");
		metaData.addField(testsField);

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

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field publishedField = new Field("published", "String");
		publishedField.setLength(1);
		metaData.addField(publishedField);

		Field provider_idField = new Field("provider_id", "String");
		provider_idField.setLength(128);
		metaData.addField(provider_idField);

		Field provider_nameField = new Field("provider_name", "String");
		provider_nameField.setLength(128);
		metaData.addField(provider_nameField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("test_group");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetest_group() {}

	public Basetest_group(Basetest_group obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.free = obj.free;
		this.free_centre_student = obj.free_centre_student;
		this.available_for_sale = obj.available_for_sale;
		this.price = obj.price;
		this.allowed_attempts = obj.allowed_attempts;
		this.total_tests = obj.total_tests;
		this.tests = obj.tests;
		this.subject_id = obj.subject_id;
		this.course_id = obj.course_id;
		this.course_name = obj.course_name;
		this.subject_name = obj.subject_name;
		this.customer_id = obj.customer_id;
		this.last_update_time = obj.last_update_time;
		this.published = obj.published;
		this.provider_id = obj.provider_id;
		this.provider_name = obj.provider_name;
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
		if(free != null)
			map.put("free", free);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(price != null)
			map.put("price", price);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if(total_tests != null)
			map.put("total_tests", total_tests);
		if(tests != null)
			map.put("tests", tests);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(published != null)
			map.put("published", published);
		if(provider_id != null)
			map.put("provider_id", provider_id);
		if(provider_name != null)
			map.put("provider_name", provider_name);
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
		if(free != null)
			map.put("free", free);
		if(free_centre_student != null)
			map.put("free_centre_student", free_centre_student);
		if(available_for_sale != null)
			map.put("available_for_sale", available_for_sale);
		if(price != null)
			map.put("price", price);
		if(allowed_attempts != null)
			map.put("allowed_attempts", allowed_attempts);
		if(total_tests != null)
			map.put("total_tests", total_tests);
		if(tests != null)
			map.put("tests", tests);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(course_id != null)
			map.put("course_id", course_id);
		if(course_name != null)
			map.put("course_name", course_name);
		if(subject_name != null)
			map.put("subject_name", subject_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(published != null)
			map.put("published", published);
		if(provider_id != null)
			map.put("provider_id", provider_id);
		if(provider_name != null)
			map.put("provider_name", provider_name);
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
		free = (String) map.get("free");
		free_centre_student = (String) map.get("free_centre_student");
		available_for_sale = (String) map.get("available_for_sale");
		price = (Double) map.get("price");
		allowed_attempts = (Long) map.get("allowed_attempts");
		total_tests = (Long) map.get("total_tests");
		tests = (List<String>) map.get("tests");
		subject_id = (String) map.get("subject_id");
		course_id = (String) map.get("course_id");
		course_name = (String) map.get("course_name");
		subject_name = (String) map.get("subject_name");
		customer_id = (String) map.get("customer_id");
		last_update_time = (Long) map.get("last_update_time");
		published = (String) map.get("published");
		provider_id = (String) map.get("provider_id");
		provider_name = (String) map.get("provider_name");
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

		Object freeObj = map.get("free");
		if(freeObj != null)
			free = freeObj.toString();

		Object free_centre_studentObj = map.get("free_centre_student");
		if(free_centre_studentObj != null)
			free_centre_student = free_centre_studentObj.toString();

		Object available_for_saleObj = map.get("available_for_sale");
		if(available_for_saleObj != null)
			available_for_sale = available_for_saleObj.toString();

		Object priceObj = map.get("price");
		if(priceObj != null)
			price = new Double(priceObj.toString());

		Object allowed_attemptsObj = map.get("allowed_attempts");
		if(allowed_attemptsObj != null)
			allowed_attempts = new Long(allowed_attemptsObj.toString());

		Object total_testsObj = map.get("total_tests");
		if(total_testsObj != null)
			total_tests = new Long(total_testsObj.toString());

		tests = (List<String>) map.get("tests");
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

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

		Object publishedObj = map.get("published");
		if(publishedObj != null)
			published = publishedObj.toString();

		Object provider_idObj = map.get("provider_id");
		if(provider_idObj != null)
			provider_id = provider_idObj.toString();

		Object provider_nameObj = map.get("provider_name");
		if(provider_nameObj != null)
			provider_name = provider_nameObj.toString();

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

	public Long getTotal_tests() {
		return total_tests;
	}

	public long getTotal_testsEx() {
		return total_tests != null ? total_tests : 0L;
	}

	public void setTotal_tests(long total_tests) {
		this.total_tests = total_tests;
	}

	public void setTotal_tests(Long total_tests) {
		this.total_tests = total_tests;
	}

	public void unSetTotal_tests() {
		this.total_tests = null;
	}

	public List<String> getTests() {
		return tests;
	}


	public void setTests(List<String> tests) {
		this.tests = tests;
	}

	public void addTests(String value) {
		if(tests == null)
			tests = new ArrayList<String>();
		tests.add(value);
	}

	public void unSetTests() {
		this.tests = null;
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