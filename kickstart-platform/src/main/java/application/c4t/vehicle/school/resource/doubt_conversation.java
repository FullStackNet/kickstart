package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basedoubt_conversation;

public class doubt_conversation extends Basedoubt_conversation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public doubt_conversation() {
		this.setId(Util.getUniqueId());
	}
	
	public doubt_conversation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
