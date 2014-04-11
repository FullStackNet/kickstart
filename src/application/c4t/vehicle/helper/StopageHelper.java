package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.stopage;


public class StopageHelper extends BaseHelper {
	
	public StopageHelper() {
		super(new stopage());
		// TODO Auto-generated constructor stub
	}
	private static StopageHelper instance;
	
	public static StopageHelper getInstance() {
		if (instance == null)
			instance = new StopageHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getCustomerStopsMap(String customerId) {
		customer_vehicle_map _customer = 
				(customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getSelectedFieldsById(customerId,
						customer_vehicle_map.FIELD_STOPAGES);
		if ((_customer == null) || (_customer.getStopages() == null))
			return null;
		return getListMapById(_customer.getStopages().toArray(new String[_customer.getStopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
}
