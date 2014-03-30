package platform.events;

import platform.event.EventObject;

public class StopEvent extends EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String what;
	
	public StopEvent(String what) {
		this.what = what;
	}
	
	public String getWhat() {
		return what;
	}
}
