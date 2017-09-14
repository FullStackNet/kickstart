package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basepractical_attendance;

public class practical_attendance extends Basepractical_attendance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public practical_attendance() {
		this.setId(Util.getUniqueId());
	}
	
	public practical_attendance(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
