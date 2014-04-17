package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.H2;
import platform.webservice.ui.util.Attribute;

public class WebUnAuthorizedAccessView extends BaseView {

	public WebUnAuthorizedAccessView(UIServletContext ctx) {
		super();
		getView().addChild(new H2("Unauthorized Access "));
		A a = new A();
		a.addAttribute(new Attribute("href", "/ui/login"));
		a.setText("click here to login");
		getView().addChild(a);
	}
	
}
