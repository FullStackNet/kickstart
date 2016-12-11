package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basefee_additional_charge;

public class fee_additional_charge extends Basefee_additional_charge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public fee_additional_charge() {
		this.setId(Util.getUniqueId());
	}
	
	public fee_additional_charge(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
