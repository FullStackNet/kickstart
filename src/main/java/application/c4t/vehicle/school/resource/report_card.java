package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basereport_card;

public class report_card extends Basereport_card {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public report_card() {
		this.setId(Util.getUniqueId());
	}
	
	public report_card(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
