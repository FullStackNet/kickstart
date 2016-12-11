package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute_stopage;

public class route_stopage extends Baseroute_stopage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route_stopage() {
		this.setId(Util.getUniqueId());
	}
	
	public route_stopage(String id) {
		this.setId(id);
	}	
	
	public static String id(String routeId, String stopageId) {
		return routeId+"^"+stopageId;
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
