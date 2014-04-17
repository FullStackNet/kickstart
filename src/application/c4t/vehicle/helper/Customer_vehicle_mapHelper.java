package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.user;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;

public class Customer_vehicle_mapHelper extends BaseHelper {
	public Customer_vehicle_mapHelper() {
		super(new customer_vehicle_map());
		// TODO Auto-generated constructor stub
	}
	
	private static Customer_vehicle_mapHelper instance;
	
	public static Customer_vehicle_mapHelper getInstance() {
		if (instance == null)
			instance = new Customer_vehicle_mapHelper();
		return instance;
	}
	
	public void addFleetManager(String customerId,String fleetManagerId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addFleetManagers(fleetManagerId);
		AddOrUpdate(_map);
	}
	
	public void addFleetOwner(String customerId,String fleetOwnerId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addFleetOwners(fleetOwnerId);
		AddOrUpdate(_map);
	}
	
	public ArrayList<Map<String, Object>> getFleetManagersListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getFleetManagers() == null))
			return list;
		return UserHelper.getInstance().getListMapById(_customer_map.getFleetManagers().toArray(new String[_customer_map.getFleetManagers().size()]),
				new String[]{user.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getFleetOwnersListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getFleetOwners() == null))
			return list;
		return UserHelper.getInstance().getListMapById(_customer_map.getFleetOwners().toArray(new String[_customer_map.getFleetOwners().size()]),
				new String[]{user.FIELD_NAME});
	}
}
