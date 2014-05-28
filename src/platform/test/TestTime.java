package platform.test;

import java.util.Calendar;
import java.util.Date;

import platform.util.TimeUtil;

public class TestTime {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		long dayTime = TimeUtil.getDayTime("IST", date);
		System.out.println(dayTime);
		
		long dayTime2 = TimeUtil.getDayTime("10:12");
		System.out.println(dayTime2);

		long time =  new Date().getTime() - (3600L*1000L*24*4);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(time));
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(new Date(time)  + " -> " +dayOfWeek);

		
	}
}	
