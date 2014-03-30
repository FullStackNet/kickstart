package platform.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class DistributedQueue {
	String name;
	boolean local;
	Queue<Object> queue;
	//HazelcastInstance hz;
	
	public DistributedQueue(Object name) {
		this.name = name.toString();
		this.local = true;
		queue = new LinkedList<Object>();
	}
	
	public DistributedQueue(Object name,boolean local) {
		this.name = name.toString();
		this.local = local;
		if (local)
			queue = new LinkedList<Object>();
	}

	public  void add(Object value) {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			queue = hz.getQueue(name);
		}*/
		queue.add(value);
	}
	
	public Object poll() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			queue = hz.getQueue(name);
		}*/
		return queue.poll();
	}
	
	public Object peek() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			queue = hz.getQueue(name);
		}*/
		return queue.poll();
	}
	
	public  long size() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			queue = hz.getQueue(name);
		}*/
		return queue.size();
	}
	
	public  Queue<Object> getQueue() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			queue = hz.getQueue(name);
		}*/
		return queue;
	}
}
