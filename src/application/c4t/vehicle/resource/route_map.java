package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute_map;

public class route_map extends Baseroute_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route_map() {
		this.setId(Util.getUniqueId());
	}
	
	public route_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
