package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.JoinField;
import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.customer_vehicle_map;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.schedule;


public class ScheduleHelper extends BaseHelper {
	
	public ScheduleHelper() {
		super(new schedule());
		// TODO Auto-generated constructor stub
	}
	private static ScheduleHelper instance;
	
	public static ScheduleHelper getInstance() {
		if (instance == null)
			instance = new ScheduleHelper();
		return instance;
	}
	
	public void addStopage(String scheduleId,String stopageId) throws ApplicationException {
		schedule _map = new schedule();
		_map.setId(scheduleId);
		_map.addStopages(stopageId);
		AddOrUpdate(_map);
	}
	
	public ArrayList<Map<String, Object>> getCustomerSchedulesMap(String customerId) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getSchedules() == null))
			return null;
		return getListMapById(_customer_map.getSchedules().toArray(new String[_customer_map.getSchedules().size()]),
				new String[]{schedule.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getStopageListMap(String scheduleId) {
		schedule _map = (schedule)ScheduleHelper.getInstance().getById(scheduleId);
		if ((_map == null) || (_map.getStopages() == null))
			return null;
		return getListMapById(_map.getStopages().toArray(new String[_map.getStopages().size()]),
				new String[]{schedule.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getCustomerScheduleMap(String customerId,ArrayList<JoinField> joinFields) {
		customer_vehicle_map _customer_map = (customer_vehicle_map)Customer_vehicle_mapHelper.getInstance().getById(customerId);
		if ((_customer_map == null) || (_customer_map.getSchedules() == null))
			return null;
		return getByJoining(_customer_map.getSchedules().toArray(new String[_customer_map.getSchedules().size()]),joinFields,new String[]{route.FIELD_NAME});
	}
}
