/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.account.defined.resource;

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
public abstract class Baseledger extends BaseResource {
	private String id = null;
	private String customer_id = null;
	private String community_id = null;
	private String code = null;
	private String voucher_no = null;
	private String event_date_str = null;
	private Long event_date = null;
	private String particular = null;
	private String company_name = null;
	private String account_customer_id = null;
	private String account_id = null;
	private Double balance = null;
	private Double opening_balance = null;
	private Double closing_balance = null;
	private Double dr_amount = null;
	private Double cr_amount = null;
	private String fin_year = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CUSTOMER_ID = "customer_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_CODE = "code";
	public static String FIELD_VOUCHER_NO = "voucher_no";
	public static String FIELD_EVENT_DATE_STR = "event_date_str";
	public static String FIELD_EVENT_DATE = "event_date";
	public static String FIELD_PARTICULAR = "particular";
	public static String FIELD_COMPANY_NAME = "company_name";
	public static String FIELD_ACCOUNT_CUSTOMER_ID = "account_customer_id";
	public static String FIELD_ACCOUNT_ID = "account_id";
	public static String FIELD_BALANCE = "balance";
	public static String FIELD_OPENING_BALANCE = "opening_balance";
	public static String FIELD_CLOSING_BALANCE = "closing_balance";
	public static String FIELD_DR_AMOUNT = "dr_amount";
	public static String FIELD_CR_AMOUNT = "cr_amount";
	public static String FIELD_FIN_YEAR = "fin_year";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("ledger");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field customer_idField = new Field("customer_id", "String");
		customer_idField.setLength(128);
		metaData.addField(customer_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field codeField = new Field("code", "String");
		codeField.setLength(128);
		metaData.addField(codeField);

		Field voucher_noField = new Field("voucher_no", "String");
		voucher_noField.setLength(128);
		metaData.addField(voucher_noField);

		Field event_date_strField = new Field("event_date_str", "String");
		event_date_strField.setLength(32);
		metaData.addField(event_date_strField);

		Field event_dateField = new Field("event_date", "long");
		metaData.addField(event_dateField);

		Field particularField = new Field("particular", "String");
		particularField.setLength(128);
		metaData.addField(particularField);

		Field company_nameField = new Field("company_name", "String");
		company_nameField.setLength(128);
		metaData.addField(company_nameField);

		Field account_customer_idField = new Field("account_customer_id", "String");
		account_customer_idField.setLength(128);
		metaData.addField(account_customer_idField);

		Field account_idField = new Field("account_id", "String");
		account_idField.setLength(128);
		metaData.addField(account_idField);

		Field balanceField = new Field("balance", "double");
		metaData.addField(balanceField);

		Field opening_balanceField = new Field("opening_balance", "double");
		metaData.addField(opening_balanceField);

		Field closing_balanceField = new Field("closing_balance", "double");
		metaData.addField(closing_balanceField);

		Field dr_amountField = new Field("dr_amount", "double");
		metaData.addField(dr_amountField);

		Field cr_amountField = new Field("cr_amount", "double");
		metaData.addField(cr_amountField);

		Field fin_yearField = new Field("fin_year", "String");
		metaData.addField(fin_yearField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("ledger");

		metaData.setCluster("DB_ACCOUNT");
	}

	public Baseledger() {
	}

	public Baseledger(Baseledger obj) {
		this.id = obj.id;
		this.customer_id = obj.customer_id;
		this.community_id = obj.community_id;
		this.code = obj.code;
		this.voucher_no = obj.voucher_no;
		this.event_date_str = obj.event_date_str;
		this.event_date = obj.event_date;
		this.particular = obj.particular;
		this.company_name = obj.company_name;
		this.account_customer_id = obj.account_customer_id;
		this.account_id = obj.account_id;
		this.balance = obj.balance;
		this.opening_balance = obj.opening_balance;
		this.closing_balance = obj.closing_balance;
		this.dr_amount = obj.dr_amount;
		this.cr_amount = obj.cr_amount;
		this.fin_year = obj.fin_year;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (id != null)
			map.put("id", id);
		if (customer_id != null)
			map.put("customer_id", customer_id);
		if (community_id != null)
			map.put("community_id", community_id);
		if (code != null)
			map.put("code", code);
		if (voucher_no != null)
			map.put("voucher_no", voucher_no);
		if (event_date_str != null)
			map.put("event_date_str", event_date_str);
		if (event_date != null)
			map.put("event_date", event_date);
		if (particular != null)
			map.put("particular", particular);
		if (company_name != null)
			map.put("company_name", company_name);
		if (account_customer_id != null)
			map.put("account_customer_id", account_customer_id);
		if (account_id != null)
			map.put("account_id", account_id);
		if (balance != null)
			map.put("balance", balance);
		if (opening_balance != null)
			map.put("opening_balance", opening_balance);
		if (closing_balance != null)
			map.put("closing_balance", closing_balance);
		if (dr_amount != null)
			map.put("dr_amount", dr_amount);
		if (cr_amount != null)
			map.put("cr_amount", cr_amount);
		if (fin_year != null)
			map.put("fin_year", fin_year);
		if (creation_time != null)
			map.put("creation_time", creation_time);
		if (last_update_time != null)
			map.put("last_update_time", last_update_time);
		if (extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (validateId(add))
			map.put("id", id);
		if (customer_id != null)
			map.put("customer_id", customer_id);
		if (community_id != null)
			map.put("community_id", community_id);
		if (code != null)
			map.put("code", code);
		if (voucher_no != null)
			map.put("voucher_no", voucher_no);
		if (event_date_str != null)
			map.put("event_date_str", event_date_str);
		if (event_date != null)
			map.put("event_date", event_date);
		if (particular != null)
			map.put("particular", particular);
		if (company_name != null)
			map.put("company_name", company_name);
		if (account_customer_id != null)
			map.put("account_customer_id", account_customer_id);
		if (account_id != null)
			map.put("account_id", account_id);
		if (balance != null)
			map.put("balance", balance);
		if (opening_balance != null)
			map.put("opening_balance", opening_balance);
		if (closing_balance != null)
			map.put("closing_balance", closing_balance);
		if (dr_amount != null)
			map.put("dr_amount", dr_amount);
		if (cr_amount != null)
			map.put("cr_amount", cr_amount);
		if (fin_year != null)
			map.put("fin_year", fin_year);
		if (creation_time != null)
			map.put("creation_time", creation_time);
		if (last_update_time != null)
			map.put("last_update_time", last_update_time);
		if (extra_data != null)
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
		customer_id = (String) map.get("customer_id");
		community_id = (String) map.get("community_id");
		code = (String) map.get("code");
		voucher_no = (String) map.get("voucher_no");
		event_date_str = (String) map.get("event_date_str");
		event_date = (Long) map.get("event_date");
		particular = (String) map.get("particular");
		company_name = (String) map.get("company_name");
		account_customer_id = (String) map.get("account_customer_id");
		account_id = (String) map.get("account_id");
		balance = (Double) map.get("balance");
		opening_balance = (Double) map.get("opening_balance");
		closing_balance = (Double) map.get("closing_balance");
		dr_amount = (Double) map.get("dr_amount");
		cr_amount = (Double) map.get("cr_amount");
		fin_year = (String) map.get("fin_year");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if (idObj != null)
			id = idObj.toString();

		Object customer_idObj = map.get("customer_id");
		if (customer_idObj != null)
			customer_id = customer_idObj.toString();

		Object community_idObj = map.get("community_id");
		if (community_idObj != null)
			community_id = community_idObj.toString();

		Object codeObj = map.get("code");
		if (codeObj != null)
			code = codeObj.toString();

		Object voucher_noObj = map.get("voucher_no");
		if (voucher_noObj != null)
			voucher_no = voucher_noObj.toString();

		Object event_date_strObj = map.get("event_date_str");
		if (event_date_strObj != null)
			event_date_str = event_date_strObj.toString();

		Object event_dateObj = map.get("event_date");
		if (event_dateObj != null)
			event_date = new Long(event_dateObj.toString());

		Object particularObj = map.get("particular");
		if (particularObj != null)
			particular = particularObj.toString();

		Object company_nameObj = map.get("company_name");
		if (company_nameObj != null)
			company_name = company_nameObj.toString();

		Object account_customer_idObj = map.get("account_customer_id");
		if (account_customer_idObj != null)
			account_customer_id = account_customer_idObj.toString();

		Object account_idObj = map.get("account_id");
		if (account_idObj != null)
			account_id = account_idObj.toString();

		Object balanceObj = map.get("balance");
		if (balanceObj != null)
			balance = new Double(balanceObj.toString());

		Object opening_balanceObj = map.get("opening_balance");
		if (opening_balanceObj != null)
			opening_balance = new Double(opening_balanceObj.toString());

		Object closing_balanceObj = map.get("closing_balance");
		if (closing_balanceObj != null)
			closing_balance = new Double(closing_balanceObj.toString());

		Object dr_amountObj = map.get("dr_amount");
		if (dr_amountObj != null)
			dr_amount = new Double(dr_amountObj.toString());

		Object cr_amountObj = map.get("cr_amount");
		if (cr_amountObj != null)
			cr_amount = new Double(cr_amountObj.toString());

		Object fin_yearObj = map.get("fin_year");
		if (fin_yearObj != null)
			fin_year = fin_yearObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if (creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if (last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

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
		if (add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
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

	public String getCommunity_id() {
		return community_id;
	}

	public String getCommunity_idEx() {
		return community_id != null ? community_id : "";
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public void unSetCommunity_id() {
		this.community_id = null;
	}

	public String getCode() {
		return code;
	}

	public String getCodeEx() {
		return code != null ? code : "";
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void unSetCode() {
		this.code = null;
	}

	public String getVoucher_no() {
		return voucher_no;
	}

	public String getVoucher_noEx() {
		return voucher_no != null ? voucher_no : "";
	}

	public void setVoucher_no(String voucher_no) {
		this.voucher_no = voucher_no;
	}

	public void unSetVoucher_no() {
		this.voucher_no = null;
	}

	public String getEvent_date_str() {
		return event_date_str;
	}

	public String getEvent_date_strEx() {
		return event_date_str != null ? event_date_str : "";
	}

	public void setEvent_date_str(String event_date_str) {
		this.event_date_str = event_date_str;
	}

	public void unSetEvent_date_str() {
		this.event_date_str = null;
	}

	public Long getEvent_date() {
		return event_date;
	}

	public long getEvent_dateEx() {
		return event_date != null ? event_date : 0L;
	}

	public void setEvent_date(long event_date) {
		this.event_date = event_date;
	}

	public void setEvent_date(Long event_date) {
		this.event_date = event_date;
	}

	public void unSetEvent_date() {
		this.event_date = null;
	}

	public String getParticular() {
		return particular;
	}

	public String getParticularEx() {
		return particular != null ? particular : "";
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public void unSetParticular() {
		this.particular = null;
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

	public String getAccount_customer_id() {
		return account_customer_id;
	}

	public String getAccount_customer_idEx() {
		return account_customer_id != null ? account_customer_id : "";
	}

	public void setAccount_customer_id(String account_customer_id) {
		this.account_customer_id = account_customer_id;
	}

	public void unSetAccount_customer_id() {
		this.account_customer_id = null;
	}

	public String getAccount_id() {
		return account_id;
	}

	public String getAccount_idEx() {
		return account_id != null ? account_id : "";
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public void unSetAccount_id() {
		this.account_id = null;
	}

	public Double getBalance() {
		return balance;
	}

	public double getBalanceEx() {
		return balance != null ? balance : 0;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = null;
	}

	public Double getOpening_balance() {
		return opening_balance;
	}

	public double getOpening_balanceEx() {
		return opening_balance != null ? opening_balance : 0;
	}

	public void setOpening_balance(double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public void unSetOpening_balance() {
		this.opening_balance = null;
	}

	public Double getClosing_balance() {
		return closing_balance;
	}

	public double getClosing_balanceEx() {
		return closing_balance != null ? closing_balance : 0;
	}

	public void setClosing_balance(double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void setClosing_balance(Double closing_balance) {
		this.closing_balance = closing_balance;
	}

	public void unSetClosing_balance() {
		this.closing_balance = null;
	}

	public Double getDr_amount() {
		return dr_amount;
	}

	public double getDr_amountEx() {
		return dr_amount != null ? dr_amount : 0;
	}

	public void setDr_amount(double dr_amount) {
		this.dr_amount = dr_amount;
	}

	public void setDr_amount(Double dr_amount) {
		this.dr_amount = dr_amount;
	}

	public void unSetDr_amount() {
		this.dr_amount = null;
	}

	public Double getCr_amount() {
		return cr_amount;
	}

	public double getCr_amountEx() {
		return cr_amount != null ? cr_amount : 0;
	}

	public void setCr_amount(double cr_amount) {
		this.cr_amount = cr_amount;
	}

	public void setCr_amount(Double cr_amount) {
		this.cr_amount = cr_amount;
	}

	public void unSetCr_amount() {
		this.cr_amount = null;
	}

	public String getFin_year() {
		return fin_year;
	}

	public String getFin_yearEx() {
		return fin_year != null ? fin_year : "";
	}

	public void setFin_year(String fin_year) {
		this.fin_year = fin_year;
	}

	public void unSetFin_year() {
		this.fin_year = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
	}


	public Long getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
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
		if (extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}
	public String getCluster() {
		return "DB_ACCOUNT";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}