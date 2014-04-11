package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseschedule_stopage;

public class schedule_stopage extends Baseschedule_stopage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public schedule_stopage() {
		this.setId(Util.getUniqueId());
	}
	
	public schedule_stopage(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
