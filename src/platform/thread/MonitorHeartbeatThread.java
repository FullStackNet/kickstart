package platform.thread;

import platform.communication.ClientMessageQueue;
import platform.manager.GlobalDataManager;
import platform.message.MOHeartbeat;
import platform.util.ApplicationConstants;

public class MonitorHeartbeatThread extends ApplicationThread {

	public MonitorHeartbeatThread() {
		this(ApplicationConstants.MANAGED_OBJECT_HEARTBEAT);
	}
	public MonitorHeartbeatThread(long interval) {
		super("MONITOR_HEARTBEAT_THREAD", interval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onWork() {
		// TODO Auto-generated method stub
		MOHeartbeat message = new MOHeartbeat();
		message.setId(GlobalDataManager.getInstance().getId());
		ClientMessageQueue.getInstance().addMessage(GlobalDataManager.getInstance().getId(), 
				ApplicationConstants.APPLICATION_NAME_MONITOR, message);
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		
	}

}
