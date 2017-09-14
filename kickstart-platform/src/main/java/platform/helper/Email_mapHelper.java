package platform.helper;

import platform.resource.email_map;


public class Email_mapHelper extends BaseHelper {
	
	public Email_mapHelper() {
		super(new email_map());
		// TODO Auto-generated constructor stub
	}
	private static Email_mapHelper instance;
	
	public static Email_mapHelper getInstance() {
		if (instance == null)
			instance = new Email_mapHelper();
		return instance;
	}
}
