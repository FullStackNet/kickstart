package platform.counter;

import platform.util.Util;



public class Counter {
	public enum EnumCounterValueType {
		LONG,
		DOUBLE,
		INT
	}
	
	public enum EnumCounterType {
		COUNTER
	}
	
	String name;
	EnumCounterValueType valueType;
	EnumCounterType counterType;
	Object currentValue;
	Object previousValue;
	long currentUpdateTime;
	long previousUpdateTime;
	
	public Counter(String name,EnumCounterValueType valueType,EnumCounterType counterType) {
		this.name = name;
		this.valueType = valueType;
		this.counterType = counterType;
		previousUpdateTime = 0;
		currentUpdateTime = 0;

		if (valueType == EnumCounterValueType.DOUBLE) {
			currentValue = 0.0;
			previousValue = 0.0;
		} else if (valueType == EnumCounterValueType.LONG) {
			currentValue = 0L;
			previousValue = 0L;
		} else if (valueType == EnumCounterValueType.INT) {
			currentValue = 0L;
			previousValue = 0L;
		}
	}
	
	public Counter(String name) {
		this(name,EnumCounterValueType.LONG,EnumCounterType.COUNTER);
	}
	
	public Counter(String name,EnumCounterValueType valueType) {
		this(name,valueType,EnumCounterType.COUNTER);
	}
	
	public String getName() {
		return name;
	}

	void incrementObject(Object value) {
		previousValue = currentValue;
		previousUpdateTime = currentUpdateTime;
		if (valueType == EnumCounterValueType.DOUBLE) {
			double d = (Double)currentValue + ((Double)value).doubleValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.LONG) {
			long d = (Long)currentValue + ((Long)value).longValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.INT) {
			int d = (Integer)currentValue + ((Integer)value).intValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		}
	}
	
	public void increment(Integer value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			incrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			incrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			incrementObject(value.intValue());
		}
	}
	
	public void increment(Long value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			incrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			incrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			incrementObject(value.intValue());
		}
	}
	
	public void increment(Double value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			incrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			incrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			incrementObject(value.intValue());
		}
	}
	
	

	void decrementObject(Object value) {
		previousValue = currentValue;
		previousUpdateTime = currentUpdateTime;
		if (valueType == EnumCounterValueType.DOUBLE) {
			double d = (Double)currentValue - ((Double)value).doubleValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.LONG) {
			long d = (Long)currentValue - ((Long)value).longValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.INT) {
			int d = (Integer)currentValue - ((Integer)value).intValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		}
	}
	
	public void decrement(Integer value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			decrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			decrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			decrementObject(value.intValue());
		}
	}
	
	public void decrement(Long value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			decrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			decrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			decrementObject(value.intValue());
		}
	}
	
	public void decrement(Double value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			decrementObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			decrementObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			decrementObject(value.intValue());
		}
	}
	

	public void updateObject(Object value) {
		previousValue = currentValue;
		previousUpdateTime = currentUpdateTime;
		if (valueType == EnumCounterValueType.DOUBLE) {
			double d = ((Double)value).doubleValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.LONG) {
			long d = ((Long)value).longValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		} else if (valueType == EnumCounterValueType.INT) {
			int d = ((Integer)value).intValue();
			currentValue = d;
			currentUpdateTime = Util.currentTimeMS();
		}
	}
	
	public void update(Integer value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			updateObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			updateObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			updateObject(value.intValue());
		}
	}
	
	public void update(Long value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			updateObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			updateObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			updateObject(value.intValue());
		}
	}
	
	public void update(Double value) {
		if (valueType == EnumCounterValueType.DOUBLE) {
			updateObject(value.doubleValue());
		} else if (valueType == EnumCounterValueType.LONG) {
			updateObject(value.longValue());
		} else if (valueType == EnumCounterValueType.INT) {
			updateObject(value.intValue());
		}
	}
	
	public EnumCounterValueType getValueType() {
		return valueType;
	}
	public EnumCounterType getCounterType() {
		return counterType;
	}
	
	public Object getCurrentValue() {
		return currentValue;
	}
	
	public Object getPrepviousValue() {
		return previousValue;
	}
	
	public long getLastUpdateTime() {
		return currentUpdateTime;
	}
	public long getPreviousUpdateTime() {
		return previousUpdateTime;
	}	
}
