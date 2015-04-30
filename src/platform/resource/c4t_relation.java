package platform.resource;

import platform.defined.resource.Basec4t_relation;
import platform.util.ApplicationConstants;
import platform.util.Util;

public class c4t_relation extends Basec4t_relation  {
	/**
	 * 
	 */
	public static String RT_COMMUNITY_AND_COMMUNITY_GROUP  = "COMMUNITY->COMMUNITY_GROUP";
	public static String RT_COMMUNITY_AND_COMMUNITY_MEMBER  = "COMMUNITY->COMMUNITY_MEMBER";
	public static String RT_COMMUNITY_AND_DISTRIBUTER  = "COMMUNITY->DISTRIBUTER";
	public static String RT_COMMUNITY_AND_DEALER  = "COMMUNITY->DEALER";
	public static String RT_DISTRIBUTER_AND_DEALER  = "DISTRIBUTER->DEALER";
	public static String RT_COMMUNITY_DISTRIBUTER_AND_MEMBER  = "DISTRIBUTER->COMMUNITY_MEMBER";
	public static String RT_COMMUNITY_DEALER_AND_MEMBER  = "DEALER->COMMUNITY_MEMBER";
	private static final long serialVersionUID = 1L;
	
	public static String getMapId(String from_id,String relation_type) {
		return from_id+ApplicationConstants.ID_SEPERATOR+relation_type;
	}
	
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
