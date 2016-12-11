package platform.resource;

import platform.defined.resource.Baseapp_summary;
import platform.util.Util;

public class app_summary extends Baseapp_summary {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public app_summary() {
		this.setId(Util.getUniqueId());
	}
	
	public app_summary(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
