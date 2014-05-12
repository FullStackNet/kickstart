package application.c4t.vehicle.resource;

import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute;

public class route extends Baseroute {
	
	public static String ROUTE_TYPE_PICKUP = "PICKUP";
	public static String ROUTE_TYPE_DROP = "DROP";
	public static String[] ROUTE_TYPE = {
		ROUTE_TYPE_PICKUP,
		ROUTE_TYPE_DROP
	};
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route() {
		this.setId(Util.getUniqueId());
	}
	
	public route(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
