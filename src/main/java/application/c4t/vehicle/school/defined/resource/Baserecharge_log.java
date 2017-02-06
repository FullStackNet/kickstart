/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.school.defined.resource;

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
public abstract class Baserecharge_log extends BaseResource {
    private String id = null;
    private String user_id = null;
    private String user_name = null;
    private String school_id = null;
    private String school_name = null;
    private String customer_id = null;
    private String customer_name = null;
    private String student_id = null;
    private String student_name = null;
    private Double amount = null;
    private String status = null;
    private Long creation_time = null;
    private Map<String, Object> extra_data = null;

    public static String FIELD_ID = "id";
    public static String FIELD_USER_ID = "user_id";
    public static String FIELD_USER_NAME = "user_name";
    public static String FIELD_SCHOOL_ID = "school_id";
    public static String FIELD_SCHOOL_NAME = "school_name";
    public static String FIELD_CUSTOMER_ID = "customer_id";
    public static String FIELD_CUSTOMER_NAME = "customer_name";
    public static String FIELD_STUDENT_ID = "student_id";
    public static String FIELD_STUDENT_NAME = "student_name";
    public static String FIELD_AMOUNT = "amount";
    public static String FIELD_STATUS = "status";
    public static String FIELD_CREATION_TIME = "creation_time";
    public static String FIELD_EXTRA_DATA = "extra_data";

    private static final long serialVersionUID = 1L;
    private final static ResourceMetaData metaData = new ResourceMetaData("recharge_log");

    static {
        metaData.setCheckBeforeAdd(false);
        metaData.setCheckBeforeUpdate(false);
        Field idField = new Field("id", "String");
        idField.setRequired(true);
        idField.setLength(128);
        metaData.addField(idField);

        Field user_idField = new Field("user_id", "String");
        user_idField.setLength(128);
        metaData.addField(user_idField);

        Field user_nameField = new Field("user_name", "String");
        user_nameField.setLength(128);
        metaData.addField(user_nameField);

        Field school_idField = new Field("school_id", "String");
        school_idField.setLength(128);
        metaData.addField(school_idField);

        Field school_nameField = new Field("school_name", "String");
        school_nameField.setLength(128);
        metaData.addField(school_nameField);

        Field customer_idField = new Field("customer_id", "String");
        customer_idField.setLength(128);
        metaData.addField(customer_idField);

        Field customer_nameField = new Field("customer_name", "String");
        customer_nameField.setLength(128);
        metaData.addField(customer_nameField);

        Field student_idField = new Field("student_id", "String");
        student_idField.setLength(128);
        metaData.addField(student_idField);

        Field student_nameField = new Field("student_name", "String");
        student_nameField.setLength(128);
        metaData.addField(student_nameField);

        Field amountField = new Field("amount", "double");
        metaData.addField(amountField);

        Field statusField = new Field("status", "String");
        statusField.setLength(32);
        metaData.addField(statusField);

        Field creation_timeField = new Field("creation_time", "timestamp");
        metaData.addField(creation_timeField);

        Field extra_dataField = new Field("extra_data", "Map");
        extra_dataField.setValueType("Object");
        metaData.addField(extra_dataField);


        metaData.setTableName("recharge_log");

        metaData.setCluster("DB_LOG");
    }

    public Baserecharge_log() {
    }

