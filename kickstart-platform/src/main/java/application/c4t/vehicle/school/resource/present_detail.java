package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basepresent_detail;

public class present_detail extends Basepresent_detail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public present_detail() {
		this.setId(Util.getUniqueId());
	}
	
	public present_detail(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
