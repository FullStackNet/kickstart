package platform.cli;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public class Argument {
	public static int VALUE_TYPE_INT = 1;
	public static int VALUE_TYPE_STRING = 2;
	
	String name;
	int type;
	Object value;
	
	public Argument(String name,int type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	void parse(String value) throws ApplicationException {
		
		if (type == VALUE_TYPE_INT) {
			try {
				this.value = Integer.parseInt(value);
			} catch(Exception e) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid value for "+name);
			}
		} else {
			this.value = value;
		}
	}
	public Object getValue() {
		return value;
	}
}
