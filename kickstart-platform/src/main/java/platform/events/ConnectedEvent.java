package platform.events;

import platform.event.EventObject;

public class ConnectedEvent extends EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String what;
	
	public ConnectedEvent(String what) {
		this.what = what;
	}
	
	public String getWhat() {
		return what;
	}
}
