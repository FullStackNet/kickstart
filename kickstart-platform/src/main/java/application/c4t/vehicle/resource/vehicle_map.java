package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basevehicle_map;

public class vehicle_map extends Basevehicle_map {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public vehicle_map() {
		this.setId(Util.getUniqueId());
	}
	
	public vehicle_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
