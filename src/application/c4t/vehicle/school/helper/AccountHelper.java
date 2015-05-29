package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.account.resource.account;


public class AccountHelper extends BaseHelper {
	
	AccountHelper() {
		super(new account());
		// TODO Auto-generated constructor stub
	}
	private static AccountHelper instance;
	
	public static AccountHelper getInstance() {
		if (instance == null)
			instance = new AccountHelper();
		return instance;
	}
}
