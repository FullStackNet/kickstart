package application.c4t.vehicle.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.helper.NotificationHelper;
import platform.log.ApplicationLogger;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import platform.util.location.LocationUtil;
import application.c4t.vehicle.resource.driver;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_cordinate;
import application.c4t.vehicle.resource.route_cordinate_raw;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.resource.trip;
import application.c4t.vehicle.resource.trip_detail;
import application.c4t.vehicle.resource.trip_overspeed_detail;


public class RouteHelper extends BaseHelper {

	public RouteHelper() {
		super(new route());
		// TODO Auto-generated constructor stub
	}
	private static RouteHelper instance;

	public static RouteHelper getInstance() {
		if (instance == null)
			instance = new RouteHelper();
		return instance;
	}

	public BaseResource[] getPickupRoutesForCustomer(String customerId) {
		Expression e1 = new platform.db.Expression(route.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2= new platform.db.Expression(route.FIELD_TYPE, REL_OP.EQ, route.ROUTE_TYPE_PICKUP);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}

	public BaseResource[] getDropRoutesForCustomer(String customerId) {
		Expression e1 = new platform.db.Expression(route.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2= new platform.db.Expression(route.FIELD_TYPE, REL_OP.EQ, route.ROUTE_TYPE_DROP);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}

	

	public boolean isValidRoute(route _route, String timeZone) {
		return isValidRoute(_route, new Date(), timeZone);
	}


	public boolean isValidRoute(route _route, Date logTime , String timeZone) {
		if (!"Y".equals(_route.getActive()))
			return false;
		long logDaytime = TimeUtil.getDayTime(timeZone,logTime);
		long routeStartDayTime = TimeUtil.getDayTime(_route.getStart_time());
		long routeEndDayTime = TimeUtil.getDayTime(_route.getEnd_time());
		if ((logDaytime >= routeStartDayTime) &&
				(logDaytime <= routeEndDayTime)) {
			return true;	
		}
		return false;
	}

	public BaseResource[] getRoutebyApplianceId(String applianceId) {
		Expression e = new Expression(route.FIELD_APPLIANCE_ID, REL_OP.EQ, applianceId);
		return getByExpression(e);
	}

	public route getValidRoute(appliance _fetched_appliance, Date logTime) {
		BaseResource[] routes = getRoutebyApplianceId(_fetched_appliance.getId());
		if (Util.isEmpty(routes))
			return null;
		for(int i= 0; i <  routes.length; i++) {
			route _route = (route)routes[i];
			if (isValidRoute(_route, logTime, _fetched_appliance.getTimeZone())) {
				return _route;
			}
		}
		return null;
	}

	public route getValidRoute(appliance _fetched_appliance) {
		Date logTime = new Date();
		return getValidRoute(_fetched_appliance,logTime);
	}

	public void checkStopageAndSendNotification(String applianceId,String latitude, 
			String longitude,Integer speed, Date logTime) {
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		checkStopageAndSendNotification(_appliance, latitude, longitude, speed, logTime);
	}

	@SuppressWarnings("deprecation")
	public void processCordinates(stopage _stopage, route_stopage _route_stopage, Date logTime) {
		BaseResource[] cordinates = Route_cordinate_rawHelper.getInstance().getRouteCordinates(_route_stopage.getRoute_id());
		if (Util.isEmpty(cordinates))
			return;

		for(int i=0; i < cordinates.length ; i++) {
			route_cordinate_raw raw = (route_cordinate_raw)cordinates[i];
			long duration = logTime.getTime() - raw.getUpdate_time();
			Date updateDate = new Date(raw.getUpdate_time());
			if (logTime.getDate() != updateDate.getDate()) {
				continue;
			}
			if (duration > 30*60*1000L) {
				continue;
			}
			if (duration <= 0) 
				continue;
			String id = route_cordinate.id(raw.getRoute_id(), _route_stopage.getId(), raw.getLangitude(), raw.getLatitude());
			System.out.println("Cordinate id  : " +id);
			route_cordinate cordinate = (route_cordinate)Route_cordinateHelper.getInstance().getById(id);
			if (cordinate == null) {
				cordinate = new route_cordinate();
				cordinate.setId(id);
				cordinate.setLangitude(raw.getLangitude());
				cordinate.setLatitude(raw.getLatitude());
				cordinate.setRoute_id(raw.getRoute_id());
				double distance = LocationUtil.getDistance(raw.getLatitude(),raw.getLangitude(), 
						_stopage.getLatitude(), _stopage.getLongitude());
				if (distance < 0) {
					distance = distance*(-1);
				}
				cordinate.setDistance(distance);
				cordinate.setStopage_id(_route_stopage.getId());
				try {
					Route_cordinateHelper.getInstance().add(cordinate);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			Route_cordinateHelper.getInstance().addDuration(id, duration);	
		}
		Route_cordinate_rawHelper.getInstance().deleteRouteCordinates(_route_stopage.getRoute_id());
	}

	public void checkOverSpeed(appliance _fetched_appliance, 
			route _route,
			route_stopage _route_stopge,
			String latitude, String longitude , Integer speed, Date logTime) {

		if (speed == null)
			return;
		if (_route.getThreshold_over_speed() == null)
			return;
		if (_route.getThreshold_over_speed() == 0)
			return;
		boolean overspeed = false;
		if (speed >= 0) {
			if ((_route.getThreshold_over_speed() != null)  && (_route.getThreshold_over_speed() >= 0)){
				if (speed > _route.getThreshold_over_speed()) {
					overspeed = true;
				}
			}
		}

		if (overspeed) {
			if (!"Y".equals(_route.getOverSpeedState())) {
				updateOverSpeedState(_route.getId(), "Y");
				Map<String, Object> data = new HashMap<String, Object>();
				data.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_LATITUDE, latitude);
				data.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_LOGITUDE, longitude);
				data.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_ROUTE_NAME, _route.getName());
				data.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_ROUTE_ID, _route.getId());
				NotificationHelper.getInstance().addNotificationFromAppliance(_fetched_appliance.getId(), 
						NotificationFactory.NOTIFICATION_OVER_SPEED, 
						NotificationFactory.SEVERIRY_CRITICAL, data, 
						logTime);
				String tripId = trip.id(_route.getId(),_fetched_appliance.getTimeZone(), logTime, _route.getStart_timeEx());
				trip _trip = (trip)TripHelper.getInstance().getById(tripId);
				if (_trip != null) {
					try {
						TripHelper.getInstance().incrementCounter(tripId, trip.FIELD_OVERSPEED_COUNT, 1);
					} catch (ApplicationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					trip_overspeed_detail _detail = new trip_overspeed_detail();
					_detail.setTrip_id(tripId);
					_detail.setLongitude(longitude);
					_detail.setLatitude(latitude);
					_detail.setSpeed(speed);
					_detail.setLast_stopage(_route_stopge.getNameEx());
					try {
						Trip_overspeed_detailHelper.getInstance().add(_detail);
					} catch (ApplicationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} else {
			if ("Y".equals(_route.getOverSpeedState())) {
				RouteHelper.getInstance().updateOverSpeedState(_route.getId(), "N");
			}
		}
	}

	public void updateOverSpeedState(String routeId,String state) {
		route _route = new route(routeId);
		_route.setOverSpeedState(state);
		try {
			RouteHelper.getInstance().update(_route);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkStopageAndSendNotification(appliance _fetched_appliance,String latitude, 
			String longitude,Integer speed, Date logTime) {
		if (Util.isEmpty(latitude)) return;
		if (Util.isEmpty(longitude)) return;

		route current_route = (route)RouteHelper.getInstance().getById(_fetched_appliance.getCurrentRouteId());
		if (current_route != null) {
			if (!isValidRoute(current_route,logTime, _fetched_appliance.getTimeZone()))
				current_route = null;
		} 

		if (current_route == null) {
			current_route = getValidRoute(_fetched_appliance,logTime);
		}
		if (current_route == null) {
			return ;
		}
		route_stopage _last_stopage = (route_stopage)Route_stopageHelper.getInstance().getById(_fetched_appliance.getLastStopageId());
		if (_last_stopage != null)
			ApplicationLogger.info("Last stopage reported for "+_fetched_appliance.getNameEx()+" is "+_last_stopage.getNameEx(), this.getClass());

		ApplianceHelper.getInstance().updateCurrentRoute(_fetched_appliance.getId(),
				current_route.getId());

		if ("Y".equals(current_route.getActive())) {
			route_cordinate_raw _cordinate_raw = new route_cordinate_raw();
			_cordinate_raw.setRoute_id(current_route.getId());
			_cordinate_raw.setLangitude(longitude);
			_cordinate_raw.setLatitude(latitude);
			_cordinate_raw.setUpdate_time(logTime.getTime());
			try {
				Route_cordinate_rawHelper.getInstance().add(_cordinate_raw);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String tripId = trip.id(current_route.getId(),_fetched_appliance.getTimeZone(), logTime, current_route.getStart_timeEx());
		if ("Y".equals(current_route.getRecord_trip())) {
			trip _trip = (trip)TripHelper.getInstance().getById(tripId);
			if (_trip == null) {
				_trip = new trip(tripId);
				_trip.setCustomer_id(current_route.getCustomer_id());
				_trip.setAppliance_id(_fetched_appliance.getId());
				_trip.setAppliance_name(_fetched_appliance.getName());
				_trip.setScheduled_start_time(current_route.getStart_time());
				_trip.setScheduled_reached_time(current_route.getEnd_time());
				_trip.setRoute_id(current_route.getId());
				_trip.setRoute_name(current_route.getName());
				_trip.setDriver_id(current_route.getDriver_id());
				driver _driver = (driver)DriverHelper.getInstance().getById(current_route.getDriver_id());
				if (_driver != null)
					_trip.setDriver_name(_driver.getName());
				try {
					TripHelper.getInstance().add(_trip);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}  
		checkOverSpeed(_fetched_appliance,current_route,_last_stopage,latitude,longitude,speed,logTime);
		if ("Y".equals(current_route.getOnlyTracking()))  {
			return;
		}
		BaseResource[] route_stopages = Route_stopageHelper.getInstance().getRouteStopageByRouteId(current_route.getId());
		if (Util.isEmpty(route_stopages))
			return;

		double short_stopage_distance = 0;
		route_stopage found_route_stopage = null;
		stopage found_stopage = null;
		double short_distance = 0.0;
		route_stopage _short_route_stopage = null;
		
		for(int i=0; i < route_stopages.length; i++) {
			route_stopage _route_stopage = (route_stopage) route_stopages[i];
			stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
			if (_stopage == null)
				continue;
			if (_stopage.getLatitude() == null) 
				continue;
			if (_stopage.getLongitude() == null) 
				continue;
			if (_route_stopage.getId().equals(_fetched_appliance.getLastStopageId())) {
				continue;
			}
			if (Util.isEmpty(_stopage.getLatitude())) 
				continue;
			if (Util.isEmpty(_stopage.getLongitude()))
				continue;
			
			double dLatitude = Double.parseDouble(latitude);
			double dLongitude = Double.parseDouble(longitude);
			double stopageLatitude = 0.0;
			try {
				stopageLatitude  =Double.parseDouble(_stopage.getLatitude());
			} catch (Exception e) {
				e.printStackTrace();
			}
			double stopageLongitude = 0.0;
			try {
				stopageLongitude  = Double.parseDouble(_stopage.getLongitude());
			} catch (Exception e) {
				e.printStackTrace();
			}
			double distance = LocationUtil.getDistance(dLatitude, dLongitude, stopageLatitude, stopageLongitude);


			if (distance < 0) {
				distance = distance*(-1);
			}
			if (distance < short_distance || short_distance == 0.0) {
				short_distance = distance;
				_short_route_stopage = _route_stopage;
			}
			double stopage_radius = ApplicationConstants.STOPAGE_RADIUS_KM;
			if (_route_stopage.getStopage_radius() != null)
				stopage_radius = _route_stopage.getStopage_radius()/1000;

			ApplicationLogger.info("Distance ("+distance+") from stopage "+_stopage.getName()+stopageLatitude+":"+stopageLongitude +" for "+ latitude + ":"+longitude + " , Radius : " +stopage_radius, this.getClass());
			if (distance  < stopage_radius) {
				ApplicationLogger.info("Found the stop "+stopageLatitude+":"+stopageLongitude + _stopage.getName() +" for "+ latitude + ":"+longitude + "-> " + distance, this.getClass());
				if ((short_stopage_distance == 0.0) || (distance < short_stopage_distance)) {
					// check for time bound stopage
					if ("Y".equalsIgnoreCase(_route_stopage.getTime_bound_stop())) {
						if (_route_stopage.getExpected_reachtime() != null) {
							long current_day_time = TimeUtil.getDayTime(_fetched_appliance.getTimeZone(),logTime);
							long stopage_day_time = TimeUtil.getDayTime(_route_stopage.getExpected_reachtime());
							if (current_day_time < stopage_day_time) {
								long diff = stopage_day_time - current_day_time;
								if ((_route_stopage.getTime_buffer_before() > 0) && 
										diff > _route_stopage.getTime_buffer_before()) {
									ApplicationLogger.info("Skiping the stop due identified before time  , stopage time " +stopage_day_time+ " buffer = "+_route_stopage.getTime_buffer_before()+",current time="+current_day_time+","+_stopage.getName() +" for "+ latitude + ":"+longitude + "-> " + distance, this.getClass());
									continue;
								}
							} else {
								long diff = current_day_time - stopage_day_time;
								if ((_route_stopage.getTime_buffer_after() > 0) && 
										diff > _route_stopage.getTime_buffer_after()) {
									ApplicationLogger.info("Skiping the stop due identified after time  , stopage time " +stopage_day_time+ " buffer = "+_route_stopage.getTime_buffer_after()+",current time="+current_day_time+","+_stopage.getName() +" for "+ latitude + ":"+longitude + "-> " + distance, this.getClass());
									continue;
								}
							}
						}
					}
					
					ApplicationLogger.info("Now short distance is this stop "+stopageLatitude+":"+stopageLongitude + _stopage.getName() +" for "+ latitude + ":"+longitude + "-> " + distance, this.getClass());
					short_stopage_distance = distance;
					found_route_stopage = _route_stopage;
					found_stopage = _stopage;
				}
			}
		}
		
		if (_short_route_stopage != null) {
			ApplicationLogger.info("Short distance Stop  is "+ _short_route_stopage.getName() + short_distance, this.getClass());
		}
		
		if (found_route_stopage != null) {
				if (TimeUtil.isSameDate(_fetched_appliance.getTimeZone(),
						logTime.getTime(), 
						found_route_stopage.getReached_timeEx())) {
					
					long last_reach_time = TimeUtil.getDayTime(_fetched_appliance.getTimeZone(),found_route_stopage.getReached_time());
					long exptected_reach_day_time = TimeUtil.getDayTime(found_route_stopage.getExpected_reachtime());
					long current_day_time = TimeUtil.getDayTime(_fetched_appliance.getTimeZone(),logTime);
					int previous_duration = (int)(last_reach_time -  exptected_reach_day_time);
					if (previous_duration < 0)
						previous_duration = previous_duration*(-1);
					
					int current_duration = (int)(current_day_time -  exptected_reach_day_time);
					if (current_duration < 0)
						current_duration = current_duration*(-1);
					if (previous_duration < current_duration) {
						ApplicationLogger.info("Ignoring the stop "+found_stopage.getName()+" at "+TimeUtil.getDayTimeString(current_day_time)+" as already marked reached at "+TimeUtil.getDayTimeString(last_reach_time)+"... ", this.getClass());
						return;
					}
			}
			int time = (int) (logTime.getTime() - found_route_stopage.getReached_timeEx());
			if (time < 0)
				time = (-1)*time;
			
			
			ApplicationLogger.info("Finally decided on this stop based on shortest distance "+ found_route_stopage.getNameEx() +" for "+ short_stopage_distance, this.getClass());
			//sendNotification(_fetched_appliance, found_route_stopage);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_ROUTE_STOPAGE_ID,found_route_stopage.getId());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_STOPAGE_NAME,found_stopage.getName());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_VEHICLE_NAME,_fetched_appliance.getName());
			map.put(NotificationFactory.NOTIFICATION_DATA_PARAMETER_REACHED_TIME,TimeUtil.getDayTime(_fetched_appliance.getTimeZone(), logTime));

			NotificationHelper.getInstance().addNotificationFromAppliance(_fetched_appliance.getId(), 
					NotificationFactory.NOTIFICATION_STOP_REACHED, 
					NotificationFactory.SEVERIRY_INFO, map, 
					logTime);
			ApplianceHelper.getInstance().updateLastStopage(_fetched_appliance.getId(), 
					found_route_stopage.getId());
			Route_stopageHelper.getInstance().updateReachedTime(found_route_stopage.getId());
			processCordinates(found_stopage,found_route_stopage,logTime);
				trip_detail _detail = new trip_detail();
				_detail.setTrip_id(_trip.getId());
				_detail.setStopage_name(found_stopage.getName());
				_detail.setStopage_id(found_stopage.getId());
				_detail.setRoute_stopage_id(found_route_stopage.getExpected_reachtime());
				_detail.setReach_time(TimeUtil.getDayTimeString(_fetched_appliance.getTimeZone(),logTime));
				if (found_route_stopage.getExpected_reachtime() != null) {
					_detail.setSchedule_reach_time(found_route_stopage.getExpected_reachtime());
					long expected_reach_time = TimeUtil.getDayTime(found_route_stopage.getExpected_reachtime());
					long reach_time = TimeUtil.getDayTime(_fetched_appliance.getTimeZone(),logTime.getTime());
					if (reach_time > expected_reach_time) {
						_detail.setDelay_time(reach_time-expected_reach_time);
					} else {
						_detail.setDelay_time(0);
					}
				}
				try {
					Trip_detailHelper.getInstance().add(_detail);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
