package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_master;

public class fee_master extends Basefee_master {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_master() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_master(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
