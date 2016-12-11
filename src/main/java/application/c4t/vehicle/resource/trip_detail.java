package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basetrip_detail;

public class trip_detail extends Basetrip_detail {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public trip_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public trip_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
