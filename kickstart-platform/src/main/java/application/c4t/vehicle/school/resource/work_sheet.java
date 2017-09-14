package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basework_sheet;

public class work_sheet extends Basework_sheet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public work_sheet() {
		this.setId(Util.getUniqueId());
	}
	
	public work_sheet(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
