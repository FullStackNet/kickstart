package platform.helper;

import platform.resource.email_account;


public class Email_accountHelper extends BaseHelper {

	public Email_accountHelper() {
		super(new email_account());
		// TODO Auto-generated constructor stub
	}
	
	private static Email_accountHelper instance;

	public static Email_accountHelper getInstance() {
		if (instance == null)
			instance = new Email_accountHelper();
		return instance;
	}
}
