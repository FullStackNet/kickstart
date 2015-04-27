package platform.resource;

import platform.defined.resource.Basec4t_relation;
import platform.util.ApplicationConstants;
import platform.util.Util;

public class c4t_relation extends Basec4t_relation  {
	/**
	 * 
	 */
	public static String C4T_OBJECT_RELATION_TYPE_COMMUNITY_AND_COMMUNITY_GROUP  = "COMMUNITY->COMMUNITY_GROUP";
	public static String C4T_OBJECT_RELATION_TYPE_COMMUNITY_AND_COMMUNITY_MEMBER  = "COMMUNITY->COMMUNITY_MEMBER";

	private static final long serialVersionUID = 1L;
	
	public c4t_relation() {
		this.setId(Util.getUniqueId());
	}
	
	
	public c4t_relation(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String id(String from_id,String to_id, String relationType) {
		return from_id+ApplicationConstants.ID_SEPERATOR+to_id+ApplicationConstants.ID_SEPERATOR+relationType;
	}

}
