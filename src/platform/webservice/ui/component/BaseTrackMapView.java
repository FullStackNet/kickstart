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
		StringBuffer buffer = new StringBuffer();
		MapPoint startPoint =  mDefinition.getMapPointList().get(0);
		MapPoint endPoint = mDefinition.getMapPointList().get(mDefinition.getMapPointList().size()-1);
		buffer.append("<script type=\"text/javascript\">\n");
		buffer.append(""+
				"$(document).ready(function(){\n"+
					"initialize();\n"+
				"});\n"+
				"var directionDisplay;\n"+
			    "var directionsService;\n"+
			    "var map;\n"+
			    "function initialize() {\n"+
			    "	 directionsService = new google.maps.DirectionsService();\n" +
			    "    directionsDisplay = new google.maps.DirectionsRenderer();\n"+
			    "    var startpoint = new google.maps.LatLng("+startPoint.getLatitude()+", "+startPoint.getLongitude()+");\n"+
			    "    var myOptions = {\n"+
			    "        zoom: 6,\n"+
			    "		 center : startpoint\n"+	
			    "        mapTypeId: google.maps.MapTypeId.ROADMAP\n"+
			    "    } \n"+
			    "    map = new google.maps.Map(document.getElementById(\""+mDefinition.getId()+"\"), myOptions);\n"+
			    "    directionsDisplay.setMap(map);\n"+
			    "    calcRoute();\n"+
			 	"}; \n");
		
		
		buffer.append(""+
			"function calcRoute() { \n"+
	        "var waypts = []; \n");
	    for(int i =0; i < mDefinition.getMapPointList().size() ; i++) {
			MapPoint point = mDefinition.getMapPointList().get(i);
			buffer.append("var stop = new google.maps.LatLng("+point.getLatitude()+", "+point.getLongitude()+") \n"+ 
				"waypts.push({ \n"+
		        "    location:stop, \n"+
		        "    stopover:true});\n");
		}
		buffer.append("var start  = new google.maps.LatLng("+startPoint.getLatitude()+", "+startPoint.getLongitude()+"); \n"+
	        "var end = new google.maps.LatLng("+endPoint.getLatitude()+", "+endPoint.getLongitude()+"); \n"+
	        "var request = {\n"+
	         "   origin: start,\n"+
	         "   destination: end,\n"+
	         "   waypoints: waypts,\n"+
	         "   optimizeWaypoints: true,\n"+
	         "   travelMode: google.maps.DirectionsTravelMode.WALKING\n"+
	         "}; \n");
		
		buffer.append(""+
				"directionsService.route(request, function(response, status) { \n"+
	            "if (status == google.maps.DirectionsStatus.OK) { \n"+
	            "    directionsDisplay.setDirections(response); \n"+
	            "   var route = response.routes[0]; \n"+
	           " } \n"+
	        "});\n");
		buffer.append(""+"}");
		buffer.append("</script>");
		TEXT text = new TEXT(buffer.toString());
		getView().addChild(text);
	}

	public void setDefinition(RouteMapDefinition mDefinition) {
		this.mDefinition = mDefinition;
	}
}


