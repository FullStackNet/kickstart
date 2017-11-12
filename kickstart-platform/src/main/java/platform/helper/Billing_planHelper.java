package platform.helper;

import platform.resource.appliance_plan;
import platform.resource.billing_plan;


public class Billing_planHelper extends BaseHelper {

	public Billing_planHelper() {
		super(new billing_plan());
		// TODO Auto-generated constructor stub
	}
	private static Billing_planHelper instance;
	
	public static Billing_planHelper getInstance() {
		if (instance == null)
			instance = new Billing_planHelper();
		return instance;
	}
}
