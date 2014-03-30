package platform.rule;

public class EntityAttribute {
	public static String STRING_TYPE = "STRING";
	public static String LONG_TYPE = "LONG";
	public static String DOUBLE_TYPE = "DOUBLE";

	String name;
	Object value;
	String type;
	
	public EntityAttribute(String name,String type, Object value) {
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	public void dump() {
		System.out.println("EntityAttribute::" +name+"::"+type+"::"+value);
	}
	public EntityAttribute(String name,String type) {
		this.name = name;
		this.type = type;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	public String getType() {
		return type;
	}
	
	boolean isEqual(Object value2) {
		if (value2 == null) return false;
		if (value == null) return false;
		if (STRING_TYPE.equals(type)) {
			if (value == null) return false;
			String val1 = value.toString();
			if (val1.equals(value2)) {
				return true;
			}
		} else if (LONG_TYPE.equals(type)) {
			long val1 = ((Long)value).longValue();
			long val2 = Long.parseLong(value2.toString());
			if (val1  == val2) {
				return true;
			}
		} else if (DOUBLE_TYPE.equals(type)) {
			double val1 = ((Double)value).doubleValue();
			double val2 = Double.parseDouble(value2.toString());
			if (val1  == val2) {
				return true;
			}
		}

		return false;
	}
	
	boolean isGreater(Object value2) {
		if (value2 == null) return false;
		if (value == null) return false;
		if (LONG_TYPE.equals(type)) {
			long val1 = ((Long)value).longValue();
			long val2 = Long.parseLong(value2.toString());
			if (val1 > val2) {
				return true;
			}
		} else if (DOUBLE_TYPE.equals(type)) {
			double val1 = ((Double)value).doubleValue();
			double val2 = Double.parseDouble(value2.toString());
			if (val1 > val2) {
				return true;
			}
		}
		return false;
	}
	
	boolean isGreaterEqual(Object value2) {
		if (value2 == null) return false;
		if (value == null) return false;
		if (LONG_TYPE.equals(type)) {
			long val1 = ((Long)value).longValue();
			long val2 = Long.parseLong(value2.toString());
			if (val1 >= val2) {
				return true;
			}
		} else if (DOUBLE_TYPE.equals(type)) {
			double val1 = ((Double)value).doubleValue();
			double val2 = Double.parseDouble(value2.toString());
			if (val1 >= val2) {
				return true;
			}
		}
		return false;
	}
	
	boolean isLesser(Object value2) {
		if (value2 == null) return false;
		if (value == null) return false;
		if (LONG_TYPE.equals(type)) {
			long val1 = ((Long)value).longValue();
			long val2 = Long.parseLong(value2.toString());
			if (val1 < val2) {
				return true;
			}
		} else if (DOUBLE_TYPE.equals(type)) {
			double val1 = ((Double)value).doubleValue();
			double val2 = Double.parseDouble(value2.toString());
			if (val1 < val2) {
				return true;
			}
		}
		return false;
	}
	
	boolean isLesserEqual(Object value2) {
		if (value2 == null) return false;
		if (value == null) return false;
		if (LONG_TYPE.equals(type)) {
			long val1 = ((Long)value).longValue();
			long val2 = Long.parseLong(value2.toString());
			if (val1 <= val2) {
				return true;
			}
		} else if (DOUBLE_TYPE.equals(type)) {
			double val1 = ((Double)value).doubleValue();
			double val2 = Double.parseDouble(value2.toString());
			if (val1 <= val2) {
				return true;
			}
		}
		return false;
	}
}
