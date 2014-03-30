package platform.events;

import platform.event.EventObject;
import platform.rule.Action;

public class ActionEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ActionEvent(Action action) {
		super(action);
	}
}
