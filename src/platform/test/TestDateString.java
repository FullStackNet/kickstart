package platform.test;

import java.util.Calendar;
import java.util.Date;

import platform.util.TimeUtil;

public class TestDateString {
	public static void main(String[] args) throws Exception {
		String str = TimeUtil.getDateString(null, 0);
		System.out.println(str);
		str = TimeUtil.getDateString(null, new Date().getTime()+2*24*60*60*1000L);
		System.out.println(str);
		String mobile_no = "919880158155";
		if (mobile_no.startsWith("91")) {
			mobile_no = mobile_no.substring(2, mobile_no.length());
			System.out.println(mobile_no);
		}
		 mobile_no = "+919880158155";
		if (mobile_no.startsWith("+91")) {
			mobile_no = mobile_no.substring(3, mobile_no.length());
			System.out.println(mobile_no);
		}
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR);
		System.out.println("Year : " + year);
	}
}	
