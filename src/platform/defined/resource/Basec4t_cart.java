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
import platform.resource.c4t_cart_item;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basec4t_cart extends BaseResource {
	private String id = null;
	private String community_id = null;
	private String order_type = null;
	private Long no_of_products = null;
	private Long no_of_items = null;
	private Double total_amount = null;
	private Double total_vat = null;
	private Double total_service_tax = null;
	private Double total_service_charge = null;
	private List<c4t_cart_item> cart_items = null;
	private Long creation_time = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_COMMUNITY_ID = "community_id";
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

		Field community_idField = new Field("community_id", "String");
		community_idField.setRequired(true);
		community_idField.setLength(128);
		metaData.addField(community_idField);

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
		this.community_id = obj.community_id;
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
		if(community_id != null)
			map.put("community_id", community_id);
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
		if(validateCommunity_id(add))
			map.put("community_id", community_id);
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
		community_id = (String) map.get("community_id");
		order_type = (String) map.get("order_type");
		no_of_products = (Long) map.get("no_of_products");
		no_of_items = (Long) map.get("no_of_items");
		total_amount = (Double) map.get("total_amount");
		total_vat = (Double) map.get("total_vat");
		total_service_tax = (Double) map.get("total_service_tax");
		total_service_charge = (Double) map.get("total_service_charge");
		cart_items = (List<c4t_cart_item>) map.get("cart_items");
		creation_time = (Long) map.get("creation_time");
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

		cart_items = (List<c4t_cart_item>) map.get("cart_items");
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

	public List<c4t_cart_item> getCart_items() {
		return cart_items;
	}


	public void setCart_items(List<c4t_cart_item> cart_items) {
		this.cart_items = cart_items;
	}

	public void addCart_items(c4t_cart_item value) {
		if(cart_items == null)
			cart_items = new ArrayList<c4t_cart_item>();
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