    public Baserecharge_log(Baserecharge_log obj) {
        this.id = obj.id;
        this.user_id = obj.user_id;
        this.user_name = obj.user_name;
        this.school_id = obj.school_id;
        this.school_name = obj.school_name;
        this.customer_id = obj.customer_id;
        this.customer_name = obj.customer_name;
        this.student_id = obj.student_id;
        this.student_name = obj.student_name;
        this.amount = obj.amount;
        this.status = obj.status;
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
        if (user_id != null)
            map.put("user_id", user_id);
        if (user_name != null)
            map.put("user_name", user_name);
        if (school_id != null)
            map.put("school_id", school_id);
        if (school_name != null)
            map.put("school_name", school_name);
        if (customer_id != null)
            map.put("customer_id", customer_id);
        if (customer_name != null)
            map.put("customer_name", customer_name);
        if (student_id != null)
            map.put("student_id", student_id);
        if (student_name != null)
            map.put("student_name", student_name);
        if (amount != null)
            map.put("amount", amount);
        if (status != null)
            map.put("status", status);
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
        if (user_id != null)
            map.put("user_id", user_id);
        if (user_name != null)
            map.put("user_name", user_name);
        if (school_id != null)
            map.put("school_id", school_id);
        if (school_name != null)
            map.put("school_name", school_name);
        if (customer_id != null)
            map.put("customer_id", customer_id);
        if (customer_name != null)
            map.put("customer_name", customer_name);
        if (student_id != null)
            map.put("student_id", student_id);
        if (student_name != null)
            map.put("student_name", student_name);
        if (amount != null)
            map.put("amount", amount);
        if (status != null)
            map.put("status", status);
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
        user_id = (String) map.get("user_id");
        user_name = (String) map.get("user_name");
        school_id = (String) map.get("school_id");
        school_name = (String) map.get("school_name");
        customer_id = (String) map.get("customer_id");
        customer_name = (String) map.get("customer_name");
        student_id = (String) map.get("student_id");
        student_name = (String) map.get("student_name");
        amount = (Double) map.get("amount");
        status = (String) map.get("status");
        creation_time = (Long) map.get("creation_time");
        extra_data = (Map<String, Object>) map.get("extra_data");
    }

    @SuppressWarnings("unchecked")
    public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
        Object idObj = map.get("id");
        if (idObj != null)
            id = idObj.toString();

        Object user_idObj = map.get("user_id");
        if (user_idObj != null)
            user_id = user_idObj.toString();

        Object user_nameObj = map.get("user_name");
        if (user_nameObj != null)
            user_name = user_nameObj.toString();

        Object school_idObj = map.get("school_id");
        if (school_idObj != null)
            school_id = school_idObj.toString();

        Object school_nameObj = map.get("school_name");
        if (school_nameObj != null)
            school_name = school_nameObj.toString();

        Object customer_idObj = map.get("customer_id");
        if (customer_idObj != null)
            customer_id = customer_idObj.toString();

        Object customer_nameObj = map.get("customer_name");
        if (customer_nameObj != null)
            customer_name = customer_nameObj.toString();

        Object student_idObj = map.get("student_id");
        if (student_idObj != null)
            student_id = student_idObj.toString();

        Object student_nameObj = map.get("student_name");
        if (student_nameObj != null)
            student_name = student_nameObj.toString();

        Object amountObj = map.get("amount");
        if (amountObj != null)
            amount = new Double(amountObj.toString());

        Object statusObj = map.get("status");
        if (statusObj != null)
            status = statusObj.toString();

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

    public String getSchool_id() {
        return school_id;
    }

    public String getSchool_idEx() {
        return school_id != null ? school_id : "";
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public void unSetSchool_id() {
        this.school_id = null;
    }

    public String getSchool_name() {
        return school_name;
    }

    public String getSchool_nameEx() {
        return school_name != null ? school_name : "";
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public void unSetSchool_name() {
        this.school_name = null;
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

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_nameEx() {
        return customer_name != null ? customer_name : "";
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void unSetCustomer_name() {
        this.customer_name = null;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getStudent_idEx() {
        return student_id != null ? student_id : "";
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void unSetStudent_id() {
        this.student_id = null;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_nameEx() {
        return student_name != null ? student_name : "";
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void unSetStudent_name() {
        this.student_name = null;
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

    public String getStatus() {
        return status;
    }

    public String getStatusEx() {
        return status != null ? status : "";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void unSetStatus() {
        this.status = null;
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