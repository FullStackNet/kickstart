package platform.resource;

import platform.defined.resource.Baseappliance_model;
import platform.defined.resource.Baseappliance_policy;
import platform.util.Util;

public class appliance_policy extends Baseappliance_policy{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_policy() {
		this.setId(Util.getUniqueId());
	}

	public appliance_policy(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
