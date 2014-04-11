package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.JoinField;
import platform.helper.BaseHelper;
import application.c4t.vehicle.resource.schedule;
import application.c4t.vehicle.resource.schedule_stopage;
import application.c4t.vehicle.resource.stopage;


public class Schedule_stopageHelper extends BaseHelper {
	
	public Schedule_stopageHelper() {
		super(new schedule_stopage());
		// TODO Auto-generated constructor stub
	}
	private static Schedule_stopageHelper instance;
	
	public static Schedule_stopageHelper getInstance() {
		if (instance == null)
			instance = new Schedule_stopageHelper();
		return instance;
	}
	
	public ArrayList<Map<String, Object>> getScheduleStopageListMap(String scheduleId,ArrayList<JoinField> joinFields) {
		schedule _map = (schedule)ScheduleHelper.getInstance().getById(scheduleId);
		if ((_map == null) || (_map.getStopages() == null))
			return null;
		return getByJoining(_map.getStopages().toArray(new String[_map.getStopages().size()]),joinFields,new String[]{stopage.FIELD_NAME});
	}
}
