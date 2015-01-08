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
public abstract class Basemy_interview extends BaseResource {
	private String id = null;
	private String candidate_id = null;
	private String company_name = null;
	private String location = null;
	private String role = null;
	private String telephonic = null;
	private Integer round = null;
	private String interview_type = null;
	private Long date = null;
	private String date_str = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_LOCATION = "location";
	public static String FIELD_ROLE = "role";
	public static String FIELD_TELEPHONIC = "telephonic";
	public static String FIELD_ROUND = "round";
	public static String FIELD_INTERVIEW_TYPE = "interview_type";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("my_interview");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field candidate_idField = new Field("candidate_id", "String");
		candidate_idField.setIndexed(true);
		candidate_idField.setLength(128);
		metaData.addField(candidate_idField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setIndexed(true);
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field locationField = new Field("location", "String");
		locationField.setIndexed(true);
		locationField.setLength(128);
		metaData.addField(locationField);

		Field roleField = new Field("role", "String");
		roleField.setIndexed(true);
		roleField.setLength(128);
		metaData.addField(roleField);

		Field telephonicField = new Field("telephonic", "String");
		telephonicField.setIndexed(true);
		telephonicField.setLength(128);
		metaData.addField(telephonicField);

		Field roundField = new Field("round", "int");
		roundField.setLength(128);
		metaData.addField(roundField);

		Field interview_typeField = new Field("interview_type", "String");
		interview_typeField.setLength(128);
		metaData.addField(interview_typeField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		date_strField.setLength(16);
		metaData.addField(date_strField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("my_interview");

		metaData.setCluster("DB_QUESTION");
	}

	public Basemy_interview() {}

	public Basemy_interview(Basemy_interview obj) {
		this.id = obj.id;
		this.candidate_id = obj.candidate_id;
		this.company_name = obj.company_name;
		this.location = obj.location;
		this.role = obj.role;
		this.telephonic = obj.telephonic;
		this.round = obj.round;
		this.interview_type = obj.interview_type;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(location != null)
			map.put("location", location);
		if(role != null)
			map.put("role", role);
		if(telephonic != null)
			map.put("telephonic", telephonic);
		if(round != null)
			map.put("round", round);
		if(interview_type != null)
			map.put("interview_type", interview_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(location != null)
			map.put("location", location);
		if(role != null)
			map.put("role", role);
		if(telephonic != null)
			map.put("telephonic", telephonic);
		if(round != null)
			map.put("round", round);
		if(interview_type != null)
			map.put("interview_type", interview_type);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
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
		company_name = (String) map.get("company_name");
		location = (String) map.get("location");
		role = (String) map.get("role");
		telephonic = (String) map.get("telephonic");
		round = (Integer) map.get("round");
		interview_type = (String) map.get("interview_type");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
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

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object locationObj = map.get("location");
		if(locationObj != null)
			location = locationObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

		Object telephonicObj = map.get("telephonic");
		if(telephonicObj != null)
			telephonic = telephonicObj.toString();

		Object roundObj = map.get("round");
		if(roundObj != null)
			round = new Integer(roundObj.toString());

		Object interview_typeObj = map.get("interview_type");
		if(interview_typeObj != null)
			interview_type = interview_typeObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

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

	public String getLocation() {
		return location;
	}

	public String getLocationEx() {
		return location != null ? location : "";
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void unSetLocation() {
		this.location = null;
	}

	public String getRole() {
		return role;
	}

	public String getRoleEx() {
		return role != null ? role : "";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void unSetRole() {
		this.role = null;
	}

	public String getTelephonic() {
		return telephonic;
	}

	public String getTelephonicEx() {
		return telephonic != null ? telephonic : "";
	}

	public void setTelephonic(String telephonic) {
		this.telephonic = telephonic;
	}

	public void unSetTelephonic() {
		this.telephonic = null;
	}

	public Integer getRound() {
		return round;
	}

	public int getRoundEx() {
		return round != null ? round : 0;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	public void unSetRound() {
		this.round = null;
	}

	public String getInterview_type() {
		return interview_type;
	}

	public String getInterview_typeEx() {
		return interview_type != null ? interview_type : "";
	}

	public void setInterview_type(String interview_type) {
		this.interview_type = interview_type;
	}

	public void unSetInterview_type() {
		this.interview_type = null;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}


	public String getDate_str() {
		return date_str;
	}

	public String getDate_strEx() {
		return date_str != null ? date_str : "";
	}

	public void setDate_str(String date_str) {
		this.date_str = date_str;
	}

	public void unSetDate_str() {
		this.date_str = null;
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