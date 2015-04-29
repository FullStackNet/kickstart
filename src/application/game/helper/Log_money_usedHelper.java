package application.game.helper;

import application.game.resource.log_money_used;


public class Log_money_usedHelper extends BaseGameHelper {
	
	Log_money_usedHelper() {
		super(new log_money_used());
		// TODO Auto-generated constructor stub
	}
	private static Log_money_usedHelper instance;
	
	public static Log_money_usedHelper getInstance() {
		if (instance == null)
			instance = new Log_money_usedHelper();
		return instance;
	}
}
