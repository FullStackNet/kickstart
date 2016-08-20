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
public abstract class Basebatch_signup_book extends BaseResource {
	private String id = null;
	private String batch_id = null;
	private String batch_name = null;
	private String book_id = null;
	private Integer order = null;
	private String book_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_BATCH_ID = "batch_id";
	public static String FIELD_BATCH_NAME = "batch_name";
	public static String FIELD_BOOK_ID = "book_id";
	public static String FIELD_ORDER = "order";
	public static String FIELD_BOOK_NAME = "book_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("batch_signup_book");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field batch_idField = new Field("batch_id", "String");
		batch_idField.setLength(128);
		metaData.addField(batch_idField);

		Field batch_nameField = new Field("batch_name", "String");
		batch_nameField.setLength(128);
		metaData.addField(batch_nameField);

		Field book_idField = new Field("book_id", "String");
		book_idField.setLength(128);
		metaData.addField(book_idField);

		Field orderField = new Field("order", "int");
		metaData.addField(orderField);

		Field book_nameField = new Field("book_name", "String");
		book_nameField.setLength(128);
		metaData.addField(book_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("batch_signup_book");

		metaData.setCluster("DB_LOG");
	}

	public Basebatch_signup_book() {}

	public Basebatch_signup_book(Basebatch_signup_book obj) {
		this.id = obj.id;
		this.batch_id = obj.batch_id;
		this.batch_name = obj.batch_name;
		this.book_id = obj.book_id;
		this.order = obj.order;
		this.book_name = obj.book_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(book_id != null)
			map.put("book_id", book_id);
		if(order != null)
			map.put("order", order);
		if(book_name != null)
			map.put("book_name", book_name);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(batch_id != null)
			map.put("batch_id", batch_id);
		if(batch_name != null)
			map.put("batch_name", batch_name);
		if(book_id != null)
			map.put("book_id", book_id);
		if(order != null)
			map.put("order", order);
		if(book_name != null)
			map.put("book_name", book_name);
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
		batch_id = (String) map.get("batch_id");
		batch_name = (String) map.get("batch_name");
		book_id = (String) map.get("book_id");
		order = (Integer) map.get("order");
		book_name = (String) map.get("book_name");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object batch_idObj = map.get("batch_id");
		if(batch_idObj != null)
			batch_id = batch_idObj.toString();

		Object batch_nameObj = map.get("batch_name");
		if(batch_nameObj != null)
			batch_name = batch_nameObj.toString();

		Object book_idObj = map.get("book_id");
		if(book_idObj != null)
			book_id = book_idObj.toString();

		Object orderObj = map.get("order");
		if(orderObj != null)
			order = new Integer(orderObj.toString());

		Object book_nameObj = map.get("book_name");
		if(book_nameObj != null)
			book_name = book_nameObj.toString();

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

	public String getBatch_id() {
		return batch_id;
	}

	public String getBatch_idEx() {
		return batch_id != null ? batch_id : "";
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public void unSetBatch_id() {
		this.batch_id = null;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String getBatch_nameEx() {
		return batch_name != null ? batch_name : "";
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public void unSetBatch_name() {
		this.batch_name = null;
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

	public String getBook_name() {
		return book_name;
	}

	public String getBook_nameEx() {
		return book_name != null ? book_name : "";
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void unSetBook_name() {
		this.book_name = null;
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