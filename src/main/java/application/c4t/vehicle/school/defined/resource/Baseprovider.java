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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseprovider extends BaseResource {
	private String id = null;
	private String name = null;
	private String logo_url = null;
	private String email_id = null;
	private String mobile_no = null;
	private String brand_name = null;
	private String courses_summary = null;
	private List<String> courses = null;
	private String customer_id = null;
	private Double percentage = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_LOGO_URL = "logo_url";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_BRAND_NAME = "brand_name";
	public static String FIELD_COURSES_SUMMARY = "courses_summary";
	public static String FIELD_COURSES = "courses";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_PERCENTAGE = "percentage";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("provider");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(32);
		metaData.addField(nameField);

		Field logo_urlField = new Field("logo_url", "String");
		logo_urlField.setLength(32);
		metaData.addField(logo_urlField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(32);
		metaData.addField(email_idField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(32);
		metaData.addField(mobile_noField);

		Field brand_nameField = new Field("brand_name", "String");
		brand_nameField.setLength(32);
		metaData.addField(brand_nameField);

		Field courses_summaryField = new Field("courses_summary", "String");
		courses_summaryField.setLength(128);
		metaData.addField(courses_summaryField);

		Field coursesField = new Field("courses", "Array");
		metaData.addField(coursesField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field percentageField = new Field("percentage", "Double");
		metaData.addField(percentageField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("provider");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseprovider() {}

	public Baseprovider(Baseprovider obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.logo_url = obj.logo_url;
		this.email_id = obj.email_id;
		this.mobile_no = obj.mobile_no;
		this.brand_name = obj.brand_name;
		this.courses_summary = obj.courses_summary;
		this.courses = obj.courses;
		this.customer_id = obj.customer_id;
		this.percentage = obj.percentage;
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
		if (logo_url != null)
			map.put("logo_url", logo_url);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if (courses_summary != null)
			map.put("courses_summary", courses_summary);
		if (courses != null)
			map.put("courses", courses);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if (percentage != null)
			map.put("percentage", percentage);
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
		if (logo_url != null)
			map.put("logo_url", logo_url);
		if(email_id != null)
			map.put("email_id", email_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(brand_name != null)
			map.put("brand_name", brand_name);
		if (courses_summary != null)
			map.put("courses_summary", courses_summary);
		if (courses != null)
			map.put("courses", courses);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if (percentage != null)
			map.put("percentage", percentage);
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
		logo_url = (String) map.get("logo_url");
		email_id = (String) map.get("email_id");
		mobile_no = (String) map.get("mobile_no");
		brand_name = (String) map.get("brand_name");
		courses_summary = (String) map.get("courses_summary");
		courses = (List<String>) map.get("courses");
		customer_id = (String) map.get("customer_id");
		percentage = (Double) map.get("percentage");
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

		Object logo_urlObj = map.get("logo_url");
		if (logo_urlObj != null)
			logo_url = logo_urlObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object brand_nameObj = map.get("brand_name");
		if(brand_nameObj != null)
			brand_name = brand_nameObj.toString();

		Object courses_summaryObj = map.get("courses_summary");
		if (courses_summaryObj != null)
			courses_summary = courses_summaryObj.toString();

		courses = (List<String>) map.get("courses");
		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object percentageObj = map.get("percentage");
		if (percentageObj != null)
			percentage = new Double(percentageObj.toString());

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

	public String getLogo_url() {
		return logo_url;
	}

	public String getLogo_urlEx() {
		return logo_url != null ? logo_url : "";
	}

	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}

	public void unSetLogo_url() {
		this.logo_url = null;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getEmail_idEx() {
		return email_id != null ? email_id : "";
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void unSetEmail_id() {
		this.email_id = null;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public String getBrand_nameEx() {
		return brand_name != null ? brand_name : "";
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public void unSetBrand_name() {
		this.brand_name = null;
	}

	public String getCourses_summary() {
		return courses_summary;
	}

	public String getCourses_summaryEx() {
		return courses_summary != null ? courses_summary : "";
	}

	public void setCourses_summary(String courses_summary) {
		this.courses_summary = courses_summary;
	}

	public void unSetCourses_summary() {
		this.courses_summary = null;
	}

	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public void addCourses(String value) {
		if (courses == null)
			courses = new ArrayList<String>();
		courses.add(value);
	}

	public void unSetCourses() {
		this.courses = null;
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

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public void unSetPercentage() {
		this.percentage = null;
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