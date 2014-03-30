package platform.events;

import platform.event.EventObject;
import platform.sensor.C4T_PARAMETER;


public class DataChangedEvent extends EventObject {
	private static final long serialVersionUID = 1L;
	C4T_PARAMETER parameter;
	
	Object value;
	public DataChangedEvent(C4T_PARAMETER parameter,Object value) {
		super();
		this.parameter = parameter;
		this.value = value;
	}
	
	public C4T_PARAMETER getParameter() {
		return parameter;
	}
	public Object getValue() {
		return value;
	}
}
