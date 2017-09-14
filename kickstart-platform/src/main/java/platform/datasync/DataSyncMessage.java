package platform.datasync;

import platform.helper.BaseHelper;


public class DataSyncMessage {
	
	private String targetServer;
	private BaseHelper helper;
	private String id;
	
	
	public DataSyncMessage(String targetServer,BaseHelper helper,String id) {
		this.helper = helper;
		this.id = id;
		this.targetServer = targetServer;
	}


	public BaseHelper getHelper() {
		return helper;
	}

	public void setHelper(BaseHelper helper) {
		this.helper = helper;
	}

	public String getTargetServer() {
		return targetServer;
	}


	public void setTargetServer(String targetServer) {
		this.targetServer = targetServer;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
