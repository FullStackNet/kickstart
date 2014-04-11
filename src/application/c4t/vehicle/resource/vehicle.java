package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basevehicle;

public class vehicle extends Basevehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public vehicle() {
		this.setId(Util.getUniqueId());
	}
	
	public vehicle(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
