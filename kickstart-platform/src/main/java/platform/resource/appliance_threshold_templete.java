package platform.resource;

import platform.defined.resource.Baseappliance_model;
import platform.defined.resource.Baseappliance_threshold_templete;
import platform.util.Util;

public class appliance_threshold_templete extends Baseappliance_threshold_templete{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_threshold_templete() {
		this.setId(Util.getUniqueId());
	}

	public appliance_threshold_templete(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
