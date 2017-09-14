package platform.thread;



import java.util.Date;

import platform.helper.ScheduleHelper;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.schedule.ScheduleTask;
import platform.schedule.ScheduleTaskManager;
import platform.util.TimeUtil;
import platform.util.Util;

public class Scheduler extends ApplicationThread{
	ApplicationThreadPool pool;
	public Scheduler() {
		super("SCHEDULER_THREAD", 10000L);
		// TODO Auto-generated constructor stub	
	}

	void reschedule(schedule _schedule) {
		if (schedule.FRQUENCY_YEARLY.equals(_schedule.getFrequency())) {
			ScheduleHelper.getInstance().reschedule(_schedule.getId(), 
					TimeUtil.addYear(_schedule.getSchedule_time(),1));
		} else if (schedule.FRQUENCY_MONTHLY.equals(_schedule.getFrequency())) {
			ScheduleHelper.getInstance().reschedule(_schedule.getId(), 
					TimeUtil.addMonth(_schedule.getSchedule_time(),1));
		} else if (schedule.FRQUENCY_DAILY.equals(_schedule.getFrequency())) {
			ScheduleHelper.getInstance().reschedule(_schedule.getId(), 
					TimeUtil.addDay(_schedule.getSchedule_time(),1));
		} else if (schedule.FRQUENCY_ONCE.equals(_schedule.getFrequency())) {
			ScheduleHelper.getInstance().deleteById(_schedule.getId());
		}
	}
	
	Runnable createTask(final schedule _schedule) {
		Runnable task = new Runnable() {
			public void run() {
					ScheduleTask schduleTask = ScheduleTaskManager.getInstance().getTask(_schedule.getType());
					if (schduleTask != null) {
						ScheduleHelper.getInstance().updateStatus(_schedule.getId(),schedule.STATUS_PROCESSING);
						schduleTask.process(_schedule);
						ScheduleHelper.getInstance().updateStatus(_schedule.getId(),schedule.STATUS_DONE);
						reschedule(_schedule);
					} else {
						ApplicationLogger.error("Schedule not registered with Schedule Task Manager " + _schedule.getType(), this.getClass());
					}
			}
		};
		return task;
	}

	@Override
	public void onWork() {
		// TODO Auto-generated method stub
		Date date = new Date();
		BaseResource[] resources = ScheduleHelper.getInstance().getExpiredSchedule(date.getTime());
		if (!Util.isEmpty(resources)) {
			for(BaseResource resource : resources) {
				final schedule _schedule = (schedule)resource;
				Runnable task = createTask(_schedule);
				pool.addTask(task);
			}
		}
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		pool = new ApplicationThreadPool("SCHEDULER",10, 200);
		pool.start();
	}

	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		
	}

}
