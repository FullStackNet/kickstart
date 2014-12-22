package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basetransaction;

public class transaction extends Basetransaction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public transaction() {
		this.setId(Util.getUniqueId());
	}
	
	public transaction(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
