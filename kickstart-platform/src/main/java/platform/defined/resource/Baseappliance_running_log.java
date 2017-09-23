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
public abstract class Baseappliance_running_log extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private Long start_time = null;
	private Long stop_time = null;
	private Long duration = null;
	private String status = null;
	private Double fuel_start_quantity = null;
	private Double fuel_stop_quantity = null;
	private Double fuel_consumption = null;
	private Double fuel_efficiency = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_STOP_TIME = "stop_time";
	public static String FIELD_DURATION = "duration";
	public static String FIELD_STATUS = "status";
	public static String FIELD_FUEL_START_QUANTITY = "fuel_start_quantity";
	public static String FIELD_FUEL_STOP_QUANTITY = "fuel_stop_quantity";
	public static String FIELD_FUEL_CONSUMPTION = "fuel_consumption";
	public static String FIELD_FUEL_EFFICIENCY = "fuel_efficiency";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_running_log");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field start_timeField = new Field("start_time", "timestamp");
		metaData.addField(start_timeField);

		Field stop_timeField = new Field("stop_time", "timestamp");
		metaData.addField(stop_timeField);

		Field durationField = new Field("duration", "long");
		metaData.addField(durationField);

		Field statusField = new Field("status", "String");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field fuel_start_quantityField = new Field("fuel_start_quantity", "double");
		metaData.addField(fuel_start_quantityField);

		Field fuel_stop_quantityField = new Field("fuel_stop_quantity", "double");
		metaData.addField(fuel_stop_quantityField);

		Field fuel_consumptionField = new Field("fuel_consumption", "double");
		metaData.addField(fuel_consumptionField);

		Field fuel_efficiencyField = new Field("fuel_efficiency", "double");
		metaData.addField(fuel_efficiencyField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_running_log");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Baseappliance_running_log() {}

	public Baseappliance_running_log(Baseappliance_running_log obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.start_time = obj.start_time;
		this.stop_time = obj.stop_time;
		this.duration = obj.duration;
		this.status = obj.status;
		this.fuel_start_quantity = obj.fuel_start_quantity;
		this.fuel_stop_quantity = obj.fuel_stop_quantity;
		this.fuel_consumption = obj.fuel_consumption;
		this.fuel_efficiency = obj.fuel_efficiency;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(start_time != null)
			map.put("start_time", start_time);
		if(stop_time != null)
			map.put("stop_time", stop_time);
		if(duration != null)
			map.put("duration", duration);
		if(status != null)
			map.put("status", status);
		if(fuel_start_quantity != null)
			map.put("fuel_start_quantity", fuel_start_quantity);
		if(fuel_stop_quantity != null)
			map.put("fuel_stop_quantity", fuel_stop_quantity);
		if(fuel_consumption != null)
			map.put("fuel_consumption", fuel_consumption);
		if(fuel_efficiency != null)
			map.put("fuel_efficiency", fuel_efficiency);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(start_time != null)
			map.put("start_time", start_time);
		if(stop_time != null)
			map.put("stop_time", stop_time);
		if(duration != null)
			map.put("duration", duration);
		if(status != null)
			map.put("status", status);
		if(fuel_start_quantity != null)
			map.put("fuel_start_quantity", fuel_start_quantity);
		if(fuel_stop_quantity != null)
			map.put("fuel_stop_quantity", fuel_stop_quantity);
		if(fuel_consumption != null)
			map.put("fuel_consumption", fuel_consumption);
		if(fuel_efficiency != null)
			map.put("fuel_efficiency", fuel_efficiency);
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
		appliance_id = (String) map.get("appliance_id");
		start_time = (Long) map.get("start_time");
		stop_time = (Long) map.get("stop_time");
		duration = (Long) map.get("duration");
		status = (String) map.get("status");
		fuel_start_quantity = (Double) map.get("fuel_start_quantity");
		fuel_stop_quantity = (Double) map.get("fuel_stop_quantity");
		fuel_consumption = (Double) map.get("fuel_consumption");
		fuel_efficiency = (Double) map.get("fuel_efficiency");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = new Long(start_timeObj.toString());

		Object stop_timeObj = map.get("stop_time");
		if(stop_timeObj != null)
			stop_time = new Long(stop_timeObj.toString());

		Object durationObj = map.get("duration");
		if(durationObj != null)
			duration = new Long(durationObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object fuel_start_quantityObj = map.get("fuel_start_quantity");
		if(fuel_start_quantityObj != null)
			fuel_start_quantity = new Double(fuel_start_quantityObj.toString());

		Object fuel_stop_quantityObj = map.get("fuel_stop_quantity");
		if(fuel_stop_quantityObj != null)
			fuel_stop_quantity = new Double(fuel_stop_quantityObj.toString());

		Object fuel_consumptionObj = map.get("fuel_consumption");
		if(fuel_consumptionObj != null)
			fuel_consumption = new Double(fuel_consumptionObj.toString());

		Object fuel_efficiencyObj = map.get("fuel_efficiency");
		if(fuel_efficiencyObj != null)
			fuel_efficiency = new Double(fuel_efficiencyObj.toString());

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

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}


	public Long getStop_time() {
		return stop_time;
	}

	public void setStop_time(Long stop_time) {
		this.stop_time = stop_time;
	}


	public Long getDuration() {
		return duration;
	}

	public long getDurationEx() {
		return duration != null ? duration : 0L;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public void unSetDuration() {
		this.duration = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
	}

	public Double getFuel_start_quantity() {
		return fuel_start_quantity;
	}

	public double getFuel_start_quantityEx() {
		return fuel_start_quantity != null ? fuel_start_quantity : 0;
	}

	public void setFuel_start_quantity(double fuel_start_quantity) {
		this.fuel_start_quantity = fuel_start_quantity;
	}

	public void setFuel_start_quantity(Double fuel_start_quantity) {
		this.fuel_start_quantity = fuel_start_quantity;
	}

	public void unSetFuel_start_quantity() {
		this.fuel_start_quantity = null;
	}

	public Double getFuel_stop_quantity() {
		return fuel_stop_quantity;
	}

	public double getFuel_stop_quantityEx() {
		return fuel_stop_quantity != null ? fuel_stop_quantity : 0;
	}

	public void setFuel_stop_quantity(double fuel_stop_quantity) {
		this.fuel_stop_quantity = fuel_stop_quantity;
	}

	public void setFuel_stop_quantity(Double fuel_stop_quantity) {
		this.fuel_stop_quantity = fuel_stop_quantity;
	}

	public void unSetFuel_stop_quantity() {
		this.fuel_stop_quantity = null;
	}

	public Double getFuel_consumption() {
		return fuel_consumption;
	}

	public double getFuel_consumptionEx() {
		return fuel_consumption != null ? fuel_consumption : 0;
	}

	public void setFuel_consumption(double fuel_consumption) {
		this.fuel_consumption = fuel_consumption;
	}

	public void setFuel_consumption(Double fuel_consumption) {
		this.fuel_consumption = fuel_consumption;
	}

	public void unSetFuel_consumption() {
		this.fuel_consumption = null;
	}

	public Double getFuel_efficiency() {
		return fuel_efficiency;
	}

	public double getFuel_efficiencyEx() {
		return fuel_efficiency != null ? fuel_efficiency : 0;
	}

	public void setFuel_efficiency(double fuel_efficiency) {
		this.fuel_efficiency = fuel_efficiency;
	}

	public void setFuel_efficiency(Double fuel_efficiency) {
		this.fuel_efficiency = fuel_efficiency;
	}

	public void unSetFuel_efficiency() {
		this.fuel_efficiency = null;
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
		return "DB_ANALYSIS";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}