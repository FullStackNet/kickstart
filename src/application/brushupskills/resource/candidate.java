package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Basecandidate;

public class candidate extends Basecandidate{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public candidate() {
		this.setId(Util.getUniqueId());
	}
	
	public candidate(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
