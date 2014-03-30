package platform.webservice.ui.util;

public class Attribute {
	private String mName;
	private Object mValue;
	
	public Attribute(String name, Object value) {
		this.mName = name;
		this.mValue = value;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public Object getValue() {
		return mValue;
	}

	public void setValue(Object mValue) {
		this.mValue = mValue;
	}
	
}
