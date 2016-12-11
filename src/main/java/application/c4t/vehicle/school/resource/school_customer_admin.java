package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_customer_admin;

public class school_customer_admin extends Baseschool_customer_admin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_customer_admin() {
		this.setId(Util.getUniqueId());
	}
	
	public school_customer_admin(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
