package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetimetable_interface;

public class timetable_interface extends Basetimetable_interface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public timetable_interface() {
		this.setId(Util.getUniqueId());
	}
	
	public timetable_interface(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
