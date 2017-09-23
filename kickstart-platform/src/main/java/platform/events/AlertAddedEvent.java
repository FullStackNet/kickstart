package platform.events;

import platform.event.EventObject;

public class AlertAddedEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AlertAddedEvent(String alertId) {
		super(alertId);
	}
}
