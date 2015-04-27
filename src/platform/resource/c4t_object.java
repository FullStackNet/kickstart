package platform.resource;

import platform.defined.resource.Basec4t_object;
import platform.util.Util;

public class c4t_object extends Basec4t_object {
	/**
	 * 
	 */
	public static String OBJECT_TYPE_COMMUNITY = "COMMUNITY";
	public static String OBJECT_TYPE_COMMUNITY_GROUP = "COMMUNITY_GROUP";
	public static String OBJECT_TYPE_COMMUNITY_MEMBER = "COMMUNITY_MEMBER";
	
	private static final long serialVersionUID = 1L;
	
	public c4t_object() {
		this.setId(Util.getUniqueId());
	}
	
	public c4t_object(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
