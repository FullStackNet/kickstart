package application.community.resource;

import platform.util.Util;
import application.community.defined.resource.Basecommunity_member;

public class community_member extends Basecommunity_member {

	private static final long serialVersionUID = 1L;

	public community_member() {
		this.setId(Util.getUniqueId());
	}
	
	public community_member(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
