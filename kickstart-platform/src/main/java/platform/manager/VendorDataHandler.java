package platform.manager;

import java.util.Map;

public abstract class VendorDataHandler {
	public abstract void processPortData(String id, Map<String, Object> map, long time);
}
