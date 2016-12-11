/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baselog_cards extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String type = null;
	private String card_no = null;
	private ArrayList<String> valid = null;
	private ArrayList<String> record_type = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_CARD_NO = "card_no";
	public static String FIELD_VALID = "valid";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("log_cards");

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

		Field typeField = new Field("type", "String");
		metaData.addField(typeField);

		Field card_noField = new Field("card_no", "String");
		metaData.addField(card_noField);

		Field validField = new Field("valid", "Array");
		metaData.addField(validField);

		Field record_typeField = new Field("record_type", "Array");
		metaData.addField(record_typeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("log_cards");

		metaData.setCluster("DB_LOG");
	}

	public Baselog_cards() {}

	public Baselog_cards(Baselog_cards obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.type = obj.type;
		this.card_no = obj.card_no;
		this.valid = obj.valid;
		this.record_type = obj.record_type;
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(type != null)
			map.put("type", type);
		if(card_no != null)
			map.put("card_no", card_no);
		if(valid != null)
			map.put("valid", valid);
		if(record_type != null)
			map.put("record_type", record_type);
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
		if(validateId(add))
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(type != null)
			map.put("type", type);
		if(card_no != null)
			map.put("card_no", card_no);
		if(valid != null)
			map.put("valid", valid);
		if(record_type != null)
			map.put("record_type", record_type);
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
		school_id = (String) map.get("school_id");
		type = (String) map.get("type");
		card_no = (String) map.get("card_no");
		valid = (ArrayList<String>) map.get("valid");
		record_type = (ArrayList<String>) map.get("record_type");
		customer_id = (String) map.get("customer_id");
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

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object card_noObj = map.get("card_no");
		if(card_noObj != null)
			card_no = card_noObj.toString();

		valid = (ArrayList<String>) map.get("valid");
		record_type = (ArrayList<String>) map.get("record_type");
		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
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

	public ArrayList<String> getValid() {
		return valid;
	}


	public void setValid(ArrayList<String> valid) {
		this.valid = valid;
	}

	public void addValid(String value) {
		if(valid == null)
			valid = new ArrayList<String>();
		valid.add(value);
	}

	public void unSetValid() {
		this.valid = null;
	}

	public ArrayList<String> getRecord_type() {
		return record_type;
	}


	public void setRecord_type(ArrayList<String> record_type) {
		this.record_type = record_type;
	}

	public void addRecord_type(String value) {
		if(record_type == null)
			record_type = new ArrayList<String>();
		record_type.add(value);
	}

	public void unSetRecord_type() {
		this.record_type = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}