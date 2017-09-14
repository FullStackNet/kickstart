package platform.resource;

import platform.defined.resource.Baseregister;
import platform.util.Util;

public class register extends Baseregister {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public register() {
		this.setId(Util.getUniqueId());
	}
	
	public register(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
