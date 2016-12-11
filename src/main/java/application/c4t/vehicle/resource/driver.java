package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basedriver;

public class driver extends Basedriver {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public driver() {
		this.setId(Util.getUniqueId());
	}
	
	public driver(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
