package application.brushupskills.resource;

import platform.util.Util;
import application.brushupskills.defined.resource.Baseconsumption;

public class consumption extends Baseconsumption{

	/**
	 * 
	 */
	public  static String ONLINE_SESSION_REGISTER = "ONLINE_SESSION_REGISTER";
	public  static String WORKSHOP_REGISTER = "WORKSHOP_REGISTER";
	private static final long serialVersionUID = 1L;

	public consumption() {
		this.setId(Util.getUniqueId());
	}
	
	public consumption(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
