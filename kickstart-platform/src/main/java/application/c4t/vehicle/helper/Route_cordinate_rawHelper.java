package application.c4t.vehicle.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.resource.route_cordinate_raw;


public class Route_cordinate_rawHelper extends BaseHelper {
	
	public Route_cordinate_rawHelper() {
		super(new route_cordinate_raw());
		// TODO Auto-generated constructor stub
	}
	private static Route_cordinate_rawHelper instance;
	
	public static Route_cordinate_rawHelper getInstance() {
		if (instance == null)
			instance = new Route_cordinate_rawHelper();
		return instance;
	}
	
	public BaseResource[] getRouteCordinates(String route_id) {
		Expression e = new Expression(route_cordinate_raw.FIELD_ROUTE_ID, REL_OP.EQ, route_id);
		return getByExpression(e);
	}
	
	public void deleteRouteCordinates(String route_id) {
		Expression e = new Expression(route_cordinate_raw.FIELD_ROUTE_ID, REL_OP.EQ, route_id);
		deleteByExpression(e);
	}
}
