package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Baseanswer;

public class answer extends Baseanswer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public answer() {
		this.setId(Util.getUniqueId());
	}
	
	public answer(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
