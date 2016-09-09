/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basefeed extends BaseResource {
	private String id = null;
	private Long creation_time = null;
	private String profile_id = null;
	private String activity_profile_id = null;
	private String activity_id = null;
	private String action_type = null;
	private String feed = null;
	private String feed_type = null;
	private String reference_id = null;
	private String reference_name = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_PROFILE_ID = "profile_id";
	public static String FIELD_ACTIVITY_PROFILE_ID = "activity_profile_id";
	public static String FIELD_ACTIVITY_ID = "activity_id";
	public static String FIELD_ACTION_TYPE = "action_type";
	public static String FIELD_FEED = "feed";
	public static String FIELD_FEED_TYPE = "feed_type";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("feed");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field profile_idField = new Field("profile_id", "String");
		profile_idField.setLength(128);
		metaData.addField(profile_idField);

		Field activity_profile_idField = new Field("activity_profile_id", "String");
		activity_profile_idField.setLength(128);
		metaData.addField(activity_profile_idField);

		Field activity_idField = new Field("activity_id", "String");
		activity_idField.setLength(128);
		metaData.addField(activity_idField);

		Field action_typeField = new Field("action_type", "String");
		action_typeField.setLength(128);
		metaData.addField(action_typeField);

		Field feedField = new Field("feed", "String");
		feedField.setLength(128);
		metaData.addField(feedField);

		Field feed_typeField = new Field("feed_type", "String");
		feed_typeField.setLength(32);
		metaData.addField(feed_typeField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(128);
		metaData.addField(reference_nameField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("feed");

		metaData.setCluster("DB_LOG");
	}

	public Basefeed() {}

	public Basefeed(Basefeed obj) {
		this.id = obj.id;
		this.creation_time = obj.creation_time;
		this.profile_id = obj.profile_id;
		this.activity_profile_id = obj.activity_profile_id;
		this.activity_id = obj.activity_id;
		this.action_type = obj.action_type;
		this.feed = obj.feed;
		this.feed_type = obj.feed_type;
		this.reference_id = obj.reference_id;
		this.reference_name = obj.reference_name;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(profile_id != null)
			map.put("profile_id", profile_id);
		if(activity_profile_id != null)
			map.put("activity_profile_id", activity_profile_id);
		if(activity_id != null)
			map.put("activity_id", activity_id);
		if(action_type != null)
			map.put("action_type", action_type);
		if(feed != null)
			map.put("feed", feed);
		if(feed_type != null)
			map.put("feed_type", feed_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
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
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(profile_id != null)
			map.put("profile_id", profile_id);
		if(activity_profile_id != null)
			map.put("activity_profile_id", activity_profile_id);
		if(activity_id != null)
			map.put("activity_id", activity_id);
		if(action_type != null)
			map.put("action_type", action_type);
		if(feed != null)
			map.put("feed", feed);
		if(feed_type != null)
			map.put("feed_type", feed_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
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
		creation_time = (Long) map.get("creation_time");
		profile_id = (String) map.get("profile_id");
		activity_profile_id = (String) map.get("activity_profile_id");
		activity_id = (String) map.get("activity_id");
		action_type = (String) map.get("action_type");
		feed = (String) map.get("feed");
		feed_type = (String) map.get("feed_type");
		reference_id = (String) map.get("reference_id");
		reference_name = (String) map.get("reference_name");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object profile_idObj = map.get("profile_id");
		if(profile_idObj != null)
			profile_id = profile_idObj.toString();

		Object activity_profile_idObj = map.get("activity_profile_id");
		if(activity_profile_idObj != null)
			activity_profile_id = activity_profile_idObj.toString();

		Object activity_idObj = map.get("activity_id");
		if(activity_idObj != null)
			activity_id = activity_idObj.toString();

		Object action_typeObj = map.get("action_type");
		if(action_typeObj != null)
			action_type = action_typeObj.toString();

		Object feedObj = map.get("feed");
		if(feedObj != null)
			feed = feedObj.toString();

		Object feed_typeObj = map.get("feed_type");
		if(feed_typeObj != null)
			feed_type = feed_typeObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

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

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public boolean validateCreation_time(boolean add) throws ApplicationException {
		if(add && creation_time == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_time]");
		return creation_time != null;
	}

	public String getProfile_id() {
		return profile_id;
	}

	public String getProfile_idEx() {
		return profile_id != null ? profile_id : "";
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public void unSetProfile_id() {
		this.profile_id = null;
	}

	public String getActivity_profile_id() {
		return activity_profile_id;
	}

	public String getActivity_profile_idEx() {
		return activity_profile_id != null ? activity_profile_id : "";
	}

	public void setActivity_profile_id(String activity_profile_id) {
		this.activity_profile_id = activity_profile_id;
	}

	public void unSetActivity_profile_id() {
		this.activity_profile_id = null;
	}

	public String getActivity_id() {
		return activity_id;
	}

	public String getActivity_idEx() {
		return activity_id != null ? activity_id : "";
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	public void unSetActivity_id() {
		this.activity_id = null;
	}

	public String getAction_type() {
		return action_type;
	}

	public String getAction_typeEx() {
		return action_type != null ? action_type : "";
	}

	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}

	public void unSetAction_type() {
		this.action_type = null;
	}

	public String getFeed() {
		return feed;
	}

	public String getFeedEx() {
		return feed != null ? feed : "";
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public void unSetFeed() {
		this.feed = null;
	}

	public String getFeed_type() {
		return feed_type;
	}

	public String getFeed_typeEx() {
		return feed_type != null ? feed_type : "";
	}

	public void setFeed_type(String feed_type) {
		this.feed_type = feed_type;
	}

	public void unSetFeed_type() {
		this.feed_type = null;
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

	public String getReference_name() {
		return reference_name;
	}

	public String getReference_nameEx() {
		return reference_name != null ? reference_name : "";
	}

	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}

	public void unSetReference_name() {
		this.reference_name = null;
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