package platform.util.process;

import java.lang.management.RuntimeMXBean;

import platform.event.EventManager;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;
import platform.util.ApplicationConstants;
import platform.util.Util;
public class ProcessUtil {
	
	public static int getPid() {
		RuntimeMXBean runtime = 
			    java.lang.management.ManagementFactory.getRuntimeMXBean();
			java.lang.reflect.Field jvm;
			try {
				jvm = runtime.getClass().getDeclaredField("jvm");
			
			jvm.setAccessible(true);
			sun.management.VMManagement mgmt =  
			    (sun.management.VMManagement) jvm.get(runtime);
			java.lang.reflect.Method pid_method =  
			    mgmt.getClass().getDeclaredMethod("getProcessId");
			pid_method.setAccessible(true);

			int pid = (Integer) pid_method.invoke(mgmt);
			return pid;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return 0;
	}
	
	public static void addShutDownHook() {
		ApplicationLogger.info("Attching the Shutdown Hook", Util.class);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				EventManager.getInstance().triggerEvent(this, new ShutDownProcessEvent());
				ApplicationLogger.info("Waiting "+(int)(ApplicationConstants.PROCESS_WAIT_TIME_BEFORE_EXIT/1000) +" seconds for process to finish ", this.getClass());
				try {
					Thread.sleep(ApplicationConstants.PROCESS_WAIT_TIME_BEFORE_EXIT);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Wait time over now Sutting down process");
			}
		});
	}
	
	
	
}
