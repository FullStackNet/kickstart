package platform.helper;

import platform.resource.appliance_model;
import platform.resource.appliance_threshold_templete;


public class Appliance_threshold_temleteHelper extends BaseHelper {

	public Appliance_threshold_temleteHelper() {
		super(new appliance_threshold_templete());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_threshold_temleteHelper instance;
	
	public static Appliance_threshold_temleteHelper getInstance() {
		if (instance == null)
			instance = new Appliance_threshold_temleteHelper();
		return instance;
	}
}
