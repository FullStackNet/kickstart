package application.community.resource;

import platform.util.Util;
import application.community.defined.resource.Basecommunity_group;

public class community_group extends Basecommunity_group {

	private static final long serialVersionUID = 1L;

	public community_group() {
		this.setId(Util.getUniqueId());
	}
	
	public community_group(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
