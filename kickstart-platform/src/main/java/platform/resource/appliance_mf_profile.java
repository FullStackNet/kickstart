package platform.resource;

import platform.defined.resource.Baseappliance;
import platform.defined.resource.Baseappliance_mf_profile;
import platform.util.Util;

public class appliance_mf_profile extends Baseappliance_mf_profile {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_mf_profile() {
		this.setId(Util.getUniqueId());
	}

	public appliance_mf_profile(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
