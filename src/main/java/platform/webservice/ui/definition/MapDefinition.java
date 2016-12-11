package platform.webservice.ui.definition;

import java.util.ArrayList;

public class MapDefinition {
	String mapType;
	String id;
	
	ArrayList<MapPoint> mapPointList;
	
	public MapDefinition(String id) {
		this.id = id;
		mapPointList = new ArrayList<MapPoint>();
	}
	public void addPoint(MapPoint point) {
		mapPointList.add(point);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<MapPoint> getMapPointList() {
		return mapPointList;
	}
}
