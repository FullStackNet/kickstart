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
public abstract class Basehomepage_rank_holder extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String photo_url = null;
	private String rank = null;
	private String exam = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_PHOTO_URL = "photo_url";
	public static String FIELD_RANK = "rank";
	public static String FIELD_EXAM = "exam";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("homepage_rank_holder");

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

		Field photo_urlField = new Field("photo_url", "String");
		photo_urlField.setLength(32);
		metaData.addField(photo_urlField);

		Field rankField = new Field("rank", "String");
		rankField.setLength(32);
		metaData.addField(rankField);

		Field examField = new Field("exam", "String");
		examField.setLength(32);
		metaData.addField(examField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("homepage_rank_holder");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basehomepage_rank_holder() {}

	public Basehomepage_rank_holder(Basehomepage_rank_holder obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.photo_url = obj.photo_url;
		this.rank = obj.rank;
		this.exam = obj.exam;
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
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(rank != null)
			map.put("rank", rank);
		if(exam != null)
			map.put("exam", exam);
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
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(rank != null)
			map.put("rank", rank);
		if(exam != null)
			map.put("exam", exam);
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
		photo_url = (String) map.get("photo_url");
		rank = (String) map.get("rank");
		exam = (String) map.get("exam");
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

		Object photo_urlObj = map.get("photo_url");
		if(photo_urlObj != null)
			photo_url = photo_urlObj.toString();

		Object rankObj = map.get("rank");
		if(rankObj != null)
			rank = rankObj.toString();

		Object examObj = map.get("exam");
		if(examObj != null)
			exam = examObj.toString();

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

	public String getPhoto_url() {
		return photo_url;
	}

	public String getPhoto_urlEx() {
		return photo_url != null ? photo_url : "";
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public void unSetPhoto_url() {
		this.photo_url = null;
	}

	public String getRank() {
		return rank;
	}

	public String getRankEx() {
		return rank != null ? rank : "";
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void unSetRank() {
		this.rank = null;
	}

	public String getExam() {
		return exam;
	}

	public String getExamEx() {
		return exam != null ? exam : "";
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	public void unSetExam() {
		this.exam = null;
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