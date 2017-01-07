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
public abstract class Baseschool_account extends BaseResource {
	private String id = null;
	private String name = null;
	private String student_id = null;
	private String customer_id = null;
	private Integer current_from_year = null;
	private Integer current_to_year = null;
	private Double opening_balance = null;
	private Double total_credit = null;
	private Double total_debit = null;
	private Double closing_balance = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CURRENT_FROM_YEAR = "current_from_year";
	public static String FIELD_CURRENT_TO_YEAR = "current_to_year";
	public static String FIELD_OPENING_BALANCE = "opening_balance";
	public static String FIELD_TOTAL_CREDIT = "total_credit";
	public static String FIELD_TOTAL_DEBIT = "total_debit";
	public static String FIELD_CLOSING_BALANCE = "closing_balance";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("school_account");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setIndexed(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field current_from_yearField = new Field("current_from_year", "int");
		metaData.addField(current_from_yearField);

		Field current_to_yearField = new Field("current_to_year", "int");
		metaData.addField(current_to_yearField);

		Field opening_balanceField = new Field("opening_balance", "double");
		metaData.addField(opening_balanceField);

		Field total_creditField = new Field("total_credit", "double");
		metaData.addField(total_creditField);

		Field total_debitField = new Field("total_debit", "double");
		metaData.addField(total_debitField);

		Field closing_balanceField = new Field("closing_balance", "double");
		metaData.addField(closing_balanceField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("school_account");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseschool_account() {}

	public Baseschool_account(Baseschool_account obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.student_id = obj.student_id;
		this.customer_id = obj.customer_id;
		this.current_from_year = obj.current_from_year;
		this.current_to_year = obj.current_to_year;
		this.opening_balance = obj.opening_balance;
		this.total_credit = obj.total_credit;
		this.total_debit = obj.total_debit;
		this.closing_balance = obj.closing_balance;
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
		if(name != null)
			map.put("name", name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(current_from_year != null)
			map.put("current_from_year", current_from_year);
		if(current_to_year != null)
			map.put("current_to_year", current_to_year);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
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
		if(name != null)
			map.put("name", name);
		if(student_id != null)
			map.put("student_id", student_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(current_from_year != null)
			map.put("current_from_year", current_from_year);
		if(current_to_year != null)
			map.put("current_to_year", current_to_year);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
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
		name = (String) map.get("name");
		student_id = (String) map.get("student_id");
		customer_id = (String) map.get("customer_id");
		current_from_year = (Integer) map.get("current_from_year");
		current_to_year = (Integer) map.get("current_to_year");
		opening_balance = (Double) map.get("opening_balance");
		total_credit = (Double) map.get("total_credit");
		total_debit = (Double) map.get("total_debit");
		closing_balance = (Double) map.get("closing_balance");
		creation_time = (Long) map.get("creation_time");
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

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object current_from_yearObj = map.get("current_from_year");
		if(current_from_yearObj != null)
			current_from_year = new Integer(current_from_yearObj.toString());

		Object current_to_yearObj = map.get("current_to_year");
		if(current_to_yearObj != null)
			current_to_year = new Integer(current_to_yearObj.toString());

		Object opening_balanceObj = map.get("opening_balance");
		if(opening_balanceObj != null)
			opening_balance = new Double(opening_balanceObj.toString());

		Object total_creditObj = map.get("total_credit");
		if(total_creditObj != null)
			total_credit = new Double(total_creditObj.toString());

		Object total_debitObj = map.get("total_debit");
		if(total_debitObj != null)
			total_debit = new Double(total_debitObj.toString());

		Object closing_balanceObj = map.get("closing_balance");
		if(closing_balanceObj != null)
			closing_balance = new Double(closing_balanceObj.toString());

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

	public Integer getCurrent_from_year() {
		return current_from_year;
	}

	public int getCurrent_from_yearEx() {
		return current_from_year != null ? current_from_year : 0;
	}

	public void setCurrent_from_year(int current_from_year) {
		this.current_from_year = current_from_year;
	}

	public void setCurrent_from_year(Integer current_from_year) {
		this.current_from_year = current_from_year;
	}

	public void unSetCurrent_from_year() {
		this.current_from_year = null;
	}

	public Integer getCurrent_to_year() {
		return current_to_year;
	}

	public int getCurrent_to_yearEx() {
		return current_to_year != null ? current_to_year : 0;
	}

	public void setCurrent_to_year(int current_to_year) {
		this.current_to_year = current_to_year;
	}

	public void setCurrent_to_year(Integer current_to_year) {
		this.current_to_year = current_to_year;
	}

	public void unSetCurrent_to_year() {
		this.current_to_year = null;
	}

	public Double getOpening_balance() {
		return opening_balance;
	}

	public double getOpening_balanceEx() {
		return opening_balance != null ? opening_balance : 0;
	}

	public void setOpening_balance(double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void unSetOpening_balance() {
		this.opening_balance = null;
	}

	public Double getTotal_credit() {
		return total_credit;
	}

	public double getTotal_creditEx() {
		return total_credit != null ? total_credit : 0;
	}

	public void setTotal_credit(double total_credit) {
		this.total_credit = total_credit;
	}

	public void setTotal_credit(Double total_credit) {
		this.total_credit = total_credit;
	}

	public void unSetTotal_credit() {
		this.total_credit = null;
	}

	public Double getTotal_debit() {
		return total_debit;
	}

	public double getTotal_debitEx() {
		return total_debit != null ? total_debit : 0;
	}

	public void setTotal_debit(double total_debit) {
		this.total_debit = total_debit;
	}

	public void setTotal_debit(Double total_debit) {
		this.total_debit = total_debit;
	}

	public void unSetTotal_debit() {
		this.total_debit = null;
	}

	public Double getClosing_balance() {
		return closing_balance;
	}

	public double getClosing_balanceEx() {
		return closing_balance != null ? closing_balance : 0;
	}

	public void setClosing_balance(double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void setClosing_balance(Double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void unSetClosing_balance() {
		this.closing_balance = null;
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