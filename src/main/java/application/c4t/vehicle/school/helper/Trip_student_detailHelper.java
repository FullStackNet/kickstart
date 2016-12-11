package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.trip_student_detail;


public class Trip_student_detailHelper extends BaseHelper {
	Trip_student_detailHelper() {
		super(new trip_student_detail());
		// TODO Auto-generated constructor stub
	}
	private static Trip_student_detailHelper instance;
	
	public static Trip_student_detailHelper getInstance() {
		if (instance == null)
			instance = new Trip_student_detailHelper();
		return instance;
	}
	
	public BaseResource[] getbyTrip(String tripId) {
		Expression e = new Expression(trip_student_detail.FIELD_TRIP_ID, REL_OP.EQ, tripId);
		return getByExpression(e, new String[]{trip_student_detail.FIELD_STUDENT_NAME});
	}
}
