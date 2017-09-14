package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_customer;

public class school_customer extends Baseschool_customer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_customer() {
		this.setId(Util.getUniqueId());
	}
	
	public school_customer(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
