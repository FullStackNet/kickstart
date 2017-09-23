package platform.resource;

import platform.defined.resource.Baseappliance_running_log;
import platform.util.ApplicationConstants;
import platform.util.Util;

public class appliance_running_log extends Baseappliance_running_log {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_running_log() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_running_log(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String id(String appliace_id,long startTime) {
		return appliace_id+ApplicationConstants.ID_SEPERATOR+startTime;
	}

}
