package platform.helper;

import java.util.Calendar;
import java.util.TimeZone;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_running_log;
import platform.util.ApplicationException;


public class Appliance_running_logHelper extends BaseHelper {
	
	public Appliance_running_logHelper() {
		super(new appliance_running_log());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_running_logHelper instance;
	
	public static Appliance_running_logHelper getInstance() {
		if (instance == null)
			instance = new Appliance_running_logHelper();
		return instance;
	}
	
	public void AddStartRecord(String applianceId,long startTime) {
		appliance_running_log _resource = new appliance_running_log();
		_resource.setAppliance_id(applianceId);
		_resource.setStart_time(startTime);
		_resource.setId(appliance_running_log.id(_resource.getAppliance_id(), _resource.getStart_time()));
		try {
			add(_resource);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AddStopRecord(String applianceId,long startTime,long stopTime) {
		String id = appliance_running_log.id(applianceId, startTime);
		appliance_running_log fetchedResource = (appliance_running_log)Appliance_running_logHelper.getInstance().getById(id);
		if (fetchedResource == null) return;
		try {
			appliance_running_log updateResource = new appliance_running_log(id);
			updateResource.setStop_time(stopTime);
			updateResource.setDuration(stopTime-startTime);
			Appliance_running_logHelper.getInstance().update(updateResource);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateFuelStartRecord(String applianceId,long startTime, double fuel_quantity) {
		String id = appliance_running_log.id(applianceId, startTime);
		try {
			appliance_running_log updateResource = new appliance_running_log(id);
			updateResource.setFuel_start_quantity(fuel_quantity);
			Appliance_running_logHelper.getInstance().update(updateResource);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateFuelStopRecord(String applianceId,long startTime,long stopTime, double fuel_quantity,double fuel_consumption) {
		String id = appliance_running_log.id(applianceId, startTime);
		try {
			appliance_running_log updateResource = new appliance_running_log(id);
			updateResource.setFuel_stop_quantity(fuel_quantity);
			updateResource.setFuel_consumption(fuel_consumption);
			updateResource.setFuel_efficiency((fuel_consumption*1000*60*60)/(stopTime - startTime));
			Appliance_running_logHelper.getInstance().update(updateResource);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseResource[] _getTimeSeries(String applianceId,long fromtime, long totime) {
		Expression e1 = new Expression(appliance_running_log.FIELD_START_TIME, REL_OP.GTEQ, fromtime);
		Expression e2 = new Expression(appliance_running_log.FIELD_START_TIME, REL_OP.LTEQ, totime);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(appliance_running_log.FIELD_APPLIANCE_ID, REL_OP.EQ, applianceId);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e);
	}
	
	public BaseResource[] _getTimeSeries(String applianceId,long date) {
		long fromtime = date;
		long totime = date+(24*60*60*1000L);
		return _getTimeSeries(applianceId, fromtime, totime);
	}
	
	public BaseResource[] getTimeSeries(String applianceId,String fromDateString, String toDateString) {
		int year = Integer.parseInt(fromDateString.substring(0,4));
		int month = Integer.parseInt(fromDateString.substring(4,6));
		int day = Integer.parseInt(fromDateString.substring(6,8));
		String timeZone = "GMT";
		appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
		if ((_appliance != null) && (_appliance.getTimeZone() != null)){
			timeZone = _appliance.getTimeZone();
		}
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long fromTime = cal.getTimeInMillis();
		year = Integer.parseInt(toDateString.substring(0,4));
		month = Integer.parseInt(toDateString.substring(4,6));
		day = Integer.parseInt(toDateString.substring(6,8));
		cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long toTime = cal.getTimeInMillis()+(24*60*60*1000L);
		return _getTimeSeries(applianceId, fromTime, toTime);
	}
	
	public BaseResource[] getTimeSeries(String applianceId,String dateString) {
		int year = Integer.parseInt(dateString.substring(0,4));
		int month = Integer.parseInt(dateString.substring(4,6));
		int day = Integer.parseInt(dateString.substring(6,8));
		String timeZone = "GMT";
		appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
		if ((_appliance != null) && (_appliance.getTimeZone() != null)){
			timeZone = _appliance.getTimeZone();
		}
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		return _getTimeSeries(applianceId, cal.getTimeInMillis());
	}
	
}
