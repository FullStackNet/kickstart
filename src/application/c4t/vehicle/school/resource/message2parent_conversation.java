package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemessage2parent_conversation;

public class message2parent_conversation extends Basemessage2parent_conversation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public message2parent_conversation() {
		this.setId(Util.getUniqueId());
	}
	
	public message2parent_conversation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
