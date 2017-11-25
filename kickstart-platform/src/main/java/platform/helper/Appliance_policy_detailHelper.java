package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance_policy_detail;


public class Appliance_policy_detailHelper extends BaseHelper {

	public Appliance_policy_detailHelper() {
		super(new appliance_policy_detail());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_policy_detailHelper instance;
	
	public static Appliance_policy_detailHelper getInstance() {
		if (instance == null)
			instance = new Appliance_policy_detailHelper();
		return instance;
	}

	public BaseResource[] getPolicyDetails(String policyId) {
		Expression e = new Expression(appliance_policy_detail.FIELD_POLICY_ID, REL_OP.EQ,policyId);
		return getByExpression(e);
	}
}
