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
public abstract class Baseledgers extends BaseResource {
	private String community_id = null;
	private String fin_year = null;
	private List<application.account.resource.ledger> ledgers = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_FIN_YEAR = "fin_year";
	public static String FIELD_LEDGERS = "ledgers";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("ledgers");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field fin_yearField = new Field("fin_year", "String");
		fin_yearField.setLength(128);
		metaData.addField(fin_yearField);

		Field ledgersField = new Field("ledgers", "Array");
		metaData.addField(ledgersField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("ledgers");

		metaData.setCluster("DB_RECORD");
	}

	public Baseledgers() {}

	public Baseledgers(Baseledgers obj) {
		this.community_id = obj.community_id;
		this.fin_year = obj.fin_year;
		this.ledgers = obj.ledgers;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(community_id != null)
			map.put("community_id", community_id);
		if(fin_year != null)
			map.put("fin_year", fin_year);
		if(ledgers != null)
			map.put("ledgers", ledgers);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(community_id != null)
			map.put("community_id", community_id);
		if(fin_year != null)
			map.put("fin_year", fin_year);
		if(ledgers != null)
			map.put("ledgers", ledgers);
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
		community_id = (String) map.get("community_id");
		fin_year = (String) map.get("fin_year");
		ledgers = (List<application.account.resource.ledger>) map.get("ledgers");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object fin_yearObj = map.get("fin_year");
		if(fin_yearObj != null)
			fin_year = fin_yearObj.toString();

		ledgers = (List<application.account.resource.ledger>) map.get("ledgers");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
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

	public List<application.account.resource.ledger> getLedgers() {
		return ledgers;
	}


	public void setLedgers(List<application.account.resource.ledger> ledgers) {
		this.ledgers = ledgers;
	}

	public void addLedgers(application.account.resource.ledger value) {
		if(ledgers == null)
			ledgers = new ArrayList<application.account.resource.ledger>();
		ledgers.add(value);
	}

	public void unSetLedgers() {
		this.ledgers = null;
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
		return "DB_RECORD";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}