package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basemessage2school_conversation;

public class message2school_conversation extends Basemessage2school_conversation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public message2school_conversation() {
		this.setId(Util.getUniqueId());
	}
	
	public message2school_conversation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
