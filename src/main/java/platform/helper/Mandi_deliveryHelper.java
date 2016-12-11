package platform.helper;

import platform.resource.mandi_delivery;


public class Mandi_deliveryHelper extends BaseHelper {

	public Mandi_deliveryHelper() {
		super(new mandi_delivery());
		// TODO Auto-generated constructor stub
	}
	
	private static Mandi_deliveryHelper instance;

	public static Mandi_deliveryHelper getInstance() {
		if (instance == null)
			instance = new Mandi_deliveryHelper();
		return instance;
	}
	
}
