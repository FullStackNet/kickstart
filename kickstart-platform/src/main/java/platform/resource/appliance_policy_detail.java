package platform.resource;

import platform.defined.resource.Baseappliance_model;
import platform.defined.resource.Baseappliance_policy;
import platform.defined.resource.Baseappliance_policy_detail;
import platform.util.Util;

public class appliance_policy_detail extends Baseappliance_policy_detail{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_policy_detail() {
		this.setId(Util.getUniqueId());
	}

	public appliance_policy_detail(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
