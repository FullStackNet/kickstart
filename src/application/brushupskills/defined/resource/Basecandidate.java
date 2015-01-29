/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

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
public abstract class Basecandidate extends BaseResource {
	private String id = null;
	private String name = null;
	private String mobile_no = null;
	private String email_id = null;
	private String degree = null;
	private String last_institute = null;
	private String last_institute_location = null;
	private String current_company = null;
	private Long total_experience_enter_date = null;
	private Long total_experience = null;
	private String current_role = null;
	private String location = null;
	private String next_company = null;
	private String password = null;
	private Long creation_time = null;
	private Long total_coins = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_DEGREE = "degree";
	public static String FIELD_LAST_INSTITUTE = "last_institute";
	public static String FIELD_LAST_INSTITUTE_LOCATION = "last_institute_location";
	public static String FIELD_CURRENT_COMPANY = "current_company";
	public static String FIELD_TOTAL_EXPERIENCE_ENTER_DATE = "total_experience_enter_date";
	public static String FIELD_TOTAL_EXPERIENCE = "total_experience";
	public static String FIELD_CURRENT_ROLE = "current_role";
	public static String FIELD_LOCATION = "location";
	public static String FIELD_NEXT_COMPANY = "next_company";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_TOTAL_COINS = "total_coins";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("candidate");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setIndexed(true);
		mobile_noField.setLength(20);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(20);
		metaData.addField(email_idField);

		Field degreeField = new Field("degree", "String");
		degreeField.setLength(128);
		metaData.addField(degreeField);

		Field last_instituteField = new Field("last_institute", "String");
		last_instituteField.setLength(128);
		metaData.addField(last_instituteField);

		Field last_institute_locationField = new Field("last_institute_location", "String");
		last_institute_locationField.setLength(128);
		metaData.addField(last_institute_locationField);

		Field current_companyField = new Field("current_company", "String");
		current_companyField.setLength(128);
		metaData.addField(current_companyField);

		Field total_experience_enter_dateField = new Field("total_experience_enter_date", "long");
		metaData.addField(total_experience_enter_dateField);

		Field total_experienceField = new Field("total_experience", "long");
		metaData.addField(total_experienceField);

		Field current_roleField = new Field("current_role", "String");
		current_roleField.setLength(128);
		metaData.addField(current_roleField);

		Field locationField = new Field("location", "String");
		locationField.setLength(128);
		metaData.addField(locationField);

		Field next_companyField = new Field("next_company", "String");
		next_companyField.setLength(128);
		metaData.addField(next_companyField);

