package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.account_heading;


public class Account_headingHelper extends BaseHelper {
	
	Account_headingHelper() {
		super(new account_heading());
		// TODO Auto-generated constructor stub
	}
	private static Account_headingHelper instance;
	
	public static Account_headingHelper getInstance() {
		if (instance == null)
			instance = new Account_headingHelper();
		return instance;
	}
}
