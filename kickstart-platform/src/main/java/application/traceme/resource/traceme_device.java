package application.traceme.resource;

import platform.util.Util;
import application.traceme.defined.resource.Basetraceme_device;

public class traceme_device extends Basetraceme_device {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public traceme_device() {
		this.setId(Util.getUniqueId());
	}
	
	public traceme_device(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
