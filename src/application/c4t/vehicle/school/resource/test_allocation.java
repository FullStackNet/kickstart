package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetest_allocation;

public class test_allocation extends Basetest_allocation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test_allocation() {
		this.setId(Util.getUniqueId());
	}
	
	public test_allocation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
