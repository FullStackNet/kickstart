package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basework_sheet_result;

public class work_sheet_result extends Basework_sheet_result {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public work_sheet_result() {
		this.setId(Util.getUniqueId());
	}
	
	public work_sheet_result(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
