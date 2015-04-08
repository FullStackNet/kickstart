package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.fee_master;


public class Fee_masterHelper extends BaseHelper {
	Fee_masterHelper() {
		super(new fee_master());
		// TODO Auto-generated constructor stub
	}
	private static Fee_masterHelper instance;
	
	public static Fee_masterHelper getInstance() {
		if (instance == null)
			instance = new Fee_masterHelper();
		return instance;
	}
}
