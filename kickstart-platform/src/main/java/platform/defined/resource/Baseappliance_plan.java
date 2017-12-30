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
public abstract class Baseappliance_plan extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String appliance_name = null;
	private String appliance_serialno = null;
	private String plan_id = null;
	private String plan_name = null;
	private Long start_date = null;
	private String start_date_str = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_APPLIANCE_NAME = "appliance_name";
	public static String FIELD_APPLIANCE_SERIALNO = "appliance_serialno";
	public static String FIELD_PLAN_ID = "plan_id";
	public static String FIELD_PLAN_NAME = "plan_name";
	public static String FIELD_START_DATE = "start_date";
	public static String FIELD_START_DATE_STR = "start_date_str";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_plan");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field appliance_nameField = new Field("appliance_name", "String");
		appliance_nameField.setRequired(true);
		appliance_nameField.setLength(128);
		metaData.addField(appliance_nameField);

		Field appliance_serialnoField = new Field("appliance_serialno", "String");
		appliance_serialnoField.setRequired(true);
		appliance_serialnoField.setLength(128);
		metaData.addField(appliance_serialnoField);

		Field plan_idField = new Field("plan_id", "String");
		plan_idField.setLength(128);
		metaData.addField(plan_idField);

		Field plan_nameField = new Field("plan_name", "String");
		plan_nameField.setLength(128);
		metaData.addField(plan_nameField);

		Field start_dateField = new Field("start_date", "long");
		metaData.addField(start_dateField);

		Field start_date_strField = new Field("start_date_str", "String");
		metaData.addField(start_date_strField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_plan");

		metaData.setCluster("DB_PROFILE");
	}

	public Baseappliance_plan() {}

	public Baseappliance_plan(Baseappliance_plan obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.appliance_name = obj.appliance_name;
		this.appliance_serialno = obj.appliance_serialno;
		this.plan_id = obj.plan_id;
		this.plan_name = obj.plan_name;
		this.start_date = obj.start_date;
		this.start_date_str = obj.start_date_str;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(appliance_name != null)
			map.put("appliance_name", appliance_name);
		if(appliance_serialno != null)
			map.put("appliance_serialno", appliance_serialno);
		if(plan_id != null)
			map.put("plan_id", plan_id);
		if(plan_name != null)
			map.put("plan_name", plan_name);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateAppliance_name(add))
			map.put("appliance_name", appliance_name);
		if(validateAppliance_serialno(add))
			map.put("appliance_serialno", appliance_serialno);
		if(plan_id != null)
			map.put("plan_id", plan_id);
		if(plan_name != null)
			map.put("plan_name", plan_name);
		if(start_date != null)
			map.put("start_date", start_date);
		if(start_date_str != null)
			map.put("start_date_str", start_date_str);
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
		appliance_id = (String) map.get("appliance_id");
		appliance_name = (String) map.get("appliance_name");
		appliance_serialno = (String) map.get("appliance_serialno");
		plan_id = (String) map.get("plan_id");
		plan_name = (String) map.get("plan_name");
		start_date = (Long) map.get("start_date");
		start_date_str = (String) map.get("start_date_str");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object appliance_idObj = map.get("appliance_id");
		if(appliance_idObj != null)
			appliance_id = appliance_idObj.toString();

		Object appliance_nameObj = map.get("appliance_name");
		if(appliance_nameObj != null)
			appliance_name = appliance_nameObj.toString();

		Object appliance_serialnoObj = map.get("appliance_serialno");
		if(appliance_serialnoObj != null)
			appliance_serialno = appliance_serialnoObj.toString();

		Object plan_idObj = map.get("plan_id");
		if(plan_idObj != null)
			plan_id = plan_idObj.toString();

		Object plan_nameObj = map.get("plan_name");
		if(plan_nameObj != null)
			plan_name = plan_nameObj.toString();

		Object start_dateObj = map.get("start_date");
		if(start_dateObj != null)
			start_date = new Long(start_dateObj.toString());

		Object start_date_strObj = map.get("start_date_str");
		if(start_date_strObj != null)
			start_date_str = start_date_strObj.toString();

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

	public String getAppliance_id() {
		return appliance_id;
	}

	public String getAppliance_idEx() {
		return appliance_id != null ? appliance_id : "";
	}

	public void setAppliance_id(String appliance_id) {
		this.appliance_id = appliance_id;
	}

	public void unSetAppliance_id() {
		this.appliance_id = null;
	}

	public boolean validateAppliance_id(boolean add) throws ApplicationException {
		if(add && appliance_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_id]");
		return appliance_id != null;
	}

	public String getAppliance_name() {
		return appliance_name;
	}

	public String getAppliance_nameEx() {
		return appliance_name != null ? appliance_name : "";
	}

	public void setAppliance_name(String appliance_name) {
		this.appliance_name = appliance_name;
	}

	public void unSetAppliance_name() {
		this.appliance_name = null;
	}

	public boolean validateAppliance_name(boolean add) throws ApplicationException {
		if(add && appliance_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_name]");
		return appliance_name != null;
	}

	public String getAppliance_serialno() {
		return appliance_serialno;
	}

	public String getAppliance_serialnoEx() {
		return appliance_serialno != null ? appliance_serialno : "";
	}

	public void setAppliance_serialno(String appliance_serialno) {
		this.appliance_serialno = appliance_serialno;
	}

	public void unSetAppliance_serialno() {
		this.appliance_serialno = null;
	}

	public boolean validateAppliance_serialno(boolean add) throws ApplicationException {
		if(add && appliance_serialno == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[appliance_serialno]");
		return appliance_serialno != null;
	}

	public String getPlan_id() {
		return plan_id;
	}

	public String getPlan_idEx() {
		return plan_id != null ? plan_id : "";
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public void unSetPlan_id() {
		this.plan_id = null;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public String getPlan_nameEx() {
		return plan_name != null ? plan_name : "";
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public void unSetPlan_name() {
		this.plan_name = null;
	}

	public Long getStart_date() {
		return start_date;
	}

	public long getStart_dateEx() {
		return start_date != null ? start_date : 0L;
	}

	public void setStart_date(long start_date) {
		this.start_date = start_date;
	}

	public void setStart_date(Long start_date) {
		this.start_date = start_date;
	}

	public void unSetStart_date() {
		this.start_date = null;
	}

	public String getStart_date_str() {
		return start_date_str;
	}

	public String getStart_date_strEx() {
		return start_date_str != null ? start_date_str : "";
	}

	public void setStart_date_str(String start_date_str) {
		this.start_date_str = start_date_str;
	}

	public void unSetStart_date_str() {
		this.start_date_str = null;
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