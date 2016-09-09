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
public abstract class Basec4t_payment extends BaseResource {
	private String id = null;
	private String community_id = null;
	private String community_name = null;
	private String user_id = null;
	private String user_name = null;
	private Long payment_date = null;
	private Double amount = null;
	private Long number_of_month = null;
	private String settled = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_COMMUNITY_NAME = "community_name";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_PAYMENT_DATE = "payment_date";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_NUMBER_OF_MONTH = "number_of_month";
	public static String FIELD_SETTLED = "settled";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_payment");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field community_nameField = new Field("community_name", "String");
		community_nameField.setLength(128);
		metaData.addField(community_nameField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field payment_dateField = new Field("payment_date", "timestamp");
		metaData.addField(payment_dateField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field number_of_monthField = new Field("number_of_month", "long");
		metaData.addField(number_of_monthField);

		Field settledField = new Field("settled", "String");
		settledField.setLength(128);
		metaData.addField(settledField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_payment");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_payment() {}

	public Basec4t_payment(Basec4t_payment obj) {
		this.id = obj.id;
		this.community_id = obj.community_id;
		this.community_name = obj.community_name;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.payment_date = obj.payment_date;
		this.amount = obj.amount;
		this.number_of_month = obj.number_of_month;
		this.settled = obj.settled;
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
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(payment_date != null)
			map.put("payment_date", payment_date);
		if(amount != null)
			map.put("amount", amount);
		if(number_of_month != null)
			map.put("number_of_month", number_of_month);
		if(settled != null)
			map.put("settled", settled);
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
		if(community_id != null)
			map.put("community_id", community_id);
		if(community_name != null)
			map.put("community_name", community_name);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(payment_date != null)
			map.put("payment_date", payment_date);
		if(amount != null)
			map.put("amount", amount);
		if(number_of_month != null)
			map.put("number_of_month", number_of_month);
		if(settled != null)
			map.put("settled", settled);
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
		community_id = (String) map.get("community_id");
		community_name = (String) map.get("community_name");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		payment_date = (Long) map.get("payment_date");
		amount = (Double) map.get("amount");
		number_of_month = (Long) map.get("number_of_month");
		settled = (String) map.get("settled");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object community_nameObj = map.get("community_name");
		if(community_nameObj != null)
			community_name = community_nameObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object payment_dateObj = map.get("payment_date");
		if(payment_dateObj != null)
			payment_date = (Long) payment_dateObj;

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object number_of_monthObj = map.get("number_of_month");
		if(number_of_monthObj != null)
			number_of_month = new Long(number_of_monthObj.toString());

		Object settledObj = map.get("settled");
		if(settledObj != null)
			settled = settledObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
	}

	public String getCommunity_name() {
		return community_name;
	}

	public String getCommunity_nameEx() {
		return community_name != null ? community_name : "";
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}

	public void unSetCommunity_name() {
		this.community_name = null;
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

	public Long getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Long payment_date) {
		this.payment_date = payment_date;
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

	public Long getNumber_of_month() {
		return number_of_month;
	}

	public long getNumber_of_monthEx() {
		return number_of_month != null ? number_of_month : 0L;
	}

	public void setNumber_of_month(long number_of_month) {
		this.number_of_month = number_of_month;
	}

	public void setNumber_of_month(Long number_of_month) {
		this.number_of_month = number_of_month;
	}

	public void unSetNumber_of_month() {
		this.number_of_month = null;
	}

	public String getSettled() {
		return settled;
	}

	public String getSettledEx() {
		return settled != null ? settled : "";
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

	public void unSetSettled() {
		this.settled = null;
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
		return "DB_RECORD";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}