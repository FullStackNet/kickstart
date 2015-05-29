package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseaccount_year;

public class account_year extends Baseaccount_year {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public account_year() {
		this.setId(Util.getUniqueId());
	}
	
	public account_year(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
