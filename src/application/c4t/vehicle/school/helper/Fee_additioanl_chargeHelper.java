package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.fee_additional_charge;


public class Fee_additioanl_chargeHelper extends BaseHelper {
	
	Fee_additioanl_chargeHelper() {
		super(new fee_additional_charge());
		// TODO Auto-generated constructor stub
	}
	private static Fee_additioanl_chargeHelper instance;
	
	public static Fee_additioanl_chargeHelper getInstance() {
		if (instance == null)
			instance = new Fee_additioanl_chargeHelper();
		return instance;
	}
}