		Field passwordField = new Field("password", "String");
		passwordField.setLength(128);
		metaData.addField(passwordField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field total_coinsField = new Field("total_coins", "long");
		metaData.addField(total_coinsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("candidate");

		metaData.setCluster("DB_PROFILE");
	}

	public Basecandidate() {}

	public Basecandidate(Basecandidate obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.degree = obj.degree;
		this.last_institute = obj.last_institute;
		this.last_institute_location = obj.last_institute_location;
		this.current_company = obj.current_company;
		this.total_experience_enter_date = obj.total_experience_enter_date;
		this.total_experience = obj.total_experience;
		this.current_role = obj.current_role;
		this.location = obj.location;
		this.next_company = obj.next_company;
		this.password = obj.password;
		this.creation_time = obj.creation_time;
		this.total_coins = obj.total_coins;
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
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(degree != null)
			map.put("degree", degree);
		if(last_institute != null)
			map.put("last_institute", last_institute);
		if(last_institute_location != null)
			map.put("last_institute_location", last_institute_location);
		if(current_company != null)
			map.put("current_company", current_company);
		if(total_experience_enter_date != null)
			map.put("total_experience_enter_date", total_experience_enter_date);
		if(total_experience != null)
			map.put("total_experience", total_experience);
		if(current_role != null)
			map.put("current_role", current_role);
		if(location != null)
			map.put("location", location);
		if(next_company != null)
			map.put("next_company", next_company);
		if(password != null)
			map.put("password", password);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(total_coins != null)
			map.put("total_coins", total_coins);
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
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(degree != null)
			map.put("degree", degree);
		if(last_institute != null)
			map.put("last_institute", last_institute);
		if(last_institute_location != null)
			map.put("last_institute_location", last_institute_location);
		if(current_company != null)
			map.put("current_company", current_company);
		if(total_experience_enter_date != null)
			map.put("total_experience_enter_date", total_experience_enter_date);
		if(total_experience != null)
			map.put("total_experience", total_experience);
		if(current_role != null)
			map.put("current_role", current_role);
		if(location != null)
			map.put("location", location);
		if(next_company != null)
			map.put("next_company", next_company);
		if(password != null)
			map.put("password", password);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(total_coins != null)
			map.put("total_coins", total_coins);
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
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		degree = (String) map.get("degree");
		last_institute = (String) map.get("last_institute");
		last_institute_location = (String) map.get("last_institute_location");
		current_company = (String) map.get("current_company");
		total_experience_enter_date = (Long) map.get("total_experience_enter_date");
		total_experience = (Long) map.get("total_experience");
		current_role = (String) map.get("current_role");
		location = (String) map.get("location");
		next_company = (String) map.get("next_company");
		password = (String) map.get("password");
		creation_time = (Long) map.get("creation_time");
		total_coins = (Long) map.get("total_coins");
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

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object degreeObj = map.get("degree");
		if(degreeObj != null)
			degree = degreeObj.toString();

		Object last_instituteObj = map.get("last_institute");
		if(last_instituteObj != null)
			last_institute = last_instituteObj.toString();

		Object last_institute_locationObj = map.get("last_institute_location");
		if(last_institute_locationObj != null)
			last_institute_location = last_institute_locationObj.toString();

		Object current_companyObj = map.get("current_company");
		if(current_companyObj != null)
			current_company = current_companyObj.toString();

		Object total_experience_enter_dateObj = map.get("total_experience_enter_date");
		if(total_experience_enter_dateObj != null)
			total_experience_enter_date = new Long(total_experience_enter_dateObj.toString());

		Object total_experienceObj = map.get("total_experience");
		if(total_experienceObj != null)
			total_experience = new Long(total_experienceObj.toString());

		Object current_roleObj = map.get("current_role");
		if(current_roleObj != null)
			current_role = current_roleObj.toString();

		Object locationObj = map.get("location");
		if(locationObj != null)
			location = locationObj.toString();

		Object next_companyObj = map.get("next_company");
		if(next_companyObj != null)
			next_company = next_companyObj.toString();

		Object passwordObj = map.get("password");
		if(passwordObj != null)
			password = passwordObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object total_coinsObj = map.get("total_coins");
		if(total_coinsObj != null)
			total_coins = new Long(total_coinsObj.toString());

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

	public String getDegree() {
		return degree;
	}

	public String getDegreeEx() {
		return degree != null ? degree : "";
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void unSetDegree() {
		this.degree = null;
	}

	public String getLast_institute() {
		return last_institute;
	}

	public String getLast_instituteEx() {
		return last_institute != null ? last_institute : "";
	}

	public void setLast_institute(String last_institute) {
		this.last_institute = last_institute;
	}

	public void unSetLast_institute() {
		this.last_institute = null;
	}

	public String getLast_institute_location() {
		return last_institute_location;
	}

	public String getLast_institute_locationEx() {
		return last_institute_location != null ? last_institute_location : "";
	}

	public void setLast_institute_location(String last_institute_location) {
		this.last_institute_location = last_institute_location;
	}

	public void unSetLast_institute_location() {
		this.last_institute_location = null;
	}

	public String getCurrent_company() {
		return current_company;
	}

	public String getCurrent_companyEx() {
		return current_company != null ? current_company : "";
	}

	public void setCurrent_company(String current_company) {
		this.current_company = current_company;
	}

	public void unSetCurrent_company() {
		this.current_company = null;
	}

	public Long getTotal_experience_enter_date() {
		return total_experience_enter_date;
	}

	public long getTotal_experience_enter_dateEx() {
		return total_experience_enter_date != null ? total_experience_enter_date : 0L;
	}

	public void setTotal_experience_enter_date(long total_experience_enter_date) {
		this.total_experience_enter_date = total_experience_enter_date;
	}

	public void setTotal_experience_enter_date(Long total_experience_enter_date) {
		this.total_experience_enter_date = total_experience_enter_date;
	}

	public void unSetTotal_experience_enter_date() {
		this.total_experience_enter_date = null;
	}

	public Long getTotal_experience() {
		return total_experience;
	}

	public long getTotal_experienceEx() {
		return total_experience != null ? total_experience : 0L;
	}

	public void setTotal_experience(long total_experience) {
		this.total_experience = total_experience;
	}

	public void setTotal_experience(Long total_experience) {
		this.total_experience = total_experience;
	}

	public void unSetTotal_experience() {
		this.total_experience = null;
	}

	public String getCurrent_role() {
		return current_role;
	}

	public String getCurrent_roleEx() {
		return current_role != null ? current_role : "";
	}

	public void setCurrent_role(String current_role) {
		this.current_role = current_role;
	}

	public void unSetCurrent_role() {
		this.current_role = null;
	}

	public String getLocation() {
		return location;
	}

	public String getLocationEx() {
		return location != null ? location : "";
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void unSetLocation() {
		this.location = null;
	}

	public String getNext_company() {
		return next_company;
	}

	public String getNext_companyEx() {
		return next_company != null ? next_company : "";
	}

	public void setNext_company(String next_company) {
		this.next_company = next_company;
	}

	public void unSetNext_company() {
		this.next_company = null;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getTotal_coins() {
		return total_coins;
	}

	public long getTotal_coinsEx() {
		return total_coins != null ? total_coins : 0L;
	}

	public void setTotal_coins(long total_coins) {
		this.total_coins = total_coins;
	}

	public void setTotal_coins(Long total_coins) {
		this.total_coins = total_coins;
	}

	public void unSetTotal_coins() {
		this.total_coins = null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}