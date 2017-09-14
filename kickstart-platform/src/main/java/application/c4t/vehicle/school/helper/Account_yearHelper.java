package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.account_year;


public class Account_yearHelper extends BaseHelper {
	
	Account_yearHelper() {
		super(new account_year());
		// TODO Auto-generated constructor stub
	}
	private static Account_yearHelper instance;
	
	public static Account_yearHelper getInstance() {
		if (instance == null)
			instance = new Account_yearHelper();
		return instance;
	}
}
