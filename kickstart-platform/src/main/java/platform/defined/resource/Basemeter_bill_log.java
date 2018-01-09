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
public abstract class Basemeter_bill_log extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String customer_id = null;
	private String source = null;
	private String process_status = null; //NP,PR,PD
	private Long process_time = null;
	private Long creation_time = null;
	private Double opening_reading = null;
	private Double current_reading = null;
	private Double current_consumption = null;
	private Double current_consumption_month = null;
	private Double current_amount = null;
	private Double rate = null;
	private Double balance = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SOURCE = "source";
	public static String FIELD_PROCESS_STATUS = "process_status";
	public static String FIELD_PROCESS_TIME = "process_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_OPENING_READING = "opening_reading";
	public static String FIELD_CURRENT_READING = "current_reading";
	public static String FIELD_CURRENT_CONSUMPTION = "current_consumption";
	public static String FIELD_CURRENT_CONSUMPTION_MONTH = "current_consumption_month";
	public static String FIELD_CURRENT_AMOUNT = "current_amount";
	public static String FIELD_RATE = "rate";
	public static String FIELD_BALANCE = "balance";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("meter_bill_log");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field sourceField = new Field("source", "String");
		sourceField.setLength(128);
		metaData.addField(sourceField);

		Field process_statusField = new Field("process_status", "String");
		process_statusField.setLength(16);
		metaData.addField(process_statusField);

		Field process_timeField = new Field("process_time", "timestamp");
		metaData.addField(process_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field opening_readingField = new Field("opening_reading", "double");
		opening_readingField.setDefaultValue(0.0000);
		opening_readingField.setLength(12);
		opening_readingField.setPrecision(4);
		metaData.addField(opening_readingField);

		Field current_readingField = new Field("current_reading", "double");
		current_readingField.setDefaultValue(0.0000);
		current_readingField.setLength(12);
		current_readingField.setPrecision(4);
		metaData.addField(current_readingField);

		Field current_consumptionField = new Field("current_consumption", "double");
		current_consumptionField.setDefaultValue(0.0000);
		current_consumptionField.setLength(12);
		current_consumptionField.setPrecision(4);
		metaData.addField(current_consumptionField);

		Field current_consumption_monthField = new Field("current_consumption_month", "double");
		current_consumption_monthField.setDefaultValue(0.0000);
		current_consumption_monthField.setLength(12);
		current_consumption_monthField.setPrecision(4);
		metaData.addField(current_consumption_monthField);

		Field current_amountField = new Field("current_amount", "double");
		current_amountField.setDefaultValue(0.0000);
		current_amountField.setLength(12);
		current_amountField.setPrecision(4);
		metaData.addField(current_amountField);

		Field rateField = new Field("rate", "double");
		rateField.setDefaultValue(0.0000);
		rateField.setLength(12);
		rateField.setPrecision(4);
		metaData.addField(rateField);

		Field balanceField = new Field("balance", "double");
		balanceField.setDefaultValue(0.0000);
		balanceField.setLength(12);
		balanceField.setPrecision(4);
		metaData.addField(balanceField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("meter_bill_log");

		metaData.setCluster("DB_LOG");
	}

	public Basemeter_bill_log() {}

	public Basemeter_bill_log(Basemeter_bill_log obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.customer_id = obj.customer_id;
		this.source = obj.source;
		this.process_status = obj.process_status;
		this.process_time = obj.process_time;
		this.creation_time = obj.creation_time;
		this.opening_reading = obj.opening_reading;
		this.current_reading = obj.current_reading;
		this.current_consumption = obj.current_consumption;
		this.current_consumption_month = obj.current_consumption_month;
		this.current_amount = obj.current_amount;
		this.rate = obj.rate;
		this.balance = obj.balance;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(opening_reading == null)
			opening_reading = 0.0000;
		if(current_reading == null)
			current_reading = 0.0000;
		if(current_consumption == null)
			current_consumption = 0.0000;
		if(current_consumption_month == null)
			current_consumption_month = 0.0000;
		if(current_amount == null)
			current_amount = 0.0000;
		if(rate == null)
			rate = 0.0000;
		if(balance == null)
			balance = 0.0000;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(process_status != null)
			map.put("process_status", process_status);
		if(process_time != null)
			map.put("process_time", process_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(opening_reading != null)
			map.put("opening_reading", opening_reading);
		if(current_reading != null)
			map.put("current_reading", current_reading);
		if(current_consumption != null)
			map.put("current_consumption", current_consumption);
		if(current_consumption_month != null)
			map.put("current_consumption_month", current_consumption_month);
		if(current_amount != null)
			map.put("current_amount", current_amount);
		if(rate != null)
			map.put("rate", rate);
		if(balance != null)
			map.put("balance", balance);
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
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(process_status != null)
			map.put("process_status", process_status);
		if(process_time != null)
			map.put("process_time", process_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(opening_reading != null)
			map.put("opening_reading", opening_reading);
		if(current_reading != null)
			map.put("current_reading", current_reading);
		if(current_consumption != null)
			map.put("current_consumption", current_consumption);
		if(current_consumption_month != null)
			map.put("current_consumption_month", current_consumption_month);
		if(current_amount != null)
			map.put("current_amount", current_amount);
		if(rate != null)
			map.put("rate", rate);
		if(balance != null)
			map.put("balance", balance);
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
		appliance_id = (String) map.get("appliance_id");
		customer_id = (String) map.get("customer_id");
		source = (String) map.get("source");
		process_status = (String) map.get("process_status");
		process_time = (Long) map.get("process_time");
		creation_time = (Long) map.get("creation_time");
		opening_reading = (Double) map.get("opening_reading");
		current_reading = (Double) map.get("current_reading");
		current_consumption = (Double) map.get("current_consumption");
		current_consumption_month = (Double) map.get("current_consumption_month");
		current_amount = (Double) map.get("current_amount");
		rate = (Double) map.get("rate");
		balance = (Double) map.get("balance");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object sourceObj = map.get("source");
		if(sourceObj != null)
			source = sourceObj.toString();

		Object process_statusObj = map.get("process_status");
		if(process_statusObj != null)
			process_status = process_statusObj.toString();

		Object process_timeObj = map.get("process_time");
		if(process_timeObj != null)
			process_time = new Long(process_timeObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object opening_readingObj = map.get("opening_reading");
		if(opening_readingObj != null)
			opening_reading = new Double(opening_readingObj.toString());

		Object current_readingObj = map.get("current_reading");
		if(current_readingObj != null)
			current_reading = new Double(current_readingObj.toString());

		Object current_consumptionObj = map.get("current_consumption");
		if(current_consumptionObj != null)
			current_consumption = new Double(current_consumptionObj.toString());

		Object current_consumption_monthObj = map.get("current_consumption_month");
		if(current_consumption_monthObj != null)
			current_consumption_month = new Double(current_consumption_monthObj.toString());

		Object current_amountObj = map.get("current_amount");
		if(current_amountObj != null)
			current_amount = new Double(current_amountObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object balanceObj = map.get("balance");
		if(balanceObj != null)
			balance = new Double(balanceObj.toString());

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

	public String getSource() {
		return source;
	}

	public String getSourceEx() {
		return source != null ? source : "";
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void unSetSource() {
		this.source = null;
	}

	public String getProcess_status() {
		return process_status;
	}

	public String getProcess_statusEx() {
		return process_status != null ? process_status : "";
	}

	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}

	public void unSetProcess_status() {
		this.process_status = null;
	}

	public Long getProcess_time() {
		return process_time;
	}

	public void setProcess_time(Long process_time) {
		this.process_time = process_time;
	}


	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Double getOpening_reading() {
		return opening_reading != null ? opening_reading : 0.0000;
	}

	public void setOpening_reading(double opening_reading) {
		this.opening_reading = opening_reading;
	}

	public void setOpening_reading(Double opening_reading) {
		this.opening_reading = opening_reading;
	}

	public void unSetOpening_reading() {
		this.opening_reading = 0.0000;
	}

	public Double getCurrent_reading() {
		return current_reading != null ? current_reading : 0.0000;
	}

	public void setCurrent_reading(double current_reading) {
		this.current_reading = current_reading;
	}

	public void setCurrent_reading(Double current_reading) {
		this.current_reading = current_reading;
	}

	public void unSetCurrent_reading() {
		this.current_reading = 0.0000;
	}

	public Double getCurrent_consumption() {
		return current_consumption != null ? current_consumption : 0.0000;
	}

	public void setCurrent_consumption(double current_consumption) {
		this.current_consumption = current_consumption;
	}

	public void setCurrent_consumption(Double current_consumption) {
		this.current_consumption = current_consumption;
	}

	public void unSetCurrent_consumption() {
		this.current_consumption = 0.0000;
	}

	public Double getCurrent_consumption_month() {
		return current_consumption_month != null ? current_consumption_month : 0.0000;
	}

	public void setCurrent_consumption_month(double current_consumption_month) {
		this.current_consumption_month = current_consumption_month;
	}

	public void setCurrent_consumption_month(Double current_consumption_month) {
		this.current_consumption_month = current_consumption_month;
	}

	public void unSetCurrent_consumption_month() {
		this.current_consumption_month = 0.0000;
	}

	public Double getCurrent_amount() {
		return current_amount != null ? current_amount : 0.0000;
	}

	public void setCurrent_amount(double current_amount) {
		this.current_amount = current_amount;
	}

	public void setCurrent_amount(Double current_amount) {
		this.current_amount = current_amount;
	}

	public void unSetCurrent_amount() {
		this.current_amount = 0.0000;
	}

	public Double getRate() {
		return rate != null ? rate : 0.0000;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public void unSetRate() {
		this.rate = 0.0000;
	}

	public Double getBalance() {
		return balance != null ? balance : 0.0000;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = 0.0000;
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