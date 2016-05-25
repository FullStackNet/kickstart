package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basetest_question;

public class test_question extends Basetest_question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public test_question() {
		this.setId(Util.getUniqueId());
	}
	
	public test_question(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
