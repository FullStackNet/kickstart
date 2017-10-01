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
public abstract class Baseappliance_threshold_templete extends BaseResource {
	private String id = null;
	private String name = null;
	private String type = null;
	private Integer grid_min_voltage = null;
	private Integer grid_mx_voltage = null;
	private String grid_voltage_alert = null;
	private String grid_voltage_alert_sms = null;
	private String grid_voltage_alert_email = null;
	private Integer grid_voltage_alert_severity = null;
	private String grid_voltage_alert_clear_mode = null; //Auto,Manual
	private Integer grid_voltage_cool_down = null;
	private Integer grid_min_current = null;
	private Integer grid_max_current = null;
	private String grid_current_alert = null;
	private String grid_current_alert_sms = null;
	private String grid_current_alert_email = null;
	private Integer grid_current_cool_down = null;
	private Integer grid_current_alert_severity = null;
	private String grid_current_alert_clear_mode = null; //Auto,Manual
	private Double grid_min_pf = null;
	private Double grid_max_pf = null;
	private String grid_pf_alert = null;
	private String grid_pf_alert_sms = null;
	private String grid_pf_alert_email = null;
	private Integer grid_pf_cool_down = null;
	private Integer grid_pf_alert_severity = null;
	private String grid_pf_alert_clear_mode = null; //Auto,Manual
	private Double grid_min_md = null;
	private Double grid_max_md = null;
	private String grid_md_alert = null;
	private String grid_md_alert_sms = null;
	private String grid_md_alert_email = null;
	private Integer grid_md_cool_down = null;
	private Integer grid_md_alert_severity = null;
	private String grid_md_alert_clear_mode = null; //Auto,Manual
	private Double grid_min_tdh = null;
	private Double grid_max_tdh = null;
	private String grid_tdh_alert = null;
	private String grid_tdh_alert_sms = null;
	private String grid_tdh_alert_email = null;
	private Integer grid_tdh_cool_down = null;
	private Integer grid_tdh_alert_severity = null;
	private String grid_td_alert_clear_mode = null; //Auto,Manual
	private Integer dg_min_voltage = null;
	private Integer dg_mx_voltage = null;
	private String dg_voltage_alert = null;
	private String dg_voltage_alert_sms = null;
	private String dg_voltage_alert_email = null;
	private Integer dg_voltage_cool_down = null;
	private Integer dg_voltage_alert_severity = null;
	private String dg_voltage_alert_clear_mode = null; //Auto,Manual
	private Integer dg_min_current = null;
	private Integer dg_max_current = null;
	private String dg_current_alert = null;
	private String dg_current_alert_sms = null;
	private String dg_current_alert_email = null;
	private Integer dg_current_cool_down = null;
	private Integer dg_current_alert_severity = null;
	private String dg_current_alert_clear_mode = null; //Auto,Manual
	private Double dg_min_pf = null;
	private Double dg_max_pf = null;
	private String dg_pf_alert = null;
	private String dg_pf_alert_sms = null;
	private String dg_pf_alert_email = null;
	private Integer dg_pf_cool_down = null;
	private Integer dg_pf_alert_severity = null;
	private String dg_pf_alert_clear_mode = null; //Auto,Manual
	private Double dg_min_md = null;
	private Double dg_max_md = null;
	private String dg_md_alert = null;
	private String dg_md_alert_sms = null;
	private String dg_md_alert_email = null;
	private Integer dg_md_cool_down = null;
	private Integer dg_md_alert_severity = null;
	private String dg_md_alert_clear_mode = null; //Auto,Manual
	private Double dg_min_tdh = null;
	private Double dg_max_tdh = null;
	private String dg_tdh_alert = null;
	private String dg_tdh_alert_sms = null;
	private String dg_tdh_alert_email = null;
	private Integer dg_tdh_cool_down = null;
	private Integer dg_tdh_alert_severity = null;
	private String dg_tdh_alert_clear_mode = null; //Auto,Manual
	private String customer_id = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_TYPE = "type";
	public static String FIELD_GRID_MIN_VOLTAGE = "grid_min_voltage";
	public static String FIELD_GRID_MX_VOLTAGE = "grid_mx_voltage";
	public static String FIELD_GRID_VOLTAGE_ALERT = "grid_voltage_alert";
	public static String FIELD_GRID_VOLTAGE_ALERT_SMS = "grid_voltage_alert_sms";
	public static String FIELD_GRID_VOLTAGE_ALERT_EMAIL = "grid_voltage_alert_email";
	public static String FIELD_GRID_VOLTAGE_ALERT_SEVERITY = "grid_voltage_alert_severity";
	public static String FIELD_GRID_VOLTAGE_ALERT_CLEAR_MODE = "grid_voltage_alert_clear_mode";
	public static String FIELD_GRID_VOLTAGE_COOL_DOWN = "grid_voltage_cool_down";
	public static String FIELD_GRID_MIN_CURRENT = "grid_min_current";
	public static String FIELD_GRID_MAX_CURRENT = "grid_max_current";
	public static String FIELD_GRID_CURRENT_ALERT = "grid_current_alert";
	public static String FIELD_GRID_CURRENT_ALERT_SMS = "grid_current_alert_sms";
	public static String FIELD_GRID_CURRENT_ALERT_EMAIL = "grid_current_alert_email";
	public static String FIELD_GRID_CURRENT_COOL_DOWN = "grid_current_cool_down";
	public static String FIELD_GRID_CURRENT_ALERT_SEVERITY = "grid_current_alert_severity";
	public static String FIELD_GRID_CURRENT_ALERT_CLEAR_MODE = "grid_current_alert_clear_mode";
	public static String FIELD_GRID_MIN_PF = "grid_min_pf";
	public static String FIELD_GRID_MAX_PF = "grid_max_pf";
	public static String FIELD_GRID_PF_ALERT = "grid_pf_alert";
	public static String FIELD_GRID_PF_ALERT_SMS = "grid_pf_alert_sms";
	public static String FIELD_GRID_PF_ALERT_EMAIL = "grid_pf_alert_email";
	public static String FIELD_GRID_PF_COOL_DOWN = "grid_pf_cool_down";
	public static String FIELD_GRID_PF_ALERT_SEVERITY = "grid_pf_alert_severity";
	public static String FIELD_GRID_PF_ALERT_CLEAR_MODE = "grid_pf_alert_clear_mode";
	public static String FIELD_GRID_MIN_MD = "grid_min_md";
	public static String FIELD_GRID_MAX_MD = "grid_max_md";
	public static String FIELD_GRID_MD_ALERT = "grid_md_alert";
	public static String FIELD_GRID_MD_ALERT_SMS = "grid_md_alert_sms";
	public static String FIELD_GRID_MD_ALERT_EMAIL = "grid_md_alert_email";
	public static String FIELD_GRID_MD_COOL_DOWN = "grid_md_cool_down";
	public static String FIELD_GRID_MD_ALERT_SEVERITY = "grid_md_alert_severity";
	public static String FIELD_GRID_MD_ALERT_CLEAR_MODE = "grid_md_alert_clear_mode";
	public static String FIELD_GRID_MIN_TDH = "grid_min_tdh";
	public static String FIELD_GRID_MAX_TDH = "grid_max_tdh";
	public static String FIELD_GRID_TDH_ALERT = "grid_tdh_alert";
	public static String FIELD_GRID_TDH_ALERT_SMS = "grid_tdh_alert_sms";
	public static String FIELD_GRID_TDH_ALERT_EMAIL = "grid_tdh_alert_email";
	public static String FIELD_GRID_TDH_COOL_DOWN = "grid_tdh_cool_down";
	public static String FIELD_GRID_TDH_ALERT_SEVERITY = "grid_tdh_alert_severity";
	public static String FIELD_GRID_TD_ALERT_CLEAR_MODE = "grid_td_alert_clear_mode";
	public static String FIELD_DG_MIN_VOLTAGE = "dg_min_voltage";
	public static String FIELD_DG_MX_VOLTAGE = "dg_mx_voltage";
	public static String FIELD_DG_VOLTAGE_ALERT = "dg_voltage_alert";
	public static String FIELD_DG_VOLTAGE_ALERT_SMS = "dg_voltage_alert_sms";
	public static String FIELD_DG_VOLTAGE_ALERT_EMAIL = "dg_voltage_alert_email";
	public static String FIELD_DG_VOLTAGE_COOL_DOWN = "dg_voltage_cool_down";
	public static String FIELD_DG_VOLTAGE_ALERT_SEVERITY = "dg_voltage_alert_severity";
	public static String FIELD_DG_VOLTAGE_ALERT_CLEAR_MODE = "dg_voltage_alert_clear_mode";
	public static String FIELD_DG_MIN_CURRENT = "dg_min_current";
	public static String FIELD_DG_MAX_CURRENT = "dg_max_current";
	public static String FIELD_DG_CURRENT_ALERT = "dg_current_alert";
	public static String FIELD_DG_CURRENT_ALERT_SMS = "dg_current_alert_sms";
	public static String FIELD_DG_CURRENT_ALERT_EMAIL = "dg_current_alert_email";
	public static String FIELD_DG_CURRENT_COOL_DOWN = "dg_current_cool_down";
	public static String FIELD_DG_CURRENT_ALERT_SEVERITY = "dg_current_alert_severity";
	public static String FIELD_DG_CURRENT_ALERT_CLEAR_MODE = "dg_current_alert_clear_mode";
	public static String FIELD_DG_MIN_PF = "dg_min_pf";
	public static String FIELD_DG_MAX_PF = "dg_max_pf";
	public static String FIELD_DG_PF_ALERT = "dg_pf_alert";
	public static String FIELD_DG_PF_ALERT_SMS = "dg_pf_alert_sms";
	public static String FIELD_DG_PF_ALERT_EMAIL = "dg_pf_alert_email";
	public static String FIELD_DG_PF_COOL_DOWN = "dg_pf_cool_down";
	public static String FIELD_DG_PF_ALERT_SEVERITY = "dg_pf_alert_severity";
	public static String FIELD_DG_PF_ALERT_CLEAR_MODE = "dg_pf_alert_clear_mode";
	public static String FIELD_DG_MIN_MD = "dg_min_md";
	public static String FIELD_DG_MAX_MD = "dg_max_md";
	public static String FIELD_DG_MD_ALERT = "dg_md_alert";
	public static String FIELD_DG_MD_ALERT_SMS = "dg_md_alert_sms";
	public static String FIELD_DG_MD_ALERT_EMAIL = "dg_md_alert_email";
	public static String FIELD_DG_MD_COOL_DOWN = "dg_md_cool_down";
	public static String FIELD_DG_MD_ALERT_SEVERITY = "dg_md_alert_severity";
	public static String FIELD_DG_MD_ALERT_CLEAR_MODE = "dg_md_alert_clear_mode";
	public static String FIELD_DG_MIN_TDH = "dg_min_tdh";
	public static String FIELD_DG_MAX_TDH = "dg_max_tdh";
	public static String FIELD_DG_TDH_ALERT = "dg_tdh_alert";
	public static String FIELD_DG_TDH_ALERT_SMS = "dg_tdh_alert_sms";
	public static String FIELD_DG_TDH_ALERT_EMAIL = "dg_tdh_alert_email";
	public static String FIELD_DG_TDH_COOL_DOWN = "dg_tdh_cool_down";
	public static String FIELD_DG_TDH_ALERT_SEVERITY = "dg_tdh_alert_severity";
	public static String FIELD_DG_TDH_ALERT_CLEAR_MODE = "dg_tdh_alert_clear_mode";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("appliance_threshold_templete");

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

		Field grid_min_voltageField = new Field("grid_min_voltage", "int");
		grid_min_voltageField.setDefaultValue(0);
		grid_min_voltageField.setLength(5);
		metaData.addField(grid_min_voltageField);

		Field grid_mx_voltageField = new Field("grid_mx_voltage", "int");
		grid_mx_voltageField.setDefaultValue(0);
		grid_mx_voltageField.setLength(5);
		metaData.addField(grid_mx_voltageField);

		Field grid_voltage_alertField = new Field("grid_voltage_alert", "String");
		grid_voltage_alertField.setDefaultValue("N");
		grid_voltage_alertField.setLength(1);
		metaData.addField(grid_voltage_alertField);

		Field grid_voltage_alert_smsField = new Field("grid_voltage_alert_sms", "String");
		grid_voltage_alert_smsField.setDefaultValue("N");
		grid_voltage_alert_smsField.setLength(1);
		metaData.addField(grid_voltage_alert_smsField);

		Field grid_voltage_alert_emailField = new Field("grid_voltage_alert_email", "String");
		grid_voltage_alert_emailField.setDefaultValue("N");
		grid_voltage_alert_emailField.setLength(1);
		metaData.addField(grid_voltage_alert_emailField);

		Field grid_voltage_alert_severityField = new Field("grid_voltage_alert_severity", "int");
		grid_voltage_alert_severityField.setDefaultValue(0);
		grid_voltage_alert_severityField.setLength(1);
		metaData.addField(grid_voltage_alert_severityField);

		Field grid_voltage_alert_clear_modeField = new Field("grid_voltage_alert_clear_mode", "String");
		grid_voltage_alert_clear_modeField.setDefaultValue("AUTO");
		grid_voltage_alert_clear_modeField.setLength(10);
		metaData.addField(grid_voltage_alert_clear_modeField);

		Field grid_voltage_cool_downField = new Field("grid_voltage_cool_down", "int");
		grid_voltage_cool_downField.setDefaultValue(0);
		grid_voltage_cool_downField.setLength(5);
		metaData.addField(grid_voltage_cool_downField);

		Field grid_min_currentField = new Field("grid_min_current", "int");
		grid_min_currentField.setDefaultValue(0);
		grid_min_currentField.setLength(5);
		metaData.addField(grid_min_currentField);

		Field grid_max_currentField = new Field("grid_max_current", "int");
		grid_max_currentField.setDefaultValue(0);
		grid_max_currentField.setLength(5);
		metaData.addField(grid_max_currentField);

		Field grid_current_alertField = new Field("grid_current_alert", "String");
		grid_current_alertField.setDefaultValue("N");
		grid_current_alertField.setLength(1);
		metaData.addField(grid_current_alertField);

		Field grid_current_alert_smsField = new Field("grid_current_alert_sms", "String");
		grid_current_alert_smsField.setDefaultValue("N");
		grid_current_alert_smsField.setLength(1);
		metaData.addField(grid_current_alert_smsField);

		Field grid_current_alert_emailField = new Field("grid_current_alert_email", "String");
		grid_current_alert_emailField.setDefaultValue("N");
		grid_current_alert_emailField.setLength(1);
		metaData.addField(grid_current_alert_emailField);

		Field grid_current_cool_downField = new Field("grid_current_cool_down", "int");
		grid_current_cool_downField.setDefaultValue(0);
		grid_current_cool_downField.setLength(5);
		metaData.addField(grid_current_cool_downField);

