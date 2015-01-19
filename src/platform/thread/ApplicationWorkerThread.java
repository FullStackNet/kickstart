package platform.thread;

import java.util.concurrent.BlockingQueue;

public class ApplicationWorkerThread extends Thread {
	BlockingQueue<Runnable> queue;
	private boolean isStop; 
	
	public ApplicationWorkerThread(String name, BlockingQueue<Runnable> queue)  {
		setName(name);
		this.queue = queue;
		isStop = false;
	}

	public void run() {
		while (!isStop) {
			Runnable task = (Runnable) queue.poll();
			task.run();
		}
	}
	public void stopMe() {
		isStop = true;
	}
}

