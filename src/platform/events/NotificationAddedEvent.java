package platform.events;

import platform.event.EventObject;

public class NotificationAddedEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotificationAddedEvent(String notificationId) {
		super(notificationId);
	}
}
