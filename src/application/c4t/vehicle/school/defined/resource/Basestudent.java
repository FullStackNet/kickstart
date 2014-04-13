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
public abstract class Basestudent extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String name = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String pickup_route_stopage_id = null;
	private String dropped_route_stopage_id = null;
	private String stopage_id = null;
	private String father_name = null;
	private String father_mobile_no = null;
	private String mother_name = null;
	private String mother_mobile_no = null;
	private String other_name = null;
	private String other_mobile_no = null;
	private String father_email_id = null;
	private String mother_email_id = null;
	private String other_email_id = null;
	private String class_name = null;
	private String section_name = null;
	private String customer_id = null;
	private String user_id = null;
	private String remark = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_PICKUP_ROUTE_STOPAGE_ID = "pickup_route_stopage_id";
	public static String FIELD_DROPPED_ROUTE_STOPAGE_ID = "dropped_route_stopage_id";
	public static String FIELD_STOPAGE_ID = "stopage_id";
	public static String FIELD_FATHER_NAME = "father_name";
	public static String FIELD_FATHER_MOBILE_NO = "father_mobile_no";
	public static String FIELD_MOTHER_NAME = "mother_name";
	public static String FIELD_MOTHER_MOBILE_NO = "mother_mobile_no";
	public static String FIELD_OTHER_NAME = "other_name";
	public static String FIELD_OTHER_MOBILE_NO = "other_mobile_no";
	public static String FIELD_FATHER_EMAIL_ID = "father_email_id";
	public static String FIELD_MOTHER_EMAIL_ID = "mother_email_id";
	public static String FIELD_OTHER_EMAIL_ID = "other_email_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_REMARK = "remark";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("student");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

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

		Field stopage_idField = new Field("stopage_id", "String");
		stopage_idField.setLength(128);
		metaData.addField(stopage_idField);

		Field father_nameField = new Field("father_name", "String");
		father_nameField.setLength(128);
		metaData.addField(father_nameField);

		Field father_mobile_noField = new Field("father_mobile_no", "String");
		father_mobile_noField.setLength(128);
		metaData.addField(father_mobile_noField);

		Field mother_nameField = new Field("mother_name", "String");
		mother_nameField.setLength(128);
		metaData.addField(mother_nameField);

		Field mother_mobile_noField = new Field("mother_mobile_no", "String");
		mother_mobile_noField.setLength(128);
		metaData.addField(mother_mobile_noField);

		Field other_nameField = new Field("other_name", "String");
		other_nameField.setLength(128);
		metaData.addField(other_nameField);

		Field other_mobile_noField = new Field("other_mobile_no", "String");
		other_mobile_noField.setLength(128);
		metaData.addField(other_mobile_noField);

		Field father_email_idField = new Field("father_email_id", "String");
		father_email_idField.setLength(128);
		metaData.addField(father_email_idField);

		Field mother_email_idField = new Field("mother_email_id", "String");
		mother_email_idField.setLength(128);
		metaData.addField(mother_email_idField);

		Field other_email_idField = new Field("other_email_id", "String");
		other_email_idField.setLength(128);
		metaData.addField(other_email_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field customer_idField = new Field("customer_id", "String");
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


		metaData.setTableName("student");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestudent() {}

	public Basestudent(Basestudent obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.name = obj.name;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.pickup_route_stopage_id = obj.pickup_route_stopage_id;
		this.dropped_route_stopage_id = obj.dropped_route_stopage_id;
		this.stopage_id = obj.stopage_id;
		this.father_name = obj.father_name;
		this.father_mobile_no = obj.father_mobile_no;
		this.mother_name = obj.mother_name;
		this.mother_mobile_no = obj.mother_mobile_no;
		this.other_name = obj.other_name;
		this.other_mobile_no = obj.other_mobile_no;
		this.father_email_id = obj.father_email_id;
		this.mother_email_id = obj.mother_email_id;
		this.other_email_id = obj.other_email_id;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.remark = obj.remark;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
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
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(father_name != null)
			map.put("father_name", father_name);
		if(father_mobile_no != null)
			map.put("father_mobile_no", father_mobile_no);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(mother_mobile_no != null)
			map.put("mother_mobile_no", mother_mobile_no);
		if(other_name != null)
			map.put("other_name", other_name);
		if(other_mobile_no != null)
			map.put("other_mobile_no", other_mobile_no);
		if(father_email_id != null)
			map.put("father_email_id", father_email_id);
		if(mother_email_id != null)
			map.put("mother_email_id", mother_email_id);
		if(other_email_id != null)
			map.put("other_email_id", other_email_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
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
		if(stopage_id != null)
			map.put("stopage_id", stopage_id);
		if(father_name != null)
			map.put("father_name", father_name);
		if(father_mobile_no != null)
			map.put("father_mobile_no", father_mobile_no);
		if(mother_name != null)
			map.put("mother_name", mother_name);
		if(mother_mobile_no != null)
			map.put("mother_mobile_no", mother_mobile_no);
		if(other_name != null)
			map.put("other_name", other_name);
		if(other_mobile_no != null)
			map.put("other_mobile_no", other_mobile_no);
		if(father_email_id != null)
			map.put("father_email_id", father_email_id);
		if(mother_email_id != null)
			map.put("mother_email_id", mother_email_id);
		if(other_email_id != null)
			map.put("other_email_id", other_email_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(remark != null)
			map.put("remark", remark);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		school_id = (String) map.get("school_id");
		name = (String) map.get("name");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		pickup_route_stopage_id = (String) map.get("pickup_route_stopage_id");
		dropped_route_stopage_id = (String) map.get("dropped_route_stopage_id");
		stopage_id = (String) map.get("stopage_id");
		father_name = (String) map.get("father_name");
		father_mobile_no = (String) map.get("father_mobile_no");
		mother_name = (String) map.get("mother_name");
		mother_mobile_no = (String) map.get("mother_mobile_no");
		other_name = (String) map.get("other_name");
		other_mobile_no = (String) map.get("other_mobile_no");
		father_email_id = (String) map.get("father_email_id");
		mother_email_id = (String) map.get("mother_email_id");
		other_email_id = (String) map.get("other_email_id");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		remark = (String) map.get("remark");
	}

	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

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

		Object stopage_idObj = map.get("stopage_id");
		if(stopage_idObj != null)
			stopage_id = stopage_idObj.toString();

		Object father_nameObj = map.get("father_name");
		if(father_nameObj != null)
			father_name = father_nameObj.toString();

		Object father_mobile_noObj = map.get("father_mobile_no");
		if(father_mobile_noObj != null)
			father_mobile_no = father_mobile_noObj.toString();

		Object mother_nameObj = map.get("mother_name");
		if(mother_nameObj != null)
			mother_name = mother_nameObj.toString();

		Object mother_mobile_noObj = map.get("mother_mobile_no");
		if(mother_mobile_noObj != null)
			mother_mobile_no = mother_mobile_noObj.toString();

		Object other_nameObj = map.get("other_name");
		if(other_nameObj != null)
			other_name = other_nameObj.toString();

		Object other_mobile_noObj = map.get("other_mobile_no");
		if(other_mobile_noObj != null)
			other_mobile_no = other_mobile_noObj.toString();

		Object father_email_idObj = map.get("father_email_id");
		if(father_email_idObj != null)
			father_email_id = father_email_idObj.toString();

		Object mother_email_idObj = map.get("mother_email_id");
		if(mother_email_idObj != null)
			mother_email_id = mother_email_idObj.toString();

		Object other_email_idObj = map.get("other_email_id");
		if(other_email_idObj != null)
			other_email_id = other_email_idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

	public String getStopage_id() {
		return stopage_id;
	}

	public String getStopage_idEx() {
		return stopage_id != null ? stopage_id : "";
	}

	public void setStopage_id(String stopage_id) {
		this.stopage_id = stopage_id;
	}

	public void unSetStopage_id() {
		this.stopage_id = null;
	}

	public String getFather_name() {
		return father_name;
	}

	public String getFather_nameEx() {
		return father_name != null ? father_name : "";
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public void unSetFather_name() {
		this.father_name = null;
	}

	public String getFather_mobile_no() {
		return father_mobile_no;
	}

	public String getFather_mobile_noEx() {
		return father_mobile_no != null ? father_mobile_no : "";
	}

	public void setFather_mobile_no(String father_mobile_no) {
		this.father_mobile_no = father_mobile_no;
	}

	public void unSetFather_mobile_no() {
		this.father_mobile_no = null;
	}

	public String getMother_name() {
		return mother_name;
	}

	public String getMother_nameEx() {
		return mother_name != null ? mother_name : "";
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public void unSetMother_name() {
		this.mother_name = null;
	}

	public String getMother_mobile_no() {
		return mother_mobile_no;
	}

	public String getMother_mobile_noEx() {
		return mother_mobile_no != null ? mother_mobile_no : "";
	}

	public void setMother_mobile_no(String mother_mobile_no) {
		this.mother_mobile_no = mother_mobile_no;
	}

	public void unSetMother_mobile_no() {
		this.mother_mobile_no = null;
	}

	public String getOther_name() {
		return other_name;
	}

	public String getOther_nameEx() {
		return other_name != null ? other_name : "";
	}

	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}

	public void unSetOther_name() {
		this.other_name = null;
	}

	public String getOther_mobile_no() {
		return other_mobile_no;
	}

	public String getOther_mobile_noEx() {
		return other_mobile_no != null ? other_mobile_no : "";
	}

	public void setOther_mobile_no(String other_mobile_no) {
		this.other_mobile_no = other_mobile_no;
	}

	public void unSetOther_mobile_no() {
		this.other_mobile_no = null;
	}

	public String getFather_email_id() {
		return father_email_id;
	}

	public String getFather_email_idEx() {
		return father_email_id != null ? father_email_id : "";
	}

	public void setFather_email_id(String father_email_id) {
		this.father_email_id = father_email_id;
	}

	public void unSetFather_email_id() {
		this.father_email_id = null;
	}

	public String getMother_email_id() {
		return mother_email_id;
	}

	public String getMother_email_idEx() {
		return mother_email_id != null ? mother_email_id : "";
	}

	public void setMother_email_id(String mother_email_id) {
		this.mother_email_id = mother_email_id;
	}

	public void unSetMother_email_id() {
		this.mother_email_id = null;
	}

	public String getOther_email_id() {
		return other_email_id;
	}

	public String getOther_email_idEx() {
		return other_email_id != null ? other_email_id : "";
	}

	public void setOther_email_id(String other_email_id) {
		this.other_email_id = other_email_id;
	}

	public void unSetOther_email_id() {
		this.other_email_id = null;
	}

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
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
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}