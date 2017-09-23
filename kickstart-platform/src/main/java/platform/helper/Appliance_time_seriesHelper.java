package platform.helper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_time_series;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.resource.trip_detail;


public class Appliance_time_seriesHelper extends BaseHelper {

	public Appliance_time_seriesHelper() {
		super(new appliance_time_series());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_time_seriesHelper instance;

	public static Appliance_time_seriesHelper getInstance() {
		if (instance == null)
			instance = new Appliance_time_seriesHelper();
		return instance;
	}

	public void addTimeSeries(String applianceId, String counter, Date logTime, Double value) throws ApplicationException {
		addTimeSeries(applianceId, counter, logTime, ApplicationConstants.VALUE_TYPE_DOUBLE,value);
	}

	public void addTimeSeries(String applianceId, String counter, Date logTime, Integer value) throws ApplicationException {
		addTimeSeries(applianceId, counter, logTime, ApplicationConstants.VALUE_TYPE_INT,value);
	}

	public void addTimeSeries(String applianceId, String counter, Date logTime, Long value) throws ApplicationException {
		addTimeSeries(applianceId, counter, logTime, ApplicationConstants.VALUE_TYPE_LONG,value);
	}

	public void addTimeSeries(String applianceId, String counter, Date logTime, String value) throws ApplicationException {
		addTimeSeries(applianceId, counter, logTime, ApplicationConstants.VALUE_TYPE_STRING,value);
	}

	public void addTimeSeries(String applianceId, String counter, Date logTime, int valueType, Object value) throws ApplicationException {
		if (value == null) return; 
		appliance_time_series _appliance_time_series = new appliance_time_series();
		_appliance_time_series.setAppliance_id(applianceId);
		_appliance_time_series.setCreation_time(logTime.getTime());
		_appliance_time_series.setCounter(counter);
		_appliance_time_series.setValueType(valueType);
		_appliance_time_series.setValue(value.toString());
		AddOrUpdate(_appliance_time_series);
	}

	@Override
	public void AddOrUpdate(BaseResource resource) throws ApplicationException {
		appliance_time_series _appliance_time_series = (appliance_time_series) resource;
		long logTime = _appliance_time_series.getCreation_time();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); // locale-specific
		cal.setTimeInMillis(logTime);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long time = cal.getTimeInMillis();
		_appliance_time_series.setCreation_date(time);
		String id = appliance_time_series.id(_appliance_time_series.getAppliance_id(),_appliance_time_series.getCounter(),time);
		_appliance_time_series.setId(id);
		Map<String, Object> map = new HashMap<String, Object>();
		String key = String.format("%05d", (logTime-time)/1000);
		if (_appliance_time_series.getValueType() == ApplicationConstants.VALUE_TYPE_INT) {
			map.put(key, Integer.parseInt(_appliance_time_series.getValue()));
		} else if (_appliance_time_series.getValueType() == ApplicationConstants.VALUE_TYPE_LONG) {
			map.put(key, Long.parseLong(_appliance_time_series.getValue()));
		} else if (_appliance_time_series.getValueType() == ApplicationConstants.VALUE_TYPE_DOUBLE) {
			map.put(key, Double.parseDouble(_appliance_time_series.getValue()));
		} else {
			map.put(key, _appliance_time_series.getValue());
		}
		_appliance_time_series.setValues(map);
		super.AddOrUpdate(_appliance_time_series);
	}

	public BaseResource[] getTimeSeries(String applianceId,String[] counters,String dateString) {
		ArrayList<appliance_time_series> list = _getTimeSeries(applianceId, counters, dateString);
		return list.toArray(new appliance_time_series[list.size()]);
	}

	public ArrayList<appliance_time_series> _getTimeSeries(String applianceId,String[] counters,String dateString) {
		long date = TimeUtil.getTimeFromString(dateString,"GMT");
		ArrayList<appliance_time_series> list = new ArrayList<appliance_time_series>();
		for(int i=0; i < counters.length; i++) {
			ArrayList<appliance_time_series> l = _getTimeSeries(applianceId, counters[i], date);
			list.addAll(l);
		}
		return list;
	}

	public BaseResource[] getTimeSeries(String applianceId,String counter,String dateString) {
		int year = Integer.parseInt(dateString.substring(0,4));
		int month = Integer.parseInt(dateString.substring(4,6));
		int day = Integer.parseInt(dateString.substring(6,8));

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return getTimeSeries(applianceId, counter, cal.getTimeInMillis());
	}
	public ArrayList<appliance_time_series> _getTimeSeries(String applianceId,String counter,long date) {
		
		ArrayList<appliance_time_series> list = new ArrayList<appliance_time_series>();
		appliance _appliance = (appliance)ApplianceHelper.getInstance().getById(applianceId);
		if (_appliance == null) return list;
		String id = appliance_time_series.id(applianceId, counter, date);
		System.out.println("Fetching Time Series Data for key " +  id);
		appliance_time_series _appliAppliance_time_series = (appliance_time_series) Appliance_time_seriesHelper.getInstance().getById(id);
		if (_appliAppliance_time_series == null) return list;
		Map<String, Object> map = _appliAppliance_time_series.getValues(); 
		for (Map.Entry<String, Object> entry : map.entrySet())
		{
			appliance_time_series record = new appliance_time_series();
			record.setAppliance_id(applianceId);
			record.setId(_appliAppliance_time_series.getId());
			record.setValue(entry.getValue().toString());
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			cal.setTimeInMillis(date+1000*Integer.parseInt(entry.getKey()));
			record.setCreation_time(cal.getTimeInMillis());
			record.setCounter(counter);
			list.add(record);
		}
		return list;
	}

