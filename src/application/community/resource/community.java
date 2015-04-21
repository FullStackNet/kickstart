package application.community.resource;

import platform.util.Util;
import application.community.defined.resource.Basecommunity;

public class community extends Basecommunity {

	private static final long serialVersionUID = 1L;

	public community() {
		this.setId(Util.getUniqueId());
	}
	
	public community(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
