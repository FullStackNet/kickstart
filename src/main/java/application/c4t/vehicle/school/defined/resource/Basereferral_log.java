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
public abstract class Basereferral_log extends BaseResource {
	private String id = null;
	private String code = null;
	private String code_type = null;
	private String user_id = null;
	private String user_name = null;
	private String buyer_user_name = null;
	private String buyer_user_id = null;
	private String test_id = null;
	private String test_name = null;
	private Double test_amount = null;
	private Double percentage = null;
	private Double amount = null;
	private String status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CODE = "code";
	public static String FIELD_CODE_TYPE = "code_type";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_BUYER_USER_NAME = "buyer_user_name";
	public static String FIELD_BUYER_USER_ID = "buyer_user_id";
	public static String FIELD_TEST_ID = "test_id";
	public static String FIELD_TEST_NAME = "test_name";
	public static String FIELD_TEST_AMOUNT = "test_amount";
	public static String FIELD_PERCENTAGE = "percentage";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_STATUS = "status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("referral_log");

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

		Field code_typeField = new Field("code_type", "String");
		code_typeField.setLength(128);
		metaData.addField(code_typeField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field buyer_user_nameField = new Field("buyer_user_name", "String");
		buyer_user_nameField.setLength(128);
		metaData.addField(buyer_user_nameField);

		Field buyer_user_idField = new Field("buyer_user_id", "String");
		buyer_user_idField.setLength(128);
		metaData.addField(buyer_user_idField);

		Field test_idField = new Field("test_id", "String");
		test_idField.setLength(128);
		metaData.addField(test_idField);

		Field test_nameField = new Field("test_name", "String");
		test_nameField.setLength(128);
		metaData.addField(test_nameField);

		Field test_amountField = new Field("test_amount", "double");
		metaData.addField(test_amountField);

		Field percentageField = new Field("percentage", "double");
		metaData.addField(percentageField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field statusField = new Field("status", "String");
		statusField.setLength(32);
		metaData.addField(statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("referral_log");

		metaData.setCluster("DB_LOG");
	}

	public Basereferral_log() {
	}

	public Basereferral_log(Basereferral_log obj) {
		this.id = obj.id;
		this.code = obj.code;
		this.code_type = obj.code_type;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.buyer_user_name = obj.buyer_user_name;
		this.buyer_user_id = obj.buyer_user_id;
		this.test_id = obj.test_id;
		this.test_name = obj.test_name;
		this.test_amount = obj.test_amount;
		this.percentage = obj.percentage;
		this.amount = obj.amount;
		this.status = obj.status;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (id != null)
			map.put("id", id);
		if (code != null)
			map.put("code", code);
		if (code_type != null)
			map.put("code_type", code_type);
		if (user_id != null)
			map.put("user_id", user_id);
		if (user_name != null)
			map.put("user_name", user_name);
		if (buyer_user_name != null)
			map.put("buyer_user_name", buyer_user_name);
		if (buyer_user_id != null)
			map.put("buyer_user_id", buyer_user_id);
		if (test_id != null)
			map.put("test_id", test_id);
		if (test_name != null)
			map.put("test_name", test_name);
		if (test_amount != null)
			map.put("test_amount", test_amount);
		if (percentage != null)
			map.put("percentage", percentage);
		if (amount != null)
			map.put("amount", amount);
		if (status != null)
			map.put("status", status);
		if (creation_time != null)
			map.put("creation_time", creation_time);
		if (extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (validateId(add))
			map.put("id", id);
		if (code != null)
			map.put("code", code);
		if (code_type != null)
			map.put("code_type", code_type);
		if (user_id != null)
			map.put("user_id", user_id);
		if (user_name != null)
			map.put("user_name", user_name);
		if (buyer_user_name != null)
			map.put("buyer_user_name", buyer_user_name);
		if (buyer_user_id != null)
			map.put("buyer_user_id", buyer_user_id);
		if (test_id != null)
			map.put("test_id", test_id);
		if (test_name != null)
			map.put("test_name", test_name);
		if (test_amount != null)
			map.put("test_amount", test_amount);
		if (percentage != null)
			map.put("percentage", percentage);
		if (amount != null)
			map.put("amount", amount);
		if (status != null)
			map.put("status", status);
		if (creation_time != null)
			map.put("creation_time", creation_time);
		if (extra_data != null)
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
		code_type = (String) map.get("code_type");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		buyer_user_name = (String) map.get("buyer_user_name");
		buyer_user_id = (String) map.get("buyer_user_id");
		test_id = (String) map.get("test_id");
		test_name = (String) map.get("test_name");
		test_amount = (Double) map.get("test_amount");
		percentage = (Double) map.get("percentage");
		amount = (Double) map.get("amount");
		status = (String) map.get("status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if (idObj != null)
			id = idObj.toString();

		Object codeObj = map.get("code");
		if (codeObj != null)
			code = codeObj.toString();

		Object code_typeObj = map.get("code_type");
		if (code_typeObj != null)
			code_type = code_typeObj.toString();

		Object user_idObj = map.get("user_id");
		if (user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if (user_nameObj != null)
			user_name = user_nameObj.toString();

		Object buyer_user_nameObj = map.get("buyer_user_name");
		if (buyer_user_nameObj != null)
			buyer_user_name = buyer_user_nameObj.toString();

		Object buyer_user_idObj = map.get("buyer_user_id");
		if (buyer_user_idObj != null)
			buyer_user_id = buyer_user_idObj.toString();

		Object test_idObj = map.get("test_id");
		if (test_idObj != null)
			test_id = test_idObj.toString();

		Object test_nameObj = map.get("test_name");
		if (test_nameObj != null)
			test_name = test_nameObj.toString();

		Object test_amountObj = map.get("test_amount");
		if (test_amountObj != null)
			test_amount = new Double(test_amountObj.toString());

		Object percentageObj = map.get("percentage");
		if (percentageObj != null)
			percentage = new Double(percentageObj.toString());

		Object amountObj = map.get("amount");
		if (amountObj != null)
			amount = new Double(amountObj.toString());

		Object statusObj = map.get("status");
		if (statusObj != null)
			status = statusObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if (creation_timeObj != null)
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
		if (add && id == null)
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

	public String getCode_type() {
		return code_type;
	}

	public String getCode_typeEx() {
		return code_type != null ? code_type : "";
	}

	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}

	public void unSetCode_type() {
		this.code_type = null;
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

	public String getBuyer_user_name() {
		return buyer_user_name;
	}

	public String getBuyer_user_nameEx() {
		return buyer_user_name != null ? buyer_user_name : "";
	}

	public void setBuyer_user_name(String buyer_user_name) {
		this.buyer_user_name = buyer_user_name;
	}

	public void unSetBuyer_user_name() {
		this.buyer_user_name = null;
	}

	public String getBuyer_user_id() {
		return buyer_user_id;
	}

	public String getBuyer_user_idEx() {
		return buyer_user_id != null ? buyer_user_id : "";
	}

	public void setBuyer_user_id(String buyer_user_id) {
		this.buyer_user_id = buyer_user_id;
	}

	public void unSetBuyer_user_id() {
		this.buyer_user_id = null;
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

	public Double getTest_amount() {
		return test_amount;
	}

	public double getTest_amountEx() {
		return test_amount != null ? test_amount : 0;
	}

	public void setTest_amount(double test_amount) {
		this.test_amount = test_amount;
	}

	public void setTest_amount(Double test_amount) {
		this.test_amount = test_amount;
	}

	public void unSetTest_amount() {
		this.test_amount = null;
	}

	public Double getPercentage() {
		return percentage;
	}

	public double getPercentageEx() {
		return percentage != null ? percentage : 0;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public void unSetPercentage() {
		this.percentage = null;
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

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
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
		if (extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}

	public String getCluster() {
		return "DB_LOG";
	}

	public String getClusterType() {
		return "REPLICATED";
	}
}