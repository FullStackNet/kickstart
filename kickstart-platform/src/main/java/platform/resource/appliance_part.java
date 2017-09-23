package platform.resource;

import platform.defined.resource.Baseappliance_part;
import platform.util.Util;

public class appliance_part extends Baseappliance_part {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_part() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_part(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
