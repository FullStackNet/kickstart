/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.account.defined.resource;

import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Baseledger_detail extends BaseResource {
	private String id = null;
	private String community_id = null;
	private String fin_year = null;
	private String f_code = null;
	private String reference_id = null;
	private String voucher_id = null;
	private String particular = null;
	private String type = null;
	private Integer bags = null;
	private Double weight = null;
	private Double rate = null;
	private Double amount = null;
	private String arrival_date_str = null;
	private Long arrival_date = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_FIN_YEAR = "fin_year";
	public static String FIELD_F_CODE = "f_code";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_VOUCHER_ID = "voucher_id";
	public static String FIELD_PARTICULAR = "particular";
	public static String FIELD_TYPE = "type";
	public static String FIELD_BAGS = "bags";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_RATE = "rate";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_ARRIVAL_DATE_STR = "arrival_date_str";
	public static String FIELD_ARRIVAL_DATE = "arrival_date";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("ledger_detail");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field fin_yearField = new Field("fin_year", "String");
		fin_yearField.setLength(128);
		metaData.addField(fin_yearField);

		Field f_codeField = new Field("f_code", "String");
		f_codeField.setLength(128);
		metaData.addField(f_codeField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field voucher_idField = new Field("voucher_id", "String");
		voucher_idField.setLength(128);
		metaData.addField(voucher_idField);

		Field particularField = new Field("particular", "String");
		particularField.setLength(128);
		metaData.addField(particularField);

		Field typeField = new Field("type", "String");
		typeField.setLength(128);
		metaData.addField(typeField);

		Field bagsField = new Field("bags", "int");
		bagsField.setLength(128);
		metaData.addField(bagsField);

		Field weightField = new Field("weight", "double");
		metaData.addField(weightField);

		Field rateField = new Field("rate", "double");
		metaData.addField(rateField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field arrival_date_strField = new Field("arrival_date_str", "String");
		arrival_date_strField.setLength(32);
		metaData.addField(arrival_date_strField);

		Field arrival_dateField = new Field("arrival_date", "long");
		metaData.addField(arrival_dateField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "timestamp");
		metaData.addField(last_update_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("ledger_detail");

		metaData.setCluster("DB_ACCOUNT");
	}

	public Baseledger_detail() {}

	public Baseledger_detail(Baseledger_detail obj) {
		this.id = obj.id;
		this.community_id = obj.community_id;
		this.fin_year = obj.fin_year;
		this.f_code = obj.f_code;
		this.reference_id = obj.reference_id;
		this.voucher_id = obj.voucher_id;
		this.particular = obj.particular;
		this.type = obj.type;
		this.bags = obj.bags;
		this.weight = obj.weight;
		this.rate = obj.rate;
		this.amount = obj.amount;
		this.arrival_date_str = obj.arrival_date_str;
		this.arrival_date = obj.arrival_date;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(fin_year != null)
			map.put("fin_year", fin_year);
		if(f_code != null)
			map.put("f_code", f_code);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(voucher_id != null)
			map.put("voucher_id", voucher_id);
		if(particular != null)
			map.put("particular", particular);
		if(type != null)
			map.put("type", type);
		if(bags != null)
			map.put("bags", bags);
		if(weight != null)
			map.put("weight", weight);
		if(rate != null)
			map.put("rate", rate);
		if(amount != null)
			map.put("amount", amount);
		if(arrival_date_str != null)
			map.put("arrival_date_str", arrival_date_str);
		if(arrival_date != null)
			map.put("arrival_date", arrival_date);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(fin_year != null)
			map.put("fin_year", fin_year);
		if(f_code != null)
			map.put("f_code", f_code);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(voucher_id != null)
			map.put("voucher_id", voucher_id);
		if(particular != null)
			map.put("particular", particular);
		if(type != null)
			map.put("type", type);
		if(bags != null)
			map.put("bags", bags);
		if(weight != null)
			map.put("weight", weight);
		if(rate != null)
			map.put("rate", rate);
		if(amount != null)
			map.put("amount", amount);
		if(arrival_date_str != null)
			map.put("arrival_date_str", arrival_date_str);
		if(arrival_date != null)
			map.put("arrival_date", arrival_date);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
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
		community_id = (String) map.get("community_id");
		fin_year = (String) map.get("fin_year");
		f_code = (String) map.get("f_code");
		reference_id = (String) map.get("reference_id");
		voucher_id = (String) map.get("voucher_id");
		particular = (String) map.get("particular");
		type = (String) map.get("type");
		bags = (Integer) map.get("bags");
		weight = (Double) map.get("weight");
		rate = (Double) map.get("rate");
		amount = (Double) map.get("amount");
		arrival_date_str = (String) map.get("arrival_date_str");
		arrival_date = (Long) map.get("arrival_date");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object fin_yearObj = map.get("fin_year");
		if(fin_yearObj != null)
			fin_year = fin_yearObj.toString();

		Object f_codeObj = map.get("f_code");
		if(f_codeObj != null)
			f_code = f_codeObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object voucher_idObj = map.get("voucher_id");
		if(voucher_idObj != null)
			voucher_id = voucher_idObj.toString();

		Object particularObj = map.get("particular");
		if(particularObj != null)
			particular = particularObj.toString();

		Object typeObj = map.get("type");
		if(typeObj != null)
			type = typeObj.toString();

		Object bagsObj = map.get("bags");
		if(bagsObj != null)
			bags = new Integer(bagsObj.toString());

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = new Double(weightObj.toString());

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object arrival_date_strObj = map.get("arrival_date_str");
		if(arrival_date_strObj != null)
			arrival_date_str = arrival_date_strObj.toString();

		Object arrival_dateObj = map.get("arrival_date");
		if(arrival_dateObj != null)
			arrival_date = new Long(arrival_dateObj.toString());

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
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
		if(add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
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

	public String getF_code() {
		return f_code;
	}

	public String getF_codeEx() {
		return f_code != null ? f_code : "";
	}

	public void setF_code(String f_code) {
		this.f_code = f_code;
	}

	public void unSetF_code() {
		this.f_code = null;
	}

	public String getReference_id() {
		return reference_id;
	}

	public String getReference_idEx() {
		return reference_id != null ? reference_id : "";
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public void unSetReference_id() {
		this.reference_id = null;
	}

	public String getVoucher_id() {
		return voucher_id;
	}

	public String getVoucher_idEx() {
		return voucher_id != null ? voucher_id : "";
	}

	public void setVoucher_id(String voucher_id) {
		this.voucher_id = voucher_id;
	}

	public void unSetVoucher_id() {
		this.voucher_id = null;
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

	public Integer getBags() {
		return bags;
	}

	public int getBagsEx() {
		return bags != null ? bags : 0;
	}

	public void setBags(int bags) {
		this.bags = bags;
	}

	public void setBags(Integer bags) {
		this.bags = bags;
	}

	public void unSetBags() {
		this.bags = null;
	}

	public Double getWeight() {
		return weight;
	}

	public double getWeightEx() {
		return weight != null ? weight : 0;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void unSetWeight() {
		this.weight = null;
	}

	public Double getRate() {
		return rate;
	}

	public double getRateEx() {
		return rate != null ? rate : 0;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public void unSetRate() {
		this.rate = null;
	}

	public Double getAmount() {
		return amount;
	}

	public double getAmountEx() {
		return amount != null ? amount : 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void unSetAmount() {
		this.amount = null;
	}

	public String getArrival_date_str() {
		return arrival_date_str;
	}

	public String getArrival_date_strEx() {
		return arrival_date_str != null ? arrival_date_str : "";
	}

	public void setArrival_date_str(String arrival_date_str) {
		this.arrival_date_str = arrival_date_str;
	}

	public void unSetArrival_date_str() {
		this.arrival_date_str = null;
	}

	public Long getArrival_date() {
		return arrival_date;
	}

	public long getArrival_dateEx() {
		return arrival_date != null ? arrival_date : 0L;
	}

	public void setArrival_date(long arrival_date) {
		this.arrival_date = arrival_date;
	}

	public void setArrival_date(Long arrival_date) {
		this.arrival_date = arrival_date;
	}

	public void unSetArrival_date() {
		this.arrival_date = null;
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
		if(extra_data == null)
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