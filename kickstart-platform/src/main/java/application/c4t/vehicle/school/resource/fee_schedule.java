package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_schedule;

public class fee_schedule extends Basefee_schedule {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_schedule() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_schedule(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
