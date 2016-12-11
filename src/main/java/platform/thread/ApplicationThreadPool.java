package platform.thread;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ApplicationThreadPool {
	String name;
	BlockingQueue<Runnable> queue;
	ArrayList<ApplicationWorkerThread> threads;
	int numberOfThraed = 0;
	public ApplicationThreadPool(String name,int numberOfThraed, int maxQueueSize) {
		this.name = name;
		queue = new ArrayBlockingQueue<Runnable>(maxQueueSize);
		threads = new ArrayList<ApplicationWorkerThread>(numberOfThraed);
		this.numberOfThraed = numberOfThraed;
	}
	
	public void start() {
		for (int i = 0; i < numberOfThraed ; i++) {
			ApplicationWorkerThread thread = new ApplicationWorkerThread(name+"-"+i, queue);
			thread.start();
			threads.add(thread);
		}
	}
	
	public void stop() {
		for (int i = 0; i < numberOfThraed ; i++) {
			ApplicationWorkerThread thread = threads.get(i);
			thread.stopMe();
		}
	}
	
	public void addTask(Runnable task) {
		System.out.println("Adding task in quque ...total pending task .."+queue.size());
		try {
			queue.put(task);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Added task in quque ...Total Task .."+queue.size());
		
	}
}
