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
public abstract class Basefee_receipt extends BaseResource {
	private String id = null;
	private String receipt_no = null;
	private String school_id = null;
	private String school_name = null;
	private String customer_id = null;
	private String student_id = null;
	private String student_name = null;
	private String class_name = null;
	private String section_name = null;
	private Double amount = null;
	private String payment_date_str = null;
	private Long payment_date = null;
	private String payment_approval = null;
	private String payment_method = null;
	private String bank_name = null;
	private String cheque_no = null;
	private String cheque_date = null;
	private String approval_date = null;
	private String cheque_status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_RECEIPT_NO = "receipt_no";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_PAYMENT_DATE_STR = "payment_date_str";
	public static String FIELD_PAYMENT_DATE = "payment_date";
	public static String FIELD_PAYMENT_APPROVAL = "payment_approval";
	public static String FIELD_PAYMENT_METHOD = "payment_method";
	public static String FIELD_BANK_NAME = "bank_name";
	public static String FIELD_CHEQUE_NO = "cheque_no";
	public static String FIELD_CHEQUE_DATE = "cheque_date";
	public static String FIELD_APPROVAL_DATE = "approval_date";
	public static String FIELD_CHEQUE_STATUS = "cheque_status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("fee_receipt");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field receipt_noField = new Field("receipt_no", "String");
		receipt_noField.setLength(128);
		metaData.addField(receipt_noField);

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

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field payment_date_strField = new Field("payment_date_str", "String");
		payment_date_strField.setLength(32);
		metaData.addField(payment_date_strField);

		Field payment_dateField = new Field("payment_date", "long");
		metaData.addField(payment_dateField);

		Field payment_approvalField = new Field("payment_approval", "String");
		payment_approvalField.setLength(1);
		metaData.addField(payment_approvalField);

		Field payment_methodField = new Field("payment_method", "String");
		payment_methodField.setLength(128);
		metaData.addField(payment_methodField);

		Field bank_nameField = new Field("bank_name", "String");
		bank_nameField.setLength(128);
		metaData.addField(bank_nameField);

		Field cheque_noField = new Field("cheque_no", "String");
		cheque_noField.setLength(128);
		metaData.addField(cheque_noField);

		Field cheque_dateField = new Field("cheque_date", "String");
		cheque_dateField.setLength(128);
		metaData.addField(cheque_dateField);

		Field approval_dateField = new Field("approval_date", "String");
		approval_dateField.setLength(128);
		metaData.addField(approval_dateField);

