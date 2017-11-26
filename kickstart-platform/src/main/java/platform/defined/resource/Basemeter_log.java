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
public abstract class Basemeter_log extends BaseResource {
	private String id = null;
	private String appliance_id = null;
	private String customer_id = null;
	private String source = null;
	private Long creation_date = null;
	private String timezone = null;
	private Long creation_time = null;
	private Double load_kva = null;
	private Double load_kvar = null;
	private Double load_kw = null;
	private Double voltage = null;
	private Double current = null;
	private Double pf = null;
	private Double md = null;
	private Double tdh = null;
	private Double p1_load_kva = null;
	private Double p1_load_kvar = null;
	private Double p1_load_kw = null;
	private Double p1_voltage = null;
	private Double p1_current = null;
	private Double p1_pf = null;
	private Double p1_md = null;
	private Double p1_tdh = null;
	private Double p1_kvarh = null;
	private Double p1_frequency = null;
	private Double p2_reading_kvah = null;
	private Double p2_reading_kwh = null;
	private Double p2_load_kva = null;
	private Double p2_load_kvar = null;
	private Double p2_load_kw = null;
	private Double p2_voltage = null;
	private Double p2_current = null;
	private Double p2_pf = null;
	private Double p2_md = null;
	private Double p2_tdh = null;
	private Double p2_kvarh = null;
	private Double p2_frequency = null;
	private Double p3_reading_kvah = null;
	private Double p3_reading_kwh = null;
	private Double p3_load_kva = null;
	private Double p3_load_kvar = null;
	private Double p3_load_kw = null;
	private Double p3_voltage = null;
	private Double p3_current = null;
	private Double p3_pf = null;
	private Double p3_md = null;
	private Double p3_tdh = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_APPLIANCE_ID = "appliance_id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_SOURCE = "source";
	public static String FIELD_CREATION_DATE = "creation_date";
	public static String FIELD_TIMEZONE = "timezone";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LOAD_KVA = "load_kva";
	public static String FIELD_LOAD_KVAR = "load_kvar";
	public static String FIELD_LOAD_KW = "load_kw";
	public static String FIELD_VOLTAGE = "voltage";
	public static String FIELD_CURRENT = "current";
	public static String FIELD_PF = "pf";
	public static String FIELD_MD = "md";
	public static String FIELD_TDH = "tdh";
	public static String FIELD_P1_LOAD_KVA = "p1_load_kva";
	public static String FIELD_P1_LOAD_KVAR = "p1_load_kvar";
	public static String FIELD_P1_LOAD_KW = "p1_load_kw";
	public static String FIELD_P1_VOLTAGE = "p1_voltage";
	public static String FIELD_P1_CURRENT = "p1_current";
	public static String FIELD_P1_PF = "p1_pf";
	public static String FIELD_P1_MD = "p1_md";
	public static String FIELD_P1_TDH = "p1_tdh";
	public static String FIELD_P1_KVARH = "p1_kvarh";
	public static String FIELD_P1_FREQUENCY = "p1_frequency";
	public static String FIELD_P2_READING_KVAH = "p2_reading_kvah";
	public static String FIELD_P2_READING_KWH = "p2_reading_kwh";
	public static String FIELD_P2_LOAD_KVA = "p2_load_kva";
	public static String FIELD_P2_LOAD_KVAR = "p2_load_kvar";
	public static String FIELD_P2_LOAD_KW = "p2_load_kw";
	public static String FIELD_P2_VOLTAGE = "p2_voltage";
	public static String FIELD_P2_CURRENT = "p2_current";
	public static String FIELD_P2_PF = "p2_pf";
	public static String FIELD_P2_MD = "p2_md";
	public static String FIELD_P2_TDH = "p2_tdh";
	public static String FIELD_P2_KVARH = "p2_kvarh";
	public static String FIELD_P2_FREQUENCY = "p2_frequency";
	public static String FIELD_P3_READING_KVAH = "p3_reading_kvah";
	public static String FIELD_P3_READING_KWH = "p3_reading_kwh";
	public static String FIELD_P3_LOAD_KVA = "p3_load_kva";
	public static String FIELD_P3_LOAD_KVAR = "p3_load_kvar";
	public static String FIELD_P3_LOAD_KW = "p3_load_kw";
	public static String FIELD_P3_VOLTAGE = "p3_voltage";
	public static String FIELD_P3_CURRENT = "p3_current";
	public static String FIELD_P3_PF = "p3_pf";
	public static String FIELD_P3_MD = "p3_md";
	public static String FIELD_P3_TDH = "p3_tdh";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("meter_log");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field appliance_idField = new Field("appliance_id", "String");
		appliance_idField.setRequired(true);
		appliance_idField.setLength(128);
		metaData.addField(appliance_idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setRequired(true);
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field sourceField = new Field("source", "String");
		sourceField.setLength(128);
		metaData.addField(sourceField);

		Field creation_dateField = new Field("creation_date", "timestamp");
		creation_dateField.setRequired(true);
		metaData.addField(creation_dateField);

		Field timezoneField = new Field("timezone", "String");
		timezoneField.setLength(32);
		metaData.addField(timezoneField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field load_kvaField = new Field("load_kva", "Double");
		load_kvaField.setDefaultValue(0.0000);
		load_kvaField.setLength(12);
		load_kvaField.setPrecision(4);
		metaData.addField(load_kvaField);

		Field load_kvarField = new Field("load_kvar", "Double");
		load_kvarField.setDefaultValue(0.0000);
		load_kvarField.setLength(12);
		load_kvarField.setPrecision(4);
		metaData.addField(load_kvarField);

		Field load_kwField = new Field("load_kw", "Double");
		load_kwField.setDefaultValue(0.0000);
		load_kwField.setLength(12);
		load_kwField.setPrecision(4);
		metaData.addField(load_kwField);

		Field voltageField = new Field("voltage", "Double");
		voltageField.setDefaultValue(0.0000);
		voltageField.setLength(12);
		voltageField.setPrecision(4);
		metaData.addField(voltageField);

		Field currentField = new Field("current", "Double");
		currentField.setDefaultValue(0.0000);
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

		Field p1_load_kvaField = new Field("p1_load_kva", "Double");
		p1_load_kvaField.setDefaultValue(0.0000);
		p1_load_kvaField.setLength(12);
		p1_load_kvaField.setPrecision(4);
		metaData.addField(p1_load_kvaField);

		Field p1_load_kvarField = new Field("p1_load_kvar", "Double");
		p1_load_kvarField.setDefaultValue(0.0000);
		p1_load_kvarField.setLength(12);
		p1_load_kvarField.setPrecision(4);
		metaData.addField(p1_load_kvarField);

		Field p1_load_kwField = new Field("p1_load_kw", "Double");
		p1_load_kwField.setDefaultValue(0.0000);
		p1_load_kwField.setLength(12);
		p1_load_kwField.setPrecision(4);
		metaData.addField(p1_load_kwField);

		Field p1_voltageField = new Field("p1_voltage", "Double");
		p1_voltageField.setDefaultValue(0.0000);
		p1_voltageField.setLength(12);
		p1_voltageField.setPrecision(4);
		metaData.addField(p1_voltageField);

		Field p1_currentField = new Field("p1_current", "Double");
		p1_currentField.setDefaultValue(0.0000);
		p1_currentField.setLength(12);
		p1_currentField.setPrecision(4);
		metaData.addField(p1_currentField);

		Field p1_pfField = new Field("p1_pf", "double");
		p1_pfField.setDefaultValue(0.0000);
		p1_pfField.setLength(12);
		p1_pfField.setPrecision(4);
		metaData.addField(p1_pfField);

		Field p1_mdField = new Field("p1_md", "double");
		p1_mdField.setDefaultValue(0.0000);
		p1_mdField.setLength(12);
		p1_mdField.setPrecision(4);
		metaData.addField(p1_mdField);

		Field p1_tdhField = new Field("p1_tdh", "double");
		p1_tdhField.setDefaultValue(0.0000);
		p1_tdhField.setLength(12);
		p1_tdhField.setPrecision(4);
		metaData.addField(p1_tdhField);

		Field p1_kvarhField = new Field("p1_kvarh", "double");
		p1_kvarhField.setDefaultValue(0.0000);
		p1_kvarhField.setLength(12);
		p1_kvarhField.setPrecision(4);
		metaData.addField(p1_kvarhField);

		Field p1_frequencyField = new Field("p1_frequency", "Double");
		p1_frequencyField.setDefaultValue(0.0000);
		p1_frequencyField.setLength(12);
		p1_frequencyField.setPrecision(4);
		metaData.addField(p1_frequencyField);

		Field p2_reading_kvahField = new Field("p2_reading_kvah", "Double");
		p2_reading_kvahField.setDefaultValue(0.0000);
		p2_reading_kvahField.setLength(12);
		p2_reading_kvahField.setPrecision(4);
		metaData.addField(p2_reading_kvahField);

		Field p2_reading_kwhField = new Field("p2_reading_kwh", "Double");
		p2_reading_kwhField.setDefaultValue(0.0000);
		p2_reading_kwhField.setLength(12);
		p2_reading_kwhField.setPrecision(4);
		metaData.addField(p2_reading_kwhField);

		Field p2_load_kvaField = new Field("p2_load_kva", "Double");
		p2_load_kvaField.setDefaultValue(0.0000);
		p2_load_kvaField.setLength(12);
		p2_load_kvaField.setPrecision(4);
		metaData.addField(p2_load_kvaField);

		Field p2_load_kvarField = new Field("p2_load_kvar", "Double");
		p2_load_kvarField.setDefaultValue(0.0000);
		p2_load_kvarField.setLength(12);
		p2_load_kvarField.setPrecision(4);
		metaData.addField(p2_load_kvarField);

		Field p2_load_kwField = new Field("p2_load_kw", "Double");
		p2_load_kwField.setDefaultValue(0.0000);
		p2_load_kwField.setLength(12);
		p2_load_kwField.setPrecision(4);
		metaData.addField(p2_load_kwField);

		Field p2_voltageField = new Field("p2_voltage", "Double");
		p2_voltageField.setDefaultValue(0.0000);
		p2_voltageField.setLength(12);
		p2_voltageField.setPrecision(4);
		metaData.addField(p2_voltageField);

		Field p2_currentField = new Field("p2_current", "Double");
		p2_currentField.setDefaultValue(0.0000);
		p2_currentField.setLength(12);
		p2_currentField.setPrecision(4);
		metaData.addField(p2_currentField);

		Field p2_pfField = new Field("p2_pf", "double");
		p2_pfField.setDefaultValue(0.0000);
		p2_pfField.setLength(12);
		p2_pfField.setPrecision(4);
		metaData.addField(p2_pfField);

		Field p2_mdField = new Field("p2_md", "double");
		p2_mdField.setDefaultValue(0.0000);
		p2_mdField.setLength(12);
		p2_mdField.setPrecision(4);
		metaData.addField(p2_mdField);

		Field p2_tdhField = new Field("p2_tdh", "double");
		p2_tdhField.setDefaultValue(0.0000);
		p2_tdhField.setLength(12);
		p2_tdhField.setPrecision(4);
		metaData.addField(p2_tdhField);

		Field p2_kvarhField = new Field("p2_kvarh", "double");
		p2_kvarhField.setDefaultValue(0.0000);
		p2_kvarhField.setLength(12);
		p2_kvarhField.setPrecision(4);
		metaData.addField(p2_kvarhField);

		Field p2_frequencyField = new Field("p2_frequency", "Double");
		p2_frequencyField.setDefaultValue(0.0000);
		p2_frequencyField.setLength(12);
		p2_frequencyField.setPrecision(4);
		metaData.addField(p2_frequencyField);

		Field p3_reading_kvahField = new Field("p3_reading_kvah", "Double");
		p3_reading_kvahField.setDefaultValue(0.0000);
		p3_reading_kvahField.setLength(12);
		p3_reading_kvahField.setPrecision(4);
		metaData.addField(p3_reading_kvahField);

		Field p3_reading_kwhField = new Field("p3_reading_kwh", "Double");
		p3_reading_kwhField.setDefaultValue(0.0000);
		p3_reading_kwhField.setLength(12);
		p3_reading_kwhField.setPrecision(4);
		metaData.addField(p3_reading_kwhField);

		Field p3_load_kvaField = new Field("p3_load_kva", "Double");
		p3_load_kvaField.setDefaultValue(0.0000);
		p3_load_kvaField.setLength(12);
		p3_load_kvaField.setPrecision(4);
		metaData.addField(p3_load_kvaField);

		Field p3_load_kvarField = new Field("p3_load_kvar", "Double");
		p3_load_kvarField.setDefaultValue(0.0000);
		p3_load_kvarField.setLength(12);
		p3_load_kvarField.setPrecision(4);
		metaData.addField(p3_load_kvarField);

		Field p3_load_kwField = new Field("p3_load_kw", "Double");
		p3_load_kwField.setDefaultValue(0.0000);
		p3_load_kwField.setLength(12);
		p3_load_kwField.setPrecision(4);
		metaData.addField(p3_load_kwField);

		Field p3_voltageField = new Field("p3_voltage", "Double");
		p3_voltageField.setDefaultValue(0.0000);
		p3_voltageField.setLength(12);
		p3_voltageField.setPrecision(4);
		metaData.addField(p3_voltageField);

		Field p3_currentField = new Field("p3_current", "Double");
		p3_currentField.setDefaultValue(0.0000);
		p3_currentField.setLength(12);
		p3_currentField.setPrecision(4);
		metaData.addField(p3_currentField);

		Field p3_pfField = new Field("p3_pf", "double");
		p3_pfField.setDefaultValue(0.0000);
		p3_pfField.setLength(12);
		p3_pfField.setPrecision(4);
		metaData.addField(p3_pfField);

		Field p3_mdField = new Field("p3_md", "double");
		p3_mdField.setDefaultValue(0.0000);
		p3_mdField.setLength(12);
		p3_mdField.setPrecision(4);
		metaData.addField(p3_mdField);

		Field p3_tdhField = new Field("p3_tdh", "double");
		p3_tdhField.setDefaultValue(0.0000);
		p3_tdhField.setLength(12);
		p3_tdhField.setPrecision(4);
		metaData.addField(p3_tdhField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("meter_log");

		metaData.setCluster("DB_ANALYSIS");
	}

	public Basemeter_log() {}

	public Basemeter_log(Basemeter_log obj) {
		this.id = obj.id;
		this.appliance_id = obj.appliance_id;
		this.customer_id = obj.customer_id;
		this.source = obj.source;
		this.creation_date = obj.creation_date;
		this.timezone = obj.timezone;
		this.creation_time = obj.creation_time;
		this.load_kva = obj.load_kva;
		this.load_kvar = obj.load_kvar;
		this.load_kw = obj.load_kw;
		this.voltage = obj.voltage;
		this.current = obj.current;
		this.pf = obj.pf;
		this.md = obj.md;
		this.tdh = obj.tdh;
		this.p1_load_kva = obj.p1_load_kva;
		this.p1_load_kvar = obj.p1_load_kvar;
		this.p1_load_kw = obj.p1_load_kw;
		this.p1_voltage = obj.p1_voltage;
		this.p1_current = obj.p1_current;
		this.p1_pf = obj.p1_pf;
		this.p1_md = obj.p1_md;
		this.p1_tdh = obj.p1_tdh;
		this.p1_kvarh = obj.p1_kvarh;
		this.p1_frequency = obj.p1_frequency;
		this.p2_reading_kvah = obj.p2_reading_kvah;
		this.p2_reading_kwh = obj.p2_reading_kwh;
		this.p2_load_kva = obj.p2_load_kva;
		this.p2_load_kvar = obj.p2_load_kvar;
		this.p2_load_kw = obj.p2_load_kw;
		this.p2_voltage = obj.p2_voltage;
		this.p2_current = obj.p2_current;
		this.p2_pf = obj.p2_pf;
		this.p2_md = obj.p2_md;
		this.p2_tdh = obj.p2_tdh;
		this.p2_kvarh = obj.p2_kvarh;
		this.p2_frequency = obj.p2_frequency;
		this.p3_reading_kvah = obj.p3_reading_kvah;
		this.p3_reading_kwh = obj.p3_reading_kwh;
		this.p3_load_kva = obj.p3_load_kva;
		this.p3_load_kvar = obj.p3_load_kvar;
		this.p3_load_kw = obj.p3_load_kw;
		this.p3_voltage = obj.p3_voltage;
		this.p3_current = obj.p3_current;
		this.p3_pf = obj.p3_pf;
		this.p3_md = obj.p3_md;
		this.p3_tdh = obj.p3_tdh;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(load_kva == null)
			load_kva = 0.0000;
		if(load_kvar == null)
			load_kvar = 0.0000;
		if(load_kw == null)
			load_kw = 0.0000;
		if(voltage == null)
			voltage = 0.0000;
		if(current == null)
			current = 0.0000;
		if(pf == null)
			pf = 0.0000;
		if(md == null)
			md = 0.0000;
		if(tdh == null)
			tdh = 0.0000;
		if(p1_load_kva == null)
			p1_load_kva = 0.0000;
		if(p1_load_kvar == null)
			p1_load_kvar = 0.0000;
		if(p1_load_kw == null)
			p1_load_kw = 0.0000;
		if(p1_voltage == null)
			p1_voltage = 0.0000;
		if(p1_current == null)
			p1_current = 0.0000;
		if(p1_pf == null)
			p1_pf = 0.0000;
		if(p1_md == null)
			p1_md = 0.0000;
		if(p1_tdh == null)
			p1_tdh = 0.0000;
		if(p1_kvarh == null)
			p1_kvarh = 0.0000;
		if(p1_frequency == null)
			p1_frequency = 0.0000;
		if(p2_reading_kvah == null)
			p2_reading_kvah = 0.0000;
		if(p2_reading_kwh == null)
			p2_reading_kwh = 0.0000;
		if(p2_load_kva == null)
			p2_load_kva = 0.0000;
		if(p2_load_kvar == null)
			p2_load_kvar = 0.0000;
		if(p2_load_kw == null)
			p2_load_kw = 0.0000;
		if(p2_voltage == null)
			p2_voltage = 0.0000;
		if(p2_current == null)
			p2_current = 0.0000;
		if(p2_pf == null)
			p2_pf = 0.0000;
		if(p2_md == null)
			p2_md = 0.0000;
		if(p2_tdh == null)
			p2_tdh = 0.0000;
		if(p2_kvarh == null)
			p2_kvarh = 0.0000;
		if(p2_frequency == null)
			p2_frequency = 0.0000;
		if(p3_reading_kvah == null)
			p3_reading_kvah = 0.0000;
		if(p3_reading_kwh == null)
			p3_reading_kwh = 0.0000;
		if(p3_load_kva == null)
			p3_load_kva = 0.0000;
		if(p3_load_kvar == null)
			p3_load_kvar = 0.0000;
		if(p3_load_kw == null)
			p3_load_kw = 0.0000;
		if(p3_voltage == null)
			p3_voltage = 0.0000;
		if(p3_current == null)
			p3_current = 0.0000;
		if(p3_pf == null)
			p3_pf = 0.0000;
		if(p3_md == null)
			p3_md = 0.0000;
		if(p3_tdh == null)
			p3_tdh = 0.0000;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(appliance_id != null)
			map.put("appliance_id", appliance_id);
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(creation_date != null)
			map.put("creation_date", creation_date);
		if(timezone != null)
			map.put("timezone", timezone);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(load_kva != null)
			map.put("load_kva", load_kva);
		if(load_kvar != null)
			map.put("load_kvar", load_kvar);
		if(load_kw != null)
			map.put("load_kw", load_kw);
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
		if(p1_load_kva != null)
			map.put("p1_load_kva", p1_load_kva);
		if(p1_load_kvar != null)
			map.put("p1_load_kvar", p1_load_kvar);
		if(p1_load_kw != null)
			map.put("p1_load_kw", p1_load_kw);
		if(p1_voltage != null)
			map.put("p1_voltage", p1_voltage);
		if(p1_current != null)
			map.put("p1_current", p1_current);
		if(p1_pf != null)
			map.put("p1_pf", p1_pf);
		if(p1_md != null)
			map.put("p1_md", p1_md);
		if(p1_tdh != null)
			map.put("p1_tdh", p1_tdh);
		if(p1_kvarh != null)
			map.put("p1_kvarh", p1_kvarh);
		if(p1_frequency != null)
			map.put("p1_frequency", p1_frequency);
		if(p2_reading_kvah != null)
			map.put("p2_reading_kvah", p2_reading_kvah);
		if(p2_reading_kwh != null)
			map.put("p2_reading_kwh", p2_reading_kwh);
		if(p2_load_kva != null)
			map.put("p2_load_kva", p2_load_kva);
		if(p2_load_kvar != null)
			map.put("p2_load_kvar", p2_load_kvar);
		if(p2_load_kw != null)
			map.put("p2_load_kw", p2_load_kw);
		if(p2_voltage != null)
			map.put("p2_voltage", p2_voltage);
		if(p2_current != null)
			map.put("p2_current", p2_current);
		if(p2_pf != null)
			map.put("p2_pf", p2_pf);
		if(p2_md != null)
			map.put("p2_md", p2_md);
		if(p2_tdh != null)
			map.put("p2_tdh", p2_tdh);
		if(p2_kvarh != null)
			map.put("p2_kvarh", p2_kvarh);
		if(p2_frequency != null)
			map.put("p2_frequency", p2_frequency);
		if(p3_reading_kvah != null)
			map.put("p3_reading_kvah", p3_reading_kvah);
		if(p3_reading_kwh != null)
			map.put("p3_reading_kwh", p3_reading_kwh);
		if(p3_load_kva != null)
			map.put("p3_load_kva", p3_load_kva);
		if(p3_load_kvar != null)
			map.put("p3_load_kvar", p3_load_kvar);
		if(p3_load_kw != null)
			map.put("p3_load_kw", p3_load_kw);
		if(p3_voltage != null)
			map.put("p3_voltage", p3_voltage);
		if(p3_current != null)
			map.put("p3_current", p3_current);
		if(p3_pf != null)
			map.put("p3_pf", p3_pf);
		if(p3_md != null)
			map.put("p3_md", p3_md);
		if(p3_tdh != null)
			map.put("p3_tdh", p3_tdh);
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
		if(validateAppliance_id(add))
			map.put("appliance_id", appliance_id);
		if(validateCustomer_id(add))
			map.put("customer_id", customer_id);
		if(source != null)
			map.put("source", source);
		if(validateCreation_date(add))
			map.put("creation_date", creation_date);
		if(timezone != null)
			map.put("timezone", timezone);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(load_kva != null)
			map.put("load_kva", load_kva);
		if(load_kvar != null)
			map.put("load_kvar", load_kvar);
		if(load_kw != null)
			map.put("load_kw", load_kw);
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
		if(p1_load_kva != null)
			map.put("p1_load_kva", p1_load_kva);
		if(p1_load_kvar != null)
			map.put("p1_load_kvar", p1_load_kvar);
		if(p1_load_kw != null)
			map.put("p1_load_kw", p1_load_kw);
		if(p1_voltage != null)
			map.put("p1_voltage", p1_voltage);
		if(p1_current != null)
			map.put("p1_current", p1_current);
		if(p1_pf != null)
			map.put("p1_pf", p1_pf);
		if(p1_md != null)
			map.put("p1_md", p1_md);
		if(p1_tdh != null)
			map.put("p1_tdh", p1_tdh);
		if(p1_kvarh != null)
			map.put("p1_kvarh", p1_kvarh);
		if(p1_frequency != null)
			map.put("p1_frequency", p1_frequency);
		if(p2_reading_kvah != null)
			map.put("p2_reading_kvah", p2_reading_kvah);
		if(p2_reading_kwh != null)
			map.put("p2_reading_kwh", p2_reading_kwh);
		if(p2_load_kva != null)
			map.put("p2_load_kva", p2_load_kva);
		if(p2_load_kvar != null)
			map.put("p2_load_kvar", p2_load_kvar);
		if(p2_load_kw != null)
			map.put("p2_load_kw", p2_load_kw);
		if(p2_voltage != null)
			map.put("p2_voltage", p2_voltage);
		if(p2_current != null)
			map.put("p2_current", p2_current);
		if(p2_pf != null)
			map.put("p2_pf", p2_pf);
		if(p2_md != null)
			map.put("p2_md", p2_md);
		if(p2_tdh != null)
			map.put("p2_tdh", p2_tdh);
		if(p2_kvarh != null)
			map.put("p2_kvarh", p2_kvarh);
		if(p2_frequency != null)
			map.put("p2_frequency", p2_frequency);
		if(p3_reading_kvah != null)
			map.put("p3_reading_kvah", p3_reading_kvah);
		if(p3_reading_kwh != null)
			map.put("p3_reading_kwh", p3_reading_kwh);
		if(p3_load_kva != null)
			map.put("p3_load_kva", p3_load_kva);
		if(p3_load_kvar != null)
			map.put("p3_load_kvar", p3_load_kvar);
		if(p3_load_kw != null)
			map.put("p3_load_kw", p3_load_kw);
		if(p3_voltage != null)
			map.put("p3_voltage", p3_voltage);
		if(p3_current != null)
			map.put("p3_current", p3_current);
		if(p3_pf != null)
			map.put("p3_pf", p3_pf);
		if(p3_md != null)
			map.put("p3_md", p3_md);
		if(p3_tdh != null)
			map.put("p3_tdh", p3_tdh);
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
		customer_id = (String) map.get("customer_id");
		source = (String) map.get("source");
		creation_date = (Long) map.get("creation_date");
		timezone = (String) map.get("timezone");
		creation_time = (Long) map.get("creation_time");
		load_kva = (Double) map.get("load_kva");
		load_kvar = (Double) map.get("load_kvar");
		load_kw = (Double) map.get("load_kw");
		voltage = (Double) map.get("voltage");
		current = (Double) map.get("current");
		pf = (Double) map.get("pf");
		md = (Double) map.get("md");
		tdh = (Double) map.get("tdh");
		p1_load_kva = (Double) map.get("p1_load_kva");
		p1_load_kvar = (Double) map.get("p1_load_kvar");
		p1_load_kw = (Double) map.get("p1_load_kw");
		p1_voltage = (Double) map.get("p1_voltage");
		p1_current = (Double) map.get("p1_current");
		p1_pf = (Double) map.get("p1_pf");
		p1_md = (Double) map.get("p1_md");
		p1_tdh = (Double) map.get("p1_tdh");
		p1_kvarh = (Double) map.get("p1_kvarh");
		p1_frequency = (Double) map.get("p1_frequency");
		p2_reading_kvah = (Double) map.get("p2_reading_kvah");
		p2_reading_kwh = (Double) map.get("p2_reading_kwh");
		p2_load_kva = (Double) map.get("p2_load_kva");
		p2_load_kvar = (Double) map.get("p2_load_kvar");
		p2_load_kw = (Double) map.get("p2_load_kw");
		p2_voltage = (Double) map.get("p2_voltage");
		p2_current = (Double) map.get("p2_current");
		p2_pf = (Double) map.get("p2_pf");
		p2_md = (Double) map.get("p2_md");
		p2_tdh = (Double) map.get("p2_tdh");
		p2_kvarh = (Double) map.get("p2_kvarh");
		p2_frequency = (Double) map.get("p2_frequency");
		p3_reading_kvah = (Double) map.get("p3_reading_kvah");
		p3_reading_kwh = (Double) map.get("p3_reading_kwh");
		p3_load_kva = (Double) map.get("p3_load_kva");
		p3_load_kvar = (Double) map.get("p3_load_kvar");
		p3_load_kw = (Double) map.get("p3_load_kw");
		p3_voltage = (Double) map.get("p3_voltage");
		p3_current = (Double) map.get("p3_current");
		p3_pf = (Double) map.get("p3_pf");
		p3_md = (Double) map.get("p3_md");
		p3_tdh = (Double) map.get("p3_tdh");
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

		Object customer_idObj = map.get("customer_id");
		if(customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object sourceObj = map.get("source");
		if(sourceObj != null)
			source = sourceObj.toString();

		Object creation_dateObj = map.get("creation_date");
		if(creation_dateObj != null)
			creation_date = new Long(creation_dateObj.toString());

		Object timezoneObj = map.get("timezone");
		if(timezoneObj != null)
			timezone = timezoneObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object load_kvaObj = map.get("load_kva");
		if(load_kvaObj != null)
			load_kva = new Double(load_kvaObj.toString());

		Object load_kvarObj = map.get("load_kvar");
		if(load_kvarObj != null)
			load_kvar = new Double(load_kvarObj.toString());

		Object load_kwObj = map.get("load_kw");
		if(load_kwObj != null)
			load_kw = new Double(load_kwObj.toString());

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

		Object p1_load_kvaObj = map.get("p1_load_kva");
		if(p1_load_kvaObj != null)
			p1_load_kva = new Double(p1_load_kvaObj.toString());

		Object p1_load_kvarObj = map.get("p1_load_kvar");
		if(p1_load_kvarObj != null)
			p1_load_kvar = new Double(p1_load_kvarObj.toString());

		Object p1_load_kwObj = map.get("p1_load_kw");
		if(p1_load_kwObj != null)
			p1_load_kw = new Double(p1_load_kwObj.toString());

		Object p1_voltageObj = map.get("p1_voltage");
		if(p1_voltageObj != null)
			p1_voltage = new Double(p1_voltageObj.toString());

		Object p1_currentObj = map.get("p1_current");
		if(p1_currentObj != null)
			p1_current = new Double(p1_currentObj.toString());

		Object p1_pfObj = map.get("p1_pf");
		if(p1_pfObj != null)
			p1_pf = new Double(p1_pfObj.toString());

		Object p1_mdObj = map.get("p1_md");
		if(p1_mdObj != null)
			p1_md = new Double(p1_mdObj.toString());

		Object p1_tdhObj = map.get("p1_tdh");
		if(p1_tdhObj != null)
			p1_tdh = new Double(p1_tdhObj.toString());

		Object p1_kvarhObj = map.get("p1_kvarh");
		if(p1_kvarhObj != null)
			p1_kvarh = new Double(p1_kvarhObj.toString());

		Object p1_frequencyObj = map.get("p1_frequency");
		if(p1_frequencyObj != null)
			p1_frequency = new Double(p1_frequencyObj.toString());

		Object p2_reading_kvahObj = map.get("p2_reading_kvah");
		if(p2_reading_kvahObj != null)
			p2_reading_kvah = new Double(p2_reading_kvahObj.toString());

		Object p2_reading_kwhObj = map.get("p2_reading_kwh");
		if(p2_reading_kwhObj != null)
			p2_reading_kwh = new Double(p2_reading_kwhObj.toString());

		Object p2_load_kvaObj = map.get("p2_load_kva");
		if(p2_load_kvaObj != null)
			p2_load_kva = new Double(p2_load_kvaObj.toString());

		Object p2_load_kvarObj = map.get("p2_load_kvar");
		if(p2_load_kvarObj != null)
			p2_load_kvar = new Double(p2_load_kvarObj.toString());

		Object p2_load_kwObj = map.get("p2_load_kw");
		if(p2_load_kwObj != null)
			p2_load_kw = new Double(p2_load_kwObj.toString());

		Object p2_voltageObj = map.get("p2_voltage");
		if(p2_voltageObj != null)
			p2_voltage = new Double(p2_voltageObj.toString());

		Object p2_currentObj = map.get("p2_current");
		if(p2_currentObj != null)
			p2_current = new Double(p2_currentObj.toString());

		Object p2_pfObj = map.get("p2_pf");
		if(p2_pfObj != null)
			p2_pf = new Double(p2_pfObj.toString());

		Object p2_mdObj = map.get("p2_md");
		if(p2_mdObj != null)
			p2_md = new Double(p2_mdObj.toString());

		Object p2_tdhObj = map.get("p2_tdh");
		if(p2_tdhObj != null)
			p2_tdh = new Double(p2_tdhObj.toString());

		Object p2_kvarhObj = map.get("p2_kvarh");
		if(p2_kvarhObj != null)
			p2_kvarh = new Double(p2_kvarhObj.toString());

		Object p2_frequencyObj = map.get("p2_frequency");
		if(p2_frequencyObj != null)
			p2_frequency = new Double(p2_frequencyObj.toString());

		Object p3_reading_kvahObj = map.get("p3_reading_kvah");
		if(p3_reading_kvahObj != null)
			p3_reading_kvah = new Double(p3_reading_kvahObj.toString());

		Object p3_reading_kwhObj = map.get("p3_reading_kwh");
		if(p3_reading_kwhObj != null)
			p3_reading_kwh = new Double(p3_reading_kwhObj.toString());

		Object p3_load_kvaObj = map.get("p3_load_kva");
		if(p3_load_kvaObj != null)
			p3_load_kva = new Double(p3_load_kvaObj.toString());

		Object p3_load_kvarObj = map.get("p3_load_kvar");
		if(p3_load_kvarObj != null)
			p3_load_kvar = new Double(p3_load_kvarObj.toString());

		Object p3_load_kwObj = map.get("p3_load_kw");
		if(p3_load_kwObj != null)
			p3_load_kw = new Double(p3_load_kwObj.toString());

		Object p3_voltageObj = map.get("p3_voltage");
		if(p3_voltageObj != null)
			p3_voltage = new Double(p3_voltageObj.toString());

		Object p3_currentObj = map.get("p3_current");
		if(p3_currentObj != null)
			p3_current = new Double(p3_currentObj.toString());

		Object p3_pfObj = map.get("p3_pf");
		if(p3_pfObj != null)
			p3_pf = new Double(p3_pfObj.toString());

		Object p3_mdObj = map.get("p3_md");
		if(p3_mdObj != null)
			p3_md = new Double(p3_mdObj.toString());

		Object p3_tdhObj = map.get("p3_tdh");
		if(p3_tdhObj != null)
			p3_tdh = new Double(p3_tdhObj.toString());

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

	public String getSource() {
		return source;
	}

	public String getSourceEx() {
		return source != null ? source : "";
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void unSetSource() {
		this.source = null;
	}

	public Long getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Long creation_date) {
		this.creation_date = creation_date;
	}


	public boolean validateCreation_date(boolean add) throws ApplicationException {
		if(add && creation_date == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[creation_date]");
		return creation_date != null;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getTimezoneEx() {
		return timezone != null ? timezone : "";
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public void unSetTimezone() {
		this.timezone = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Double getLoad_kva() {
		return load_kva != null ? load_kva : 0.0000;
	}

	public void setLoad_kva(Double load_kva) {
		this.load_kva = load_kva;
	}

	public void unSetLoad_kva() {
		this.load_kva = 0.0000;
	}

	public Double getLoad_kvar() {
		return load_kvar != null ? load_kvar : 0.0000;
	}

	public void setLoad_kvar(Double load_kvar) {
		this.load_kvar = load_kvar;
	}

	public void unSetLoad_kvar() {
		this.load_kvar = 0.0000;
	}

	public Double getLoad_kw() {
		return load_kw != null ? load_kw : 0.0000;
	}

	public void setLoad_kw(Double load_kw) {
		this.load_kw = load_kw;
	}

	public void unSetLoad_kw() {
		this.load_kw = 0.0000;
	}

	public Double getVoltage() {
		return voltage != null ? voltage : 0.0000;
	}

	public void setVoltage(Double voltage) {
		this.voltage = voltage;
	}

	public void unSetVoltage() {
		this.voltage = 0.0000;
	}

	public Double getCurrent() {
		return current != null ? current : 0.0000;
	}

	public void setCurrent(Double current) {
		this.current = current;
	}

	public void unSetCurrent() {
		this.current = 0.0000;
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

	public Double getP1_load_kva() {
		return p1_load_kva != null ? p1_load_kva : 0.0000;
	}

	public void setP1_load_kva(Double p1_load_kva) {
		this.p1_load_kva = p1_load_kva;
	}

	public void unSetP1_load_kva() {
		this.p1_load_kva = 0.0000;
	}

	public Double getP1_load_kvar() {
		return p1_load_kvar != null ? p1_load_kvar : 0.0000;
	}

	public void setP1_load_kvar(Double p1_load_kvar) {
		this.p1_load_kvar = p1_load_kvar;
	}

	public void unSetP1_load_kvar() {
		this.p1_load_kvar = 0.0000;
	}

	public Double getP1_load_kw() {
		return p1_load_kw != null ? p1_load_kw : 0.0000;
	}

	public void setP1_load_kw(Double p1_load_kw) {
		this.p1_load_kw = p1_load_kw;
	}

	public void unSetP1_load_kw() {
		this.p1_load_kw = 0.0000;
	}

	public Double getP1_voltage() {
		return p1_voltage != null ? p1_voltage : 0.0000;
	}

	public void setP1_voltage(Double p1_voltage) {
		this.p1_voltage = p1_voltage;
	}

	public void unSetP1_voltage() {
		this.p1_voltage = 0.0000;
	}

	public Double getP1_current() {
		return p1_current != null ? p1_current : 0.0000;
	}

	public void setP1_current(Double p1_current) {
		this.p1_current = p1_current;
	}

	public void unSetP1_current() {
		this.p1_current = 0.0000;
	}

	public Double getP1_pf() {
		return p1_pf != null ? p1_pf : 0.0000;
	}

	public void setP1_pf(double p1_pf) {
		this.p1_pf = p1_pf;
	}

	public void setP1_pf(Double p1_pf) {
		this.p1_pf = p1_pf;
	}

	public void unSetP1_pf() {
		this.p1_pf = 0.0000;
	}

	public Double getP1_md() {
		return p1_md != null ? p1_md : 0.0000;
	}

	public void setP1_md(double p1_md) {
		this.p1_md = p1_md;
	}

	public void setP1_md(Double p1_md) {
		this.p1_md = p1_md;
	}

	public void unSetP1_md() {
		this.p1_md = 0.0000;
	}

	public Double getP1_tdh() {
		return p1_tdh != null ? p1_tdh : 0.0000;
	}

	public void setP1_tdh(double p1_tdh) {
		this.p1_tdh = p1_tdh;
	}

	public void setP1_tdh(Double p1_tdh) {
		this.p1_tdh = p1_tdh;
	}

	public void unSetP1_tdh() {
		this.p1_tdh = 0.0000;
	}

	public Double getP1_kvarh() {
		return p1_kvarh != null ? p1_kvarh : 0.0000;
	}

	public void setP1_kvarh(double p1_kvarh) {
		this.p1_kvarh = p1_kvarh;
	}

	public void setP1_kvarh(Double p1_kvarh) {
		this.p1_kvarh = p1_kvarh;
	}

	public void unSetP1_kvarh() {
		this.p1_kvarh = 0.0000;
	}

	public Double getP1_frequency() {
		return p1_frequency != null ? p1_frequency : 0.0000;
	}

	public void setP1_frequency(Double p1_frequency) {
		this.p1_frequency = p1_frequency;
	}

	public void unSetP1_frequency() {
		this.p1_frequency = 0.0000;
	}

	public Double getP2_reading_kvah() {
		return p2_reading_kvah != null ? p2_reading_kvah : 0.0000;
	}

	public void setP2_reading_kvah(Double p2_reading_kvah) {
		this.p2_reading_kvah = p2_reading_kvah;
	}

	public void unSetP2_reading_kvah() {
		this.p2_reading_kvah = 0.0000;
	}

	public Double getP2_reading_kwh() {
		return p2_reading_kwh != null ? p2_reading_kwh : 0.0000;
	}

	public void setP2_reading_kwh(Double p2_reading_kwh) {
		this.p2_reading_kwh = p2_reading_kwh;
	}

	public void unSetP2_reading_kwh() {
		this.p2_reading_kwh = 0.0000;
	}

	public Double getP2_load_kva() {
		return p2_load_kva != null ? p2_load_kva : 0.0000;
	}

	public void setP2_load_kva(Double p2_load_kva) {
		this.p2_load_kva = p2_load_kva;
	}

	public void unSetP2_load_kva() {
		this.p2_load_kva = 0.0000;
	}

	public Double getP2_load_kvar() {
		return p2_load_kvar != null ? p2_load_kvar : 0.0000;
	}

	public void setP2_load_kvar(Double p2_load_kvar) {
		this.p2_load_kvar = p2_load_kvar;
	}

	public void unSetP2_load_kvar() {
		this.p2_load_kvar = 0.0000;
	}

	public Double getP2_load_kw() {
		return p2_load_kw != null ? p2_load_kw : 0.0000;
	}

	public void setP2_load_kw(Double p2_load_kw) {
		this.p2_load_kw = p2_load_kw;
	}

	public void unSetP2_load_kw() {
		this.p2_load_kw = 0.0000;
	}

	public Double getP2_voltage() {
		return p2_voltage != null ? p2_voltage : 0.0000;
	}

	public void setP2_voltage(Double p2_voltage) {
		this.p2_voltage = p2_voltage;
	}

	public void unSetP2_voltage() {
		this.p2_voltage = 0.0000;
	}

	public Double getP2_current() {
		return p2_current != null ? p2_current : 0.0000;
	}

	public void setP2_current(Double p2_current) {
		this.p2_current = p2_current;
	}

	public void unSetP2_current() {
		this.p2_current = 0.0000;
	}

	public Double getP2_pf() {
		return p2_pf != null ? p2_pf : 0.0000;
	}

	public void setP2_pf(double p2_pf) {
		this.p2_pf = p2_pf;
	}

	public void setP2_pf(Double p2_pf) {
		this.p2_pf = p2_pf;
	}

	public void unSetP2_pf() {
		this.p2_pf = 0.0000;
	}

	public Double getP2_md() {
		return p2_md != null ? p2_md : 0.0000;
	}

	public void setP2_md(double p2_md) {
		this.p2_md = p2_md;
	}

	public void setP2_md(Double p2_md) {
		this.p2_md = p2_md;
	}

	public void unSetP2_md() {
		this.p2_md = 0.0000;
	}

	public Double getP2_tdh() {
		return p2_tdh != null ? p2_tdh : 0.0000;
	}

	public void setP2_tdh(double p2_tdh) {
		this.p2_tdh = p2_tdh;
	}

	public void setP2_tdh(Double p2_tdh) {
		this.p2_tdh = p2_tdh;
	}

	public void unSetP2_tdh() {
		this.p2_tdh = 0.0000;
	}

	public Double getP2_kvarh() {
		return p2_kvarh != null ? p2_kvarh : 0.0000;
	}

	public void setP2_kvarh(double p2_kvarh) {
		this.p2_kvarh = p2_kvarh;
	}

	public void setP2_kvarh(Double p2_kvarh) {
		this.p2_kvarh = p2_kvarh;
	}

	public void unSetP2_kvarh() {
		this.p2_kvarh = 0.0000;
	}

	public Double getP2_frequency() {
		return p2_frequency != null ? p2_frequency : 0.0000;
	}

	public void setP2_frequency(Double p2_frequency) {
		this.p2_frequency = p2_frequency;
	}

	public void unSetP2_frequency() {
		this.p2_frequency = 0.0000;
	}

	public Double getP3_reading_kvah() {
		return p3_reading_kvah != null ? p3_reading_kvah : 0.0000;
	}

	public void setP3_reading_kvah(Double p3_reading_kvah) {
		this.p3_reading_kvah = p3_reading_kvah;
	}

	public void unSetP3_reading_kvah() {
		this.p3_reading_kvah = 0.0000;
	}

	public Double getP3_reading_kwh() {
		return p3_reading_kwh != null ? p3_reading_kwh : 0.0000;
	}

	public void setP3_reading_kwh(Double p3_reading_kwh) {
		this.p3_reading_kwh = p3_reading_kwh;
	}

	public void unSetP3_reading_kwh() {
		this.p3_reading_kwh = 0.0000;
	}

	public Double getP3_load_kva() {
		return p3_load_kva != null ? p3_load_kva : 0.0000;
	}

	public void setP3_load_kva(Double p3_load_kva) {
		this.p3_load_kva = p3_load_kva;
	}

	public void unSetP3_load_kva() {
		this.p3_load_kva = 0.0000;
	}

	public Double getP3_load_kvar() {
		return p3_load_kvar != null ? p3_load_kvar : 0.0000;
	}

	public void setP3_load_kvar(Double p3_load_kvar) {
		this.p3_load_kvar = p3_load_kvar;
	}

	public void unSetP3_load_kvar() {
		this.p3_load_kvar = 0.0000;
	}

	public Double getP3_load_kw() {
		return p3_load_kw != null ? p3_load_kw : 0.0000;
	}

	public void setP3_load_kw(Double p3_load_kw) {
		this.p3_load_kw = p3_load_kw;
	}

	public void unSetP3_load_kw() {
		this.p3_load_kw = 0.0000;
	}

	public Double getP3_voltage() {
		return p3_voltage != null ? p3_voltage : 0.0000;
	}

	public void setP3_voltage(Double p3_voltage) {
		this.p3_voltage = p3_voltage;
	}

	public void unSetP3_voltage() {
		this.p3_voltage = 0.0000;
	}

	public Double getP3_current() {
		return p3_current != null ? p3_current : 0.0000;
	}

	public void setP3_current(Double p3_current) {
		this.p3_current = p3_current;
	}

	public void unSetP3_current() {
		this.p3_current = 0.0000;
	}

	public Double getP3_pf() {
		return p3_pf != null ? p3_pf : 0.0000;
	}

	public void setP3_pf(double p3_pf) {
		this.p3_pf = p3_pf;
	}

	public void setP3_pf(Double p3_pf) {
		this.p3_pf = p3_pf;
	}

	public void unSetP3_pf() {
		this.p3_pf = 0.0000;
	}

	public Double getP3_md() {
		return p3_md != null ? p3_md : 0.0000;
	}

	public void setP3_md(double p3_md) {
		this.p3_md = p3_md;
	}

	public void setP3_md(Double p3_md) {
		this.p3_md = p3_md;
	}

	public void unSetP3_md() {
		this.p3_md = 0.0000;
	}

	public Double getP3_tdh() {
		return p3_tdh != null ? p3_tdh : 0.0000;
	}

	public void setP3_tdh(double p3_tdh) {
		this.p3_tdh = p3_tdh;
	}

	public void setP3_tdh(Double p3_tdh) {
		this.p3_tdh = p3_tdh;
	}

	public void unSetP3_tdh() {
		this.p3_tdh = 0.0000;
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
		return "DB_ANALYSIS";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}