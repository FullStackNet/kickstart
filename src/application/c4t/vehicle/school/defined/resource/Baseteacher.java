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
public abstract class Baseteacher extends BaseResource {
	private String id = null;
	private String name = null;
	private String school_id = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String pickup_route_stopage_id = null;
	private String dropped_route_stopage_id = null;
	private String alert_pickup_route_stopage_id = null;
	private String alert_dropped_route_stopage_id = null;
	private String mobile_no = null;
	private String email_id = null;
	private String class_teacher_class = null;
	private String class_teacher_section = null;
	private String customer_id = null;
	private String user_id = null;
	private String remark = null;
	private String stopage_alert_sms = null;
	private String stopage_alert_mobile_app = null;
	private String stopage_alert_email = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_PICKUP_ROUTE_STOPAGE_ID = "pickup_route_stopage_id";
	public static String FIELD_DROPPED_ROUTE_STOPAGE_ID = "dropped_route_stopage_id";
	public static String FIELD_ALERT_PICKUP_ROUTE_STOPAGE_ID = "alert_pickup_route_stopage_id";
	public static String FIELD_ALERT_DROPPED_ROUTE_STOPAGE_ID = "alert_dropped_route_stopage_id";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CLASS_TEACHER_CLASS = "class_teacher_class";
	public static String FIELD_CLASS_TEACHER_SECTION = "class_teacher_section";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_STOPAGE_ALERT_SMS = "stopage_alert_sms";
	public static String FIELD_STOPAGE_ALERT_MOBILE_APP = "stopage_alert_mobile_app";
	public static String FIELD_STOPAGE_ALERT_EMAIL = "stopage_alert_email";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("teacher");

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

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field address1Field = new Field("address1", "String");
		address1Field.setLength(128);
		metaData.addField(address1Field);

		Field address2Field = new Field("address2", "String");
		address2Field.setLength(128);
		metaData.addField(address2Field);

		Field address3Field = new Field("address3", "String");
		address3Field.setLength(128);
		metaData.addField(address3Field);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field pickup_route_stopage_idField = new Field("pickup_route_stopage_id", "String");
		pickup_route_stopage_idField.setLength(128);
		metaData.addField(pickup_route_stopage_idField);

		Field dropped_route_stopage_idField = new Field("dropped_route_stopage_id", "String");
		dropped_route_stopage_idField.setLength(128);
		metaData.addField(dropped_route_stopage_idField);

		Field alert_pickup_route_stopage_idField = new Field("alert_pickup_route_stopage_id", "String");
		alert_pickup_route_stopage_idField.setLength(128);
		metaData.addField(alert_pickup_route_stopage_idField);

