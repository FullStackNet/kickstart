/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.traceme.defined.resource;

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
public abstract class Basetraceme_url extends BaseResource {
	private String id = null;
	private String device_id = null;
	private String url = null;
	private Long start_time = null;
	private Long end_time = null;
	private String latitude = null;
	private String longitude = null;
	private String share_name = null;
	private Long share_duration = null;
	private String status = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_DEVICE_ID = "device_id";
	public static String FIELD_URL = "url";
	public static String FIELD_START_TIME = "start_time";
	public static String FIELD_END_TIME = "end_time";
	public static String FIELD_LATITUDE = "latitude";
	public static String FIELD_LONGITUDE = "longitude";
	public static String FIELD_SHARE_NAME = "share_name";
	public static String FIELD_SHARE_DURATION = "share_duration";
	public static String FIELD_STATUS = "status";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("traceme_url");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field device_idField = new Field("device_id", "String");
		device_idField.setLength(128);
		metaData.addField(device_idField);

		Field urlField = new Field("url", "String");
		urlField.setLength(128);
		metaData.addField(urlField);

		Field start_timeField = new Field("start_time", "timestamp");
		metaData.addField(start_timeField);

		Field end_timeField = new Field("end_time", "timestamp");
		metaData.addField(end_timeField);

		Field latitudeField = new Field("latitude", "String");
		latitudeField.setLength(128);
		metaData.addField(latitudeField);

		Field longitudeField = new Field("longitude", "String");
		longitudeField.setLength(128);
		metaData.addField(longitudeField);

		Field share_nameField = new Field("share_name", "String");
		share_nameField.setLength(128);
		metaData.addField(share_nameField);

		Field share_durationField = new Field("share_duration", "long");
		metaData.addField(share_durationField);

		Field statusField = new Field("status", "String");
		statusField.setLength(1);
		metaData.addField(statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("traceme_url");

		metaData.setCluster("DB_LOG");
	}

	public Basetraceme_url() {}

	public Basetraceme_url(Basetraceme_url obj) {
		this.id = obj.id;
		this.device_id = obj.device_id;
		this.url = obj.url;
		this.start_time = obj.start_time;
		this.end_time = obj.end_time;
		this.latitude = obj.latitude;
		this.longitude = obj.longitude;
		this.share_name = obj.share_name;
		this.share_duration = obj.share_duration;
		this.status = obj.status;
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
		if(device_id != null)
			map.put("device_id", device_id);
		if(url != null)
			map.put("url", url);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(latitude != null)
			map.put("latitude", latitude);
		if(longitude != null)
			map.put("longitude", longitude);
		if(share_name != null)
			map.put("share_name", share_name);
		if(share_duration != null)
			map.put("share_duration", share_duration);
		if(status != null)
			map.put("status", status);
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
		if(device_id != null)
			map.put("device_id", device_id);
		if(url != null)
			map.put("url", url);
		if(start_time != null)
			map.put("start_time", start_time);
		if(end_time != null)
			map.put("end_time", end_time);
		if(latitude != null)
			map.put("latitude", latitude);
		if(longitude != null)
			map.put("longitude", longitude);
		if(share_name != null)
			map.put("share_name", share_name);
		if(share_duration != null)
			map.put("share_duration", share_duration);
		if(status != null)
			map.put("status", status);
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
		device_id = (String) map.get("device_id");
		url = (String) map.get("url");
		start_time = (Long) map.get("start_time");
		end_time = (Long) map.get("end_time");
		latitude = (String) map.get("latitude");
		longitude = (String) map.get("longitude");
		share_name = (String) map.get("share_name");
		share_duration = (Long) map.get("share_duration");
		status = (String) map.get("status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object device_idObj = map.get("device_id");
		if(device_idObj != null)
			device_id = device_idObj.toString();

		Object urlObj = map.get("url");
		if(urlObj != null)
			url = urlObj.toString();

		Object start_timeObj = map.get("start_time");
		if(start_timeObj != null)
			start_time = (Long) start_timeObj;

		Object end_timeObj = map.get("end_time");
		if(end_timeObj != null)
			end_time = (Long) end_timeObj;

		Object latitudeObj = map.get("latitude");
		if(latitudeObj != null)
			latitude = latitudeObj.toString();

		Object longitudeObj = map.get("longitude");
		if(longitudeObj != null)
			longitude = longitudeObj.toString();

		Object share_nameObj = map.get("share_name");
		if(share_nameObj != null)
			share_name = share_nameObj.toString();

		Object share_durationObj = map.get("share_duration");
		if(share_durationObj != null)
			share_duration = new Long(share_durationObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

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

	public String getDevice_id() {
		return device_id;
	}

	public String getDevice_idEx() {
		return device_id != null ? device_id : "";
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public void unSetDevice_id() {
		this.device_id = null;
	}

	public String getUrl() {
		return url;
	}

	public String getUrlEx() {
		return url != null ? url : "";
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void unSetUrl() {
		this.url = null;
	}

	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}


	public Long getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Long end_time) {
		this.end_time = end_time;
	}


	public String getLatitude() {
		return latitude;
	}

	public String getLatitudeEx() {
		return latitude != null ? latitude : "";
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void unSetLatitude() {
		this.latitude = null;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLongitudeEx() {
		return longitude != null ? longitude : "";
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void unSetLongitude() {
		this.longitude = null;
	}

	public String getShare_name() {
		return share_name;
	}

	public String getShare_nameEx() {
		return share_name != null ? share_name : "";
	}

	public void setShare_name(String share_name) {
		this.share_name = share_name;
	}

	public void unSetShare_name() {
		this.share_name = null;
	}

	public Long getShare_duration() {
		return share_duration;
	}

	public long getShare_durationEx() {
		return share_duration != null ? share_duration : 0L;
	}

	public void setShare_duration(long share_duration) {
		this.share_duration = share_duration;
	}

	public void setShare_duration(Long share_duration) {
		this.share_duration = share_duration;
	}

	public void unSetShare_duration() {
		this.share_duration = null;
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