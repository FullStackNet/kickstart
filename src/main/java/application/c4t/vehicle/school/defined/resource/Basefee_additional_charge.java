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
public abstract class Basefee_additional_charge extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String school_name = null;
	private String customer_id = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String section_name = null;
	private String charge_date_str = null;
	private Long charge_date = null;
	private Double amount = null;
	private String reason = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_CHARGE_DATE_STR = "charge_date_str";
	public static String FIELD_CHARGE_DATE = "charge_date";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_REASON = "reason";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("fee_additional_charge");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setIndexed(true);
		school_nameField.setLength(128);
		metaData.addField(school_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setIndexed(true);
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setIndexed(true);
		class_nameField.setLength(128);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setIndexed(true);
		section_nameField.setLength(128);
		metaData.addField(section_nameField);

		Field charge_date_strField = new Field("charge_date_str", "String");
		charge_date_strField.setLength(32);
		metaData.addField(charge_date_strField);

		Field charge_dateField = new Field("charge_date", "long");
		metaData.addField(charge_dateField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field reasonField = new Field("reason", "String");
		reasonField.setLength(128);
		metaData.addField(reasonField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("fee_additional_charge");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basefee_additional_charge() {}

	public Basefee_additional_charge(Basefee_additional_charge obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.school_name = obj.school_name;
		this.customer_id = obj.customer_id;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.charge_date_str = obj.charge_date_str;
		this.charge_date = obj.charge_date;
		this.amount = obj.amount;
		this.reason = obj.reason;
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(charge_date_str != null)
			map.put("charge_date_str", charge_date_str);
		if(charge_date != null)
			map.put("charge_date", charge_date);
		if(amount != null)
			map.put("amount", amount);
		if(reason != null)
			map.put("reason", reason);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(charge_date_str != null)
			map.put("charge_date_str", charge_date_str);
		if(charge_date != null)
			map.put("charge_date", charge_date);
		if(amount != null)
			map.put("amount", amount);
		if(reason != null)
			map.put("reason", reason);
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
		school_id = (String) map.get("school_id");
		school_name = (String) map.get("school_name");
		customer_id = (String) map.get("customer_id");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		charge_date_str = (String) map.get("charge_date_str");
		charge_date = (Long) map.get("charge_date");
		amount = (Double) map.get("amount");
		reason = (String) map.get("reason");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object charge_date_strObj = map.get("charge_date_str");
		if(charge_date_strObj != null)
			charge_date_str = charge_date_strObj.toString();

		Object charge_dateObj = map.get("charge_date");
		if(charge_dateObj != null)
			charge_date = new Long(charge_dateObj.toString());

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object reasonObj = map.get("reason");
		if(reasonObj != null)
			reason = reasonObj.toString();

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

	public String getSchool_name() {
		return school_name;
	}

	public String getSchool_nameEx() {
		return school_name != null ? school_name : "";
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void unSetSchool_name() {
		this.school_name = null;
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

	public String getCharge_date_str() {
		return charge_date_str;
	}

	public String getCharge_date_strEx() {
		return charge_date_str != null ? charge_date_str : "";
	}

	public void setCharge_date_str(String charge_date_str) {
		this.charge_date_str = charge_date_str;
	}

	public void unSetCharge_date_str() {
		this.charge_date_str = null;
	}

	public Long getCharge_date() {
		return charge_date;
	}

	public long getCharge_dateEx() {
		return charge_date != null ? charge_date : 0L;
	}

	public void setCharge_date(long charge_date) {
		this.charge_date = charge_date;
	}

	public void setCharge_date(Long charge_date) {
		this.charge_date = charge_date;
	}

	public void unSetCharge_date() {
		this.charge_date = null;
	}

	public Double getAmount() {
		return amount;
	}

	public double getAmountEx() {
		return amount != null ? amount : 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
	}

	public String getReason() {
		return reason;
	}

	public String getReasonEx() {
		return reason != null ? reason : "";
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void unSetReason() {
		this.reason = null;
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