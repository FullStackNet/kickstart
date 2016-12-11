package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.route_stopage_map;


public class Route_stopage_mapHelper extends BaseHelper {
	
	public Route_stopage_mapHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	public Route_stopage_mapHelper() {
		super(new route_stopage_map());
		// TODO Auto-generated constructor stub
	}
	private static Route_stopage_mapHelper instance;
	
	public static Route_stopage_mapHelper getInstance() {
		if (instance == null)
			instance = new Route_stopage_mapHelper();
		return instance;
	}
	
	public void addNotifyUser(String routeStopageId,String userId) throws ApplicationException {
		if (routeStopageId == null) return;
		if (userId == null) return;
		route_stopage_map _map = new route_stopage_map();
		_map.setId(routeStopageId);
		_map.addNotify_users(userId);
		AddOrUpdate(_map);
	}
	
	public void addTime_taken_from_previous_stop(String routeStopageId,long time) throws ApplicationException {
		if (routeStopageId == null) return;
		route_stopage_map _map = new route_stopage_map();
		_map.setId(routeStopageId);
		_map.addTime_taken_from_previous_stop(time);
		AddOrUpdate(_map);
	}
}
