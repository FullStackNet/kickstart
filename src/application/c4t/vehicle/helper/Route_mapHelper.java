package application.c4t.vehicle.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.route_map;
import application.c4t.vehicle.resource.stopage;

public class Route_mapHelper extends BaseHelper {
	public Route_mapHelper() {
		super(new route_map());
		// TODO Auto-generated constructor stub
	}
	
	private static Route_mapHelper instance;
	
	public static Route_mapHelper getInstance() {
		if (instance == null)
			instance = new Route_mapHelper();
		return instance;
	}
	
	public void addRouteStopage(String routeId,String routeStopageId) throws ApplicationException {
		if (routeId == null) return;
		if (routeStopageId == null) return;
		route_map _map = new route_map();
		_map.setId(routeId);
		_map.addRoute_stopages(routeStopageId);
		AddOrUpdate(_map);
	}
	
	
	public void removeRouteStopage(String routeId,String routeStopageId) throws ApplicationException {
		if (routeId == null) return;
		if (routeStopageId == null) return;
		route_map _map = new route_map();
		_map.setId(routeId);
		_map.addRoute_stopages(routeStopageId);
		unset(_map);
	}
	
	public void addAppliance(String routeId,String applianceId) throws ApplicationException {
		if (routeId == null) return;
		if (applianceId == null) return;
		route_map _map = new route_map();
		_map.setId(routeId);
		_map.addAppliances(applianceId);
		AddOrUpdate(_map);
	}
	
	public void removeAppliance(String routeId,String applianceId) throws ApplicationException {
		if (routeId == null) return;
		if (applianceId == null) return;
		route_map _map = new route_map();
		_map.setId(routeId);
		_map.addAppliances(applianceId);
		unset(_map);
	}
	
	public ArrayList<BaseResource> getRouteStopageList(String routeId) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		route_map _map = (route_map)getById(routeId);
		if ((_map == null) || (_map.getRoute_stopages() == null))
			return list;
		return Route_stopageHelper.getInstance().getListById(_map.getRoute_stopages().toArray(new String[_map.getRoute_stopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getRouteStopageListMap(String routeId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		route_map _map = (route_map)getById(routeId);
		if ((_map == null) || (_map.getRoute_stopages() == null))
			return list;
		return Route_stopageHelper.getInstance().getListMapById(_map.getRoute_stopages().toArray(new String[_map.getRoute_stopages().size()]),
				new String[]{stopage.FIELD_NAME});
	}
}
