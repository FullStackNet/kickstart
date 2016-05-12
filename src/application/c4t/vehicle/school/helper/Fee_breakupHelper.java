package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.fee_breakup;


public class Fee_breakupHelper extends BaseHelper {
	Fee_breakupHelper() {
		super(new fee_breakup());
		// TODO Auto-generated constructor stub
	}
	private static Fee_breakupHelper instance;
	
	public static Fee_breakupHelper getInstance() {
		if (instance == null)
			instance = new Fee_breakupHelper();
		return instance;
	}
	
	public BaseResource[] getFee_breakups(String parentId) {
		Expression e = new Expression(fee_breakup.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
		
	
	public BaseResource[] getFee_breakups(String[] parentIds) {
		Expression e = new Expression(fee_breakup.FIELD_PARENT_ID, REL_OP.IN, parentIds);
		return getByExpression(e);
	}
	
}
