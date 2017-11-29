package platform.helper;

import platform.resource.activity;
import platform.resource.appliance_group;


public class Appliance_groupHelper extends BaseHelper {

	public Appliance_groupHelper() {
		super(new appliance_group());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_groupHelper instance;
	
	public static Appliance_groupHelper getInstance() {
		if (instance == null)
			instance = new Appliance_groupHelper();
		return instance;
	}
}
