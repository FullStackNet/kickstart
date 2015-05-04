/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.ArrayList;
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
public abstract class Basec4t_record_detail extends BaseResource {
	private String id = null;
	private String recipient_id = null;
	private ArrayList<Object> recipient_distributers = null;
	private ArrayList<Object> recipient_dealer = null;
	private ArrayList<Object> recipient_group = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_RECIPIENT_ID = "recipient_id";
	public static String FIELD_RECIPIENT_DISTRIBUTERS = "recipient_distributers";
	public static String FIELD_RECIPIENT_DEALER = "recipient_dealer";
	public static String FIELD_RECIPIENT_GROUP = "recipient_group";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_record_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field recipient_distributersField = new Field("recipient_distributers", "Array");
		metaData.addField(recipient_distributersField);

		Field recipient_dealerField = new Field("recipient_dealer", "Array");
		metaData.addField(recipient_dealerField);

		Field recipient_groupField = new Field("recipient_group", "Array");
		metaData.addField(recipient_groupField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_record_detail");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_record_detail() {}

	public Basec4t_record_detail(Basec4t_record_detail obj) {
		this.id = obj.id;
		this.recipient_id = obj.recipient_id;
		this.recipient_distributers = obj.recipient_distributers;
		this.recipient_dealer = obj.recipient_dealer;
		this.recipient_group = obj.recipient_group;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(recipient_id != null)
			map.put("recipient_id", recipient_id);
		if(recipient_distributers != null)
			map.put("recipient_distributers", recipient_distributers);
		if(recipient_dealer != null)
			map.put("recipient_dealer", recipient_dealer);
		if(recipient_group != null)
			map.put("recipient_group", recipient_group);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(recipient_id != null)
			map.put("recipient_id", recipient_id);
		if(recipient_distributers != null)
			map.put("recipient_distributers", recipient_distributers);
		if(recipient_dealer != null)
			map.put("recipient_dealer", recipient_dealer);
		if(recipient_group != null)
			map.put("recipient_group", recipient_group);
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
		recipient_distributers = (ArrayList<Object>) map.get("recipient_distributers");
		recipient_dealer = (ArrayList<Object>) map.get("recipient_dealer");
		recipient_group = (ArrayList<Object>) map.get("recipient_group");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		recipient_distributers = (ArrayList<Object>) map.get("recipient_distributers");
		recipient_dealer = (ArrayList<Object>) map.get("recipient_dealer");
		recipient_group = (ArrayList<Object>) map.get("recipient_group");
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

	public String getRecipient_id() {
		return recipient_id;
	}

	public String getRecipient_idEx() {
		return recipient_id != null ? recipient_id : "";
	}

	public void setRecipient_id(String recipient_id) {
		this.recipient_id = recipient_id;
	}

	public void unSetRecipient_id() {
		this.recipient_id = null;
	}

	public ArrayList<Object> getRecipient_distributers() {
		return recipient_distributers;
	}


	public void setRecipient_distributers(ArrayList<Object> recipient_distributers) {
		this.recipient_distributers = recipient_distributers;
	}

	public void addRecipient_distributers(Object value) {
		if(recipient_distributers == null)
			recipient_distributers = new ArrayList<Object>();
		recipient_distributers.add(value);
	}

	public void unSetRecipient_distributers() {
		this.recipient_distributers = null;
	}

	public ArrayList<Object> getRecipient_dealer() {
		return recipient_dealer;
	}


	public void setRecipient_dealer(ArrayList<Object> recipient_dealer) {
		this.recipient_dealer = recipient_dealer;
	}

	public void addRecipient_dealer(Object value) {
		if(recipient_dealer == null)
			recipient_dealer = new ArrayList<Object>();
		recipient_dealer.add(value);
	}

	public void unSetRecipient_dealer() {
		this.recipient_dealer = null;
	}

	public ArrayList<Object> getRecipient_group() {
		return recipient_group;
	}


	public void setRecipient_group(ArrayList<Object> recipient_group) {
		this.recipient_group = recipient_group;
	}

	public void addRecipient_group(Object value) {
		if(recipient_group == null)
			recipient_group = new ArrayList<Object>();
		recipient_group.add(value);
	}

	public void unSetRecipient_group() {
		this.recipient_group = null;
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
		return "DB_RECORD";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}