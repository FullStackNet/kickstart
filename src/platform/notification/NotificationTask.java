package platform.notification;

import platform.resource.notification;

public abstract class NotificationTask {
	private String type;
	public NotificationTask(String type) {
		this.type = type;		}

	public abstract void process(notification notification);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
