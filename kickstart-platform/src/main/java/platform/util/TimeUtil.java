package platform.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeUtil {
	
	public static int getMonthNumber(String month) {
		int monthNumber = 0;
		if (month.equalsIgnoreCase("JAN"))
				return 1;
		if (month.equalsIgnoreCase("FEB"))
			return 2;
		if (month.equalsIgnoreCase("MAR"))
			return 3;
		if (month.equalsIgnoreCase("APR"))
			return 4;
		if (month.equalsIgnoreCase("MAY"))
			return 5;
		if (month.equalsIgnoreCase("JUN"))
			return 6;
		if (month.equalsIgnoreCase("JUL"))
			return 7;
		if (month.equalsIgnoreCase("AUG"))
			return 8;
		if (month.equalsIgnoreCase("SEP"))
			return 9;
		if (month.equalsIgnoreCase("OCT"))
			return 10;
		if (month.equalsIgnoreCase("NOV"))
			return 11;
		if (month.equalsIgnoreCase("DEC"))
			return 12;
		return monthNumber;
	}
	
	public static long getTimeFromString(String date,String timeZone) {
			if (Util.isEmpty(timeZone))
				timeZone = "IST";
		    int year = Integer.parseInt(date.substring(0,4));
			int month = Integer.parseInt(date.substring(4,6));
			int day = Integer.parseInt(date.substring(6,8));
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.set(year, month-1, day);
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MILLISECOND, 0);
			return cal.getTimeInMillis();
	    }
		
	
	    public static String getCurrentTimeSeriesString() {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date();
			return dateFormat.format(date);
		}
	   
	    public static String getDisplayDateString(String timeZone,long time) {
			if (timeZone == null)
				timeZone = "IST";
			if (time == 0) {
				time = new Date().getTime();
			}
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.setTime(new Date(time));
	
			return String.format("%02d-%02d-%04d",cal.get(Calendar.DAY_OF_MONTH),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
		}
	    
	    public static String getDateStringMMDDYYYY(String timeZone,long time,String sepeartor) {
			if (timeZone == null)
				timeZone = "GMT";
			if (time == 0) {
				time = new Date().getTime();
			}
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.setTime(new Date(time));
	
			return String.format("%02d"+sepeartor+"%02d"+sepeartor+"%04d",
					cal.get(Calendar.DAY_OF_MONTH),cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
		}
	    
	    public static String getDateString(String timeZone,long time,String sepeartor) {
			if (timeZone == null)
				timeZone = "GMT";
			if (time == 0) {
				time = new Date().getTime();
			}
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.setTime(new Date(time));
	
			return String.format("%04d"+sepeartor+"%02d"+sepeartor+"%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
		}
	    public static String getDateString(String timeZone,long time) {
			if (timeZone == null)
				timeZone = "GMT";
			if (time == 0) {
				time = new Date().getTime();
			}
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.setTime(new Date(time));
	
			return String.format("%04d%02d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
		}
	    
	    public static boolean isSameDate(String timezone,long date1, long date2) {
	    	if (Util.isEmpty(timezone))
	    		timezone = "IST";
	    	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
	    	cal.setTimeInMillis(date1);
	    	String dateStr1 =  String.format("%04d%02d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
	    	cal.setTimeInMillis(date2);
	    	String dateStr2 =  String.format("%04d%02d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
	    	if (dateStr1.equals(dateStr2)) {
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public static boolean isSameMonth(String timezone,long date1, long date2) {
	    	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
	    	cal.setTimeInMillis(date1);
	    	String monthStr1 =  String.format("%04d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1);
	    	cal.setTimeInMillis(date2);
	    	String monthStr2 =  String.format("%04d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1);
	    	if (monthStr1.equals(monthStr2)) {
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public static long todayTimePassed(String timezone,long date1) {
	    	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
	    	cal.setTimeInMillis(date1);
	    	cal.set(Calendar.HOUR_OF_DAY, 0);
	    	cal.set(Calendar.MINUTE, 0);
	    	cal.set(Calendar.SECOND, 0);
	    	cal.set(Calendar.MILLISECOND, 0);
	    	return date1-cal.getTimeInMillis();
	    }
	    
	    
	    
	    public static String getNextDate(String dateString,String toDate) {
    	  int year = Integer.parseInt(dateString.substring(0,4));
		  int month = Integer.parseInt(dateString.substring(4,6));
		  int day = Integer.parseInt(dateString.substring(6,8));
		  
		  Calendar cal = Calendar.getInstance();
		  cal.set(Calendar.YEAR, year);
		  cal.set(Calendar.MONTH, month-1);
		  cal.set(Calendar.DAY_OF_MONTH, day);
		  cal.set(Calendar.HOUR_OF_DAY, 0);
		  cal.set(Calendar.MINUTE, 0);
		  cal.set(Calendar.SECOND, 0);
		  cal.set(Calendar.MILLISECOND, 0);
		  cal.add(Calendar.DATE, 1);
		  
		  year = Integer.parseInt(toDate.substring(0,4));
		  month = Integer.parseInt(toDate.substring(4,6));
		  day = Integer.parseInt(toDate.substring(6,8));
		  
		  Calendar toCal = Calendar.getInstance();
		  toCal.set(Calendar.YEAR, year);
		  toCal.set(Calendar.MONTH, month-1);
		  toCal.set(Calendar.DAY_OF_MONTH, day);
		  cal.set(Calendar.HOUR_OF_DAY, 0);
		  cal.set(Calendar.MINUTE, 0);
		  cal.set(Calendar.SECOND, 0);
		  cal.set(Calendar.MILLISECOND, 0);
		  if (cal.getTime().getTime() > toCal.getTime().getTime()) {
			  return null;
		  }
		  return String.format("%04d%02d%02d",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
		}
	    
	    public static String getPreviousDate(String dateString,String fromDate) {
	    	  int year = Integer.parseInt(dateString.substring(0,4));
			  int month = Integer.parseInt(dateString.substring(4,6));
			  int day = Integer.parseInt(dateString.substring(6,8));
			  
			  Calendar cal = Calendar.getInstance();
			  cal.set(Calendar.YEAR, year);
			  cal.set(Calendar.MONTH, month-1);
			  cal.set(Calendar.DAY_OF_MONTH, day);
			  cal.add(Calendar.DATE, 1);
			  
			  year = Integer.parseInt(fromDate.substring(0,4));
			  month = Integer.parseInt(fromDate.substring(4,6));
			  day = Integer.parseInt(fromDate.substring(6,8));
			  
			  Calendar toCal = Calendar.getInstance();
			  toCal.set(Calendar.YEAR, year);
			  toCal.set(Calendar.MONTH, month-1);
			  toCal.set(Calendar.DAY_OF_MONTH, day);
			  if (cal.getTime().getTime() > toCal.getTime().getTime()) {
				  return null;
			  }
			  return String.format("%04d%02d%02d",cal.get(Calendar.YEAR),
						cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
			}
	    
	    public static String getMonthString(String timeZone,long time) {
			if (timeZone == null)
				timeZone = "GMT";
			if (time == 0) {
				time = new Date().getTime();
			}
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
			cal.setTime(new Date(time));
	
			return String.format("%04d%02d01",cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH)+1);
		}
	public static  int getCurrentDateDiff(int year, int month, int day) {
		@SuppressWarnings("deprecation")
		Date startDate = new Date(year-1900, month-1, day);
		@SuppressWarnings("deprecation")
		Date endDate = new Date(Calendar.getInstance().get(Calendar.YEAR)-1900, Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		return (int) ((endDate.getTime() - startDate.getTime())/(1000*60*60*24));
	}

	public static int getCurrentMonthDiff(int year, int month) {
		int yearDiff = (Calendar.getInstance().get(Calendar.YEAR) - year);
		int months = 0;
		if(yearDiff >= 0) {
			months = (yearDiff * 12) + (Calendar.getInstance().get(Calendar.MONTH)+1) - month;
		}
		return months;
	}
	public static int  getCurrentYear() {
		
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR);
		return year;
	}
	
	public static String getMonthString(int month) {
		String monthString = "";
		switch (month) {
			case 1:  monthString = "JAN"; break;
            case 2:  monthString = "FEB"; break;
            case 3:  monthString = "MAR"; break;
            case 4:  monthString = "APR"; break;
            case 5:  monthString = "MAY"; break;
            case 6:  monthString = "JUN"; break;
            case 7:  monthString = "JUL"; break;
            case 8:  monthString = "AUG"; break;
            case 9:  monthString = "SEP"; break;
            case 10: monthString = "OCT"; break;
            case 11: monthString = "NOV"; break;
            case 12: monthString = "DEC"; break;
            default:
            	break;
		}
		return monthString;
	}
	
	@SuppressWarnings("deprecation")
	public static int getYear (Timestamp time) {
		int year = time.getYear()+1900;
		return year;
	}
	@SuppressWarnings("deprecation")	
	public static int getMonth (Timestamp time) {
		int month = time.getMonth()+1;
		return month;
	}
	@SuppressWarnings("deprecation")
	public static int getDay (Timestamp time) {
		int day = time.getDate();
		return day;
	}
	@SuppressWarnings("deprecation")
	public static int getHours (Timestamp time) {
		int hour = time.getHours();
		return hour;
	}
	
	public static String getStringFromTime(String timeZone,long time) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date(time));
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss");
			sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
			return sdf.format(new Date(time));
	}
	
	public static String getMMDDYYYYStringFromTime(String timeZone,long time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(time));
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf.format(new Date(time));
	}

	public static String getStringFromOnlyTime(String timeZone,long time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(time));
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf.format(new Date(time));
}
	
	public static String getDurationString(long duration) {
		String str = "";
		if (duration == 0)
			return "-";
		if (duration > (24*60*60*1000L)) {
			long days = duration / (24*60*60*1000L);
			str = days + " Days ";
			duration = duration - days*(24*60*60*1000L);
		}
		if (duration > (60*60*1000L)) {
			long hours = duration / (60*60*1000L);
			str = str + hours + " Hours ";
			duration = duration - hours*(60*60*1000L);
		}
		
		if (duration > (60*1000L)) {
			long mm = duration / (60*1000L);
			str = str + mm + " Minutes ";
			duration = duration - mm*(60*1000L);
		}
		
		if (duration > (1000L)) {
			long ss = duration / (1000L);
			str = str + ss + " Seconds ";
			duration = duration - ss*(60*1000L);
		}
		return str;
	}
	
	public static String ago(Date startTime) {
		if (startTime == null) return "-";
		return ago(startTime.getTime());
	}
	
	public static String getDayTimeString(long dayTime) {
		long   time = dayTime;
		long hr = time/(60*60);
		time = time-(hr*60*60);
		long mn = time/60;
		long ss = time-(mn*60);
		return String.format("%02d:%02d:%02d",hr,mn,ss);
	}
	
	public static long getDayTime(String timeZone,long timeinMs) {
		Date time = new Date(timeinMs);
		long dayTime = 0;
		if (timeZone == null)
			timeZone = "IST";
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.setTime(time);
		long hr = cal.get(Calendar.HOUR_OF_DAY);
		long mm = cal.get(Calendar.MINUTE);
		long ss = cal.get(Calendar.SECOND);
		dayTime = ss+(mm*60L)+(hr*60L*60L);
		return dayTime;
	}
	public static Long getTimeFromDateString(String timeZone,String date,String timeHHMMSS) {
		if (Util.isEmpty(date)) {
			return null;
		}
		if (timeZone == null)
			timeZone = "IST";
		
		String[] tokens = date.split("-");
		if (date.indexOf('/') > 0) {
			tokens = date.split("/");
		}
		int year = Integer.parseInt(tokens[2]);
		int  month = Integer.parseInt(tokens[1]);
		int  day = Integer.parseInt(tokens[0]);
		 
		String[] timeTokens = timeHHMMSS.split(":");
		int hh = Integer.parseInt(timeTokens[0]);
		int  mm = Integer.parseInt(timeTokens[1]);
		int  ss = Integer.parseInt(timeTokens[2]);
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hh);
		cal.set(Calendar.MINUTE, mm);
		cal.set(Calendar.SECOND, ss);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static Long getTimeFromDateStringWithCurrentYear(String timeZone,String date) {
		if (Util.isEmpty(date)) {
			return null;
		}
		if (timeZone == null)
			timeZone = "IST";
		
		String[] tokens = date.split("-");
		if (date.indexOf('/') > 0) {
			tokens = date.split("/");
		}
		int  month = Integer.parseInt(tokens[1]);
		int  day = Integer.parseInt(tokens[0]);
		  
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		
		cal.set(Calendar.YEAR, getCurrentYear());
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	public static Long getTimeFromDateString(String timeZone,long time,String timeHHMMSS) {
		if (timeZone == null)
			timeZone = "IST";
		
		String[] timeTokens = timeHHMMSS.split(":");
		int hh = Integer.parseInt(timeTokens[0]);
		int  mm = Integer.parseInt(timeTokens[1]);
		int  ss = 0;
		if (timeTokens.length > 2) {
			ss = Integer.parseInt(timeTokens[2]);
		}
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.setTime(new Date(time));
		cal.set(Calendar.HOUR_OF_DAY, hh);
		cal.set(Calendar.MINUTE, mm);
		cal.set(Calendar.SECOND, ss);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static Long getTimeFromDateStringWithCurrentYear(String timeZone,String date,String timeHHMMSS) {
		if (Util.isEmpty(date)) {
			return null;
		}
		if (timeZone == null)
			timeZone = "IST";
		
		String[] tokens = date.split("-");
		if (date.indexOf('/') > 0) {
			tokens = date.split("/");
		}
		int  month = Integer.parseInt(tokens[1]);
		int  day = Integer.parseInt(tokens[0]);
		 
		String[] timeTokens = timeHHMMSS.split(":");
		int hh = Integer.parseInt(timeTokens[0]);
		int  mm = Integer.parseInt(timeTokens[1]);
		int  ss = 0;
		if (timeTokens.length > 2) {
			ss = Integer.parseInt(timeTokens[2]);
		}
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		
		cal.set(Calendar.YEAR, getCurrentYear());
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hh);
		cal.set(Calendar.MINUTE, mm);
		cal.set(Calendar.SECOND, ss);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static Long getTimeFromDateString(String timeZone,String date) {
		if (Util.isEmpty(date)) {
			return null;
		}
		if (timeZone == null)
			timeZone = "IST";
		
		String[] tokens = date.split("-");
		if (date.indexOf('/') > 0) {
			tokens = date.split("/");
		}
		int year = Integer.parseInt(tokens[2]);
		int  month = Integer.parseInt(tokens[1]);
		int  day = Integer.parseInt(tokens[0]);
		  
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static Long getTimeFromDateStringYYYYMMDD(String timeZone,String date) {
		if (Util.isEmpty(date)) {
			return null;
		}
		if (timeZone == null)
			timeZone = "IST";
		
		String[] tokens = date.split("-");
		if (date.indexOf('/') > 0) {
			tokens = date.split("/");
		}
		int year = Integer.parseInt(tokens[0]);
		int  month = Integer.parseInt(tokens[1]);
		int  day = Integer.parseInt(tokens[2]);
		  
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	public static long getDayTime(String timeZone,Date time) {
		long dayTime = 0;
		if (timeZone == null)
			timeZone = "IST";
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.setTime(time);
		long hr = cal.get(Calendar.HOUR_OF_DAY);
		long mm = cal.get(Calendar.MINUTE);
		long ss = cal.get(Calendar.SECOND);
		dayTime = ss+(mm*60L)+(hr*60L*60L);
		return dayTime;
	}
	
	public static String getDayTimeString(String timeZone,Date time) {
		if (timeZone == null)
			timeZone = "IST";
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		cal.setTime(time);
		long hr = cal.get(Calendar.HOUR_OF_DAY);
		long mm = cal.get(Calendar.MINUTE);
		long ss = cal.get(Calendar.SECOND);
		return String.format("%02d:%02d:%02d",hr,mm,ss);
	}
	public static long getDayTime(String time) {
		if (time == null)
			return 0;
		long dayTime = 0;
		time = time.trim();
		String[] times = time.split(":");
		if (times.length > 0) {
			dayTime = Long.parseLong(times[0])*60L*60L;
		}
		if (times.length > 1) {
			dayTime = dayTime+Long.parseLong(times[1])*60L;
		}
		if (times.length > 2) {
			dayTime = dayTime+Long.parseLong(times[2]);
		}
		return dayTime;
	}
	

	
	public static String ago(long startTime) {
		Date endTime= new Date();
		long elapsedTime = endTime.getTime()-startTime;
		long second = elapsedTime/1000L;
		long min = 0;
		long hrs = 0;
		long day = 0;
		String str ="";	
		if (second > 60) {
			min = second/60L;
			second = second % 60;
		}
		if (min > 60) {
			hrs = min/60L;
			min = min % 60;
		}
		if (hrs > 24) {
			day = hrs/24L;
			hrs = hrs % 24;
		}
		
		if (day > 0) {
			str = str+day+" days ";
		}
		
		if (hrs > 0) {
			str = str+hrs+" hrs ";
		}
		if (min > 0) {
			str = str+min+" mins ";
		}
		if ((day ==0) && second > 0) {
			str = str+second+" secs ";
		}
		str = str+" ago ";
		return str;
	}

	public static long addYear(Date time,int year) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(time); 
		c.add(Calendar.YEAR, year);
		return c.getTime().getTime();
	}
	
	public static long addYear(long time,int year) {
		return addYear(new Date(time),year);
	}
	
	public static long addMonth(Date time,int month) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(time); 
		c.add(Calendar.MONTH, month);
		return c.getTime().getTime();
	}
	
	public static long addMonth(long time,long month) {
		return addMonth(new Date(time),(int)month);
	}
	
	public static long addMonth(long time,int month) {
		return addMonth(new Date(time),month);
	}
	
	public static long addDay(Date time,int day) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(time); 
		c.add(Calendar.DATE, day);
		return c.getTime().getTime();
	}
	
	public static long addDay(long time,int day) {
		return addDay(new Date(time),day);
	}
	
	public static long getTimeforCurrentDate(String timezone) {
		if (timezone == null)
			timezone = "IST";
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	
	public static long getCurrentDay(String timezone) {
		if (timezone == null)
			timezone = "IST";
		Calendar toCal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		toCal.setTime(new Date());
		return toCal.get(Calendar.DAY_OF_MONTH);
	}

	public static long getCurrentMonth(String timezone) {
		if (timezone == null)
			timezone = "IST";
		Calendar toCal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		toCal.setTime(new Date());
		return toCal.get(Calendar.MONTH);
	}

	public static long getCurrentYear(String timezone) {
		if (timezone == null)
			timezone = "IST";
		Calendar toCal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		toCal.setTime(new Date());
		return toCal.get(Calendar.YEAR);
	}
	
	public static long getTimeDDMMYYHHMMSS(String timezone, String timeString) {
		int day = Integer.parseInt(timeString.substring(0,2));
		int month = Integer.parseInt(timeString.substring(2,4));
		int year = Integer.parseInt(timeString.substring(4,6));
		int hh = Integer.parseInt(timeString.substring(6,8));
		int mm = Integer.parseInt(timeString.substring(8,10));
		int ss = Integer.parseInt(timeString.substring(10,12));
		return getTime(timezone, year, month, day, hh, mm, ss);		
	}
	public static long getTime(String timezone,int year,int month, int day,
			int hrs, int min, int second) {
		if (timezone == null)
			timezone = "IST";
		if (year < 1000)
			year = year + 2000;
		Calendar toCal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		toCal.set(Calendar.YEAR, year);
		toCal.set(Calendar.MONTH, month-1);
		toCal.set(Calendar.DAY_OF_MONTH, day);
		toCal.set(Calendar.HOUR_OF_DAY, hrs);
		toCal.set(Calendar.MINUTE, min);
		toCal.set(Calendar.SECOND, second);
		return toCal.getTime().getTime();
	}
	public static long getFromTime(String durationType,String timezone) {
		long time=0;
		if ("today".equalsIgnoreCase(durationType)) {
			time = TimeUtil.getTimeforCurrentDate(timezone);
		}
		if ("yesterday".equalsIgnoreCase(durationType)) {
			time = TimeUtil.getTimeforCurrentDate(timezone)-24*60*60*1000L;
		}
		if ("this_week".equalsIgnoreCase(durationType)) {
			time = TimeUtil.getStartTimeofThisWeek(timezone);
		}
		if ("this_month".equalsIgnoreCase(durationType)) {
			time = TimeUtil.getStartTimeofThisMonth(timezone);
		}
		return time;
	}
	public static long getToTime(String durationType,long fromTime,String timezone) {
		long time=0;
		if ("today".equalsIgnoreCase(durationType)) {
			time = fromTime-1000+24*60*60*1000L;
		}
		if ("yesterday".equalsIgnoreCase(durationType)) {
			time = fromTime-1000+24*60*60*1000L;
		}
		if ("this_week".equalsIgnoreCase(durationType)) {
			time = System.currentTimeMillis();
		}
		if ("this_month".equalsIgnoreCase(durationType)) {
			time = System.currentTimeMillis();
		}
		return time;
	}

	public static long getStartTimeofThisWeek(String timezone) {
		if (timezone == null)
			timezone = "IST";

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.SUNDAY) {
			dayOfWeek = 8;
		}
		dayOfWeek = dayOfWeek - 2;
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis()-dayOfWeek*24*60*60*1000L;
	}
	public static long getStartTimeofThisMonth(String timezone) {
		if (timezone == null)
			timezone = "IST";

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timezone));
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		dayOfMonth = dayOfMonth - 1;
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis()-dayOfMonth*24*60*60*1000L;
	}
}
