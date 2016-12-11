package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.resource.BaseResource;
import platform.resource.customer_map;
import platform.resource.location;


public class LocationHelper extends BaseHelper {

	public LocationHelper() {
		super(new location());
		// TODO Auto-generated constructor stub
	}
	
	private static LocationHelper instance;

	public static LocationHelper getInstance() {
		if (instance == null)
			instance = new LocationHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getCustomerlocationsMap(String customerId) {
		customer_map _map = (customer_map)Customer_mapHelper.getInstance().getById(customerId);
		if ((_map == null) || (_map.getLocations() == null))
			return null;
		return getListMapById(_map.getLocations().toArray(new String[_map.getLocations().size()]),
				new String[]{location.FIELD_NAME});
	}
	
	public BaseResource[] getCustomerlocations(String customerId) {
		customer_map _map = (customer_map)Customer_mapHelper.getInstance().getById(customerId);
		if ((_map == null) || (_map.getLocations() == null))
			return null;
		return getById(_map.getLocations().toArray(new String[_map.getLocations().size()]),
				new String[]{location.FIELD_NAME});
	}
}
