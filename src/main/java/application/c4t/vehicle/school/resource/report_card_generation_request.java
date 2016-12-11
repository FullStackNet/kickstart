package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basereport_card_generation_request;

public class report_card_generation_request extends Basereport_card_generation_request {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public report_card_generation_request() {
		this.setId(Util.getUniqueId());
	}
	
	public report_card_generation_request(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
