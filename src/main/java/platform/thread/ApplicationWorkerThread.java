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
			Runnable task;
			try {
				task = (Runnable) queue.take();
				
				if (task != null) {
					System.out.println(getName()+"Prcessing the request .. Pednign task in queue .."+queue.size());
					task.run();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void stopMe() {
		isStop = true;
	}
}

