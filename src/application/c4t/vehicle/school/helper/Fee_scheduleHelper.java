package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.fee_schedule;


public class Fee_scheduleHelper extends BaseHelper {
	Fee_scheduleHelper() {
		super(new fee_schedule());
		// TODO Auto-generated constructor stub
	}
	private static Fee_scheduleHelper instance;
	
	public static Fee_scheduleHelper getInstance() {
		if (instance == null)
			instance = new Fee_scheduleHelper();
		return instance;
	}
	
	public BaseResource[] getfee_schedules(String parentId) {
		Expression e = new Expression(fee_schedule.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e,new String[]{fee_schedule.FIELD_DUE_DATE});
	}
	
	public BaseResource[] getfee_schedules(String[] parentIds) {
		Expression e = new Expression(fee_schedule.FIELD_PARENT_ID, REL_OP.IN, parentIds);
		return getByExpression(e,new String[]{fee_schedule.FIELD_DUE_DATE});
	}
	
}
