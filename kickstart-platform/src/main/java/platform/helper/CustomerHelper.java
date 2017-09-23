package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.user;
import platform.util.Util;


public class CustomerHelper extends BaseHelper {
	
	public CustomerHelper() {
		super(new customer());
		// TODO Auto-generated constructor stub
	}
	private static CustomerHelper instance;
	
	public static CustomerHelper getInstance() {
		if (instance == null) {
			instance = new CustomerHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}
	
	
	public ArrayList<Map<String, Object>> getCustomerListMap() {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		BaseResource[] resources = getAll(new String[]{user.FIELD_NAME});
		if (Util.isEmpty(resources))
			return list;
		for (BaseResource resource : resources) {
			list.add(resource.convertResourceToMap());
		}
		return list;
	}
}
