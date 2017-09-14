package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basegrievance_conversation;

public class grievance_conversation extends Basegrievance_conversation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public grievance_conversation() {
		this.setId(Util.getUniqueId());
	}
	
	public grievance_conversation(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
