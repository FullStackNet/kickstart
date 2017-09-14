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
public abstract class Baseaccount_year extends BaseResource {
	private String id = null;
	private Integer from_year = null;
	private Integer to_year = null;
	private String account_id = null;
	private Double opening_balance = null;
	private Double total_debit = null;
	private Double total_credit = null;
	private Double closing_balance = null;
	private String closing_status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_FROM_YEAR = "from_year";
	public static String FIELD_TO_YEAR = "to_year";
	public static String FIELD_ACCOUNT_ID = "account_id";
	public static String FIELD_OPENING_BALANCE = "opening_balance";
	public static String FIELD_TOTAL_DEBIT = "total_debit";
	public static String FIELD_TOTAL_CREDIT = "total_credit";
	public static String FIELD_CLOSING_BALANCE = "closing_balance";
	public static String FIELD_CLOSING_STATUS = "closing_status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("account_year");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field from_yearField = new Field("from_year", "int");
		metaData.addField(from_yearField);

		Field to_yearField = new Field("to_year", "int");
		metaData.addField(to_yearField);

		Field account_idField = new Field("account_id", "String");
		account_idField.setIndexed(true);
		account_idField.setLength(128);
		metaData.addField(account_idField);

		Field opening_balanceField = new Field("opening_balance", "double");
		metaData.addField(opening_balanceField);

		Field total_debitField = new Field("total_debit", "double");
		metaData.addField(total_debitField);

		Field total_creditField = new Field("total_credit", "double");
		metaData.addField(total_creditField);

		Field closing_balanceField = new Field("closing_balance", "double");
		metaData.addField(closing_balanceField);

		Field closing_statusField = new Field("closing_status", "String");
		closing_statusField.setLength(1);
		metaData.addField(closing_statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("account_year");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseaccount_year() {}

	public Baseaccount_year(Baseaccount_year obj) {
		this.id = obj.id;
		this.from_year = obj.from_year;
		this.to_year = obj.to_year;
		this.account_id = obj.account_id;
		this.opening_balance = obj.opening_balance;
		this.total_debit = obj.total_debit;
		this.total_credit = obj.total_credit;
		this.closing_balance = obj.closing_balance;
		this.closing_status = obj.closing_status;
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
		if(from_year != null)
			map.put("from_year", from_year);
		if(to_year != null)
			map.put("to_year", to_year);
		if(account_id != null)
			map.put("account_id", account_id);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
		if(closing_status != null)
			map.put("closing_status", closing_status);
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
		if(from_year != null)
			map.put("from_year", from_year);
		if(to_year != null)
			map.put("to_year", to_year);
		if(account_id != null)
			map.put("account_id", account_id);
		if(opening_balance != null)
			map.put("opening_balance", opening_balance);
		if(total_debit != null)
			map.put("total_debit", total_debit);
		if(total_credit != null)
			map.put("total_credit", total_credit);
		if(closing_balance != null)
			map.put("closing_balance", closing_balance);
		if(closing_status != null)
			map.put("closing_status", closing_status);
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
		from_year = (Integer) map.get("from_year");
		to_year = (Integer) map.get("to_year");
		account_id = (String) map.get("account_id");
		opening_balance = (Double) map.get("opening_balance");
		total_debit = (Double) map.get("total_debit");
		total_credit = (Double) map.get("total_credit");
		closing_balance = (Double) map.get("closing_balance");
		closing_status = (String) map.get("closing_status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object from_yearObj = map.get("from_year");
		if(from_yearObj != null)
			from_year = new Integer(from_yearObj.toString());

		Object to_yearObj = map.get("to_year");
		if(to_yearObj != null)
			to_year = new Integer(to_yearObj.toString());

		Object account_idObj = map.get("account_id");
		if(account_idObj != null)
			account_id = account_idObj.toString();

		Object opening_balanceObj = map.get("opening_balance");
		if(opening_balanceObj != null)
			opening_balance = new Double(opening_balanceObj.toString());

		Object total_debitObj = map.get("total_debit");
		if(total_debitObj != null)
			total_debit = new Double(total_debitObj.toString());

		Object total_creditObj = map.get("total_credit");
		if(total_creditObj != null)
			total_credit = new Double(total_creditObj.toString());

		Object closing_balanceObj = map.get("closing_balance");
		if(closing_balanceObj != null)
			closing_balance = new Double(closing_balanceObj.toString());

		Object closing_statusObj = map.get("closing_status");
		if(closing_statusObj != null)
			closing_status = closing_statusObj.toString();

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

	public Integer getFrom_year() {
		return from_year;
	}

	public int getFrom_yearEx() {
		return from_year != null ? from_year : 0;
	}

	public void setFrom_year(int from_year) {
		this.from_year = from_year;
	}

	public void setFrom_year(Integer from_year) {
		this.from_year = from_year;
	}

	public void unSetFrom_year() {
		this.from_year = null;
	}

	public Integer getTo_year() {
		return to_year;
	}

	public int getTo_yearEx() {
		return to_year != null ? to_year : 0;
	}

	public void setTo_year(int to_year) {
		this.to_year = to_year;
	}

	public void setTo_year(Integer to_year) {
		this.to_year = to_year;
	}

	public void unSetTo_year() {
		this.to_year = null;
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

	public String getClosing_status() {
		return closing_status;
	}

	public String getClosing_statusEx() {
		return closing_status != null ? closing_status : "";
	}

	public void setClosing_status(String closing_status) {
		this.closing_status = closing_status;
	}

	public void unSetClosing_status() {
		this.closing_status = null;
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