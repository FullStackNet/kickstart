package platform.resource;

import platform.defined.resource.Baseappliance_policy;
import platform.defined.resource.Baseappliance_policy_group;
import platform.util.Util;

public class appliance_policy_group extends Baseappliance_policy_group{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_policy_group() {
		this.setId(Util.getUniqueId());
	}

	public appliance_policy_group(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
