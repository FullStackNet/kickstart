package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestaff_present_detail;

public class staff_present_detail extends Basestaff_present_detail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public staff_present_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public staff_present_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
