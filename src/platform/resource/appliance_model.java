package platform.resource;

import platform.defined.resource.Baseappliance_model;
import platform.util.Util;

public class appliance_model extends Baseappliance_model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_model() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_model(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
