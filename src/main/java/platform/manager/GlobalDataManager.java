package platform.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.log.ApplicationLogger;


public class GlobalDataManager {
	public static GlobalDataManager instance = null;
	public static String GATEWAY = "GATEWAY";
	public static String POWER_PRIORITY_GRID = "GRID";
	public static String POWER_PRIORITY_DG = "DG";
	public static String LINUX = "LINUX";
	public static String ANROID = "ANROID";
	
	
	String power_priority;
	String id;
	
	
	boolean ready;
	boolean registered;
	boolean connected;
	boolean shutdown;
	
	boolean fota;
	String processStatEnable;
	
	long controller_message_send_interval;
	long controller_urgent_message_send_interval;
	
	long dg_state_broadcast_interval;
	
	long converter_disconnect_detect_interval;


	int request_wait_time; // in seconds
	
	
	String socket_enable;
	
	int dicHeartbeatInterval; // in seconds
	int dicdisconnectDetectInterval; // in seconds
	
	
	int heartbeatInterval; // in seconds
	
	int dataReadInterval; // in seconds
	
	int stateSyncInterval; // in seconds
	
	int controllerReconnectInterval; // in seconds
	
	byte application; // in seconds

	String os;
	boolean authenticated;
	
	String controllerType; 
	String controllerIP;
	int controllerPort;
	String controllerUSBPort;
	int controllerBaudRate;
	String server;
	String clientId;
	String localGatewayId;
	String username;
	String password;
	String mode;
	
	int port;
	int httpPort;
	int gatewayPort;
	
	int simulator;
	String dbEnabled;
	String activateOnSync;
	
	Map<Object, Object> variables;
	
	Map<String, Object> packetCaptureList;
	
	ArrayList<Map<String, Object>> messageList;
	
	String[] modules;
	
	byte gridStatus;
	byte dgStatus;
	long message_response_fast;
	long message_response_medium;
	long message_response_slow;
	boolean ruleEngineEnabled;
	boolean deviceLoaded;
	long waitOnPowerSwitch;
	String community_id;
	String community_admin_username;
	String community_admin_password;
	String community_server_url;
	boolean print;
	
	GlobalDataManager() {
		heartbeatInterval = 1;
		os = LINUX;
		connected= false;
		authenticated = false;
		ready= false;
		mode = GATEWAY;
		variables = new HashMap<Object, Object>();
		controllerPort = 1001;
		messageList = new ArrayList<Map<String,Object>>();
		dbEnabled = "NO";
		power_priority = POWER_PRIORITY_GRID;
		gridStatus = 0;
		dgStatus = 0;
		request_wait_time = 3000;
		controller_message_send_interval = 1000;
		controller_urgent_message_send_interval = 200;
		message_response_fast = 3000;
		message_response_medium = 8000;
		message_response_slow = 30000;
		activateOnSync = "NO";
		ruleEngineEnabled = false;
		deviceLoaded = false;
		dicHeartbeatInterval = 60;
		dicdisconnectDetectInterval = 900;
		waitOnPowerSwitch = 30;
		socket_enable = "NO";
		shutdown = false;
		packetCaptureList = new HashMap<String,Object>();
	}
	
	public void capturePacket(String controllerId) {
		packetCaptureList.put(controllerId, 1);
	}
	
	
	public void donotCapturePacket(String controllerId) {
		packetCaptureList.remove(controllerId);
	}
	
	public boolean isCapturePacket(String controllerId) {
		if (packetCaptureList.get(controllerId) != null) {
			return true;
		}
		return false;
	}
	
	public int getDicHeartbeatInterval() {
		return dicHeartbeatInterval;
	}

	public void setDicHeartbeatInterval(int dicHeartbeatInterval) {
		this.dicHeartbeatInterval = dicHeartbeatInterval;
	}


	public int getDataReadInterval() {
		return dataReadInterval;
	}

