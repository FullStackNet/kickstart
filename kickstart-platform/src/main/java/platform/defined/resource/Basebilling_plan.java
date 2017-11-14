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
	private Double grid_sanction_load = null;
	private Double grid_flat_rate = null;
	private Double grid_fix_amount = null;
	private String grid_billing_parameter = null; //Kwh/Kvah
	private String dg_billing_parameter = null; //Kwh/Kvah
	private Double dg_flat_rate = null;
	private String dg_bill_type = null; //FLAT/SLAB
	private Double dg_fix_amount = null;
	private String grid_slab_id = null;
	private String dg_slab_id = null;
	private Double dg_free_unit = null;
	private Double dg_sanction_load = null;
	private Double grid_electricity_duty = null;
	private Double grid_regulatory_surcharge = null;
	private Double grid_fuel_charge = null;
	private Double grid_free_unit = null;
	private Double grid_cgst = null;
	private Double grid_sgst = null;
	private Double grid_igst = null;
	private Double grid_ugst = null;
	private Double dg_cgst = null;
	private Double dg_sgst = null;
	private Double dg_igst = null;
	private Double dg_ugst = null;
	private String customer_id = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_GRID_BILL_TYPE = "grid_bill_type";
	public static String FIELD_GRID_SANCTION_LOAD = "grid_sanction_load";
	public static String FIELD_GRID_FLAT_RATE = "grid_flat_rate";
	public static String FIELD_GRID_FIX_AMOUNT = "grid_fix_amount";
	public static String FIELD_GRID_BILLING_PARAMETER = "grid_billing_parameter";
	public static String FIELD_DG_BILLING_PARAMETER = "dg_billing_parameter";
	public static String FIELD_DG_FLAT_RATE = "dg_flat_rate";
	public static String FIELD_DG_BILL_TYPE = "dg_bill_type";
	public static String FIELD_DG_FIX_AMOUNT = "dg_fix_amount";
	public static String FIELD_GRID_SLAB_ID = "grid_slab_id";
	public static String FIELD_DG_SLAB_ID = "dg_slab_id";
	public static String FIELD_DG_FREE_UNIT = "dg_free_unit";
	public static String FIELD_DG_SANCTION_LOAD = "dg_sanction_load";
	public static String FIELD_GRID_ELECTRICITY_DUTY = "grid_electricity_duty";
	public static String FIELD_GRID_REGULATORY_SURCHARGE = "grid_regulatory_surcharge";
	public static String FIELD_GRID_FUEL_CHARGE = "grid_fuel_charge";
	public static String FIELD_GRID_FREE_UNIT = "grid_free_unit";
	public static String FIELD_GRID_CGST = "grid_cgst";
	public static String FIELD_GRID_SGST = "grid_sgst";
	public static String FIELD_GRID_IGST = "grid_igst";
	public static String FIELD_GRID_UGST = "grid_ugst";
	public static String FIELD_DG_CGST = "dg_cgst";
	public static String FIELD_DG_SGST = "dg_sgst";
	public static String FIELD_DG_IGST = "dg_igst";
	public static String FIELD_DG_UGST = "dg_ugst";
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

		Field grid_sanction_loadField = new Field("grid_sanction_load", "Double");
		metaData.addField(grid_sanction_loadField);

		Field grid_flat_rateField = new Field("grid_flat_rate", "Double");
		metaData.addField(grid_flat_rateField);

		Field grid_fix_amountField = new Field("grid_fix_amount", "Double");
		metaData.addField(grid_fix_amountField);

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

		Field dg_fix_amountField = new Field("dg_fix_amount", "Double");
		metaData.addField(dg_fix_amountField);

		Field grid_slab_idField = new Field("grid_slab_id", "String");
		grid_slab_idField.setLength(128);
		metaData.addField(grid_slab_idField);

		Field dg_slab_idField = new Field("dg_slab_id", "String");
		dg_slab_idField.setLength(128);
		metaData.addField(dg_slab_idField);

		Field dg_free_unitField = new Field("dg_free_unit", "double");
		metaData.addField(dg_free_unitField);

		Field dg_sanction_loadField = new Field("dg_sanction_load", "Double");
		metaData.addField(dg_sanction_loadField);

		Field grid_electricity_dutyField = new Field("grid_electricity_duty", "double");
		metaData.addField(grid_electricity_dutyField);

		Field grid_regulatory_surchargeField = new Field("grid_regulatory_surcharge", "double");
		metaData.addField(grid_regulatory_surchargeField);

		Field grid_fuel_chargeField = new Field("grid_fuel_charge", "double");
		metaData.addField(grid_fuel_chargeField);

		Field grid_free_unitField = new Field("grid_free_unit", "double");
		metaData.addField(grid_free_unitField);

		Field grid_cgstField = new Field("grid_cgst", "double");
		metaData.addField(grid_cgstField);

		Field grid_sgstField = new Field("grid_sgst", "double");
		metaData.addField(grid_sgstField);

		Field grid_igstField = new Field("grid_igst", "double");
		metaData.addField(grid_igstField);

		Field grid_ugstField = new Field("grid_ugst", "double");
		metaData.addField(grid_ugstField);

		Field dg_cgstField = new Field("dg_cgst", "double");
		metaData.addField(dg_cgstField);

		Field dg_sgstField = new Field("dg_sgst", "double");
		metaData.addField(dg_sgstField);

		Field dg_igstField = new Field("dg_igst", "double");
		metaData.addField(dg_igstField);

		Field dg_ugstField = new Field("dg_ugst", "double");
		metaData.addField(dg_ugstField);

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
		this.grid_sanction_load = obj.grid_sanction_load;
		this.grid_flat_rate = obj.grid_flat_rate;
		this.grid_fix_amount = obj.grid_fix_amount;
		this.grid_billing_parameter = obj.grid_billing_parameter;
		this.dg_billing_parameter = obj.dg_billing_parameter;
		this.dg_flat_rate = obj.dg_flat_rate;
		this.dg_bill_type = obj.dg_bill_type;
		this.dg_fix_amount = obj.dg_fix_amount;
		this.grid_slab_id = obj.grid_slab_id;
		this.dg_slab_id = obj.dg_slab_id;
		this.dg_free_unit = obj.dg_free_unit;
		this.dg_sanction_load = obj.dg_sanction_load;
		this.grid_electricity_duty = obj.grid_electricity_duty;
		this.grid_regulatory_surcharge = obj.grid_regulatory_surcharge;
		this.grid_fuel_charge = obj.grid_fuel_charge;
		this.grid_free_unit = obj.grid_free_unit;
		this.grid_cgst = obj.grid_cgst;
		this.grid_sgst = obj.grid_sgst;
		this.grid_igst = obj.grid_igst;
		this.grid_ugst = obj.grid_ugst;
		this.dg_cgst = obj.dg_cgst;
		this.dg_sgst = obj.dg_sgst;
		this.dg_igst = obj.dg_igst;
		this.dg_ugst = obj.dg_ugst;
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
		if(grid_sanction_load != null)
			map.put("grid_sanction_load", grid_sanction_load);
		if(grid_flat_rate != null)
			map.put("grid_flat_rate", grid_flat_rate);
		if(grid_fix_amount != null)
			map.put("grid_fix_amount", grid_fix_amount);
		if(grid_billing_parameter != null)
			map.put("grid_billing_parameter", grid_billing_parameter);
		if(dg_billing_parameter != null)
			map.put("dg_billing_parameter", dg_billing_parameter);
		if(dg_flat_rate != null)
			map.put("dg_flat_rate", dg_flat_rate);
		if(dg_bill_type != null)
			map.put("dg_bill_type", dg_bill_type);
		if(dg_fix_amount != null)
			map.put("dg_fix_amount", dg_fix_amount);
		if(grid_slab_id != null)
			map.put("grid_slab_id", grid_slab_id);
		if(dg_slab_id != null)
			map.put("dg_slab_id", dg_slab_id);
		if(dg_free_unit != null)
			map.put("dg_free_unit", dg_free_unit);
		if(dg_sanction_load != null)
			map.put("dg_sanction_load", dg_sanction_load);
		if(grid_electricity_duty != null)
			map.put("grid_electricity_duty", grid_electricity_duty);
		if(grid_regulatory_surcharge != null)
			map.put("grid_regulatory_surcharge", grid_regulatory_surcharge);
		if(grid_fuel_charge != null)
			map.put("grid_fuel_charge", grid_fuel_charge);
		if(grid_free_unit != null)
			map.put("grid_free_unit", grid_free_unit);
		if(grid_cgst != null)
			map.put("grid_cgst", grid_cgst);
		if(grid_sgst != null)
			map.put("grid_sgst", grid_sgst);
		if(grid_igst != null)
			map.put("grid_igst", grid_igst);
		if(grid_ugst != null)
			map.put("grid_ugst", grid_ugst);
		if(dg_cgst != null)
			map.put("dg_cgst", dg_cgst);
		if(dg_sgst != null)
			map.put("dg_sgst", dg_sgst);
		if(dg_igst != null)
			map.put("dg_igst", dg_igst);
		if(dg_ugst != null)
			map.put("dg_ugst", dg_ugst);
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
		if(grid_sanction_load != null)
			map.put("grid_sanction_load", grid_sanction_load);
		if(grid_flat_rate != null)
			map.put("grid_flat_rate", grid_flat_rate);
		if(grid_fix_amount != null)
			map.put("grid_fix_amount", grid_fix_amount);
		if(grid_billing_parameter != null)
			map.put("grid_billing_parameter", grid_billing_parameter);
		if(dg_billing_parameter != null)
			map.put("dg_billing_parameter", dg_billing_parameter);
		if(dg_flat_rate != null)
			map.put("dg_flat_rate", dg_flat_rate);
		if(dg_bill_type != null)
			map.put("dg_bill_type", dg_bill_type);
		if(dg_fix_amount != null)
			map.put("dg_fix_amount", dg_fix_amount);
		if(grid_slab_id != null)
			map.put("grid_slab_id", grid_slab_id);
		if(dg_slab_id != null)
			map.put("dg_slab_id", dg_slab_id);
		if(dg_free_unit != null)
			map.put("dg_free_unit", dg_free_unit);
		if(dg_sanction_load != null)
			map.put("dg_sanction_load", dg_sanction_load);
		if(grid_electricity_duty != null)
			map.put("grid_electricity_duty", grid_electricity_duty);
		if(grid_regulatory_surcharge != null)
			map.put("grid_regulatory_surcharge", grid_regulatory_surcharge);
		if(grid_fuel_charge != null)
			map.put("grid_fuel_charge", grid_fuel_charge);
		if(grid_free_unit != null)
			map.put("grid_free_unit", grid_free_unit);
		if(grid_cgst != null)
			map.put("grid_cgst", grid_cgst);
		if(grid_sgst != null)
			map.put("grid_sgst", grid_sgst);
		if(grid_igst != null)
			map.put("grid_igst", grid_igst);
		if(grid_ugst != null)
			map.put("grid_ugst", grid_ugst);
		if(dg_cgst != null)
			map.put("dg_cgst", dg_cgst);
		if(dg_sgst != null)
			map.put("dg_sgst", dg_sgst);
		if(dg_igst != null)
			map.put("dg_igst", dg_igst);
		if(dg_ugst != null)
			map.put("dg_ugst", dg_ugst);
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
		grid_sanction_load = (Double) map.get("grid_sanction_load");
		grid_flat_rate = (Double) map.get("grid_flat_rate");
		grid_fix_amount = (Double) map.get("grid_fix_amount");
		grid_billing_parameter = (String) map.get("grid_billing_parameter");
		dg_billing_parameter = (String) map.get("dg_billing_parameter");
		dg_flat_rate = (Double) map.get("dg_flat_rate");
		dg_bill_type = (String) map.get("dg_bill_type");
		dg_fix_amount = (Double) map.get("dg_fix_amount");
		grid_slab_id = (String) map.get("grid_slab_id");
		dg_slab_id = (String) map.get("dg_slab_id");
		dg_free_unit = (Double) map.get("dg_free_unit");
		dg_sanction_load = (Double) map.get("dg_sanction_load");
		grid_electricity_duty = (Double) map.get("grid_electricity_duty");
		grid_regulatory_surcharge = (Double) map.get("grid_regulatory_surcharge");
		grid_fuel_charge = (Double) map.get("grid_fuel_charge");
		grid_free_unit = (Double) map.get("grid_free_unit");
		grid_cgst = (Double) map.get("grid_cgst");
		grid_sgst = (Double) map.get("grid_sgst");
		grid_igst = (Double) map.get("grid_igst");
		grid_ugst = (Double) map.get("grid_ugst");
		dg_cgst = (Double) map.get("dg_cgst");
		dg_sgst = (Double) map.get("dg_sgst");
		dg_igst = (Double) map.get("dg_igst");
		dg_ugst = (Double) map.get("dg_ugst");
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

		Object grid_sanction_loadObj = map.get("grid_sanction_load");
		if(grid_sanction_loadObj != null)
			grid_sanction_load = new Double(grid_sanction_loadObj.toString());

		Object grid_flat_rateObj = map.get("grid_flat_rate");
		if(grid_flat_rateObj != null)
			grid_flat_rate = new Double(grid_flat_rateObj.toString());

		Object grid_fix_amountObj = map.get("grid_fix_amount");
		if(grid_fix_amountObj != null)
			grid_fix_amount = new Double(grid_fix_amountObj.toString());

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

		Object dg_fix_amountObj = map.get("dg_fix_amount");
		if(dg_fix_amountObj != null)
			dg_fix_amount = new Double(dg_fix_amountObj.toString());

		Object grid_slab_idObj = map.get("grid_slab_id");
		if(grid_slab_idObj != null)
			grid_slab_id = grid_slab_idObj.toString();

		Object dg_slab_idObj = map.get("dg_slab_id");
		if(dg_slab_idObj != null)
			dg_slab_id = dg_slab_idObj.toString();

		Object dg_free_unitObj = map.get("dg_free_unit");
		if(dg_free_unitObj != null)
			dg_free_unit = new Double(dg_free_unitObj.toString());

		Object dg_sanction_loadObj = map.get("dg_sanction_load");
		if(dg_sanction_loadObj != null)
			dg_sanction_load = new Double(dg_sanction_loadObj.toString());

		Object grid_electricity_dutyObj = map.get("grid_electricity_duty");
		if(grid_electricity_dutyObj != null)
			grid_electricity_duty = new Double(grid_electricity_dutyObj.toString());

		Object grid_regulatory_surchargeObj = map.get("grid_regulatory_surcharge");
		if(grid_regulatory_surchargeObj != null)
			grid_regulatory_surcharge = new Double(grid_regulatory_surchargeObj.toString());

		Object grid_fuel_chargeObj = map.get("grid_fuel_charge");
		if(grid_fuel_chargeObj != null)
			grid_fuel_charge = new Double(grid_fuel_chargeObj.toString());

		Object grid_free_unitObj = map.get("grid_free_unit");
		if(grid_free_unitObj != null)
			grid_free_unit = new Double(grid_free_unitObj.toString());

		Object grid_cgstObj = map.get("grid_cgst");
		if(grid_cgstObj != null)
			grid_cgst = new Double(grid_cgstObj.toString());

		Object grid_sgstObj = map.get("grid_sgst");
		if(grid_sgstObj != null)
			grid_sgst = new Double(grid_sgstObj.toString());

		Object grid_igstObj = map.get("grid_igst");
		if(grid_igstObj != null)
			grid_igst = new Double(grid_igstObj.toString());

		Object grid_ugstObj = map.get("grid_ugst");
		if(grid_ugstObj != null)
			grid_ugst = new Double(grid_ugstObj.toString());

		Object dg_cgstObj = map.get("dg_cgst");
		if(dg_cgstObj != null)
			dg_cgst = new Double(dg_cgstObj.toString());

		Object dg_sgstObj = map.get("dg_sgst");
		if(dg_sgstObj != null)
			dg_sgst = new Double(dg_sgstObj.toString());

		Object dg_igstObj = map.get("dg_igst");
		if(dg_igstObj != null)
			dg_igst = new Double(dg_igstObj.toString());

		Object dg_ugstObj = map.get("dg_ugst");
		if(dg_ugstObj != null)
			dg_ugst = new Double(dg_ugstObj.toString());

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

	public Double getGrid_sanction_load() {
		return grid_sanction_load;
	}

	public void setGrid_sanction_load(Double grid_sanction_load) {
		this.grid_sanction_load = grid_sanction_load;
	}

	public void unSetGrid_sanction_load() {
		this.grid_sanction_load = null;
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

	public Double getGrid_fix_amount() {
		return grid_fix_amount;
	}

	public void setGrid_fix_amount(Double grid_fix_amount) {
		this.grid_fix_amount = grid_fix_amount;
	}

	public void unSetGrid_fix_amount() {
		this.grid_fix_amount = null;
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

	public Double getDg_fix_amount() {
		return dg_fix_amount;
	}

	public void setDg_fix_amount(Double dg_fix_amount) {
		this.dg_fix_amount = dg_fix_amount;
	}

	public void unSetDg_fix_amount() {
		this.dg_fix_amount = null;
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

	public Double getDg_free_unit() {
		return dg_free_unit;
	}

	public double getDg_free_unitEx() {
		return dg_free_unit != null ? dg_free_unit : 0;
	}

	public void setDg_free_unit(double dg_free_unit) {
		this.dg_free_unit = dg_free_unit;
	}

	public void setDg_free_unit(Double dg_free_unit) {
		this.dg_free_unit = dg_free_unit;
	}

	public void unSetDg_free_unit() {
		this.dg_free_unit = null;
	}

	public Double getDg_sanction_load() {
		return dg_sanction_load;
	}

	public void setDg_sanction_load(Double dg_sanction_load) {
		this.dg_sanction_load = dg_sanction_load;
	}

	public void unSetDg_sanction_load() {
		this.dg_sanction_load = null;
	}

	public Double getGrid_electricity_duty() {
		return grid_electricity_duty;
	}

	public double getGrid_electricity_dutyEx() {
		return grid_electricity_duty != null ? grid_electricity_duty : 0;
	}

	public void setGrid_electricity_duty(double grid_electricity_duty) {
		this.grid_electricity_duty = grid_electricity_duty;
	}

	public void setGrid_electricity_duty(Double grid_electricity_duty) {
		this.grid_electricity_duty = grid_electricity_duty;
	}

	public void unSetGrid_electricity_duty() {
		this.grid_electricity_duty = null;
	}

	public Double getGrid_regulatory_surcharge() {
		return grid_regulatory_surcharge;
	}

	public double getGrid_regulatory_surchargeEx() {
		return grid_regulatory_surcharge != null ? grid_regulatory_surcharge : 0;
	}

	public void setGrid_regulatory_surcharge(double grid_regulatory_surcharge) {
		this.grid_regulatory_surcharge = grid_regulatory_surcharge;
	}

	public void setGrid_regulatory_surcharge(Double grid_regulatory_surcharge) {
		this.grid_regulatory_surcharge = grid_regulatory_surcharge;
	}

	public void unSetGrid_regulatory_surcharge() {
		this.grid_regulatory_surcharge = null;
	}

	public Double getGrid_fuel_charge() {
		return grid_fuel_charge;
	}

	public double getGrid_fuel_chargeEx() {
		return grid_fuel_charge != null ? grid_fuel_charge : 0;
	}

	public void setGrid_fuel_charge(double grid_fuel_charge) {
		this.grid_fuel_charge = grid_fuel_charge;
	}

	public void setGrid_fuel_charge(Double grid_fuel_charge) {
		this.grid_fuel_charge = grid_fuel_charge;
	}

	public void unSetGrid_fuel_charge() {
		this.grid_fuel_charge = null;
	}

	public Double getGrid_free_unit() {
		return grid_free_unit;
	}

	public double getGrid_free_unitEx() {
		return grid_free_unit != null ? grid_free_unit : 0;
	}

	public void setGrid_free_unit(double grid_free_unit) {
		this.grid_free_unit = grid_free_unit;
	}

	public void setGrid_free_unit(Double grid_free_unit) {
		this.grid_free_unit = grid_free_unit;
	}

	public void unSetGrid_free_unit() {
		this.grid_free_unit = null;
	}

	public Double getGrid_cgst() {
		return grid_cgst;
	}

	public double getGrid_cgstEx() {
		return grid_cgst != null ? grid_cgst : 0;
	}

	public void setGrid_cgst(double grid_cgst) {
		this.grid_cgst = grid_cgst;
	}

	public void setGrid_cgst(Double grid_cgst) {
		this.grid_cgst = grid_cgst;
	}

	public void unSetGrid_cgst() {
		this.grid_cgst = null;
	}

	public Double getGrid_sgst() {
		return grid_sgst;
	}

	public double getGrid_sgstEx() {
		return grid_sgst != null ? grid_sgst : 0;
	}

	public void setGrid_sgst(double grid_sgst) {
		this.grid_sgst = grid_sgst;
	}

	public void setGrid_sgst(Double grid_sgst) {
		this.grid_sgst = grid_sgst;
	}

	public void unSetGrid_sgst() {
		this.grid_sgst = null;
	}

	public Double getGrid_igst() {
		return grid_igst;
	}

	public double getGrid_igstEx() {
		return grid_igst != null ? grid_igst : 0;
	}

	public void setGrid_igst(double grid_igst) {
		this.grid_igst = grid_igst;
	}

	public void setGrid_igst(Double grid_igst) {
		this.grid_igst = grid_igst;
	}

	public void unSetGrid_igst() {
		this.grid_igst = null;
	}

	public Double getGrid_ugst() {
		return grid_ugst;
	}

	public double getGrid_ugstEx() {
		return grid_ugst != null ? grid_ugst : 0;
	}

	public void setGrid_ugst(double grid_ugst) {
		this.grid_ugst = grid_ugst;
	}

	public void setGrid_ugst(Double grid_ugst) {
		this.grid_ugst = grid_ugst;
	}

	public void unSetGrid_ugst() {
		this.grid_ugst = null;
	}

	public Double getDg_cgst() {
		return dg_cgst;
	}

	public double getDg_cgstEx() {
		return dg_cgst != null ? dg_cgst : 0;
	}

	public void setDg_cgst(double dg_cgst) {
		this.dg_cgst = dg_cgst;
	}

	public void setDg_cgst(Double dg_cgst) {
		this.dg_cgst = dg_cgst;
	}

	public void unSetDg_cgst() {
		this.dg_cgst = null;
	}

	public Double getDg_sgst() {
		return dg_sgst;
	}

	public double getDg_sgstEx() {
		return dg_sgst != null ? dg_sgst : 0;
	}

	public void setDg_sgst(double dg_sgst) {
		this.dg_sgst = dg_sgst;
	}

	public void setDg_sgst(Double dg_sgst) {
		this.dg_sgst = dg_sgst;
	}

	public void unSetDg_sgst() {
		this.dg_sgst = null;
	}

	public Double getDg_igst() {
		return dg_igst;
	}

	public double getDg_igstEx() {
		return dg_igst != null ? dg_igst : 0;
	}

	public void setDg_igst(double dg_igst) {
		this.dg_igst = dg_igst;
	}

	public void setDg_igst(Double dg_igst) {
		this.dg_igst = dg_igst;
	}

	public void unSetDg_igst() {
		this.dg_igst = null;
	}

	public Double getDg_ugst() {
		return dg_ugst;
	}

	public double getDg_ugstEx() {
		return dg_ugst != null ? dg_ugst : 0;
	}

	public void setDg_ugst(double dg_ugst) {
		this.dg_ugst = dg_ugst;
	}

	public void setDg_ugst(Double dg_ugst) {
		this.dg_ugst = dg_ugst;
	}

	public void unSetDg_ugst() {
		this.dg_ugst = null;
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