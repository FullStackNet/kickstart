package platform.schedule;

import platform.message.Schedule;

public abstract class SchduleTask {
	private String type;
	
	public SchduleTask(String type) {
		this.type = type;		
	}

	public abstract void process(Schedule schedule);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
