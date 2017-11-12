package platform.resource;

import platform.defined.resource.Baseappliance_plan;
import platform.defined.resource.Basebilling_plan;
import platform.util.Util;

public class appliance_plan extends Baseappliance_plan {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_plan() {
		this.setId(Util.getUniqueId());
	}

	public appliance_plan(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
