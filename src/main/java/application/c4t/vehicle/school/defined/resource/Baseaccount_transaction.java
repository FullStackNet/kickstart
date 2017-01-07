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
public abstract class Baseaccount_transaction extends BaseResource {
	private String id = null;
	private Long transaction_date = null;
	private String transaction_date_str = null;
	private String account_id = null;
	private String student_id = null;
	private String school_id = null;
	private String account_name = null;
	private String accounting_head_id = null;
	private String accounting_head_name = null;
	private Double credit_amount = null;
	private Double debit_amount = null;
	private String remark = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TRANSACTION_DATE = "transaction_date";
	public static String FIELD_TRANSACTION_DATE_STR = "transaction_date_str";
	public static String FIELD_ACCOUNT_ID = "account_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_ACCOUNT_NAME = "account_name";
	public static String FIELD_ACCOUNTING_HEAD_ID = "accounting_head_id";
	public static String FIELD_ACCOUNTING_HEAD_NAME = "accounting_head_name";
	public static String FIELD_CREDIT_AMOUNT = "credit_amount";
	public static String FIELD_DEBIT_AMOUNT = "debit_amount";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("account_transaction");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field transaction_dateField = new Field("transaction_date", "timestamp");
		metaData.addField(transaction_dateField);

		Field transaction_date_strField = new Field("transaction_date_str", "String");
		transaction_date_strField.setLength(32);
		metaData.addField(transaction_date_strField);

