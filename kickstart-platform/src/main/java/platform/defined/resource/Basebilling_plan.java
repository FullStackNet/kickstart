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
public abstract class Basebilling_plan extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null; //PREPAID/POSTPAID
	private String grid_bill_type = null; //FLAT/SLAB
	private Double grid_flat_rate = null;
	private String grid_billing_parameter = null; //Kwh/Kvah
	private String dg_billing_parameter = null; //Kwh/Kvah
	private Double dg_flat_rate = null;
	private String dg_bill_type = null; //FLAT/SLAB
	private String grid_slab_id = null;
	private String dg_slab_id = null;
	private Long dg_free_unit = null;
	private Long grid_free_unit = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_GRID_BILL_TYPE = "grid_bill_type";
	public static String FIELD_GRID_FLAT_RATE = "grid_flat_rate";
	public static String FIELD_GRID_BILLING_PARAMETER = "grid_billing_parameter";
	public static String FIELD_DG_BILLING_PARAMETER = "dg_billing_parameter";
	public static String FIELD_DG_FLAT_RATE = "dg_flat_rate";
	public static String FIELD_DG_BILL_TYPE = "dg_bill_type";
	public static String FIELD_GRID_SLAB_ID = "grid_slab_id";
	public static String FIELD_DG_SLAB_ID = "dg_slab_id";
	public static String FIELD_DG_FREE_UNIT = "dg_free_unit";
	public static String FIELD_GRID_FREE_UNIT = "grid_free_unit";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("billing_plan");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setRequired(true);
		nameField.setLength(128);
		metaData.addField(nameField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field grid_bill_typeField = new Field("grid_bill_type", "String");
		grid_bill_typeField.setLength(128);
		metaData.addField(grid_bill_typeField);

		Field grid_flat_rateField = new Field("grid_flat_rate", "Double");
		metaData.addField(grid_flat_rateField);

		Field grid_billing_parameterField = new Field("grid_billing_parameter", "String");
		grid_billing_parameterField.setLength(128);
		metaData.addField(grid_billing_parameterField);

		Field dg_billing_parameterField = new Field("dg_billing_parameter", "String");
		dg_billing_parameterField.setLength(128);
		metaData.addField(dg_billing_parameterField);

		Field dg_flat_rateField = new Field("dg_flat_rate", "Double");
		metaData.addField(dg_flat_rateField);

		Field dg_bill_typeField = new Field("dg_bill_type", "String");
		dg_bill_typeField.setLength(128);
		metaData.addField(dg_bill_typeField);

		Field grid_slab_idField = new Field("grid_slab_id", "String");
		grid_slab_idField.setLength(128);
		metaData.addField(grid_slab_idField);

		Field dg_slab_idField = new Field("dg_slab_id", "String");
		dg_slab_idField.setLength(128);
		metaData.addField(dg_slab_idField);

		Field dg_free_unitField = new Field("dg_free_unit", "long");
		metaData.addField(dg_free_unitField);

		Field grid_free_unitField = new Field("grid_free_unit", "long");
		metaData.addField(grid_free_unitField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("billing_plan");

		metaData.setCluster("DB_PROFILE");
	}

	public Basebilling_plan() {}

	public Basebilling_plan(Basebilling_plan obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.grid_bill_type = obj.grid_bill_type;
		this.grid_flat_rate = obj.grid_flat_rate;
		this.grid_billing_parameter = obj.grid_billing_parameter;
		this.dg_billing_parameter = obj.dg_billing_parameter;
		this.dg_flat_rate = obj.dg_flat_rate;
		this.dg_bill_type = obj.dg_bill_type;
		this.grid_slab_id = obj.grid_slab_id;
		this.dg_slab_id = obj.dg_slab_id;
		this.dg_free_unit = obj.dg_free_unit;
		this.grid_free_unit = obj.grid_free_unit;
		this.customer_id = obj.customer_id;
		this.creation_time = obj.creation_time;
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
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(grid_bill_type != null)
			map.put("grid_bill_type", grid_bill_type);
		if(grid_flat_rate != null)
			map.put("grid_flat_rate", grid_flat_rate);
		if(grid_billing_parameter != null)
			map.put("grid_billing_parameter", grid_billing_parameter);
		if(dg_billing_parameter != null)
			map.put("dg_billing_parameter", dg_billing_parameter);
		if(dg_flat_rate != null)
			map.put("dg_flat_rate", dg_flat_rate);
		if(dg_bill_type != null)
			map.put("dg_bill_type", dg_bill_type);
		if(grid_slab_id != null)
			map.put("grid_slab_id", grid_slab_id);
		if(dg_slab_id != null)
			map.put("dg_slab_id", dg_slab_id);
		if(dg_free_unit != null)
			map.put("dg_free_unit", dg_free_unit);
		if(grid_free_unit != null)
			map.put("grid_free_unit", grid_free_unit);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
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
		if(validateName(add))
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(grid_bill_type != null)
			map.put("grid_bill_type", grid_bill_type);
		if(grid_flat_rate != null)
			map.put("grid_flat_rate", grid_flat_rate);
		if(grid_billing_parameter != null)
			map.put("grid_billing_parameter", grid_billing_parameter);
		if(dg_billing_parameter != null)
			map.put("dg_billing_parameter", dg_billing_parameter);
		if(dg_flat_rate != null)
			map.put("dg_flat_rate", dg_flat_rate);
		if(dg_bill_type != null)
			map.put("dg_bill_type", dg_bill_type);
		if(grid_slab_id != null)
			map.put("grid_slab_id", grid_slab_id);
		if(dg_slab_id != null)
			map.put("dg_slab_id", dg_slab_id);
		if(dg_free_unit != null)
			map.put("dg_free_unit", dg_free_unit);
		if(grid_free_unit != null)
			map.put("grid_free_unit", grid_free_unit);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(validateCreation_time(add))
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
		name = (String) map.get("name");
		type = (String) map.get("type");
		grid_bill_type = (String) map.get("grid_bill_type");
		grid_flat_rate = (Double) map.get("grid_flat_rate");
		grid_billing_parameter = (String) map.get("grid_billing_parameter");
		dg_billing_parameter = (String) map.get("dg_billing_parameter");
		dg_flat_rate = (Double) map.get("dg_flat_rate");
		dg_bill_type = (String) map.get("dg_bill_type");
		grid_slab_id = (String) map.get("grid_slab_id");
		dg_slab_id = (String) map.get("dg_slab_id");
		dg_free_unit = (Long) map.get("dg_free_unit");
		grid_free_unit = (Long) map.get("grid_free_unit");
		customer_id = (String) map.get("customer_id");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object grid_bill_typeObj = map.get("grid_bill_type");
		if(grid_bill_typeObj != null)
			grid_bill_type = grid_bill_typeObj.toString();

		Object grid_flat_rateObj = map.get("grid_flat_rate");
		if(grid_flat_rateObj != null)
			grid_flat_rate = new Double(grid_flat_rateObj.toString());

		Object grid_billing_parameterObj = map.get("grid_billing_parameter");
		if(grid_billing_parameterObj != null)
			grid_billing_parameter = grid_billing_parameterObj.toString();

		Object dg_billing_parameterObj = map.get("dg_billing_parameter");
		if(dg_billing_parameterObj != null)
			dg_billing_parameter = dg_billing_parameterObj.toString();

		Object dg_flat_rateObj = map.get("dg_flat_rate");
		if(dg_flat_rateObj != null)
			dg_flat_rate = new Double(dg_flat_rateObj.toString());

		Object dg_bill_typeObj = map.get("dg_bill_type");
		if(dg_bill_typeObj != null)
			dg_bill_type = dg_bill_typeObj.toString();

		Object grid_slab_idObj = map.get("grid_slab_id");
		if(grid_slab_idObj != null)
			grid_slab_id = grid_slab_idObj.toString();

		Object dg_slab_idObj = map.get("dg_slab_id");
		if(dg_slab_idObj != null)
			dg_slab_id = dg_slab_idObj.toString();

		Object dg_free_unitObj = map.get("dg_free_unit");
		if(dg_free_unitObj != null)
			dg_free_unit = new Long(dg_free_unitObj.toString());

		Object grid_free_unitObj = map.get("grid_free_unit");
		if(grid_free_unitObj != null)
			grid_free_unit = new Long(grid_free_unitObj.toString());

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

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

	public boolean validateName(boolean add) throws ApplicationException {
		if(add && name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[name]");
		return name != null;
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

	public String getGrid_bill_type() {
		return grid_bill_type;
	}

	public String getGrid_bill_typeEx() {
		return grid_bill_type != null ? grid_bill_type : "";
	}

	public void setGrid_bill_type(String grid_bill_type) {
		this.grid_bill_type = grid_bill_type;
	}

	public void unSetGrid_bill_type() {
		this.grid_bill_type = null;
	}

	public Double getGrid_flat_rate() {
		return grid_flat_rate;
	}

	public void setGrid_flat_rate(Double grid_flat_rate) {
		this.grid_flat_rate = grid_flat_rate;
	}

	public void unSetGrid_flat_rate() {
		this.grid_flat_rate = null;
	}

	public String getGrid_billing_parameter() {
		return grid_billing_parameter;
	}

	public String getGrid_billing_parameterEx() {
		return grid_billing_parameter != null ? grid_billing_parameter : "";
	}

	public void setGrid_billing_parameter(String grid_billing_parameter) {
		this.grid_billing_parameter = grid_billing_parameter;
	}

	public void unSetGrid_billing_parameter() {
		this.grid_billing_parameter = null;
	}

	public String getDg_billing_parameter() {
		return dg_billing_parameter;
	}

	public String getDg_billing_parameterEx() {
		return dg_billing_parameter != null ? dg_billing_parameter : "";
	}

	public void setDg_billing_parameter(String dg_billing_parameter) {
		this.dg_billing_parameter = dg_billing_parameter;
	}

	public void unSetDg_billing_parameter() {
		this.dg_billing_parameter = null;
	}

	public Double getDg_flat_rate() {
		return dg_flat_rate;
	}

	public void setDg_flat_rate(Double dg_flat_rate) {
		this.dg_flat_rate = dg_flat_rate;
	}

	public void unSetDg_flat_rate() {
		this.dg_flat_rate = null;
	}

	public String getDg_bill_type() {
		return dg_bill_type;
	}

	public String getDg_bill_typeEx() {
		return dg_bill_type != null ? dg_bill_type : "";
	}

	public void setDg_bill_type(String dg_bill_type) {
		this.dg_bill_type = dg_bill_type;
	}

	public void unSetDg_bill_type() {
		this.dg_bill_type = null;
	}

	public String getGrid_slab_id() {
		return grid_slab_id;
	}

	public String getGrid_slab_idEx() {
		return grid_slab_id != null ? grid_slab_id : "";
	}

	public void setGrid_slab_id(String grid_slab_id) {
		this.grid_slab_id = grid_slab_id;
	}

	public void unSetGrid_slab_id() {
		this.grid_slab_id = null;
	}

	public String getDg_slab_id() {
		return dg_slab_id;
	}

	public String getDg_slab_idEx() {
		return dg_slab_id != null ? dg_slab_id : "";
	}

	public void setDg_slab_id(String dg_slab_id) {
		this.dg_slab_id = dg_slab_id;
	}

	public void unSetDg_slab_id() {
		this.dg_slab_id = null;
	}

	public Long getDg_free_unit() {
		return dg_free_unit;
	}

	public long getDg_free_unitEx() {
		return dg_free_unit != null ? dg_free_unit : 0L;
	}

	public void setDg_free_unit(long dg_free_unit) {
		this.dg_free_unit = dg_free_unit;
	}

	public void setDg_free_unit(Long dg_free_unit) {
		this.dg_free_unit = dg_free_unit;
	}

	public void unSetDg_free_unit() {
		this.dg_free_unit = null;
	}

	public Long getGrid_free_unit() {
		return grid_free_unit;
	}

	public long getGrid_free_unitEx() {
		return grid_free_unit != null ? grid_free_unit : 0L;
	}

	public void setGrid_free_unit(long grid_free_unit) {
		this.grid_free_unit = grid_free_unit;
	}

	public void setGrid_free_unit(Long grid_free_unit) {
		this.grid_free_unit = grid_free_unit;
	}

	public void unSetGrid_free_unit() {
		this.grid_free_unit = null;
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