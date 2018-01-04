package platform.helper;

import platform.resource.appliance_recharge;


public class Appliance_rechargeHelper extends BaseHelper {

	public Appliance_rechargeHelper() {
		super(new appliance_recharge());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_rechargeHelper instance;
	
	public static Appliance_rechargeHelper getInstance() {
		if (instance == null)
			instance = new Appliance_rechargeHelper();
		return instance;
	}
}
