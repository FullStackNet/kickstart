/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public abstract class Basec4t_record_map extends BaseResource {
	private String id = null;
	private String record_id = null;
	private String record_map_type = null;
	private String reference_id = null;
	private List<Object> record_map = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_RECORD_ID = "record_id";
	public static String FIELD_RECORD_MAP_TYPE = "record_map_type";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_RECORD_MAP = "record_map";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_record_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field record_idField = new Field("record_id", "String");
		record_idField.setLength(512);
		metaData.addField(record_idField);

		Field record_map_typeField = new Field("record_map_type", "String");
		record_map_typeField.setLength(512);
		metaData.addField(record_map_typeField);

		Field record_mapField = new Field("record_map", "Array");
		metaData.addField(record_mapField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_record_map");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_record_map() {}

	public Basec4t_record_map(Basec4t_record_map obj) {
		this.id = obj.id;
		this.record_id = obj.record_id;
		this.record_map_type = obj.record_map_type;
		this.reference_id = obj.reference_id;
		this.record_map = obj.record_map;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(record_id != null)
			map.put("record_id", record_id);
		if(record_map_type != null)
			map.put("record_map_type", record_map_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(record_map != null)
			map.put("record_map", record_map);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(record_id != null)
			map.put("record_id", record_id);
		if(record_map_type != null)
			map.put("record_map_type", record_map_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(record_map != null)
			map.put("record_map", record_map);
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
		record_id = (String) map.get("record_id");
		record_map_type = (String) map.get("record_map_type");
		record_map = (List<Object>) map.get("record_map");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object record_idObj = map.get("record_id");
		if(record_idObj != null)
			record_id = record_idObj.toString();

		Object record_map_typeObj = map.get("record_map_type");
		if(record_map_typeObj != null)
			record_map_type = record_map_typeObj.toString();

		record_map = (List<Object>) map.get("record_map");
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

	public String getRecord_id() {
		return record_id;
	}

	public String getRecord_idEx() {
		return record_id != null ? record_id : "";
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	public void unSetRecord_id() {
		this.record_id = null;
	}

	public String getRecord_map_type() {
		return record_map_type;
	}

	public String getRecord_map_typeEx() {
		return record_map_type != null ? record_map_type : "";
	}

	public void setRecord_map_type(String record_map_type) {
		this.record_map_type = record_map_type;
	}

	public void unSetRecord_map_type() {
		this.record_map_type = null;
	}

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
	}

	public List<Object> getRecord_map() {
		return record_map;
	}


	public void setRecord_map(List<Object> record_map) {
		this.record_map = record_map;
	}

	public void addRecord_map(Object value) {
		if(record_map == null)
			record_map = new ArrayList<>();
		record_map.add(value);
	}

	public void unSetRecord_map() {
		this.record_map = null;
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