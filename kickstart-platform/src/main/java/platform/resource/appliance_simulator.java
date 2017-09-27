package platform.resource;

import platform.defined.resource.Baseappliance;
import platform.defined.resource.Baseappliance_simulator;
import platform.util.Util;

public class appliance_simulator extends Baseappliance_simulator {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public appliance_simulator() {
		this.setId(Util.getUniqueId());
	}

	public appliance_simulator(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
