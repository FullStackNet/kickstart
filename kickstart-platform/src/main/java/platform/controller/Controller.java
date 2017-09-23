package platform.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.manager.GlobalDataManager;
import platform.rule.Entity;
import platform.rule.EntityAttribute;
import platform.util.ApplicationConstants;
import platform.util.Util;

public class  Controller {
	public static String CONTROLLER_TYPE_OBD= "OBD";
	public static String CONTROLLER_TYPE_DG_CONTROLLER = "DG_CONTROLLER";
	public static String CONTROLLER_TYPE_TRACKER = "TRACKER";
	public static String CONTROLLER_TYPE_GENERIC = "GENERIC_CONTROLLER";
	public static String CONTROLLER_TYPE_GAME_CONTROLLER = "GAME_CONTROLLER";
	public static String CONTROLLER_TYPE_AMR = "AMR_CONTROLLER";
	
	public static String[] getList() {
		String[] list = {
				CONTROLLER_TYPE_DG_CONTROLLER,
				CONTROLLER_TYPE_GAME_CONTROLLER,
				CONTROLLER_TYPE_OBD,
				CONTROLLER_TYPE_GENERIC,
				CONTROLLER_TYPE_TRACKER,
				CONTROLLER_TYPE_AMR,				
		};
		return list;
	}
	
	private String id ;
	private String name;
	private String manager;
	private String type;
	private String state;
	private String expectedState;
	private String subType;

	private long  stateChangeRequested;
	private long  retryCount;
	private String parent_id;
	private float level;
	private double upgradingStatus;
	
	private float maxThreshold;
	
	
	private float minThreshold;

	private boolean configAudit;
	
	private long configChangeTime;
	
	Date  lastMessageRecieved;
	Date  lastReadingRecieved;
	String connected;
	private String connectString;
	
	
	
	
	public Controller(String id) {
		this.id = id;
		stateChangeRequested = Util.currentTimeMS();
		expectedState = ApplicationConstants.SENSOR_STATE_UNKNOWN;
		state = ApplicationConstants.SENSOR_STATE_UNKNOWN;
		retryCount = 0;
		level = (float)0.0;
		maxThreshold = 0;
		minThreshold = 0;
		configAudit = false;
		lastMessageRecieved = new Date();
		connected = "U";
		connectString = GlobalDataManager.getInstance().getControllerIP()+"::"+GlobalDataManager.getInstance().getControllerPort();
		lastReadingRecieved = null;
	}
	
	public Controller(String id, String name) {
		this(id);
		this.name = name;
	}
	
	public void setConnected(String connected) {
		this.connected = connected;
	}

	public String getConnected() {
		return connected;
	}

	public Date getLastMessageRecieved() {
		return lastMessageRecieved;
	}

	public void setLastMessageRecieved(Date lastMessageRecieved) {
		this.lastMessageRecieved = lastMessageRecieved;
	}
	

	public void setRetryCount(long retryCount) {
		this.retryCount = retryCount;
	}

	
	public boolean isConfigAudit() {
		return configAudit;
	}

	public void setConfigAudit(boolean configAudit) {
		this.configAudit = configAudit;
	}

	public Controller(String id, String name,String parent_id) {
		this(id);
		this.name = name;
		this.parent_id = parent_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getExpectedState() {
		return expectedState;
	}

	public void setExpectedState(String expectedState) {
		this.expectedState = expectedState;
	}

	public long getStateChangeRequested() {
		return stateChangeRequested;
	}

	public void setStateChangeRequested(long stateChangeRequested) {
		this.stateChangeRequested = stateChangeRequested;
	}

	public long getRetryCount() {
		return retryCount;
	}

	public void incrementRetryCount() {
		this.retryCount++;
	}
	
	public void resetRetryCount() {
		this.retryCount = 0;
	}
	


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public void setState(int state) {
		this.state = "N";
		if (state == 0) {
			this.state = "Y";
		}
	}
	
	public Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("manager", manager);
		map.put("type", type);
		map.put("state", state);
		map.put("expectedState", expectedState);
		map.put("parent_id", parent_id);
		map.put("level", level);
		upgradingStatus = 100;
		return map;
	}
	
	public Entity getRuleEntity() {
		System.out.println("\n\nPrpraing Rule data  for -->  "+id + "\n");
		Entity entity = new Entity(id);
		entity.updateAttribute(new EntityAttribute("state", EntityAttribute.STRING_TYPE,state));
		return entity;
	}

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
	}
	
	public float getMaxThreshold() {
		return maxThreshold;
	}

	public void setMaxThreshold(float maxThreshold) {
		this.maxThreshold = maxThreshold;
	}

	public float getMinThreshold() {
		return minThreshold;
	}

	public void setMinThreshold(float minThreshold) {
		this.minThreshold = minThreshold;
	}

	public long getConfigChangeTime() {
		return configChangeTime;
	}

	public void setConfigChangeTime(long configChangeTime) {
		this.configChangeTime = configChangeTime;
	}
	
	public void setConfigChangeTime() {
		this.configChangeTime = System.currentTimeMillis();
	}
	
	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getFirmwareDirectory() {
		return null;
	}
	
	public String getFirmwareName() {
		return null;
	}
	public String getFirmwareFileName(byte majorVersion, long minorVersion) {
		String firwareName = "";
		if (getFirmwareName() != null) {
			firwareName = getFirmwareName() + "-";
		}
		String versionString = String.format("%03d",majorVersion)+"-"+String.format("%015d", minorVersion);
		return  "BUILD-"+firwareName+versionString;
	}
	
	public double getUpgradingStatus() {
		return upgradingStatus;
	}

	public void setUpgradingStatus(double upgradingStatus) {
		this.upgradingStatus = upgradingStatus;
	}

	public String getConnectString() {
		return connectString;
	}

	public void setConnectString(String connectString) {
		this.connectString = connectString;
	}

	public Date getLastReadingRecieved() {
		return lastReadingRecieved;
	}

	public void setLastReadingRecieved(Date lastReadingRecieved) {
		this.lastReadingRecieved = lastReadingRecieved;
	}

}
