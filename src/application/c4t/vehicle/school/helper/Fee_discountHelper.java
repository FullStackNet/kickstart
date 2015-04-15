package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.fee_discount;


public class Fee_discountHelper extends BaseHelper {
	
	Fee_discountHelper() {
		super(new fee_discount());
		// TODO Auto-generated constructor stub
	}
	private static Fee_discountHelper instance;
	
	public static Fee_discountHelper getInstance() {
		if (instance == null)
			instance = new Fee_discountHelper();
		return instance;
	}
}
