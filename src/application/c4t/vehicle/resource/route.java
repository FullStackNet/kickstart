package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute;

public class route extends Baseroute {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route() {
		this.setId(Util.getUniqueId());
	}
	
	public route(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
