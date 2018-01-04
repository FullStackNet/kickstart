/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseappliance_recharge extends BaseResource {
	private String id = null;
	private String location_id = null;
	private String location_name = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String appliance_serialno = null;
	private Long recharge_date = null;
	private String recharge_date_str = null;
	private Double recharge_amount = null;
	private String recharge_method = null;
	private String cheque_number = null;
	private String cheque_date = null;
	private String bank = null;
	private String transction_id = null;
	private String transction_type = null;
	private String customer_id = null;
	private String creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_LOCATION_ID = "location_id";
	public static String FIELD_LOCATION_NAME = "location_name";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_APPLIANCE_SERIALNO = "appliance_serialno";
	public static String FIELD_RECHARGE_DATE = "recharge_date";
	public static String FIELD_RECHARGE_DATE_STR = "recharge_date_str";
	public static String FIELD_RECHARGE_AMOUNT = "recharge_amount";
	public static String FIELD_RECHARGE_METHOD = "recharge_method";
	public static String FIELD_CHEQUE_NUMBER = "cheque_number";
	public static String FIELD_CHEQUE_DATE = "cheque_date";
	public static String FIELD_BANK = "bank";
	public static String FIELD_TRANSCTION_ID = "transction_id";
	public static String FIELD_TRANSCTION_TYPE = "transction_type";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_recharge");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setLength(128);
		metaData.addField(idField);

		Field location_idField = new Field("location_id", "String");
		location_idField.setRequired(true);
		location_idField.setLength(128);
		metaData.addField(location_idField);

		Field location_nameField = new Field("location_name", "String");
		location_nameField.setRequired(true);
		location_nameField.setLength(128);
		metaData.addField(location_nameField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setRequired(true);
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field appliance_serialnoField = new Field("appliance_serialno", "String");
		appliance_serialnoField.setRequired(true);
		appliance_serialnoField.setLength(128);
		metaData.addField(appliance_serialnoField);

		Field recharge_dateField = new Field("recharge_date", "long");
		metaData.addField(recharge_dateField);

		Field recharge_date_strField = new Field("recharge_date_str", "String");
		metaData.addField(recharge_date_strField);

		Field recharge_amountField = new Field("recharge_amount", "double");
		metaData.addField(recharge_amountField);

		Field recharge_methodField = new Field("recharge_method", "String");
		recharge_methodField.setLength(128);
		metaData.addField(recharge_methodField);

		Field cheque_numberField = new Field("cheque_number", "String");
		cheque_numberField.setLength(128);
		metaData.addField(cheque_numberField);

		Field cheque_dateField = new Field("cheque_date", "String");
		cheque_dateField.setLength(128);
		metaData.addField(cheque_dateField);

		Field bankField = new Field("bank", "String");
		bankField.setLength(128);
		metaData.addField(bankField);

		Field transction_idField = new Field("transction_id", "String");
		transction_idField.setLength(128);
		metaData.addField(transction_idField);

		Field transction_typeField = new Field("transction_type", "String");
		transction_typeField.setLength(128);
		metaData.addField(transction_typeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "String");
		creation_timeField.setLength(128);
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_recharge");

		metaData.setCluster("DB_LOG");
	}

	public Baseappliance_recharge() {}

	public Baseappliance_recharge(Baseappliance_recharge obj) {
		this.id = obj.id;
		this.location_id = obj.location_id;
		this.location_name = obj.location_name;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.appliance_serialno = obj.appliance_serialno;
		this.recharge_date = obj.recharge_date;
		this.recharge_date_str = obj.recharge_date_str;
		this.recharge_amount = obj.recharge_amount;
		this.recharge_method = obj.recharge_method;
		this.cheque_number = obj.cheque_number;
		this.cheque_date = obj.cheque_date;
		this.bank = obj.bank;
		this.transction_id = obj.transction_id;
		this.transction_type = obj.transction_type;
		this.customer_id = obj.customer_id;
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
		if(location_id != null)
			map.put("location_id", location_id);
		if(location_name != null)
			map.put("location_name", location_name);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(appliance_serialno != null)
			map.put("appliance_serialno", appliance_serialno);
		if(recharge_date != null)
			map.put("recharge_date", recharge_date);
		if(recharge_date_str != null)
			map.put("recharge_date_str", recharge_date_str);
		if(recharge_amount != null)
			map.put("recharge_amount", recharge_amount);
		if(recharge_method != null)
			map.put("recharge_method", recharge_method);
		if(cheque_number != null)
			map.put("cheque_number", cheque_number);
		if(cheque_date != null)
			map.put("cheque_date", cheque_date);
		if(bank != null)
			map.put("bank", bank);
		if(transction_id != null)
			map.put("transction_id", transction_id);
		if(transction_type != null)
			map.put("transction_type", transction_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(validateLocation_id(add))
			map.put("location_id", location_id);
		if(validateLocation_name(add))
			map.put("location_name", location_name);
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateAppliance_name(add))
			map.put("appliance_name", appliance_name);
		if(validateAppliance_serialno(add))
			map.put("appliance_serialno", appliance_serialno);
		if(recharge_date != null)
			map.put("recharge_date", recharge_date);
		if(recharge_date_str != null)
			map.put("recharge_date_str", recharge_date_str);
		if(recharge_amount != null)
			map.put("recharge_amount", recharge_amount);
		if(recharge_method != null)
			map.put("recharge_method", recharge_method);
		if(cheque_number != null)
			map.put("cheque_number", cheque_number);
		if(cheque_date != null)
			map.put("cheque_date", cheque_date);
		if(bank != null)
			map.put("bank", bank);
		if(transction_id != null)
			map.put("transction_id", transction_id);
		if(transction_type != null)
			map.put("transction_type", transction_type);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		location_id = (String) map.get("location_id");
		location_name = (String) map.get("location_name");
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		appliance_serialno = (String) map.get("appliance_serialno");
		recharge_date = (Long) map.get("recharge_date");
		recharge_date_str = (String) map.get("recharge_date_str");
		recharge_amount = (Double) map.get("recharge_amount");
		recharge_method = (String) map.get("recharge_method");
		cheque_number = (String) map.get("cheque_number");
		cheque_date = (String) map.get("cheque_date");
		bank = (String) map.get("bank");
		transction_id = (String) map.get("transction_id");
		transction_type = (String) map.get("transction_type");
		customer_id = (String) map.get("customer_id");
		creation_time = (String) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object location_idObj = map.get("location_id");
		if(location_idObj != null)
			location_id = location_idObj.toString();

		Object location_nameObj = map.get("location_name");
		if(location_nameObj != null)
			location_name = location_nameObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object appliance_serialnoObj = map.get("appliance_serialno");
		if(appliance_serialnoObj != null)
			appliance_serialno = appliance_serialnoObj.toString();

		Object recharge_dateObj = map.get("recharge_date");
		if(recharge_dateObj != null)
			recharge_date = new Long(recharge_dateObj.toString());

		Object recharge_date_strObj = map.get("recharge_date_str");
		if(recharge_date_strObj != null)
			recharge_date_str = recharge_date_strObj.toString();

		Object recharge_amountObj = map.get("recharge_amount");
		if(recharge_amountObj != null)
			recharge_amount = new Double(recharge_amountObj.toString());

		Object recharge_methodObj = map.get("recharge_method");
		if(recharge_methodObj != null)
			recharge_method = recharge_methodObj.toString();

		Object cheque_numberObj = map.get("cheque_number");
		if(cheque_numberObj != null)
			cheque_number = cheque_numberObj.toString();

		Object cheque_dateObj = map.get("cheque_date");
		if(cheque_dateObj != null)
			cheque_date = cheque_dateObj.toString();

		Object bankObj = map.get("bank");
		if(bankObj != null)
			bank = bankObj.toString();

		Object transction_idObj = map.get("transction_id");
		if(transction_idObj != null)
			transction_id = transction_idObj.toString();

		Object transction_typeObj = map.get("transction_type");
		if(transction_typeObj != null)
			transction_type = transction_typeObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = creation_timeObj.toString();

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

	public String getLocation_id() {
		return location_id;
	}

	public String getLocation_idEx() {
		return location_id != null ? location_id : "";
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public void unSetLocation_id() {
		this.location_id = null;
	}

	public boolean validateLocation_id(boolean add) throws ApplicationException {
		if(add && location_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[location_id]");
		return location_id != null;
	}

	public String getLocation_name() {
		return location_name;
	}

	public String getLocation_nameEx() {
		return location_name != null ? location_name : "";
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public void unSetLocation_name() {
		this.location_name = null;
	}

	public boolean validateLocation_name(boolean add) throws ApplicationException {
		if(add && location_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[location_name]");
		return location_name != null;
	}

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public boolean validateAppliance_id(boolean add) throws ApplicationException {
		if(add && appliance_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_id]");
		return appliance_id != null;
	}

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
	}

	public boolean validateAppliance_name(boolean add) throws ApplicationException {
		if(add && appliance_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_name]");
		return appliance_name != null;
	}

	public String getAppliance_serialno() {
		return appliance_serialno;
	}

	public String getAppliance_serialnoEx() {
		return appliance_serialno != null ? appliance_serialno : "";
	}

	public void setAppliance_serialno(String appliance_serialno) {
		this.appliance_serialno = appliance_serialno;
	}

	public void unSetAppliance_serialno() {
		this.appliance_serialno = null;
	}

	public boolean validateAppliance_serialno(boolean add) throws ApplicationException {
		if(add && appliance_serialno == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_serialno]");
		return appliance_serialno != null;
	}

	public Long getRecharge_date() {
		return recharge_date;
	}

	public long getRecharge_dateEx() {
		return recharge_date != null ? recharge_date : 0L;
	}

	public void setRecharge_date(long recharge_date) {
		this.recharge_date = recharge_date;
	}

	public void setRecharge_date(Long recharge_date) {
		this.recharge_date = recharge_date;
	}

	public void unSetRecharge_date() {
		this.recharge_date = null;
	}

	public String getRecharge_date_str() {
		return recharge_date_str;
	}

	public String getRecharge_date_strEx() {
		return recharge_date_str != null ? recharge_date_str : "";
	}

	public void setRecharge_date_str(String recharge_date_str) {
		this.recharge_date_str = recharge_date_str;
	}

	public void unSetRecharge_date_str() {
		this.recharge_date_str = null;
	}

	public Double getRecharge_amount() {
		return recharge_amount;
	}

	public double getRecharge_amountEx() {
		return recharge_amount != null ? recharge_amount : 0;
	}

	public void setRecharge_amount(double recharge_amount) {
		this.recharge_amount = recharge_amount;
	}

	public void setRecharge_amount(Double recharge_amount) {
		this.recharge_amount = recharge_amount;
	}

	public void unSetRecharge_amount() {
		this.recharge_amount = null;
	}

	public String getRecharge_method() {
		return recharge_method;
	}

	public String getRecharge_methodEx() {
		return recharge_method != null ? recharge_method : "";
	}

	public void setRecharge_method(String recharge_method) {
		this.recharge_method = recharge_method;
	}

	public void unSetRecharge_method() {
		this.recharge_method = null;
	}

	public String getCheque_number() {
		return cheque_number;
	}

	public String getCheque_numberEx() {
		return cheque_number != null ? cheque_number : "";
	}

	public void setCheque_number(String cheque_number) {
		this.cheque_number = cheque_number;
	}

	public void unSetCheque_number() {
		this.cheque_number = null;
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

	public String getBank() {
		return bank;
	}

	public String getBankEx() {
		return bank != null ? bank : "";
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public void unSetBank() {
		this.bank = null;
	}

	public String getTransction_id() {
		return transction_id;
	}

	public String getTransction_idEx() {
		return transction_id != null ? transction_id : "";
	}

	public void setTransction_id(String transction_id) {
		this.transction_id = transction_id;
	}

	public void unSetTransction_id() {
		this.transction_id = null;
	}

	public String getTransction_type() {
		return transction_type;
	}

	public String getTransction_typeEx() {
		return transction_type != null ? transction_type : "";
	}

	public void setTransction_type(String transction_type) {
		this.transction_type = transction_type;
	}

	public void unSetTransction_type() {
		this.transction_type = null;
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

	public String getCreation_time() {
		return creation_time;
	}

	public String getCreation_timeEx() {
		return creation_time != null ? creation_time : "";
	}

	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}

	public void unSetCreation_time() {
		this.creation_time = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}