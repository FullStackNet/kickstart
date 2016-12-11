package platform.thread;

import platform.communication.SessionManager;

public class DeleteOrphanedConnectionThread extends ApplicationThread {

	public DeleteOrphanedConnectionThread() {
		this(20000);
	}
	public DeleteOrphanedConnectionThread(long interval) {
		super("DELETE_ORPHANED_CONNECTION", interval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onWork() {
		// TODO Auto-generated method stub
		SessionManager.getInstance().deleteOrphanedConnection();
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
