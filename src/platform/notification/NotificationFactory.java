package platform.notification;

public class NotificationFactory {
	public static byte SEVERIRY_CRITICAL  = 1;
	public static byte SEVERIRY_MAJOR  = 2;
	public static byte SEVERIRY_WARNING  = 3;
	public static byte SEVERIRY_MINOR  = 4;
	public static byte SEVERIRY_INFO  = 5;
	
	public static String NOTIFICATION_EXTERNAL_POWER_ON = "EXTERNAL_POWER_ON";
	public static String NOTIFICATION_EXTERNAL_POWER_OFF = "EXTERNAL_POWER_OFF";
	public static String NOTIFICATION_IGNITION_ON = "IGNITION_ON"; 
	public static String NOTIFICATION_IGNITION_OFF = "IGNITION_OFF";
	public static String NOTIFICATION_STARTED = "STARTED"; 
	public static String NOTIFICATION_STOPPED = "STOPPED";
	public static String NOTIFICATION_FUEL_ADDED = "FUEL_ADDED";
}
