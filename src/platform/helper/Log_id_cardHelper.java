package platform.helper;

import platform.resource.activity;


public class Log_id_cardHelper extends BaseHelper {
	
	public Log_id_cardHelper() {
		super(new activity());
		// TODO Auto-generated constructor stub
	}
	private static Log_id_cardHelper instance;
	
	public static Log_id_cardHelper getInstance() {
		if (instance == null)
			instance = new Log_id_cardHelper();
		return instance;
	}
}
