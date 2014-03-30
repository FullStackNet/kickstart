package platform.resource;

import platform.defined.resource.Baseprofile;
import platform.util.Util;

public class profile extends Baseprofile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public profile() {
		this.setId(Util.getUniqueId());
	}
	
	public profile(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
