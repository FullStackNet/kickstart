package platform.schedule;

import platform.resource.schedule;

public class BirthDayScheduleTask extends ScheduleTask {

	public BirthDayScheduleTask() {
		super(ScheduleFactory.BIRTHDAY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(schedule _schedule) {
		// TODO Auto-generated method stub
		//try {
			System.out.println("Need to process the birthday task " + _schedule.getId());
		//} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	}

}
