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
public abstract class Basec4t_objects extends BaseResource {
	private String id = null;
	private String object_type = null;
	private List<platform.resource.c4t_object> objects = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_OBJECT_TYPE = "object_type";
	public static String FIELD_OBJECTS = "objects";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_objects");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field object_typeField = new Field("object_type", "String");
		object_typeField.setLength(128);
		metaData.addField(object_typeField);

		Field objectsField = new Field("objects", "Array");
		metaData.addField(objectsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_objects");

		metaData.setCluster("DB_OBJECT");
	}

	public Basec4t_objects() {}

	public Basec4t_objects(Basec4t_objects obj) {
		this.id = obj.id;
		this.object_type = obj.object_type;
		this.objects = obj.objects;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(objects != null)
			map.put("objects", objects);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(object_type != null)
			map.put("object_type", object_type);
		if(objects != null)
			map.put("objects", objects);
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
		object_type = (String) map.get("object_type");
		objects = (List<platform.resource.c4t_object>) map.get("objects");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object object_typeObj = map.get("object_type");
		if(object_typeObj != null)
			object_type = object_typeObj.toString();

		objects = (List<platform.resource.c4t_object>) map.get("objects");
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

	public String getObject_type() {
		return object_type;
	}

	public String getObject_typeEx() {
		return object_type != null ? object_type : "";
	}

	public void setObject_type(String object_type) {
		this.object_type = object_type;
	}

	public void unSetObject_type() {
		this.object_type = null;
	}

	public List<platform.resource.c4t_object> getObjects() {
		return objects;
	}


	public void setObjects(List<platform.resource.c4t_object> objects) {
		this.objects = objects;
	}

	public void addObjects(platform.resource.c4t_object value) {
		if(objects == null)
			objects = new ArrayList<platform.resource.c4t_object>();
		objects.add(value);
	}

	public void unSetObjects() {
		this.objects = null;
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
		return "DB_OBJECT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}