package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseschedule;

public class schedule extends Baseschedule {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public schedule() {
		this.setId(Util.getUniqueId());
	}
	
	public schedule(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
