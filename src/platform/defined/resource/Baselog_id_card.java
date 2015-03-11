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
public abstract class Baselog_id_card extends BaseResource {
	private String id = null;
	private String school_id = null;
	private String type = null;
	private String reader_id = null;
	private String card_no = null;
	private String valid = null;
	private String route_type = null;
	private String route_id = null;
	private String record_type = null;
	private String student_id = null;
	private String student_name = null;
	private String customer_id = null;
	private Long event_time = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_READER_ID = "reader_id";
	public static String FIELD_CARD_NO = "card_no";
	public static String FIELD_VALID = "valid";
	public static String FIELD_ROUTE_TYPE = "route_type";
	public static String FIELD_ROUTE_ID = "route_id";
	public static String FIELD_RECORD_TYPE = "record_type";
	public static String FIELD_STUDENT_ID = "student_id";
	public static String FIELD_STUDENT_NAME = "student_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EVENT_TIME = "event_time";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("log_id_card");

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

		Field reader_idField = new Field("reader_id", "String");
		reader_idField.setLength(128);
		metaData.addField(reader_idField);

		Field card_noField = new Field("card_no", "String");
		card_noField.setLength(128);
		metaData.addField(card_noField);

		Field validField = new Field("valid", "String");
		validField.setDefaultValue("Y");
		validField.setLength(1);
		metaData.addField(validField);

		Field route_typeField = new Field("route_type", "String");
		route_typeField.setLength(128);
		metaData.addField(route_typeField);

		Field route_idField = new Field("route_id", "String");
		route_idField.setLength(128);
		metaData.addField(route_idField);

		Field record_typeField = new Field("record_type", "String");
		record_typeField.setLength(128);
		metaData.addField(record_typeField);

		Field student_idField = new Field("student_id", "String");
		student_idField.setIndexed(true);
		student_idField.setLength(128);
		metaData.addField(student_idField);

		Field student_nameField = new Field("student_name", "String");
		student_nameField.setIndexed(true);
		student_nameField.setLength(128);
		metaData.addField(student_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field event_timeField = new Field("event_time", "timestamp");
		metaData.addField(event_timeField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("log_id_card");

		metaData.setCluster("DB_LOG");
	}

	public Baselog_id_card() {}

	public Baselog_id_card(Baselog_id_card obj) {
		this.id = obj.id;
		this.school_id = obj.school_id;
		this.type = obj.type;
		this.reader_id = obj.reader_id;
		this.card_no = obj.card_no;
		this.valid = obj.valid;
		this.route_type = obj.route_type;
		this.route_id = obj.route_id;
		this.record_type = obj.record_type;
		this.student_id = obj.student_id;
		this.student_name = obj.student_name;
		this.customer_id = obj.customer_id;
		this.event_time = obj.event_time;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(valid == null)
			valid = "Y";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(type != null)
			map.put("type", type);
		if(reader_id != null)
			map.put("reader_id", reader_id);
		if(card_no != null)
			map.put("card_no", card_no);
		if(valid != null)
			map.put("valid", valid);
		if(route_type != null)
			map.put("route_type", route_type);
		if(route_id != null)
			map.put("route_id", route_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(event_time != null)
			map.put("event_time", event_time);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(school_id != null)
			map.put("school_id", school_id);
		if(type != null)
			map.put("type", type);
		if(reader_id != null)
			map.put("reader_id", reader_id);
		if(card_no != null)
			map.put("card_no", card_no);
		if(valid != null)
			map.put("valid", valid);
		if(route_type != null)
			map.put("route_type", route_type);
		if(route_id != null)
			map.put("route_id", route_id);
		if(record_type != null)
			map.put("record_type", record_type);
		if(student_id != null)
			map.put("student_id", student_id);
		if(student_name != null)
			map.put("student_name", student_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(event_time != null)
			map.put("event_time", event_time);
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
		reader_id = (String) map.get("reader_id");
		card_no = (String) map.get("card_no");
		valid = (String) map.get("valid");
		route_type = (String) map.get("route_type");
		route_id = (String) map.get("route_id");
		record_type = (String) map.get("record_type");
		student_id = (String) map.get("student_id");
		student_name = (String) map.get("student_name");
		customer_id = (String) map.get("customer_id");
		event_time = (Long) map.get("event_time");
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

		Object reader_idObj = map.get("reader_id");
		if(reader_idObj != null)
			reader_id = reader_idObj.toString();

		Object card_noObj = map.get("card_no");
		if(card_noObj != null)
			card_no = card_noObj.toString();

		Object validObj = map.get("valid");
		if(validObj != null)
			valid = validObj.toString();

		Object route_typeObj = map.get("route_type");
		if(route_typeObj != null)
			route_type = route_typeObj.toString();

		Object route_idObj = map.get("route_id");
		if(route_idObj != null)
			route_id = route_idObj.toString();

		Object record_typeObj = map.get("record_type");
		if(record_typeObj != null)
			record_type = record_typeObj.toString();

		Object student_idObj = map.get("student_id");
		if(student_idObj != null)
			student_id = student_idObj.toString();

		Object student_nameObj = map.get("student_name");
		if(student_nameObj != null)
			student_name = student_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object event_timeObj = map.get("event_time");
		if(event_timeObj != null)
			event_time = (Long) event_timeObj;

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

	public String getReader_id() {
		return reader_id;
	}

	public String getReader_idEx() {
		return reader_id != null ? reader_id : "";
	}

	public void setReader_id(String reader_id) {
		this.reader_id = reader_id;
	}

	public void unSetReader_id() {
		this.reader_id = null;
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

	public String getValid() {
		return valid != null ? valid : "Y";
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public void unSetValid() {
		this.valid = "Y";
	}

	public String getRoute_type() {
		return route_type;
	}

	public String getRoute_typeEx() {
		return route_type != null ? route_type : "";
	}

	public void setRoute_type(String route_type) {
		this.route_type = route_type;
	}

	public void unSetRoute_type() {
		this.route_type = null;
	}

	public String getRoute_id() {
		return route_id;
	}

	public String getRoute_idEx() {
		return route_id != null ? route_id : "";
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	public void unSetRoute_id() {
		this.route_id = null;
	}

	public String getRecord_type() {
		return record_type;
	}

	public String getRecord_typeEx() {
		return record_type != null ? record_type : "";
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public void unSetRecord_type() {
		this.record_type = null;
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

	public Long getEvent_time() {
		return event_time;
	}

	public void setEvent_time(Long event_time) {
		this.event_time = event_time;
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