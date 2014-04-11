package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.driver;


public class DriverHelper extends BaseHelper {
	
	public DriverHelper() {
		super(new driver());
		// TODO Auto-generated constructor stub
	}
	private static DriverHelper instance;
	
	public static DriverHelper getInstance() {
		if (instance == null)
			instance = new DriverHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getCustomerDriversMap(String customerId) {
		customer_vehicle_map _customer = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer == null) || (_customer.getDrivers() == null))
			return null;
		return getListMapById(_customer.getDrivers().toArray(new String[_customer.getDrivers().size()]),
				new String[]{driver.FIELD_NAME});
	}
}
