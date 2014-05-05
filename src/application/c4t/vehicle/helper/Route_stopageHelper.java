package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.resource.student;


public class Route_stopageHelper extends BaseHelper {

	public Route_stopageHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
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
		return getByExpression(expression);
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

	boolean isValidRoute(route _route, Date logTime , String timeZone) {
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
					if (realtime_route_stopage.getId() == routeStopageId) {
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
	
	
	public BaseResource[] getRouteStopageDetail(String routeId) {
		BaseResource[] resources = null;
		route _route = (route)RouteHelper.getInstance().getById(routeId);
		if (_route == null)
			return null;
		appliance _appliance = ApplianceHelper.getInstance().getById(_route.getAppliance_id());
		if (_appliance == null)
			return null;

		boolean valid_route = isValidRoute(_route, new Date(), _appliance.getTimeZone());
		long lastReachTime = TimeUtil.getDayTime(_route.getStart_time());
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		resources = getByExpression(expression,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
		if (!Util.isEmpty(resources)) {
			for(BaseResource resource : resources) {
				route_stopage _route_stopage = (route_stopage) resource;
				stopage _stopage = (stopage) StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
				if (_stopage != null) {
					_route_stopage.setStopage_name(_stopage.getName());
				}
				_route_stopage.setReached("N");
				if (valid_route) {
					if (_route_stopage.getReached_time() != null) {
						Date currentTime = new Date();
						long timediff = currentTime.getTime() -_route_stopage.getReached_time();
						long routeStartDayTime = TimeUtil.getDayTime(_route.getStart_time());
						long routeEndDayTime = TimeUtil.getDayTime(_route.getEnd_time());
						long duration = (routeEndDayTime -routeStartDayTime)*1000 + (5*60*1000L);
						System.out.println("Duration"+duration +"routeEndDayTime : "+routeEndDayTime+"routeStartDayTime : "+routeStartDayTime+", timediff :"+timediff+" currentTime :" + currentTime + "_route_stopage.getReached_time()"+new Date(_route_stopage.getReached_time()));

						if (timediff > duration) {
							lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
							_route_stopage.setReached_time(lastReachTime);
							long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
							_route_stopage.setReached_duration((int)(lastReachTime-current_time));
						} else {
							long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
							lastReachTime = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date(_route_stopage.getReached_time()));
							_route_stopage.setReached_time(lastReachTime);
							_route_stopage.setReached("Y");
							_route_stopage.setReached_duration((int)(current_time - lastReachTime));
						}
					} else {
						System.out.println("getReached_time is null");
						lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
						_route_stopage.setReached_time(lastReachTime);
						long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
						_route_stopage.setReached_duration((int)(lastReachTime-current_time));
					}
				} else {
					System.out.println("Invalid Route");
					lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
					_route_stopage.setReached_time(lastReachTime);
					long current_time = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date());
					_route_stopage.setReached_duration((int)(lastReachTime-current_time));
				}
			}
		}
		return resources;
	}

}
