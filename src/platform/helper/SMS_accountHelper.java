package platform.helper;

import platform.resource.sms_account;


public class SMS_accountHelper extends BaseHelper {

	public SMS_accountHelper() {
		super(new sms_account());
		// TODO Auto-generated constructor stub
	}
	
	private static SMS_accountHelper instance;

	public static SMS_accountHelper getInstance() {
		if (instance == null)
			instance = new SMS_accountHelper();
		return instance;
	}
}
