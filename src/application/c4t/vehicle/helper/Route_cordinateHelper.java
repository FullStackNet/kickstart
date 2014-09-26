package application.c4t.vehicle.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.util.location.LocationUtil;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_cordinate;
import application.c4t.vehicle.resource.route_stopage;


public class Route_cordinateHelper extends BaseHelper {
	
	public Route_cordinateHelper() {
		super(new route_cordinate());
		// TODO Auto-generated constructor stub
	}
	private static Route_cordinateHelper instance;
	
	public static Route_cordinateHelper getInstance() {
		if (instance == null)
			instance = new Route_cordinateHelper();
		return instance;
	}
	
	public void addDuration(String id,long duration) {
		if (duration == 0)
			return;
		route_cordinate _cordinate = new route_cordinate(id);
		_cordinate.addDurations(duration);
		try {
			AddOrUpdate(_cordinate);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BaseResource[] get4RouteStopageCordinates(String route_stopage_id) {
		Expression e = new Expression(route_cordinate.FIELD_STOPAGE_ID, REL_OP.EQ, route_stopage_id);
		return getByExpression(e);
	}

	public route_cordinate getNearestCordinate(String id,route _route, route_stopage _route_stopage,
			String latitude,String longitude) {
		route_cordinate _cordinate = (route_cordinate)getById(id);
		if (_cordinate != null)
			return _cordinate;
		BaseResource[] cordinates = get4RouteStopageCordinates(_route_stopage.getId());
		for(int i=0; i < cordinates.length; i++) {
			_cordinate = (route_cordinate)cordinates[i];
			if (Util.isEmpty(latitude) || Util.isEmpty(longitude) || Util.isEmpty(_cordinate.getLatitude()) ||  Util.isEmpty(_cordinate.getLangitude())) 
				continue;
			double distance = LocationUtil.getDistance(latitude, longitude,
					_cordinate.getLatitude(), 
					_cordinate.getLangitude());
			if (distance < 0) {
				distance = distance*(-1);
			}
			double cordinate_radius = 0.050;
			if (_route.getIn_route_accuracy() != null) {
				cordinate_radius = _route.getIn_route_accuracy()/1000;
			}
			if (distance < cordinate_radius) {
				return _cordinate;
			}
		}
		return _cordinate;
	}
	
}
