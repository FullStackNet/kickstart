package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance_make;
import platform.resource.appliance_plan;


public class Appliance_planHelper extends BaseHelper {

	public Appliance_planHelper() {
		super(new appliance_plan());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_planHelper instance;
	
	public static Appliance_planHelper getInstance() {
		if (instance == null)
			instance = new Appliance_planHelper();
		return instance;
	}

	public BaseResource[] getApplinacePlan(String applianceId) {
		Expression e = new Expression(appliance_plan.FIELD_APPLIANCE_ID, REL_OP.EQ,applianceId);
		return getByExpression(e,new String[]{appliance_plan.FIELD_START_DATE + " desc"});
	}
}
