package platform.resource;

import platform.defined.resource.Baseappliance_make;
import platform.defined.resource.Baselocation_group;
import platform.util.Util;

public class location_group extends Baselocation_group{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public location_group() {
		this.setId(Util.getUniqueId());
	}

	public location_group(String id) {
		this.setId(id);
	}
	public location_group(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
