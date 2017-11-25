package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance_policy;
import platform.resource.appliance_policy_group;


public class Appliance_policy_groupHelper extends BaseHelper {

	public Appliance_policy_groupHelper() {
		super(new appliance_policy_group());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_policy_groupHelper instance;
	
	public static Appliance_policy_groupHelper getInstance() {
		if (instance == null)
			instance = new Appliance_policy_groupHelper();
		return instance;
	}

}
