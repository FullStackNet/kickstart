package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baserecharge;

public class recharge extends Baserecharge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public recharge() {
		this.setId(Util.getUniqueId());
	}
	
	public recharge(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
