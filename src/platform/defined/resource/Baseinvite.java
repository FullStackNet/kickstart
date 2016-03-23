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
public abstract class Baseinvite extends BaseResource {
	private String id = null;
	private String type = null;
	private String relation = null;
	private String community_id = null;
	private String school_id = null;
	private String name = null;
	private String company_id = null;
	private String company_name = null;
	private String mobile_no = null;
	private String email_id = null;
	private String customer_id = null;
	private String invite_type = null;
	private String reference_type = null;
	private String reference_id = null;
	private String reference_name = null;
	private String fleetService = null;
	private String gameService = null;
	private String communityService = null;
	private String schoolTrackerService = null;
	private String dgService = null;
	private String key = null;
	private String invite_status = null;
	private String password = null;
	private String confirm_password = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_TYPE = "type";
	public static String FIELD_RELATION = "relation";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_COMPANY_ID = "company_id";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_EMAIL_ID = "email_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_INVITE_TYPE = "invite_type";
	public static String FIELD_REFERENCE_TYPE = "reference_type";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_REFERENCE_NAME = "reference_name";
	public static String FIELD_FLEETSERVICE = "fleetService";
	public static String FIELD_GAMESERVICE = "gameService";
	public static String FIELD_COMMUNITYSERVICE = "communityService";
	public static String FIELD_SCHOOLTRACKERSERVICE = "schoolTrackerService";
	public static String FIELD_DGSERVICE = "dgService";
	public static String FIELD_KEY = "key";
	public static String FIELD_INVITE_STATUS = "invite_status";
	public static String FIELD_PASSWORD = "password";
	public static String FIELD_CONFIRM_PASSWORD = "confirm_password";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("invite");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field typeField = new Field("type", "String");
		typeField.setLength(32);
		metaData.addField(typeField);

