package platform.resource;

import platform.defined.resource.Baseappliance_make;
import platform.util.Util;

public class appliance_make extends Baseappliance_make{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public appliance_make() {
		this.setId(Util.getUniqueId());
	}
	
	public appliance_make(String id) {
		this.setId(id);
	}
	public appliance_make(String id,String name, String type) {
		this.setId(id);
		this.setName(name);
		this.setAppliance_type(type);
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
