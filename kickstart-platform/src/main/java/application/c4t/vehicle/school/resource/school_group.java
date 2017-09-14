package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_group;

public class school_group extends Baseschool_group {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_group() {
		this.setId(Util.getUniqueId());
	}
	
	public school_group(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
