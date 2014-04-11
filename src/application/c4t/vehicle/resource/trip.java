package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basetrip;

public class trip extends Basetrip {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public trip() {
		this.setId(Util.getUniqueId());
	}
	
	public trip(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
