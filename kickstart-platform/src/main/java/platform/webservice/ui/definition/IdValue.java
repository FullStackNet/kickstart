package platform.webservice.ui.definition;

public class IdValue {
	Object id;
	Object value;
	
	public IdValue(Object id, Object value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public String toString() {
		if (value ==null) return "";
		return value.toString();
	}
	
}
