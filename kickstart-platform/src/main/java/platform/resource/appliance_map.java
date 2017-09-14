package platform.resource;

import platform.defined.resource.Baseappliance_map;
import platform.util.Util;

public class appliance_map extends Baseappliance_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_map() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
