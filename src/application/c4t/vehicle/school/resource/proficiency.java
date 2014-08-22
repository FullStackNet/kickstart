package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseproficiency;

public class proficiency extends Baseproficiency {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public proficiency() {
		this.setId(Util.getUniqueId());
	}
	
	public proficiency(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
