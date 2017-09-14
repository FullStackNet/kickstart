package application.c4t.vehicle.school.resource;

import application.c4t.vehicle.school.defined.resource.Basetest_group;
import platform.util.Util;

public class test_group extends Basetest_group {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test_group() {
		this.setId(Util.getUniqueId());
	}
	
	public test_group(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
