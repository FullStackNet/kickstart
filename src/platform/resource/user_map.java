package platform.resource;

import platform.defined.resource.Baseuser_map;
import platform.util.Util;

public class user_map extends Baseuser_map {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public user_map() {
		this.setId(Util.getUniqueId());
	}
	
	public user_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
