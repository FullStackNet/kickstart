package platform.resource;

import platform.defined.resource.Basemobile_map;
import platform.util.Util;

public class mobile_map extends Basemobile_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public mobile_map() {
		this.setId(Util.getUniqueId());
	}
	
	public mobile_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
