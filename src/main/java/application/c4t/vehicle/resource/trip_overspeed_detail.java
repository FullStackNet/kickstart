package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basetrip_overspeed_detail;

public class trip_overspeed_detail extends Basetrip_overspeed_detail {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public trip_overspeed_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public trip_overspeed_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
