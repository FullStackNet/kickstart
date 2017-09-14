package platform.manager.obd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class PIDManager {
	HashMap<String, PID> pidMap;
	static PIDManager instance;
	boolean firePIDSupported = false;
	int DEFAULT_MARKED_SUPPORTED = 0;
	
	public void setDefaultSupporetd(PID pid) {
		pid.setSupported(true);
		DEFAULT_MARKED_SUPPORTED++;
	}
	
	public int getDefaultSupported() {
		return DEFAULT_MARKED_SUPPORTED;
	}
	
	public static PIDManager getInstance() {
		if (instance == null)
			instance = new PIDManager();
		return instance;
	}
	
	PIDManager() {
		pidMap = new HashMap<String, PID>();
	}
	public void registerPID(PID pid) {
		pidMap.put(pid.getKey(), pid);
	}
	
	public void suppoted(int mode, int command) {
		suppoted((byte)mode, (byte)command);
	}
	
	public void suppoted(byte mode, byte command) {
		PID pid = pidMap.get(PID.key(mode, command));
		if (pid != null) {
			System.out.println(pid.getDescription() + " Marked Suppored");
			pid.setSupported(true);
		}
	}
	
	public boolean isSupported(int mode, int command) {
		return isSupported((byte)mode, (byte)command);
	}
	
	public boolean isSupported(byte mode, byte command) {
		PID pid = pidMap.get(PID.key(mode, command));
		if (pid == null)
			return false;
		return pid.isSupported();
	}
	
	public PID getPID(int mode, int command) {
		return pidMap.get(PID.key((byte)mode, (byte)command));
	}
	
	public int getNumberOfSupportedPID() {
		int count = 0;
		for (Map.Entry<String, PID> entry : pidMap.entrySet())
		{
		   PID pid = entry.getValue();
		   if (pid.isSupported())
			   count++;
		}
		return count;
	}
	
	public Map<String, PID> getPIDs() {
		return pidMap;
	}
	
	public void setDefaultSupported() {
		PID pid = getPID(0x01,0x00);
		if (pid != null) {
			setDefaultSupporetd(pid);
		}
	}
	public void resetSupportedPID() {
		for (Map.Entry<String, PID> entry : pidMap.entrySet())
		{
			PID pid = entry.getValue();
			if (pid.isSupported()) {
				pid.setSupported(false);
			}
			pidMap.put(pid.getKey(), pid);
		}
		DEFAULT_MARKED_SUPPORTED = 0;
		setDefaultSupported();
	}

	public ArrayList<PID> getPIDArray() {
		ArrayList<PID> pids = new ArrayList<PID>();
		for (Map.Entry<String, PID> entry : pidMap.entrySet())
		{
			PID pid = entry.getValue();
			if (pid.isSupported())
				pids.add(entry.getValue());
		}
		Collections.sort(pids, new PIDCompare());
		return pids;
	}

	public boolean isFirePIDSupported() {
		return firePIDSupported;
	}

	public void setFirePIDSupported(boolean firePIDSupported) {
		this.firePIDSupported = firePIDSupported;
	}
}
