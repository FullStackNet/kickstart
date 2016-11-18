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
public abstract class Basemandi_delivery extends BaseResource {
	private String id = null;
	private String user_id = null;
	private String user_name = null;
	private String remark = null;
	private Integer opening_bags = null;
	private Integer bags = null;
	private Integer balance = null;
	private String deleted = null;
	private String party_code = null;
	private String agent_code = null;
	private String party_id = null;
	private String agent_id = null;
	private String community_id = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_OPENING_BAGS = "opening_bags";
	public static String FIELD_BAGS = "bags";
	public static String FIELD_BALANCE = "balance";
	public static String FIELD_DELETED = "deleted";
	public static String FIELD_PARTY_CODE = "party_code";
	public static String FIELD_AGENT_CODE = "agent_code";
	public static String FIELD_PARTY_ID = "party_id";
	public static String FIELD_AGENT_ID = "agent_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("mandi_delivery");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(128);
		metaData.addField(remarkField);

		Field opening_bagsField = new Field("opening_bags", "int");
		metaData.addField(opening_bagsField);

		Field bagsField = new Field("bags", "int");
		metaData.addField(bagsField);

		Field balanceField = new Field("balance", "int");
		metaData.addField(balanceField);

		Field deletedField = new Field("deleted", "String");
		deletedField.setLength(128);
		metaData.addField(deletedField);

		Field party_codeField = new Field("party_code", "String");
		party_codeField.setLength(128);
		metaData.addField(party_codeField);

		Field agent_codeField = new Field("agent_code", "String");
		agent_codeField.setLength(128);
		metaData.addField(agent_codeField);

		Field party_idField = new Field("party_id", "String");
		party_idField.setLength(128);
		metaData.addField(party_idField);

		Field agent_idField = new Field("agent_id", "String");
		agent_idField.setLength(128);
		metaData.addField(agent_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "long");
		metaData.addField(last_update_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("mandi_delivery");

		metaData.setCluster("DB_LOG");
	}

	public Basemandi_delivery() {}

	public Basemandi_delivery(Basemandi_delivery obj) {
		this.id = obj.id;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.remark = obj.remark;
		this.opening_bags = obj.opening_bags;
		this.bags = obj.bags;
		this.balance = obj.balance;
		this.deleted = obj.deleted;
		this.party_code = obj.party_code;
		this.agent_code = obj.agent_code;
		this.party_id = obj.party_id;
		this.agent_id = obj.agent_id;
		this.community_id = obj.community_id;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
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
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(remark != null)
			map.put("remark", remark);
		if(opening_bags != null)
			map.put("opening_bags", opening_bags);
		if(bags != null)
			map.put("bags", bags);
		if(balance != null)
			map.put("balance", balance);
		if(deleted != null)
			map.put("deleted", deleted);
		if(party_code != null)
			map.put("party_code", party_code);
		if(agent_code != null)
			map.put("agent_code", agent_code);
		if(party_id != null)
			map.put("party_id", party_id);
		if(agent_id != null)
			map.put("agent_id", agent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(remark != null)
			map.put("remark", remark);
		if(opening_bags != null)
			map.put("opening_bags", opening_bags);
		if(bags != null)
			map.put("bags", bags);
		if(balance != null)
			map.put("balance", balance);
		if(deleted != null)
			map.put("deleted", deleted);
		if(party_code != null)
			map.put("party_code", party_code);
		if(agent_code != null)
			map.put("agent_code", agent_code);
		if(party_id != null)
			map.put("party_id", party_id);
		if(agent_id != null)
			map.put("agent_id", agent_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		remark = (String) map.get("remark");
		opening_bags = (Integer) map.get("opening_bags");
		bags = (Integer) map.get("bags");
		balance = (Integer) map.get("balance");
		deleted = (String) map.get("deleted");
		party_code = (String) map.get("party_code");
		agent_code = (String) map.get("agent_code");
		party_id = (String) map.get("party_id");
		agent_id = (String) map.get("agent_id");
		community_id = (String) map.get("community_id");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object opening_bagsObj = map.get("opening_bags");
		if(opening_bagsObj != null)
			opening_bags = new Integer(opening_bagsObj.toString());

		Object bagsObj = map.get("bags");
		if(bagsObj != null)
			bags = new Integer(bagsObj.toString());

		Object balanceObj = map.get("balance");
		if(balanceObj != null)
			balance = new Integer(balanceObj.toString());

		Object deletedObj = map.get("deleted");
		if(deletedObj != null)
			deleted = deletedObj.toString();

		Object party_codeObj = map.get("party_code");
		if(party_codeObj != null)
			party_code = party_codeObj.toString();

		Object agent_codeObj = map.get("agent_code");
		if(agent_codeObj != null)
			agent_code = agent_codeObj.toString();

		Object party_idObj = map.get("party_id");
		if(party_idObj != null)
			party_id = party_idObj.toString();

		Object agent_idObj = map.get("agent_id");
		if(agent_idObj != null)
			agent_id = agent_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

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

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
	}

	public Integer getOpening_bags() {
		return opening_bags;
	}

	public int getOpening_bagsEx() {
		return opening_bags != null ? opening_bags : 0;
	}

	public void setOpening_bags(int opening_bags) {
		this.opening_bags = opening_bags;
	}

	public void setOpening_bags(Integer opening_bags) {
		this.opening_bags = opening_bags;
	}

	public void unSetOpening_bags() {
		this.opening_bags = null;
	}

	public Integer getBags() {
		return bags;
	}

	public int getBagsEx() {
		return bags != null ? bags : 0;
	}

	public void setBags(int bags) {
		this.bags = bags;
	}

	public void setBags(Integer bags) {
		this.bags = bags;
	}

	public void unSetBags() {
		this.bags = null;
	}

	public Integer getBalance() {
		return balance;
	}

	public int getBalanceEx() {
		return balance != null ? balance : 0;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = null;
	}

	public String getDeleted() {
		return deleted;
	}

	public String getDeletedEx() {
		return deleted != null ? deleted : "";
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public void unSetDeleted() {
		this.deleted = null;
	}

	public String getParty_code() {
		return party_code;
	}

	public String getParty_codeEx() {
		return party_code != null ? party_code : "";
	}

	public void setParty_code(String party_code) {
		this.party_code = party_code;
	}

	public void unSetParty_code() {
		this.party_code = null;
	}

	public String getAgent_code() {
		return agent_code;
	}

	public String getAgent_codeEx() {
		return agent_code != null ? agent_code : "";
	}

	public void setAgent_code(String agent_code) {
		this.agent_code = agent_code;
	}

	public void unSetAgent_code() {
		this.agent_code = null;
	}

	public String getParty_id() {
		return party_id;
	}

	public String getParty_idEx() {
		return party_id != null ? party_id : "";
	}

	public void setParty_id(String party_id) {
		this.party_id = party_id;
	}

	public void unSetParty_id() {
		this.party_id = null;
	}

	public String getAgent_id() {
		return agent_id;
	}

	public String getAgent_idEx() {
		return agent_id != null ? agent_id : "";
	}

	public void setAgent_id(String agent_id) {
		this.agent_id = agent_id;
	}

	public void unSetAgent_id() {
		this.agent_id = null;
	}

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
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

	public Long getLast_update_time() {
		return last_update_time;
	}

	public long getLast_update_timeEx() {
		return last_update_time != null ? last_update_time : 0L;
	}

	public void setLast_update_time(long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void unSetLast_update_time() {
		this.last_update_time = null;
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