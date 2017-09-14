package platform.util.location;

import platform.util.Util;

public class LocationUtil {
	
	public static double getDistance(String lat1, String lon1, String lat2, String lon2) {
		if (Util.isEmpty(lat1) || Util.isEmpty(lon1) || Util.isEmpty(lat2) || Util.isEmpty(lon2)) {
			return 0;
		}
		try {
		return getDistance(Double.parseDouble(lat1),Double.parseDouble(lon1),Double.parseDouble(lat2),Double.parseDouble(lon2),'K');
		} catch(Exception e) {
			
		}
		return 0.0;
	}
	
	public static double getDistance(double lat1, double lon1, double lat2, double lon2) {
		return getDistance(lat1,lon1,lat2,lon2,'K');
	}
	
	public static double getDistance(double lat1, double lon1, double lat2, double lon2, char unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == 'K') {
			dist = dist * 1.609344;
		} else if (unit == 'N') {
			dist = dist * 0.8684;
		}
		return (dist);
	}

	static private double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}


	static	private double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
}
