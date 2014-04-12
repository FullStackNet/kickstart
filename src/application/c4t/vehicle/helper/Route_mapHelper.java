package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.route_map;

public class Route_mapHelper extends BaseHelper {
	public Route_mapHelper() {
		super(new route_map());
		// TODO Auto-generated constructor stub
	}
	
	private static Route_mapHelper instance;
	
	public static Route_mapHelper getInstance() {
		if (instance == null)
			instance = new Route_mapHelper();
		return instance;
	}
	
	public void addStopage(String routeId,String stopageId) throws ApplicationException {
		route_map _map = new route_map();
		_map.setId(routeId);
		_map.addStopages(stopageId);
		AddOrUpdate(_map);
	}
}
