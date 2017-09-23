package platform.manager;

import java.util.Map;

import platform.sensor.Sensor;
	
public abstract class SensorManager {
		public abstract void start();
		public abstract void action(String action);
		public abstract void action(Sensor Sensor,String action);
		public abstract void configure(Sensor Sensor,String configType,Map<String, Object> params);
		public abstract void add(Sensor sensor);
		public abstract void reconnect();
		public abstract void sendHeartBeat(Sensor Sensor);	
		public abstract void updateState(Sensor Sensor,byte state);	
		public abstract void configAudit(Sensor Sensor);
		public abstract void updateFirmware(Sensor Sensor,byte majorVersion,long minorVersion);
		public abstract void configure(Sensor Sensor,String configure);
		public abstract String getType();
		
}
