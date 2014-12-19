package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Baseonline_session;

public class online_session extends Baseonline_session{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public online_session() {
		this.setId(Util.getUniqueId());
	}
	
	public online_session(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
