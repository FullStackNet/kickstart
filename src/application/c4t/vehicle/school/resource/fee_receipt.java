package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_receipt;

public class fee_receipt extends Basefee_receipt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_receipt() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_receipt(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
