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
public abstract class Basemandi_arrival extends BaseResource {
    private String id = null;
    private String fin_year = null;
    private String account_id = null;
    private String code = null;
    private String arrival_date_str = null;
    private Long arrival_date = null;
    private String name = null;
    private String address = null;
    private String type = null;
    private String community_id = null;
    private String community_name = null;
    private Integer bags = null;
    private Double expense = null;
    private Double freight = null;
    private Double advance = null;
    private Long last_update_time = null;
    private Long creation_time = null;
    private Map<String, Object> extra_data = null;

    public static String FIELD_ID = "id";
    public static String FIELD_FIN_YEAR = "fin_year";
    public static String FIELD_ACCOUNT_ID = "account_id";
    public static String FIELD_CODE = "code";
    public static String FIELD_ARRIVAL_DATE_STR = "arrival_date_str";
    public static String FIELD_ARRIVAL_DATE = "arrival_date";
    public static String FIELD_NAME = "name";
    public static String FIELD_ADDRESS = "address";
    public static String FIELD_TYPE = "type";
    public static String FIELD_COMMUNITY_ID = "community_id";
    public static String FIELD_COMMUNITY_NAME = "community_name";
    public static String FIELD_BAGS = "bags";
    public static String FIELD_EXPENSE = "expense";
    public static String FIELD_FREIGHT = "freight";
    public static String FIELD_ADVANCE = "advance";
    public static String FIELD_LAST_UPDATE_TIME = "last_update_time";
    public static String FIELD_CREATION_TIME = "creation_time";
    public static String FIELD_EXTRA_DATA = "extra_data";

    private static final long serialVersionUID = 1L;
    private final static ResourceMetaData metaData = new ResourceMetaData("mandi_arrival");

    static {
        metaData.setCheckBeforeAdd(false);
        metaData.setCheckBeforeUpdate(false);
        Field idField = new Field("id", "String");
        idField.setRequired(true);
        idField.setLength(128);
        metaData.addField(idField);

        Field fin_yearField = new Field("fin_year", "String");
        fin_yearField.setLength(128);
        metaData.addField(fin_yearField);

        Field account_idField = new Field("account_id", "String");
        account_idField.setLength(128);
        metaData.addField(account_idField);

        Field codeField = new Field("code", "String");
        codeField.setLength(128);
        metaData.addField(codeField);

        Field arrival_date_strField = new Field("arrival_date_str", "String");
        arrival_date_strField.setLength(128);
        metaData.addField(arrival_date_strField);

        Field arrival_dateField = new Field("arrival_date", "long");
        metaData.addField(arrival_dateField);

        Field nameField = new Field("name", "String");
        nameField.setLength(128);
        metaData.addField(nameField);

        Field addressField = new Field("address", "String");
        addressField.setLength(128);
        metaData.addField(addressField);

        Field typeField = new Field("type", "String");
        typeField.setLength(128);
        metaData.addField(typeField);

        Field community_idField = new Field("community_id", "String");
        community_idField.setLength(128);
        metaData.addField(community_idField);

        Field community_nameField = new Field("community_name", "String");
        community_nameField.setLength(128);
        metaData.addField(community_nameField);

        Field bagsField = new Field("bags", "int");
        metaData.addField(bagsField);

        Field expenseField = new Field("expense", "double");
        metaData.addField(expenseField);

        Field freightField = new Field("freight", "double");
        metaData.addField(freightField);

        Field advanceField = new Field("advance", "double");
        metaData.addField(advanceField);

        Field last_update_timeField = new Field("last_update_time", "long");
        metaData.addField(last_update_timeField);

        Field creation_timeField = new Field("creation_time", "long");
        metaData.addField(creation_timeField);

        Field extra_dataField = new Field("extra_data", "Map");
        extra_dataField.setValueType("Object");
        metaData.addField(extra_dataField);


        metaData.setTableName("mandi_arrival");

        metaData.setCluster("DB_LOG");
    }

    public Basemandi_arrival() {
    }

    public Basemandi_arrival(Basemandi_arrival obj) {
        this.id = obj.id;
        this.fin_year = obj.fin_year;
        this.account_id = obj.account_id;
        this.code = obj.code;
        this.arrival_date_str = obj.arrival_date_str;
        this.arrival_date = obj.arrival_date;
        this.name = obj.name;
        this.address = obj.address;
        this.type = obj.type;
        this.community_id = obj.community_id;
        this.community_name = obj.community_name;
        this.bags = obj.bags;
        this.expense = obj.expense;
        this.freight = obj.freight;
        this.advance = obj.advance;
        this.last_update_time = obj.last_update_time;
        this.creation_time = obj.creation_time;
        this.extra_data = obj.extra_data;
    }

    public ResourceMetaData getMetaData() {
        return metaData;
    }

