package platform.email;

import platform.resource.email;

public abstract class EmailTask {
	private String type;
	public EmailTask(String type) {
		this.type = type;		}

	public abstract void process(email email);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
