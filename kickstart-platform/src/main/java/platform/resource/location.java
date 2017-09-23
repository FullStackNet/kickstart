package platform.resource;

import platform.defined.resource.Baselocation;
import platform.util.Util;

public class location extends Baselocation {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public location() {
		this.setId(Util.getUniqueId());
	}
	
	public location(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
