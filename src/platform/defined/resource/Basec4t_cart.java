/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basec4t_cart extends BaseResource {
	private String id = null;
	private String company_id = null;
	private String community_id = null;
	private String name = null;
	private String photo_url = null;
	private String table_no = null;
	private String mobile_no = null;
	private String address1 = null;
	private String address2 = null;
	private String area = null;
	private String city = null;
	private String state = null;
	private String delivery_time = null;
	private String country = null;
	private String remark = null;
	private String zip_code = null;
	private String land_mark = null;
	private String order_type = null;
	private Long no_of_products = null;
	private Long no_of_items = null;
	private Double total_amount = null;
	private Double total_vat = null;
	private Double total_service_tax = null;
	private Double total_service_charge = null;
	private List<platform.resource.c4t_cart_item> cart_items = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMPANY_ID = "company_id";
	public static String FIELD_COMMUNITY_ID = "community_id";
	public static String FIELD_NAME = "name";
	public static String FIELD_PHOTO_URL = "photo_url";
	public static String FIELD_TABLE_NO = "table_no";
	public static String FIELD_MOBILE_NO = "mobile_no";
	public static String FIELD_ADDRESS1 = "address1";
	public static String FIELD_ADDRESS2 = "address2";
	public static String FIELD_AREA = "area";
	public static String FIELD_CITY = "city";
	public static String FIELD_STATE = "state";
	public static String FIELD_DELIVERY_TIME = "delivery_time";
	public static String FIELD_COUNTRY = "country";
	public static String FIELD_REMARK = "remark";
	public static String FIELD_ZIP_CODE = "zip_code";
	public static String FIELD_LAND_MARK = "land_mark";
	public static String FIELD_ORDER_TYPE = "order_type";
	public static String FIELD_NO_OF_PRODUCTS = "no_of_products";
	public static String FIELD_NO_OF_ITEMS = "no_of_items";
	public static String FIELD_TOTAL_AMOUNT = "total_amount";
	public static String FIELD_TOTAL_VAT = "total_vat";
	public static String FIELD_TOTAL_SERVICE_TAX = "total_service_tax";
	public static String FIELD_TOTAL_SERVICE_CHARGE = "total_service_charge";
	public static String FIELD_CART_ITEMS = "cart_items";
	public static String FIELD_CREATION_TIME = "creation_time";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("c4t_cart");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field company_idField = new Field("company_id", "String");
		company_idField.setRequired(true);
		company_idField.setLength(128);
		metaData.addField(company_idField);

		Field community_idField = new Field("community_id", "String");
		community_idField.setRequired(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

		Field nameField = new Field("name", "String");
		nameField.setLength(256);
		metaData.addField(nameField);

		Field photo_urlField = new Field("photo_url", "String");
		photo_urlField.setLength(256);
		metaData.addField(photo_urlField);

		Field table_noField = new Field("table_no", "String");
		table_noField.setLength(256);
		metaData.addField(table_noField);

		Field mobile_noField = new Field("mobile_no", "String");
		mobile_noField.setLength(256);
		metaData.addField(mobile_noField);

		Field address1Field = new Field("address1", "String");
		address1Field.setLength(256);
		metaData.addField(address1Field);

		Field address2Field = new Field("address2", "String");
		address2Field.setLength(256);
		metaData.addField(address2Field);

		Field areaField = new Field("area", "String");
		areaField.setLength(128);
		metaData.addField(areaField);

		Field cityField = new Field("city", "String");
		cityField.setLength(128);
		metaData.addField(cityField);

		Field stateField = new Field("state", "String");
		stateField.setLength(128);
		metaData.addField(stateField);

		Field delivery_timeField = new Field("delivery_time", "String");
		delivery_timeField.setLength(128);
		metaData.addField(delivery_timeField);

		Field countryField = new Field("country", "String");
		countryField.setLength(128);
		metaData.addField(countryField);

		Field remarkField = new Field("remark", "String");
		remarkField.setLength(4096);
		metaData.addField(remarkField);

		Field zip_codeField = new Field("zip_code", "String");
		zip_codeField.setLength(10);
		metaData.addField(zip_codeField);

		Field land_markField = new Field("land_mark", "String");
		land_markField.setLength(128);
		metaData.addField(land_markField);

		Field order_typeField = new Field("order_type", "String");
		order_typeField.setRequired(true);
		order_typeField.setLength(128);
		metaData.addField(order_typeField);

		Field no_of_productsField = new Field("no_of_products", "long");
		metaData.addField(no_of_productsField);

		Field no_of_itemsField = new Field("no_of_items", "long");
		metaData.addField(no_of_itemsField);

		Field total_amountField = new Field("total_amount", "double");
		metaData.addField(total_amountField);

		Field total_vatField = new Field("total_vat", "double");
		metaData.addField(total_vatField);

		Field total_service_taxField = new Field("total_service_tax", "double");
		metaData.addField(total_service_taxField);

		Field total_service_chargeField = new Field("total_service_charge", "double");
		metaData.addField(total_service_chargeField);

		Field cart_itemsField = new Field("cart_items", "Array");
		metaData.addField(cart_itemsField);

		Field creation_timeField = new Field("creation_time", "timestamp");
		metaData.addField(creation_timeField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("c4t_cart");

		metaData.setCluster("DB_RECORD");
	}

	public Basec4t_cart() {}

	public Basec4t_cart(Basec4t_cart obj) {
		this.id = obj.id;
		this.company_id = obj.company_id;
		this.community_id = obj.community_id;
		this.name = obj.name;
		this.photo_url = obj.photo_url;
		this.table_no = obj.table_no;
		this.mobile_no = obj.mobile_no;
		this.address1 = obj.address1;
		this.address2 = obj.address2;
		this.area = obj.area;
		this.city = obj.city;
		this.state = obj.state;
		this.delivery_time = obj.delivery_time;
		this.country = obj.country;
		this.remark = obj.remark;
		this.zip_code = obj.zip_code;
		this.land_mark = obj.land_mark;
		this.order_type = obj.order_type;
		this.no_of_products = obj.no_of_products;
		this.no_of_items = obj.no_of_items;
		this.total_amount = obj.total_amount;
		this.total_vat = obj.total_vat;
		this.total_service_tax = obj.total_service_tax;
		this.total_service_charge = obj.total_service_charge;
		this.cart_items = obj.cart_items;
		this.creation_time = obj.creation_time;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(company_id != null)
			map.put("company_id", company_id);
		if(community_id != null)
			map.put("community_id", community_id);
		if(name != null)
			map.put("name", name);
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(table_no != null)
			map.put("table_no", table_no);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(country != null)
			map.put("country", country);
		if(remark != null)
			map.put("remark", remark);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(land_mark != null)
			map.put("land_mark", land_mark);
		if(order_type != null)
			map.put("order_type", order_type);
		if(no_of_products != null)
			map.put("no_of_products", no_of_products);
		if(no_of_items != null)
			map.put("no_of_items", no_of_items);
		if(total_amount != null)
			map.put("total_amount", total_amount);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_service_tax != null)
			map.put("total_service_tax", total_service_tax);
		if(total_service_charge != null)
			map.put("total_service_charge", total_service_charge);
		if(cart_items != null)
			map.put("cart_items", cart_items);
		if(creation_time != null)
			map.put("creation_time", creation_time);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(validateCompany_id(add))
			map.put("company_id", company_id);
		if(validateCommunity_id(add))
			map.put("community_id", community_id);
		if(name != null)
			map.put("name", name);
		if(photo_url != null)
			map.put("photo_url", photo_url);
		if(table_no != null)
			map.put("table_no", table_no);
		if(mobile_no != null)
			map.put("mobile_no", mobile_no);
		if(address1 != null)
			map.put("address1", address1);
		if(address2 != null)
			map.put("address2", address2);
		if(area != null)
			map.put("area", area);
		if(city != null)
			map.put("city", city);
		if(state != null)
			map.put("state", state);
		if(delivery_time != null)
			map.put("delivery_time", delivery_time);
		if(country != null)
			map.put("country", country);
		if(remark != null)
			map.put("remark", remark);
		if(zip_code != null)
			map.put("zip_code", zip_code);
		if(land_mark != null)
			map.put("land_mark", land_mark);
		if(validateOrder_type(add))
			map.put("order_type", order_type);
		if(no_of_products != null)
			map.put("no_of_products", no_of_products);
		if(no_of_items != null)
			map.put("no_of_items", no_of_items);
		if(total_amount != null)
			map.put("total_amount", total_amount);
		if(total_vat != null)
			map.put("total_vat", total_vat);
		if(total_service_tax != null)
			map.put("total_service_tax", total_service_tax);
		if(total_service_charge != null)
			map.put("total_service_charge", total_service_charge);
		if(cart_items != null)
			map.put("cart_items", cart_items);
		if(creation_time != null)
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
		company_id = (String) map.get("company_id");
		community_id = (String) map.get("community_id");
		name = (String) map.get("name");
		photo_url = (String) map.get("photo_url");
		table_no = (String) map.get("table_no");
		mobile_no = (String) map.get("mobile_no");
		address1 = (String) map.get("address1");
		address2 = (String) map.get("address2");
		area = (String) map.get("area");
		city = (String) map.get("city");
		state = (String) map.get("state");
		delivery_time = (String) map.get("delivery_time");
		country = (String) map.get("country");
		remark = (String) map.get("remark");
		zip_code = (String) map.get("zip_code");
		land_mark = (String) map.get("land_mark");
		order_type = (String) map.get("order_type");
		no_of_products = (Long) map.get("no_of_products");
		no_of_items = (Long) map.get("no_of_items");
		total_amount = (Double) map.get("total_amount");
		total_vat = (Double) map.get("total_vat");
		total_service_tax = (Double) map.get("total_service_tax");
		total_service_charge = (Double) map.get("total_service_charge");
		cart_items = (List<platform.resource.c4t_cart_item>) map.get("cart_items");
		creation_time = (Long) map.get("creation_time");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object company_idObj = map.get("company_id");
		if(company_idObj != null)
			company_id = company_idObj.toString();

		Object community_idObj = map.get("community_id");
		if(community_idObj != null)
			community_id = community_idObj.toString();

		Object nameObj = map.get("name");
		if(nameObj != null)
			name = nameObj.toString();

		Object photo_urlObj = map.get("photo_url");
		if(photo_urlObj != null)
			photo_url = photo_urlObj.toString();

		Object table_noObj = map.get("table_no");
		if(table_noObj != null)
			table_no = table_noObj.toString();

		Object mobile_noObj = map.get("mobile_no");
		if(mobile_noObj != null)
			mobile_no = mobile_noObj.toString();

		Object address1Obj = map.get("address1");
		if(address1Obj != null)
			address1 = address1Obj.toString();

		Object address2Obj = map.get("address2");
		if(address2Obj != null)
			address2 = address2Obj.toString();

		Object areaObj = map.get("area");
		if(areaObj != null)
			area = areaObj.toString();

		Object cityObj = map.get("city");
		if(cityObj != null)
			city = cityObj.toString();

		Object stateObj = map.get("state");
		if(stateObj != null)
			state = stateObj.toString();

		Object delivery_timeObj = map.get("delivery_time");
		if(delivery_timeObj != null)
			delivery_time = delivery_timeObj.toString();

		Object countryObj = map.get("country");
		if(countryObj != null)
			country = countryObj.toString();

		Object remarkObj = map.get("remark");
		if(remarkObj != null)
			remark = remarkObj.toString();

		Object zip_codeObj = map.get("zip_code");
		if(zip_codeObj != null)
			zip_code = zip_codeObj.toString();

		Object land_markObj = map.get("land_mark");
		if(land_markObj != null)
			land_mark = land_markObj.toString();

		Object order_typeObj = map.get("order_type");
		if(order_typeObj != null)
			order_type = order_typeObj.toString();

		Object no_of_productsObj = map.get("no_of_products");
		if(no_of_productsObj != null)
			no_of_products = new Long(no_of_productsObj.toString());

		Object no_of_itemsObj = map.get("no_of_items");
		if(no_of_itemsObj != null)
			no_of_items = new Long(no_of_itemsObj.toString());

		Object total_amountObj = map.get("total_amount");
		if(total_amountObj != null)
			total_amount = new Double(total_amountObj.toString());

		Object total_vatObj = map.get("total_vat");
		if(total_vatObj != null)
			total_vat = new Double(total_vatObj.toString());

		Object total_service_taxObj = map.get("total_service_tax");
		if(total_service_taxObj != null)
			total_service_tax = new Double(total_service_taxObj.toString());

		Object total_service_chargeObj = map.get("total_service_charge");
		if(total_service_chargeObj != null)
			total_service_charge = new Double(total_service_chargeObj.toString());

		cart_items = (List<platform.resource.c4t_cart_item>) map.get("cart_items");
		Object creation_timeObj = map.get("creation_time");
		if(creation_timeObj != null)
			creation_time = (Long) creation_timeObj;

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

	public String getCompany_id() {
		return company_id;
	}

	public String getCompany_idEx() {
		return company_id != null ? company_id : "";
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public void unSetCompany_id() {
		this.company_id = null;
	}

	public boolean validateCompany_id(boolean add) throws ApplicationException {
		if(add && company_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[company_id]");
		return company_id != null;
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

	public boolean validateCommunity_id(boolean add) throws ApplicationException {
		if(add && community_id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[community_id]");
		return community_id != null;
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

	public String getPhoto_url() {
		return photo_url;
	}

	public String getPhoto_urlEx() {
		return photo_url != null ? photo_url : "";
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public void unSetPhoto_url() {
		this.photo_url = null;
	}

	public String getTable_no() {
		return table_no;
	}

	public String getTable_noEx() {
		return table_no != null ? table_no : "";
	}

	public void setTable_no(String table_no) {
		this.table_no = table_no;
	}

	public void unSetTable_no() {
		this.table_no = null;
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

	public String getArea() {
		return area;
	}

	public String getAreaEx() {
		return area != null ? area : "";
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void unSetArea() {
		this.area = null;
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

	public String getDelivery_time() {
		return delivery_time;
	}

	public String getDelivery_timeEx() {
		return delivery_time != null ? delivery_time : "";
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public void unSetDelivery_time() {
		this.delivery_time = null;
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

	public String getZip_code() {
		return zip_code;
	}

	public String getZip_codeEx() {
		return zip_code != null ? zip_code : "";
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public void unSetZip_code() {
		this.zip_code = null;
	}

	public String getLand_mark() {
		return land_mark;
	}

	public String getLand_markEx() {
		return land_mark != null ? land_mark : "";
	}

	public void setLand_mark(String land_mark) {
		this.land_mark = land_mark;
	}

	public void unSetLand_mark() {
		this.land_mark = null;
	}

	public String getOrder_type() {
		return order_type;
	}

	public String getOrder_typeEx() {
		return order_type != null ? order_type : "";
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public void unSetOrder_type() {
		this.order_type = null;
	}

	public boolean validateOrder_type(boolean add) throws ApplicationException {
		if(add && order_type == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[order_type]");
		return order_type != null;
	}

	public Long getNo_of_products() {
		return no_of_products;
	}

	public long getNo_of_productsEx() {
		return no_of_products != null ? no_of_products : 0L;
	}

	public void setNo_of_products(long no_of_products) {
		this.no_of_products = no_of_products;
	}

	public void setNo_of_products(Long no_of_products) {
		this.no_of_products = no_of_products;
	}

	public void unSetNo_of_products() {
		this.no_of_products = null;
	}

	public Long getNo_of_items() {
		return no_of_items;
	}

	public long getNo_of_itemsEx() {
		return no_of_items != null ? no_of_items : 0L;
	}

	public void setNo_of_items(long no_of_items) {
		this.no_of_items = no_of_items;
	}

	public void setNo_of_items(Long no_of_items) {
		this.no_of_items = no_of_items;
	}

	public void unSetNo_of_items() {
		this.no_of_items = null;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public double getTotal_amountEx() {
		return total_amount != null ? total_amount : 0;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}

	public void unSetTotal_amount() {
		this.total_amount = null;
	}

	public Double getTotal_vat() {
		return total_vat;
	}

	public double getTotal_vatEx() {
		return total_vat != null ? total_vat : 0;
	}

	public void setTotal_vat(double total_vat) {
		this.total_vat = total_vat;
	}

	public void setTotal_vat(Double total_vat) {
		this.total_vat = total_vat;
	}

	public void unSetTotal_vat() {
		this.total_vat = null;
	}

	public Double getTotal_service_tax() {
		return total_service_tax;
	}

	public double getTotal_service_taxEx() {
		return total_service_tax != null ? total_service_tax : 0;
	}

	public void setTotal_service_tax(double total_service_tax) {
		this.total_service_tax = total_service_tax;
	}

	public void setTotal_service_tax(Double total_service_tax) {
		this.total_service_tax = total_service_tax;
	}

	public void unSetTotal_service_tax() {
		this.total_service_tax = null;
	}

	public Double getTotal_service_charge() {
		return total_service_charge;
	}

	public double getTotal_service_chargeEx() {
		return total_service_charge != null ? total_service_charge : 0;
	}

	public void setTotal_service_charge(double total_service_charge) {
		this.total_service_charge = total_service_charge;
	}

	public void setTotal_service_charge(Double total_service_charge) {
		this.total_service_charge = total_service_charge;
	}

	public void unSetTotal_service_charge() {
		this.total_service_charge = null;
	}

	public List<platform.resource.c4t_cart_item> getCart_items() {
		return cart_items;
	}


	public void setCart_items(List<platform.resource.c4t_cart_item> cart_items) {
		this.cart_items = cart_items;
	}

	public void addCart_items(platform.resource.c4t_cart_item value) {
		if(cart_items == null)
			cart_items = new ArrayList<platform.resource.c4t_cart_item>();
		cart_items.add(value);
	}

	public void unSetCart_items() {
		this.cart_items = null;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Long creation_time) {
		this.creation_time = creation_time;
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