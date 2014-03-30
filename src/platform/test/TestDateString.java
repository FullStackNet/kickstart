package platform.test;

import java.util.Date;

import platform.util.TimeUtil;

public class TestDateString {
	public static void main(String[] args) throws Exception {
		String str = TimeUtil.getDateString(null, 0);
		System.out.println(str);
		str = TimeUtil.getDateString(null, new Date().getTime()+2*24*60*60*1000L);
		System.out.println(str);
	}
}	
