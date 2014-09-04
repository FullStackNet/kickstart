package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_time_seriesHelper;
import platform.helper.BaseHelper;
import platform.helper.HelperUtils;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_time_series;
import platform.util.ApplicationConstants;
import platform.util.TimeUtil;
import platform.util.Util;
import platform.util.location.LocationUtil;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.resource.trip;
import application.c4t.vehicle.resource.trip_detail;


public class Trip_detailHelper extends BaseHelper {

	public Trip_detailHelper() {
		super(new trip_detail());
		// TODO Auto-generated constructor stub
	}
	private static Trip_detailHelper instance;

	public static Trip_detailHelper getInstance() {
		if (instance == null)
			instance = new Trip_detailHelper();
		return instance;
	}

	public route_stopage getNearestStopage(Map<String, stopage> stopageMap,BaseResource[] route_stopages,String latitude, String longitude) {
		route_stopage _nearest_route_stopage = null;
		double short_distance = 0.0;
		for(int i =0 ; i < route_stopages.length; i ++) {
			route_stopage _route_stopage = (route_stopage) route_stopages[i];
			stopage _stopage = stopageMap.get(_route_stopage.getStopage_id());
			if (_stopage == null)
				continue;
			if (Util.isEmpty(_stopage.getLatitude()))
				continue;
			if (Util.isEmpty(_stopage.getLongitude()))
				continue;
			
			double distance = LocationUtil.getDistance(latitude,longitude, _stopage.getLatitude(), _stopage.getLongitude());
			if (short_distance == 0.0 || distance < short_distance) {
				_nearest_route_stopage = _route_stopage;
				short_distance = distance;
			}
		}
		return _nearest_route_stopage;
	}

	public BaseResource[] getTripDetail(String tripId) {
		Expression e = new Expression(trip_detail.FIELD_TRIP_ID, REL_OP.EQ, tripId);
		return getByExpression(e);
	}

	public BaseResource[] getTripLocationDetail(String tripId) {
		Map<String, stopage> stopageMap = new HashMap<String, stopage>();
		trip _trip = (trip)TripHelper.getInstance().getById(tripId);
		if (_trip == null)
			return null;
		BaseResource[] route_stopages = Route_stopageHelper.getInstance().getRouteStopageByRouteId(_trip.getRoute_id());
		if (Util.isEmpty(route_stopages))
			return null;

		for(int i =0 ; i < route_stopages.length; i++) {
			route_stopage _route_stopage = (route_stopage)route_stopages[i];
			stopage _stopage = (stopage) StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
			if (_stopage == null)
				continue;
			stopageMap.put(_stopage.getId(), _stopage);
		}
		appliance _appliance = ApplianceHelper.getInstance().getById(_trip.getAppliance_id());
		if (_appliance == null)
			return null;
		String date = TimeUtil.getDateString(_appliance.getTimeZone(), _trip.getCreation_time());
		BaseResource[] time_seriesSpeedData = Appliance_time_seriesHelper.getInstance().getTimeSeries(_trip.getAppliance_id(), "speed",date);
		Map<Object, BaseResource> speedMap = HelperUtils.convertArray2Map(time_seriesSpeedData, "creation_time");
		BaseResource[] time_seriesData = Appliance_time_seriesHelper.getInstance().getTimeSeries(_trip.getAppliance_id(), "location",date);
		if (Util.isEmpty(time_seriesData))
			return null;
		System.out.println("Total Time series data :: "+time_seriesData.length);
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		long last_time = 0;
		for(int i=0; i < time_seriesData.length; i++) {
			String speed = "-"; 
			appliance_time_series data = (appliance_time_series) time_seriesData[i];
			appliance_time_series speedData = (appliance_time_series)speedMap.get(data.getCreation_time());
			if (speedData != null) {
				speed = speedData.getValue();
			}
			
			System.out.println("Time series data :: "+new Date(data.getCreation_time())+"->"+data.getValue());
			if (data.getValue() == null)
				continue;
			String[] location = data.getValue().split(",");
			if (location.length != 2)
				continue;
			trip_detail _detail = new trip_detail();
			if (data.getCreation_time() < _trip.getCreation_time())
				continue;
			_detail.setCreation_time(data.getCreation_time());
			_detail.setLocation_latitude_longitude(data.getValue());
			_detail.setSpeed(speed);
			if (last_time != 0) {
				_detail.setData_get_duration(data.getCreation_time()-last_time);
			}
			last_time = data.getCreation_time();
			route_stopage _route_stopage = getNearestStopage(stopageMap,route_stopages,location[1],location[0]);
			if (_route_stopage != null) {
				System.out.println("Route Stopage found :: "+"->"+_route_stopage.getName());
				stopage _stopage = (stopage)stopageMap.get(_route_stopage.getStopage_id());
				if (_stopage != null) { 
					System.out.println("Stopage found :: "+"->"+_stopage.getName());
					_detail.setNearest_stopage_name(_stopage.getName());
					if (!Util.isEmpty(_stopage.getLatitude())  && 
							!Util.isEmpty(_stopage.getLongitude())) {
						double distance = LocationUtil.getDistance(location[1], location[0], _stopage.getLatitude(), _stopage.getLongitude());
						double stopage_radius = ApplicationConstants.STOPAGE_RADIUS_KM;
						if (_route_stopage.getStopage_radius() != null)
							stopage_radius = _route_stopage.getStopage_radius()/1000;
						if (distance <= stopage_radius) {
							_detail.setStopage_identified("Y");
						}
						_detail.setNearest_distance(distance);		
					}
				}
			}
			
			list.add(_detail);
		}
		return HelperUtils.convertList2Array(list);
	}
}
