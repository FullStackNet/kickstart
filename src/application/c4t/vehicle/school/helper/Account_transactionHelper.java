package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.account_transaction;


public class Account_transactionHelper extends BaseHelper {
	
	Account_transactionHelper() {
		super(new account_transaction());
		// TODO Auto-generated constructor stub
	}
	private static Account_transactionHelper instance;
	
	public static Account_transactionHelper getInstance() {
		if (instance == null)
			instance = new Account_transactionHelper();
		return instance;
	}
}
