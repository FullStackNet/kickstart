package application.traceme.resource;

import platform.util.Util;
import application.traceme.defined.resource.Basetraceme_url;

public class traceme_url extends Basetraceme_url {
	
	public static String TRACEME_URL_STATUS_ACTIVE = "A";
	public static String TRACEME_URL_STATUS_EXPIRED = "E";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public traceme_url() {
		this.setId(Util.getUniqueId());
	}
	
	public traceme_url(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
