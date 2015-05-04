/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

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
public abstract class Baseattendent extends BaseResource {
	private String id = null;
	private String name = null;
	private String emailId = null;
	private String mobile_no = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String remark = null;
	private String customer_id = null;
	private String user_id = null;
	private String dob = null;
	private String dateOfJoining = null;
	private String eyeSight = null;
	private String qualification = null;
	private String referenceName = null;
	private String referenceMobile_no = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_EMAILID = "emailId";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_DOB = "dob";
	public static String FIELD_DATEOFJOINING = "dateOfJoining";
	public static String FIELD_EYESIGHT = "eyeSight";
	public static String FIELD_QUALIFICATION = "qualification";
	public static String FIELD_REFERENCENAME = "referenceName";
	public static String FIELD_REFERENCEMOBILE_NO = "referenceMobile_no";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("attendent");

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

		Field emailIdField = new Field("emailId", "String");
		emailIdField.setLength(128);
		metaData.addField(emailIdField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

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

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setRequired(true);
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field dobField = new Field("dob", "String");
		dobField.setLength(28);
		metaData.addField(dobField);

		Field dateOfJoiningField = new Field("dateOfJoining", "String");
		dateOfJoiningField.setLength(28);
		metaData.addField(dateOfJoiningField);

		Field eyeSightField = new Field("eyeSight", "String");
		eyeSightField.setLength(10);
		metaData.addField(eyeSightField);

		Field qualificationField = new Field("qualification", "String");
		qualificationField.setLength(128);
		metaData.addField(qualificationField);

		Field referenceNameField = new Field("referenceName", "String");
		referenceNameField.setLength(128);
		metaData.addField(referenceNameField);

		Field referenceMobile_noField = new Field("referenceMobile_no", "String");
		referenceMobile_noField.setLength(128);
		metaData.addField(referenceMobile_noField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("attendent");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseattendent() {}

	public Baseattendent(Baseattendent obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.emailId = obj.emailId;
		this.mobile_no = obj.mobile_no;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.remark = obj.remark;
		this.customer_id = obj.customer_id;
		this.user_id = obj.user_id;
		this.dob = obj.dob;
		this.dateOfJoining = obj.dateOfJoining;
		this.eyeSight = obj.eyeSight;
		this.qualification = obj.qualification;
		this.referenceName = obj.referenceName;
		this.referenceMobile_no = obj.referenceMobile_no;
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
		if(emailId != null)
			map.put("emailId", emailId);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(remark != null)
			map.put("remark", remark);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(user_id != null)
			map.put("user_id", user_id);
		if(dob != null)
			map.put("dob", dob);
		if(dateOfJoining != null)
			map.put("dateOfJoining", dateOfJoining);
		if(eyeSight != null)
			map.put("eyeSight", eyeSight);
		if(qualification != null)
			map.put("qualification", qualification);
		if(referenceName != null)
			map.put("referenceName", referenceName);
		if(referenceMobile_no != null)
			map.put("referenceMobile_no", referenceMobile_no);
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
		if(emailId != null)
			map.put("emailId", emailId);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
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
		if(remark != null)
			map.put("remark", remark);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(validateUser_id(add))
			map.put("user_id", user_id);
		if(dob != null)
			map.put("dob", dob);
		if(dateOfJoining != null)
			map.put("dateOfJoining", dateOfJoining);
		if(eyeSight != null)
			map.put("eyeSight", eyeSight);
		if(qualification != null)
			map.put("qualification", qualification);
		if(referenceName != null)
			map.put("referenceName", referenceName);
		if(referenceMobile_no != null)
			map.put("referenceMobile_no", referenceMobile_no);
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
		emailId = (String) map.get("emailId");
		mobile_no = (String) map.get("mobile_no");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		remark = (String) map.get("remark");
		customer_id = (String) map.get("customer_id");
		user_id = (String) map.get("user_id");
		dob = (String) map.get("dob");
		dateOfJoining = (String) map.get("dateOfJoining");
		eyeSight = (String) map.get("eyeSight");
		qualification = (String) map.get("qualification");
		referenceName = (String) map.get("referenceName");
		referenceMobile_no = (String) map.get("referenceMobile_no");
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

		Object emailIdObj = map.get("emailId");
		if(emailIdObj != null)
			emailId = emailIdObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

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

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = dobObj.toString();

		Object dateOfJoiningObj = map.get("dateOfJoining");
		if(dateOfJoiningObj != null)
			dateOfJoining = dateOfJoiningObj.toString();

		Object eyeSightObj = map.get("eyeSight");
		if(eyeSightObj != null)
			eyeSight = eyeSightObj.toString();

		Object qualificationObj = map.get("qualification");
		if(qualificationObj != null)
			qualification = qualificationObj.toString();

		Object referenceNameObj = map.get("referenceName");
		if(referenceNameObj != null)
			referenceName = referenceNameObj.toString();

		Object referenceMobile_noObj = map.get("referenceMobile_no");
		if(referenceMobile_noObj != null)
			referenceMobile_no = referenceMobile_noObj.toString();

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

	public String getEmailId() {
		return emailId;
	}

	public String getEmailIdEx() {
		return emailId != null ? emailId : "";
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void unSetEmailId() {
		this.emailId = null;
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

	public String getDob() {
		return dob;
	}

	public String getDobEx() {
		return dob != null ? dob : "";
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void unSetDob() {
		this.dob = null;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getDateOfJoiningEx() {
		return dateOfJoining != null ? dateOfJoining : "";
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void unSetDateOfJoining() {
		this.dateOfJoining = null;
	}

	public String getEyeSight() {
		return eyeSight;
	}

	public String getEyeSightEx() {
		return eyeSight != null ? eyeSight : "";
	}

	public void setEyeSight(String eyeSight) {
		this.eyeSight = eyeSight;
	}

	public void unSetEyeSight() {
		this.eyeSight = null;
	}

	public String getQualification() {
		return qualification;
	}

	public String getQualificationEx() {
		return qualification != null ? qualification : "";
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void unSetQualification() {
		this.qualification = null;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public String getReferenceNameEx() {
		return referenceName != null ? referenceName : "";
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public void unSetReferenceName() {
		this.referenceName = null;
	}

	public String getReferenceMobile_no() {
		return referenceMobile_no;
	}

	public String getReferenceMobile_noEx() {
		return referenceMobile_no != null ? referenceMobile_no : "";
	}

	public void setReferenceMobile_no(String referenceMobile_no) {
		this.referenceMobile_no = referenceMobile_no;
	}

	public void unSetReferenceMobile_no() {
		this.referenceMobile_no = null;
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