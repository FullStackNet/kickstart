package platform.webservice.ui.view;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.H1;

public class HeaderView extends BaseView {
	UIServletContext mContext;
	public HeaderView(UIServletContext context) {
		mContext = context;
	}
	public void buildUI() {
		H1 h1 = new H1("Cloud 4 Things");
		addChild(h1);
	}
}
