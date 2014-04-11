package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.JoinField;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;


public class Route_stopageHelper extends BaseHelper {
	
	public Route_stopageHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	public Route_stopageHelper() {
		super(new route_stopage());
		// TODO Auto-generated constructor stub
	}
	private static Route_stopageHelper instance;
	
	public static Route_stopageHelper getInstance() {
		if (instance == null)
			instance = new Route_stopageHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getRouteStopageListMap(String routeId,ArrayList<JoinField> joinFields) {
		route _map = (route)RouteHelper.getInstance().getById(routeId);
		if ((_map == null) || (_map.getStopages() == null))
			return null;
		return getByJoining(_map.getStopages().toArray(new String[_map.getStopages().size()]),joinFields,new String[]{stopage.FIELD_NAME});
	}
}
