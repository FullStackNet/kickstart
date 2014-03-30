package platform.resource;

import platform.defined.resource.Basepacket;
import platform.util.Util;

public class packet extends Basepacket {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public packet() {
		this.setId(Util.getUniqueId());
	}
	
	public packet(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
