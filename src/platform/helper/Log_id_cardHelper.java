package platform.helper;

import platform.resource.activity;
import platform.resource.log_id_card;
import platform.util.ApplicationException;


public class Log_id_cardHelper extends BaseHelper {
	
	public Log_id_cardHelper() {
		super(new log_id_card());
		// TODO Auto-generated constructor stub
	}
	private static Log_id_cardHelper instance;
	
	public static Log_id_cardHelper getInstance() {
		if (instance == null)
			instance = new Log_id_cardHelper();
		return instance;
	}
	
	public void update(log_id_card _log) {
		try {
			super.update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateReason(log_id_card _log, String reason) {
		_log.setError_reason(reason);
		Log_id_cardHelper.getInstance().update(_log);
	}
}
