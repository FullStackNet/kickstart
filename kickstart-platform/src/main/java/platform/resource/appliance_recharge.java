package platform.resource;

import platform.defined.resource.Baseappliance;
import platform.defined.resource.Baseappliance_recharge;
import platform.util.Util;

public class appliance_recharge extends Baseappliance_recharge {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_recharge() {
		this.setId(Util.getUniqueId());
	}

	public appliance_recharge(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
