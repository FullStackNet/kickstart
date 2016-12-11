package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.fee_heading;


public class Fee_headingHelper extends BaseHelper {
	Fee_headingHelper() {
		super(new fee_heading());
		// TODO Auto-generated constructor stub
	}
	private static Fee_headingHelper instance;
	
	public static Fee_headingHelper getInstance() {
		if (instance == null)
			instance = new Fee_headingHelper();
		return instance;
	}
}
