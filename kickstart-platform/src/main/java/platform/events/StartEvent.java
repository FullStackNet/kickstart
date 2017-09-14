package platform.events;

import platform.event.EventObject;

public class StartEvent extends EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String what;
	
	public StartEvent(String what) {
		this.what = what;
	}
	
	public String getWhat() {
		return what;
	}
}
