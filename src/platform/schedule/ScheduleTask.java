package platform.schedule;

import platform.resource.schedule;

public abstract class ScheduleTask {
	private String type;
	
	public ScheduleTask(String type) {
		this.type = type;		
	}

	public abstract void process(schedule schedule);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
