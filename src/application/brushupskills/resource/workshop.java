package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Baseworkshop;

public class workshop extends Baseworkshop{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public workshop() {
		this.setId(Util.getUniqueId());
	}
	
	public workshop(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
