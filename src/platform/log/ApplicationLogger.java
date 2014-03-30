package platform.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ApplicationLogger 
{
	//Should be present in "conf" folder in class path
	private static String DEFAULT_LOG_FILE_NAME = "log4j.properties";
	private static Logger logger = Logger.getLogger(Logger.class.getName());
	private static SimpleDateFormat sdf = null;
	private static Properties props;
	private static boolean started = false;
	private static boolean logged = false;

	private static void setSDF() {
		sdf = new SimpleDateFormat();
		DateFormat df = DateFormat.getDateTimeInstance();
		df.setTimeZone(TimeZone.getTimeZone("GMT+0"));
		sdf = (SimpleDateFormat) df;
		sdf.applyPattern("EEE dd MMM yyyy HH:mm:ss");
	}
	
	public static void init() {
		logged = true;
		init(DEFAULT_LOG_FILE_NAME);
	}
	
	public static void init(String fileName) {
		logged = true;
		if(started)
			return;
		
		setPropertyFileName(fileName);
		setSDF();
		if(props != null)
			PropertyConfigurator.configure(props);
		started = true;
	}
	
	static String getTimeFormattedStr(Date dt)
	{
		if (sdf == null) {
			setSDF();
		}
		return sdf.format(dt);
	}
	
	private static void setPropertyFileName(String fileName)
	{	
		if(fileName == null || fileName.length() <= 0)
			return;

		InputStream inputStream = null;
		props = new Properties();
		try
		{
				try {
					String rootDir = (String) System.getenv().get("DM_HOME");
					if(rootDir == null)
						rootDir = ".";
					FileInputStream fi = new FileInputStream(rootDir + File.separator + "conf" + File.separator + fileName);
					props.load(fi);
					fi.close();
				} catch(Exception fileEx) {
					//If this also fails... then we have a genuine case of File not found.
				}
		}
		finally
		{
			try
			{
				if (inputStream != null)
					inputStream.close();
			}
			catch(IOException ioe)
			{}
		}	
	}


	
	public static void info(String message, Class<?> clazz)
	{
		
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::INFO:: " +"  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}
		if(props != null) {
			if (started)  {
				logger.info(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}
	}
	
	public static void error(String message, Class<?> clazz)
	{
		
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::ERROR:: "+ "  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}

		if(props != null) {
			if (started)  {
				logger.error(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}
	}

	public static void warn(String message, Class<?> clazz)
	{
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::WARN:: "+ "  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}

		if(props != null) {
			if (started)  {
				logger.warn(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}	
	}
	public static void fatal(String message, Class<?> clazz)
	{
		
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::FATAL:: "+ "  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}

		if(props != null) {
			if (started)  {
				logger.fatal(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}	
	}

	public static void trace(String message, Class<?> clazz)
	{
		
		
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::TRACE:: "+ "  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}
		if(props != null) {
			if (started)  {
				logger.trace(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}	
	}

	public static void debug(String message, Class<?> clazz)
	{
		
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) +" ::DEBUG:: "+ "  " + clazz.getSimpleName() + ": " + message;
		if (!logged) {
			System.out.println(completeMessage);
			return;
		}
		if(props != null) {
			if (started)  {
				logger.debug(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}	
	}

	public static void object(String message, Class<?> clazz)
	{
		String completeMessage = getTimeFormattedStr(Calendar.getInstance().getTime()) + "  " + clazz.getSimpleName() + ": " + message;
		if(props != null) {
			if (started)  {
				logger.debug(completeMessage);
			} else {
				System.out.println(completeMessage);
			}
		}	
	}
}