		Field account_idField = new Field("account_id", "String");
		account_idField.setIndexed(true);
		account_idField.setLength(128);
		metaData.addField(account_idField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field account_nameField = new Field("account_name", "String");
		account_nameField.setLength(128);
		metaData.addField(account_nameField);

		Field accounting_head_idField = new Field("accounting_head_id", "String");
		accounting_head_idField.setLength(128);
		metaData.addField(accounting_head_idField);

		Field accounting_head_nameField = new Field("accounting_head_name", "String");
		accounting_head_nameField.setLength(128);
		metaData.addField(accounting_head_nameField);

		Field credit_amountField = new Field("credit_amount", "double");
		metaData.addField(credit_amountField);

		Field debit_amountField = new Field("debit_amount", "double");
		metaData.addField(debit_amountField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(256);
		metaData.addField(remarkField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("account_transaction");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseaccount_transaction() {}

	public Baseaccount_transaction(Baseaccount_transaction obj) {
		this.id = obj.id;
		this.transaction_date = obj.transaction_date;
		this.transaction_date_str = obj.transaction_date_str;
		this.account_id = obj.account_id;
		this.student_id = obj.student_id;
		this.school_id = obj.school_id;
		this.account_name = obj.account_name;
		this.accounting_head_id = obj.accounting_head_id;
		this.accounting_head_name = obj.accounting_head_name;
		this.credit_amount = obj.credit_amount;
		this.debit_amount = obj.debit_amount;
		this.remark = obj.remark;
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
		if(transaction_date != null)
			map.put("transaction_date", transaction_date);
		if(transaction_date_str != null)
			map.put("transaction_date_str", transaction_date_str);
		if(account_id != null)
			map.put("account_id", account_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(account_name != null)
			map.put("account_name", account_name);
		if(accounting_head_id != null)
			map.put("accounting_head_id", accounting_head_id);
		if(accounting_head_name != null)
			map.put("accounting_head_name", accounting_head_name);
		if(credit_amount != null)
			map.put("credit_amount", credit_amount);
		if(debit_amount != null)
			map.put("debit_amount", debit_amount);
		if(remark != null)
			map.put("remark", remark);
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
		if(transaction_date != null)
			map.put("transaction_date", transaction_date);
		if(transaction_date_str != null)
			map.put("transaction_date_str", transaction_date_str);
		if(account_id != null)
			map.put("account_id", account_id);
		if(student_id != null)
			map.put("student_id", student_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(account_name != null)
			map.put("account_name", account_name);
		if(accounting_head_id != null)
			map.put("accounting_head_id", accounting_head_id);
		if(accounting_head_name != null)
			map.put("accounting_head_name", accounting_head_name);
		if(credit_amount != null)
			map.put("credit_amount", credit_amount);
		if(debit_amount != null)
			map.put("debit_amount", debit_amount);
		if(remark != null)
			map.put("remark", remark);
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
		transaction_date = (Long) map.get("transaction_date");
		transaction_date_str = (String) map.get("transaction_date_str");
		account_id = (String) map.get("account_id");
		student_id = (String) map.get("student_id");
		school_id = (String) map.get("school_id");
		account_name = (String) map.get("account_name");
		accounting_head_id = (String) map.get("accounting_head_id");
		accounting_head_name = (String) map.get("accounting_head_name");
		credit_amount = (Double) map.get("credit_amount");
		debit_amount = (Double) map.get("debit_amount");
		remark = (String) map.get("remark");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object transaction_dateObj = map.get("transaction_date");
		if(transaction_dateObj != null)
			transaction_date = new Long(transaction_dateObj.toString());

		Object transaction_date_strObj = map.get("transaction_date_str");
		if(transaction_date_strObj != null)
			transaction_date_str = transaction_date_strObj.toString();

		Object account_idObj = map.get("account_id");
		if(account_idObj != null)
			account_id = account_idObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object account_nameObj = map.get("account_name");
		if(account_nameObj != null)
			account_name = account_nameObj.toString();

		Object accounting_head_idObj = map.get("accounting_head_id");
		if(accounting_head_idObj != null)
			accounting_head_id = accounting_head_idObj.toString();

		Object accounting_head_nameObj = map.get("accounting_head_name");
		if(accounting_head_nameObj != null)
			accounting_head_name = accounting_head_nameObj.toString();

		Object credit_amountObj = map.get("credit_amount");
		if(credit_amountObj != null)
			credit_amount = new Double(credit_amountObj.toString());

		Object debit_amountObj = map.get("debit_amount");
		if(debit_amountObj != null)
			debit_amount = new Double(debit_amountObj.toString());

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

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

	public Long getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Long transaction_date) {
		this.transaction_date = transaction_date;
	}


	public String getTransaction_date_str() {
		return transaction_date_str;
	}

	public String getTransaction_date_strEx() {
		return transaction_date_str != null ? transaction_date_str : "";
	}

	public void setTransaction_date_str(String transaction_date_str) {
		this.transaction_date_str = transaction_date_str;
	}

	public void unSetTransaction_date_str() {
		this.transaction_date_str = null;
	}

	public String getAccount_id() {
		return account_id;
	}

	public String getAccount_idEx() {
		return account_id != null ? account_id : "";
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public void unSetAccount_id() {
		this.account_id = null;
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

	public String getAccount_name() {
		return account_name;
	}

	public String getAccount_nameEx() {
		return account_name != null ? account_name : "";
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public void unSetAccount_name() {
		this.account_name = null;
	}

	public String getAccounting_head_id() {
		return accounting_head_id;
	}

	public String getAccounting_head_idEx() {
		return accounting_head_id != null ? accounting_head_id : "";
	}

	public void setAccounting_head_id(String accounting_head_id) {
		this.accounting_head_id = accounting_head_id;
	}

	public void unSetAccounting_head_id() {
		this.accounting_head_id = null;
	}

	public String getAccounting_head_name() {
		return accounting_head_name;
	}

	public String getAccounting_head_nameEx() {
		return accounting_head_name != null ? accounting_head_name : "";
	}

	public void setAccounting_head_name(String accounting_head_name) {
		this.accounting_head_name = accounting_head_name;
	}

	public void unSetAccounting_head_name() {
		this.accounting_head_name = null;
	}

	public Double getCredit_amount() {
		return credit_amount;
	}

	public double getCredit_amountEx() {
		return credit_amount != null ? credit_amount : 0;
	}

	public void setCredit_amount(double credit_amount) {
		this.credit_amount = credit_amount;
	}

	public void setCredit_amount(Double credit_amount) {
		this.credit_amount = credit_amount;
	}

	public void unSetCredit_amount() {
		this.credit_amount = null;
	}

	public Double getDebit_amount() {
		return debit_amount;
	}

	public double getDebit_amountEx() {
		return debit_amount != null ? debit_amount : 0;
	}

	public void setDebit_amount(double debit_amount) {
		this.debit_amount = debit_amount;
	}

	public void setDebit_amount(Double debit_amount) {
		this.debit_amount = debit_amount;
	}

	public void unSetDebit_amount() {
		this.debit_amount = null;
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