    public Map<String, Object> convertResourceToMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        if (id != null)
            map.put("id", id);
        if (fin_year != null)
            map.put("fin_year", fin_year);
        if (account_id != null)
            map.put("account_id", account_id);
        if (code != null)
            map.put("code", code);
        if (arrival_date_str != null)
            map.put("arrival_date_str", arrival_date_str);
        if (arrival_date != null)
            map.put("arrival_date", arrival_date);
        if (name != null)
            map.put("name", name);
        if (address != null)
            map.put("address", address);
        if (type != null)
            map.put("type", type);
        if (community_id != null)
            map.put("community_id", community_id);
        if (community_name != null)
            map.put("community_name", community_name);
        if (bags != null)
            map.put("bags", bags);
        if (expense != null)
            map.put("expense", expense);
        if (freight != null)
            map.put("freight", freight);
        if (advance != null)
            map.put("advance", advance);
        if (last_update_time != null)
            map.put("last_update_time", last_update_time);
        if (creation_time != null)
            map.put("creation_time", creation_time);
        if (extra_data != null)
            map.put("extra_data", extra_data);
        return map;
    }

    public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        if (validateId(add))
            map.put("id", id);
        if (fin_year != null)
            map.put("fin_year", fin_year);
        if (account_id != null)
            map.put("account_id", account_id);
        if (code != null)
            map.put("code", code);
        if (arrival_date_str != null)
            map.put("arrival_date_str", arrival_date_str);
        if (arrival_date != null)
            map.put("arrival_date", arrival_date);
        if (name != null)
            map.put("name", name);
        if (address != null)
            map.put("address", address);
        if (type != null)
            map.put("type", type);
        if (community_id != null)
            map.put("community_id", community_id);
        if (community_name != null)
            map.put("community_name", community_name);
        if (bags != null)
            map.put("bags", bags);
        if (expense != null)
            map.put("expense", expense);
        if (freight != null)
            map.put("freight", freight);
        if (advance != null)
            map.put("advance", advance);
        if (last_update_time != null)
            map.put("last_update_time", last_update_time);
        if (creation_time != null)
            map.put("creation_time", creation_time);
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
        fin_year = (String) map.get("fin_year");
        account_id = (String) map.get("account_id");
        code = (String) map.get("code");
        arrival_date_str = (String) map.get("arrival_date_str");
        arrival_date = (Long) map.get("arrival_date");
        name = (String) map.get("name");
        address = (String) map.get("address");
        type = (String) map.get("type");
        community_id = (String) map.get("community_id");
        community_name = (String) map.get("community_name");
        bags = (Integer) map.get("bags");
        expense = (Double) map.get("expense");
        freight = (Double) map.get("freight");
        advance = (Double) map.get("advance");
        last_update_time = (Long) map.get("last_update_time");
        creation_time = (Long) map.get("creation_time");
        extra_data = (Map<String, Object>) map.get("extra_data");
    }

    @SuppressWarnings("unchecked")
    public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
        Object idObj = map.get("id");
        if (idObj != null)
            id = idObj.toString();

        Object fin_yearObj = map.get("fin_year");
        if (fin_yearObj != null)
            fin_year = fin_yearObj.toString();

        Object account_idObj = map.get("account_id");
        if (account_idObj != null)
            account_id = account_idObj.toString();

        Object codeObj = map.get("code");
        if (codeObj != null)
            code = codeObj.toString();

        Object arrival_date_strObj = map.get("arrival_date_str");
        if (arrival_date_strObj != null)
            arrival_date_str = arrival_date_strObj.toString();

        Object arrival_dateObj = map.get("arrival_date");
        if (arrival_dateObj != null)
            arrival_date = new Long(arrival_dateObj.toString());

        Object nameObj = map.get("name");
        if (nameObj != null)
            name = nameObj.toString();

        Object addressObj = map.get("address");
        if (addressObj != null)
            address = addressObj.toString();

        Object typeObj = map.get("type");
        if (typeObj != null)
            type = typeObj.toString();

        Object community_idObj = map.get("community_id");
        if (community_idObj != null)
            community_id = community_idObj.toString();

        Object community_nameObj = map.get("community_name");
        if (community_nameObj != null)
            community_name = community_nameObj.toString();

        Object bagsObj = map.get("bags");
        if (bagsObj != null)
            bags = new Integer(bagsObj.toString());

        Object expenseObj = map.get("expense");
        if (expenseObj != null)
            expense = new Double(expenseObj.toString());

        Object freightObj = map.get("freight");
        if (freightObj != null)
            freight = new Double(freightObj.toString());

        Object advanceObj = map.get("advance");
        if (advanceObj != null)
            advance = new Double(advanceObj.toString());

        Object last_update_timeObj = map.get("last_update_time");
        if (last_update_timeObj != null)
            last_update_time = new Long(last_update_timeObj.toString());

        Object creation_timeObj = map.get("creation_time");
        if (creation_timeObj != null)
            creation_time = new Long(creation_timeObj.toString());

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

    public String getAddress() {
        return address;
    }

    public String getAddressEx() {
        return address != null ? address : "";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void unSetAddress() {
        this.address = null;
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

    public String getCommunity_name() {
        return community_name;
    }

    public String getCommunity_nameEx() {
        return community_name != null ? community_name : "";
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public void unSetCommunity_name() {
        this.community_name = null;
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

    public Double getExpense() {
        return expense;
    }

    public double getExpenseEx() {
        return expense != null ? expense : 0;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public void unSetExpense() {
        this.expense = null;
    }

    public Double getFreight() {
        return freight;
    }

    public double getFreightEx() {
        return freight != null ? freight : 0;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public void unSetFreight() {
        this.freight = null;
    }

    public Double getAdvance() {
        return advance;
    }

    public double getAdvanceEx() {
        return advance != null ? advance : 0;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public void setAdvance(Double advance) {
        this.advance = advance;
    }

    public void unSetAdvance() {
        this.advance = null;
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

    public Long getCreation_time() {
        return creation_time;
    }

    public long getCreation_timeEx() {
        return creation_time != null ? creation_time : 0L;
    }

    public void setCreation_time(long creation_time) {
        this.creation_time = creation_time;
    }

    public void setCreation_time(Long creation_time) {
        this.creation_time = creation_time;
    }

    public void unSetCreation_time() {
        this.creation_time = null;
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
        return "DB_LOG";
    }

    public String getClusterType() {
        return "REPLICATED";
    }
}