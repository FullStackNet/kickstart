package platform.datasync;

import platform.communication.HttpClient;
import platform.resource.BaseResource;
import platform.resource.SyncResult;
import platform.resource.c4t_object;
import platform.thread.ApplicationThreadPool;
import platform.util.ApplicationException;
import platform.util.Json;



public class DataSyncManager {
	private static DataSyncManager instance;
	ApplicationThreadPool threadPool;
	private DataSyncManager() {
		threadPool = new ApplicationThreadPool("DataSync Thread Pool",20, 2000);
		threadPool.start();
	}
	
	public static DataSyncManager getInstance() {
		if (instance == null)
			instance = new DataSyncManager();
		return instance;
	}
	
	public void send(DataSyncMessage message) {
		threadPool.addTask(new SyncTask(message));
	}
	
	class SyncTask implements Runnable {
		DataSyncMessage message;
		public SyncTask(DataSyncMessage message) {
			this.message = message;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			BaseResource _resource = message.getHelper().getById(message.getId());
			if (_resource != null) {
				String json_string = Json.resourcetoString(_resource);
				c4t_object _object = new c4t_object();
				_object.setType(_resource.getMetaData().getName());
				_object.setDescription(json_string);
				
				json_string = Json.resourcetoString(_object);
				String resultString = HttpClient.sendPostRequest("http://"+message.getTargetServer(), "/c4t", "DATA_SYNC@admin@cloud4things",
						"sync", json_string, null);
				System.out.println(resultString);
				try {
					SyncResult result = (SyncResult)Json.stringToBaseResult(resultString, SyncResult.class);
					System.out.println("Code :"+result.getErrCode()+", Message : "+result.getMessage());
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		
	}
}
