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
public abstract class Basec4t_transient_object extends BaseResource {
	private String id = null;
	private String name = null;
	private Long pending_order = null;
	private Long ready_order = null;
	private Long not_available = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PENDING_ORDER = "pending_order";
	public static String FIELD_READY_ORDER = "ready_order";
	public static String FIELD_NOT_AVAILABLE = "not_available";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_transient_object");

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

		Field pending_orderField = new Field("pending_order", "long");
		metaData.addField(pending_orderField);

		Field ready_orderField = new Field("ready_order", "long");
		metaData.addField(ready_orderField);

		Field not_availableField = new Field("not_available", "long");
		metaData.addField(not_availableField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_transient_object");

		metaData.setCluster("DB_OBJECT");
	}

	public Basec4t_transient_object() {}

	public Basec4t_transient_object(Basec4t_transient_object obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.pending_order = obj.pending_order;
		this.ready_order = obj.ready_order;
		this.not_available = obj.not_available;
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
		if(pending_order != null)
			map.put("pending_order", pending_order);
		if(ready_order != null)
			map.put("ready_order", ready_order);
		if(not_available != null)
			map.put("not_available", not_available);
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
		if(pending_order != null)
			map.put("pending_order", pending_order);
		if(ready_order != null)
			map.put("ready_order", ready_order);
		if(not_available != null)
			map.put("not_available", not_available);
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
		pending_order = (Long) map.get("pending_order");
		ready_order = (Long) map.get("ready_order");
		not_available = (Long) map.get("not_available");
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

		Object pending_orderObj = map.get("pending_order");
		if(pending_orderObj != null)
			pending_order = new Long(pending_orderObj.toString());

		Object ready_orderObj = map.get("ready_order");
		if(ready_orderObj != null)
			ready_order = new Long(ready_orderObj.toString());

		Object not_availableObj = map.get("not_available");
		if(not_availableObj != null)
			not_available = new Long(not_availableObj.toString());

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

	public Long getPending_order() {
		return pending_order;
	}

	public long getPending_orderEx() {
		return pending_order != null ? pending_order : 0L;
	}

	public void setPending_order(long pending_order) {
		this.pending_order = pending_order;
	}

	public void setPending_order(Long pending_order) {
		this.pending_order = pending_order;
	}

	public void unSetPending_order() {
		this.pending_order = null;
	}

	public Long getReady_order() {
		return ready_order;
	}

	public long getReady_orderEx() {
		return ready_order != null ? ready_order : 0L;
	}

	public void setReady_order(long ready_order) {
		this.ready_order = ready_order;
	}

	public void setReady_order(Long ready_order) {
		this.ready_order = ready_order;
	}

	public void unSetReady_order() {
		this.ready_order = null;
	}

	public Long getNot_available() {
		return not_available;
	}

	public long getNot_availableEx() {
		return not_available != null ? not_available : 0L;
	}

	public void setNot_available(long not_available) {
		this.not_available = not_available;
	}

	public void setNot_available(Long not_available) {
		this.not_available = not_available;
	}

	public void unSetNot_available() {
		this.not_available = null;
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