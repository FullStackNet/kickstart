package platform.test;

import platform.util.location.LocationUtil;

public class TestDistance {
	public static void main(String[] args) throws Exception {
		double dist = LocationUtil.getDistance(13.03629414, 77.59285055, 13.03661135, 77.58939588);
		System.out.println(dist);
		dist = LocationUtil.getDistance(13.03661135, 77.58939588, 13.02966932, 77.59146846);
		System.out.println(dist);
		
		dist = LocationUtil.getDistance(13.02932919, 77.59258704, 13.02963681, 77.59168278);
		System.out.println(dist);
		
	}
}	
