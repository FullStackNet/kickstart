package platform.datasync;

import platform.communication.HttpClient;
import platform.defined.resource.Baseresult;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.util.ApplicationException;
import platform.util.Json;



public class DataSyncManager {
	private static DataSyncManager instance;
	private DataSyncManager() {
	
	}
	
	public static DataSyncManager getInstance() {
		if (instance == null)
			instance = new DataSyncManager();
		return instance;
	}
	
	public void send(DataSyncMessage message) {
		BaseResource _resource = message.getHelper().getById(message.getId());
		if (_resource != null) {
			String json_string = Json.resourcetoString(_resource);
			c4t_object _object = new c4t_object();
			_object.setType(_resource.getMetaData().getName());
			_object.setDescription(json_string);
			String resultString = HttpClient.sendPostRequest("http://"+message.getTargetServer(), "/c4t", "DATA_SYNC@admin@cloud4things",
					"sync", json_string, null);
			try {
				Baseresult result = (Baseresult)Json.stringToBaseResult(resultString, Baseresult.class);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
