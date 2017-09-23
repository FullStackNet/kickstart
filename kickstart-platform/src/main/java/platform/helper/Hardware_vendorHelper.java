package platform.helper;

import platform.resource.hardware_vendor;


public class Hardware_vendorHelper extends BaseHelper {
	
	public Hardware_vendorHelper() {
		super(new hardware_vendor());
		// TODO Auto-generated constructor stub
	}
	private static Hardware_vendorHelper instance;
	
	public static Hardware_vendorHelper getInstance() {
		if (instance == null)
			instance = new Hardware_vendorHelper();
		return instance;
	}
}
