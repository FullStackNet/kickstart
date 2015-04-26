package platform.communication;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Session implements  Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Boolean  authenticated;
	Boolean  ready;
	Object   sessionKey;
	Object   clientId;
	String   siteId;
	String   customerId;
	String   customerName;
	String   siteName;
	long     securityToken;
	long     creationTime;
	long 	 lastUpdateTime;
	long 	 sessionType; /* HAN */
	byte 	 application;
	long 	 heartbeatInterval;
	byte 	 type;
	boolean  delete;
	long 	 pendingMessages;
	long 	 processedMessage;
	long  max_message_queue_per_client;
	boolean  exited;

	

	public boolean isExited() {
		return exited;
	}


	public void setExited(boolean exited) {
		this.exited = exited;
	}


	public Session() {
		authenticated = false;
		ready = false;
		creationTime = System.currentTimeMillis();
		lastUpdateTime = System.currentTimeMillis();
		type = CommunitionConst.CLIENT_TYPE_C4T_GATEWAY;
		max_message_queue_per_client = 256;
		pendingMessages = 0;
		processedMessage = 0;
	}
	
	
	public long getPendingMessage() {
		return pendingMessages;
	}
	
	public void incrementPendingMessage() {
		pendingMessages++;
	}
	
	public void setPendingMessage(long num) {
		pendingMessages = num;
	}
	
	public void incrementProcessedMessage() {
		processedMessage++;
	}
	
	public long getProcessedMessage() {
		return processedMessage;
	}
	public void decrementPendingMessage() {
		pendingMessages--;
	}
	
	public long getMax_message_queue_per_client() {
		return max_message_queue_per_client;
	}

	public void setMax_message_queue_per_client(long max_message_queue_per_client) {
		this.max_message_queue_per_client = max_message_queue_per_client;
	}
	
	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public long getCreationTime() {
		return creationTime;
	}
	
	public long getLastUpdateTime() {
		return lastUpdateTime;
	}


	public void setReady(Boolean ready) {
		this.ready = ready;
	}
	
	public Boolean isReady() {
		return this.ready;
	}
	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}


	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
	
	public Boolean isAuthenticated() {
		return authenticated;
	}
	
	public void enableAuthenticated() {
		authenticated = true;
	}
	
	public long getSecurityToken() {
		return securityToken;
	}

	public void setSecurityToken(byte token) {
		this.securityToken = token;
	}
	
	public void setKey(Object key) {
		this.sessionKey = key;
	}


	
	
	public long getSessionType() {
		return sessionType;
	}


	public void setSessionType(long sessionType) {
		this.sessionType = sessionType;
	}


	public byte getApplication() {
		return application;
	}


	public void setApplication(byte application) {
		this.application = application;
	}


	public String getSiteId() {
		return siteId;
	}


	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}


	public long getHeartbeatInterval() {
		return heartbeatInterval;
	}


	public void setHeartbeatInterval(long heartbeatInterval) {
		this.heartbeatInterval = heartbeatInterval;
	}


	public String getSiteName() {
		return siteName;
	}


	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}


	public byte getType() {
		return type;
	}


	public void setType(byte type) {
		this.type = type;
	}
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Map<String,Object> convertResourceToMap() {
		Map<String,Object> rowData = new HashMap<String, Object>();
		rowData.put("authenticated",isAuthenticated());
		rowData.put("ready",isReady());
		rowData.put("Client Id",getSessionKey());
		rowData.put("siteId",getSiteId());
		rowData.put("siteName",getSiteName());
		rowData.put("customerId",getCustomerId());
		rowData.put("customerName",getCustomerName());
		return rowData;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Object getSessionKey() {
		return sessionKey;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Object getClientId() {
		return clientId;
	}

	public void setClientId(Object clientId) {
		this.clientId = clientId;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}
}
