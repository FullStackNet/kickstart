package platform.resource;

import platform.defined.resource.Basenotification;
import platform.util.Util;

public class notification extends Basenotification {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public notification() {
		this.setId(Util.getUniqueId());
	}
	
	public notification(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
