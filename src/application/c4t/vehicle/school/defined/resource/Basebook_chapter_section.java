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
public abstract class Basebook_chapter_section extends BaseResource {
	private String id = null;
	private String name = null;
	private Long order = null;
	private String summary = null;
	private String content_text = null;
	private String book_id = null;
	private String chapter_id = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_ORDER = "order";
	public static String FIELD_SUMMARY = "summary";
	public static String FIELD_CONTENT_TEXT = "content_text";
	public static String FIELD_BOOK_ID = "book_id";
	public static String FIELD_CHAPTER_ID = "chapter_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("book_chapter_section");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(32);
		metaData.addField(nameField);

		Field orderField = new Field("order", "long");
		metaData.addField(orderField);

		Field summaryField = new Field("summary", "String");
		summaryField.setLength(32);
		metaData.addField(summaryField);

		Field content_textField = new Field("content_text", "String");
		content_textField.setLength(32);
		metaData.addField(content_textField);

		Field book_idField = new Field("book_id", "String");
		book_idField.setIndexed(true);
		book_idField.setLength(128);
		metaData.addField(book_idField);

		Field chapter_idField = new Field("chapter_id", "String");
		chapter_idField.setIndexed(true);
		chapter_idField.setLength(128);
		metaData.addField(chapter_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("book_chapter_section");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basebook_chapter_section() {}

	public Basebook_chapter_section(Basebook_chapter_section obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.order = obj.order;
		this.summary = obj.summary;
		this.content_text = obj.content_text;
		this.book_id = obj.book_id;
		this.chapter_id = obj.chapter_id;
		this.customer_id = obj.customer_id;
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
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(summary != null)
			map.put("summary", summary);
		if(content_text != null)
			map.put("content_text", content_text);
		if(book_id != null)
			map.put("book_id", book_id);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(name != null)
			map.put("name", name);
		if(order != null)
			map.put("order", order);
		if(summary != null)
			map.put("summary", summary);
		if(content_text != null)
			map.put("content_text", content_text);
		if(book_id != null)
			map.put("book_id", book_id);
		if(chapter_id != null)
			map.put("chapter_id", chapter_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		name = (String) map.get("name");
		order = (Long) map.get("order");
		summary = (String) map.get("summary");
		content_text = (String) map.get("content_text");
		book_id = (String) map.get("book_id");
		chapter_id = (String) map.get("chapter_id");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
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

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Long(orderObj.toString());

		Object summaryObj = map.get("summary");
		if(summaryObj != null)
			summary = summaryObj.toString();

		Object content_textObj = map.get("content_text");
		if(content_textObj != null)
			content_text = content_textObj.toString();

		Object book_idObj = map.get("book_id");
		if(book_idObj != null)
			book_id = book_idObj.toString();

		Object chapter_idObj = map.get("chapter_id");
		if(chapter_idObj != null)
			chapter_id = chapter_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public Long getOrder() {
		return order;
	}

	public long getOrderEx() {
		return order != null ? order : 0L;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public void unSetOrder() {
		this.order = null;
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

	public String getContent_text() {
		return content_text;
	}

	public String getContent_textEx() {
		return content_text != null ? content_text : "";
	}

	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}

	public void unSetContent_text() {
		this.content_text = null;
	}

	public String getBook_id() {
		return book_id;
	}

	public String getBook_idEx() {
		return book_id != null ? book_id : "";
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public void unSetBook_id() {
		this.book_id = null;
	}

	public String getChapter_id() {
		return chapter_id;
	}

	public String getChapter_idEx() {
		return chapter_id != null ? chapter_id : "";
	}

	public void setChapter_id(String chapter_id) {
		this.chapter_id = chapter_id;
	}

	public void unSetChapter_id() {
		this.chapter_id = null;
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