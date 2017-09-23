package platform.resource;

import platform.defined.resource.Baseappliance;
import platform.util.Util;

public class appliance extends Baseappliance {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
