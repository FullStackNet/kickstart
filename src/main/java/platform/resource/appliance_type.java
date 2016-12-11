package platform.resource;

import platform.defined.resource.Baseappliance_type;
import platform.util.Util;

public class appliance_type extends Baseappliance_type {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_type() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_type(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
