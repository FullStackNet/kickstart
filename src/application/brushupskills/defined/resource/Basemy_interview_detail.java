/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.brushupskills.defined.resource;

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
public abstract class Basemy_interview_detail extends BaseResource {
	private String id = null;
	private String parent_id = null;
	private String question = null;
	private String asnwer = null;
	private Long date = null;
	private String date_str = null;
	private String candidate_id = null;
	private String company_name = null;
	private String role = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_PARENT_ID = "parent_id";
	public static String FIELD_QUESTION = "question";
	public static String FIELD_ASNWER = "asnwer";
	public static String FIELD_DATE = "date";
	public static String FIELD_DATE_STR = "date_str";
	public static String FIELD_CANDIDATE_ID = "candidate_id";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_ROLE = "role";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("my_interview_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field parent_idField = new Field("parent_id", "String");
		parent_idField.setIndexed(true);
		parent_idField.setRequired(true);
		parent_idField.setLength(128);
		metaData.addField(parent_idField);

		Field questionField = new Field("question", "String");
		questionField.setLength(128);
		metaData.addField(questionField);

		Field asnwerField = new Field("asnwer", "String");
		asnwerField.setLength(128);
		metaData.addField(asnwerField);

		Field dateField = new Field("date", "timestamp");
		metaData.addField(dateField);

		Field date_strField = new Field("date_str", "String");
		metaData.addField(date_strField);

		Field candidate_idField = new Field("candidate_id", "String");
		candidate_idField.setLength(128);
		metaData.addField(candidate_idField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field roleField = new Field("role", "String");
		roleField.setLength(128);
		metaData.addField(roleField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("my_interview_detail");

		metaData.setCluster("DB_QUESTION");
	}

	public Basemy_interview_detail() {}

	public Basemy_interview_detail(Basemy_interview_detail obj) {
		this.id = obj.id;
		this.parent_id = obj.parent_id;
		this.question = obj.question;
		this.asnwer = obj.asnwer;
		this.date = obj.date;
		this.date_str = obj.date_str;
		this.candidate_id = obj.candidate_id;
		this.company_name = obj.company_name;
		this.role = obj.role;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(parent_id != null)
			map.put("parent_id", parent_id);
		if(question != null)
			map.put("question", question);
		if(asnwer != null)
			map.put("asnwer", asnwer);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(role != null)
			map.put("role", role);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateParent_id(add))
			map.put("parent_id", parent_id);
		if(question != null)
			map.put("question", question);
		if(asnwer != null)
			map.put("asnwer", asnwer);
		if(date != null)
			map.put("date", date);
		if(date_str != null)
			map.put("date_str", date_str);
		if(candidate_id != null)
			map.put("candidate_id", candidate_id);
		if(company_name != null)
			map.put("company_name", company_name);
		if(role != null)
			map.put("role", role);
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
		parent_id = (String) map.get("parent_id");
		question = (String) map.get("question");
		asnwer = (String) map.get("asnwer");
		date = (Long) map.get("date");
		date_str = (String) map.get("date_str");
		candidate_id = (String) map.get("candidate_id");
		company_name = (String) map.get("company_name");
		role = (String) map.get("role");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object parent_idObj = map.get("parent_id");
		if(parent_idObj != null)
			parent_id = parent_idObj.toString();

		Object questionObj = map.get("question");
		if(questionObj != null)
			question = questionObj.toString();

		Object asnwerObj = map.get("asnwer");
		if(asnwerObj != null)
			asnwer = asnwerObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = (Long) dateObj;

		Object date_strObj = map.get("date_str");
		if(date_strObj != null)
			date_str = date_strObj.toString();

		Object candidate_idObj = map.get("candidate_id");
		if(candidate_idObj != null)
			candidate_id = candidate_idObj.toString();

		Object company_nameObj = map.get("company_name");
		if(company_nameObj != null)
			company_name = company_nameObj.toString();

		Object roleObj = map.get("role");
		if(roleObj != null)
			role = roleObj.toString();

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

	public String getParent_id() {
		return parent_id;
	}

	public String getParent_idEx() {
		return parent_id != null ? parent_id : "";
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public void unSetParent_id() {
		this.parent_id = null;
	}

	public boolean validateParent_id(boolean add) throws ApplicationException {
		if(add && parent_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[parent_id]");
		return parent_id != null;
	}

	public String getQuestion() {
		return question;
	}

	public String getQuestionEx() {
		return question != null ? question : "";
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void unSetQuestion() {
		this.question = null;
	}

	public String getAsnwer() {
		return asnwer;
	}

	public String getAsnwerEx() {
		return asnwer != null ? asnwer : "";
	}

	public void setAsnwer(String asnwer) {
		this.asnwer = asnwer;
	}

	public void unSetAsnwer() {
		this.asnwer = null;
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