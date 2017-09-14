package platform.webservice.ui.component;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.util.Attribute;

public abstract class BaseView {
	Div div = null;
	
	public boolean isLoginRequired() {
		return true;
	}
	public void buildUI() throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "NOT_IMPLEMENTED");
	}
	
	public BaseView() {
		div = new Div();
	}
	
	public BaseView(Div div) {
		this.div = div; 
	}
	
	public void addAttribute(Attribute attribute) {
		div.addAttribute(attribute);
	}
	
	public void addChild(BaseHTMLComponent child) {
		div.addChild(child);
	}
	
	public Div  getView() {
		return div;
	}
}