		Field grid_current_alert_severityField = new Field("grid_current_alert_severity", "int");
		grid_current_alert_severityField.setDefaultValue(0);
		grid_current_alert_severityField.setLength(1);
		metaData.addField(grid_current_alert_severityField);

		Field grid_current_alert_clear_modeField = new Field("grid_current_alert_clear_mode", "String");
		grid_current_alert_clear_modeField.setDefaultValue("AUTO");
		grid_current_alert_clear_modeField.setLength(10);
		metaData.addField(grid_current_alert_clear_modeField);

		Field grid_min_pfField = new Field("grid_min_pf", "double");
		grid_min_pfField.setDefaultValue(0.0000);
		grid_min_pfField.setLength(12);
		grid_min_pfField.setPrecision(4);
		metaData.addField(grid_min_pfField);

		Field grid_max_pfField = new Field("grid_max_pf", "double");
		grid_max_pfField.setDefaultValue(0.0000);
		grid_max_pfField.setLength(12);
		grid_max_pfField.setPrecision(4);
		metaData.addField(grid_max_pfField);

		Field grid_pf_alertField = new Field("grid_pf_alert", "String");
		grid_pf_alertField.setDefaultValue("N");
		grid_pf_alertField.setLength(1);
		metaData.addField(grid_pf_alertField);

		Field grid_pf_alert_smsField = new Field("grid_pf_alert_sms", "String");
		grid_pf_alert_smsField.setDefaultValue("N");
		grid_pf_alert_smsField.setLength(1);
		metaData.addField(grid_pf_alert_smsField);

		Field grid_pf_alert_emailField = new Field("grid_pf_alert_email", "String");
		grid_pf_alert_emailField.setDefaultValue("N");
		grid_pf_alert_emailField.setLength(1);
		metaData.addField(grid_pf_alert_emailField);

		Field grid_pf_cool_downField = new Field("grid_pf_cool_down", "int");
		grid_pf_cool_downField.setDefaultValue(0);
		grid_pf_cool_downField.setLength(5);
		metaData.addField(grid_pf_cool_downField);

		Field grid_pf_alert_severityField = new Field("grid_pf_alert_severity", "int");
		grid_pf_alert_severityField.setDefaultValue(0);
		grid_pf_alert_severityField.setLength(1);
		metaData.addField(grid_pf_alert_severityField);

		Field grid_pf_alert_clear_modeField = new Field("grid_pf_alert_clear_mode", "String");
		grid_pf_alert_clear_modeField.setDefaultValue("AUTO");
		grid_pf_alert_clear_modeField.setLength(10);
		metaData.addField(grid_pf_alert_clear_modeField);

		Field grid_min_mdField = new Field("grid_min_md", "double");
		grid_min_mdField.setDefaultValue(0.0000);
		grid_min_mdField.setLength(12);
		grid_min_mdField.setPrecision(4);
		metaData.addField(grid_min_mdField);

		Field grid_max_mdField = new Field("grid_max_md", "double");
		grid_max_mdField.setDefaultValue(0.0000);
		grid_max_mdField.setLength(12);
		grid_max_mdField.setPrecision(4);
		metaData.addField(grid_max_mdField);

		Field grid_md_alertField = new Field("grid_md_alert", "String");
		grid_md_alertField.setDefaultValue("N");
		grid_md_alertField.setLength(1);
		metaData.addField(grid_md_alertField);

		Field grid_md_alert_smsField = new Field("grid_md_alert_sms", "String");
		grid_md_alert_smsField.setDefaultValue("N");
		grid_md_alert_smsField.setLength(1);
		metaData.addField(grid_md_alert_smsField);

		Field grid_md_alert_emailField = new Field("grid_md_alert_email", "String");
		grid_md_alert_emailField.setDefaultValue("N");
		grid_md_alert_emailField.setLength(1);
		metaData.addField(grid_md_alert_emailField);

		Field grid_md_cool_downField = new Field("grid_md_cool_down", "int");
		grid_md_cool_downField.setDefaultValue(0);
		grid_md_cool_downField.setLength(5);
		metaData.addField(grid_md_cool_downField);

		Field grid_md_alert_severityField = new Field("grid_md_alert_severity", "int");
		grid_md_alert_severityField.setDefaultValue(0);
		grid_md_alert_severityField.setLength(1);
		metaData.addField(grid_md_alert_severityField);

		Field grid_md_alert_clear_modeField = new Field("grid_md_alert_clear_mode", "String");
		grid_md_alert_clear_modeField.setDefaultValue("AUTO");
		grid_md_alert_clear_modeField.setLength(10);
		metaData.addField(grid_md_alert_clear_modeField);

		Field grid_min_tdhField = new Field("grid_min_tdh", "double");
		grid_min_tdhField.setDefaultValue(0.0000);
		grid_min_tdhField.setLength(12);
		grid_min_tdhField.setPrecision(4);
		metaData.addField(grid_min_tdhField);

		Field grid_max_tdhField = new Field("grid_max_tdh", "double");
		grid_max_tdhField.setDefaultValue(0.0000);
		grid_max_tdhField.setLength(12);
		grid_max_tdhField.setPrecision(4);
		metaData.addField(grid_max_tdhField);

		Field grid_tdh_alertField = new Field("grid_tdh_alert", "String");
		grid_tdh_alertField.setDefaultValue("N");
		grid_tdh_alertField.setLength(1);
		metaData.addField(grid_tdh_alertField);

		Field grid_tdh_alert_smsField = new Field("grid_tdh_alert_sms", "String");
		grid_tdh_alert_smsField.setDefaultValue("N");
		grid_tdh_alert_smsField.setLength(1);
		metaData.addField(grid_tdh_alert_smsField);

		Field grid_tdh_alert_emailField = new Field("grid_tdh_alert_email", "String");
		grid_tdh_alert_emailField.setDefaultValue("N");
		grid_tdh_alert_emailField.setLength(1);
		metaData.addField(grid_tdh_alert_emailField);

		Field grid_tdh_cool_downField = new Field("grid_tdh_cool_down", "int");
		grid_tdh_cool_downField.setDefaultValue(0);
		grid_tdh_cool_downField.setLength(5);
		metaData.addField(grid_tdh_cool_downField);

		Field grid_tdh_alert_severityField = new Field("grid_tdh_alert_severity", "int");
		grid_tdh_alert_severityField.setDefaultValue(0);
		grid_tdh_alert_severityField.setLength(1);
		metaData.addField(grid_tdh_alert_severityField);

		Field grid_td_alert_clear_modeField = new Field("grid_td_alert_clear_mode", "String");
		grid_td_alert_clear_modeField.setDefaultValue("AUTO");
		grid_td_alert_clear_modeField.setLength(10);
		metaData.addField(grid_td_alert_clear_modeField);

		Field dg_min_voltageField = new Field("dg_min_voltage", "int");
		dg_min_voltageField.setDefaultValue(0);
		dg_min_voltageField.setLength(5);
		metaData.addField(dg_min_voltageField);

		Field dg_mx_voltageField = new Field("dg_mx_voltage", "int");
		dg_mx_voltageField.setDefaultValue(0);
		dg_mx_voltageField.setLength(5);
		metaData.addField(dg_mx_voltageField);

		Field dg_voltage_alertField = new Field("dg_voltage_alert", "String");
		dg_voltage_alertField.setDefaultValue("N");
		dg_voltage_alertField.setLength(1);
		metaData.addField(dg_voltage_alertField);

		Field dg_voltage_alert_smsField = new Field("dg_voltage_alert_sms", "String");
		dg_voltage_alert_smsField.setDefaultValue("N");
		dg_voltage_alert_smsField.setLength(1);
		metaData.addField(dg_voltage_alert_smsField);

		Field dg_voltage_alert_emailField = new Field("dg_voltage_alert_email", "String");
		dg_voltage_alert_emailField.setDefaultValue("N");
		dg_voltage_alert_emailField.setLength(1);
		metaData.addField(dg_voltage_alert_emailField);

		Field dg_voltage_cool_downField = new Field("dg_voltage_cool_down", "int");
		dg_voltage_cool_downField.setDefaultValue(0);
		dg_voltage_cool_downField.setLength(5);
		metaData.addField(dg_voltage_cool_downField);

		Field dg_voltage_alert_severityField = new Field("dg_voltage_alert_severity", "int");
		dg_voltage_alert_severityField.setDefaultValue(0);
		dg_voltage_alert_severityField.setLength(1);
		metaData.addField(dg_voltage_alert_severityField);

		Field dg_voltage_alert_clear_modeField = new Field("dg_voltage_alert_clear_mode", "String");
		dg_voltage_alert_clear_modeField.setDefaultValue("AUTO");
		dg_voltage_alert_clear_modeField.setLength(10);
		metaData.addField(dg_voltage_alert_clear_modeField);

		Field dg_min_currentField = new Field("dg_min_current", "int");
		dg_min_currentField.setDefaultValue(0);
		dg_min_currentField.setLength(5);
		metaData.addField(dg_min_currentField);

		Field dg_max_currentField = new Field("dg_max_current", "int");
		dg_max_currentField.setDefaultValue(0);
		dg_max_currentField.setLength(5);
		metaData.addField(dg_max_currentField);

		Field dg_current_alertField = new Field("dg_current_alert", "String");
		dg_current_alertField.setDefaultValue("N");
		dg_current_alertField.setLength(1);
		metaData.addField(dg_current_alertField);

		Field dg_current_alert_smsField = new Field("dg_current_alert_sms", "String");
		dg_current_alert_smsField.setDefaultValue("N");
		dg_current_alert_smsField.setLength(1);
		metaData.addField(dg_current_alert_smsField);

		Field dg_current_alert_emailField = new Field("dg_current_alert_email", "String");
		dg_current_alert_emailField.setDefaultValue("N");
		dg_current_alert_emailField.setLength(1);
		metaData.addField(dg_current_alert_emailField);

		Field dg_current_cool_downField = new Field("dg_current_cool_down", "int");
		dg_current_cool_downField.setDefaultValue(0);
		dg_current_cool_downField.setLength(5);
		metaData.addField(dg_current_cool_downField);

		Field dg_current_alert_severityField = new Field("dg_current_alert_severity", "int");
		dg_current_alert_severityField.setDefaultValue(0);
		dg_current_alert_severityField.setLength(1);
		metaData.addField(dg_current_alert_severityField);

		Field dg_current_alert_clear_modeField = new Field("dg_current_alert_clear_mode", "String");
		dg_current_alert_clear_modeField.setDefaultValue("AUTO");
		dg_current_alert_clear_modeField.setLength(10);
		metaData.addField(dg_current_alert_clear_modeField);

		Field dg_min_pfField = new Field("dg_min_pf", "double");
		dg_min_pfField.setDefaultValue(0.0000);
		dg_min_pfField.setLength(12);
		dg_min_pfField.setPrecision(4);
		metaData.addField(dg_min_pfField);

		Field dg_max_pfField = new Field("dg_max_pf", "double");
		dg_max_pfField.setDefaultValue(0.0000);
		dg_max_pfField.setLength(12);
		dg_max_pfField.setPrecision(4);
		metaData.addField(dg_max_pfField);

		Field dg_pf_alertField = new Field("dg_pf_alert", "String");
		dg_pf_alertField.setDefaultValue("N");
		dg_pf_alertField.setLength(1);
		metaData.addField(dg_pf_alertField);

		Field dg_pf_alert_smsField = new Field("dg_pf_alert_sms", "String");
		dg_pf_alert_smsField.setDefaultValue("N");
		dg_pf_alert_smsField.setLength(1);
		metaData.addField(dg_pf_alert_smsField);

		Field dg_pf_alert_emailField = new Field("dg_pf_alert_email", "String");
		dg_pf_alert_emailField.setDefaultValue("N");
		dg_pf_alert_emailField.setLength(1);
		metaData.addField(dg_pf_alert_emailField);

		Field dg_pf_cool_downField = new Field("dg_pf_cool_down", "int");
		dg_pf_cool_downField.setDefaultValue(0);
		dg_pf_cool_downField.setLength(5);
		metaData.addField(dg_pf_cool_downField);

		Field dg_pf_alert_severityField = new Field("dg_pf_alert_severity", "int");
		dg_pf_alert_severityField.setDefaultValue(0);
		dg_pf_alert_severityField.setLength(1);
		metaData.addField(dg_pf_alert_severityField);

		Field dg_pf_alert_clear_modeField = new Field("dg_pf_alert_clear_mode", "String");
		dg_pf_alert_clear_modeField.setDefaultValue("AUTO");
		dg_pf_alert_clear_modeField.setLength(10);
		metaData.addField(dg_pf_alert_clear_modeField);

		Field dg_min_mdField = new Field("dg_min_md", "double");
		dg_min_mdField.setDefaultValue(0.0000);
		dg_min_mdField.setLength(12);
		dg_min_mdField.setPrecision(4);
		metaData.addField(dg_min_mdField);

		Field dg_max_mdField = new Field("dg_max_md", "double");
		dg_max_mdField.setDefaultValue(0.0000);
		dg_max_mdField.setLength(12);
		dg_max_mdField.setPrecision(4);
		metaData.addField(dg_max_mdField);

		Field dg_md_alertField = new Field("dg_md_alert", "String");
		dg_md_alertField.setDefaultValue("N");
		dg_md_alertField.setLength(1);
		metaData.addField(dg_md_alertField);

		Field dg_md_alert_smsField = new Field("dg_md_alert_sms", "String");
		dg_md_alert_smsField.setDefaultValue("N");
		dg_md_alert_smsField.setLength(1);
		metaData.addField(dg_md_alert_smsField);

		Field dg_md_alert_emailField = new Field("dg_md_alert_email", "String");
		dg_md_alert_emailField.setDefaultValue("N");
		dg_md_alert_emailField.setLength(1);
		metaData.addField(dg_md_alert_emailField);

		Field dg_md_cool_downField = new Field("dg_md_cool_down", "int");
		dg_md_cool_downField.setDefaultValue(0);
		dg_md_cool_downField.setLength(5);
		metaData.addField(dg_md_cool_downField);

		Field dg_md_alert_severityField = new Field("dg_md_alert_severity", "int");
		dg_md_alert_severityField.setDefaultValue(0);
		dg_md_alert_severityField.setLength(1);
		metaData.addField(dg_md_alert_severityField);

		Field dg_md_alert_clear_modeField = new Field("dg_md_alert_clear_mode", "String");
		dg_md_alert_clear_modeField.setDefaultValue("AUTO");
		dg_md_alert_clear_modeField.setLength(10);
		metaData.addField(dg_md_alert_clear_modeField);

		Field dg_min_tdhField = new Field("dg_min_tdh", "double");
		dg_min_tdhField.setDefaultValue(0.0000);
		dg_min_tdhField.setLength(12);
		dg_min_tdhField.setPrecision(4);
		metaData.addField(dg_min_tdhField);

