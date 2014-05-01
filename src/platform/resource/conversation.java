package platform.resource;

import platform.defined.resource.Baseconversation;
import platform.util.Util;

public class conversation extends Baseconversation {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public conversation() {
		this.setId(Util.getUniqueId());
	}
	
	public conversation(String id) {
		this.setId(id);
	}	
	
	public static String id(String fromId, String toId) {
		return fromId+"^"+toId;
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
