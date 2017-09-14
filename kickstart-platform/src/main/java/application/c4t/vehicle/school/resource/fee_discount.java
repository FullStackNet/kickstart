package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_discount;

public class fee_discount extends Basefee_discount {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_discount() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_discount(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
