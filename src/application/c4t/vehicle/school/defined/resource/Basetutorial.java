/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Basetutorial extends BaseResource {
	private String id = null;
	private String class_name = null;
	private String customer_id = null;
	private String subject_id = null;
	private String title = null;
	private String description = null;
	private String pdf_url = null;
	private String video_url = null;
	private String tutorial_cateory_id = null;
	private String audio_url = null;
	private String assigment_url = null;
	private Integer order = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SUBJECT_ID = "subject_id";
	public static String FIELD_TITLE = "title";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_PDF_URL = "pdf_url";
	public static String FIELD_VIDEO_URL = "video_url";
	public static String FIELD_TUTORIAL_CATEORY_ID = "tutorial_cateory_id";
	public static String FIELD_AUDIO_URL = "audio_url";
	public static String FIELD_ASSIGMENT_URL = "assigment_url";
	public static String FIELD_ORDER = "order";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("tutorial");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(32);
		metaData.addField(class_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field subject_idField = new Field("subject_id", "String");
		subject_idField.setIndexed(true);
		subject_idField.setLength(128);
		metaData.addField(subject_idField);

		Field titleField = new Field("title", "String");
		titleField.setLength(512);
		metaData.addField(titleField);

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(4096);
		metaData.addField(descriptionField);

		Field pdf_urlField = new Field("pdf_url", "String");
		pdf_urlField.setLength(512);
		metaData.addField(pdf_urlField);

		Field video_urlField = new Field("video_url", "String");
		video_urlField.setLength(512);
		metaData.addField(video_urlField);

		Field tutorial_cateory_idField = new Field("tutorial_cateory_id", "String");
		tutorial_cateory_idField.setLength(128);
		metaData.addField(tutorial_cateory_idField);

		Field audio_urlField = new Field("audio_url", "String");
		audio_urlField.setLength(512);
		metaData.addField(audio_urlField);

		Field assigment_urlField = new Field("assigment_url", "String");
		assigment_urlField.setLength(512);
		metaData.addField(assigment_urlField);

		Field orderField = new Field("order", "int");
		metaData.addField(orderField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("tutorial");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basetutorial() {}

	public Basetutorial(Basetutorial obj) {
		this.id = obj.id;
		this.class_name = obj.class_name;
		this.customer_id = obj.customer_id;
		this.subject_id = obj.subject_id;
		this.title = obj.title;
		this.description = obj.description;
		this.pdf_url = obj.pdf_url;
		this.video_url = obj.video_url;
		this.tutorial_cateory_id = obj.tutorial_cateory_id;
		this.audio_url = obj.audio_url;
		this.assigment_url = obj.assigment_url;
		this.order = obj.order;
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(pdf_url != null)
			map.put("pdf_url", pdf_url);
		if(video_url != null)
			map.put("video_url", video_url);
		if(tutorial_cateory_id != null)
			map.put("tutorial_cateory_id", tutorial_cateory_id);
		if(audio_url != null)
			map.put("audio_url", audio_url);
		if(assigment_url != null)
			map.put("assigment_url", assigment_url);
		if(order != null)
			map.put("order", order);
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
		if(class_name != null)
			map.put("class_name", class_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(subject_id != null)
			map.put("subject_id", subject_id);
		if(title != null)
			map.put("title", title);
		if(description != null)
			map.put("description", description);
		if(pdf_url != null)
			map.put("pdf_url", pdf_url);
		if(video_url != null)
			map.put("video_url", video_url);
		if(tutorial_cateory_id != null)
			map.put("tutorial_cateory_id", tutorial_cateory_id);
		if(audio_url != null)
			map.put("audio_url", audio_url);
		if(assigment_url != null)
			map.put("assigment_url", assigment_url);
		if(order != null)
			map.put("order", order);
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
		class_name = (String) map.get("class_name");
		customer_id = (String) map.get("customer_id");
		subject_id = (String) map.get("subject_id");
		title = (String) map.get("title");
		description = (String) map.get("description");
		pdf_url = (String) map.get("pdf_url");
		video_url = (String) map.get("video_url");
		tutorial_cateory_id = (String) map.get("tutorial_cateory_id");
		audio_url = (String) map.get("audio_url");
		assigment_url = (String) map.get("assigment_url");
		order = (Integer) map.get("order");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object subject_idObj = map.get("subject_id");
		if(subject_idObj != null)
			subject_id = subject_idObj.toString();

		Object titleObj = map.get("title");
		if(titleObj != null)
			title = titleObj.toString();

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object pdf_urlObj = map.get("pdf_url");
		if(pdf_urlObj != null)
			pdf_url = pdf_urlObj.toString();

		Object video_urlObj = map.get("video_url");
		if(video_urlObj != null)
			video_url = video_urlObj.toString();

		Object tutorial_cateory_idObj = map.get("tutorial_cateory_id");
		if(tutorial_cateory_idObj != null)
			tutorial_cateory_id = tutorial_cateory_idObj.toString();

		Object audio_urlObj = map.get("audio_url");
		if(audio_urlObj != null)
			audio_url = audio_urlObj.toString();

		Object assigment_urlObj = map.get("assigment_url");
		if(assigment_urlObj != null)
			assigment_url = assigment_urlObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Integer(orderObj.toString());

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

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
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

	public String getSubject_id() {
		return subject_id;
	}

	public String getSubject_idEx() {
		return subject_id != null ? subject_id : "";
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public void unSetSubject_id() {
		this.subject_id = null;
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

	public String getPdf_url() {
		return pdf_url;
	}

	public String getPdf_urlEx() {
		return pdf_url != null ? pdf_url : "";
	}

	public void setPdf_url(String pdf_url) {
		this.pdf_url = pdf_url;
	}

	public void unSetPdf_url() {
		this.pdf_url = null;
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

	public String getTutorial_cateory_id() {
		return tutorial_cateory_id;
	}

	public String getTutorial_cateory_idEx() {
		return tutorial_cateory_id != null ? tutorial_cateory_id : "";
	}

	public void setTutorial_cateory_id(String tutorial_cateory_id) {
		this.tutorial_cateory_id = tutorial_cateory_id;
	}

	public void unSetTutorial_cateory_id() {
		this.tutorial_cateory_id = null;
	}

	public String getAudio_url() {
		return audio_url;
	}

	public String getAudio_urlEx() {
		return audio_url != null ? audio_url : "";
	}

	public void setAudio_url(String audio_url) {
		this.audio_url = audio_url;
	}

	public void unSetAudio_url() {
		this.audio_url = null;
	}

	public String getAssigment_url() {
		return assigment_url;
	}

	public String getAssigment_urlEx() {
		return assigment_url != null ? assigment_url : "";
	}

	public void setAssigment_url(String assigment_url) {
		this.assigment_url = assigment_url;
	}

	public void unSetAssigment_url() {
		this.assigment_url = null;
	}

	public Integer getOrder() {
		return order;
	}

	public int getOrderEx() {
		return order != null ? order : 0;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
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