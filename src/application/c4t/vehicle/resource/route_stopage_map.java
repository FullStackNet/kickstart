package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute_stopage_map;

public class route_stopage_map extends Baseroute_stopage_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route_stopage_map() {
		this.setId(Util.getUniqueId());
	}
	
	public route_stopage_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
