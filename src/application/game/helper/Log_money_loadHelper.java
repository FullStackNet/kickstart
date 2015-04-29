package application.game.helper;

import application.game.resource.log_money_load;


public class Log_money_loadHelper extends BaseGameHelper {
	
	Log_money_loadHelper() {
		super(new log_money_load());
		// TODO Auto-generated constructor stub
	}
	private static Log_money_loadHelper instance;
	
	public static Log_money_loadHelper getInstance() {
		if (instance == null)
			instance = new Log_money_loadHelper();
		return instance;
	}
}
