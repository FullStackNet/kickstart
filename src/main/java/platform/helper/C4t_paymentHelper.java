package platform.helper;

import platform.resource.c4t_payment;


public class C4t_paymentHelper extends BaseHelper {

	public C4t_paymentHelper() {
		super(new c4t_payment());
		// TODO Auto-generated constructor stub
	}
	private static C4t_paymentHelper instance;

	public static C4t_paymentHelper getInstance() {
		if (instance == null)
			instance = new C4t_paymentHelper();
		return instance;
	}
}
