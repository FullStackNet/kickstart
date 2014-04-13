package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;

public class SingleLayout extends BaseLayout {
	
	Div mLayoutContainer;
	
	public SingleLayout(UIServletContext ctx) {
		mLayoutContainer =  new Div();
	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
}
