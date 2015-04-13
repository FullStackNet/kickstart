package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetimetable;

public class timetable extends Basetimetable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public timetable() {
		this.setId(Util.getUniqueId());
	}
	
	public timetable(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
