package platform.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance_policy;


public class Appliance_policyHelper extends BaseHelper {

	public Appliance_policyHelper() {
		super(new appliance_policy());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_policyHelper instance;
	
	public static Appliance_policyHelper getInstance() {
		if (instance == null)
			instance = new Appliance_policyHelper();
		return instance;
	}


	public BaseResource[] getAppliancePolicies(String customerId, String type) {
		Expression e1 = new Expression(appliance_policy.FIELD_CUSTOMER_ID, REL_OP.EQ,customerId);
		Expression e2 = new Expression(appliance_policy.FIELD_APPLIANCE_TYPE, REL_OP.EQ,type);
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);

	}

}
