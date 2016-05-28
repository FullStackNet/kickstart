package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetest_user_allocation;

public class test_user_allocation extends Basetest_user_allocation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test_user_allocation() {
		this.setId(Util.getUniqueId());
	}
	
	public test_user_allocation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
