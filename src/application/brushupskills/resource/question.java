package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basequestion;

public class question extends Basequestion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public question() {
		this.setId(Util.getUniqueId());
	}
	
	public question(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
