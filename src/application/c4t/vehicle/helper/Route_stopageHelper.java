package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.resource.route_stopage;


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
	
	public BaseResource[] getRouteStopageByRouteId(String routeId) {
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		return getByExpression(expression);
	}
	
	public ArrayList<Map<String, Object>> getRouteStopageListMap(String routeId,ArrayList<JoinField> joinFields) {
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		return getByJoining(expression,joinFields,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
	}
}
