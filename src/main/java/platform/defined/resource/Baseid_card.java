/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

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
public abstract class Baseid_card extends BaseResource {
	private String id = null;
	private String card_no = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private String last_reader_no = null;
	private String used_location_id = null;
	private String used_location_name = null;
	private String used_by_type = null;
	private String used_by_id = null;
	private String used_by_name = null;
	private Double amount = null;
	private String card_status = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CARD_NO = "card_no";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_LAST_READER_NO = "last_reader_no";
	public static String FIELD_USED_LOCATION_ID = "used_location_id";
	public static String FIELD_USED_LOCATION_NAME = "used_location_name";
	public static String FIELD_USED_BY_TYPE = "used_by_type";
	public static String FIELD_USED_BY_ID = "used_by_id";
	public static String FIELD_USED_BY_NAME = "used_by_name";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_CARD_STATUS = "card_status";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("id_card");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field card_noField = new Field("card_no", "String");
		card_noField.setRequired(true);
		card_noField.setLength(128);
		metaData.addField(card_noField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field last_reader_noField = new Field("last_reader_no", "String");
		last_reader_noField.setLength(128);
		metaData.addField(last_reader_noField);

		Field used_location_idField = new Field("used_location_id", "String");
		used_location_idField.setLength(128);
		metaData.addField(used_location_idField);

		Field used_location_nameField = new Field("used_location_name", "String");
		used_location_nameField.setLength(128);
		metaData.addField(used_location_nameField);

		Field used_by_typeField = new Field("used_by_type", "String");
		used_by_typeField.setLength(128);
		metaData.addField(used_by_typeField);

		Field used_by_idField = new Field("used_by_id", "String");
		used_by_idField.setLength(128);
		metaData.addField(used_by_idField);

		Field used_by_nameField = new Field("used_by_name", "String");
		used_by_nameField.setLength(128);
		metaData.addField(used_by_nameField);

		Field amountField = new Field("amount", "double");
		amountField.setDefaultValue(0.0);
		metaData.addField(amountField);

		Field card_statusField = new Field("card_status", "String");
		card_statusField.setDefaultValue("N");
		card_statusField.setLength(1);
		metaData.addField(card_statusField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("id_card");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseid_card() {}

	public Baseid_card(Baseid_card obj) {
		this.id = obj.id;
		this.card_no = obj.card_no;
		this.customer_id = obj.customer_id;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
		this.last_reader_no = obj.last_reader_no;
		this.used_location_id = obj.used_location_id;
		this.used_location_name = obj.used_location_name;
		this.used_by_type = obj.used_by_type;
		this.used_by_id = obj.used_by_id;
		this.used_by_name = obj.used_by_name;
		this.amount = obj.amount;
		this.card_status = obj.card_status;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(amount == null)
			amount = 0.0;
		if(card_status == null)
			card_status = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(card_no != null)
			map.put("card_no", card_no);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(last_reader_no != null)
			map.put("last_reader_no", last_reader_no);
		if(used_location_id != null)
			map.put("used_location_id", used_location_id);
		if(used_location_name != null)
			map.put("used_location_name", used_location_name);
		if(used_by_type != null)
			map.put("used_by_type", used_by_type);
		if(used_by_id != null)
			map.put("used_by_id", used_by_id);
		if(used_by_name != null)
			map.put("used_by_name", used_by_name);
		if(amount != null)
			map.put("amount", amount);
		if(card_status != null)
			map.put("card_status", card_status);
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
		if(validateCard_no(add))
			map.put("card_no", card_no);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(last_reader_no != null)
			map.put("last_reader_no", last_reader_no);
		if(used_location_id != null)
			map.put("used_location_id", used_location_id);
		if(used_location_name != null)
			map.put("used_location_name", used_location_name);
		if(used_by_type != null)
			map.put("used_by_type", used_by_type);
		if(used_by_id != null)
			map.put("used_by_id", used_by_id);
		if(used_by_name != null)
			map.put("used_by_name", used_by_name);
		if(amount != null)
			map.put("amount", amount);
		if(card_status != null)
			map.put("card_status", card_status);
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
		card_no = (String) map.get("card_no");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		last_reader_no = (String) map.get("last_reader_no");
		used_location_id = (String) map.get("used_location_id");
		used_location_name = (String) map.get("used_location_name");
		used_by_type = (String) map.get("used_by_type");
		used_by_id = (String) map.get("used_by_id");
		used_by_name = (String) map.get("used_by_name");
		amount = (Double) map.get("amount");
		card_status = (String) map.get("card_status");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object card_noObj = map.get("card_no");
		if(card_noObj != null)
			card_no = card_noObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

		Object last_reader_noObj = map.get("last_reader_no");
		if(last_reader_noObj != null)
			last_reader_no = last_reader_noObj.toString();

		Object used_location_idObj = map.get("used_location_id");
		if(used_location_idObj != null)
			used_location_id = used_location_idObj.toString();

		Object used_location_nameObj = map.get("used_location_name");
		if(used_location_nameObj != null)
			used_location_name = used_location_nameObj.toString();

		Object used_by_typeObj = map.get("used_by_type");
		if(used_by_typeObj != null)
			used_by_type = used_by_typeObj.toString();

		Object used_by_idObj = map.get("used_by_id");
		if(used_by_idObj != null)
			used_by_id = used_by_idObj.toString();

		Object used_by_nameObj = map.get("used_by_name");
		if(used_by_nameObj != null)
			used_by_name = used_by_nameObj.toString();

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object card_statusObj = map.get("card_status");
		if(card_statusObj != null)
			card_status = card_statusObj.toString();

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

	public boolean validateCard_no(boolean add) throws ApplicationException {
		if(add && card_no == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[card_no]");
		return card_no != null;
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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}


	public String getLast_reader_no() {
		return last_reader_no;
	}

	public String getLast_reader_noEx() {
		return last_reader_no != null ? last_reader_no : "";
	}

	public void setLast_reader_no(String last_reader_no) {
		this.last_reader_no = last_reader_no;
	}

	public void unSetLast_reader_no() {
		this.last_reader_no = null;
	}

	public String getUsed_location_id() {
		return used_location_id;
	}

	public String getUsed_location_idEx() {
		return used_location_id != null ? used_location_id : "";
	}

	public void setUsed_location_id(String used_location_id) {
		this.used_location_id = used_location_id;
	}

	public void unSetUsed_location_id() {
		this.used_location_id = null;
	}

	public String getUsed_location_name() {
		return used_location_name;
	}

	public String getUsed_location_nameEx() {
		return used_location_name != null ? used_location_name : "";
	}

	public void setUsed_location_name(String used_location_name) {
		this.used_location_name = used_location_name;
	}

	public void unSetUsed_location_name() {
		this.used_location_name = null;
	}

	public String getUsed_by_type() {
		return used_by_type;
	}

	public String getUsed_by_typeEx() {
		return used_by_type != null ? used_by_type : "";
	}

	public void setUsed_by_type(String used_by_type) {
		this.used_by_type = used_by_type;
	}

	public void unSetUsed_by_type() {
		this.used_by_type = null;
	}

	public String getUsed_by_id() {
		return used_by_id;
	}

	public String getUsed_by_idEx() {
		return used_by_id != null ? used_by_id : "";
	}

	public void setUsed_by_id(String used_by_id) {
		this.used_by_id = used_by_id;
	}

	public void unSetUsed_by_id() {
		this.used_by_id = null;
	}

	public String getUsed_by_name() {
		return used_by_name;
	}

	public String getUsed_by_nameEx() {
		return used_by_name != null ? used_by_name : "";
	}

	public void setUsed_by_name(String used_by_name) {
		this.used_by_name = used_by_name;
	}

	public void unSetUsed_by_name() {
		this.used_by_name = null;
	}

	public Double getAmount() {
		return amount != null ? amount : 0.0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = 0.0;
	}

	public String getCard_status() {
		return card_status != null ? card_status : "N";
	}

	public void setCard_status(String card_status) {
		this.card_status = card_status;
	}

	public void unSetCard_status() {
		this.card_status = "N";
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}