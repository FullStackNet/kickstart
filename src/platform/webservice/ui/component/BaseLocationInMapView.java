package platform.webservice.ui.component;

import platform.util.ApplicationConstants;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.MapDefinition;
import platform.webservice.ui.definition.MapPoint;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;

public abstract class BaseLocationInMapView extends BaseView {
	MapDefinition mDefinition;
	UIServletContext mContext;
	
	public BaseLocationInMapView(UIServletContext ctx) {
		mContext = ctx;
		ctx.getPageBuilder().addJS(new JS(null, "http://maps.googleapis.com/maps/api/js?sensor=false&key="+ApplicationConstants.GOOGLE_MAP_KEY));
	}

	public UIServletContext getContext() {
		return mContext;
	}

	public MapDefinition getDefinition() {
		return mDefinition;
	}
	public abstract void populateData();
	
	public void buildUI() {
		populateData();
		Div div = new Div();
		div.addAttribute("id",mDefinition.getId());
		div.addAttribute("style","font-size : 10px;width: 100%; height: 600px");
		getView().addChild(div);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<script type=\"text/javascript\">\n");
		buffer.append("var markers = [\n");
		for(int i =0; i < mDefinition.getMapPointList().size() ; i++) {
			MapPoint point = mDefinition.getMapPointList().get(i);
			if (i != 0) {
				buffer.append(",\n");
			}
			buffer.append("{\n");
			buffer.append("\"title\": '"+point.getName()+"',\n");
			buffer.append("\"lat\": '"+point.getLatitude()+"',\n");
			buffer.append("\"lng\": '"+point.getLongitude()+"',\n");
			buffer.append("\"description\": '"+point.getDescription()+"',\n");
			buffer.append("}");
		}
		buffer.append("\n");
		buffer.append("];\n");
		buffer.append("window.onload = function () {\n" +
				"var mapOptions = { "+
				"    center: new google.maps.LatLng(markers[0].lat, markers[0].lng), \n" +
				"    zoom: 6, \n" +
				"    mapTypeId: google.maps.MapTypeId.ROADMAP \n"+
				"}; \n" +
				"var map = new google.maps.Map(document.getElementById(\""+mDefinition.getId()+"\"), mapOptions);\n"+
				"var infoWindow = new google.maps.InfoWindow(); \n"+
				"var lat_lng = new Array();\n"+
				"var latlngbounds = new google.maps.LatLngBounds();\n"+
				"for (i = 0; i < markers.length; i++) { \n"+
				"    var data = markers[i] \n"+
				"    var myLatlng = new google.maps.LatLng(data.lat, data.lng); \n" +
				"    lat_lng.push(myLatlng); \n" +
				"    var marker = new google.maps.Marker({ \n"+
				"        position: myLatlng, \n" +
				"        map: map, \n"+
				"        title: data.title \n"+
				"    }); \n"+
				"    latlngbounds.extend(marker.position); \n"+
				"    (function (marker, data) { \n"+
				"        google.maps.event.addListener(marker, \"click\", function (e) { \n" +
				"            infoWindow.setContent(data.description); \n" +
				"            infoWindow.open(map, marker); \n"+
				"        }); \n"+
				"    })(marker, data); \n" +
				" } \n" +
				" map.setCenter(latlngbounds.getCenter()); \n"+
				" map.fitBounds(latlngbounds); \n" +
			/*	" var path = new google.maps.MVCArray(); \n" +
				" var service = new google.maps.DirectionsService(); \n"+
				"var poly = new google.maps.Polyline({ map: map, strokeColor: '#4986E7' }); \n" +
				//Loop and Draw Path Route between the Points on MAP
				" for (var i = 0; i < lat_lng.length; i++) { \n"+
				"    if ((i + 1) < lat_lng.length) { \n" +
				"        var src = lat_lng[i]; \n"+
				"        var des = lat_lng[i + 1]; \n"+
				"        path.push(src); \n"+
				"        poly.setPath(path); \n"+
				"        service.route({ \n"+
				"            origin: src, \n"+
				"            destination: des, \n"+
				"            travelMode: google.maps.DirectionsTravelMode.DRIVING \n"+
				"        }, function (result, status) { \n"+
				"            if (status == google.maps.DirectionsStatus.OK) { \n"+
				"                for (var i = 0, len = result.routes[0].overview_path.length; i < len; i++) { \n"+
				"                    path.push(result.routes[0].overview_path[i]); \n"+
				"                } \n"+
				"            } \n"+
				"        }); \n"+
				"    } \n"+
				"} \n"+
			*/
				"}; \n");
		buffer.append("</script>");
		TEXT text = new TEXT(buffer.toString());
		getView().addChild(text);
	}

	public void setDefinition(MapDefinition mDefinition) {
		this.mDefinition = mDefinition;
	}
}


