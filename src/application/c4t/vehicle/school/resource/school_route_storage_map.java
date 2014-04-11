package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseschool_route_stopage_map;

public class school_route_storage_map extends Baseschool_route_stopage_map{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public school_route_storage_map() {
		this.setId(Util.getUniqueId());
	}
	
	public school_route_storage_map(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
