package platform.manager;

import java.util.HashMap;
import java.util.Map;

public class VendorDataManager {
	Map<String, VendorDataHandler> map;
	private static VendorDataManager instance;
	VendorDataManager() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, VendorDataHandler>();
	}
	
	public static VendorDataManager getInstance() {
		if (instance == null)
			instance = new VendorDataManager();
		return instance;
	}
	
	public void registerHandler(String model, VendorDataHandler handler) {
		map.put(model, handler);
	}
	
	public VendorDataHandler getHandler(String model) {
		return map.get(model);
	}
}
