package platform.resource;

import platform.defined.resource.Basefeed;
import platform.util.Util;

public class feed extends Basefeed {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public feed() {
		this.setId(Util.getUniqueId());
	}
	
	public feed(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