		Field cheque_statusField = new Field("cheque_status", "String");
		cheque_statusField.setLength(128);
		metaData.addField(cheque_statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("fee_receipt");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basefee_receipt() {}

	public Basefee_receipt(Basefee_receipt obj) {
		this.id = obj.id;
		this.receipt_no = obj.receipt_no;
		this.school_id = obj.school_id;
		this.school_name = obj.school_name;
		this.customer_id = obj.customer_id;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.amount = obj.amount;
		this.payment_date_str = obj.payment_date_str;
		this.payment_date = obj.payment_date;
		this.payment_approval = obj.payment_approval;
		this.payment_method = obj.payment_method;
		this.bank_name = obj.bank_name;
		this.cheque_no = obj.cheque_no;
		this.cheque_date = obj.cheque_date;
		this.approval_date = obj.approval_date;
		this.cheque_status = obj.cheque_status;
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
		if(receipt_no != null)
			map.put("receipt_no", receipt_no);
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
		if(amount != null)
			map.put("amount", amount);
		if(payment_date_str != null)
			map.put("payment_date_str", payment_date_str);
		if(payment_date != null)
			map.put("payment_date", payment_date);
		if(payment_approval != null)
			map.put("payment_approval", payment_approval);
		if(payment_method != null)
			map.put("payment_method", payment_method);
		if(bank_name != null)
			map.put("bank_name", bank_name);
		if(cheque_no != null)
			map.put("cheque_no", cheque_no);
		if(cheque_date != null)
			map.put("cheque_date", cheque_date);
		if(approval_date != null)
			map.put("approval_date", approval_date);
		if(cheque_status != null)
			map.put("cheque_status", cheque_status);
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
		if(receipt_no != null)
			map.put("receipt_no", receipt_no);
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
		if(amount != null)
			map.put("amount", amount);
		if(payment_date_str != null)
			map.put("payment_date_str", payment_date_str);
		if(payment_date != null)
			map.put("payment_date", payment_date);
		if(payment_approval != null)
			map.put("payment_approval", payment_approval);
		if(payment_method != null)
			map.put("payment_method", payment_method);
		if(bank_name != null)
			map.put("bank_name", bank_name);
		if(cheque_no != null)
			map.put("cheque_no", cheque_no);
		if(cheque_date != null)
			map.put("cheque_date", cheque_date);
		if(approval_date != null)
			map.put("approval_date", approval_date);
		if(cheque_status != null)
			map.put("cheque_status", cheque_status);
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
		receipt_no = (String) map.get("receipt_no");
		school_id = (String) map.get("school_id");
		school_name = (String) map.get("school_name");
		customer_id = (String) map.get("customer_id");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		amount = (Double) map.get("amount");
		payment_date_str = (String) map.get("payment_date_str");
		payment_date = (Long) map.get("payment_date");
		payment_approval = (String) map.get("payment_approval");
		payment_method = (String) map.get("payment_method");
		bank_name = (String) map.get("bank_name");
		cheque_no = (String) map.get("cheque_no");
		cheque_date = (String) map.get("cheque_date");
		approval_date = (String) map.get("approval_date");
		cheque_status = (String) map.get("cheque_status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object receipt_noObj = map.get("receipt_no");
		if(receipt_noObj != null)
			receipt_no = receipt_noObj.toString();

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

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object payment_date_strObj = map.get("payment_date_str");
		if(payment_date_strObj != null)
			payment_date_str = payment_date_strObj.toString();

		Object payment_dateObj = map.get("payment_date");
		if(payment_dateObj != null)
			payment_date = new Long(payment_dateObj.toString());

		Object payment_approvalObj = map.get("payment_approval");
		if(payment_approvalObj != null)
			payment_approval = payment_approvalObj.toString();

		Object payment_methodObj = map.get("payment_method");
		if(payment_methodObj != null)
			payment_method = payment_methodObj.toString();

		Object bank_nameObj = map.get("bank_name");
		if(bank_nameObj != null)
			bank_name = bank_nameObj.toString();

		Object cheque_noObj = map.get("cheque_no");
		if(cheque_noObj != null)
			cheque_no = cheque_noObj.toString();

		Object cheque_dateObj = map.get("cheque_date");
		if(cheque_dateObj != null)
			cheque_date = cheque_dateObj.toString();

		Object approval_dateObj = map.get("approval_date");
		if(approval_dateObj != null)
			approval_date = approval_dateObj.toString();

		Object cheque_statusObj = map.get("cheque_status");
		if(cheque_statusObj != null)
			cheque_status = cheque_statusObj.toString();

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

	public String getReceipt_no() {
		return receipt_no;
	}

	public String getReceipt_noEx() {
		return receipt_no != null ? receipt_no : "";
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public void unSetReceipt_no() {
		this.receipt_no = null;
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

	public String getPayment_date_str() {
		return payment_date_str;
	}

	public String getPayment_date_strEx() {
		return payment_date_str != null ? payment_date_str : "";
	}

	public void setPayment_date_str(String payment_date_str) {
		this.payment_date_str = payment_date_str;
	}

	public void unSetPayment_date_str() {
		this.payment_date_str = null;
	}

	public Long getPayment_date() {
		return payment_date;
	}

	public long getPayment_dateEx() {
		return payment_date != null ? payment_date : 0L;
	}

	public void setPayment_date(long payment_date) {
		this.payment_date = payment_date;
	}

	public void setPayment_date(Long payment_date) {
		this.payment_date = payment_date;
	}

	public void unSetPayment_date() {
		this.payment_date = null;
	}

	public String getPayment_approval() {
		return payment_approval;
	}

	public String getPayment_approvalEx() {
		return payment_approval != null ? payment_approval : "";
	}

	public void setPayment_approval(String payment_approval) {
		this.payment_approval = payment_approval;
	}

	public void unSetPayment_approval() {
		this.payment_approval = null;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public String getPayment_methodEx() {
		return payment_method != null ? payment_method : "";
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public void unSetPayment_method() {
		this.payment_method = null;
	}

	public String getBank_name() {
		return bank_name;
	}

	public String getBank_nameEx() {
		return bank_name != null ? bank_name : "";
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public void unSetBank_name() {
		this.bank_name = null;
	}

	public String getCheque_no() {
		return cheque_no;
	}

	public String getCheque_noEx() {
		return cheque_no != null ? cheque_no : "";
	}

	public void setCheque_no(String cheque_no) {
		this.cheque_no = cheque_no;
	}

	public void unSetCheque_no() {
		this.cheque_no = null;
	}

	public String getCheque_date() {
		return cheque_date;
	}

	public String getCheque_dateEx() {
		return cheque_date != null ? cheque_date : "";
	}

	public void setCheque_date(String cheque_date) {
		this.cheque_date = cheque_date;
	}

	public void unSetCheque_date() {
		this.cheque_date = null;
	}

	public String getApproval_date() {
		return approval_date;
	}

	public String getApproval_dateEx() {
		return approval_date != null ? approval_date : "";
	}

	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}

	public void unSetApproval_date() {
		this.approval_date = null;
	}

	public String getCheque_status() {
		return cheque_status;
	}

	public String getCheque_statusEx() {
		return cheque_status != null ? cheque_status : "";
	}

	public void setCheque_status(String cheque_status) {
		this.cheque_status = cheque_status;
	}

	public void unSetCheque_status() {
		this.cheque_status = null;
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