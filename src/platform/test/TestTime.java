package platform.test;

import java.util.Date;

import platform.util.TimeUtil;

public class TestTime {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		long dayTime = TimeUtil.getDayTime("IST", date);
		System.out.println(dayTime);
		
		long dayTime2 = TimeUtil.getDayTime("10:12");
		System.out.println(dayTime2);

		
	}
}	
