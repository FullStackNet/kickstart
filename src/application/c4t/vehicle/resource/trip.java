package application.c4t.vehicle.resource;

import java.util.Date;

import platform.util.ApplicationConstants;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.defined.resource.Basetrip;

public class trip extends Basetrip {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public trip() {
		this.setId(Util.getUniqueId());
	}
	
	public trip(String id) {
		this.setId(id);
	}	
	
	public static String id(String routeId,String timeZone,Date time,String startTime) {
		String day = TimeUtil.getDateString(timeZone, time.getTime());
		return id(routeId,day,startTime);
	}
	
	public static String id(String routeId,String day,String startTime) {
		return ""+routeId+ApplicationConstants.ID_SEPERATOR+day+ApplicationConstants.ID_SEPERATOR+startTime;
	}
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