		Field relationField = new Field("relation", "String");
		relationField.setLength(32);
		metaData.addField(relationField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field company_idField = new Field("company_id", "String");
		company_idField.setLength(128);
		metaData.addField(company_idField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setIndexed(true);
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field email_idField = new Field("email_id", "String");
		email_idField.setIndexed(true);
		email_idField.setLength(128);
		metaData.addField(email_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field invite_typeField = new Field("invite_type", "String");
		invite_typeField.setLength(128);
		metaData.addField(invite_typeField);

		Field reference_typeField = new Field("reference_type", "String");
		reference_typeField.setLength(128);
		metaData.addField(reference_typeField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field reference_nameField = new Field("reference_name", "String");
		reference_nameField.setLength(128);
		metaData.addField(reference_nameField);

		Field fleetServiceField = new Field("fleetService", "String");
		fleetServiceField.setLength(1);
		metaData.addField(fleetServiceField);

		Field gameServiceField = new Field("gameService", "String");
		gameServiceField.setLength(1);
		metaData.addField(gameServiceField);

		Field communityServiceField = new Field("communityService", "String");
		communityServiceField.setLength(1);
		metaData.addField(communityServiceField);

		Field schoolTrackerServiceField = new Field("schoolTrackerService", "String");
		schoolTrackerServiceField.setLength(1);
		metaData.addField(schoolTrackerServiceField);

		Field dgServiceField = new Field("dgService", "String");
		dgServiceField.setLength(1);
		metaData.addField(dgServiceField);

		Field keyField = new Field("key", "String");
		keyField.setLength(128);
		metaData.addField(keyField);

		Field invite_statusField = new Field("invite_status", "String");
		invite_statusField.setLength(128);
		metaData.addField(invite_statusField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("invite");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseinvite() {}

	public Baseinvite(Baseinvite obj) {
		this.id = obj.id;
		this.type = obj.type;
		this.relation = obj.relation;
		this.community_id = obj.community_id;
		this.school_id = obj.school_id;
		this.name = obj.name;
		this.company_id = obj.company_id;
		this.company_name = obj.company_name;
		this.mobile_no = obj.mobile_no;
		this.email_id = obj.email_id;
		this.customer_id = obj.customer_id;
		this.invite_type = obj.invite_type;
		this.reference_type = obj.reference_type;
		this.reference_id = obj.reference_id;
		this.reference_name = obj.reference_name;
		this.fleetService = obj.fleetService;
		this.gameService = obj.gameService;
		this.communityService = obj.communityService;
		this.schoolTrackerService = obj.schoolTrackerService;
		this.dgService = obj.dgService;
		this.key = obj.key;
		this.invite_status = obj.invite_status;
		this.password = obj.password;
		this.confirm_password = obj.confirm_password;
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
		if(type != null)
			map.put("type", type);
		if(relation != null)
			map.put("relation", relation);
		if(community_id != null)
			map.put("community_id", community_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
		if(company_id != null)
			map.put("company_id", company_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(invite_type != null)
			map.put("invite_type", invite_type);
		if(reference_type != null)
			map.put("reference_type", reference_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		if(invite_status != null)
			map.put("invite_status", invite_status);
		if(password != null)
			map.put("password", password);
		if(confirm_password != null)
			map.put("confirm_password", confirm_password);
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
		if(type != null)
			map.put("type", type);
		if(relation != null)
			map.put("relation", relation);
		if(community_id != null)
			map.put("community_id", community_id);
		if(school_id != null)
			map.put("school_id", school_id);
		if(name != null)
			map.put("name", name);
		if(company_id != null)
			map.put("company_id", company_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(email_id != null)
			map.put("email_id", email_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(invite_type != null)
			map.put("invite_type", invite_type);
		if(reference_type != null)
			map.put("reference_type", reference_type);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(reference_name != null)
			map.put("reference_name", reference_name);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(key != null)
			map.put("key", key);
		if(invite_status != null)
			map.put("invite_status", invite_status);
		if(password != null)
			map.put("password", password);
		if(confirm_password != null)
			map.put("confirm_password", confirm_password);
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
		type = (String) map.get("type");
		relation = (String) map.get("relation");
		community_id = (String) map.get("community_id");
		school_id = (String) map.get("school_id");
		name = (String) map.get("name");
		company_id = (String) map.get("company_id");
		company_name = (String) map.get("company_name");
		mobile_no = (String) map.get("mobile_no");
		email_id = (String) map.get("email_id");
		customer_id = (String) map.get("customer_id");
		invite_type = (String) map.get("invite_type");
		reference_type = (String) map.get("reference_type");
		reference_id = (String) map.get("reference_id");
		reference_name = (String) map.get("reference_name");
		fleetService = (String) map.get("fleetService");
		gameService = (String) map.get("gameService");
		communityService = (String) map.get("communityService");
		schoolTrackerService = (String) map.get("schoolTrackerService");
		dgService = (String) map.get("dgService");
		key = (String) map.get("key");
		invite_status = (String) map.get("invite_status");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object relationObj = map.get("relation");
		if(relationObj != null)
			relation = relationObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object company_idObj = map.get("company_id");
		if(company_idObj != null)
			company_id = company_idObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object email_idObj = map.get("email_id");
		if(email_idObj != null)
			email_id = email_idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object invite_typeObj = map.get("invite_type");
		if(invite_typeObj != null)
			invite_type = invite_typeObj.toString();

		Object reference_typeObj = map.get("reference_type");
		if(reference_typeObj != null)
			reference_type = reference_typeObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object reference_nameObj = map.get("reference_name");
		if(reference_nameObj != null)
			reference_name = reference_nameObj.toString();

		Object fleetServiceObj = map.get("fleetService");
		if(fleetServiceObj != null)
			fleetService = fleetServiceObj.toString();

		Object gameServiceObj = map.get("gameService");
		if(gameServiceObj != null)
			gameService = gameServiceObj.toString();

		Object communityServiceObj = map.get("communityService");
		if(communityServiceObj != null)
			communityService = communityServiceObj.toString();

		Object schoolTrackerServiceObj = map.get("schoolTrackerService");
		if(schoolTrackerServiceObj != null)
			schoolTrackerService = schoolTrackerServiceObj.toString();

		Object dgServiceObj = map.get("dgService");
		if(dgServiceObj != null)
			dgService = dgServiceObj.toString();

		Object keyObj = map.get("key");
		if(keyObj != null)
			key = keyObj.toString();

		Object invite_statusObj = map.get("invite_status");
		if(invite_statusObj != null)
			invite_status = invite_statusObj.toString();

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

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getRelation() {
		return relation;
	}

	public String getRelationEx() {
		return relation != null ? relation : "";
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public void unSetRelation() {
		this.relation = null;
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

	public String getSchool_id() {
		return school_id;
	}

	public String getSchool_idEx() {
		return school_id != null ? school_id : "";
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public void unSetSchool_id() {
		this.school_id = null;
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

	public String getCompany_id() {
		return company_id;
	}

	public String getCompany_idEx() {
		return company_id != null ? company_id : "";
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public void unSetCompany_id() {
		this.company_id = null;
	}

	public String getCompany_name() {
		return company_name;
	}

	public String getCompany_nameEx() {
		return company_name != null ? company_name : "";
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public void unSetCompany_name() {
		this.company_name = null;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getEmail_idEx() {
		return email_id != null ? email_id : "";
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void unSetEmail_id() {
		this.email_id = null;
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

	public String getInvite_type() {
		return invite_type;
	}

	public String getInvite_typeEx() {
		return invite_type != null ? invite_type : "";
	}

	public void setInvite_type(String invite_type) {
		this.invite_type = invite_type;
	}

	public void unSetInvite_type() {
		this.invite_type = null;
	}

	public String getReference_type() {
		return reference_type;
	}

	public String getReference_typeEx() {
		return reference_type != null ? reference_type : "";
	}

	public void setReference_type(String reference_type) {
		this.reference_type = reference_type;
	}

	public void unSetReference_type() {
		this.reference_type = null;
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

	public String getFleetService() {
		return fleetService;
	}

	public String getFleetServiceEx() {
		return fleetService != null ? fleetService : "";
	}

	public void setFleetService(String fleetService) {
		this.fleetService = fleetService;
	}

	public void unSetFleetService() {
		this.fleetService = null;
	}

	public String getGameService() {
		return gameService;
	}

	public String getGameServiceEx() {
		return gameService != null ? gameService : "";
	}

	public void setGameService(String gameService) {
		this.gameService = gameService;
	}

	public void unSetGameService() {
		this.gameService = null;
	}

	public String getCommunityService() {
		return communityService;
	}

	public String getCommunityServiceEx() {
		return communityService != null ? communityService : "";
	}

	public void setCommunityService(String communityService) {
		this.communityService = communityService;
	}

	public void unSetCommunityService() {
		this.communityService = null;
	}

	public String getSchoolTrackerService() {
		return schoolTrackerService;
	}

	public String getSchoolTrackerServiceEx() {
		return schoolTrackerService != null ? schoolTrackerService : "";
	}

	public void setSchoolTrackerService(String schoolTrackerService) {
		this.schoolTrackerService = schoolTrackerService;
	}

	public void unSetSchoolTrackerService() {
		this.schoolTrackerService = null;
	}

	public String getDgService() {
		return dgService;
	}

	public String getDgServiceEx() {
		return dgService != null ? dgService : "";
	}

	public void setDgService(String dgService) {
		this.dgService = dgService;
	}

	public void unSetDgService() {
		this.dgService = null;
	}

	public String getKey() {
		return key;
	}

	public String getKeyEx() {
		return key != null ? key : "";
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void unSetKey() {
		this.key = null;
	}

	public String getInvite_status() {
		return invite_status;
	}

	public String getInvite_statusEx() {
		return invite_status != null ? invite_status : "";
	}

	public void setInvite_status(String invite_status) {
		this.invite_status = invite_status;
	}

	public void unSetInvite_status() {
		this.invite_status = null;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordEx() {
		return password != null ? password : "";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void unSetPassword() {
		this.password = null;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public String getConfirm_passwordEx() {
		return confirm_password != null ? confirm_password : "";
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public void unSetConfirm_password() {
		this.confirm_password = null;
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
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}