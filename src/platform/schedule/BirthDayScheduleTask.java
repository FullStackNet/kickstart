package platform.schedule;

import platform.message.Schedule;

public class BirthDayScheduleTask extends SchduleTask {

	public BirthDayScheduleTask() {
		super(ScheduleFactory.BIRTHDAY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Schedule schedule) {
		// TODO Auto-generated method stub
		//try {
			System.out.println("Need to process the birthday task");
		//} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	}

}
