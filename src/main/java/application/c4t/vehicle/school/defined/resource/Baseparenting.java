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
public abstract class Baseparenting extends BaseResource {
	private String id = null;
	private String type = null;
	private String title = null;
	private String description = null;
	private String reference_from = null;
	private Long date = null;
	private String date_str = null;
	private Long creation_time = null;
	private String visible = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_REFERENCE_FROM = "reference_from";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_VISIBLE = "visible";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("parenting");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(512);
		metaData.addField(typeField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field reference_fromField = new Field("reference_from", "String");
		reference_fromField.setLength(4096);
		metaData.addField(reference_fromField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(32);
		metaData.addField(date_strField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field visibleField = new Field("visible", "String");
		visibleField.setDefaultValue("N");
		visibleField.setLength(1);
		metaData.addField(visibleField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("parenting");

		metaData.setCluster("DB_SCHOOL");
	}

	public Baseparenting() {}

	public Baseparenting(Baseparenting obj) {
		this.id = obj.id;
		this.type = obj.type;
		this.title = obj.title;
		this.description = obj.description;
		this.reference_from = obj.reference_from;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.creation_time = obj.creation_time;
		this.visible = obj.visible;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(visible == null)
			visible = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(type != null)
			map.put("type", type);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(reference_from != null)
			map.put("reference_from", reference_from);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(visible != null)
			map.put("visible", visible);
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
		if(type != null)
			map.put("type", type);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(reference_from != null)
			map.put("reference_from", reference_from);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(visible != null)
			map.put("visible", visible);
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
		type = (String) map.get("type");
		title = (String) map.get("title");
		description = (String) map.get("description");
		reference_from = (String) map.get("reference_from");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		creation_time = (Long) map.get("creation_time");
		visible = (String) map.get("visible");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object reference_fromObj = map.get("reference_from");
		if(reference_fromObj != null)
			reference_from = reference_fromObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object visibleObj = map.get("visible");
		if(visibleObj != null)
			visible = visibleObj.toString();

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

	public String getTitle() {
		return title;
	}

	public String getTitleEx() {
		return title != null ? title : "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void unSetTitle() {
		this.title = null;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
	}

	public String getReference_from() {
		return reference_from;
	}

	public String getReference_fromEx() {
		return reference_from != null ? reference_from : "";
	}

	public void setReference_from(String reference_from) {
		this.reference_from = reference_from;
	}

	public void unSetReference_from() {
		this.reference_from = null;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}


	public String getDate_str() {
		return date_str;
	}

	public String getDate_strEx() {
		return date_str != null ? date_str : "";
	}

	public void setDate_str(String date_str) {
		this.date_str = date_str;
	}

	public void unSetDate_str() {
		this.date_str = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public String getVisible() {
		return visible != null ? visible : "N";
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public void unSetVisible() {
		this.visible = "N";
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