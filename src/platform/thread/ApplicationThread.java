package platform.thread;

import platform.event.EventManager;
import platform.event.interfaces.Event;
import platform.event.interfaces.GenericEventListener;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;

public abstract class ApplicationThread  {
	private long interval;
	private boolean awaken = true;
	Thread thread;
	private boolean stop;
	String name;
	
	public ApplicationThread(String name,long interval) {
		this.interval = interval;
		this.stop = false;
		this.name = name;
		onCreate();
	}

	public boolean isStopped() {
		return stop;
	}
	
	public void awake() {
		System.out.println(thread.getName()+" Awakened at "+System.nanoTime());
		awaken = true;
		thread.interrupt();
	}
	public void start() {
		thread = new Thread(new Runnable() {
			public void run() {
				GenericEventListener processShutDownListner = new GenericEventListener() {
					@Override
					public void eventTriggered(Object sender, Event event) {
						// TODO Auto-generated method stub
						ApplicationLogger.info("Shuting down thread...."+ getName(), this.getClass());
						stop();
					}
				}; 
				EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);
				while(!stop) {
					try {
						
						if (awaken) {
							awaken = false;
							onWork();
			//				System.out.println(thread.getName()+" Task completed at "+System.nanoTime());
						}
							//System.out.println(thread.getName()+" sleeping for  "+interval);
						if (interval < 0) {
							System.out.println("Got the interval negative Temporarily fixing problem " + interval);
							interval = 10000L;
						}
						Thread.sleep(interval);
						awaken = true;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				stop = false;
				EventManager.getInstance().unregisterEventListener(processShutDownListner, ShutDownProcessEvent.class);
			}
		});
		thread.setName(name);
		thread.start();
	}
	public void waitForMe2Finish() throws InterruptedException {
		thread.join();
	}
	public abstract void onWork();
	public abstract void onCreate();
	public abstract void onFinish();


	public void stop() {
		setStop(true);
		awake();
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
