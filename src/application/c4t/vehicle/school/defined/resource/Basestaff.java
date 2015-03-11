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
public abstract class Basestaff extends BaseResource {
	private String id = null;
	private String name = null;
	private String employee_no = null;
	private String card_no = null;
	private String reporting_to = null;
	private String school_id = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String mobile_no = null;
	private String email_id = null;
	private String customer_id = null;
	private String designation = null;
	private String department = null;
	private String permanent_staff = null;
	private String timing_id = null;
	private String remark = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_EMPLOYEE_NO = "employee_no";
	public static String FIELD_CARD_NO = "card_no";
	public static String FIELD_REPORTING_TO = "reporting_to";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_DESIGNATION = "designation";
	public static String FIELD_DEPARTMENT = "department";
	public static String FIELD_PERMANENT_STAFF = "permanent_staff";
	public static String FIELD_TIMING_ID = "timing_id";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("staff");

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

		Field employee_noField = new Field("employee_no", "String");
		employee_noField.setLength(128);
		metaData.addField(employee_noField);

		Field card_noField = new Field("card_no", "String");
		card_noField.setIndexed(true);
		card_noField.setLength(128);
		metaData.addField(card_noField);

		Field reporting_toField = new Field("reporting_to", "String");
		reporting_toField.setLength(128);
		metaData.addField(reporting_toField);

		Field school_idField = new Field("school_id", "String");
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

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field designationField = new Field("designation", "String");
		designationField.setLength(128);
		metaData.addField(designationField);

		Field departmentField = new Field("department", "String");
		departmentField.setLength(128);
		metaData.addField(departmentField);

		Field permanent_staffField = new Field("permanent_staff", "String");
		permanent_staffField.setDefaultValue("Y");
		permanent_staffField.setLength(128);
		metaData.addField(permanent_staffField);

		Field timing_idField = new Field("timing_id", "String");
		timing_idField.setLength(128);
		metaData.addField(timing_idField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("staff");

		metaData.setCluster("DB_PROFILE");
	}

	public Basestaff() {}

	public Basestaff(Basestaff obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.employee_no = obj.employee_no;
		this.card_no = obj.card_no;
		this.reporting_to = obj.reporting_to;
		this.school_id = obj.school_id;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.customer_id = obj.customer_id;
		this.designation = obj.designation;
		this.department = obj.department;
		this.permanent_staff = obj.permanent_staff;
		this.timing_id = obj.timing_id;
		this.remark = obj.remark;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(permanent_staff == null)
			permanent_staff = "Y";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(employee_no != null)
			map.put("employee_no", employee_no);
		if(card_no != null)
			map.put("card_no", card_no);
		if(reporting_to != null)
			map.put("reporting_to", reporting_to);
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
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(designation != null)
			map.put("designation", designation);
		if(department != null)
			map.put("department", department);
		if(permanent_staff != null)
			map.put("permanent_staff", permanent_staff);
		if(timing_id != null)
			map.put("timing_id", timing_id);
		if(remark != null)
			map.put("remark", remark);
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
		if(employee_no != null)
			map.put("employee_no", employee_no);
		if(card_no != null)
			map.put("card_no", card_no);
		if(reporting_to != null)
			map.put("reporting_to", reporting_to);
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
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(designation != null)
			map.put("designation", designation);
		if(department != null)
			map.put("department", department);
		if(permanent_staff != null)
			map.put("permanent_staff", permanent_staff);
		if(timing_id != null)
			map.put("timing_id", timing_id);
		if(remark != null)
			map.put("remark", remark);
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
		employee_no = (String) map.get("employee_no");
		card_no = (String) map.get("card_no");
		reporting_to = (String) map.get("reporting_to");
		school_id = (String) map.get("school_id");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		customer_id = (String) map.get("customer_id");
		designation = (String) map.get("designation");
		department = (String) map.get("department");
		permanent_staff = (String) map.get("permanent_staff");
		timing_id = (String) map.get("timing_id");
		remark = (String) map.get("remark");
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

		Object employee_noObj = map.get("employee_no");
		if(employee_noObj != null)
			employee_no = employee_noObj.toString();

		Object card_noObj = map.get("card_no");
		if(card_noObj != null)
			card_no = card_noObj.toString();

		Object reporting_toObj = map.get("reporting_to");
		if(reporting_toObj != null)
			reporting_to = reporting_toObj.toString();

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

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object designationObj = map.get("designation");
		if(designationObj != null)
			designation = designationObj.toString();

		Object departmentObj = map.get("department");
		if(departmentObj != null)
			department = departmentObj.toString();

		Object permanent_staffObj = map.get("permanent_staff");
		if(permanent_staffObj != null)
			permanent_staff = permanent_staffObj.toString();

		Object timing_idObj = map.get("timing_id");
		if(timing_idObj != null)
			timing_id = timing_idObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

	public String getEmployee_no() {
		return employee_no;
	}

	public String getEmployee_noEx() {
		return employee_no != null ? employee_no : "";
	}

	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}

	public void unSetEmployee_no() {
		this.employee_no = null;
	}

	public String getCard_no() {
		return card_no;
	}

	public String getCard_noEx() {
		return card_no != null ? card_no : "";
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public void unSetCard_no() {
		this.card_no = null;
	}

	public String getReporting_to() {
		return reporting_to;
	}

	public String getReporting_toEx() {
		return reporting_to != null ? reporting_to : "";
	}

	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}

	public void unSetReporting_to() {
		this.reporting_to = null;
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

	public String getDesignation() {
		return designation;
	}

	public String getDesignationEx() {
		return designation != null ? designation : "";
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void unSetDesignation() {
		this.designation = null;
	}

	public String getDepartment() {
		return department;
	}

	public String getDepartmentEx() {
		return department != null ? department : "";
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void unSetDepartment() {
		this.department = null;
	}

	public String getPermanent_staff() {
		return permanent_staff != null ? permanent_staff : "Y";
	}

	public void setPermanent_staff(String permanent_staff) {
		this.permanent_staff = permanent_staff;
	}

	public void unSetPermanent_staff() {
		this.permanent_staff = "Y";
	}

	public String getTiming_id() {
		return timing_id;
	}

	public String getTiming_idEx() {
		return timing_id != null ? timing_id : "";
	}

	public void setTiming_id(String timing_id) {
		this.timing_id = timing_id;
	}

	public void unSetTiming_id() {
		this.timing_id = null;
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