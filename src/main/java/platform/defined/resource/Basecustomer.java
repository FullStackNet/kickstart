/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

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
public abstract class Basecustomer extends BaseResource {
	private String id = null;
	private String name = null;
	private String emailId = null;
	private String mobile_no = null;
	private String address1 = null;
	private String address2 = null;
	private String address3 = null;
	private String city = null;
	private String state = null;
	private String country = null;
	private String remark = null;
	private String fleetService = null;
	private String schoolTrackerService = null;
	private String dgService = null;
	private String brushUpSkillService = null;
	private String gameService = null;
	private String homeAutomationService = null;
	private String customerService = null;
	private String communityService = null;
	private String merchantService = null;
	private String selfOwned = null;
	private String leasedOut = null;
	private String leasedIn = null;
	private String email_account = null;
	private String sms_account = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_NAME = "name";
	public static String FIELD_EMAILID = "emailId";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_ADDRESS3 = "address3";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_FLEETSERVICE = "fleetService";
	public static String FIELD_SCHOOLTRACKERSERVICE = "schoolTrackerService";
	public static String FIELD_DGSERVICE = "dgService";
	public static String FIELD_BRUSHUPSKILLSERVICE = "brushUpSkillService";
	public static String FIELD_GAMESERVICE = "gameService";
	public static String FIELD_HOMEAUTOMATIONSERVICE = "homeAutomationService";
	public static String FIELD_CUSTOMERSERVICE = "customerService";
	public static String FIELD_COMMUNITYSERVICE = "communityService";
	public static String FIELD_MERCHANTSERVICE = "merchantService";
	public static String FIELD_SELFOWNED = "selfOwned";
	public static String FIELD_LEASEDOUT = "leasedOut";
	public static String FIELD_LEASEDIN = "leasedIn";
	public static String FIELD_EMAIL_ACCOUNT = "email_account";
	public static String FIELD_SMS_ACCOUNT = "sms_account";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("customer");

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

