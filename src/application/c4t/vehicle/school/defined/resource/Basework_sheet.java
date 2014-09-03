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
public abstract class Basework_sheet extends BaseResource {
	private String id = null;
	private String topic_id = null;
	private String sheet_no = null;
	private String name = null;
	private Integer total_marks = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TOPIC_ID = "topic_id";
	public static String FIELD_SHEET_NO = "sheet_no";
	public static String FIELD_NAME = "name";
	public static String FIELD_TOTAL_MARKS = "total_marks";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("work_sheet");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field topic_idField = new Field("topic_id", "String");
		topic_idField.setLength(32);
		metaData.addField(topic_idField);

		Field sheet_noField = new Field("sheet_no", "String");
		sheet_noField.setLength(128);
		metaData.addField(sheet_noField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field total_marksField = new Field("total_marks", "int");
		metaData.addField(total_marksField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("work_sheet");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basework_sheet() {}

	public Basework_sheet(Basework_sheet obj) {
		this.id = obj.id;
		this.topic_id = obj.topic_id;
		this.sheet_no = obj.sheet_no;
		this.name = obj.name;
		this.total_marks = obj.total_marks;
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
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(name != null)
			map.put("name", name);
		if(total_marks != null)
			map.put("total_marks", total_marks);
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
		if(topic_id != null)
			map.put("topic_id", topic_id);
		if(sheet_no != null)
			map.put("sheet_no", sheet_no);
		if(name != null)
			map.put("name", name);
		if(total_marks != null)
			map.put("total_marks", total_marks);
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
		topic_id = (String) map.get("topic_id");
		sheet_no = (String) map.get("sheet_no");
		name = (String) map.get("name");
		total_marks = (Integer) map.get("total_marks");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object topic_idObj = map.get("topic_id");
		if(topic_idObj != null)
			topic_id = topic_idObj.toString();

		Object sheet_noObj = map.get("sheet_no");
		if(sheet_noObj != null)
			sheet_no = sheet_noObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object total_marksObj = map.get("total_marks");
		if(total_marksObj != null)
			total_marks = new Integer(total_marksObj.toString());

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

	public String getTopic_id() {
		return topic_id;
	}

	public String getTopic_idEx() {
		return topic_id != null ? topic_id : "";
	}

	public void setTopic_id(String topic_id) {
		this.topic_id = topic_id;
	}

	public void unSetTopic_id() {
		this.topic_id = null;
	}

	public String getSheet_no() {
		return sheet_no;
	}

	public String getSheet_noEx() {
		return sheet_no != null ? sheet_no : "";
	}

	public void setSheet_no(String sheet_no) {
		this.sheet_no = sheet_no;
	}

	public void unSetSheet_no() {
		this.sheet_no = null;
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

	public Integer getTotal_marks() {
		return total_marks;
	}

	public int getTotal_marksEx() {
		return total_marks != null ? total_marks : 0;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public void setTotal_marks(Integer total_marks) {
		this.total_marks = total_marks;
	}

	public void unSetTotal_marks() {
		this.total_marks = null;
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