/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basereport_card_generation_request extends BaseResource {
	private String id = null;
	private Long creation_time = null;
	private String accessment_for = null;
	private String school_name = null;
	private String school_id = null;
	private String class_name = null;
	private String section_name = null;
	private String customer_id = null;
	private String accessment_type = null;
	private Integer total = null;
	private Integer generated = null;
	private String status = null;
	private String generated_by = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_ACCESSMENT_FOR = "accessment_for";
	public static String FIELD_SCHOOL_NAME = "school_name";
	public static String FIELD_SCHOOL_ID = "school_id";
	public static String FIELD_CLASS_NAME = "class_name";
	public static String FIELD_SECTION_NAME = "section_name";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_ACCESSMENT_TYPE = "accessment_type";
	public static String FIELD_TOTAL = "total";
	public static String FIELD_GENERATED = "generated";
	public static String FIELD_STATUS = "status";
	public static String FIELD_GENERATED_BY = "generated_by";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("report_card_generation_request");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field accessment_forField = new Field("accessment_for", "String");
		accessment_forField.setLength(128);
		metaData.addField(accessment_forField);

		Field school_nameField = new Field("school_name", "String");
		school_nameField.setIndexed(true);
		school_nameField.setLength(128);
		metaData.addField(school_nameField);

		Field school_idField = new Field("school_id", "String");
		school_idField.setIndexed(true);
		school_idField.setLength(128);
		metaData.addField(school_idField);

		Field class_nameField = new Field("class_name", "String");
		class_nameField.setLength(16);
		metaData.addField(class_nameField);

		Field section_nameField = new Field("section_name", "String");
		section_nameField.setLength(16);
		metaData.addField(section_nameField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setIndexed(true);
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field accessment_typeField = new Field("accessment_type", "String");
		accessment_typeField.setLength(32);
		metaData.addField(accessment_typeField);

		Field totalField = new Field("total", "int");
		metaData.addField(totalField);

		Field generatedField = new Field("generated", "int");
		metaData.addField(generatedField);

		Field statusField = new Field("status", "String");
		statusField.setLength(32);
		metaData.addField(statusField);

		Field generated_byField = new Field("generated_by", "String");
		generated_byField.setLength(128);
		metaData.addField(generated_byField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("report_card_generation_request");

		metaData.setCluster("DB_SCHOOL");
	}

	public Basereport_card_generation_request() {}

	public Basereport_card_generation_request(Basereport_card_generation_request obj) {
		this.id = obj.id;
		this.creation_time = obj.creation_time;
		this.accessment_for = obj.accessment_for;
		this.school_name = obj.school_name;
		this.school_id = obj.school_id;
		this.class_name = obj.class_name;
		this.section_name = obj.section_name;
		this.customer_id = obj.customer_id;
		this.accessment_type = obj.accessment_type;
		this.total = obj.total;
		this.generated = obj.generated;
		this.status = obj.status;
		this.generated_by = obj.generated_by;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(accessment_for != null)
			map.put("accessment_for", accessment_for);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(accessment_type != null)
			map.put("accessment_type", accessment_type);
		if(total != null)
			map.put("total", total);
		if(generated != null)
			map.put("generated", generated);
		if(status != null)
			map.put("status", status);
		if(generated_by != null)
			map.put("generated_by", generated_by);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(accessment_for != null)
			map.put("accessment_for", accessment_for);
		if(school_name != null)
			map.put("school_name", school_name);
		if(school_id != null)
			map.put("school_id", school_id);
		if(class_name != null)
			map.put("class_name", class_name);
		if(section_name != null)
			map.put("section_name", section_name);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(accessment_type != null)
			map.put("accessment_type", accessment_type);
		if(total != null)
			map.put("total", total);
		if(generated != null)
			map.put("generated", generated);
		if(status != null)
			map.put("status", status);
		if(generated_by != null)
			map.put("generated_by", generated_by);
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
		accessment_for = (String) map.get("accessment_for");
		school_name = (String) map.get("school_name");
		school_id = (String) map.get("school_id");
		class_name = (String) map.get("class_name");
		section_name = (String) map.get("section_name");
		customer_id = (String) map.get("customer_id");
		accessment_type = (String) map.get("accessment_type");
		total = (Integer) map.get("total");
		generated = (Integer) map.get("generated");
		status = (String) map.get("status");
		generated_by = (String) map.get("generated_by");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object accessment_forObj = map.get("accessment_for");
		if(accessment_forObj != null)
			accessment_for = accessment_forObj.toString();

		Object school_nameObj = map.get("school_name");
		if(school_nameObj != null)
			school_name = school_nameObj.toString();

		Object school_idObj = map.get("school_id");
		if(school_idObj != null)
			school_id = school_idObj.toString();

		Object class_nameObj = map.get("class_name");
		if(class_nameObj != null)
			class_name = class_nameObj.toString();

		Object section_nameObj = map.get("section_name");
		if(section_nameObj != null)
			section_name = section_nameObj.toString();

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object accessment_typeObj = map.get("accessment_type");
		if(accessment_typeObj != null)
			accessment_type = accessment_typeObj.toString();

		Object totalObj = map.get("total");
		if(totalObj != null)
			total = new Integer(totalObj.toString());

		Object generatedObj = map.get("generated");
		if(generatedObj != null)
			generated = new Integer(generatedObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object generated_byObj = map.get("generated_by");
		if(generated_byObj != null)
			generated_by = generated_byObj.toString();

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


	public String getAccessment_for() {
		return accessment_for;
	}

	public String getAccessment_forEx() {
		return accessment_for != null ? accessment_for : "";
	}

	public void setAccessment_for(String accessment_for) {
		this.accessment_for = accessment_for;
	}

	public void unSetAccessment_for() {
		this.accessment_for = null;
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

	public String getClass_name() {
		return class_name;
	}

	public String getClass_nameEx() {
		return class_name != null ? class_name : "";
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void unSetClass_name() {
		this.class_name = null;
	}

	public String getSection_name() {
		return section_name;
	}

	public String getSection_nameEx() {
		return section_name != null ? section_name : "";
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public void unSetSection_name() {
		this.section_name = null;
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

	public boolean validateCustomer_id(boolean add) throws ApplicationException {
		if(add && customer_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[customer_id]");
		return customer_id != null;
	}

	public String getAccessment_type() {
		return accessment_type;
	}

	public String getAccessment_typeEx() {
		return accessment_type != null ? accessment_type : "";
	}

	public void setAccessment_type(String accessment_type) {
		this.accessment_type = accessment_type;
	}

	public void unSetAccessment_type() {
		this.accessment_type = null;
	}

	public Integer getTotal() {
		return total;
	}

	public int getTotalEx() {
		return total != null ? total : 0;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void unSetTotal() {
		this.total = null;
	}

	public Integer getGenerated() {
		return generated;
	}

	public int getGeneratedEx() {
		return generated != null ? generated : 0;
	}

	public void setGenerated(int generated) {
		this.generated = generated;
	}

	public void setGenerated(Integer generated) {
		this.generated = generated;
	}

	public void unSetGenerated() {
		this.generated = null;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
	}

	public String getGenerated_by() {
		return generated_by;
	}

	public String getGenerated_byEx() {
		return generated_by != null ? generated_by : "";
	}

	public void setGenerated_by(String generated_by) {
		this.generated_by = generated_by;
	}

	public void unSetGenerated_by() {
		this.generated_by = null;
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
		return "DB_SCHOOL";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}