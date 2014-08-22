package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseproficiency_master;

public class proficiency_master extends Baseproficiency_master {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public proficiency_master() {
		this.setId(Util.getUniqueId());
	}
	
	public proficiency_master(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
