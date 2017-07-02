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
public abstract class Basemandi_auction_weight extends BaseResource {
	private String id = null;
	private String auction_id = null;
	private Double weight = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_AUCTION_ID = "auction_id";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("mandi_auction_weight");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field auction_idField = new Field("auction_id", "String");
		auction_idField.setLength(128);
		metaData.addField(auction_idField);

		Field weightField = new Field("weight", "double");
		metaData.addField(weightField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "long");
		metaData.addField(last_update_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("mandi_auction_weight");

		metaData.setCluster("DB_LOG");
	}

	public Basemandi_auction_weight() {}

	public Basemandi_auction_weight(Basemandi_auction_weight obj) {
		this.id = obj.id;
		this.auction_id = obj.auction_id;
		this.weight = obj.weight;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
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
		if(auction_id != null)
			map.put("auction_id", auction_id);
		if(weight != null)
			map.put("weight", weight);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		if(auction_id != null)
			map.put("auction_id", auction_id);
		if(weight != null)
			map.put("weight", weight);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		auction_id = (String) map.get("auction_id");
		weight = (Double) map.get("weight");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object auction_idObj = map.get("auction_id");
		if(auction_idObj != null)
			auction_id = auction_idObj.toString();

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = new Double(weightObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

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

	public String getAuction_id() {
		return auction_id;
	}

	public String getAuction_idEx() {
		return auction_id != null ? auction_id : "";
	}

	public void setAuction_id(String auction_id) {
		this.auction_id = auction_id;
	}

	public void unSetAuction_id() {
		this.auction_id = null;
	}

	public Double getWeight() {
		return weight;
	}

	public double getWeightEx() {
		return weight != null ? weight : 0;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void unSetWeight() {
		this.weight = null;
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

	public Long getLast_update_time() {
		return last_update_time;
	}

	public long getLast_update_timeEx() {
		return last_update_time != null ? last_update_time : 0L;
	}

	public void setLast_update_time(long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void unSetLast_update_time() {
		this.last_update_time = null;
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