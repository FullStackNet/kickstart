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
public abstract class Basehomepage_video extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String video_url = null;
	private String title = null;
	private String summary = null;
	private String content = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_VIDEO_URL = "video_url";
	public static String FIELD_TITLE = "title";
	public static String FIELD_SUMMARY = "summary";
	public static String FIELD_CONTENT = "content";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("homepage_video");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(32);
		metaData.addField(customer_idField);

		Field video_urlField = new Field("video_url", "String");
		video_urlField.setLength(32);
		metaData.addField(video_urlField);

		Field titleField = new Field("title", "String");
		titleField.setLength(32);
		metaData.addField(titleField);

		Field summaryField = new Field("summary", "String");
		summaryField.setLength(32);
		metaData.addField(summaryField);

		Field contentField = new Field("content", "String");
		metaData.addField(contentField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("homepage_video");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basehomepage_video() {}

	public Basehomepage_video(Basehomepage_video obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.video_url = obj.video_url;
		this.title = obj.title;
		this.summary = obj.summary;
		this.content = obj.content;
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(video_url != null)
			map.put("video_url", video_url);
		if(title != null)
			map.put("title", title);
		if(summary != null)
			map.put("summary", summary);
		if(content != null)
			map.put("content", content);
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
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(video_url != null)
			map.put("video_url", video_url);
		if(title != null)
			map.put("title", title);
		if(summary != null)
			map.put("summary", summary);
		if(content != null)
			map.put("content", content);
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
		customer_id = (String) map.get("customer_id");
		video_url = (String) map.get("video_url");
		title = (String) map.get("title");
		summary = (String) map.get("summary");
		content = (String) map.get("content");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object video_urlObj = map.get("video_url");
		if(video_urlObj != null)
			video_url = video_urlObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object summaryObj = map.get("summary");
		if(summaryObj != null)
			summary = summaryObj.toString();

		Object contentObj = map.get("content");
		if(contentObj != null)
			content = contentObj.toString();

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

	public String getVideo_url() {
		return video_url;
	}

	public String getVideo_urlEx() {
		return video_url != null ? video_url : "";
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public void unSetVideo_url() {
		this.video_url = null;
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

	public String getSummary() {
		return summary;
	}

	public String getSummaryEx() {
		return summary != null ? summary : "";
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void unSetSummary() {
		this.summary = null;
	}

	public String getContent() {
		return content;
	}

	public String getContentEx() {
		return content != null ? content : "";
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void unSetContent() {
		this.content = null;
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