package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_breakup;

public class fee_breakup extends Basefee_breakup {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_breakup() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_breakup(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
