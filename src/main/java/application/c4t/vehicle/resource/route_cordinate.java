package application.c4t.vehicle.resource;

import platform.util.ApplicationConstants;
import platform.util.Util;
import application.c4t.vehicle.defined.resource.Baseroute_cordinate;

public class route_cordinate extends Baseroute_cordinate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public route_cordinate() {
		this.setId(Util.getUniqueId());
	}
	
	public route_cordinate(String id) {
		this.setId(id);
	}	
	
	public static String id(String route_id,String stopage_id,String longitude,String latitude) {
		return ""+route_id+ApplicationConstants.ID_SEPERATOR+stopage_id+ApplicationConstants.ID_SEPERATOR+longitude+ApplicationConstants.ID_SEPERATOR+latitude;
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
