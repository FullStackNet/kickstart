package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.recharge;


public class RechargeHelper extends BaseHelper {
	RechargeHelper() {
		super(new recharge());
		// TODO Auto-generated constructor stub
	}
	private static RechargeHelper instance;
	
	public static RechargeHelper getInstance() {
		if (instance == null)
			instance = new RechargeHelper();
		return instance;
	}
	
	
}
