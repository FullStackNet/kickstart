package platform.resource;

import platform.defined.resource.Baseappliance_group;
import platform.defined.resource.Baseappliance_group_appliance;
import platform.util.Util;

public class appliance_group_appliance extends Baseappliance_group_appliance{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_group_appliance() {
		this.setId(Util.getUniqueId());
	}

	public appliance_group_appliance(String id) {
		this.setId(id);
	}

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