	public BaseResource[] getTimeSeries(String applianceId,String counter,long date) {
		ArrayList<appliance_time_series> list = _getTimeSeries(applianceId, counter, date);
		return list.toArray(new appliance_time_series[list.size()]);
	}
	
	
	public BaseResource[] getArray(String applianceId,String counter,String fromDateString,String toDateString) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		String dateString = fromDateString;
		while(dateString != null) {
			BaseResource[] records = getTimeSeries(applianceId, counter, dateString);
			for(int i=0; i < records.length ;i++) {
				appliance_time_series _appliance_time_series = (appliance_time_series)records[i];
				list.add(_appliance_time_series);
			}
			dateString = TimeUtil.getNextDate(dateString,toDateString);
		}
		Collections.reverse(list);
		return list.toArray(new appliance_time_series[list.size()]);
	}
	
	public ArrayList<Map<String, Object>> getArrayList(String applianceId,String counter,String fromDateString,String toDateString) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String dateString = fromDateString;
		while(dateString != null) {
			BaseResource[] records = getTimeSeries(applianceId, counter, dateString);
			for(int i=0; i < records.length ;i++) {
				appliance_time_series _appliance_time_series = (appliance_time_series)records[i];
				Map<String, Object> _map = _appliance_time_series.convertResourceToMap();
				_map.put(_appliance_time_series.getCounter(), _appliance_time_series.getValue());
				list.add(_map);
			}
			dateString = TimeUtil.getNextDate(dateString,toDateString);
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getArrayList(String applianceId,String[] counters,String fromDateString,String toDateString) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String dateString = fromDateString;
		while(dateString != null) {
			BaseResource[] records = getTimeSeries(applianceId, counters, dateString);
			Map<Object, Map<String, Object>> map = new HashMap<Object, Map<String, Object>>();
			for(int i=0; i < records.length ;i++) {
				appliance_time_series _appliance_time_series = (appliance_time_series)records[i];
				Map<String, Object> _map = map.get(_appliance_time_series.getCreation_time());
				if (_map == null) {
					_map = new HashMap<String, Object>();
					_map.put("creation_time", _appliance_time_series.getCreation_time());
				}
				_map.put(_appliance_time_series.getCounter(), _appliance_time_series.getValue());
				map.put(_appliance_time_series.getCreation_time(), _map);
			}
			for (Map.Entry<Object, Map<String, Object>> entry : map.entrySet())
			{
				list.add(entry.getValue());
			}
			dateString = TimeUtil.getNextDate(dateString,toDateString);
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getArrayList(String applianceId,String[] counters,String dateString) {
		if (dateString == null) {
			dateString = TimeUtil.getCurrentTimeSeriesString();
		}
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		BaseResource[] records = getTimeSeries(applianceId, counters, dateString);
		Map<Object, Map<String, Object>> map = new HashMap<Object, Map<String, Object>>();
		for(int i=0; i < records.length ;i++) {
			appliance_time_series _appliance_time_series = (appliance_time_series)records[i];
			Map<String, Object> _map = map.get(_appliance_time_series.getCreation_time());
			if (_map == null) {
				_map = new HashMap<String, Object>();
				_map.put("creation_time", _appliance_time_series.getCreation_time());
			}
			_map.put(_appliance_time_series.getCounter(), _appliance_time_series.getValue());
			map.put(_appliance_time_series.getCreation_time(), _map);
		}
		for (Map.Entry<Object, Map<String, Object>> entry : map.entrySet())
		{
			list.add(entry.getValue());
		}
		return list;
	}
	
	
	public BaseResource[] getLocationDetail(String applianceId,String fromDate,String toDate) {
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		if (_appliance == null)
			return null;
		BaseResource[] time_seriesData = Appliance_time_seriesHelper.getInstance().getArray(applianceId,"location",fromDate,toDate);
		if (Util.isEmpty(time_seriesData))
			return null;
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		long last_time = 0;
		for(int i=0; i < time_seriesData.length; i++) {
			appliance_time_series data = (appliance_time_series) time_seriesData[i];
			if (data.getValue() == null)
				continue;
			String[] location = data.getValue().split(",");
			if (location.length != 2)
				continue;
			trip_detail _detail = new trip_detail();
			_detail.setCreation_time(data.getCreation_time());
			_detail.setLocation_latitude_longitude(data.getValue());
			if (last_time != 0) {
				_detail.setData_get_duration(data.getCreation_time()-last_time);
			}
			last_time = data.getCreation_time();
			list.add(_detail);
		}
		return HelperUtils.convertList2Array(list);
	}

}
