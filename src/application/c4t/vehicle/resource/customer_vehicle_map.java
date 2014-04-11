package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basecustomer_vehicle_map;

public class customer_vehicle_map extends Basecustomer_vehicle_map {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public customer_vehicle_map() {
		this.setId(Util.getUniqueId());
	}
	
	public customer_vehicle_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
