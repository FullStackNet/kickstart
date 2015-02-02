package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestaff_timing;

public class staff_timing extends Basestaff_timing {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public staff_timing() {
		this.setId(Util.getUniqueId());
	}
	
	public staff_timing(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
