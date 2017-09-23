package platform.util.system;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class SystemUtil {
	private static SystemUtil instance;
	Sigar sigar;
	public static SystemUtil getInstance() {
		if (instance == null) {
			instance = new SystemUtil();
		}
		return instance;
	}
	SystemUtil() {
		sigar = new Sigar();

	}

	public double getCpuUsage( ) {
		CpuPerc cpu;
		try {
			cpu = sigar.getCpuPerc();
			return cpu.getUser()*100.0;
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public double getSystemCpuUsage( ) {
		CpuPerc cpu;
		try {
			cpu = sigar.getCpuPerc();
			return cpu.getUser()*100.0;
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public  long getFreeMemory( ) {
		Mem mem;
		try {
			mem = sigar.getMem();
			return mem.getFree();
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public long getTotalMemory( ) {
		Mem mem;
		try {
			mem = sigar.getMem();
			return mem.getTotal();
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


	public long getTotalDisk() {
		FileSystemUsage stat;
		try {
			stat = sigar.getFileSystemUsage(System.getProperty("user.dir"));
			return stat.getTotal()*1024L;
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public long getFreeDisk() {
		FileSystemUsage stat;
		try {
			stat = sigar.getFileSystemUsage(System.getProperty("user.dir"));
			return stat.getAvail()*1024L;
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public long getUsageDisk() {
		FileSystemUsage stat;
		try {
			stat = sigar.getFileSystemUsage(System.getProperty("user.dir"));
			return stat.getUsed()*1024L;
		} catch (SigarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static String getMAC() {  
		Sigar sigar = null;  
		try {  
			sigar = new Sigar();  
			String[] ifaces = sigar.getNetInterfaceList();  
			for (int i = 0; i < ifaces.length; i++) {  
				NetInterfaceConfig cfg = sigar.getNetInterfaceConfig(ifaces[i]);  
				if ("eth0".equals(cfg.getName())) {
					return cfg.getHwaddr();
				}
			}  
		} catch (Exception e) {  
			return null;  
		} finally {  
			if (sigar != null)  
				sigar.close();  
		}  
		return null;
	}  

}
