package platform.alert;

import platform.webservice.ui.definition.IdValue;

public class AlertFactory {
	public static byte SEVERIRY_CRITICAL  = 1;
	public static byte SEVERIRY_MAJOR  = 2;
	public static byte SEVERIRY_WARNING  = 3;
	public static byte SEVERIRY_MINOR  = 4;
	public static byte SEVERIRY_INFO  = 5;

	public static String SEVERIRY_CLEAR_MODE_AUTO  = "AUTO";
	public static String SEVERIRY_CLEAR_MODE_MANUAL  = "MANUAL";
	public static String[] clearModes = {SEVERIRY_CLEAR_MODE_AUTO,SEVERIRY_CLEAR_MODE_MANUAL};

	public static String DICONNECTED = "DISCONNECTED";
	public static String CONNECTED = "DISCONNECTED";
	public static String ALERT_SOS = "SOS";
	public static String ALERT_TEMPERED = "TEMPERED";
	public static String ALERT_OBD_LOW_BATTERY = "OBD_LOW_BATTERY";
	public static String ALERT_EXTERNAL_LOW_POWER = "EXTERNAL_LOW_POWER";
	public static String ALERT_TOW = "TOW_ALERT";
	public static String ALERT_RUSH_DECELERATE = "RUSH_DECELERATE";
	public static String ALERT_RUSH_AECELERATE = "RUSH_AECELERATE";
	public static String ALERT_RPM_OVER_SPEED = "RPM_OVER_SPEED";
	public static String ALERT_FATIQUE_DRIVING = "FATIQUE_DRIVING";
	public static String ALERT_ENGINE_OVER_HEAT = "ENGINE_OVER_HEAT";
	public static String ALERT_ENGINE_ERROR = "ENGINE_ERROR";
	public static String ALERT_SPEEDING = "SPEEDING";
	public static String ALERT_SPEEDING_NORMAL = "SPEEDING_NORMAL";
	public static String ALERT_LOW_FUEL = "LOW_FUEL";
	public static String ALERT_LOW_FUEL_NORMAL = "LOW_FUEL_NORMAL";
	public static String ALERT_HIGH_CANOPY_TEMPERATURE = "HIGH_CANOPY_TEMPERATURE";
	public static String ALERT_NORMAL_CANOPY_TEMPERATURE = "NORMAL_CANOPY_TEMPERATURE";	
	public static String ALERT_LOW_BATTERY_VOLTAGE = "LOW_BATTERY_VOLTAGE";
	public static String ALERT_NORMAL_BATTERY_VOLTAGE = "NORMAL_BATTERY_VOLTAGE";
	public static String ALERT_LOW_VOLTAGE = "LOW_VOLTAGE";
	public static String ALERT_HIGH_VOLTAGE = "HIGH_VOLTAGE";
}
