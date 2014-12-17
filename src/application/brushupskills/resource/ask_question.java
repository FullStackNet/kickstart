package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Baseask_question;

public class ask_question extends Baseask_question{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ask_question() {
		this.setId(Util.getUniqueId());
	}
	
	public ask_question(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
