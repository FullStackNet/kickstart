/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.community.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseuser_community_map extends BaseResource {
	private String id = null; //user ids
	private ArrayList<String> community = null;
	private ArrayList<String> group_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY = "community";
	public static String FIELD_GROUP_ID = "group_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("user_community_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field communityField = new Field("community", "Array");
		metaData.addField(communityField);

		Field group_idField = new Field("group_id", "Array");
		metaData.addField(group_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("user_community_map");

		metaData.setCluster("DB_COMMUNITY");
	}

	public Baseuser_community_map() {}

	public Baseuser_community_map(Baseuser_community_map obj) {
		this.id = obj.id;
		this.community = obj.community;
		this.group_id = obj.group_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(community != null)
			map.put("community", community);
		if(group_id != null)
			map.put("group_id", group_id);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(community != null)
			map.put("community", community);
		if(group_id != null)
			map.put("group_id", group_id);
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
		community = (ArrayList<String>) map.get("community");
		group_id = (ArrayList<String>) map.get("group_id");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		community = (ArrayList<String>) map.get("community");
		group_id = (ArrayList<String>) map.get("group_id");
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

	public ArrayList<String> getCommunity() {
		return community;
	}


	public void setCommunity(ArrayList<String> community) {
		this.community = community;
	}

	public void addCommunity(String value) {
		if(community == null)
			community = new ArrayList<String>();
		community.add(value);
	}

	public void unSetCommunity() {
		this.community = null;
	}

	public ArrayList<String> getGroup_id() {
		return group_id;
	}


	public void setGroup_id(ArrayList<String> group_id) {
		this.group_id = group_id;
	}

	public void addGroup_id(String value) {
		if(group_id == null)
			group_id = new ArrayList<String>();
		group_id.add(value);
	}

	public void unSetGroup_id() {
		this.group_id = null;
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
		return "DB_COMMUNITY";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}