		Field alert_dropped_route_stopage_idField = new Field("alert_dropped_route_stopage_id", "String");
		alert_dropped_route_stopage_idField.setLength(128);
		metaData.addField(alert_dropped_route_stopage_idField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field class_teacher_classField = new Field("class_teacher_class", "String");
		class_teacher_classField.setLength(128);
		metaData.addField(class_teacher_classField);

		Field class_teacher_sectionField = new Field("class_teacher_section", "String");
		class_teacher_sectionField.setLength(128);
		metaData.addField(class_teacher_sectionField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field stopage_alert_smsField = new Field("stopage_alert_sms", "String");
		stopage_alert_smsField.setDefaultValue("N");
		stopage_alert_smsField.setLength(1);
		metaData.addField(stopage_alert_smsField);

		Field stopage_alert_mobile_appField = new Field("stopage_alert_mobile_app", "String");
		stopage_alert_mobile_appField.setDefaultValue("Y");
		stopage_alert_mobile_appField.setLength(1);
		metaData.addField(stopage_alert_mobile_appField);

		Field stopage_alert_emailField = new Field("stopage_alert_email", "String");
		stopage_alert_emailField.setDefaultValue("N");
		stopage_alert_emailField.setLength(1);
		metaData.addField(stopage_alert_emailField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("teacher");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseteacher() {}

	public Baseteacher(Baseteacher obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.school_id = obj.school_id;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.pickup_route_stopage_id = obj.pickup_route_stopage_id;
		this.dropped_route_stopage_id = obj.dropped_route_stopage_id;
		this.alert_pickup_route_stopage_id = obj.alert_pickup_route_stopage_id;
		this.alert_dropped_route_stopage_id = obj.alert_dropped_route_stopage_id;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.class_teacher_class = obj.class_teacher_class;
		this.class_teacher_section = obj.class_teacher_section;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.remark = obj.remark;
		this.stopage_alert_sms = obj.stopage_alert_sms;
		this.stopage_alert_mobile_app = obj.stopage_alert_mobile_app;
		this.stopage_alert_email = obj.stopage_alert_email;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(stopage_alert_sms == null)
			stopage_alert_sms = "N";
		if(stopage_alert_mobile_app == null)
			stopage_alert_mobile_app = "Y";
		if(stopage_alert_email == null)
			stopage_alert_email = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(class_teacher_class != null)
			map.put("class_teacher_class", class_teacher_class);
		if(class_teacher_section != null)
			map.put("class_teacher_section", class_teacher_section);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(pickup_route_stopage_id != null)
			map.put("pickup_route_stopage_id", pickup_route_stopage_id);
		if(dropped_route_stopage_id != null)
			map.put("dropped_route_stopage_id", dropped_route_stopage_id);
		if(alert_pickup_route_stopage_id != null)
			map.put("alert_pickup_route_stopage_id", alert_pickup_route_stopage_id);
		if(alert_dropped_route_stopage_id != null)
			map.put("alert_dropped_route_stopage_id", alert_dropped_route_stopage_id);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(class_teacher_class != null)
			map.put("class_teacher_class", class_teacher_class);
		if(class_teacher_section != null)
			map.put("class_teacher_section", class_teacher_section);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		if(stopage_alert_sms != null)
			map.put("stopage_alert_sms", stopage_alert_sms);
		if(stopage_alert_mobile_app != null)
			map.put("stopage_alert_mobile_app", stopage_alert_mobile_app);
		if(stopage_alert_email != null)
			map.put("stopage_alert_email", stopage_alert_email);
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
		school_id = (String) map.get("school_id");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		pickup_route_stopage_id = (String) map.get("pickup_route_stopage_id");
		dropped_route_stopage_id = (String) map.get("dropped_route_stopage_id");
		alert_pickup_route_stopage_id = (String) map.get("alert_pickup_route_stopage_id");
		alert_dropped_route_stopage_id = (String) map.get("alert_dropped_route_stopage_id");
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		class_teacher_class = (String) map.get("class_teacher_class");
		class_teacher_section = (String) map.get("class_teacher_section");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		remark = (String) map.get("remark");
		stopage_alert_sms = (String) map.get("stopage_alert_sms");
		stopage_alert_mobile_app = (String) map.get("stopage_alert_mobile_app");
		stopage_alert_email = (String) map.get("stopage_alert_email");
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

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object address1Obj = map.get("address1");
		if(address1Obj != null)
			address1 = address1Obj.toString();

		Object address2Obj = map.get("address2");
		if(address2Obj != null)
			address2 = address2Obj.toString();

		Object address3Obj = map.get("address3");
		if(address3Obj != null)
			address3 = address3Obj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object pickup_route_stopage_idObj = map.get("pickup_route_stopage_id");
		if(pickup_route_stopage_idObj != null)
			pickup_route_stopage_id = pickup_route_stopage_idObj.toString();

		Object dropped_route_stopage_idObj = map.get("dropped_route_stopage_id");
		if(dropped_route_stopage_idObj != null)
			dropped_route_stopage_id = dropped_route_stopage_idObj.toString();

		Object alert_pickup_route_stopage_idObj = map.get("alert_pickup_route_stopage_id");
		if(alert_pickup_route_stopage_idObj != null)
			alert_pickup_route_stopage_id = alert_pickup_route_stopage_idObj.toString();

		Object alert_dropped_route_stopage_idObj = map.get("alert_dropped_route_stopage_id");
		if(alert_dropped_route_stopage_idObj != null)
			alert_dropped_route_stopage_id = alert_dropped_route_stopage_idObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object class_teacher_classObj = map.get("class_teacher_class");
		if(class_teacher_classObj != null)
			class_teacher_class = class_teacher_classObj.toString();

		Object class_teacher_sectionObj = map.get("class_teacher_section");
		if(class_teacher_sectionObj != null)
			class_teacher_section = class_teacher_sectionObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object stopage_alert_smsObj = map.get("stopage_alert_sms");
		if(stopage_alert_smsObj != null)
			stopage_alert_sms = stopage_alert_smsObj.toString();

		Object stopage_alert_mobile_appObj = map.get("stopage_alert_mobile_app");
		if(stopage_alert_mobile_appObj != null)
			stopage_alert_mobile_app = stopage_alert_mobile_appObj.toString();

		Object stopage_alert_emailObj = map.get("stopage_alert_email");
		if(stopage_alert_emailObj != null)
			stopage_alert_email = stopage_alert_emailObj.toString();

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

	public String getAddress1() {
		return address1;
	}

	public String getAddress1Ex() {
		return address1 != null ? address1 : "";
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void unSetAddress1() {
		this.address1 = null;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress2Ex() {
		return address2 != null ? address2 : "";
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void unSetAddress2() {
		this.address2 = null;
	}

	public String getAddress3() {
		return address3;
	}

	public String getAddress3Ex() {
		return address3 != null ? address3 : "";
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public void unSetAddress3() {
		this.address3 = null;
	}

	public String getCity() {
		return city;
	}

	public String getCityEx() {
		return city != null ? city : "";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void unSetCity() {
		this.city = null;
	}

	public String getState() {
		return state;
	}

	public String getStateEx() {
		return state != null ? state : "";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryEx() {
		return country != null ? country : "";
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void unSetCountry() {
		this.country = null;
	}

	public String getPickup_route_stopage_id() {
		return pickup_route_stopage_id;
	}

	public String getPickup_route_stopage_idEx() {
		return pickup_route_stopage_id != null ? pickup_route_stopage_id : "";
	}

	public void setPickup_route_stopage_id(String pickup_route_stopage_id) {
		this.pickup_route_stopage_id = pickup_route_stopage_id;
	}

	public void unSetPickup_route_stopage_id() {
		this.pickup_route_stopage_id = null;
	}

	public String getDropped_route_stopage_id() {
		return dropped_route_stopage_id;
	}

	public String getDropped_route_stopage_idEx() {
		return dropped_route_stopage_id != null ? dropped_route_stopage_id : "";
	}

	public void setDropped_route_stopage_id(String dropped_route_stopage_id) {
		this.dropped_route_stopage_id = dropped_route_stopage_id;
	}

	public void unSetDropped_route_stopage_id() {
		this.dropped_route_stopage_id = null;
	}

	public String getAlert_pickup_route_stopage_id() {
		return alert_pickup_route_stopage_id;
	}

	public String getAlert_pickup_route_stopage_idEx() {
		return alert_pickup_route_stopage_id != null ? alert_pickup_route_stopage_id : "";
	}

	public void setAlert_pickup_route_stopage_id(String alert_pickup_route_stopage_id) {
		this.alert_pickup_route_stopage_id = alert_pickup_route_stopage_id;
	}

	public void unSetAlert_pickup_route_stopage_id() {
		this.alert_pickup_route_stopage_id = null;
	}

	public String getAlert_dropped_route_stopage_id() {
		return alert_dropped_route_stopage_id;
	}

	public String getAlert_dropped_route_stopage_idEx() {
		return alert_dropped_route_stopage_id != null ? alert_dropped_route_stopage_id : "";
	}

	public void setAlert_dropped_route_stopage_id(String alert_dropped_route_stopage_id) {
		this.alert_dropped_route_stopage_id = alert_dropped_route_stopage_id;
	}

	public void unSetAlert_dropped_route_stopage_id() {
		this.alert_dropped_route_stopage_id = null;
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

	public String getClass_teacher_class() {
		return class_teacher_class;
	}

	public String getClass_teacher_classEx() {
		return class_teacher_class != null ? class_teacher_class : "";
	}

	public void setClass_teacher_class(String class_teacher_class) {
		this.class_teacher_class = class_teacher_class;
	}

	public void unSetClass_teacher_class() {
		this.class_teacher_class = null;
	}

	public String getClass_teacher_section() {
		return class_teacher_section;
	}

	public String getClass_teacher_sectionEx() {
		return class_teacher_section != null ? class_teacher_section : "";
	}

	public void setClass_teacher_section(String class_teacher_section) {
		this.class_teacher_section = class_teacher_section;
	}

	public void unSetClass_teacher_section() {
		this.class_teacher_section = null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
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

	public boolean validateUser_id(boolean add) throws ApplicationException {
		if(add && user_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[user_id]");
		return user_id != null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
	}

	public String getStopage_alert_sms() {
		return stopage_alert_sms != null ? stopage_alert_sms : "N";
	}

	public void setStopage_alert_sms(String stopage_alert_sms) {
		this.stopage_alert_sms = stopage_alert_sms;
	}

	public void unSetStopage_alert_sms() {
		this.stopage_alert_sms = "N";
	}

	public String getStopage_alert_mobile_app() {
		return stopage_alert_mobile_app != null ? stopage_alert_mobile_app : "Y";
	}

	public void setStopage_alert_mobile_app(String stopage_alert_mobile_app) {
		this.stopage_alert_mobile_app = stopage_alert_mobile_app;
	}

	public void unSetStopage_alert_mobile_app() {
		this.stopage_alert_mobile_app = "Y";
	}

	public String getStopage_alert_email() {
		return stopage_alert_email != null ? stopage_alert_email : "N";
	}

	public void setStopage_alert_email(String stopage_alert_email) {
		this.stopage_alert_email = stopage_alert_email;
	}

	public void unSetStopage_alert_email() {
		this.stopage_alert_email = "N";
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