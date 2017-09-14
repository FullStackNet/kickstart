package platform.resource;

import platform.defined.resource.Baseactivity;
import platform.util.Util;

public class activity extends Baseactivity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public activity() {
		this.setId(Util.getUniqueId());
	}
	
	public activity(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
