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
public abstract class Basemandi_auction extends BaseResource {
	private String id = null;
	private String name = null;
	private String description = null;
	private String user_id = null;
	private String user_name = null;
	private String remark = null;
	private Integer bags = null;
	private Integer balance = null;
	private Integer no_of_auction = null;
	private Long upload_time = null;
	private Long download_time = null;
	private Long update_time = null;
	private Double weight = null;
	private String weight_status = null;
	private Double rate = null;
	private String upload_status = null;
	private String download_status = null;
	private String update_status = null;
	private String deleted = null;
	private String backup = null;
	private String backup_patti = null;
	private String backup_sent = null;
	private String party = null;
	private String reference_id = null;
	private String bill_status = null;
	private String patti_status = null;
	private String entry_date = null;
	private String community_id = null;
	private String backup_id = null;
	private Long creation_time = null;
	private Long last_update_time = null;
	private Double amount = null;
	private Double final_amount = null;
	private Double mandi_fee_prct = null;
	private Double mandi_fee_amount = null;
	private Double commission_prct = null;
	private Double commission_amount = null;
	private Double extra_charge_per_bag = null;
	private Double extra_charge_amount = null;
	private String weights = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_DESCRIPTION = "description";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_USER_NAME = "user_name";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_BAGS = "bags";
	public static String FIELD_BALANCE = "balance";
	public static String FIELD_NO_OF_AUCTION = "no_of_auction";
	public static String FIELD_UPLOAD_TIME = "upload_time";
	public static String FIELD_DOWNLOAD_TIME = "download_time";
	public static String FIELD_UPDATE_TIME = "update_time";
	public static String FIELD_WEIGHT = "weight";
	public static String FIELD_WEIGHT_STATUS = "weight_status";
	public static String FIELD_RATE = "rate";
	public static String FIELD_UPLOAD_STATUS = "upload_status";
	public static String FIELD_DOWNLOAD_STATUS = "download_status";
	public static String FIELD_UPDATE_STATUS = "update_status";
	public static String FIELD_DELETED = "deleted";
	public static String FIELD_BACKUP = "backup";
	public static String FIELD_BACKUP_PATTI = "backup_patti";
	public static String FIELD_BACKUP_SENT = "backup_sent";
	public static String FIELD_PARTY = "party";
	public static String FIELD_REFERENCE_ID = "reference_id";
	public static String FIELD_BILL_STATUS = "bill_status";
	public static String FIELD_PATTI_STATUS = "patti_status";
	public static String FIELD_ENTRY_DATE = "entry_date";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_BACKUP_ID = "backup_id";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
	public static String FIELD_AMOUNT = "amount";
	public static String FIELD_FINAL_AMOUNT = "final_amount";
	public static String FIELD_MANDI_FEE_PRCT = "mandi_fee_prct";
	public static String FIELD_MANDI_FEE_AMOUNT = "mandi_fee_amount";
	public static String FIELD_COMMISSION_PRCT = "commission_prct";
	public static String FIELD_COMMISSION_AMOUNT = "commission_amount";
	public static String FIELD_EXTRA_CHARGE_PER_BAG = "extra_charge_per_bag";
	public static String FIELD_EXTRA_CHARGE_AMOUNT = "extra_charge_amount";
	public static String FIELD_WEIGHTS = "weights";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("mandi_auction");

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

