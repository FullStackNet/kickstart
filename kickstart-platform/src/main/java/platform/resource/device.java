package platform.resource;

import platform.defined.resource.Basedevice;
import platform.util.Util;

public class device extends Basedevice {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public device() {
		this.setId(Util.getUniqueId());
	}
	
	public device(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
