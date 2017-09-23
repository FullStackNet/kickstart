package platform.alert;

import platform.resource.alert;

public abstract class AlertTask {
	private String type;
	public AlertTask(String type) {
		this.type = type;		}

	public abstract void process(alert alert);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
