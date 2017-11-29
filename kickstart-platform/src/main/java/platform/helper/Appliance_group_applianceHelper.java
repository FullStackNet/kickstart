package platform.helper;

import platform.resource.appliance_group;
import platform.resource.appliance_group_appliance;


public class Appliance_group_applianceHelper extends BaseHelper {

	public Appliance_group_applianceHelper() {
		super(new appliance_group_appliance());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_group_applianceHelper instance;
	
	public static Appliance_group_applianceHelper getInstance() {
		if (instance == null)
			instance = new Appliance_group_applianceHelper();
		return instance;
	}
}
