package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedaily_activity_calender;

public class daily_activity_calender extends Basedaily_activity_calender {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public daily_activity_calender() {
		this.setId(Util.getUniqueId());
	}
	
	public daily_activity_calender(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
