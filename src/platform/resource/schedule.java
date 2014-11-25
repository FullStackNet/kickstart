package platform.resource;

import platform.util.Util;

public class schedule extends platform.defined.resource.Baseschedule {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public schedule() {
		this.setId(Util.getUniqueId());
	}
	
	public schedule(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	final public static String STATUS_NOT_SCHEDULED = "N";
	final public static String STATUS_PROCESSING = "P";
	final public static String STATUS_DONE = "D";
	
	final public static String FRQUENCY_ONCE = "ONCE";
	final public static String FRQUENCY_YEARLY = "YEARLY";
	final public static String FRQUENCY_MONTHLY = "MONTHLY";
	final public static String FRQUENCY_DAILY = "MONTHLY";
	final public static String FRQUENCY_HOURLY = "HOURLY";	
	final public static String[] frequencies = {
		FRQUENCY_ONCE,
		FRQUENCY_YEARLY,
		FRQUENCY_MONTHLY,
		FRQUENCY_DAILY,
		FRQUENCY_HOURLY
	};
}
