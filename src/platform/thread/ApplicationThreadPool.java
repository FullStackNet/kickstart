package platform.thread;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ApplicationThreadPool {
	BlockingQueue<Runnable> queue;
	ArrayList<ApplicationWorkerThread> threads;
	int numberOfThraed = 0;
	public ApplicationThreadPool(int numberOfThraed, int maxQueueSize) {
		queue = new ArrayBlockingQueue<Runnable>(maxQueueSize);
		threads = new ArrayList<ApplicationWorkerThread>(numberOfThraed);
		this.numberOfThraed = numberOfThraed;
	}
	
	public void start() {
		for (int i = 0; i < numberOfThraed ; i++) {
			ApplicationWorkerThread thread = new ApplicationWorkerThread(queue);
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
		queue.add(task);
	}
}
