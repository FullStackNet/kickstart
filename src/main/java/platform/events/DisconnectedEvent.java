package platform.events;

import platform.event.EventObject;

public class DisconnectedEvent extends EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String what;
	
	public DisconnectedEvent(String what) {
		this.what = what;
	}
	
	public String getWhat() {
		return what;
	}
}
