package platform.resource;

import platform.defined.resource.Basesms_log;
import platform.util.Util;

public class sms_log extends Basesms_log {
	
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
