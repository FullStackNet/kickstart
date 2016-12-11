package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseattendent;

public class attendent extends Baseattendent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public attendent() {
		this.setId(Util.getUniqueId());
	}
	
	public attendent(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
