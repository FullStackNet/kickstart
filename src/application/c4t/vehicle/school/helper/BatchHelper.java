package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.batch;


public class BatchHelper extends BaseHelper {
	
	BatchHelper() {
		super(new batch());
		// TODO Auto-generated constructor stub
	}
	private static BatchHelper instance;
	
	public static BatchHelper getInstance() {
		if (instance == null)
			instance = new BatchHelper();
		return instance;
	}
	
	public BaseResource[] getByOnlineBatchForCustomerId(String customerId) {
		Expression e1 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e2 = new Expression("online", REL_OP.EQ, "Y");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e, new String[]{"name"});
	}
}
