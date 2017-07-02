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
public abstract class Basesms_daily_analysis extends BaseResource {
	private String id = null;
	private String date = null;
	private String reason = null;
	private String school_id = null;
	private String school_name = null;
	private Integer invoke_count = null;
	private Integer sent_count = null;
	private Integer failed_count = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_DATE = "date";
	public static String FIELD_REASON = "reason";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_INVOKE_COUNT = "invoke_count";
	public static String FIELD_SENT_COUNT = "sent_count";
	public static String FIELD_FAILED_COUNT = "failed_count";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("sms_daily_analysis");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field dateField = new Field("date", "String");
		dateField.setRequired(true);
		dateField.setLength(32);
		metaData.addField(dateField);

		Field reasonField = new Field("reason", "String");
		reasonField.setRequired(true);
		reasonField.setLength(32);
		metaData.addField(reasonField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setRequired(true);
		school_idField.setLength(32);
		metaData.addField(school_idField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setRequired(true);
		school_nameField.setLength(32);
		metaData.addField(school_nameField);

		Field invoke_countField = new Field("invoke_count", "int");
		metaData.addField(invoke_countField);

		Field sent_countField = new Field("sent_count", "int");
		metaData.addField(sent_countField);

		Field failed_countField = new Field("failed_count", "int");
		metaData.addField(failed_countField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("sms_daily_analysis");

		metaData.setCluster("DB_LOG");
	}

	public Basesms_daily_analysis() {}

	public Basesms_daily_analysis(Basesms_daily_analysis obj) {
		this.id = obj.id;
		this.date = obj.date;
		this.reason = obj.reason;
		this.school_id = obj.school_id;
		this.school_name = obj.school_name;
		this.invoke_count = obj.invoke_count;
		this.sent_count = obj.sent_count;
		this.failed_count = obj.failed_count;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(date != null)
			map.put("date", date);
		if(reason != null)
			map.put("reason", reason);
		if(school_id != null)
			map.put("school_id", school_id);
		if(school_name != null)
			map.put("school_name", school_name);
		if(invoke_count != null)
			map.put("invoke_count", invoke_count);
		if(sent_count != null)
			map.put("sent_count", sent_count);
		if(failed_count != null)
			map.put("failed_count", failed_count);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateDate(add))
			map.put("date", date);
		if(validateReason(add))
			map.put("reason", reason);
		if(validateSchool_id(add))
			map.put("school_id", school_id);
		if(validateSchool_name(add))
			map.put("school_name", school_name);
		if(invoke_count != null)
			map.put("invoke_count", invoke_count);
		if(sent_count != null)
			map.put("sent_count", sent_count);
		if(failed_count != null)
			map.put("failed_count", failed_count);
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
		date = (String) map.get("date");
		reason = (String) map.get("reason");
		school_id = (String) map.get("school_id");
		school_name = (String) map.get("school_name");
		invoke_count = (Integer) map.get("invoke_count");
		sent_count = (Integer) map.get("sent_count");
		failed_count = (Integer) map.get("failed_count");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object dateObj = map.get("date");
		if(dateObj != null)
			date = dateObj.toString();

		Object reasonObj = map.get("reason");
		if(reasonObj != null)
			reason = reasonObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object invoke_countObj = map.get("invoke_count");
		if(invoke_countObj != null)
			invoke_count = new Integer(invoke_countObj.toString());

		Object sent_countObj = map.get("sent_count");
		if(sent_countObj != null)
			sent_count = new Integer(sent_countObj.toString());

		Object failed_countObj = map.get("failed_count");
		if(failed_countObj != null)
			failed_count = new Integer(failed_countObj.toString());

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

	public String getDate() {
		return date;
	}

	public String getDateEx() {
		return date != null ? date : "";
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void unSetDate() {
		this.date = null;
	}

	public boolean validateDate(boolean add) throws ApplicationException {
		if(add && date == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[date]");
		return date != null;
	}

	public String getReason() {
		return reason;
	}

	public String getReasonEx() {
		return reason != null ? reason : "";
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void unSetReason() {
		this.reason = null;
	}

	public boolean validateReason(boolean add) throws ApplicationException {
		if(add && reason == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[reason]");
		return reason != null;
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

	public boolean validateSchool_id(boolean add) throws ApplicationException {
		if(add && school_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[school_id]");
		return school_id != null;
	}

	public String getSchool_name() {
		return school_name;
	}

	public String getSchool_nameEx() {
		return school_name != null ? school_name : "";
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void unSetSchool_name() {
		this.school_name = null;
	}

	public boolean validateSchool_name(boolean add) throws ApplicationException {
		if(add && school_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[school_name]");
		return school_name != null;
	}

	public Integer getInvoke_count() {
		return invoke_count;
	}

	public int getInvoke_countEx() {
		return invoke_count != null ? invoke_count : 0;
	}

	public void setInvoke_count(int invoke_count) {
		this.invoke_count = invoke_count;
	}

	public void setInvoke_count(Integer invoke_count) {
		this.invoke_count = invoke_count;
	}

	public void unSetInvoke_count() {
		this.invoke_count = null;
	}

	public Integer getSent_count() {
		return sent_count;
	}

	public int getSent_countEx() {
		return sent_count != null ? sent_count : 0;
	}

	public void setSent_count(int sent_count) {
		this.sent_count = sent_count;
	}

	public void setSent_count(Integer sent_count) {
		this.sent_count = sent_count;
	}

	public void unSetSent_count() {
		this.sent_count = null;
	}

	public Integer getFailed_count() {
		return failed_count;
	}

	public int getFailed_countEx() {
		return failed_count != null ? failed_count : 0;
	}

	public void setFailed_count(int failed_count) {
		this.failed_count = failed_count;
	}

	public void setFailed_count(Integer failed_count) {
		this.failed_count = failed_count;
	}

	public void unSetFailed_count() {
		this.failed_count = null;
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