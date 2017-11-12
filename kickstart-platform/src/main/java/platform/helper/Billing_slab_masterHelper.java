package platform.helper;

import platform.resource.billing_plan;
import platform.resource.billing_slab_master;


public class Billing_slab_masterHelper extends BaseHelper {

	public Billing_slab_masterHelper() {
		super(new billing_slab_master());
		// TODO Auto-generated constructor stub
	}
	private static Billing_slab_masterHelper instance;
	
	public static Billing_slab_masterHelper getInstance() {
		if (instance == null)
			instance = new Billing_slab_masterHelper();
		return instance;
	}
}
