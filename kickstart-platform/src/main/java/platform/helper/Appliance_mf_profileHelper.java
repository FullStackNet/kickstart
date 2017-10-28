package platform.helper;

import platform.resource.activity;
import platform.resource.appliance_mf_profile;


public class Appliance_mf_profileHelper extends BaseHelper {

	public Appliance_mf_profileHelper() {
		super(new appliance_mf_profile());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_mf_profileHelper instance;
	
	public static Appliance_mf_profileHelper getInstance() {
		if (instance == null)
			instance = new Appliance_mf_profileHelper();
		return instance;
	}
}
