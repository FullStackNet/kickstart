package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basemy_interview;

public class my_interview extends Basemy_interview{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public my_interview() {
		this.setId(Util.getUniqueId());
	}
	
	public my_interview(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
