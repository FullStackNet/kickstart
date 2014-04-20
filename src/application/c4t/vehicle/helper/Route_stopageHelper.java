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
						long duration = routeEndDayTime -routeStartDayTime + (5*60*1000L);
						if (timediff > duration) {
							 lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
							_route_stopage.setReached_time(lastReachTime);
						} else {
							lastReachTime = TimeUtil.getDayTime(_appliance.getTimeZone(),new Date(_route_stopage.getReached_time()));
							_route_stopage.setReached_time(lastReachTime);
							_route_stopage.setReached("Y");
						}
					} else {
						 lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
						_route_stopage.setReached_time(lastReachTime);
					}
				} else {
					 lastReachTime = lastReachTime + _route_stopage.getTime_from_previous_stop();
					_route_stopage.setReached_time(lastReachTime);
				}
			}
		}
		return resources;
	}
	
}
