package platform.datastructure;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DistributedMap {
	String name;
	boolean local;
	Map<Object, Object> map;
	//HazelcastInstance hz;
	
	public DistributedMap(String name) {
		this.name = name;
		this.local = true;
		map = new ConcurrentHashMap<Object, Object>();
	}
	
	public DistributedMap(String name,boolean local) {
		this.name = name;
		this.local = local;
		//if (local)
			map = new ConcurrentHashMap<Object, Object>();
	}

	public  void put(Object key, Object value) {
		
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		if (value == null) {
			map.remove(key);
		} else {
			map.put(key, value);
		}
	}
	
	public Object get(Object key) {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		return map.get(key);
	}
	
	public Object remove(Object key) {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		return map.remove(key);
	}
	
	public void removeAll() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		map.clear();
	}
	
	public  long size() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		return map.size();
	}
	
	public  Map<Object, Object> getMap() {
		/*if (!local) {
			if (hz == null) {
				Config cfg = new Config();
				hz = Hazelcast.newHazelcastInstance(cfg);
			}
			map = hz.getMap(name);
		}*/
		return map;
	}
}
