package platform.resource;

import platform.defined.resource.Baseemail;
import platform.util.Util;

public class email extends Baseemail {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public email() {
		this.setId(Util.getUniqueId());
	}
	
	public email(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
