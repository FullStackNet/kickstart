package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.util.Attribute;

public class CenterSingleLayout extends BaseLayout {
	
	Div mLayoutContainer;
	
	public CenterSingleLayout(UIServletContext ctx) {
		ctx.getPageBuilder().addCSS(new CSS("single_center_layout.css","/ui/css"));
		mLayoutContainer =  new Div();
		mLayoutContainer.addAttribute(new Attribute("class","central_div"));
	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
}
