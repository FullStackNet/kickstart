package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Baseaccount_transaction;

public class account_transaction extends Baseaccount_transaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public account_transaction() {
		this.setId(Util.getUniqueId());
	}
	
	public account_transaction(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
