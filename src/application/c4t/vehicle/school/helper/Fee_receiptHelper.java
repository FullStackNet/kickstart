package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.fee_receipt;


public class Fee_receiptHelper extends BaseHelper {
	
	Fee_receiptHelper() {
		super(new fee_receipt());
		// TODO Auto-generated constructor stub
	}
	private static Fee_receiptHelper instance;
	
	public static Fee_receiptHelper getInstance() {
		if (instance == null)
			instance = new Fee_receiptHelper();
		return instance;
	}
}
