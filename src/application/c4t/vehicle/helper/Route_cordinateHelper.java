package application.c4t.vehicle.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.route_cordinate;


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
}
