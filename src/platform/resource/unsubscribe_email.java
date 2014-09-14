package platform.resource;

import platform.defined.resource.Baseunsubscribe_email;
import platform.util.Util;

public class unsubscribe_email extends Baseunsubscribe_email {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public unsubscribe_email() {
		this.setId(Util.getUniqueId());
	}
	
	public unsubscribe_email(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
