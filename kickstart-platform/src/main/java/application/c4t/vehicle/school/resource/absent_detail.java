package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseabsent_detail;

public class absent_detail extends Baseabsent_detail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public absent_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public absent_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