	public void setDataReadInterval(int dataReadInterval) {
		this.dataReadInterval = dataReadInterval;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	
	
	


	public byte getApplication() {
		return application;
	}
	
	public void setApplication(int application) {
		this.application = (byte)application;
	}
	
	public void setApplication(byte application) {
		this.application = application;
	}
	
	
	
	
	public int getControllerReconnectInterval() {
		return controllerReconnectInterval;
	}
	public void setControllerReconnectInterval(int controllerReconnectInterval) {
		this.controllerReconnectInterval = controllerReconnectInterval;
	}
	
	public String getServer() {
		return server;
	}
	public void setServer(String mServer) {
		this.server = mServer;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String mGatewayId) {
		this.clientId = mGatewayId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String mUsername) {
		this.username = mUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String mPassword) {
		this.password = mPassword;
	}

	
	public String getControllerType() {
		return controllerType;
	}
	public void setControllerType(String controllerType) {
		this.controllerType = controllerType;
	}
	public String getControllerIP() {
		return controllerIP;
	}
	public void setControllerIP(String controllerIP) {
		this.controllerIP = controllerIP;
	}
	public String getControllerUSBPort() {
		return controllerUSBPort;
	}
	public void setControllerUSBPort(String controllerUSBPort) {
		this.controllerUSBPort = controllerUSBPort;
	}
	public int getControllerBaudRate() {
		return controllerBaudRate;
	}
	public void setControllerBaudRate(int controllerBaudRate) {
		this.controllerBaudRate = controllerBaudRate;
	}

	
	public int getHeartbeatInterval() {
		return heartbeatInterval;
	}
	public void setHeartbeatInterval(int heartbeatInterval) {
		this.heartbeatInterval = heartbeatInterval;
	}
	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean regsitered) {
		this.registered = regsitered;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	
	public void setOS(String os) {
		this.os = os;
	}
	
	public String  getOS() {
		return this.os;
	}
	
	
	
	
	public void setVariable(Object key, Object value) {
		variables.put(key, value);
	}

	public Object getVariableValue(Object key) {
		return variables.get(key);
	}

	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	public boolean isLinux() {
		if (os.equals(LINUX)) {
			return true;
		}
		return false;
	}
	
	public boolean isAnroid() {
		if (os.equals(ANROID)) {
			return true;
		}
		return false;
	}
	
	public static GlobalDataManager getInstance() {
		if (instance == null) {
			instance = new GlobalDataManager();
		}
		return instance;
	}
	
	public boolean isGateway() {
		if (mode.equals(GATEWAY)) 
			return true;
		return false;
	}
	
	public int getGatewayPort() {
		return gatewayPort;
	}

	public void setGatewayPort(int gatewayPort) {
		this.gatewayPort = gatewayPort;
	}

	public String getLocalGatewayId() {
		return localGatewayId;
	}

	public void setLocalGatewayId(String localGatewayId) {
		this.localGatewayId = localGatewayId;
	}
	
	public int getControllerPort() {
		return controllerPort;
	}

	public void setControllerPort(int controllerPort) {
		this.controllerPort = controllerPort;
	}

	public int getSimulator() {
		return simulator;
	}

	public void setSimulator(int simulator) {
		this.simulator = simulator;
	}
	
	public ArrayList<Map<String, Object>> getMessageLogList() {
		return messageList;
	}
	
		
	public String getDbEnabled() {
		return dbEnabled;
	}

	public void setDbEnabled(String dbEnabled) {
		this.dbEnabled = dbEnabled;
	}
	
	public boolean isDbEnabled() {
		if (dbEnabled.equalsIgnoreCase("yes")) {
			return true;
		}
		if (dbEnabled.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	public void  setModules(String moduleStr) {
		if (moduleStr == null)
			return;
		modules = moduleStr.split(",");
		for(int i=0; i < modules.length; i++) {
			modules[i] = modules[i].toUpperCase();
		}
	}
	
	public String getModules() {
		if (modules == null)
			return "";
		String str = "";
		for(int i=0; i< modules.length; i++) {
			str = str + modules[i];
		}
		return str;
	}
	public boolean  isEnableModule(String module) {
		if (module == null)
			return false;
		if (modules == null)
			return false;
		
		for(int i=0; i < modules.length; i++) {
			if (module.equalsIgnoreCase(modules[i])) {
				return true;
			}
		}
		return false;
	}
	
	public byte getDgStatus() {
		return dgStatus;
	}
	
	public void setDGStatus(byte status) {
		ApplicationLogger.info(" DG_STATUS_CHNAGE :: Enabled DG Status old Value :: " + dgStatus + " new value :: " + status, this.getClass());
		dgStatus = status;
	}
	
	public void enableDg(byte status) {
		ApplicationLogger.info(" DG_STATUS_CHNAGE :: Enabled DG Status old Value :: " + dgStatus + " new value :: " + (dgStatus | status) + " Grid Value :: " + gridStatus, this.getClass());
		dgStatus |= status;
	}
	
	public void disableDg(byte status) {
		ApplicationLogger.info(" DG_STATUS_CHNAGE :: Disbale DG Status old Value :: " + dgStatus + " new value :: " + (dgStatus & ~status), this.getClass());
		dgStatus &= ~status;
	}
	
	public byte getGridStatus() {
		return gridStatus;
	}
	
	public void enableGrid(byte status) {
		ApplicationLogger.info(" GRID_STATUS_CHNAGE :: Enabled Grid Status old Value :: " + gridStatus + " new value :: " + (gridStatus | status)+ " DG Value :: " + dgStatus, this.getClass());
		gridStatus |= status;
	}
	
	public void disableGrid(byte status) {
		ApplicationLogger.info(" GRID_STATUS_CHNAGE :: Disbale Grid Status old Value :: " + gridStatus + " new value :: " + (gridStatus & ~status)+ " DG Value" + dgStatus, this.getClass());
		gridStatus &= ~status;
	}
	
	public String getPower_priority() {
		return power_priority;
	}

	public void setPower_priority(String power_priority) {
		this.power_priority = power_priority;
	}
	public int getRequest_wait_time() {
		return request_wait_time;
	}

	public void setRequest_wait_time(int request_wait_time) {
		this.request_wait_time = request_wait_time;
	}

	public long getController_message_send_interval() {
		return controller_message_send_interval;
	}

	public void setController_message_send_interval(
			long controller_message_send_inetrval) {
		this.controller_message_send_interval = controller_message_send_inetrval;
	}
	public long getController_urgent_message_send_interval() {
		return controller_urgent_message_send_interval;
	}

	
	public void setController_urgent_message_send_interval(
			long controoler_urgent_message_send_inetrval) {
		this.controller_urgent_message_send_interval = controoler_urgent_message_send_inetrval;
	}

	public long getMessage_response_fast() {
		return message_response_fast;
	}

	public void setMessage_response_fast(long message_response_fast) {
		this.message_response_fast = message_response_fast;
	}

	public long getMessage_response_medium() {
		return message_response_medium;
	}

	public void setMessage_response_medium(long message_response_medium) {
		this.message_response_medium = message_response_medium;
	}

	public long getMessage_response_slow() {
		return message_response_slow;
	}

	public void setMessage_response_slow(long message_response_slow) {
		this.message_response_slow = message_response_slow;
	}

	public String getActivateOnSync() {
		return activateOnSync;
	}

	public void setActivateOnSync(String activateOnSync) {
		this.activateOnSync = activateOnSync;
	}

	public boolean isRuleEngineEnabled() {
		return ruleEngineEnabled;
	}

	public void setRuleEngineEnabled(boolean ruleEngineEnabled) {
		this.ruleEngineEnabled = ruleEngineEnabled;
	}

	public boolean isDeviceLoaded() {
		return deviceLoaded;
	}

	public void setDeviceLoaded(boolean deviceLoaded) {
		this.deviceLoaded = deviceLoaded;
	}

	public int getDicdisconnectDetectInterval() {
		return dicdisconnectDetectInterval;
	}

	public void setDicdisconnectDetectInterval(int dicdisconnectDetectInterval) {
		this.dicdisconnectDetectInterval = dicdisconnectDetectInterval;
	}
	public long getDg_state_braodcast_interval() {
		return dg_state_broadcast_interval;
	}

	public void setDg_state_broadcast_interval(long dg_state_broadcast_interval) {
		this.dg_state_broadcast_interval = dg_state_broadcast_interval;
	}

	public int getHttpPort() {
		return httpPort;
	}

	public void setHttpPort(int httpPort) {
		this.httpPort = httpPort;
	}

	public boolean isFota() {
		return fota;
	}

	public void setFota(boolean fota) {
		this.fota = fota;
	}

	public void setFota(String fota) {
		this.fota = false;
		if ("yes".equalsIgnoreCase(fota)) {
			this.fota = true;
		} 
	}

	public int getStateSyncInterval() {
		return stateSyncInterval;
	}

	public void setStateSyncInterval(int stateSyncInterval) {
		this.stateSyncInterval = stateSyncInterval;
	}

	public long getWaitOnPowerSwitch() {
		return waitOnPowerSwitch;
	}

	public void setWaitOnPowerSwitch(long waitOnPowerSwitch) {
		this.waitOnPowerSwitch = waitOnPowerSwitch;
	}

	public long getConverter_disconnect_detect_interval() {
		return converter_disconnect_detect_interval;
	}

	public void setConverter_disconnect_detect_interval(
			long converter_disconnect_detect_interval) {
		this.converter_disconnect_detect_interval = converter_disconnect_detect_interval;
	}

	public boolean isSocketEnabled() {
		if ("YES".equals(socket_enable)) {
			return true;
		}
		return false;
	}
	
	public void setSocket_enable(String socket_enable) {
		this.socket_enable = socket_enable.toUpperCase();
	}

	public boolean isShutdown() {
		return shutdown;
	}

	public void setShutdown(boolean shutdown) {
		this.shutdown = shutdown;
	}

	public String getId() {
		return id;
	}

	public void setId(String object_id) {
		this.id = object_id;
	}

	public boolean  isProcessStatEnable() {
		if ("YES".equalsIgnoreCase(processStatEnable)) {
			return true;
		}
		return false;
	}
	
	public String getProcessStatEnable() {
		return processStatEnable;
	}

	public void setProcessStatEnable(String processStatEnable) {
		this.processStatEnable = processStatEnable;
	}

	public String getCommunity_id() {
		return community_id;
	}

	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}

	public String getCommunity_admin_username() {
		return community_admin_username;
	}

	public void setCommunity_admin_username(String community_admin_username) {
		this.community_admin_username = community_admin_username;
	}

	public String getCommunity_admin_password() {
		return community_admin_password;
	}

	public void setCommunity_admin_password(String community_admin_password) {
		this.community_admin_password = community_admin_password;
	}

	public String getCommunity_server_url() {
		return community_server_url;
	}

	public void setCommunity_server_url(String community_server_url) {
		this.community_server_url = community_server_url;
	}

	public boolean isPrint() {
		return print;
	}

	public void setPrint(boolean print) {
		this.print = print;
	}
}
