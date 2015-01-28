package platform.resource;

import platform.defined.resource.Basesms_daily_analysis;
import platform.util.Util;

public class sms_daily_analysis extends Basesms_daily_analysis {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public sms_daily_analysis() {
		this.setId(Util.getUniqueId());
	}
	
	public sms_daily_analysis(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
