package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.user;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.driver;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.schedule;
import application.c4t.vehicle.resource.stopage;

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
	
	public void addDriver(String customerId,String driverId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addDrivers(driverId);
		AddOrUpdate(_map);
	}
	
	public void addRoute(String customerId,String routeId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addRoutes(routeId);
		AddOrUpdate(_map);
	}
	
	public void addSchedule(String customerId,String scheduleId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addSchedules(scheduleId);
		AddOrUpdate(_map);
	}
	
	public void addScheduleStopage(String customerId,String stopageId) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addSchedule_stopage(stopageId);
		AddOrUpdate(_map);
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
	
	public void addStopage(String customerId,String stopage) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addStopages(stopage);
		AddOrUpdate(_map);
	}
	
	public void addStudent(String customerId,String student) throws ApplicationException {
		customer_vehicle_map _map = new customer_vehicle_map();
		_map.setId(customerId);
		_map.addStudents(student);
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
	
	
	public ArrayList<Map<String, Object>> getRouteListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoutes()== null))
			return list;
		return RouteHelper.getInstance().getListMapById(_customer_map.getRoutes().toArray(new String[_customer_map.getRoutes().size()]),
				new String[]{route.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getScheduleListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getSchedules()== null))
			return list;
		return ScheduleHelper.getInstance().getListMapById(_customer_map.getSchedules().toArray(new String[_customer_map.getSchedules().size()]),
				new String[]{schedule.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getDriverListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getDrivers()== null))
			return list;
		return DriverHelper.getInstance().getListMapById(_customer_map.getDrivers().toArray(new String[_customer_map.getDrivers().size()]),
				new String[]{driver.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getStopageListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getStopages() == null))
			return list;
		return StopageHelper.getInstance().getListMapById(_customer_map.getStopages().toArray(new String[_customer_map.getStopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getScheduleStopageListMap(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_vehicle_map _customer_map = (customer_vehicle_map)getById(customerId);
		if ((_customer_map == null) || (_customer_map.getSchedule_stopage() == null))
			return list;
		return Schedule_stopageHelper.getInstance().getListMapById(_customer_map.getSchedule_stopage().toArray(new String[_customer_map.getSchedule_stopage().size()]),
				new String[]{schedule.FIELD_NAME});
	}
}
