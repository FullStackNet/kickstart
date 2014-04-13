package platform.resource;

import platform.defined.resource.Baseemail_map;
import platform.util.Util;

public class email_map extends Baseemail_map {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public email_map() {
		this.setId(Util.getUniqueId());
	}
	
	public email_map(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