		Field dg_max_tdhField = new Field("dg_max_tdh", "double");
		dg_max_tdhField.setDefaultValue(0.0000);
		dg_max_tdhField.setLength(12);
		dg_max_tdhField.setPrecision(4);
		metaData.addField(dg_max_tdhField);

		Field dg_tdh_alertField = new Field("dg_tdh_alert", "String");
		dg_tdh_alertField.setDefaultValue("N");
		dg_tdh_alertField.setLength(1);
		metaData.addField(dg_tdh_alertField);

		Field dg_tdh_alert_smsField = new Field("dg_tdh_alert_sms", "String");
		dg_tdh_alert_smsField.setDefaultValue("N");
		dg_tdh_alert_smsField.setLength(1);
		metaData.addField(dg_tdh_alert_smsField);

		Field dg_tdh_alert_emailField = new Field("dg_tdh_alert_email", "String");
		dg_tdh_alert_emailField.setDefaultValue("N");
		dg_tdh_alert_emailField.setLength(1);
		metaData.addField(dg_tdh_alert_emailField);

		Field dg_tdh_cool_downField = new Field("dg_tdh_cool_down", "int");
		dg_tdh_cool_downField.setDefaultValue(0);
		dg_tdh_cool_downField.setLength(5);
		metaData.addField(dg_tdh_cool_downField);

		Field dg_tdh_alert_severityField = new Field("dg_tdh_alert_severity", "int");
		dg_tdh_alert_severityField.setDefaultValue(0);
		dg_tdh_alert_severityField.setLength(1);
		metaData.addField(dg_tdh_alert_severityField);

