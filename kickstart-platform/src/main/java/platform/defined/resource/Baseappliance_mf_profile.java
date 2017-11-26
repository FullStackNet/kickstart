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
public abstract class Baseappliance_mf_profile extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private Double kvah = null;
	private Double kwh = null;
	private Double load_kva = null;
	private Double load_kw = null;
	private Double load_kvar = null;
	private Double voltage = null;
	private Double current = null;
	private Double pf = null;
	private Double md = null;
	private Double tdh = null;
	private Double kvarh = null;
	private Double frequency = null;
	private String customer_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_KVAH = "kvah";
	public static String FIELD_KWH = "kwh";
	public static String FIELD_LOAD_KVA = "load_kva";
	public static String FIELD_LOAD_KW = "load_kw";
	public static String FIELD_LOAD_KVAR = "load_kvar";
	public static String FIELD_VOLTAGE = "voltage";
	public static String FIELD_CURRENT = "current";
	public static String FIELD_PF = "pf";
	public static String FIELD_MD = "md";
	public static String FIELD_TDH = "tdh";
	public static String FIELD_KVARH = "kvarh";
	public static String FIELD_FREQUENCY = "frequency";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_mf_profile");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(128);
		metaData.addField(nameField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field kvahField = new Field("kvah", "double");
		kvahField.setDefaultValue(0.0000);
		kvahField.setLength(12);
		kvahField.setPrecision(4);
		metaData.addField(kvahField);

		Field kwhField = new Field("kwh", "double");
		kwhField.setDefaultValue(0.0000);
		kwhField.setLength(12);
		kwhField.setPrecision(4);
		metaData.addField(kwhField);

		Field load_kvaField = new Field("load_kva", "double");
		load_kvaField.setDefaultValue(0.0000);
		load_kvaField.setLength(12);
		load_kvaField.setPrecision(4);
		metaData.addField(load_kvaField);

		Field load_kwField = new Field("load_kw", "double");
		load_kwField.setDefaultValue(0.0000);
		load_kwField.setLength(12);
		load_kwField.setPrecision(4);
		metaData.addField(load_kwField);

		Field load_kvarField = new Field("load_kvar", "double");
		load_kvarField.setDefaultValue(0.0000);
		load_kvarField.setLength(12);
		load_kvarField.setPrecision(4);
		metaData.addField(load_kvarField);

		Field voltageField = new Field("voltage", "double");
		voltageField.setDefaultValue(0.00);
		voltageField.setLength(12);
		voltageField.setPrecision(4);
		metaData.addField(voltageField);

		Field currentField = new Field("current", "double");
		currentField.setDefaultValue(0.00);
		currentField.setLength(12);
		currentField.setPrecision(4);
		metaData.addField(currentField);

		Field pfField = new Field("pf", "double");
		pfField.setDefaultValue(0.0000);
		pfField.setLength(12);
		pfField.setPrecision(4);
		metaData.addField(pfField);

		Field mdField = new Field("md", "double");
		mdField.setDefaultValue(0.0000);
		mdField.setLength(12);
		mdField.setPrecision(4);
		metaData.addField(mdField);

		Field tdhField = new Field("tdh", "double");
		tdhField.setDefaultValue(0.0000);
		tdhField.setLength(12);
		tdhField.setPrecision(4);
		metaData.addField(tdhField);

		Field kvarhField = new Field("kvarh", "double");
		kvarhField.setDefaultValue(0.0000);
		kvarhField.setLength(12);
		kvarhField.setPrecision(4);
		metaData.addField(kvarhField);

		Field frequencyField = new Field("frequency", "double");
		frequencyField.setDefaultValue(0.0000);
		frequencyField.setLength(12);
		frequencyField.setPrecision(4);
		metaData.addField(frequencyField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_mf_profile");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_mf_profile() {}

	public Baseappliance_mf_profile(Baseappliance_mf_profile obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.kvah = obj.kvah;
		this.kwh = obj.kwh;
		this.load_kva = obj.load_kva;
		this.load_kw = obj.load_kw;
		this.load_kvar = obj.load_kvar;
		this.voltage = obj.voltage;
		this.current = obj.current;
		this.pf = obj.pf;
		this.md = obj.md;
		this.tdh = obj.tdh;
		this.kvarh = obj.kvarh;
		this.frequency = obj.frequency;
		this.customer_id = obj.customer_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(kvah == null)
			kvah = 0.0000;
		if(kwh == null)
			kwh = 0.0000;
		if(load_kva == null)
			load_kva = 0.0000;
		if(load_kw == null)
			load_kw = 0.0000;
		if(load_kvar == null)
			load_kvar = 0.0000;
		if(voltage == null)
			voltage = 0.00;
		if(current == null)
			current = 0.00;
		if(pf == null)
			pf = 0.0000;
		if(md == null)
			md = 0.0000;
		if(tdh == null)
			tdh = 0.0000;
		if(kvarh == null)
			kvarh = 0.0000;
		if(frequency == null)
			frequency = 0.0000;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(kvah != null)
			map.put("kvah", kvah);
		if(kwh != null)
			map.put("kwh", kwh);
		if(load_kva != null)
			map.put("load_kva", load_kva);
		if(load_kw != null)
			map.put("load_kw", load_kw);
		if(load_kvar != null)
			map.put("load_kvar", load_kvar);
		if(voltage != null)
			map.put("voltage", voltage);
		if(current != null)
			map.put("current", current);
		if(pf != null)
			map.put("pf", pf);
		if(md != null)
			map.put("md", md);
		if(tdh != null)
			map.put("tdh", tdh);
		if(kvarh != null)
			map.put("kvarh", kvarh);
		if(frequency != null)
			map.put("frequency", frequency);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(kvah != null)
			map.put("kvah", kvah);
		if(kwh != null)
			map.put("kwh", kwh);
		if(load_kva != null)
			map.put("load_kva", load_kva);
		if(load_kw != null)
			map.put("load_kw", load_kw);
		if(load_kvar != null)
			map.put("load_kvar", load_kvar);
		if(voltage != null)
			map.put("voltage", voltage);
		if(current != null)
			map.put("current", current);
		if(pf != null)
			map.put("pf", pf);
		if(md != null)
			map.put("md", md);
		if(tdh != null)
			map.put("tdh", tdh);
		if(kvarh != null)
			map.put("kvarh", kvarh);
		if(frequency != null)
			map.put("frequency", frequency);
		if(customer_id != null)
			map.put("customer_id", customer_id);
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
		kvah = (Double) map.get("kvah");
		kwh = (Double) map.get("kwh");
		load_kva = (Double) map.get("load_kva");
		load_kw = (Double) map.get("load_kw");
		load_kvar = (Double) map.get("load_kvar");
		voltage = (Double) map.get("voltage");
		current = (Double) map.get("current");
		pf = (Double) map.get("pf");
		md = (Double) map.get("md");
		tdh = (Double) map.get("tdh");
		kvarh = (Double) map.get("kvarh");
		frequency = (Double) map.get("frequency");
		customer_id = (String) map.get("customer_id");
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

		Object kvahObj = map.get("kvah");
		if(kvahObj != null)
			kvah = new Double(kvahObj.toString());

		Object kwhObj = map.get("kwh");
		if(kwhObj != null)
			kwh = new Double(kwhObj.toString());

		Object load_kvaObj = map.get("load_kva");
		if(load_kvaObj != null)
			load_kva = new Double(load_kvaObj.toString());

		Object load_kwObj = map.get("load_kw");
		if(load_kwObj != null)
			load_kw = new Double(load_kwObj.toString());

		Object load_kvarObj = map.get("load_kvar");
		if(load_kvarObj != null)
			load_kvar = new Double(load_kvarObj.toString());

		Object voltageObj = map.get("voltage");
		if(voltageObj != null)
			voltage = new Double(voltageObj.toString());

		Object currentObj = map.get("current");
		if(currentObj != null)
			current = new Double(currentObj.toString());

		Object pfObj = map.get("pf");
		if(pfObj != null)
			pf = new Double(pfObj.toString());

		Object mdObj = map.get("md");
		if(mdObj != null)
			md = new Double(mdObj.toString());

		Object tdhObj = map.get("tdh");
		if(tdhObj != null)
			tdh = new Double(tdhObj.toString());

		Object kvarhObj = map.get("kvarh");
		if(kvarhObj != null)
			kvarh = new Double(kvarhObj.toString());

		Object frequencyObj = map.get("frequency");
		if(frequencyObj != null)
			frequency = new Double(frequencyObj.toString());

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

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

	public Double getKvah() {
		return kvah != null ? kvah : 0.0000;
	}

	public void setKvah(double kvah) {
		this.kvah = kvah;
	}

	public void setKvah(Double kvah) {
		this.kvah = kvah;
	}

	public void unSetKvah() {
		this.kvah = 0.0000;
	}

	public Double getKwh() {
		return kwh != null ? kwh : 0.0000;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	public void unSetKwh() {
		this.kwh = 0.0000;
	}

	public Double getLoad_kva() {
		return load_kva != null ? load_kva : 0.0000;
	}

	public void setLoad_kva(double load_kva) {
		this.load_kva = load_kva;
	}

	public void setLoad_kva(Double load_kva) {
		this.load_kva = load_kva;
	}

	public void unSetLoad_kva() {
		this.load_kva = 0.0000;
	}

	public Double getLoad_kw() {
		return load_kw != null ? load_kw : 0.0000;
	}

	public void setLoad_kw(double load_kw) {
		this.load_kw = load_kw;
	}

	public void setLoad_kw(Double load_kw) {
		this.load_kw = load_kw;
	}

	public void unSetLoad_kw() {
		this.load_kw = 0.0000;
	}

	public Double getLoad_kvar() {
		return load_kvar != null ? load_kvar : 0.0000;
	}

	public void setLoad_kvar(double load_kvar) {
		this.load_kvar = load_kvar;
	}

	public void setLoad_kvar(Double load_kvar) {
		this.load_kvar = load_kvar;
	}

	public void unSetLoad_kvar() {
		this.load_kvar = 0.0000;
	}

	public Double getVoltage() {
		return voltage != null ? voltage : 0.00;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public void setVoltage(Double voltage) {
		this.voltage = voltage;
	}

	public void unSetVoltage() {
		this.voltage = 0.00;
	}

	public Double getCurrent() {
		return current != null ? current : 0.00;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public void setCurrent(Double current) {
		this.current = current;
	}

	public void unSetCurrent() {
		this.current = 0.00;
	}

	public Double getPf() {
		return pf != null ? pf : 0.0000;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public void setPf(Double pf) {
		this.pf = pf;
	}

	public void unSetPf() {
		this.pf = 0.0000;
	}

	public Double getMd() {
		return md != null ? md : 0.0000;
	}

	public void setMd(double md) {
		this.md = md;
	}

	public void setMd(Double md) {
		this.md = md;
	}

	public void unSetMd() {
		this.md = 0.0000;
	}

	public Double getTdh() {
		return tdh != null ? tdh : 0.0000;
	}

	public void setTdh(double tdh) {
		this.tdh = tdh;
	}

	public void setTdh(Double tdh) {
		this.tdh = tdh;
	}

	public void unSetTdh() {
		this.tdh = 0.0000;
	}

	public Double getKvarh() {
		return kvarh != null ? kvarh : 0.0000;
	}

	public void setKvarh(double kvarh) {
		this.kvarh = kvarh;
	}

	public void setKvarh(Double kvarh) {
		this.kvarh = kvarh;
	}

	public void unSetKvarh() {
		this.kvarh = 0.0000;
	}

	public Double getFrequency() {
		return frequency != null ? frequency : 0.0000;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	public void unSetFrequency() {
		this.frequency = 0.0000;
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}