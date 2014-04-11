package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.JoinField;
import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.route;


public class RouteHelper extends BaseHelper {
	
	public RouteHelper() {
		super(new route());
		// TODO Auto-generated constructor stub
	}
	private static RouteHelper instance;
	
	public static RouteHelper getInstance() {
		if (instance == null)
			instance = new RouteHelper();
		return instance;
	}
	
	public void addStopage(String routeId,String stopageId) throws ApplicationException {
		route _map = new route();
		_map.setId(routeId);
		_map.addStopages(stopageId);
		AddOrUpdate(_map);
	}
	public ArrayList<Map<String, Object>> getCustomerRoutesMap(String customerId) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoutes() == null))
			return null;
		return getListMapById(_customer_map.getRoutes().toArray(new String[_customer_map.getRoutes().size()]),
				new String[]{route.FIELD_NAME});
	}

	public ArrayList<Map<String, Object>> getCustomerRoutesMap(String customerId,ArrayList<JoinField> joinFields) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getRoutes() == null))
			return null;
		return getByJoining(_customer_map.getRoutes().toArray(new String[_customer_map.getRoutes().size()]),joinFields,new String[]{route.FIELD_NAME});
	}
}
