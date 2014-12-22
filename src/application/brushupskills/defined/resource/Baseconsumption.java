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
public abstract class Baseconsumption extends BaseResource {
	private String id = null;
	private String candidate_id = null;
	private String transaction_type = null;
	private String reference_id = null;
	private Integer points = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_TRANSACTION_TYPE = "transaction_type";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_POINTS = "points";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("consumption");

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

		Field transaction_typeField = new Field("transaction_type", "String");
		transaction_typeField.setLength(20);
		metaData.addField(transaction_typeField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field pointsField = new Field("points", "int");
		pointsField.setDefaultValue(0);
		metaData.addField(pointsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("consumption");

		metaData.setCluster("DB_QUESTION");
	}

	public Baseconsumption() {}

	public Baseconsumption(Baseconsumption obj) {
		this.id = obj.id;
		this.candidate_id = obj.candidate_id;
		this.transaction_type = obj.transaction_type;
		this.reference_id = obj.reference_id;
		this.points = obj.points;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(points == null)
			points = 0;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(transaction_type != null)
			map.put("transaction_type", transaction_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(points != null)
			map.put("points", points);
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
		if(transaction_type != null)
			map.put("transaction_type", transaction_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(points != null)
			map.put("points", points);
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
		transaction_type = (String) map.get("transaction_type");
		reference_id = (String) map.get("reference_id");
		points = (Integer) map.get("points");
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

		Object transaction_typeObj = map.get("transaction_type");
		if(transaction_typeObj != null)
			transaction_type = transaction_typeObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object pointsObj = map.get("points");
		if(pointsObj != null)
			points = new Integer(pointsObj.toString());

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

	public String getTransaction_type() {
		return transaction_type;
	}

	public String getTransaction_typeEx() {
		return transaction_type != null ? transaction_type : "";
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public void unSetTransaction_type() {
		this.transaction_type = null;
	}

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
	}

	public Integer getPoints() {
		return points != null ? points : 0;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public void unSetPoints() {
		this.points = 0;
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