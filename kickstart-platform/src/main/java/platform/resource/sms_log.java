package platform.resource;

import platform.defined.resource.Basesms_log;
import platform.util.Util;

public class sms_log extends Basesms_log {
	public static String REASON_NOTICE = "NOTICE";
	public static String REASON_DAILY_ACTIVITY = "DAILY ACTIVITY";
	public static String REASON_BUS_ENTRY = "BUS ENTRY";
	public static String REASON_BUS_EXIT = "BUS EXIT";
	public static String REASON_SCHOOL_ENTRY = "SCHOOL ENTRY";
	public static String REASON_SCHOOL_EXIT = "SCHOOL EXIT";
	public static String REASON_ALERT_STOP_REACHED = "ALERT STOP REACHED";
	public static String REASON_STOP_REACHED = "STOP REACHED";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public sms_log() {
		this.setId(Util.getUniqueId());
	}
	
	public sms_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
