package application.c4t.vehicle.helper;

import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_cordinate;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.school.helper.School_route_stopage_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;
import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.helper.ControllerHelper;
import platform.helper.HelperUtils;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.controller;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import platform.util.location.LocationUtil;

import java.util.*;


public class Route_stopageHelper extends BaseHelper {

	public Route_stopageHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	public void update_stopage_time(String routeId) {
		route _route = (route) RouteHelper.getInstance().getById(routeId);
		if (_route == null)
			return;
		BaseResource[] route_stopages = Route_stopageHelper.getInstance().getRouteStopageByRouteId(routeId);
		if (Util.isEmpty(route_stopages)) 
			return;
		long dayTime = TimeUtil.getDayTime(_route.getStart_time());
		for(int i=0; i < route_stopages.length;i++) {
			route_stopage _route_stopage = (route_stopage) route_stopages[i];
			if (_route_stopage.getTime_from_previous_stop() != null) {
				dayTime = dayTime +_route_stopage.getTime_from_previous_stop();
				_route_stopage.setExpected_reachtime(TimeUtil.getDayTimeString(dayTime));
			}	
			try {
				Route_stopageHelper.getInstance().update(_route_stopage);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
	
	public Route_stopageHelper() {
		super(new route_stopage());
		// TODO Auto-generated constructor stub
	}
	private static Route_stopageHelper instance;

	public static Route_stopageHelper getInstance() {
		if (instance == null)
			instance = new Route_stopageHelper();
		return instance;
	}

	public BaseResource[] getRouteStopageByRouteId(String routeId) {
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		return getByExpression(expression,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
	}

	public void delete(String userId,String customerId,String routeStopageId) throws ApplicationException {
		deleteById(routeStopageId);
		StudentHelper.getInstance().deleteRouteStopage(routeStopageId);
		School_route_stopage_mapHelper.getInstance().deleteById(routeStopageId);
	}
	
	public BaseResource[] getUserByStopageId(String route_stopageId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		BaseResource[] students = StudentHelper.getInstance().getStudentByRouteStopageId(route_stopageId);
		if ((students == null) || Util.isEmpty(students)) {
			return null;
		}
		for(BaseResource resource : students) {
			student _student = (student) resource;
			ArrayList<BaseResource> users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			if ( Util.isEmpty(users)) {
				continue;
			}
			list.addAll(users);
		}
		return list.toArray(new user[list.size()]);
	}
	
	public BaseResource[] getPickupRouteStopage(String customerId) {
		BaseResource[] routes = RouteHelper.getInstance().getPickupRoutesForCustomer(customerId);
		String[] route_ids = HelperUtils.convertResource2IdArray(routes);
		Expression e = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.IN, route_ids);
		return getByExpression(e, new String[]{route_stopage.FIELD_NAME});
	}
	
	public BaseResource[] getDroppedRouteStopage(String customerId) {
		BaseResource[] routes = RouteHelper.getInstance().getDropRoutesForCustomer(customerId);
		String[] route_ids = HelperUtils.convertResource2IdArray(routes);
		Expression e = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.IN, route_ids);
		return getByExpression(e, new String[]{route_stopage.FIELD_NAME});
	}
	
	public void updateReachedTime(String routeStopageId) {
		route_stopage _route_stopage = new route_stopage();
		_route_stopage.setId(routeStopageId);
		_route_stopage.setReached_time(System.currentTimeMillis());
		try {
			update(_route_stopage);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Map<String, Object>> getRouteStopageListMap(String routeId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		try {
			list = getByJoining(expression,joinFields,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
	boolean isValidRoute(route _route, String timeZone) {
		return isValidRoute(_route, new Date(), timeZone);
	}
	
	boolean isValidRoute(route _route, Date logTime , String timeZone) {
		Calendar c = Calendar.getInstance();
		c.setTime(logTime);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == 1) {
			if (!"Y".equals(_route.getSchedule_day_sunday())) {
				return false;
			}
		}
		if (dayOfWeek == 2) {
			if (!"Y".equals(_route.getSchedule_day_monday())) {
				return false;
			}
		}
		if (dayOfWeek == 3) {
			if (!"Y".equals(_route.getSchedule_day_tuesday())) {
				return false;
			}
		}
		if (dayOfWeek == 4) {
			if (!"Y".equals(_route.getSchedule_day_wednesday())) {
				return false;
			}
		}
		if (dayOfWeek == 5) {
			if (!"Y".equals(_route.getSchedule_day_thursday())) {
				return false;
			}
		}
		if (dayOfWeek == 6) {
			if (!"Y".equals(_route.getSchedule_day_fridayday())) {
				return false;
			}
		}
		if (dayOfWeek == 7) {
			if (!"Y".equals(_route.getSchedule_day_saturday())) {
				return false;
			}
		}
		long logDaytime = TimeUtil.getDayTime(timeZone,logTime);
		long routeStartDayTime = TimeUtil.getDayTime(_route.getStart_time());
		long routeEndDayTime = TimeUtil.getDayTime(_route.getEnd_time());
		if ((logDaytime >= routeStartDayTime) &&
				(logDaytime <= routeEndDayTime)) {
			return true;	
		}
		return false;
	}

	public route_stopage getRealTimeStopage(String routeStopageId) {
		if (routeStopageId == null)
			return null;
		route_stopage _route_stopage = (route_stopage)Route_stopageHelper.getInstance().getById(routeStopageId);
		if (_route_stopage != null) {
			route _route  = (route) RouteHelper.getInstance().getById(_route_stopage.getRoute_id());
			if (_route != null) {
				BaseResource[] _route_stopages = getRouteStopageDetail(_route.getId());
				for(BaseResource resource : _route_stopages) {
					route_stopage realtime_route_stopage = (route_stopage)resource;
					if (realtime_route_stopage.getId().equals(routeStopageId)) {
						return realtime_route_stopage;
					}
				}
			}
		}
		return null;
	}
	
	public BaseResource[] getClosedRouteStopageDetailByStudent(String studentId) {
		student _student = (student) StudentHelper.getInstance().getById(studentId);
		if (_student == null) return null;
		route_stopage real_time_pickup_route_stopage =  getRealTimeStopage(_student.getPickup_route_stopage_id());
		route_stopage real_time_dropped_route_stopage =  getRealTimeStopage(_student.getDropped_route_stopage_id());
		if ((real_time_pickup_route_stopage == null) && (real_time_dropped_route_stopage == null)) {
			return null;
		}
		if ((real_time_pickup_route_stopage == null) && (real_time_dropped_route_stopage != null)) {
			return getRouteStopageDetail(real_time_dropped_route_stopage.getRoute_id());
		}
		
		if ((real_time_pickup_route_stopage != null) && (real_time_dropped_route_stopage == null)) {
			return getRouteStopageDetail(real_time_pickup_route_stopage.getRoute_id());
		}
		
		if (real_time_dropped_route_stopage.getReached_durationEx() < real_time_pickup_route_stopage.getReached_durationEx()) {
			return getRouteStopageDetail(real_time_dropped_route_stopage.getRoute_id());
		}
		return getRouteStopageDetail(real_time_pickup_route_stopage.getRoute_id());
	}
	
	public int getDuration(String timezone, long lastReachTime) {
		Date current_time = new Date();
		long today_current_time = TimeUtil.getDayTime(timezone,current_time);
		if (today_current_time > lastReachTime) {
			return ((int)((today_current_time-lastReachTime) - 24*60*60));
		} else {
			return  ((int)(today_current_time - lastReachTime));
		}
	}
	public BaseResource[] getRouteStopageDetail(String routeId) {
		String connected = "N";
		BaseResource[] resources = null;
		route _route = (route)RouteHelper.getInstance().getById(routeId);
		if (_route == null)
			return null;
		appliance _appliance = ApplianceHelper.getInstance().getById(_route.getAppliance_id());
		if (_appliance == null)
			return null;
		BaseResource[] _controllers = ControllerHelper.getInstance().getByApplianceId(_appliance.getId());
		if (!Util.isEmpty(_controllers)) {
			controller _controller = (controller)_controllers[0];
			if (_appliance.getLast_update_time() != null) {
				long diff = System.currentTimeMillis()-_appliance.getLast_update_time();
				if (diff < _controller.getData_read_interval()*3*1000L) {
					connected = "Y";
				}
			}
		}
		boolean valid_route = isValidRoute(_route, new Date(), _appliance.getTimeZone());
		long lastReachTime = TimeUtil.getDayTime(_route.getStart_time());
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		resources = getByExpression(expression,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
		boolean reference = true;
		if (!Util.isEmpty(resources)) {
			for(BaseResource resource : resources) {
				route_stopage _route_stopage = (route_stopage) resource;
				if (_route_stopage == null)
					continue;
				stopage _stopage = (stopage) StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
				if (_stopage == null)
					continue;
				
				if (_stopage != null) {
					if (Util.isEmpty(_stopage.getLatitude())) {
						_stopage.setLatitude(null);
					}
					if (Util.isEmpty(_stopage.getLongitude())) {
						_stopage.setLatitude(null);
					}
					_route_stopage.setStopage_name(_stopage.getName());
						_route_stopage.setLatitude(_stopage.getLatitude());
						_route_stopage.setLongitude(_stopage.getLongitude());
				}
					
				if (valid_route) {
					 _route_stopage.setSpeed(_appliance.getSpeed());
					 if (!Util.isEmpty(_appliance.getLatitude()) && !Util.isEmpty(_appliance.getLangitude()) 
							 && !Util.isEmpty(_stopage.getLatitude()) && !Util.isEmpty( _stopage.getLongitude())) 
						 {	 
							 double distance = LocationUtil.getDistance(
									 _appliance.getLatitude(),_appliance.getLangitude(), 
										_stopage.getLatitude(), _stopage.getLongitude());
								if (distance < 0) {
									distance = distance*(-1);
								}
							  distance = 	(double)Math.round(distance * 1000) / 1000;
							 _route_stopage.setDistance_from_current_location(distance);
						 }
				 }
				_route_stopage.setController_connected(connected);
				_route_stopage.setController_last_update_time(_appliance.getLast_update_time());
				_route_stopage.setReached("N");
				long routeStartDayTime = TimeUtil.getDayTime(_route.getStart_time());
				long routeEndDayTime = TimeUtil.getDayTime(_route.getEnd_time());
				Date currentTime = new Date();
				long currentDayTime = TimeUtil.getDayTime(_appliance.getTimeZone(),currentTime);
				long timediff = currentTime.getTime() -_route_stopage.getReached_timeEx();
				long duration = (routeEndDayTime -routeStartDayTime)*1000 + (5*60*1000L);
				long reachedTime = TimeUtil.getDayTime(_appliance.getTimeZone(),_route_stopage.getReached_timeEx());
				if (valid_route) {
					if (_route_stopage.getReached_time() != null) {
						System.out.println(_route_stopage.getName()+" , Duration"+duration +"routeEndDayTime : "+routeEndDayTime+"routeStartDayTime : "+routeStartDayTime+", timediff :"+timediff+" currentTime :" + currentTime + "_route_stopage.getReached_time()"+new Date(_route_stopage.getReached_time()));
						if (timediff > duration) {
							lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stopEx();
							long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
							if (current_time > lastReachTime) {
								lastReachTime = current_time;
							}
							_route_stopage.setReached_time(lastReachTime);
							_route_stopage.setReached_duration(getDuration(_appliance.getTimeZone(),lastReachTime));
						} else {
							long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
							lastReachTime = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date(_route_stopage.getReached_time()));
							if (routeStartDayTime < reachedTime) {
								_route_stopage.setReached_time(lastReachTime);
								_route_stopage.setReached("Y");
								reference = true;
								_route_stopage.setReached_duration((int)(current_time - lastReachTime));
							} else {
								String latitude = _appliance.getLatitude();
								String longitude = _appliance.getLangitude();
								String route_id = _route_stopage.getRoute_id();
								String stopage_id = _route_stopage.getId();
								String id = route_cordinate.id(route_id, stopage_id, longitude, latitude);
								route_cordinate _route_cordinate = null;
								if (reference) {
									_route_cordinate = (route_cordinate)Route_cordinateHelper.getInstance().getNearestCordinate(
										id, _route,
										_route_stopage, 
										latitude, longitude);
								}
								if ((_route_cordinate != null) ) {
									List<Object> durations = _route_cordinate.getDurations();
									System.out.println("Got the cordinates for  " + longitude + "-"+latitude + "in database data->"+durations.toString());
									long average = Util.getAverage(durations);
									lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
									if (current_time > lastReachTime) {
										lastReachTime = current_time;
									}
							
									if (average != 0) {
										long rightduration = _route_stopage.getTime_from_previous_stop();
										System.out.println("Average time  " + average);
										long lastReachTime2 = lastReachTime + (average/1000);
										if (average < rightduration) {
											lastReachTime = lastReachTime2;
										}
										if (current_time > lastReachTime) {
											lastReachTime = current_time;
										}
									}
								} else {
									lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
									if (current_time > lastReachTime) {
										lastReachTime = current_time;
									}
								}
								_route_stopage.setReached_time(lastReachTime);
								_route_stopage.setReached_duration(getDuration(_appliance.getTimeZone(),lastReachTime));
								reference =false;
							}
						}
					} else {
						System.out.println("getReached_time is null");
						long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
						lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stopEx();
						if (current_time > lastReachTime) {
							lastReachTime = current_time;
						}
						_route_stopage.setReached_time(lastReachTime);
						_route_stopage.setReached_duration(getDuration(_appliance.getTimeZone(),lastReachTime));
					}
				} else {
					long current_day = currentTime.getDate();
					long reach_time_day = 0;
					if (_route_stopage.getReached_time() != null)
						reach_time_day = new Date(_route_stopage.getReached_timeEx()).getDate();
					if ((_route_stopage.getReached_time() != null) && 
							(current_day == reach_time_day) && 
							(currentDayTime > routeEndDayTime)) {
						System.out.println("Invalid Route - Today Done route");
						long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
						_route_stopage.setReached("Y");
						lastReachTime = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date(_route_stopage.getReached_time()));
						_route_stopage.setReached_time(lastReachTime);
						 reference = true;
						_route_stopage.setReached_duration((int)(current_time - lastReachTime));
					} else {
						System.out.println("Invalid Route - Next Day route");
						lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stopEx();
						_route_stopage.setReached_time(lastReachTime);
						_route_stopage.setReached_duration(getDuration(_appliance.getTimeZone(),lastReachTime));
					}
				}
			}
		}
		return resources;
	}

}
