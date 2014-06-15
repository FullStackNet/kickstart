package application.c4t.vehicle.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.resource.trip;


public class TripHelper extends BaseHelper {
	
	public TripHelper() {
		super(new trip());
		// TODO Auto-generated constructor stub
	}
	private static TripHelper instance;
	
	public static TripHelper getInstance() {
		if (instance == null)
			instance = new TripHelper();
		return instance;
	}
	
	public BaseResource[] getTrips(String customerId, long fromTime, long toTime) {
		Expression e1 = new Expression(trip.FIELD_CREATION_TIME,REL_OP.GT, fromTime);
		Expression e2 = new Expression(trip.FIELD_CREATION_TIME,REL_OP.LT, toTime);
		Expression e3 = new Expression(trip.FIELD_CUSTOMER_ID,REL_OP.EQ, customerId);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e, new String[]{trip.FIELD_ROUTE_NAME});
	}
}
