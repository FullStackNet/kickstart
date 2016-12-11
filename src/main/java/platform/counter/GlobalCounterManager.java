package platform.counter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import platform.log.ApplicationLogger;

public class GlobalCounterManager {
	Map<String, Counter> counterMap;
	private static GlobalCounterManager instance;
	
	GlobalCounterManager() {
		counterMap = new HashMap<String, Counter>();
	}
	
	public void registerCounter(Counter counter) {
		counterMap.put(counter.getName(), counter);
	}
	
	public void incrementCounter(String name,Integer value) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.increment(value);
	}
	
	public void incrementCounter(String name,Long value) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.increment(value);
	}
	
	public void incrementCounter(String name,Double value) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.increment(value);
	}
	
	public void incrementCounter(String name) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.increment(1);
	}
	
	public void decrementCounter(String name,Double value) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.decrement(value);
	}
	
	public void decrementCounter(String name) {
		Counter counter = counterMap.get(name);
		if (counter == null) {
			ApplicationLogger.error( " Counter -> "+name+" is not registered ", this.getClass());
			return;
		}
		counter.decrement(1);
	}
	
	public Map<String,Object> getCounterMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		Iterator<Entry<String, Counter>> itr = counterMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Counter> pair = itr.next();
			Counter counter = pair.getValue();
			map.put(pair.getKey(), counter.getCurrentValue());
		}
		return map;
	}
	
	public synchronized static GlobalCounterManager getInstance() {
		if (instance == null) {
			instance = new GlobalCounterManager();
		}
		return instance;
	}
	
	
}
