package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_account;

public class school_account extends Baseschool_account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_account() {
		this.setId(Util.getUniqueId());
	}
	
	public school_account(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
