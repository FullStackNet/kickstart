package platform.resource;

import platform.defined.resource.Baseappliance_group;
import platform.defined.resource.Baseappliance_make;
import platform.util.Util;

public class appliance_group extends Baseappliance_group{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_group() {
		this.setId(Util.getUniqueId());
	}

	public appliance_group(String id) {
		this.setId(id);
	}
	public appliance_group(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
