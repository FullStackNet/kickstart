/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basetransaction extends BaseResource {
	private String id = null;
	private String candidate_id = null;
	private String transaction_number = null;
	private String amount = null;
	private Long points = null;
	private Long creation_time = null;
	private Long expiry_time = null;
	private String status = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_TRANSACTION_NUMBER = "transaction_number";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_POINTS = "points";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXPIRY_TIME = "expiry_time";
	public static String FIELD_STATUS = "status";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("transaction");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field candidate_idField = new Field("candidate_id", "String");
		candidate_idField.setIndexed(true);
		candidate_idField.setLength(20);
		metaData.addField(candidate_idField);

		Field transaction_numberField = new Field("transaction_number", "String");
		transaction_numberField.setLength(20);
		metaData.addField(transaction_numberField);

		Field amountField = new Field("amount", "String");
		amountField.setLength(128);
		metaData.addField(amountField);

		Field pointsField = new Field("points", "long");
		metaData.addField(pointsField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field expiry_timeField = new Field("expiry_time", "timestamp");
		metaData.addField(expiry_timeField);

		Field statusField = new Field("status", "String");
		statusField.setDefaultValue("NEW");
		statusField.setLength(32);
		metaData.addField(statusField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("transaction");

		metaData.setCluster("DB_QUESTION");
	}

	public Basetransaction() {}

	public Basetransaction(Basetransaction obj) {
		this.id = obj.id;
		this.candidate_id = obj.candidate_id;
		this.transaction_number = obj.transaction_number;
		this.amount = obj.amount;
		this.points = obj.points;
		this.creation_time = obj.creation_time;
		this.expiry_time = obj.expiry_time;
		this.status = obj.status;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(status == null)
			status = "NEW";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(transaction_number != null)
			map.put("transaction_number", transaction_number);
		if(amount != null)
			map.put("amount", amount);
		if(points != null)
			map.put("points", points);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(expiry_time != null)
			map.put("expiry_time", expiry_time);
		if(status != null)
			map.put("status", status);
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
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(transaction_number != null)
			map.put("transaction_number", transaction_number);
		if(amount != null)
			map.put("amount", amount);
		if(points != null)
			map.put("points", points);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(expiry_time != null)
			map.put("expiry_time", expiry_time);
		if(status != null)
			map.put("status", status);
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
		candidate_id = (String) map.get("candidate_id");
		transaction_number = (String) map.get("transaction_number");
		amount = (String) map.get("amount");
		points = (Long) map.get("points");
		creation_time = (Long) map.get("creation_time");
		expiry_time = (Long) map.get("expiry_time");
		status = (String) map.get("status");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object candidate_idObj = map.get("candidate_id");
		if(candidate_idObj != null)
			candidate_id = candidate_idObj.toString();

		Object transaction_numberObj = map.get("transaction_number");
		if(transaction_numberObj != null)
			transaction_number = transaction_numberObj.toString();

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = amountObj.toString();

		Object pointsObj = map.get("points");
		if(pointsObj != null)
			points = new Long(pointsObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object expiry_timeObj = map.get("expiry_time");
		if(expiry_timeObj != null)
			expiry_time = (Long) expiry_timeObj;

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

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

	public String getCandidate_id() {
		return candidate_id;
	}

	public String getCandidate_idEx() {
		return candidate_id != null ? candidate_id : "";
	}

	public void setCandidate_id(String candidate_id) {
		this.candidate_id = candidate_id;
	}

	public void unSetCandidate_id() {
		this.candidate_id = null;
	}

	public String getTransaction_number() {
		return transaction_number;
	}

	public String getTransaction_numberEx() {
		return transaction_number != null ? transaction_number : "";
	}

	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}

	public void unSetTransaction_number() {
		this.transaction_number = null;
	}

	public String getAmount() {
		return amount;
	}

	public String getAmountEx() {
		return amount != null ? amount : "";
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
	}

	public Long getPoints() {
		return points;
	}

	public long getPointsEx() {
		return points != null ? points : 0L;
	}

	public void setPoints(long points) {
		this.points = points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public void unSetPoints() {
		this.points = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getExpiry_time() {
		return expiry_time;
	}

	public void setExpiry_time(Long expiry_time) {
		this.expiry_time = expiry_time;
	}


	public String getStatus() {
		return status != null ? status : "NEW";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = "NEW";
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
		return "DB_QUESTION";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}