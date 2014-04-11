package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.vehicle_map;

public class Vehicle_mapHelper extends BaseHelper {
	public Vehicle_mapHelper() {
		super(new customer_vehicle_map());
		// TODO Auto-generated constructor stub
	}
	
	private static Vehicle_mapHelper instance;
	
	public static Vehicle_mapHelper getInstance() {
		if (instance == null)
			instance = new Vehicle_mapHelper();
		return instance;
	}
	
	public void addSchedule(String customerId,String scheduleId) throws ApplicationException {
		vehicle_map _map = new vehicle_map();
		_map.setId(customerId);
		_map.addSchedules(scheduleId);
		AddOrUpdate(_map);
	}
	
	public void addStopage(String customerId,String stopageId) throws ApplicationException {
		vehicle_map _map = new vehicle_map();
		_map.setId(customerId);
		_map.addStopages(stopageId);
		AddOrUpdate(_map);
	}
}
