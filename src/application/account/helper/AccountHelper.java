package application.account.helper;

import platform.helper.BaseHelper;
import application.account.resource.account;

public class AccountHelper extends BaseHelper{

	private static AccountHelper instance;

	public static AccountHelper getInstance() {
		if (instance == null)
			instance = new AccountHelper();
		return instance;
	}
	
	public AccountHelper() {
		super(new account());
		// TODO Auto-generated constructor stub
	}
}
