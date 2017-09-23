package platform.resource;

import platform.defined.resource.Baseappliance_time_series;
import platform.util.ApplicationConstants;
import platform.util.Util;

public class appliance_time_series extends Baseappliance_time_series {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_time_series() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_time_series(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String id(String appliace_id,String counter,long time) {
		return appliace_id+ApplicationConstants.ID_SEPERATOR+counter+ApplicationConstants.ID_SEPERATOR+time;
	}

}
