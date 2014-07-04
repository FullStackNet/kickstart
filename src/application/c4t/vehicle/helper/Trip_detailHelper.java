package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Date;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.Appliance_time_seriesHelper;
import platform.helper.BaseHelper;
import platform.helper.HelperUtils;
import platform.resource.BaseResource;
import platform.resource.appliance_time_series;
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

	public route_stopage getNearestStopage(BaseResource[] route_stopages) {
		return null;
	}
	
	public BaseResource[] getTripDetail(String tripId) {
		Expression e = new Expression(trip_detail.FIELD_TRIP_ID, REL_OP.EQ, tripId);
		return getByExpression(e);
	}
	
	public BaseResource[] getTripLocationDetail(String tripId) {
		trip _trip = (trip)getById(tripId);
		if (_trip == null)
			return null;
		BaseResource[] route_stopages = Route_stopageHelper.getInstance().getRouteStopageByRouteId(_trip.getRoute_id());
		if (Util.isEmpty(route_stopages))
			return null;
		BaseResource[] time_seriesData = Appliance_time_seriesHelper.getInstance().getTimeSeries(_trip.getAppliance_id(), "location", _trip.getCreation_time());
		if (Util.isEmpty(time_seriesData))
			return null;
		System.out.println("Total Time series data :: "+time_seriesData.length);
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		for(int i=0; i < time_seriesData.length; i++) {
			appliance_time_series data = (appliance_time_series) time_seriesData[0];
			System.out.println("Time series data :: "+new Date(data.getCreation_time())+"->"+time_seriesData.length);
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
			route_stopage _route_stopage = getNearestStopage(route_stopages);
			if (_route_stopage == null)
				continue;
			stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
			if (_stopage == null)
				continue;
			_detail.setStopage_name(_stopage.getName());
			if (_stopage.getLatitude() == null)
				continue;
			
			if (_stopage.getLongitude() == null)
				continue;
			
			double distance = LocationUtil.getDistance(location[1], location[0], _stopage.getLatitude(), _stopage.getLongitude());
			_detail.setNearest_distance(distance);		
			list.add(_detail);

		}
		return HelperUtils.convertList2Array(list);
	}
}
