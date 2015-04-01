package platform.webservice.ui.component;

import platform.util.ApplicationConstants;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.MapPoint;
import platform.webservice.ui.definition.RouteMapDefinition;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;

public abstract class BaseTrackMapView extends BaseView {
	RouteMapDefinition mDefinition;
	UIServletContext mContext;
	
	
	public BaseTrackMapView(UIServletContext ctx) {
		mContext = ctx;
		ctx.getPageBuilder().addJS(new JS(null, "http://maps.googleapis.com/maps/api/js?sensor=false&key="+ApplicationConstants.GOOGLE_MAP_KEY));
	}

	public UIServletContext getContext() {
		return mContext;
	}

	public RouteMapDefinition getDefinition() {
		return mDefinition;
	}
	public abstract void populateData();
	
	public void buildUI() {
		populateData();
		Div div = new Div();
		div.addAttribute("id",mDefinition.getId());
		div.addAttribute("style","font-size : 10px;width: 100%; height: 600px; border : 1px solid gray");
		getView().addChild(div);
		if (mDefinition.getMapPointList().size() == 0)
			return;
		StringBuffer buffer = new StringBuffer();
		MapPoint startPoint =  mDefinition.getMapPointList().get(0);
		MapPoint endPoint = mDefinition.getMapPointList().get(mDefinition.getMapPointList().size()-1);
		buffer.append("<script type=\"text/javascript\">\n");
		buffer.append(""+
				"$(document).ready(function(){\n"+
					"initialize();\n"+
				"});\n"+
			    "function initialize() {\n"+
				    "var mapOptions = {\n"+
				    "zoom: 15,\n"+
				    "center: new google.maps.LatLng("+startPoint.getLatitude()+", "+startPoint.getLongitude()+"),\n"+
				    "mapTypeId: google.maps.MapTypeId.TERRAIN\n"+
				  "};\n"+
				  "var map = new google.maps.Map(document.getElementById('"+mDefinition.getId()+"'),\n"+
				  "    mapOptions);\n"+
				  "var flightPlanCoordinates = [];\n ");
				  for(int i =0; i < mDefinition.getMapPointList().size() ; i++) {
						MapPoint point = mDefinition.getMapPointList().get(i);
						buffer.append("var stop = new google.maps.LatLng("+point.getLatitude()+", "+point.getLongitude()+") \n"+ 
							"flightPlanCoordinates.push(stop);\n");
					}
				  buffer.append("var flightPath = new google.maps.Polyline({\n"+
				    "path: flightPlanCoordinates,\n"+
				    "geodesic: true,\n"+
				    "strokeColor: '#FF0000',\n"+
				    "strokeOpacity: 1.0,\n"+
				    "strokeWeight: 2\n"+
				  "});\n"+
				  "flightPath.setMap(map);\n"+
				"}; \n");
		buffer.append("</script>");
		TEXT text = new TEXT(buffer.toString());
		getView().addChild(text);
	}

	public void setDefinition(RouteMapDefinition mDefinition) {
		this.mDefinition = mDefinition;
	}
}


