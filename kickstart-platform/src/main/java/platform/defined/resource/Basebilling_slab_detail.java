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
public abstract class Basebilling_slab_detail extends BaseResource {
	private String id = null;
	private String slab_id = null;
	private Double start_value = null;
	private Double end_value = null;
	private Double rate = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_SLAB_ID = "slab_id";
	public static String FIELD_START_VALUE = "start_value";
	public static String FIELD_END_VALUE = "end_value";
	public static String FIELD_RATE = "rate";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("billing_slab_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field slab_idField = new Field("slab_id", "String");
		slab_idField.setRequired(true);
		slab_idField.setLength(128);
		metaData.addField(slab_idField);

		Field start_valueField = new Field("start_value", "Double");
		metaData.addField(start_valueField);

		Field end_valueField = new Field("end_value", "Double");
		metaData.addField(end_valueField);

		Field rateField = new Field("rate", "Double");
		metaData.addField(rateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("billing_slab_detail");

		metaData.setCluster("DB_PROFILE");
	}

	public Basebilling_slab_detail() {}

	public Basebilling_slab_detail(Basebilling_slab_detail obj) {
		this.id = obj.id;
		this.slab_id = obj.slab_id;
		this.start_value = obj.start_value;
		this.end_value = obj.end_value;
		this.rate = obj.rate;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(slab_id != null)
			map.put("slab_id", slab_id);
		if(start_value != null)
			map.put("start_value", start_value);
		if(end_value != null)
			map.put("end_value", end_value);
		if(rate != null)
			map.put("rate", rate);
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
		if(validateSlab_id(add))
			map.put("slab_id", slab_id);
		if(start_value != null)
			map.put("start_value", start_value);
		if(end_value != null)
			map.put("end_value", end_value);
		if(rate != null)
			map.put("rate", rate);
		if(validateCreation_time(add))
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
		slab_id = (String) map.get("slab_id");
		start_value = (Double) map.get("start_value");
		end_value = (Double) map.get("end_value");
		rate = (Double) map.get("rate");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object slab_idObj = map.get("slab_id");
		if(slab_idObj != null)
			slab_id = slab_idObj.toString();

		Object start_valueObj = map.get("start_value");
		if(start_valueObj != null)
			start_value = new Double(start_valueObj.toString());

		Object end_valueObj = map.get("end_value");
		if(end_valueObj != null)
			end_value = new Double(end_valueObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

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

	public String getSlab_id() {
		return slab_id;
	}

	public String getSlab_idEx() {
		return slab_id != null ? slab_id : "";
	}

	public void setSlab_id(String slab_id) {
		this.slab_id = slab_id;
	}

	public void unSetSlab_id() {
		this.slab_id = null;
	}

	public boolean validateSlab_id(boolean add) throws ApplicationException {
		if(add && slab_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[slab_id]");
		return slab_id != null;
	}

	public Double getStart_value() {
		return start_value;
	}

	public void setStart_value(Double start_value) {
		this.start_value = start_value;
	}

	public void unSetStart_value() {
		this.start_value = null;
	}

	public Double getEnd_value() {
		return end_value;
	}

	public void setEnd_value(Double end_value) {
		this.end_value = end_value;
	}

	public void unSetEnd_value() {
		this.end_value = null;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public void unSetRate() {
		this.rate = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public boolean validateCreation_time(boolean add) throws ApplicationException {
		if(add && creation_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_time]");
		return creation_time != null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}