		Field descriptionField = new Field("description", "String");
		descriptionField.setLength(128);
		metaData.addField(descriptionField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field user_nameField = new Field("user_name", "String");
		user_nameField.setLength(128);
		metaData.addField(user_nameField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(128);
		metaData.addField(remarkField);

		Field bagsField = new Field("bags", "int");
		metaData.addField(bagsField);

		Field balanceField = new Field("balance", "int");
		metaData.addField(balanceField);

		Field no_of_auctionField = new Field("no_of_auction", "int");
		metaData.addField(no_of_auctionField);

		Field upload_timeField = new Field("upload_time", "long");
		metaData.addField(upload_timeField);

		Field download_timeField = new Field("download_time", "long");
		metaData.addField(download_timeField);

		Field update_timeField = new Field("update_time", "long");
		metaData.addField(update_timeField);

		Field weightField = new Field("weight", "double");
		metaData.addField(weightField);

		Field weight_statusField = new Field("weight_status", "String");
		weight_statusField.setLength(1);
		metaData.addField(weight_statusField);

		Field rateField = new Field("rate", "double");
		metaData.addField(rateField);

		Field upload_statusField = new Field("upload_status", "String");
		upload_statusField.setLength(128);
		metaData.addField(upload_statusField);

		Field download_statusField = new Field("download_status", "String");
		download_statusField.setLength(128);
		metaData.addField(download_statusField);

		Field update_statusField = new Field("update_status", "String");
		update_statusField.setLength(128);
		metaData.addField(update_statusField);

		Field deletedField = new Field("deleted", "String");
		deletedField.setLength(128);
		metaData.addField(deletedField);

		Field backupField = new Field("backup", "String");
		backupField.setLength(128);
		metaData.addField(backupField);

		Field backup_pattiField = new Field("backup_patti", "String");
		backup_pattiField.setLength(128);
		metaData.addField(backup_pattiField);

		Field backup_sentField = new Field("backup_sent", "String");
		backup_sentField.setLength(128);
		metaData.addField(backup_sentField);

		Field partyField = new Field("party", "String");
		partyField.setLength(128);
		metaData.addField(partyField);

		Field reference_idField = new Field("reference_id", "String");
		reference_idField.setLength(128);
		metaData.addField(reference_idField);

		Field bill_statusField = new Field("bill_status", "String");
		bill_statusField.setLength(128);
		metaData.addField(bill_statusField);

		Field patti_statusField = new Field("patti_status", "String");
		patti_statusField.setLength(128);
		metaData.addField(patti_statusField);

		Field entry_dateField = new Field("entry_date", "String");
		entry_dateField.setLength(128);
		metaData.addField(entry_dateField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field backup_idField = new Field("backup_id", "String");
		backup_idField.setLength(128);
		metaData.addField(backup_idField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		creation_timeField.setRequired(true);
		creation_timeField.setDefaultValue("CURRENT_TIMESTAMP");
		metaData.addField(creation_timeField);

		Field last_update_timeField = new Field("last_update_time", "long");
		metaData.addField(last_update_timeField);

		Field amountField = new Field("amount", "double");
		metaData.addField(amountField);

		Field final_amountField = new Field("final_amount", "double");
		metaData.addField(final_amountField);

		Field mandi_fee_prctField = new Field("mandi_fee_prct", "double");
		metaData.addField(mandi_fee_prctField);

		Field mandi_fee_amountField = new Field("mandi_fee_amount", "double");
		metaData.addField(mandi_fee_amountField);

		Field commission_prctField = new Field("commission_prct", "double");
		metaData.addField(commission_prctField);

		Field commission_amountField = new Field("commission_amount", "double");
		metaData.addField(commission_amountField);

		Field extra_charge_per_bagField = new Field("extra_charge_per_bag", "double");
		metaData.addField(extra_charge_per_bagField);

		Field extra_charge_amountField = new Field("extra_charge_amount", "double");
		metaData.addField(extra_charge_amountField);

		Field weightsField = new Field("weights", "String");
		metaData.addField(weightsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("mandi_auction");

		metaData.setCluster("DB_LOG");
	}

	public Basemandi_auction() {}

	public Basemandi_auction(Basemandi_auction obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.description = obj.description;
		this.user_id = obj.user_id;
		this.user_name = obj.user_name;
		this.remark = obj.remark;
		this.bags = obj.bags;
		this.balance = obj.balance;
		this.no_of_auction = obj.no_of_auction;
		this.upload_time = obj.upload_time;
		this.download_time = obj.download_time;
		this.update_time = obj.update_time;
		this.weight = obj.weight;
		this.weight_status = obj.weight_status;
		this.rate = obj.rate;
		this.upload_status = obj.upload_status;
		this.download_status = obj.download_status;
		this.update_status = obj.update_status;
		this.deleted = obj.deleted;
		this.backup = obj.backup;
		this.backup_patti = obj.backup_patti;
		this.backup_sent = obj.backup_sent;
		this.party = obj.party;
		this.reference_id = obj.reference_id;
		this.bill_status = obj.bill_status;
		this.patti_status = obj.patti_status;
		this.entry_date = obj.entry_date;
		this.community_id = obj.community_id;
		this.backup_id = obj.backup_id;
		this.creation_time = obj.creation_time;
		this.last_update_time = obj.last_update_time;
		this.amount = obj.amount;
		this.final_amount = obj.final_amount;
		this.mandi_fee_prct = obj.mandi_fee_prct;
		this.mandi_fee_amount = obj.mandi_fee_amount;
		this.commission_prct = obj.commission_prct;
		this.commission_amount = obj.commission_amount;
		this.extra_charge_per_bag = obj.extra_charge_per_bag;
		this.extra_charge_amount = obj.extra_charge_amount;
		this.weights = obj.weights;
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
		if(description != null)
			map.put("description", description);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(remark != null)
			map.put("remark", remark);
		if(bags != null)
			map.put("bags", bags);
		if(balance != null)
			map.put("balance", balance);
		if(no_of_auction != null)
			map.put("no_of_auction", no_of_auction);
		if(upload_time != null)
			map.put("upload_time", upload_time);
		if(download_time != null)
			map.put("download_time", download_time);
		if(update_time != null)
			map.put("update_time", update_time);
		if(weight != null)
			map.put("weight", weight);
		if(weight_status != null)
			map.put("weight_status", weight_status);
		if(rate != null)
			map.put("rate", rate);
		if(upload_status != null)
			map.put("upload_status", upload_status);
		if(download_status != null)
			map.put("download_status", download_status);
		if(update_status != null)
			map.put("update_status", update_status);
		if(deleted != null)
			map.put("deleted", deleted);
		if(backup != null)
			map.put("backup", backup);
		if(backup_patti != null)
			map.put("backup_patti", backup_patti);
		if(backup_sent != null)
			map.put("backup_sent", backup_sent);
		if(party != null)
			map.put("party", party);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(bill_status != null)
			map.put("bill_status", bill_status);
		if(patti_status != null)
			map.put("patti_status", patti_status);
		if(entry_date != null)
			map.put("entry_date", entry_date);
		if(community_id != null)
			map.put("community_id", community_id);
		if(backup_id != null)
			map.put("backup_id", backup_id);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(amount != null)
			map.put("amount", amount);
		if(final_amount != null)
			map.put("final_amount", final_amount);
		if(mandi_fee_prct != null)
			map.put("mandi_fee_prct", mandi_fee_prct);
		if(mandi_fee_amount != null)
			map.put("mandi_fee_amount", mandi_fee_amount);
		if(commission_prct != null)
			map.put("commission_prct", commission_prct);
		if(commission_amount != null)
			map.put("commission_amount", commission_amount);
		if(extra_charge_per_bag != null)
			map.put("extra_charge_per_bag", extra_charge_per_bag);
		if(extra_charge_amount != null)
			map.put("extra_charge_amount", extra_charge_amount);
		if(weights != null)
			map.put("weights", weights);
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
		if(description != null)
			map.put("description", description);
		if(user_id != null)
			map.put("user_id", user_id);
		if(user_name != null)
			map.put("user_name", user_name);
		if(remark != null)
			map.put("remark", remark);
		if(bags != null)
			map.put("bags", bags);
		if(balance != null)
			map.put("balance", balance);
		if(no_of_auction != null)
			map.put("no_of_auction", no_of_auction);
		if(upload_time != null)
			map.put("upload_time", upload_time);
		if(download_time != null)
			map.put("download_time", download_time);
		if(update_time != null)
			map.put("update_time", update_time);
		if(weight != null)
			map.put("weight", weight);
		if(weight_status != null)
			map.put("weight_status", weight_status);
		if(rate != null)
			map.put("rate", rate);
		if(upload_status != null)
			map.put("upload_status", upload_status);
		if(download_status != null)
			map.put("download_status", download_status);
		if(update_status != null)
			map.put("update_status", update_status);
		if(deleted != null)
			map.put("deleted", deleted);
		if(backup != null)
			map.put("backup", backup);
		if(backup_patti != null)
			map.put("backup_patti", backup_patti);
		if(backup_sent != null)
			map.put("backup_sent", backup_sent);
		if(party != null)
			map.put("party", party);
		if(reference_id != null)
			map.put("reference_id", reference_id);
		if(bill_status != null)
			map.put("bill_status", bill_status);
		if(patti_status != null)
			map.put("patti_status", patti_status);
		if(entry_date != null)
			map.put("entry_date", entry_date);
		if(community_id != null)
			map.put("community_id", community_id);
		if(backup_id != null)
			map.put("backup_id", backup_id);
		if(validateCreation_time(add))
			map.put("creation_time", creation_time);
		if(last_update_time != null)
			map.put("last_update_time", last_update_time);
		if(amount != null)
			map.put("amount", amount);
		if(final_amount != null)
			map.put("final_amount", final_amount);
		if(mandi_fee_prct != null)
			map.put("mandi_fee_prct", mandi_fee_prct);
		if(mandi_fee_amount != null)
			map.put("mandi_fee_amount", mandi_fee_amount);
		if(commission_prct != null)
			map.put("commission_prct", commission_prct);
		if(commission_amount != null)
			map.put("commission_amount", commission_amount);
		if(extra_charge_per_bag != null)
			map.put("extra_charge_per_bag", extra_charge_per_bag);
		if(extra_charge_amount != null)
			map.put("extra_charge_amount", extra_charge_amount);
		if(weights != null)
			map.put("weights", weights);
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
		description = (String) map.get("description");
		user_id = (String) map.get("user_id");
		user_name = (String) map.get("user_name");
		remark = (String) map.get("remark");
		bags = (Integer) map.get("bags");
		balance = (Integer) map.get("balance");
		no_of_auction = (Integer) map.get("no_of_auction");
		upload_time = (Long) map.get("upload_time");
		download_time = (Long) map.get("download_time");
		update_time = (Long) map.get("update_time");
		weight = (Double) map.get("weight");
		weight_status = (String) map.get("weight_status");
		rate = (Double) map.get("rate");
		upload_status = (String) map.get("upload_status");
		download_status = (String) map.get("download_status");
		update_status = (String) map.get("update_status");
		deleted = (String) map.get("deleted");
		backup = (String) map.get("backup");
		backup_patti = (String) map.get("backup_patti");
		backup_sent = (String) map.get("backup_sent");
		party = (String) map.get("party");
		reference_id = (String) map.get("reference_id");
		bill_status = (String) map.get("bill_status");
		patti_status = (String) map.get("patti_status");
		entry_date = (String) map.get("entry_date");
		community_id = (String) map.get("community_id");
		backup_id = (String) map.get("backup_id");
		creation_time = (Long) map.get("creation_time");
		last_update_time = (Long) map.get("last_update_time");
		amount = (Double) map.get("amount");
		final_amount = (Double) map.get("final_amount");
		mandi_fee_prct = (Double) map.get("mandi_fee_prct");
		mandi_fee_amount = (Double) map.get("mandi_fee_amount");
		commission_prct = (Double) map.get("commission_prct");
		commission_amount = (Double) map.get("commission_amount");
		extra_charge_per_bag = (Double) map.get("extra_charge_per_bag");
		extra_charge_amount = (Double) map.get("extra_charge_amount");
		weights = (String) map.get("weights");
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

		Object descriptionObj = map.get("description");
		if(descriptionObj != null)
			description = descriptionObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object user_nameObj = map.get("user_name");
		if(user_nameObj != null)
			user_name = user_nameObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object bagsObj = map.get("bags");
		if(bagsObj != null)
			bags = new Integer(bagsObj.toString());

		Object balanceObj = map.get("balance");
		if(balanceObj != null)
			balance = new Integer(balanceObj.toString());

		Object no_of_auctionObj = map.get("no_of_auction");
		if(no_of_auctionObj != null)
			no_of_auction = new Integer(no_of_auctionObj.toString());

		Object upload_timeObj = map.get("upload_time");
		if(upload_timeObj != null)
			upload_time = new Long(upload_timeObj.toString());

		Object download_timeObj = map.get("download_time");
		if(download_timeObj != null)
			download_time = new Long(download_timeObj.toString());

		Object update_timeObj = map.get("update_time");
		if(update_timeObj != null)
			update_time = new Long(update_timeObj.toString());

		Object weightObj = map.get("weight");
		if(weightObj != null)
			weight = new Double(weightObj.toString());

		Object weight_statusObj = map.get("weight_status");
		if(weight_statusObj != null)
			weight_status = weight_statusObj.toString();

		Object rateObj = map.get("rate");
		if(rateObj != null)
			rate = new Double(rateObj.toString());

		Object upload_statusObj = map.get("upload_status");
		if(upload_statusObj != null)
			upload_status = upload_statusObj.toString();

		Object download_statusObj = map.get("download_status");
		if(download_statusObj != null)
			download_status = download_statusObj.toString();

		Object update_statusObj = map.get("update_status");
		if(update_statusObj != null)
			update_status = update_statusObj.toString();

		Object deletedObj = map.get("deleted");
		if(deletedObj != null)
			deleted = deletedObj.toString();

		Object backupObj = map.get("backup");
		if(backupObj != null)
			backup = backupObj.toString();

		Object backup_pattiObj = map.get("backup_patti");
		if(backup_pattiObj != null)
			backup_patti = backup_pattiObj.toString();

		Object backup_sentObj = map.get("backup_sent");
		if(backup_sentObj != null)
			backup_sent = backup_sentObj.toString();

		Object partyObj = map.get("party");
		if(partyObj != null)
			party = partyObj.toString();

		Object reference_idObj = map.get("reference_id");
		if(reference_idObj != null)
			reference_id = reference_idObj.toString();

		Object bill_statusObj = map.get("bill_status");
		if(bill_statusObj != null)
			bill_status = bill_statusObj.toString();

		Object patti_statusObj = map.get("patti_status");
		if(patti_statusObj != null)
			patti_status = patti_statusObj.toString();

		Object entry_dateObj = map.get("entry_date");
		if(entry_dateObj != null)
			entry_date = entry_dateObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object backup_idObj = map.get("backup_id");
		if(backup_idObj != null)
			backup_id = backup_idObj.toString();

		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = new Long(creation_timeObj.toString());

		Object last_update_timeObj = map.get("last_update_time");
		if(last_update_timeObj != null)
			last_update_time = new Long(last_update_timeObj.toString());

		Object amountObj = map.get("amount");
		if(amountObj != null)
			amount = new Double(amountObj.toString());

		Object final_amountObj = map.get("final_amount");
		if(final_amountObj != null)
			final_amount = new Double(final_amountObj.toString());

		Object mandi_fee_prctObj = map.get("mandi_fee_prct");
		if(mandi_fee_prctObj != null)
			mandi_fee_prct = new Double(mandi_fee_prctObj.toString());

		Object mandi_fee_amountObj = map.get("mandi_fee_amount");
		if(mandi_fee_amountObj != null)
			mandi_fee_amount = new Double(mandi_fee_amountObj.toString());

		Object commission_prctObj = map.get("commission_prct");
		if(commission_prctObj != null)
			commission_prct = new Double(commission_prctObj.toString());

		Object commission_amountObj = map.get("commission_amount");
		if(commission_amountObj != null)
			commission_amount = new Double(commission_amountObj.toString());

		Object extra_charge_per_bagObj = map.get("extra_charge_per_bag");
		if(extra_charge_per_bagObj != null)
			extra_charge_per_bag = new Double(extra_charge_per_bagObj.toString());

		Object extra_charge_amountObj = map.get("extra_charge_amount");
		if(extra_charge_amountObj != null)
			extra_charge_amount = new Double(extra_charge_amountObj.toString());

		Object weightsObj = map.get("weights");
		if(weightsObj != null)
			weights = weightsObj.toString();

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

	public String getDescription() {
		return description;
	}

	public String getDescriptionEx() {
		return description != null ? description : "";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void unSetDescription() {
		this.description = null;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nameEx() {
		return user_name != null ? user_name : "";
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void unSetUser_name() {
		this.user_name = null;
	}

	public String getRemark() {
		return remark;
	}

	public String getRemarkEx() {
		return remark != null ? remark : "";
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void unSetRemark() {
		this.remark = null;
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

	public Integer getBalance() {
		return balance;
	}

	public int getBalanceEx() {
		return balance != null ? balance : 0;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = null;
	}

	public Integer getNo_of_auction() {
		return no_of_auction;
	}

	public int getNo_of_auctionEx() {
		return no_of_auction != null ? no_of_auction : 0;
	}

	public void setNo_of_auction(int no_of_auction) {
		this.no_of_auction = no_of_auction;
	}

	public void setNo_of_auction(Integer no_of_auction) {
		this.no_of_auction = no_of_auction;
	}

	public void unSetNo_of_auction() {
		this.no_of_auction = null;
	}

	public Long getUpload_time() {
		return upload_time;
	}

	public long getUpload_timeEx() {
		return upload_time != null ? upload_time : 0L;
	}

	public void setUpload_time(long upload_time) {
		this.upload_time = upload_time;
	}

	public void setUpload_time(Long upload_time) {
		this.upload_time = upload_time;
	}

	public void unSetUpload_time() {
		this.upload_time = null;
	}

	public Long getDownload_time() {
		return download_time;
	}

	public long getDownload_timeEx() {
		return download_time != null ? download_time : 0L;
	}

	public void setDownload_time(long download_time) {
		this.download_time = download_time;
	}

	public void setDownload_time(Long download_time) {
		this.download_time = download_time;
	}

	public void unSetDownload_time() {
		this.download_time = null;
	}

	public Long getUpdate_time() {
		return update_time;
	}

	public long getUpdate_timeEx() {
		return update_time != null ? update_time : 0L;
	}

	public void setUpdate_time(long update_time) {
		this.update_time = update_time;
	}

	public void setUpdate_time(Long update_time) {
		this.update_time = update_time;
	}

	public void unSetUpdate_time() {
		this.update_time = null;
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

	public String getWeight_status() {
		return weight_status;
	}

	public String getWeight_statusEx() {
		return weight_status != null ? weight_status : "";
	}

	public void setWeight_status(String weight_status) {
		this.weight_status = weight_status;
	}

	public void unSetWeight_status() {
		this.weight_status = null;
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

	public String getUpload_status() {
		return upload_status;
	}

	public String getUpload_statusEx() {
		return upload_status != null ? upload_status : "";
	}

	public void setUpload_status(String upload_status) {
		this.upload_status = upload_status;
	}

	public void unSetUpload_status() {
		this.upload_status = null;
	}

	public String getDownload_status() {
		return download_status;
	}

	public String getDownload_statusEx() {
		return download_status != null ? download_status : "";
	}

	public void setDownload_status(String download_status) {
		this.download_status = download_status;
	}

	public void unSetDownload_status() {
		this.download_status = null;
	}

	public String getUpdate_status() {
		return update_status;
	}

	public String getUpdate_statusEx() {
		return update_status != null ? update_status : "";
	}

	public void setUpdate_status(String update_status) {
		this.update_status = update_status;
	}

	public void unSetUpdate_status() {
		this.update_status = null;
	}

	public String getDeleted() {
		return deleted;
	}

	public String getDeletedEx() {
		return deleted != null ? deleted : "";
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public void unSetDeleted() {
		this.deleted = null;
	}

	public String getBackup() {
		return backup;
	}

	public String getBackupEx() {
		return backup != null ? backup : "";
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public void unSetBackup() {
		this.backup = null;
	}

	public String getBackup_patti() {
		return backup_patti;
	}

	public String getBackup_pattiEx() {
		return backup_patti != null ? backup_patti : "";
	}

	public void setBackup_patti(String backup_patti) {
		this.backup_patti = backup_patti;
	}

	public void unSetBackup_patti() {
		this.backup_patti = null;
	}

	public String getBackup_sent() {
		return backup_sent;
	}

	public String getBackup_sentEx() {
		return backup_sent != null ? backup_sent : "";
	}

	public void setBackup_sent(String backup_sent) {
		this.backup_sent = backup_sent;
	}

	public void unSetBackup_sent() {
		this.backup_sent = null;
	}

	public String getParty() {
		return party;
	}

	public String getPartyEx() {
		return party != null ? party : "";
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void unSetParty() {
		this.party = null;
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

	public String getBill_status() {
		return bill_status;
	}

	public String getBill_statusEx() {
		return bill_status != null ? bill_status : "";
	}

	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}

	public void unSetBill_status() {
		this.bill_status = null;
	}

	public String getPatti_status() {
		return patti_status;
	}

	public String getPatti_statusEx() {
		return patti_status != null ? patti_status : "";
	}

	public void setPatti_status(String patti_status) {
		this.patti_status = patti_status;
	}

	public void unSetPatti_status() {
		this.patti_status = null;
	}

	public String getEntry_date() {
		return entry_date;
	}

	public String getEntry_dateEx() {
		return entry_date != null ? entry_date : "";
	}

	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}

	public void unSetEntry_date() {
		this.entry_date = null;
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

	public String getBackup_id() {
		return backup_id;
	}

	public String getBackup_idEx() {
		return backup_id != null ? backup_id : "";
	}

	public void setBackup_id(String backup_id) {
		this.backup_id = backup_id;
	}

	public void unSetBackup_id() {
		this.backup_id = null;
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

	public Long getLast_update_time() {
		return last_update_time;
	}

	public long getLast_update_timeEx() {
		return last_update_time != null ? last_update_time : 0L;
	}

	public void setLast_update_time(long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void setLast_update_time(Long last_update_time) {
		this.last_update_time = last_update_time;
	}

	public void unSetLast_update_time() {
		this.last_update_time = null;
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

	public Double getFinal_amount() {
		return final_amount;
	}

	public double getFinal_amountEx() {
		return final_amount != null ? final_amount : 0;
	}

	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}

	public void setFinal_amount(Double final_amount) {
		this.final_amount = final_amount;
	}

	public void unSetFinal_amount() {
		this.final_amount = null;
	}

	public Double getMandi_fee_prct() {
		return mandi_fee_prct;
	}

	public double getMandi_fee_prctEx() {
		return mandi_fee_prct != null ? mandi_fee_prct : 0;
	}

	public void setMandi_fee_prct(double mandi_fee_prct) {
		this.mandi_fee_prct = mandi_fee_prct;
	}

	public void setMandi_fee_prct(Double mandi_fee_prct) {
		this.mandi_fee_prct = mandi_fee_prct;
	}

	public void unSetMandi_fee_prct() {
		this.mandi_fee_prct = null;
	}

	public Double getMandi_fee_amount() {
		return mandi_fee_amount;
	}

	public double getMandi_fee_amountEx() {
		return mandi_fee_amount != null ? mandi_fee_amount : 0;
	}

	public void setMandi_fee_amount(double mandi_fee_amount) {
		this.mandi_fee_amount = mandi_fee_amount;
	}

	public void setMandi_fee_amount(Double mandi_fee_amount) {
		this.mandi_fee_amount = mandi_fee_amount;
	}

	public void unSetMandi_fee_amount() {
		this.mandi_fee_amount = null;
	}

	public Double getCommission_prct() {
		return commission_prct;
	}

	public double getCommission_prctEx() {
		return commission_prct != null ? commission_prct : 0;
	}

	public void setCommission_prct(double commission_prct) {
		this.commission_prct = commission_prct;
	}

	public void setCommission_prct(Double commission_prct) {
		this.commission_prct = commission_prct;
	}

	public void unSetCommission_prct() {
		this.commission_prct = null;
	}

	public Double getCommission_amount() {
		return commission_amount;
	}

	public double getCommission_amountEx() {
		return commission_amount != null ? commission_amount : 0;
	}

	public void setCommission_amount(double commission_amount) {
		this.commission_amount = commission_amount;
	}

	public void setCommission_amount(Double commission_amount) {
		this.commission_amount = commission_amount;
	}

	public void unSetCommission_amount() {
		this.commission_amount = null;
	}

	public Double getExtra_charge_per_bag() {
		return extra_charge_per_bag;
	}

	public double getExtra_charge_per_bagEx() {
		return extra_charge_per_bag != null ? extra_charge_per_bag : 0;
	}

	public void setExtra_charge_per_bag(double extra_charge_per_bag) {
		this.extra_charge_per_bag = extra_charge_per_bag;
	}

	public void setExtra_charge_per_bag(Double extra_charge_per_bag) {
		this.extra_charge_per_bag = extra_charge_per_bag;
	}

	public void unSetExtra_charge_per_bag() {
		this.extra_charge_per_bag = null;
	}

	public Double getExtra_charge_amount() {
		return extra_charge_amount;
	}

	public double getExtra_charge_amountEx() {
		return extra_charge_amount != null ? extra_charge_amount : 0;
	}

	public void setExtra_charge_amount(double extra_charge_amount) {
		this.extra_charge_amount = extra_charge_amount;
	}

	public void setExtra_charge_amount(Double extra_charge_amount) {
		this.extra_charge_amount = extra_charge_amount;
	}

	public void unSetExtra_charge_amount() {
		this.extra_charge_amount = null;
	}

	public String getWeights() {
		return weights;
	}

	public String getWeightsEx() {
		return weights != null ? weights : "";
	}

	public void setWeights(String weights) {
		this.weights = weights;
	}

	public void unSetWeights() {
		this.weights = null;
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
		return "DB_LOG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}