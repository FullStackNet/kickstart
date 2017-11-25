package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.activity;
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

	public BaseResource[] getGroupPolicies(String groupId) {
		Expression e = new Expression(appliance_policy.FIELD_GROUP_ID, REL_OP.EQ,groupId);
		return getByExpression(e);
	}
}
