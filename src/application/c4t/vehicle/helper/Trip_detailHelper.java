package application.c4t.vehicle.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.resource.trip_detail;


public class Trip_detailHelper extends BaseHelper {
	
	public Trip_detailHelper() {
		super(new trip_detail());
		// TODO Auto-generated constructor stub
	}
	private static Trip_detailHelper instance;
	
	public static Trip_detailHelper getInstance() {
		if (instance == null)
			instance = new Trip_detailHelper();
		return instance;
	}
	
	public BaseResource[] getTripDetail(String tripId) {
		Expression e = new Expression(trip_detail.FIELD_TRIP_ID, REL_OP.EQ, tripId);
		return getByExpression(e,new String[]{trip_detail.FIELD_REACH_TIME});
	}
}
