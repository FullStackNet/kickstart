package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute_cordinate_raw;

public class route_cordinate_raw extends Baseroute_cordinate_raw {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route_cordinate_raw() {
		this.setId(Util.getUniqueId());
	}
	
	public route_cordinate_raw(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