		Field dg_tdh_alert_clear_modeField = new Field("dg_tdh_alert_clear_mode", "String");
		dg_tdh_alert_clear_modeField.setDefaultValue("AUTO");
		dg_tdh_alert_clear_modeField.setLength(10);
		metaData.addField(dg_tdh_alert_clear_modeField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setDefaultValue("N");
		customer_idField.setLength(1);
		metaData.addField(customer_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("appliance_threshold_templete");

		metaData.setCluster("DB_DEVICE");
	}

	public Baseappliance_threshold_templete() {}

	public Baseappliance_threshold_templete(Baseappliance_threshold_templete obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.type = obj.type;
		this.grid_min_voltage = obj.grid_min_voltage;
		this.grid_mx_voltage = obj.grid_mx_voltage;
		this.grid_voltage_alert = obj.grid_voltage_alert;
		this.grid_voltage_alert_sms = obj.grid_voltage_alert_sms;
		this.grid_voltage_alert_email = obj.grid_voltage_alert_email;
		this.grid_voltage_alert_severity = obj.grid_voltage_alert_severity;
		this.grid_voltage_alert_clear_mode = obj.grid_voltage_alert_clear_mode;
		this.grid_voltage_cool_down = obj.grid_voltage_cool_down;
		this.grid_min_current = obj.grid_min_current;
		this.grid_max_current = obj.grid_max_current;
		this.grid_current_alert = obj.grid_current_alert;
		this.grid_current_alert_sms = obj.grid_current_alert_sms;
		this.grid_current_alert_email = obj.grid_current_alert_email;
		this.grid_current_cool_down = obj.grid_current_cool_down;
		this.grid_current_alert_severity = obj.grid_current_alert_severity;
		this.grid_current_alert_clear_mode = obj.grid_current_alert_clear_mode;
		this.grid_min_pf = obj.grid_min_pf;
		this.grid_max_pf = obj.grid_max_pf;
		this.grid_pf_alert = obj.grid_pf_alert;
		this.grid_pf_alert_sms = obj.grid_pf_alert_sms;
		this.grid_pf_alert_email = obj.grid_pf_alert_email;
		this.grid_pf_cool_down = obj.grid_pf_cool_down;
		this.grid_pf_alert_severity = obj.grid_pf_alert_severity;
		this.grid_pf_alert_clear_mode = obj.grid_pf_alert_clear_mode;
		this.grid_min_md = obj.grid_min_md;
		this.grid_max_md = obj.grid_max_md;
		this.grid_md_alert = obj.grid_md_alert;
		this.grid_md_alert_sms = obj.grid_md_alert_sms;
		this.grid_md_alert_email = obj.grid_md_alert_email;
		this.grid_md_cool_down = obj.grid_md_cool_down;
		this.grid_md_alert_severity = obj.grid_md_alert_severity;
		this.grid_md_alert_clear_mode = obj.grid_md_alert_clear_mode;
		this.grid_min_tdh = obj.grid_min_tdh;
		this.grid_max_tdh = obj.grid_max_tdh;
		this.grid_tdh_alert = obj.grid_tdh_alert;
		this.grid_tdh_alert_sms = obj.grid_tdh_alert_sms;
		this.grid_tdh_alert_email = obj.grid_tdh_alert_email;
		this.grid_tdh_cool_down = obj.grid_tdh_cool_down;
		this.grid_tdh_alert_severity = obj.grid_tdh_alert_severity;
		this.grid_td_alert_clear_mode = obj.grid_td_alert_clear_mode;
		this.dg_min_voltage = obj.dg_min_voltage;
		this.dg_mx_voltage = obj.dg_mx_voltage;
		this.dg_voltage_alert = obj.dg_voltage_alert;
		this.dg_voltage_alert_sms = obj.dg_voltage_alert_sms;
		this.dg_voltage_alert_email = obj.dg_voltage_alert_email;
		this.dg_voltage_cool_down = obj.dg_voltage_cool_down;
		this.dg_voltage_alert_severity = obj.dg_voltage_alert_severity;
		this.dg_voltage_alert_clear_mode = obj.dg_voltage_alert_clear_mode;
		this.dg_min_current = obj.dg_min_current;
		this.dg_max_current = obj.dg_max_current;
		this.dg_current_alert = obj.dg_current_alert;
		this.dg_current_alert_sms = obj.dg_current_alert_sms;
		this.dg_current_alert_email = obj.dg_current_alert_email;
		this.dg_current_cool_down = obj.dg_current_cool_down;
		this.dg_current_alert_severity = obj.dg_current_alert_severity;
		this.dg_current_alert_clear_mode = obj.dg_current_alert_clear_mode;
		this.dg_min_pf = obj.dg_min_pf;
		this.dg_max_pf = obj.dg_max_pf;
		this.dg_pf_alert = obj.dg_pf_alert;
		this.dg_pf_alert_sms = obj.dg_pf_alert_sms;
		this.dg_pf_alert_email = obj.dg_pf_alert_email;
		this.dg_pf_cool_down = obj.dg_pf_cool_down;
		this.dg_pf_alert_severity = obj.dg_pf_alert_severity;
		this.dg_pf_alert_clear_mode = obj.dg_pf_alert_clear_mode;
		this.dg_min_md = obj.dg_min_md;
		this.dg_max_md = obj.dg_max_md;
		this.dg_md_alert = obj.dg_md_alert;
		this.dg_md_alert_sms = obj.dg_md_alert_sms;
		this.dg_md_alert_email = obj.dg_md_alert_email;
		this.dg_md_cool_down = obj.dg_md_cool_down;
		this.dg_md_alert_severity = obj.dg_md_alert_severity;
		this.dg_md_alert_clear_mode = obj.dg_md_alert_clear_mode;
		this.dg_min_tdh = obj.dg_min_tdh;
		this.dg_max_tdh = obj.dg_max_tdh;
		this.dg_tdh_alert = obj.dg_tdh_alert;
		this.dg_tdh_alert_sms = obj.dg_tdh_alert_sms;
		this.dg_tdh_alert_email = obj.dg_tdh_alert_email;
		this.dg_tdh_cool_down = obj.dg_tdh_cool_down;
		this.dg_tdh_alert_severity = obj.dg_tdh_alert_severity;
		this.dg_tdh_alert_clear_mode = obj.dg_tdh_alert_clear_mode;
		this.customer_id = obj.customer_id;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(grid_min_voltage == null)
			grid_min_voltage = 0;
		if(grid_mx_voltage == null)
			grid_mx_voltage = 0;
		if(grid_voltage_alert == null)
			grid_voltage_alert = "N";
		if(grid_voltage_alert_sms == null)
			grid_voltage_alert_sms = "N";
		if(grid_voltage_alert_email == null)
			grid_voltage_alert_email = "N";
		if(grid_voltage_alert_severity == null)
			grid_voltage_alert_severity = 0;
		if(grid_voltage_alert_clear_mode == null)
			grid_voltage_alert_clear_mode = "AUTO";
		if(grid_voltage_cool_down == null)
			grid_voltage_cool_down = 0;
		if(grid_min_current == null)
			grid_min_current = 0;
		if(grid_max_current == null)
			grid_max_current = 0;
		if(grid_current_alert == null)
			grid_current_alert = "N";
		if(grid_current_alert_sms == null)
			grid_current_alert_sms = "N";
		if(grid_current_alert_email == null)
			grid_current_alert_email = "N";
		if(grid_current_cool_down == null)
			grid_current_cool_down = 0;
		if(grid_current_alert_severity == null)
			grid_current_alert_severity = 0;
		if(grid_current_alert_clear_mode == null)
			grid_current_alert_clear_mode = "AUTO";
		if(grid_min_pf == null)
			grid_min_pf = 0.0000;
		if(grid_max_pf == null)
			grid_max_pf = 0.0000;
		if(grid_pf_alert == null)
			grid_pf_alert = "N";
		if(grid_pf_alert_sms == null)
			grid_pf_alert_sms = "N";
		if(grid_pf_alert_email == null)
			grid_pf_alert_email = "N";
		if(grid_pf_cool_down == null)
			grid_pf_cool_down = 0;
		if(grid_pf_alert_severity == null)
			grid_pf_alert_severity = 0;
		if(grid_pf_alert_clear_mode == null)
			grid_pf_alert_clear_mode = "AUTO";
		if(grid_min_md == null)
			grid_min_md = 0.0000;
		if(grid_max_md == null)
			grid_max_md = 0.0000;
		if(grid_md_alert == null)
			grid_md_alert = "N";
		if(grid_md_alert_sms == null)
			grid_md_alert_sms = "N";
		if(grid_md_alert_email == null)
			grid_md_alert_email = "N";
		if(grid_md_cool_down == null)
			grid_md_cool_down = 0;
		if(grid_md_alert_severity == null)
			grid_md_alert_severity = 0;
		if(grid_md_alert_clear_mode == null)
			grid_md_alert_clear_mode = "AUTO";
		if(grid_min_tdh == null)
			grid_min_tdh = 0.0000;
		if(grid_max_tdh == null)
			grid_max_tdh = 0.0000;
		if(grid_tdh_alert == null)
			grid_tdh_alert = "N";
		if(grid_tdh_alert_sms == null)
			grid_tdh_alert_sms = "N";
		if(grid_tdh_alert_email == null)
			grid_tdh_alert_email = "N";
		if(grid_tdh_cool_down == null)
			grid_tdh_cool_down = 0;
		if(grid_tdh_alert_severity == null)
			grid_tdh_alert_severity = 0;
		if(grid_td_alert_clear_mode == null)
			grid_td_alert_clear_mode = "AUTO";
		if(dg_min_voltage == null)
			dg_min_voltage = 0;
		if(dg_mx_voltage == null)
			dg_mx_voltage = 0;
		if(dg_voltage_alert == null)
			dg_voltage_alert = "N";
		if(dg_voltage_alert_sms == null)
			dg_voltage_alert_sms = "N";
		if(dg_voltage_alert_email == null)
			dg_voltage_alert_email = "N";
		if(dg_voltage_cool_down == null)
			dg_voltage_cool_down = 0;
		if(dg_voltage_alert_severity == null)
			dg_voltage_alert_severity = 0;
		if(dg_voltage_alert_clear_mode == null)
			dg_voltage_alert_clear_mode = "AUTO";
		if(dg_min_current == null)
			dg_min_current = 0;
		if(dg_max_current == null)
			dg_max_current = 0;
		if(dg_current_alert == null)
			dg_current_alert = "N";
		if(dg_current_alert_sms == null)
			dg_current_alert_sms = "N";
		if(dg_current_alert_email == null)
			dg_current_alert_email = "N";
		if(dg_current_cool_down == null)
			dg_current_cool_down = 0;
		if(dg_current_alert_severity == null)
			dg_current_alert_severity = 0;
		if(dg_current_alert_clear_mode == null)
			dg_current_alert_clear_mode = "AUTO";
		if(dg_min_pf == null)
			dg_min_pf = 0.0000;
		if(dg_max_pf == null)
			dg_max_pf = 0.0000;
		if(dg_pf_alert == null)
			dg_pf_alert = "N";
		if(dg_pf_alert_sms == null)
			dg_pf_alert_sms = "N";
		if(dg_pf_alert_email == null)
			dg_pf_alert_email = "N";
		if(dg_pf_cool_down == null)
			dg_pf_cool_down = 0;
		if(dg_pf_alert_severity == null)
			dg_pf_alert_severity = 0;
		if(dg_pf_alert_clear_mode == null)
			dg_pf_alert_clear_mode = "AUTO";
		if(dg_min_md == null)
			dg_min_md = 0.0000;
		if(dg_max_md == null)
			dg_max_md = 0.0000;
		if(dg_md_alert == null)
			dg_md_alert = "N";
		if(dg_md_alert_sms == null)
			dg_md_alert_sms = "N";
		if(dg_md_alert_email == null)
			dg_md_alert_email = "N";
		if(dg_md_cool_down == null)
			dg_md_cool_down = 0;
		if(dg_md_alert_severity == null)
			dg_md_alert_severity = 0;
		if(dg_md_alert_clear_mode == null)
			dg_md_alert_clear_mode = "AUTO";
		if(dg_min_tdh == null)
			dg_min_tdh = 0.0000;
		if(dg_max_tdh == null)
			dg_max_tdh = 0.0000;
		if(dg_tdh_alert == null)
			dg_tdh_alert = "N";
		if(dg_tdh_alert_sms == null)
			dg_tdh_alert_sms = "N";
		if(dg_tdh_alert_email == null)
			dg_tdh_alert_email = "N";
		if(dg_tdh_cool_down == null)
			dg_tdh_cool_down = 0;
		if(dg_tdh_alert_severity == null)
			dg_tdh_alert_severity = 0;
		if(dg_tdh_alert_clear_mode == null)
			dg_tdh_alert_clear_mode = "AUTO";
		if(customer_id == null)
			customer_id = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(type != null)
			map.put("type", type);
		if(grid_min_voltage != null)
			map.put("grid_min_voltage", grid_min_voltage);
		if(grid_mx_voltage != null)
			map.put("grid_mx_voltage", grid_mx_voltage);
		if(grid_voltage_alert != null)
			map.put("grid_voltage_alert", grid_voltage_alert);
		if(grid_voltage_alert_sms != null)
			map.put("grid_voltage_alert_sms", grid_voltage_alert_sms);
		if(grid_voltage_alert_email != null)
			map.put("grid_voltage_alert_email", grid_voltage_alert_email);
		if(grid_voltage_alert_severity != null)
			map.put("grid_voltage_alert_severity", grid_voltage_alert_severity);
		if(grid_voltage_alert_clear_mode != null)
			map.put("grid_voltage_alert_clear_mode", grid_voltage_alert_clear_mode);
		if(grid_voltage_cool_down != null)
			map.put("grid_voltage_cool_down", grid_voltage_cool_down);
		if(grid_min_current != null)
			map.put("grid_min_current", grid_min_current);
		if(grid_max_current != null)
			map.put("grid_max_current", grid_max_current);
		if(grid_current_alert != null)
			map.put("grid_current_alert", grid_current_alert);
		if(grid_current_alert_sms != null)
			map.put("grid_current_alert_sms", grid_current_alert_sms);
		if(grid_current_alert_email != null)
			map.put("grid_current_alert_email", grid_current_alert_email);
		if(grid_current_cool_down != null)
			map.put("grid_current_cool_down", grid_current_cool_down);
		if(grid_current_alert_severity != null)
			map.put("grid_current_alert_severity", grid_current_alert_severity);
		if(grid_current_alert_clear_mode != null)
			map.put("grid_current_alert_clear_mode", grid_current_alert_clear_mode);
		if(grid_min_pf != null)
			map.put("grid_min_pf", grid_min_pf);
		if(grid_max_pf != null)
			map.put("grid_max_pf", grid_max_pf);
		if(grid_pf_alert != null)
			map.put("grid_pf_alert", grid_pf_alert);
		if(grid_pf_alert_sms != null)
			map.put("grid_pf_alert_sms", grid_pf_alert_sms);
		if(grid_pf_alert_email != null)
			map.put("grid_pf_alert_email", grid_pf_alert_email);
		if(grid_pf_cool_down != null)
			map.put("grid_pf_cool_down", grid_pf_cool_down);
		if(grid_pf_alert_severity != null)
			map.put("grid_pf_alert_severity", grid_pf_alert_severity);
		if(grid_pf_alert_clear_mode != null)
			map.put("grid_pf_alert_clear_mode", grid_pf_alert_clear_mode);
		if(grid_min_md != null)
			map.put("grid_min_md", grid_min_md);
		if(grid_max_md != null)
			map.put("grid_max_md", grid_max_md);
		if(grid_md_alert != null)
			map.put("grid_md_alert", grid_md_alert);
		if(grid_md_alert_sms != null)
			map.put("grid_md_alert_sms", grid_md_alert_sms);
		if(grid_md_alert_email != null)
			map.put("grid_md_alert_email", grid_md_alert_email);
		if(grid_md_cool_down != null)
			map.put("grid_md_cool_down", grid_md_cool_down);
		if(grid_md_alert_severity != null)
			map.put("grid_md_alert_severity", grid_md_alert_severity);
		if(grid_md_alert_clear_mode != null)
			map.put("grid_md_alert_clear_mode", grid_md_alert_clear_mode);
		if(grid_min_tdh != null)
			map.put("grid_min_tdh", grid_min_tdh);
		if(grid_max_tdh != null)
			map.put("grid_max_tdh", grid_max_tdh);
		if(grid_tdh_alert != null)
			map.put("grid_tdh_alert", grid_tdh_alert);
		if(grid_tdh_alert_sms != null)
			map.put("grid_tdh_alert_sms", grid_tdh_alert_sms);
		if(grid_tdh_alert_email != null)
			map.put("grid_tdh_alert_email", grid_tdh_alert_email);
		if(grid_tdh_cool_down != null)
			map.put("grid_tdh_cool_down", grid_tdh_cool_down);
		if(grid_tdh_alert_severity != null)
			map.put("grid_tdh_alert_severity", grid_tdh_alert_severity);
		if(grid_td_alert_clear_mode != null)
			map.put("grid_td_alert_clear_mode", grid_td_alert_clear_mode);
		if(dg_min_voltage != null)
			map.put("dg_min_voltage", dg_min_voltage);
		if(dg_mx_voltage != null)
			map.put("dg_mx_voltage", dg_mx_voltage);
		if(dg_voltage_alert != null)
			map.put("dg_voltage_alert", dg_voltage_alert);
		if(dg_voltage_alert_sms != null)
			map.put("dg_voltage_alert_sms", dg_voltage_alert_sms);
		if(dg_voltage_alert_email != null)
			map.put("dg_voltage_alert_email", dg_voltage_alert_email);
		if(dg_voltage_cool_down != null)
			map.put("dg_voltage_cool_down", dg_voltage_cool_down);
		if(dg_voltage_alert_severity != null)
			map.put("dg_voltage_alert_severity", dg_voltage_alert_severity);
		if(dg_voltage_alert_clear_mode != null)
			map.put("dg_voltage_alert_clear_mode", dg_voltage_alert_clear_mode);
		if(dg_min_current != null)
			map.put("dg_min_current", dg_min_current);
		if(dg_max_current != null)
			map.put("dg_max_current", dg_max_current);
		if(dg_current_alert != null)
			map.put("dg_current_alert", dg_current_alert);
		if(dg_current_alert_sms != null)
			map.put("dg_current_alert_sms", dg_current_alert_sms);
		if(dg_current_alert_email != null)
			map.put("dg_current_alert_email", dg_current_alert_email);
		if(dg_current_cool_down != null)
			map.put("dg_current_cool_down", dg_current_cool_down);
		if(dg_current_alert_severity != null)
			map.put("dg_current_alert_severity", dg_current_alert_severity);
		if(dg_current_alert_clear_mode != null)
			map.put("dg_current_alert_clear_mode", dg_current_alert_clear_mode);
		if(dg_min_pf != null)
			map.put("dg_min_pf", dg_min_pf);
		if(dg_max_pf != null)
			map.put("dg_max_pf", dg_max_pf);
		if(dg_pf_alert != null)
			map.put("dg_pf_alert", dg_pf_alert);
		if(dg_pf_alert_sms != null)
			map.put("dg_pf_alert_sms", dg_pf_alert_sms);
		if(dg_pf_alert_email != null)
			map.put("dg_pf_alert_email", dg_pf_alert_email);
		if(dg_pf_cool_down != null)
			map.put("dg_pf_cool_down", dg_pf_cool_down);
		if(dg_pf_alert_severity != null)
			map.put("dg_pf_alert_severity", dg_pf_alert_severity);
		if(dg_pf_alert_clear_mode != null)
			map.put("dg_pf_alert_clear_mode", dg_pf_alert_clear_mode);
		if(dg_min_md != null)
			map.put("dg_min_md", dg_min_md);
		if(dg_max_md != null)
			map.put("dg_max_md", dg_max_md);
		if(dg_md_alert != null)
			map.put("dg_md_alert", dg_md_alert);
		if(dg_md_alert_sms != null)
			map.put("dg_md_alert_sms", dg_md_alert_sms);
		if(dg_md_alert_email != null)
			map.put("dg_md_alert_email", dg_md_alert_email);
		if(dg_md_cool_down != null)
			map.put("dg_md_cool_down", dg_md_cool_down);
		if(dg_md_alert_severity != null)
			map.put("dg_md_alert_severity", dg_md_alert_severity);
		if(dg_md_alert_clear_mode != null)
			map.put("dg_md_alert_clear_mode", dg_md_alert_clear_mode);
		if(dg_min_tdh != null)
			map.put("dg_min_tdh", dg_min_tdh);
		if(dg_max_tdh != null)
			map.put("dg_max_tdh", dg_max_tdh);
		if(dg_tdh_alert != null)
			map.put("dg_tdh_alert", dg_tdh_alert);
		if(dg_tdh_alert_sms != null)
			map.put("dg_tdh_alert_sms", dg_tdh_alert_sms);
		if(dg_tdh_alert_email != null)
			map.put("dg_tdh_alert_email", dg_tdh_alert_email);
		if(dg_tdh_cool_down != null)
			map.put("dg_tdh_cool_down", dg_tdh_cool_down);
		if(dg_tdh_alert_severity != null)
			map.put("dg_tdh_alert_severity", dg_tdh_alert_severity);
		if(dg_tdh_alert_clear_mode != null)
			map.put("dg_tdh_alert_clear_mode", dg_tdh_alert_clear_mode);
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
		if(grid_min_voltage != null)
			map.put("grid_min_voltage", grid_min_voltage);
		if(grid_mx_voltage != null)
			map.put("grid_mx_voltage", grid_mx_voltage);
		if(grid_voltage_alert != null)
			map.put("grid_voltage_alert", grid_voltage_alert);
		if(grid_voltage_alert_sms != null)
			map.put("grid_voltage_alert_sms", grid_voltage_alert_sms);
		if(grid_voltage_alert_email != null)
			map.put("grid_voltage_alert_email", grid_voltage_alert_email);
		if(grid_voltage_alert_severity != null)
			map.put("grid_voltage_alert_severity", grid_voltage_alert_severity);
		if(grid_voltage_alert_clear_mode != null)
			map.put("grid_voltage_alert_clear_mode", grid_voltage_alert_clear_mode);
		if(grid_voltage_cool_down != null)
			map.put("grid_voltage_cool_down", grid_voltage_cool_down);
		if(grid_min_current != null)
			map.put("grid_min_current", grid_min_current);
		if(grid_max_current != null)
			map.put("grid_max_current", grid_max_current);
		if(grid_current_alert != null)
			map.put("grid_current_alert", grid_current_alert);
		if(grid_current_alert_sms != null)
			map.put("grid_current_alert_sms", grid_current_alert_sms);
		if(grid_current_alert_email != null)
			map.put("grid_current_alert_email", grid_current_alert_email);
		if(grid_current_cool_down != null)
			map.put("grid_current_cool_down", grid_current_cool_down);
		if(grid_current_alert_severity != null)
			map.put("grid_current_alert_severity", grid_current_alert_severity);
		if(grid_current_alert_clear_mode != null)
			map.put("grid_current_alert_clear_mode", grid_current_alert_clear_mode);
		if(grid_min_pf != null)
			map.put("grid_min_pf", grid_min_pf);
		if(grid_max_pf != null)
			map.put("grid_max_pf", grid_max_pf);
		if(grid_pf_alert != null)
			map.put("grid_pf_alert", grid_pf_alert);
		if(grid_pf_alert_sms != null)
			map.put("grid_pf_alert_sms", grid_pf_alert_sms);
		if(grid_pf_alert_email != null)
			map.put("grid_pf_alert_email", grid_pf_alert_email);
		if(grid_pf_cool_down != null)
			map.put("grid_pf_cool_down", grid_pf_cool_down);
		if(grid_pf_alert_severity != null)
			map.put("grid_pf_alert_severity", grid_pf_alert_severity);
		if(grid_pf_alert_clear_mode != null)
			map.put("grid_pf_alert_clear_mode", grid_pf_alert_clear_mode);
		if(grid_min_md != null)
			map.put("grid_min_md", grid_min_md);
		if(grid_max_md != null)
			map.put("grid_max_md", grid_max_md);
		if(grid_md_alert != null)
			map.put("grid_md_alert", grid_md_alert);
		if(grid_md_alert_sms != null)
			map.put("grid_md_alert_sms", grid_md_alert_sms);
		if(grid_md_alert_email != null)
			map.put("grid_md_alert_email", grid_md_alert_email);
		if(grid_md_cool_down != null)
			map.put("grid_md_cool_down", grid_md_cool_down);
		if(grid_md_alert_severity != null)
			map.put("grid_md_alert_severity", grid_md_alert_severity);
		if(grid_md_alert_clear_mode != null)
			map.put("grid_md_alert_clear_mode", grid_md_alert_clear_mode);
		if(grid_min_tdh != null)
			map.put("grid_min_tdh", grid_min_tdh);
		if(grid_max_tdh != null)
			map.put("grid_max_tdh", grid_max_tdh);
		if(grid_tdh_alert != null)
			map.put("grid_tdh_alert", grid_tdh_alert);
		if(grid_tdh_alert_sms != null)
			map.put("grid_tdh_alert_sms", grid_tdh_alert_sms);
		if(grid_tdh_alert_email != null)
			map.put("grid_tdh_alert_email", grid_tdh_alert_email);
		if(grid_tdh_cool_down != null)
			map.put("grid_tdh_cool_down", grid_tdh_cool_down);
		if(grid_tdh_alert_severity != null)
			map.put("grid_tdh_alert_severity", grid_tdh_alert_severity);
		if(grid_td_alert_clear_mode != null)
			map.put("grid_td_alert_clear_mode", grid_td_alert_clear_mode);
		if(dg_min_voltage != null)
			map.put("dg_min_voltage", dg_min_voltage);
		if(dg_mx_voltage != null)
			map.put("dg_mx_voltage", dg_mx_voltage);
		if(dg_voltage_alert != null)
			map.put("dg_voltage_alert", dg_voltage_alert);
		if(dg_voltage_alert_sms != null)
			map.put("dg_voltage_alert_sms", dg_voltage_alert_sms);
		if(dg_voltage_alert_email != null)
			map.put("dg_voltage_alert_email", dg_voltage_alert_email);
		if(dg_voltage_cool_down != null)
			map.put("dg_voltage_cool_down", dg_voltage_cool_down);
		if(dg_voltage_alert_severity != null)
			map.put("dg_voltage_alert_severity", dg_voltage_alert_severity);
		if(dg_voltage_alert_clear_mode != null)
			map.put("dg_voltage_alert_clear_mode", dg_voltage_alert_clear_mode);
		if(dg_min_current != null)
			map.put("dg_min_current", dg_min_current);
		if(dg_max_current != null)
			map.put("dg_max_current", dg_max_current);
		if(dg_current_alert != null)
			map.put("dg_current_alert", dg_current_alert);
		if(dg_current_alert_sms != null)
			map.put("dg_current_alert_sms", dg_current_alert_sms);
		if(dg_current_alert_email != null)
			map.put("dg_current_alert_email", dg_current_alert_email);
		if(dg_current_cool_down != null)
			map.put("dg_current_cool_down", dg_current_cool_down);
		if(dg_current_alert_severity != null)
			map.put("dg_current_alert_severity", dg_current_alert_severity);
		if(dg_current_alert_clear_mode != null)
			map.put("dg_current_alert_clear_mode", dg_current_alert_clear_mode);
		if(dg_min_pf != null)
			map.put("dg_min_pf", dg_min_pf);
		if(dg_max_pf != null)
			map.put("dg_max_pf", dg_max_pf);
		if(dg_pf_alert != null)
			map.put("dg_pf_alert", dg_pf_alert);
		if(dg_pf_alert_sms != null)
			map.put("dg_pf_alert_sms", dg_pf_alert_sms);
		if(dg_pf_alert_email != null)
			map.put("dg_pf_alert_email", dg_pf_alert_email);
		if(dg_pf_cool_down != null)
			map.put("dg_pf_cool_down", dg_pf_cool_down);
		if(dg_pf_alert_severity != null)
			map.put("dg_pf_alert_severity", dg_pf_alert_severity);
		if(dg_pf_alert_clear_mode != null)
			map.put("dg_pf_alert_clear_mode", dg_pf_alert_clear_mode);
		if(dg_min_md != null)
			map.put("dg_min_md", dg_min_md);
		if(dg_max_md != null)
			map.put("dg_max_md", dg_max_md);
		if(dg_md_alert != null)
			map.put("dg_md_alert", dg_md_alert);
		if(dg_md_alert_sms != null)
			map.put("dg_md_alert_sms", dg_md_alert_sms);
		if(dg_md_alert_email != null)
			map.put("dg_md_alert_email", dg_md_alert_email);
		if(dg_md_cool_down != null)
			map.put("dg_md_cool_down", dg_md_cool_down);
		if(dg_md_alert_severity != null)
			map.put("dg_md_alert_severity", dg_md_alert_severity);
		if(dg_md_alert_clear_mode != null)
			map.put("dg_md_alert_clear_mode", dg_md_alert_clear_mode);
		if(dg_min_tdh != null)
			map.put("dg_min_tdh", dg_min_tdh);
		if(dg_max_tdh != null)
			map.put("dg_max_tdh", dg_max_tdh);
		if(dg_tdh_alert != null)
			map.put("dg_tdh_alert", dg_tdh_alert);
		if(dg_tdh_alert_sms != null)
			map.put("dg_tdh_alert_sms", dg_tdh_alert_sms);
		if(dg_tdh_alert_email != null)
			map.put("dg_tdh_alert_email", dg_tdh_alert_email);
		if(dg_tdh_cool_down != null)
			map.put("dg_tdh_cool_down", dg_tdh_cool_down);
		if(dg_tdh_alert_severity != null)
			map.put("dg_tdh_alert_severity", dg_tdh_alert_severity);
		if(dg_tdh_alert_clear_mode != null)
			map.put("dg_tdh_alert_clear_mode", dg_tdh_alert_clear_mode);
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
		grid_min_voltage = (Integer) map.get("grid_min_voltage");
		grid_mx_voltage = (Integer) map.get("grid_mx_voltage");
		grid_voltage_alert = (String) map.get("grid_voltage_alert");
		grid_voltage_alert_sms = (String) map.get("grid_voltage_alert_sms");
		grid_voltage_alert_email = (String) map.get("grid_voltage_alert_email");
		grid_voltage_alert_severity = (Integer) map.get("grid_voltage_alert_severity");
		grid_voltage_alert_clear_mode = (String) map.get("grid_voltage_alert_clear_mode");
		grid_voltage_cool_down = (Integer) map.get("grid_voltage_cool_down");
		grid_min_current = (Integer) map.get("grid_min_current");
		grid_max_current = (Integer) map.get("grid_max_current");
		grid_current_alert = (String) map.get("grid_current_alert");
		grid_current_alert_sms = (String) map.get("grid_current_alert_sms");
		grid_current_alert_email = (String) map.get("grid_current_alert_email");
		grid_current_cool_down = (Integer) map.get("grid_current_cool_down");
		grid_current_alert_severity = (Integer) map.get("grid_current_alert_severity");
		grid_current_alert_clear_mode = (String) map.get("grid_current_alert_clear_mode");
		grid_min_pf = (Double) map.get("grid_min_pf");
		grid_max_pf = (Double) map.get("grid_max_pf");
		grid_pf_alert = (String) map.get("grid_pf_alert");
		grid_pf_alert_sms = (String) map.get("grid_pf_alert_sms");
		grid_pf_alert_email = (String) map.get("grid_pf_alert_email");
		grid_pf_cool_down = (Integer) map.get("grid_pf_cool_down");
		grid_pf_alert_severity = (Integer) map.get("grid_pf_alert_severity");
		grid_pf_alert_clear_mode = (String) map.get("grid_pf_alert_clear_mode");
		grid_min_md = (Double) map.get("grid_min_md");
		grid_max_md = (Double) map.get("grid_max_md");
		grid_md_alert = (String) map.get("grid_md_alert");
		grid_md_alert_sms = (String) map.get("grid_md_alert_sms");
		grid_md_alert_email = (String) map.get("grid_md_alert_email");
		grid_md_cool_down = (Integer) map.get("grid_md_cool_down");
		grid_md_alert_severity = (Integer) map.get("grid_md_alert_severity");
		grid_md_alert_clear_mode = (String) map.get("grid_md_alert_clear_mode");
		grid_min_tdh = (Double) map.get("grid_min_tdh");
		grid_max_tdh = (Double) map.get("grid_max_tdh");
		grid_tdh_alert = (String) map.get("grid_tdh_alert");
		grid_tdh_alert_sms = (String) map.get("grid_tdh_alert_sms");
		grid_tdh_alert_email = (String) map.get("grid_tdh_alert_email");
		grid_tdh_cool_down = (Integer) map.get("grid_tdh_cool_down");
		grid_tdh_alert_severity = (Integer) map.get("grid_tdh_alert_severity");
		grid_td_alert_clear_mode = (String) map.get("grid_td_alert_clear_mode");
		dg_min_voltage = (Integer) map.get("dg_min_voltage");
		dg_mx_voltage = (Integer) map.get("dg_mx_voltage");
		dg_voltage_alert = (String) map.get("dg_voltage_alert");
		dg_voltage_alert_sms = (String) map.get("dg_voltage_alert_sms");
		dg_voltage_alert_email = (String) map.get("dg_voltage_alert_email");
		dg_voltage_cool_down = (Integer) map.get("dg_voltage_cool_down");
		dg_voltage_alert_severity = (Integer) map.get("dg_voltage_alert_severity");
		dg_voltage_alert_clear_mode = (String) map.get("dg_voltage_alert_clear_mode");
		dg_min_current = (Integer) map.get("dg_min_current");
		dg_max_current = (Integer) map.get("dg_max_current");
		dg_current_alert = (String) map.get("dg_current_alert");
		dg_current_alert_sms = (String) map.get("dg_current_alert_sms");
		dg_current_alert_email = (String) map.get("dg_current_alert_email");
		dg_current_cool_down = (Integer) map.get("dg_current_cool_down");
		dg_current_alert_severity = (Integer) map.get("dg_current_alert_severity");
		dg_current_alert_clear_mode = (String) map.get("dg_current_alert_clear_mode");
		dg_min_pf = (Double) map.get("dg_min_pf");
		dg_max_pf = (Double) map.get("dg_max_pf");
		dg_pf_alert = (String) map.get("dg_pf_alert");
		dg_pf_alert_sms = (String) map.get("dg_pf_alert_sms");
		dg_pf_alert_email = (String) map.get("dg_pf_alert_email");
		dg_pf_cool_down = (Integer) map.get("dg_pf_cool_down");
		dg_pf_alert_severity = (Integer) map.get("dg_pf_alert_severity");
		dg_pf_alert_clear_mode = (String) map.get("dg_pf_alert_clear_mode");
		dg_min_md = (Double) map.get("dg_min_md");
		dg_max_md = (Double) map.get("dg_max_md");
		dg_md_alert = (String) map.get("dg_md_alert");
		dg_md_alert_sms = (String) map.get("dg_md_alert_sms");
		dg_md_alert_email = (String) map.get("dg_md_alert_email");
		dg_md_cool_down = (Integer) map.get("dg_md_cool_down");
		dg_md_alert_severity = (Integer) map.get("dg_md_alert_severity");
		dg_md_alert_clear_mode = (String) map.get("dg_md_alert_clear_mode");
		dg_min_tdh = (Double) map.get("dg_min_tdh");
		dg_max_tdh = (Double) map.get("dg_max_tdh");
		dg_tdh_alert = (String) map.get("dg_tdh_alert");
		dg_tdh_alert_sms = (String) map.get("dg_tdh_alert_sms");
		dg_tdh_alert_email = (String) map.get("dg_tdh_alert_email");
		dg_tdh_cool_down = (Integer) map.get("dg_tdh_cool_down");
		dg_tdh_alert_severity = (Integer) map.get("dg_tdh_alert_severity");
		dg_tdh_alert_clear_mode = (String) map.get("dg_tdh_alert_clear_mode");
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

		Object grid_min_voltageObj = map.get("grid_min_voltage");
		if(grid_min_voltageObj != null)
			grid_min_voltage = new Integer(grid_min_voltageObj.toString());

		Object grid_mx_voltageObj = map.get("grid_mx_voltage");
		if(grid_mx_voltageObj != null)
			grid_mx_voltage = new Integer(grid_mx_voltageObj.toString());

		Object grid_voltage_alertObj = map.get("grid_voltage_alert");
		if(grid_voltage_alertObj != null)
			grid_voltage_alert = grid_voltage_alertObj.toString();

		Object grid_voltage_alert_smsObj = map.get("grid_voltage_alert_sms");
		if(grid_voltage_alert_smsObj != null)
			grid_voltage_alert_sms = grid_voltage_alert_smsObj.toString();

		Object grid_voltage_alert_emailObj = map.get("grid_voltage_alert_email");
		if(grid_voltage_alert_emailObj != null)
			grid_voltage_alert_email = grid_voltage_alert_emailObj.toString();

		Object grid_voltage_alert_severityObj = map.get("grid_voltage_alert_severity");
		if(grid_voltage_alert_severityObj != null)
			grid_voltage_alert_severity = new Integer(grid_voltage_alert_severityObj.toString());

		Object grid_voltage_alert_clear_modeObj = map.get("grid_voltage_alert_clear_mode");
		if(grid_voltage_alert_clear_modeObj != null)
			grid_voltage_alert_clear_mode = grid_voltage_alert_clear_modeObj.toString();

		Object grid_voltage_cool_downObj = map.get("grid_voltage_cool_down");
		if(grid_voltage_cool_downObj != null)
			grid_voltage_cool_down = new Integer(grid_voltage_cool_downObj.toString());

		Object grid_min_currentObj = map.get("grid_min_current");
		if(grid_min_currentObj != null)
			grid_min_current = new Integer(grid_min_currentObj.toString());

		Object grid_max_currentObj = map.get("grid_max_current");
		if(grid_max_currentObj != null)
			grid_max_current = new Integer(grid_max_currentObj.toString());

		Object grid_current_alertObj = map.get("grid_current_alert");
		if(grid_current_alertObj != null)
			grid_current_alert = grid_current_alertObj.toString();

		Object grid_current_alert_smsObj = map.get("grid_current_alert_sms");
		if(grid_current_alert_smsObj != null)
			grid_current_alert_sms = grid_current_alert_smsObj.toString();

		Object grid_current_alert_emailObj = map.get("grid_current_alert_email");
		if(grid_current_alert_emailObj != null)
			grid_current_alert_email = grid_current_alert_emailObj.toString();

		Object grid_current_cool_downObj = map.get("grid_current_cool_down");
		if(grid_current_cool_downObj != null)
			grid_current_cool_down = new Integer(grid_current_cool_downObj.toString());

		Object grid_current_alert_severityObj = map.get("grid_current_alert_severity");
		if(grid_current_alert_severityObj != null)
			grid_current_alert_severity = new Integer(grid_current_alert_severityObj.toString());

		Object grid_current_alert_clear_modeObj = map.get("grid_current_alert_clear_mode");
		if(grid_current_alert_clear_modeObj != null)
			grid_current_alert_clear_mode = grid_current_alert_clear_modeObj.toString();

		Object grid_min_pfObj = map.get("grid_min_pf");
		if(grid_min_pfObj != null)
			grid_min_pf = new Double(grid_min_pfObj.toString());

		Object grid_max_pfObj = map.get("grid_max_pf");
		if(grid_max_pfObj != null)
			grid_max_pf = new Double(grid_max_pfObj.toString());

		Object grid_pf_alertObj = map.get("grid_pf_alert");
		if(grid_pf_alertObj != null)
			grid_pf_alert = grid_pf_alertObj.toString();

		Object grid_pf_alert_smsObj = map.get("grid_pf_alert_sms");
		if(grid_pf_alert_smsObj != null)
			grid_pf_alert_sms = grid_pf_alert_smsObj.toString();

		Object grid_pf_alert_emailObj = map.get("grid_pf_alert_email");
		if(grid_pf_alert_emailObj != null)
			grid_pf_alert_email = grid_pf_alert_emailObj.toString();

		Object grid_pf_cool_downObj = map.get("grid_pf_cool_down");
		if(grid_pf_cool_downObj != null)
			grid_pf_cool_down = new Integer(grid_pf_cool_downObj.toString());

		Object grid_pf_alert_severityObj = map.get("grid_pf_alert_severity");
		if(grid_pf_alert_severityObj != null)
			grid_pf_alert_severity = new Integer(grid_pf_alert_severityObj.toString());

		Object grid_pf_alert_clear_modeObj = map.get("grid_pf_alert_clear_mode");
		if(grid_pf_alert_clear_modeObj != null)
			grid_pf_alert_clear_mode = grid_pf_alert_clear_modeObj.toString();

		Object grid_min_mdObj = map.get("grid_min_md");
		if(grid_min_mdObj != null)
			grid_min_md = new Double(grid_min_mdObj.toString());

		Object grid_max_mdObj = map.get("grid_max_md");
		if(grid_max_mdObj != null)
			grid_max_md = new Double(grid_max_mdObj.toString());

		Object grid_md_alertObj = map.get("grid_md_alert");
		if(grid_md_alertObj != null)
			grid_md_alert = grid_md_alertObj.toString();

		Object grid_md_alert_smsObj = map.get("grid_md_alert_sms");
		if(grid_md_alert_smsObj != null)
			grid_md_alert_sms = grid_md_alert_smsObj.toString();

		Object grid_md_alert_emailObj = map.get("grid_md_alert_email");
		if(grid_md_alert_emailObj != null)
			grid_md_alert_email = grid_md_alert_emailObj.toString();

		Object grid_md_cool_downObj = map.get("grid_md_cool_down");
		if(grid_md_cool_downObj != null)
			grid_md_cool_down = new Integer(grid_md_cool_downObj.toString());

		Object grid_md_alert_severityObj = map.get("grid_md_alert_severity");
		if(grid_md_alert_severityObj != null)
			grid_md_alert_severity = new Integer(grid_md_alert_severityObj.toString());

		Object grid_md_alert_clear_modeObj = map.get("grid_md_alert_clear_mode");
		if(grid_md_alert_clear_modeObj != null)
			grid_md_alert_clear_mode = grid_md_alert_clear_modeObj.toString();

		Object grid_min_tdhObj = map.get("grid_min_tdh");
		if(grid_min_tdhObj != null)
			grid_min_tdh = new Double(grid_min_tdhObj.toString());

		Object grid_max_tdhObj = map.get("grid_max_tdh");
		if(grid_max_tdhObj != null)
			grid_max_tdh = new Double(grid_max_tdhObj.toString());

		Object grid_tdh_alertObj = map.get("grid_tdh_alert");
		if(grid_tdh_alertObj != null)
			grid_tdh_alert = grid_tdh_alertObj.toString();

		Object grid_tdh_alert_smsObj = map.get("grid_tdh_alert_sms");
		if(grid_tdh_alert_smsObj != null)
			grid_tdh_alert_sms = grid_tdh_alert_smsObj.toString();

		Object grid_tdh_alert_emailObj = map.get("grid_tdh_alert_email");
		if(grid_tdh_alert_emailObj != null)
			grid_tdh_alert_email = grid_tdh_alert_emailObj.toString();

		Object grid_tdh_cool_downObj = map.get("grid_tdh_cool_down");
		if(grid_tdh_cool_downObj != null)
			grid_tdh_cool_down = new Integer(grid_tdh_cool_downObj.toString());

		Object grid_tdh_alert_severityObj = map.get("grid_tdh_alert_severity");
		if(grid_tdh_alert_severityObj != null)
			grid_tdh_alert_severity = new Integer(grid_tdh_alert_severityObj.toString());

		Object grid_td_alert_clear_modeObj = map.get("grid_td_alert_clear_mode");
		if(grid_td_alert_clear_modeObj != null)
			grid_td_alert_clear_mode = grid_td_alert_clear_modeObj.toString();

		Object dg_min_voltageObj = map.get("dg_min_voltage");
		if(dg_min_voltageObj != null)
			dg_min_voltage = new Integer(dg_min_voltageObj.toString());

		Object dg_mx_voltageObj = map.get("dg_mx_voltage");
		if(dg_mx_voltageObj != null)
			dg_mx_voltage = new Integer(dg_mx_voltageObj.toString());

		Object dg_voltage_alertObj = map.get("dg_voltage_alert");
		if(dg_voltage_alertObj != null)
			dg_voltage_alert = dg_voltage_alertObj.toString();

		Object dg_voltage_alert_smsObj = map.get("dg_voltage_alert_sms");
		if(dg_voltage_alert_smsObj != null)
			dg_voltage_alert_sms = dg_voltage_alert_smsObj.toString();

		Object dg_voltage_alert_emailObj = map.get("dg_voltage_alert_email");
		if(dg_voltage_alert_emailObj != null)
			dg_voltage_alert_email = dg_voltage_alert_emailObj.toString();

		Object dg_voltage_cool_downObj = map.get("dg_voltage_cool_down");
		if(dg_voltage_cool_downObj != null)
			dg_voltage_cool_down = new Integer(dg_voltage_cool_downObj.toString());

		Object dg_voltage_alert_severityObj = map.get("dg_voltage_alert_severity");
		if(dg_voltage_alert_severityObj != null)
			dg_voltage_alert_severity = new Integer(dg_voltage_alert_severityObj.toString());

		Object dg_voltage_alert_clear_modeObj = map.get("dg_voltage_alert_clear_mode");
		if(dg_voltage_alert_clear_modeObj != null)
			dg_voltage_alert_clear_mode = dg_voltage_alert_clear_modeObj.toString();

		Object dg_min_currentObj = map.get("dg_min_current");
		if(dg_min_currentObj != null)
			dg_min_current = new Integer(dg_min_currentObj.toString());

		Object dg_max_currentObj = map.get("dg_max_current");
		if(dg_max_currentObj != null)
			dg_max_current = new Integer(dg_max_currentObj.toString());

		Object dg_current_alertObj = map.get("dg_current_alert");
		if(dg_current_alertObj != null)
			dg_current_alert = dg_current_alertObj.toString();

		Object dg_current_alert_smsObj = map.get("dg_current_alert_sms");
		if(dg_current_alert_smsObj != null)
			dg_current_alert_sms = dg_current_alert_smsObj.toString();

		Object dg_current_alert_emailObj = map.get("dg_current_alert_email");
		if(dg_current_alert_emailObj != null)
			dg_current_alert_email = dg_current_alert_emailObj.toString();

		Object dg_current_cool_downObj = map.get("dg_current_cool_down");
		if(dg_current_cool_downObj != null)
			dg_current_cool_down = new Integer(dg_current_cool_downObj.toString());

		Object dg_current_alert_severityObj = map.get("dg_current_alert_severity");
		if(dg_current_alert_severityObj != null)
			dg_current_alert_severity = new Integer(dg_current_alert_severityObj.toString());

		Object dg_current_alert_clear_modeObj = map.get("dg_current_alert_clear_mode");
		if(dg_current_alert_clear_modeObj != null)
			dg_current_alert_clear_mode = dg_current_alert_clear_modeObj.toString();

		Object dg_min_pfObj = map.get("dg_min_pf");
		if(dg_min_pfObj != null)
			dg_min_pf = new Double(dg_min_pfObj.toString());

		Object dg_max_pfObj = map.get("dg_max_pf");
		if(dg_max_pfObj != null)
			dg_max_pf = new Double(dg_max_pfObj.toString());

		Object dg_pf_alertObj = map.get("dg_pf_alert");
		if(dg_pf_alertObj != null)
			dg_pf_alert = dg_pf_alertObj.toString();

		Object dg_pf_alert_smsObj = map.get("dg_pf_alert_sms");
		if(dg_pf_alert_smsObj != null)
			dg_pf_alert_sms = dg_pf_alert_smsObj.toString();

		Object dg_pf_alert_emailObj = map.get("dg_pf_alert_email");
		if(dg_pf_alert_emailObj != null)
			dg_pf_alert_email = dg_pf_alert_emailObj.toString();

		Object dg_pf_cool_downObj = map.get("dg_pf_cool_down");
		if(dg_pf_cool_downObj != null)
			dg_pf_cool_down = new Integer(dg_pf_cool_downObj.toString());

		Object dg_pf_alert_severityObj = map.get("dg_pf_alert_severity");
		if(dg_pf_alert_severityObj != null)
			dg_pf_alert_severity = new Integer(dg_pf_alert_severityObj.toString());

		Object dg_pf_alert_clear_modeObj = map.get("dg_pf_alert_clear_mode");
		if(dg_pf_alert_clear_modeObj != null)
			dg_pf_alert_clear_mode = dg_pf_alert_clear_modeObj.toString();

		Object dg_min_mdObj = map.get("dg_min_md");
		if(dg_min_mdObj != null)
			dg_min_md = new Double(dg_min_mdObj.toString());

		Object dg_max_mdObj = map.get("dg_max_md");
		if(dg_max_mdObj != null)
			dg_max_md = new Double(dg_max_mdObj.toString());

		Object dg_md_alertObj = map.get("dg_md_alert");
		if(dg_md_alertObj != null)
			dg_md_alert = dg_md_alertObj.toString();

		Object dg_md_alert_smsObj = map.get("dg_md_alert_sms");
		if(dg_md_alert_smsObj != null)
			dg_md_alert_sms = dg_md_alert_smsObj.toString();

		Object dg_md_alert_emailObj = map.get("dg_md_alert_email");
		if(dg_md_alert_emailObj != null)
			dg_md_alert_email = dg_md_alert_emailObj.toString();

		Object dg_md_cool_downObj = map.get("dg_md_cool_down");
		if(dg_md_cool_downObj != null)
			dg_md_cool_down = new Integer(dg_md_cool_downObj.toString());

		Object dg_md_alert_severityObj = map.get("dg_md_alert_severity");
		if(dg_md_alert_severityObj != null)
			dg_md_alert_severity = new Integer(dg_md_alert_severityObj.toString());

		Object dg_md_alert_clear_modeObj = map.get("dg_md_alert_clear_mode");
		if(dg_md_alert_clear_modeObj != null)
			dg_md_alert_clear_mode = dg_md_alert_clear_modeObj.toString();

		Object dg_min_tdhObj = map.get("dg_min_tdh");
		if(dg_min_tdhObj != null)
			dg_min_tdh = new Double(dg_min_tdhObj.toString());

		Object dg_max_tdhObj = map.get("dg_max_tdh");
		if(dg_max_tdhObj != null)
			dg_max_tdh = new Double(dg_max_tdhObj.toString());

		Object dg_tdh_alertObj = map.get("dg_tdh_alert");
		if(dg_tdh_alertObj != null)
			dg_tdh_alert = dg_tdh_alertObj.toString();

		Object dg_tdh_alert_smsObj = map.get("dg_tdh_alert_sms");
		if(dg_tdh_alert_smsObj != null)
			dg_tdh_alert_sms = dg_tdh_alert_smsObj.toString();

		Object dg_tdh_alert_emailObj = map.get("dg_tdh_alert_email");
		if(dg_tdh_alert_emailObj != null)
			dg_tdh_alert_email = dg_tdh_alert_emailObj.toString();

		Object dg_tdh_cool_downObj = map.get("dg_tdh_cool_down");
		if(dg_tdh_cool_downObj != null)
			dg_tdh_cool_down = new Integer(dg_tdh_cool_downObj.toString());

		Object dg_tdh_alert_severityObj = map.get("dg_tdh_alert_severity");
		if(dg_tdh_alert_severityObj != null)
			dg_tdh_alert_severity = new Integer(dg_tdh_alert_severityObj.toString());

		Object dg_tdh_alert_clear_modeObj = map.get("dg_tdh_alert_clear_mode");
		if(dg_tdh_alert_clear_modeObj != null)
			dg_tdh_alert_clear_mode = dg_tdh_alert_clear_modeObj.toString();

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

	public Integer getGrid_min_voltage() {
		return grid_min_voltage != null ? grid_min_voltage : 0;
	}

	public void setGrid_min_voltage(int grid_min_voltage) {
		this.grid_min_voltage = grid_min_voltage;
	}

	public void setGrid_min_voltage(Integer grid_min_voltage) {
		this.grid_min_voltage = grid_min_voltage;
	}

	public void unSetGrid_min_voltage() {
		this.grid_min_voltage = 0;
	}

	public Integer getGrid_mx_voltage() {
		return grid_mx_voltage != null ? grid_mx_voltage : 0;
	}

	public void setGrid_mx_voltage(int grid_mx_voltage) {
		this.grid_mx_voltage = grid_mx_voltage;
	}

	public void setGrid_mx_voltage(Integer grid_mx_voltage) {
		this.grid_mx_voltage = grid_mx_voltage;
	}

	public void unSetGrid_mx_voltage() {
		this.grid_mx_voltage = 0;
	}

	public String getGrid_voltage_alert() {
		return grid_voltage_alert != null ? grid_voltage_alert : "N";
	}

	public void setGrid_voltage_alert(String grid_voltage_alert) {
		this.grid_voltage_alert = grid_voltage_alert;
	}

	public void unSetGrid_voltage_alert() {
		this.grid_voltage_alert = "N";
	}

	public String getGrid_voltage_alert_sms() {
		return grid_voltage_alert_sms != null ? grid_voltage_alert_sms : "N";
	}

	public void setGrid_voltage_alert_sms(String grid_voltage_alert_sms) {
		this.grid_voltage_alert_sms = grid_voltage_alert_sms;
	}

	public void unSetGrid_voltage_alert_sms() {
		this.grid_voltage_alert_sms = "N";
	}

	public String getGrid_voltage_alert_email() {
		return grid_voltage_alert_email != null ? grid_voltage_alert_email : "N";
	}

	public void setGrid_voltage_alert_email(String grid_voltage_alert_email) {
		this.grid_voltage_alert_email = grid_voltage_alert_email;
	}

	public void unSetGrid_voltage_alert_email() {
		this.grid_voltage_alert_email = "N";
	}

	public Integer getGrid_voltage_alert_severity() {
		return grid_voltage_alert_severity != null ? grid_voltage_alert_severity : 0;
	}

	public void setGrid_voltage_alert_severity(int grid_voltage_alert_severity) {
		this.grid_voltage_alert_severity = grid_voltage_alert_severity;
	}

	public void setGrid_voltage_alert_severity(Integer grid_voltage_alert_severity) {
		this.grid_voltage_alert_severity = grid_voltage_alert_severity;
	}

	public void unSetGrid_voltage_alert_severity() {
		this.grid_voltage_alert_severity = 0;
	}

	public String getGrid_voltage_alert_clear_mode() {
		return grid_voltage_alert_clear_mode != null ? grid_voltage_alert_clear_mode : "AUTO";
	}

	public void setGrid_voltage_alert_clear_mode(String grid_voltage_alert_clear_mode) {
		this.grid_voltage_alert_clear_mode = grid_voltage_alert_clear_mode;
	}

	public void unSetGrid_voltage_alert_clear_mode() {
		this.grid_voltage_alert_clear_mode = "AUTO";
	}

	public Integer getGrid_voltage_cool_down() {
		return grid_voltage_cool_down != null ? grid_voltage_cool_down : 0;
	}

	public void setGrid_voltage_cool_down(int grid_voltage_cool_down) {
		this.grid_voltage_cool_down = grid_voltage_cool_down;
	}

	public void setGrid_voltage_cool_down(Integer grid_voltage_cool_down) {
		this.grid_voltage_cool_down = grid_voltage_cool_down;
	}

	public void unSetGrid_voltage_cool_down() {
		this.grid_voltage_cool_down = 0;
	}

	public Integer getGrid_min_current() {
		return grid_min_current != null ? grid_min_current : 0;
	}

	public void setGrid_min_current(int grid_min_current) {
		this.grid_min_current = grid_min_current;
	}

	public void setGrid_min_current(Integer grid_min_current) {
		this.grid_min_current = grid_min_current;
	}

	public void unSetGrid_min_current() {
		this.grid_min_current = 0;
	}

	public Integer getGrid_max_current() {
		return grid_max_current != null ? grid_max_current : 0;
	}

	public void setGrid_max_current(int grid_max_current) {
		this.grid_max_current = grid_max_current;
	}

	public void setGrid_max_current(Integer grid_max_current) {
		this.grid_max_current = grid_max_current;
	}

	public void unSetGrid_max_current() {
		this.grid_max_current = 0;
	}

	public String getGrid_current_alert() {
		return grid_current_alert != null ? grid_current_alert : "N";
	}

	public void setGrid_current_alert(String grid_current_alert) {
		this.grid_current_alert = grid_current_alert;
	}

	public void unSetGrid_current_alert() {
		this.grid_current_alert = "N";
	}

	public String getGrid_current_alert_sms() {
		return grid_current_alert_sms != null ? grid_current_alert_sms : "N";
	}

	public void setGrid_current_alert_sms(String grid_current_alert_sms) {
		this.grid_current_alert_sms = grid_current_alert_sms;
	}

	public void unSetGrid_current_alert_sms() {
		this.grid_current_alert_sms = "N";
	}

	public String getGrid_current_alert_email() {
		return grid_current_alert_email != null ? grid_current_alert_email : "N";
	}

	public void setGrid_current_alert_email(String grid_current_alert_email) {
		this.grid_current_alert_email = grid_current_alert_email;
	}

	public void unSetGrid_current_alert_email() {
		this.grid_current_alert_email = "N";
	}

	public Integer getGrid_current_cool_down() {
		return grid_current_cool_down != null ? grid_current_cool_down : 0;
	}

	public void setGrid_current_cool_down(int grid_current_cool_down) {
		this.grid_current_cool_down = grid_current_cool_down;
	}

	public void setGrid_current_cool_down(Integer grid_current_cool_down) {
		this.grid_current_cool_down = grid_current_cool_down;
	}

	public void unSetGrid_current_cool_down() {
		this.grid_current_cool_down = 0;
	}

	public Integer getGrid_current_alert_severity() {
		return grid_current_alert_severity != null ? grid_current_alert_severity : 0;
	}

	public void setGrid_current_alert_severity(int grid_current_alert_severity) {
		this.grid_current_alert_severity = grid_current_alert_severity;
	}

	public void setGrid_current_alert_severity(Integer grid_current_alert_severity) {
		this.grid_current_alert_severity = grid_current_alert_severity;
	}

	public void unSetGrid_current_alert_severity() {
		this.grid_current_alert_severity = 0;
	}

	public String getGrid_current_alert_clear_mode() {
		return grid_current_alert_clear_mode != null ? grid_current_alert_clear_mode : "AUTO";
	}

	public void setGrid_current_alert_clear_mode(String grid_current_alert_clear_mode) {
		this.grid_current_alert_clear_mode = grid_current_alert_clear_mode;
	}

	public void unSetGrid_current_alert_clear_mode() {
		this.grid_current_alert_clear_mode = "AUTO";
	}

	public Double getGrid_min_pf() {
		return grid_min_pf != null ? grid_min_pf : 0.0000;
	}

	public void setGrid_min_pf(double grid_min_pf) {
		this.grid_min_pf = grid_min_pf;
	}

	public void setGrid_min_pf(Double grid_min_pf) {
		this.grid_min_pf = grid_min_pf;
	}

	public void unSetGrid_min_pf() {
		this.grid_min_pf = 0.0000;
	}

	public Double getGrid_max_pf() {
		return grid_max_pf != null ? grid_max_pf : 0.0000;
	}

	public void setGrid_max_pf(double grid_max_pf) {
		this.grid_max_pf = grid_max_pf;
	}

	public void setGrid_max_pf(Double grid_max_pf) {
		this.grid_max_pf = grid_max_pf;
	}

	public void unSetGrid_max_pf() {
		this.grid_max_pf = 0.0000;
	}

	public String getGrid_pf_alert() {
		return grid_pf_alert != null ? grid_pf_alert : "N";
	}

	public void setGrid_pf_alert(String grid_pf_alert) {
		this.grid_pf_alert = grid_pf_alert;
	}

	public void unSetGrid_pf_alert() {
		this.grid_pf_alert = "N";
	}

	public String getGrid_pf_alert_sms() {
		return grid_pf_alert_sms != null ? grid_pf_alert_sms : "N";
	}

	public void setGrid_pf_alert_sms(String grid_pf_alert_sms) {
		this.grid_pf_alert_sms = grid_pf_alert_sms;
	}

	public void unSetGrid_pf_alert_sms() {
		this.grid_pf_alert_sms = "N";
	}

	public String getGrid_pf_alert_email() {
		return grid_pf_alert_email != null ? grid_pf_alert_email : "N";
	}

	public void setGrid_pf_alert_email(String grid_pf_alert_email) {
		this.grid_pf_alert_email = grid_pf_alert_email;
	}

	public void unSetGrid_pf_alert_email() {
		this.grid_pf_alert_email = "N";
	}

	public Integer getGrid_pf_cool_down() {
		return grid_pf_cool_down != null ? grid_pf_cool_down : 0;
	}

	public void setGrid_pf_cool_down(int grid_pf_cool_down) {
		this.grid_pf_cool_down = grid_pf_cool_down;
	}

	public void setGrid_pf_cool_down(Integer grid_pf_cool_down) {
		this.grid_pf_cool_down = grid_pf_cool_down;
	}

	public void unSetGrid_pf_cool_down() {
		this.grid_pf_cool_down = 0;
	}

	public Integer getGrid_pf_alert_severity() {
		return grid_pf_alert_severity != null ? grid_pf_alert_severity : 0;
	}

	public void setGrid_pf_alert_severity(int grid_pf_alert_severity) {
		this.grid_pf_alert_severity = grid_pf_alert_severity;
	}

	public void setGrid_pf_alert_severity(Integer grid_pf_alert_severity) {
		this.grid_pf_alert_severity = grid_pf_alert_severity;
	}

	public void unSetGrid_pf_alert_severity() {
		this.grid_pf_alert_severity = 0;
	}

	public String getGrid_pf_alert_clear_mode() {
		return grid_pf_alert_clear_mode != null ? grid_pf_alert_clear_mode : "AUTO";
	}

	public void setGrid_pf_alert_clear_mode(String grid_pf_alert_clear_mode) {
		this.grid_pf_alert_clear_mode = grid_pf_alert_clear_mode;
	}

	public void unSetGrid_pf_alert_clear_mode() {
		this.grid_pf_alert_clear_mode = "AUTO";
	}

	public Double getGrid_min_md() {
		return grid_min_md != null ? grid_min_md : 0.0000;
	}

	public void setGrid_min_md(double grid_min_md) {
		this.grid_min_md = grid_min_md;
	}

	public void setGrid_min_md(Double grid_min_md) {
		this.grid_min_md = grid_min_md;
	}

	public void unSetGrid_min_md() {
		this.grid_min_md = 0.0000;
	}

	public Double getGrid_max_md() {
		return grid_max_md != null ? grid_max_md : 0.0000;
	}

	public void setGrid_max_md(double grid_max_md) {
		this.grid_max_md = grid_max_md;
	}

	public void setGrid_max_md(Double grid_max_md) {
		this.grid_max_md = grid_max_md;
	}

	public void unSetGrid_max_md() {
		this.grid_max_md = 0.0000;
	}

	public String getGrid_md_alert() {
		return grid_md_alert != null ? grid_md_alert : "N";
	}

	public void setGrid_md_alert(String grid_md_alert) {
		this.grid_md_alert = grid_md_alert;
	}

	public void unSetGrid_md_alert() {
		this.grid_md_alert = "N";
	}

	public String getGrid_md_alert_sms() {
		return grid_md_alert_sms != null ? grid_md_alert_sms : "N";
	}

	public void setGrid_md_alert_sms(String grid_md_alert_sms) {
		this.grid_md_alert_sms = grid_md_alert_sms;
	}

	public void unSetGrid_md_alert_sms() {
		this.grid_md_alert_sms = "N";
	}

	public String getGrid_md_alert_email() {
		return grid_md_alert_email != null ? grid_md_alert_email : "N";
	}

	public void setGrid_md_alert_email(String grid_md_alert_email) {
		this.grid_md_alert_email = grid_md_alert_email;
	}

	public void unSetGrid_md_alert_email() {
		this.grid_md_alert_email = "N";
	}

	public Integer getGrid_md_cool_down() {
		return grid_md_cool_down != null ? grid_md_cool_down : 0;
	}

	public void setGrid_md_cool_down(int grid_md_cool_down) {
		this.grid_md_cool_down = grid_md_cool_down;
	}

	public void setGrid_md_cool_down(Integer grid_md_cool_down) {
		this.grid_md_cool_down = grid_md_cool_down;
	}

	public void unSetGrid_md_cool_down() {
		this.grid_md_cool_down = 0;
	}

	public Integer getGrid_md_alert_severity() {
		return grid_md_alert_severity != null ? grid_md_alert_severity : 0;
	}

	public void setGrid_md_alert_severity(int grid_md_alert_severity) {
		this.grid_md_alert_severity = grid_md_alert_severity;
	}

	public void setGrid_md_alert_severity(Integer grid_md_alert_severity) {
		this.grid_md_alert_severity = grid_md_alert_severity;
	}

	public void unSetGrid_md_alert_severity() {
		this.grid_md_alert_severity = 0;
	}

	public String getGrid_md_alert_clear_mode() {
		return grid_md_alert_clear_mode != null ? grid_md_alert_clear_mode : "AUTO";
	}

	public void setGrid_md_alert_clear_mode(String grid_md_alert_clear_mode) {
		this.grid_md_alert_clear_mode = grid_md_alert_clear_mode;
	}

	public void unSetGrid_md_alert_clear_mode() {
		this.grid_md_alert_clear_mode = "AUTO";
	}

	public Double getGrid_min_tdh() {
		return grid_min_tdh != null ? grid_min_tdh : 0.0000;
	}

	public void setGrid_min_tdh(double grid_min_tdh) {
		this.grid_min_tdh = grid_min_tdh;
	}

	public void setGrid_min_tdh(Double grid_min_tdh) {
		this.grid_min_tdh = grid_min_tdh;
	}

	public void unSetGrid_min_tdh() {
		this.grid_min_tdh = 0.0000;
	}

	public Double getGrid_max_tdh() {
		return grid_max_tdh != null ? grid_max_tdh : 0.0000;
	}

	public void setGrid_max_tdh(double grid_max_tdh) {
		this.grid_max_tdh = grid_max_tdh;
	}

	public void setGrid_max_tdh(Double grid_max_tdh) {
		this.grid_max_tdh = grid_max_tdh;
	}

	public void unSetGrid_max_tdh() {
		this.grid_max_tdh = 0.0000;
	}

	public String getGrid_tdh_alert() {
		return grid_tdh_alert != null ? grid_tdh_alert : "N";
	}

	public void setGrid_tdh_alert(String grid_tdh_alert) {
		this.grid_tdh_alert = grid_tdh_alert;
	}

	public void unSetGrid_tdh_alert() {
		this.grid_tdh_alert = "N";
	}

	public String getGrid_tdh_alert_sms() {
		return grid_tdh_alert_sms != null ? grid_tdh_alert_sms : "N";
	}

	public void setGrid_tdh_alert_sms(String grid_tdh_alert_sms) {
		this.grid_tdh_alert_sms = grid_tdh_alert_sms;
	}

	public void unSetGrid_tdh_alert_sms() {
		this.grid_tdh_alert_sms = "N";
	}

	public String getGrid_tdh_alert_email() {
		return grid_tdh_alert_email != null ? grid_tdh_alert_email : "N";
	}

	public void setGrid_tdh_alert_email(String grid_tdh_alert_email) {
		this.grid_tdh_alert_email = grid_tdh_alert_email;
	}

	public void unSetGrid_tdh_alert_email() {
		this.grid_tdh_alert_email = "N";
	}

	public Integer getGrid_tdh_cool_down() {
		return grid_tdh_cool_down != null ? grid_tdh_cool_down : 0;
	}

	public void setGrid_tdh_cool_down(int grid_tdh_cool_down) {
		this.grid_tdh_cool_down = grid_tdh_cool_down;
	}

	public void setGrid_tdh_cool_down(Integer grid_tdh_cool_down) {
		this.grid_tdh_cool_down = grid_tdh_cool_down;
	}

	public void unSetGrid_tdh_cool_down() {
		this.grid_tdh_cool_down = 0;
	}

	public Integer getGrid_tdh_alert_severity() {
		return grid_tdh_alert_severity != null ? grid_tdh_alert_severity : 0;
	}

	public void setGrid_tdh_alert_severity(int grid_tdh_alert_severity) {
		this.grid_tdh_alert_severity = grid_tdh_alert_severity;
	}

	public void setGrid_tdh_alert_severity(Integer grid_tdh_alert_severity) {
		this.grid_tdh_alert_severity = grid_tdh_alert_severity;
	}

	public void unSetGrid_tdh_alert_severity() {
		this.grid_tdh_alert_severity = 0;
	}

	public String getGrid_td_alert_clear_mode() {
		return grid_td_alert_clear_mode != null ? grid_td_alert_clear_mode : "AUTO";
	}

	public void setGrid_td_alert_clear_mode(String grid_td_alert_clear_mode) {
		this.grid_td_alert_clear_mode = grid_td_alert_clear_mode;
	}

	public void unSetGrid_td_alert_clear_mode() {
		this.grid_td_alert_clear_mode = "AUTO";
	}

	public Integer getDg_min_voltage() {
		return dg_min_voltage != null ? dg_min_voltage : 0;
	}

	public void setDg_min_voltage(int dg_min_voltage) {
		this.dg_min_voltage = dg_min_voltage;
	}

	public void setDg_min_voltage(Integer dg_min_voltage) {
		this.dg_min_voltage = dg_min_voltage;
	}

	public void unSetDg_min_voltage() {
		this.dg_min_voltage = 0;
	}

	public Integer getDg_mx_voltage() {
		return dg_mx_voltage != null ? dg_mx_voltage : 0;
	}

	public void setDg_mx_voltage(int dg_mx_voltage) {
		this.dg_mx_voltage = dg_mx_voltage;
	}

	public void setDg_mx_voltage(Integer dg_mx_voltage) {
		this.dg_mx_voltage = dg_mx_voltage;
	}

	public void unSetDg_mx_voltage() {
		this.dg_mx_voltage = 0;
	}

	public String getDg_voltage_alert() {
		return dg_voltage_alert != null ? dg_voltage_alert : "N";
	}

	public void setDg_voltage_alert(String dg_voltage_alert) {
		this.dg_voltage_alert = dg_voltage_alert;
	}

	public void unSetDg_voltage_alert() {
		this.dg_voltage_alert = "N";
	}

	public String getDg_voltage_alert_sms() {
		return dg_voltage_alert_sms != null ? dg_voltage_alert_sms : "N";
	}

	public void setDg_voltage_alert_sms(String dg_voltage_alert_sms) {
		this.dg_voltage_alert_sms = dg_voltage_alert_sms;
	}

	public void unSetDg_voltage_alert_sms() {
		this.dg_voltage_alert_sms = "N";
	}

	public String getDg_voltage_alert_email() {
		return dg_voltage_alert_email != null ? dg_voltage_alert_email : "N";
	}

	public void setDg_voltage_alert_email(String dg_voltage_alert_email) {
		this.dg_voltage_alert_email = dg_voltage_alert_email;
	}

	public void unSetDg_voltage_alert_email() {
		this.dg_voltage_alert_email = "N";
	}

	public Integer getDg_voltage_cool_down() {
		return dg_voltage_cool_down != null ? dg_voltage_cool_down : 0;
	}

	public void setDg_voltage_cool_down(int dg_voltage_cool_down) {
		this.dg_voltage_cool_down = dg_voltage_cool_down;
	}

	public void setDg_voltage_cool_down(Integer dg_voltage_cool_down) {
		this.dg_voltage_cool_down = dg_voltage_cool_down;
	}

	public void unSetDg_voltage_cool_down() {
		this.dg_voltage_cool_down = 0;
	}

	public Integer getDg_voltage_alert_severity() {
		return dg_voltage_alert_severity != null ? dg_voltage_alert_severity : 0;
	}

	public void setDg_voltage_alert_severity(int dg_voltage_alert_severity) {
		this.dg_voltage_alert_severity = dg_voltage_alert_severity;
	}

	public void setDg_voltage_alert_severity(Integer dg_voltage_alert_severity) {
		this.dg_voltage_alert_severity = dg_voltage_alert_severity;
	}

	public void unSetDg_voltage_alert_severity() {
		this.dg_voltage_alert_severity = 0;
	}

	public String getDg_voltage_alert_clear_mode() {
		return dg_voltage_alert_clear_mode != null ? dg_voltage_alert_clear_mode : "AUTO";
	}

	public void setDg_voltage_alert_clear_mode(String dg_voltage_alert_clear_mode) {
		this.dg_voltage_alert_clear_mode = dg_voltage_alert_clear_mode;
	}

	public void unSetDg_voltage_alert_clear_mode() {
		this.dg_voltage_alert_clear_mode = "AUTO";
	}

	public Integer getDg_min_current() {
		return dg_min_current != null ? dg_min_current : 0;
	}

	public void setDg_min_current(int dg_min_current) {
		this.dg_min_current = dg_min_current;
	}

	public void setDg_min_current(Integer dg_min_current) {
		this.dg_min_current = dg_min_current;
	}

	public void unSetDg_min_current() {
		this.dg_min_current = 0;
	}

	public Integer getDg_max_current() {
		return dg_max_current != null ? dg_max_current : 0;
	}

	public void setDg_max_current(int dg_max_current) {
		this.dg_max_current = dg_max_current;
	}

	public void setDg_max_current(Integer dg_max_current) {
		this.dg_max_current = dg_max_current;
	}

	public void unSetDg_max_current() {
		this.dg_max_current = 0;
	}

	public String getDg_current_alert() {
		return dg_current_alert != null ? dg_current_alert : "N";
	}

	public void setDg_current_alert(String dg_current_alert) {
		this.dg_current_alert = dg_current_alert;
	}

	public void unSetDg_current_alert() {
		this.dg_current_alert = "N";
	}

	public String getDg_current_alert_sms() {
		return dg_current_alert_sms != null ? dg_current_alert_sms : "N";
	}

	public void setDg_current_alert_sms(String dg_current_alert_sms) {
		this.dg_current_alert_sms = dg_current_alert_sms;
	}

	public void unSetDg_current_alert_sms() {
		this.dg_current_alert_sms = "N";
	}

	public String getDg_current_alert_email() {
		return dg_current_alert_email != null ? dg_current_alert_email : "N";
	}

	public void setDg_current_alert_email(String dg_current_alert_email) {
		this.dg_current_alert_email = dg_current_alert_email;
	}

	public void unSetDg_current_alert_email() {
		this.dg_current_alert_email = "N";
	}

	public Integer getDg_current_cool_down() {
		return dg_current_cool_down != null ? dg_current_cool_down : 0;
	}

	public void setDg_current_cool_down(int dg_current_cool_down) {
		this.dg_current_cool_down = dg_current_cool_down;
	}

	public void setDg_current_cool_down(Integer dg_current_cool_down) {
		this.dg_current_cool_down = dg_current_cool_down;
	}

	public void unSetDg_current_cool_down() {
		this.dg_current_cool_down = 0;
	}

	public Integer getDg_current_alert_severity() {
		return dg_current_alert_severity != null ? dg_current_alert_severity : 0;
	}

	public void setDg_current_alert_severity(int dg_current_alert_severity) {
		this.dg_current_alert_severity = dg_current_alert_severity;
	}

	public void setDg_current_alert_severity(Integer dg_current_alert_severity) {
		this.dg_current_alert_severity = dg_current_alert_severity;
	}

	public void unSetDg_current_alert_severity() {
		this.dg_current_alert_severity = 0;
	}

	public String getDg_current_alert_clear_mode() {
		return dg_current_alert_clear_mode != null ? dg_current_alert_clear_mode : "AUTO";
	}

	public void setDg_current_alert_clear_mode(String dg_current_alert_clear_mode) {
		this.dg_current_alert_clear_mode = dg_current_alert_clear_mode;
	}

	public void unSetDg_current_alert_clear_mode() {
		this.dg_current_alert_clear_mode = "AUTO";
	}

	public Double getDg_min_pf() {
		return dg_min_pf != null ? dg_min_pf : 0.0000;
	}

	public void setDg_min_pf(double dg_min_pf) {
		this.dg_min_pf = dg_min_pf;
	}

	public void setDg_min_pf(Double dg_min_pf) {
		this.dg_min_pf = dg_min_pf;
	}

	public void unSetDg_min_pf() {
		this.dg_min_pf = 0.0000;
	}

	public Double getDg_max_pf() {
		return dg_max_pf != null ? dg_max_pf : 0.0000;
	}

	public void setDg_max_pf(double dg_max_pf) {
		this.dg_max_pf = dg_max_pf;
	}

	public void setDg_max_pf(Double dg_max_pf) {
		this.dg_max_pf = dg_max_pf;
	}

	public void unSetDg_max_pf() {
		this.dg_max_pf = 0.0000;
	}

	public String getDg_pf_alert() {
		return dg_pf_alert != null ? dg_pf_alert : "N";
	}

	public void setDg_pf_alert(String dg_pf_alert) {
		this.dg_pf_alert = dg_pf_alert;
	}

	public void unSetDg_pf_alert() {
		this.dg_pf_alert = "N";
	}

	public String getDg_pf_alert_sms() {
		return dg_pf_alert_sms != null ? dg_pf_alert_sms : "N";
	}

	public void setDg_pf_alert_sms(String dg_pf_alert_sms) {
		this.dg_pf_alert_sms = dg_pf_alert_sms;
	}

	public void unSetDg_pf_alert_sms() {
		this.dg_pf_alert_sms = "N";
	}

	public String getDg_pf_alert_email() {
		return dg_pf_alert_email != null ? dg_pf_alert_email : "N";
	}

	public void setDg_pf_alert_email(String dg_pf_alert_email) {
		this.dg_pf_alert_email = dg_pf_alert_email;
	}

	public void unSetDg_pf_alert_email() {
		this.dg_pf_alert_email = "N";
	}

	public Integer getDg_pf_cool_down() {
		return dg_pf_cool_down != null ? dg_pf_cool_down : 0;
	}

	public void setDg_pf_cool_down(int dg_pf_cool_down) {
		this.dg_pf_cool_down = dg_pf_cool_down;
	}

	public void setDg_pf_cool_down(Integer dg_pf_cool_down) {
		this.dg_pf_cool_down = dg_pf_cool_down;
	}

	public void unSetDg_pf_cool_down() {
		this.dg_pf_cool_down = 0;
	}

	public Integer getDg_pf_alert_severity() {
		return dg_pf_alert_severity != null ? dg_pf_alert_severity : 0;
	}

	public void setDg_pf_alert_severity(int dg_pf_alert_severity) {
		this.dg_pf_alert_severity = dg_pf_alert_severity;
	}

	public void setDg_pf_alert_severity(Integer dg_pf_alert_severity) {
		this.dg_pf_alert_severity = dg_pf_alert_severity;
	}

	public void unSetDg_pf_alert_severity() {
		this.dg_pf_alert_severity = 0;
	}

	public String getDg_pf_alert_clear_mode() {
		return dg_pf_alert_clear_mode != null ? dg_pf_alert_clear_mode : "AUTO";
	}

	public void setDg_pf_alert_clear_mode(String dg_pf_alert_clear_mode) {
		this.dg_pf_alert_clear_mode = dg_pf_alert_clear_mode;
	}

	public void unSetDg_pf_alert_clear_mode() {
		this.dg_pf_alert_clear_mode = "AUTO";
	}

	public Double getDg_min_md() {
		return dg_min_md != null ? dg_min_md : 0.0000;
	}

	public void setDg_min_md(double dg_min_md) {
		this.dg_min_md = dg_min_md;
	}

	public void setDg_min_md(Double dg_min_md) {
		this.dg_min_md = dg_min_md;
	}

	public void unSetDg_min_md() {
		this.dg_min_md = 0.0000;
	}

	public Double getDg_max_md() {
		return dg_max_md != null ? dg_max_md : 0.0000;
	}

	public void setDg_max_md(double dg_max_md) {
		this.dg_max_md = dg_max_md;
	}

	public void setDg_max_md(Double dg_max_md) {
		this.dg_max_md = dg_max_md;
	}

	public void unSetDg_max_md() {
		this.dg_max_md = 0.0000;
	}

	public String getDg_md_alert() {
		return dg_md_alert != null ? dg_md_alert : "N";
	}

	public void setDg_md_alert(String dg_md_alert) {
		this.dg_md_alert = dg_md_alert;
	}

	public void unSetDg_md_alert() {
		this.dg_md_alert = "N";
	}

	public String getDg_md_alert_sms() {
		return dg_md_alert_sms != null ? dg_md_alert_sms : "N";
	}

	public void setDg_md_alert_sms(String dg_md_alert_sms) {
		this.dg_md_alert_sms = dg_md_alert_sms;
	}

	public void unSetDg_md_alert_sms() {
		this.dg_md_alert_sms = "N";
	}

	public String getDg_md_alert_email() {
		return dg_md_alert_email != null ? dg_md_alert_email : "N";
	}

	public void setDg_md_alert_email(String dg_md_alert_email) {
		this.dg_md_alert_email = dg_md_alert_email;
	}

	public void unSetDg_md_alert_email() {
		this.dg_md_alert_email = "N";
	}

	public Integer getDg_md_cool_down() {
		return dg_md_cool_down != null ? dg_md_cool_down : 0;
	}

	public void setDg_md_cool_down(int dg_md_cool_down) {
		this.dg_md_cool_down = dg_md_cool_down;
	}

	public void setDg_md_cool_down(Integer dg_md_cool_down) {
		this.dg_md_cool_down = dg_md_cool_down;
	}

	public void unSetDg_md_cool_down() {
		this.dg_md_cool_down = 0;
	}

	public Integer getDg_md_alert_severity() {
		return dg_md_alert_severity != null ? dg_md_alert_severity : 0;
	}

	public void setDg_md_alert_severity(int dg_md_alert_severity) {
		this.dg_md_alert_severity = dg_md_alert_severity;
	}

	public void setDg_md_alert_severity(Integer dg_md_alert_severity) {
		this.dg_md_alert_severity = dg_md_alert_severity;
	}

	public void unSetDg_md_alert_severity() {
		this.dg_md_alert_severity = 0;
	}

	public String getDg_md_alert_clear_mode() {
		return dg_md_alert_clear_mode != null ? dg_md_alert_clear_mode : "AUTO";
	}

	public void setDg_md_alert_clear_mode(String dg_md_alert_clear_mode) {
		this.dg_md_alert_clear_mode = dg_md_alert_clear_mode;
	}

	public void unSetDg_md_alert_clear_mode() {
		this.dg_md_alert_clear_mode = "AUTO";
	}

	public Double getDg_min_tdh() {
		return dg_min_tdh != null ? dg_min_tdh : 0.0000;
	}

	public void setDg_min_tdh(double dg_min_tdh) {
		this.dg_min_tdh = dg_min_tdh;
	}

	public void setDg_min_tdh(Double dg_min_tdh) {
		this.dg_min_tdh = dg_min_tdh;
	}

	public void unSetDg_min_tdh() {
		this.dg_min_tdh = 0.0000;
	}

	public Double getDg_max_tdh() {
		return dg_max_tdh != null ? dg_max_tdh : 0.0000;
	}

	public void setDg_max_tdh(double dg_max_tdh) {
		this.dg_max_tdh = dg_max_tdh;
	}

	public void setDg_max_tdh(Double dg_max_tdh) {
		this.dg_max_tdh = dg_max_tdh;
	}

	public void unSetDg_max_tdh() {
		this.dg_max_tdh = 0.0000;
	}

	public String getDg_tdh_alert() {
		return dg_tdh_alert != null ? dg_tdh_alert : "N";
	}

	public void setDg_tdh_alert(String dg_tdh_alert) {
		this.dg_tdh_alert = dg_tdh_alert;
	}

	public void unSetDg_tdh_alert() {
		this.dg_tdh_alert = "N";
	}

	public String getDg_tdh_alert_sms() {
		return dg_tdh_alert_sms != null ? dg_tdh_alert_sms : "N";
	}

	public void setDg_tdh_alert_sms(String dg_tdh_alert_sms) {
		this.dg_tdh_alert_sms = dg_tdh_alert_sms;
	}

	public void unSetDg_tdh_alert_sms() {
		this.dg_tdh_alert_sms = "N";
	}

	public String getDg_tdh_alert_email() {
		return dg_tdh_alert_email != null ? dg_tdh_alert_email : "N";
	}

	public void setDg_tdh_alert_email(String dg_tdh_alert_email) {
		this.dg_tdh_alert_email = dg_tdh_alert_email;
	}

	public void unSetDg_tdh_alert_email() {
		this.dg_tdh_alert_email = "N";
	}

	public Integer getDg_tdh_cool_down() {
		return dg_tdh_cool_down != null ? dg_tdh_cool_down : 0;
	}

	public void setDg_tdh_cool_down(int dg_tdh_cool_down) {
		this.dg_tdh_cool_down = dg_tdh_cool_down;
	}

	public void setDg_tdh_cool_down(Integer dg_tdh_cool_down) {
		this.dg_tdh_cool_down = dg_tdh_cool_down;
	}

	public void unSetDg_tdh_cool_down() {
		this.dg_tdh_cool_down = 0;
	}

	public Integer getDg_tdh_alert_severity() {
		return dg_tdh_alert_severity != null ? dg_tdh_alert_severity : 0;
	}

	public void setDg_tdh_alert_severity(int dg_tdh_alert_severity) {
		this.dg_tdh_alert_severity = dg_tdh_alert_severity;
	}

	public void setDg_tdh_alert_severity(Integer dg_tdh_alert_severity) {
		this.dg_tdh_alert_severity = dg_tdh_alert_severity;
	}

	public void unSetDg_tdh_alert_severity() {
		this.dg_tdh_alert_severity = 0;
	}

	public String getDg_tdh_alert_clear_mode() {
		return dg_tdh_alert_clear_mode != null ? dg_tdh_alert_clear_mode : "AUTO";
	}

	public void setDg_tdh_alert_clear_mode(String dg_tdh_alert_clear_mode) {
		this.dg_tdh_alert_clear_mode = dg_tdh_alert_clear_mode;
	}

	public void unSetDg_tdh_alert_clear_mode() {
		this.dg_tdh_alert_clear_mode = "AUTO";
	}

	public String getCustomer_id() {
		return customer_id != null ? customer_id : "N";
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public void unSetCustomer_id() {
		this.customer_id = "N";
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