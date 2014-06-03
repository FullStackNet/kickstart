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
	private Long RecentNotifications = null;
	private Long recentAlerts = null;

	public static String FIELD_ERRCODE = "errCode";
	public static String FIELD_MESSAGE = "message";
	public static String FIELD_SESSIONID = "sessionId";
	public static String FIELD_RECENTNOTIFICATIONS = "RecentNotifications";
	public static String FIELD_RECENTALERTS = "recentAlerts";

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

		Field RecentNotificationsField = new Field("RecentNotifications", "long");
		metaData.addField(RecentNotificationsField);

		Field recentAlertsField = new Field("recentAlerts", "long");
		metaData.addField(recentAlertsField);


		metaData.setTableName("result");

		metaData.setCluster("DB_CONFIG");
	}

	public Baseresult() {}

	public Baseresult(Baseresult obj) {
		this.errCode = obj.errCode;
		this.message = obj.message;
		this.sessionId = obj.sessionId;
		this.RecentNotifications = obj.RecentNotifications;
		this.recentAlerts = obj.recentAlerts;
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
		if(RecentNotifications != null)
			map.put("RecentNotifications", RecentNotifications);
		if(recentAlerts != null)
			map.put("recentAlerts", recentAlerts);
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
		if(RecentNotifications != null)
			map.put("RecentNotifications", RecentNotifications);
		if(recentAlerts != null)
			map.put("recentAlerts", recentAlerts);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	public void convertMapToResource(Map<String, Object> map) {
		errCode = (Integer) map.get("errCode");
		message = (String) map.get("message");
		sessionId = (String) map.get("sessionId");
		RecentNotifications = (Long) map.get("RecentNotifications");
		recentAlerts = (Long) map.get("recentAlerts");
	}

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

		Object RecentNotificationsObj = map.get("RecentNotifications");
		if(RecentNotificationsObj != null)
			RecentNotifications = new Long(RecentNotificationsObj.toString());

		Object recentAlertsObj = map.get("recentAlerts");
		if(recentAlertsObj != null)
			recentAlerts = new Long(recentAlertsObj.toString());

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
		return RecentNotifications;
	}

	public long getRecentNotificationsEx() {
		return RecentNotifications != null ? RecentNotifications : 0L;
	}

	public void setRecentNotifications(long RecentNotifications) {
		this.RecentNotifications = RecentNotifications;
	}

	public void setRecentNotifications(Long RecentNotifications) {
		this.RecentNotifications = RecentNotifications;
	}

	public void unSetRecentNotifications() {
		this.RecentNotifications = null;
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
	public String getCluster() {
		return "DB_CONFIG";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}