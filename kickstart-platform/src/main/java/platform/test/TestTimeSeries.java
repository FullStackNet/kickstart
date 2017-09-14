package platform.test;

import platform.util.TimeUtil;

public class TestTimeSeries {
	public static void main(String[] args) throws Exception {
		String str = TimeUtil.getCurrentTimeSeriesString();
		System.out.println(str);
	}
}	
