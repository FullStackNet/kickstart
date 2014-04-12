package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.stopage;
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
	
	public void addRoute(String vehicleId,String routeId) throws ApplicationException {
		vehicle_map _map = new vehicle_map();
		_map.setId(vehicleId);
		_map.addRoutes(routeId);
		AddOrUpdate(_map);
	}
	
	public void addStopage(String vehicleId,String stopageId) throws ApplicationException {
		vehicle_map _map = new vehicle_map();
		_map.setId(vehicleId);
		_map.addStopages(stopageId);
		AddOrUpdate(_map);
	}
	
	public void deleteStopage(String vehicleId,String stopageId) throws ApplicationException {
		vehicle_map _map = new vehicle_map();
		_map.setId(vehicleId);
		_map.addStopages(stopageId);
		unset(_map);
	}
	
	public ArrayList<BaseResource> getStopageList(String vehicleId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		vehicle_map _map = (vehicle_map)getById(vehicleId);
		if ((_map == null) || (_map.getStopages() == null))
			return list;
		return StopageHelper.getInstance().getListById(_map.getStopages().toArray(new String[_map.getStopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getStopageListMap(String vehicleId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		vehicle_map _map = (vehicle_map)getById(vehicleId);
		if ((_map == null) || (_map.getStopages() == null))
			return list;
		return StopageHelper.getInstance().getListMapById(_map.getStopages().toArray(new String[_map.getStopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
	
	public Map<String,BaseResource> getNotifyUsersMap(String stopageId) {
		Map<String,BaseResource> map = new HashMap<String,BaseResource>();
		vehicle_map _map = (vehicle_map)getById(stopageId);
		if ((_map == null) || (_map.getNotify_users() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getNotify_users().toArray(new String[_map.getNotify_users().size()]));
	}
}
