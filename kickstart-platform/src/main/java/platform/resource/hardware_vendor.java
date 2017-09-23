package platform.resource;

import platform.defined.resource.Basehardware_vendor;
import platform.util.Util;

public class hardware_vendor extends Basehardware_vendor {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public hardware_vendor() {
		this.setId(Util.getUniqueId());
	}
	
	public hardware_vendor(String id,String name,String short_code) {
		setName(name);
		setId(id);
		setShort_code(short_code);
	}
	public hardware_vendor(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