		Field emailIdField = new Field("emailId", "String");
		emailIdField.setLength(128);
		metaData.addField(emailIdField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(128);
		metaData.addField(mobile_noField);

		Field address1Field = new Field("address1", "String");
		address1Field.setLength(128);
		metaData.addField(address1Field);

		Field address2Field = new Field("address2", "String");
		address2Field.setLength(128);
		metaData.addField(address2Field);

		Field address3Field = new Field("address3", "String");
		address3Field.setLength(128);
		metaData.addField(address3Field);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(512);
		metaData.addField(remarkField);

		Field fleetServiceField = new Field("fleetService", "String");
		fleetServiceField.setLength(1);
		metaData.addField(fleetServiceField);

		Field schoolTrackerServiceField = new Field("schoolTrackerService", "String");
		schoolTrackerServiceField.setLength(1);
		metaData.addField(schoolTrackerServiceField);

		Field dgServiceField = new Field("dgService", "String");
		dgServiceField.setLength(1);
		metaData.addField(dgServiceField);

		Field brushUpSkillServiceField = new Field("brushUpSkillService", "String");
		brushUpSkillServiceField.setLength(1);
		metaData.addField(brushUpSkillServiceField);

		Field gameServiceField = new Field("gameService", "String");
		gameServiceField.setLength(1);
		metaData.addField(gameServiceField);

		Field homeAutomationServiceField = new Field("homeAutomationService", "String");
		homeAutomationServiceField.setDefaultValue("N");
		homeAutomationServiceField.setLength(1);
		metaData.addField(homeAutomationServiceField);

		Field customerServiceField = new Field("customerService", "String");
		customerServiceField.setDefaultValue("N");
		customerServiceField.setLength(1);
		metaData.addField(customerServiceField);

		Field communityServiceField = new Field("communityService", "String");
		communityServiceField.setDefaultValue("N");
		communityServiceField.setLength(1);
		metaData.addField(communityServiceField);

		Field merchantServiceField = new Field("merchantService", "String");
		merchantServiceField.setDefaultValue("N");
		merchantServiceField.setLength(1);
		metaData.addField(merchantServiceField);

		Field selfOwnedField = new Field("selfOwned", "String");
		selfOwnedField.setLength(1);
		metaData.addField(selfOwnedField);

		Field leasedOutField = new Field("leasedOut", "String");
		leasedOutField.setLength(1);
		metaData.addField(leasedOutField);

		Field leasedInField = new Field("leasedIn", "String");
		leasedInField.setLength(1);
		metaData.addField(leasedInField);

		Field email_accountField = new Field("email_account", "String");
		email_accountField.setLength(128);
		metaData.addField(email_accountField);

		Field sms_accountField = new Field("sms_account", "String");
		sms_accountField.setLength(128);
		metaData.addField(sms_accountField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("customer");

		metaData.setCluster("DB_PROFILE");
	}

	public Basecustomer() {}

	public Basecustomer(Basecustomer obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.emailId = obj.emailId;
		this.mobile_no = obj.mobile_no;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.address3 = obj.address3;
		this.city = obj.city;
		this.state = obj.state;
		this.country = obj.country;
		this.remark = obj.remark;
		this.fleetService = obj.fleetService;
		this.schoolTrackerService = obj.schoolTrackerService;
		this.dgService = obj.dgService;
		this.brushUpSkillService = obj.brushUpSkillService;
		this.gameService = obj.gameService;
		this.homeAutomationService = obj.homeAutomationService;
		this.customerService = obj.customerService;
		this.communityService = obj.communityService;
		this.merchantService = obj.merchantService;
		this.selfOwned = obj.selfOwned;
		this.leasedOut = obj.leasedOut;
		this.leasedIn = obj.leasedIn;
		this.email_account = obj.email_account;
		this.sms_account = obj.sms_account;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(homeAutomationService == null)
			homeAutomationService = "N";
		if(customerService == null)
			customerService = "N";
		if(communityService == null)
			communityService = "N";
		if(merchantService == null)
			merchantService = "N";
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(name != null)
			map.put("name", name);
		if(emailId != null)
			map.put("emailId", emailId);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(remark != null)
			map.put("remark", remark);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(brushUpSkillService != null)
			map.put("brushUpSkillService", brushUpSkillService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(customerService != null)
			map.put("customerService", customerService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(merchantService != null)
			map.put("merchantService", merchantService);
		if(selfOwned != null)
			map.put("selfOwned", selfOwned);
		if(leasedOut != null)
			map.put("leasedOut", leasedOut);
		if(leasedIn != null)
			map.put("leasedIn", leasedIn);
		if(email_account != null)
			map.put("email_account", email_account);
		if(sms_account != null)
			map.put("sms_account", sms_account);
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
		if(emailId != null)
			map.put("emailId", emailId);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(address3 != null)
			map.put("address3", address3);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(country != null)
			map.put("country", country);
		if(remark != null)
			map.put("remark", remark);
		if(fleetService != null)
			map.put("fleetService", fleetService);
		if(schoolTrackerService != null)
			map.put("schoolTrackerService", schoolTrackerService);
		if(dgService != null)
			map.put("dgService", dgService);
		if(brushUpSkillService != null)
			map.put("brushUpSkillService", brushUpSkillService);
		if(gameService != null)
			map.put("gameService", gameService);
		if(homeAutomationService != null)
			map.put("homeAutomationService", homeAutomationService);
		if(customerService != null)
			map.put("customerService", customerService);
		if(communityService != null)
			map.put("communityService", communityService);
		if(merchantService != null)
			map.put("merchantService", merchantService);
		if(selfOwned != null)
			map.put("selfOwned", selfOwned);
		if(leasedOut != null)
			map.put("leasedOut", leasedOut);
		if(leasedIn != null)
			map.put("leasedIn", leasedIn);
		if(email_account != null)
			map.put("email_account", email_account);
		if(sms_account != null)
			map.put("sms_account", sms_account);
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
		emailId = (String) map.get("emailId");
		mobile_no = (String) map.get("mobile_no");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		address3 = (String) map.get("address3");
		city = (String) map.get("city");
		state = (String) map.get("state");
		country = (String) map.get("country");
		remark = (String) map.get("remark");
		fleetService = (String) map.get("fleetService");
		schoolTrackerService = (String) map.get("schoolTrackerService");
		dgService = (String) map.get("dgService");
		brushUpSkillService = (String) map.get("brushUpSkillService");
		gameService = (String) map.get("gameService");
		homeAutomationService = (String) map.get("homeAutomationService");
		customerService = (String) map.get("customerService");
		communityService = (String) map.get("communityService");
		merchantService = (String) map.get("merchantService");
		selfOwned = (String) map.get("selfOwned");
		leasedOut = (String) map.get("leasedOut");
		leasedIn = (String) map.get("leasedIn");
		email_account = (String) map.get("email_account");
		sms_account = (String) map.get("sms_account");
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

		Object emailIdObj = map.get("emailId");
		if(emailIdObj != null)
			emailId = emailIdObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object address1Obj = map.get("address1");
		if(address1Obj != null)
			address1 = address1Obj.toString();

		Object address2Obj = map.get("address2");
		if(address2Obj != null)
			address2 = address2Obj.toString();

		Object address3Obj = map.get("address3");
		if(address3Obj != null)
			address3 = address3Obj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object fleetServiceObj = map.get("fleetService");
		if(fleetServiceObj != null)
			fleetService = fleetServiceObj.toString();

		Object schoolTrackerServiceObj = map.get("schoolTrackerService");
		if(schoolTrackerServiceObj != null)
			schoolTrackerService = schoolTrackerServiceObj.toString();

		Object dgServiceObj = map.get("dgService");
		if(dgServiceObj != null)
			dgService = dgServiceObj.toString();

		Object brushUpSkillServiceObj = map.get("brushUpSkillService");
		if(brushUpSkillServiceObj != null)
			brushUpSkillService = brushUpSkillServiceObj.toString();

		Object gameServiceObj = map.get("gameService");
		if(gameServiceObj != null)
			gameService = gameServiceObj.toString();

		Object homeAutomationServiceObj = map.get("homeAutomationService");
		if(homeAutomationServiceObj != null)
			homeAutomationService = homeAutomationServiceObj.toString();

		Object customerServiceObj = map.get("customerService");
		if(customerServiceObj != null)
			customerService = customerServiceObj.toString();

		Object communityServiceObj = map.get("communityService");
		if(communityServiceObj != null)
			communityService = communityServiceObj.toString();

		Object merchantServiceObj = map.get("merchantService");
		if(merchantServiceObj != null)
			merchantService = merchantServiceObj.toString();

		Object selfOwnedObj = map.get("selfOwned");
		if(selfOwnedObj != null)
			selfOwned = selfOwnedObj.toString();

		Object leasedOutObj = map.get("leasedOut");
		if(leasedOutObj != null)
			leasedOut = leasedOutObj.toString();

		Object leasedInObj = map.get("leasedIn");
		if(leasedInObj != null)
			leasedIn = leasedInObj.toString();

		Object email_accountObj = map.get("email_account");
		if(email_accountObj != null)
			email_account = email_accountObj.toString();

		Object sms_accountObj = map.get("sms_account");
		if(sms_accountObj != null)
			sms_account = sms_accountObj.toString();

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

	public String getEmailId() {
		return emailId;
	}

	public String getEmailIdEx() {
		return emailId != null ? emailId : "";
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void unSetEmailId() {
		this.emailId = null;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getMobile_noEx() {
		return mobile_no != null ? mobile_no : "";
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void unSetMobile_no() {
		this.mobile_no = null;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress1Ex() {
		return address1 != null ? address1 : "";
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void unSetAddress1() {
		this.address1 = null;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress2Ex() {
		return address2 != null ? address2 : "";
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void unSetAddress2() {
		this.address2 = null;
	}

	public String getAddress3() {
		return address3;
	}

	public String getAddress3Ex() {
		return address3 != null ? address3 : "";
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public void unSetAddress3() {
		this.address3 = null;
	}

	public String getCity() {
		return city;
	}

	public String getCityEx() {
		return city != null ? city : "";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void unSetCity() {
		this.city = null;
	}

	public String getState() {
		return state;
	}

	public String getStateEx() {
		return state != null ? state : "";
	}

	public void setState(String state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryEx() {
		return country != null ? country : "";
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void unSetCountry() {
		this.country = null;
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

	public String getFleetService() {
		return fleetService;
	}

	public String getFleetServiceEx() {
		return fleetService != null ? fleetService : "";
	}

	public void setFleetService(String fleetService) {
		this.fleetService = fleetService;
	}

	public void unSetFleetService() {
		this.fleetService = null;
	}

	public String getSchoolTrackerService() {
		return schoolTrackerService;
	}

	public String getSchoolTrackerServiceEx() {
		return schoolTrackerService != null ? schoolTrackerService : "";
	}

	public void setSchoolTrackerService(String schoolTrackerService) {
		this.schoolTrackerService = schoolTrackerService;
	}

	public void unSetSchoolTrackerService() {
		this.schoolTrackerService = null;
	}

	public String getDgService() {
		return dgService;
	}

	public String getDgServiceEx() {
		return dgService != null ? dgService : "";
	}

	public void setDgService(String dgService) {
		this.dgService = dgService;
	}

	public void unSetDgService() {
		this.dgService = null;
	}

	public String getBrushUpSkillService() {
		return brushUpSkillService;
	}

	public String getBrushUpSkillServiceEx() {
		return brushUpSkillService != null ? brushUpSkillService : "";
	}

	public void setBrushUpSkillService(String brushUpSkillService) {
		this.brushUpSkillService = brushUpSkillService;
	}

	public void unSetBrushUpSkillService() {
		this.brushUpSkillService = null;
	}

	public String getGameService() {
		return gameService;
	}

	public String getGameServiceEx() {
		return gameService != null ? gameService : "";
	}

	public void setGameService(String gameService) {
		this.gameService = gameService;
	}

	public void unSetGameService() {
		this.gameService = null;
	}

	public String getHomeAutomationService() {
		return homeAutomationService != null ? homeAutomationService : "N";
	}

	public void setHomeAutomationService(String homeAutomationService) {
		this.homeAutomationService = homeAutomationService;
	}

	public void unSetHomeAutomationService() {
		this.homeAutomationService = "N";
	}

	public String getCustomerService() {
		return customerService != null ? customerService : "N";
	}

	public void setCustomerService(String customerService) {
		this.customerService = customerService;
	}

	public void unSetCustomerService() {
		this.customerService = "N";
	}

	public String getCommunityService() {
		return communityService != null ? communityService : "N";
	}

	public void setCommunityService(String communityService) {
		this.communityService = communityService;
	}

	public void unSetCommunityService() {
		this.communityService = "N";
	}

	public String getMerchantService() {
		return merchantService != null ? merchantService : "N";
	}

	public void setMerchantService(String merchantService) {
		this.merchantService = merchantService;
	}

	public void unSetMerchantService() {
		this.merchantService = "N";
	}

	public String getSelfOwned() {
		return selfOwned;
	}

	public String getSelfOwnedEx() {
		return selfOwned != null ? selfOwned : "";
	}

	public void setSelfOwned(String selfOwned) {
		this.selfOwned = selfOwned;
	}

	public void unSetSelfOwned() {
		this.selfOwned = null;
	}

	public String getLeasedOut() {
		return leasedOut;
	}

	public String getLeasedOutEx() {
		return leasedOut != null ? leasedOut : "";
	}

	public void setLeasedOut(String leasedOut) {
		this.leasedOut = leasedOut;
	}

	public void unSetLeasedOut() {
		this.leasedOut = null;
	}

	public String getLeasedIn() {
		return leasedIn;
	}

	public String getLeasedInEx() {
		return leasedIn != null ? leasedIn : "";
	}

	public void setLeasedIn(String leasedIn) {
		this.leasedIn = leasedIn;
	}

	public void unSetLeasedIn() {
		this.leasedIn = null;
	}

	public String getEmail_account() {
		return email_account;
	}

	public String getEmail_accountEx() {
		return email_account != null ? email_account : "";
	}

	public void setEmail_account(String email_account) {
		this.email_account = email_account;
	}

	public void unSetEmail_account() {
		this.email_account = null;
	}

	public String getSms_account() {
		return sms_account;
	}

	public String getSms_accountEx() {
		return sms_account != null ? sms_account : "";
	}

	public void setSms_account(String sms_account) {
		this.sms_account = sms_account;
	}

	public void unSetSms_account() {
		this.sms_account = null;
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