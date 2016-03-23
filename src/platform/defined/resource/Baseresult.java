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
 * Result
 */
public abstract class Baseresult extends BaseResource {
	private Integer errCode = null;
	private String message = null;
	private String sessionId = null;
	private Long recentNotifications = null;
	private Long recentAlerts = null;
	private Long pendingCoins = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ERRCODE = "errCode";
	public static String FIELD_MESSAGE = "message";
	public static String FIELD_SESSIONID = "sessionId";
	public static String FIELD_RECENTNOTIFICATIONS = "recentNotifications";
	public static String FIELD_RECENTALERTS = "recentAlerts";
	public static String FIELD_PENDINGCOINS = "pendingCoins";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("result");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field errCodeField = new Field("errCode", "int");
		metaData.addField(errCodeField);

		Field messageField = new Field("message", "String");
		metaData.addField(messageField);

		Field sessionIdField = new Field("sessionId", "String");
		metaData.addField(sessionIdField);

		Field recentNotificationsField = new Field("recentNotifications", "long");
		metaData.addField(recentNotificationsField);

		Field recentAlertsField = new Field("recentAlerts", "long");
		metaData.addField(recentAlertsField);

		Field pendingCoinsField = new Field("pendingCoins", "long");
		metaData.addField(pendingCoinsField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("result");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseresult() {}

	public Baseresult(Baseresult obj) {
		this.errCode = obj.errCode;
		this.message = obj.message;
		this.sessionId = obj.sessionId;
		this.recentNotifications = obj.recentNotifications;
		this.recentAlerts = obj.recentAlerts;
		this.pendingCoins = obj.pendingCoins;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(errCode != null)
			map.put("errCode", errCode);
		if(message != null)
			map.put("message", message);
		if(sessionId != null)
			map.put("sessionId", sessionId);
		if(recentNotifications != null)
			map.put("recentNotifications", recentNotifications);
		if(recentAlerts != null)
			map.put("recentAlerts", recentAlerts);
		if(pendingCoins != null)
			map.put("pendingCoins", pendingCoins);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(errCode != null)
			map.put("errCode", errCode);
		if(message != null)
			map.put("message", message);
		if(sessionId != null)
			map.put("sessionId", sessionId);
		if(recentNotifications != null)
			map.put("recentNotifications", recentNotifications);
		if(recentAlerts != null)
			map.put("recentAlerts", recentAlerts);
		if(pendingCoins != null)
			map.put("pendingCoins", pendingCoins);
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
		errCode = (Integer) map.get("errCode");
		message = (String) map.get("message");
		sessionId = (String) map.get("sessionId");
		recentNotifications = (Long) map.get("recentNotifications");
		recentAlerts = (Long) map.get("recentAlerts");
		pendingCoins = (Long) map.get("pendingCoins");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object errCodeObj = map.get("errCode");
		if(errCodeObj != null)
			errCode = new Integer(errCodeObj.toString());

		Object messageObj = map.get("message");
		if(messageObj != null)
			message = messageObj.toString();

		Object sessionIdObj = map.get("sessionId");
		if(sessionIdObj != null)
			sessionId = sessionIdObj.toString();

		Object recentNotificationsObj = map.get("recentNotifications");
		if(recentNotificationsObj != null)
			recentNotifications = new Long(recentNotificationsObj.toString());

		Object recentAlertsObj = map.get("recentAlerts");
		if(recentAlertsObj != null)
			recentAlerts = new Long(recentAlertsObj.toString());

		Object pendingCoinsObj = map.get("pendingCoins");
		if(pendingCoinsObj != null)
			pendingCoins = new Long(pendingCoinsObj.toString());

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

	public Integer getErrCode() {
		return errCode;
	}

	public int getErrCodeEx() {
		return errCode != null ? errCode : 0;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public void unSetErrCode() {
		this.errCode = null;
	}

	public String getMessage() {
		return message;
	}

	public String getMessageEx() {
		return message != null ? message : "";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void unSetMessage() {
		this.message = null;
	}

	public String getSessionId() {
		return sessionId;
	}

	public String getSessionIdEx() {
		return sessionId != null ? sessionId : "";
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public void unSetSessionId() {
		this.sessionId = null;
	}

	public Long getRecentNotifications() {
		return recentNotifications;
	}

	public long getRecentNotificationsEx() {
		return recentNotifications != null ? recentNotifications : 0L;
	}

	public void setRecentNotifications(long recentNotifications) {
		this.recentNotifications = recentNotifications;
	}

	public void setRecentNotifications(Long recentNotifications) {
		this.recentNotifications = recentNotifications;
	}

	public void unSetRecentNotifications() {
		this.recentNotifications = null;
	}

	public Long getRecentAlerts() {
		return recentAlerts;
	}

	public long getRecentAlertsEx() {
		return recentAlerts != null ? recentAlerts : 0L;
	}

	public void setRecentAlerts(long recentAlerts) {
		this.recentAlerts = recentAlerts;
	}

	public void setRecentAlerts(Long recentAlerts) {
		this.recentAlerts = recentAlerts;
	}

	public void unSetRecentAlerts() {
		this.recentAlerts = null;
	}

	public Long getPendingCoins() {
		return pendingCoins;
	}

	public long getPendingCoinsEx() {
		return pendingCoins != null ? pendingCoins : 0L;
	}

	public void setPendingCoins(long pendingCoins) {
		this.pendingCoins = pendingCoins;
	}

	public void setPendingCoins(Long pendingCoins) {
		this.pendingCoins = pendingCoins;
	}

	public void unSetPendingCoins() {
		this.pendingCoins = null;
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
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}