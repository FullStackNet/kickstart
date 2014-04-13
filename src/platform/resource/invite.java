package platform.resource;

import platform.defined.resource.Baseinvite;
import platform.util.Util;

public class invite extends Baseinvite {
	/**
	 * 
	 */
	public static String INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE = "JOIN_SCHOOL_TRACK_SERVICE";
	public static String INVITE_STATUS_JOINED = "JOINED";
	public static String INVITE_STATUS_PENDING = "PENDING";
	
	private static final long serialVersionUID = 1L;
	
	public invite() {
		this.setId(Util.getUniqueId());
	}
	
	public invite(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
