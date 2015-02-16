package platform.webservice.ui.view;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.IMG;
import platform.webservice.ui.html.MenuItem;
import platform.webservice.ui.html.UL;
import platform.webservice.ui.util.ImageUtils;

public class HeaderView extends BaseView {
	UIServletContext mContext;
	Div headerDiv;
	
	public HeaderView(UIServletContext context) {
		mContext = context;
		headerDiv = new Div();
	}
	
	public HeaderView(UIServletContext context, Div header) {
		mContext = context;
		headerDiv = header;
	}
	
	public void buildUI() {
		if (mContext.getDomainName().equals("connect2parent.com")) {
			Div logoImageDiv = new Div(null, "logo");
			IMG logoImg = new IMG();
	        logoImg.setSRC(ImageUtils.C2P_HEADER_LOGO);
	        logoImageDiv.addChild(logoImg);
	        headerDiv.addChild(logoImageDiv);
		} else {
			Div logoImageDiv = new Div(null, "logo");
	        IMG logoImg = new IMG();
	        logoImg.setSRC(ImageUtils.HEADER_LOGO);
	        logoImageDiv.addChild(logoImg);
	        headerDiv.addChild(logoImageDiv);
		}
		Div headerMenuDiv = new Div(null, "menu");
	    
	    UL menuContainer = new UL();
        MenuItem item = new MenuItem(" ", "/ui/myarea", ImageUtils.TAB_MONITOR);
        menuContainer.addChild(item.getItem());
        item = new MenuItem(" ", "/ui/activity", ImageUtils.TAB_ACTIVITY);
        menuContainer.addChild(item.getItem());
        item = new MenuItem(" ", "/ui/report", ImageUtils.TAB_REPORTS);
        menuContainer.addChild(item.getItem());
        item = new MenuItem(" ", "/ui/configuration", ImageUtils.TAB_CONFIG);
        menuContainer.addChild(item.getItem());
        item = new MenuItem(" ", "/ui/logout", ImageUtils.TAB_LOGOUT);
        menuContainer.addChild(item.getItem());
        headerMenuDiv.addChild(menuContainer);
        headerDiv.addChild(headerMenuDiv);
        //Div iconDiv = new Div(null, "icon");
        //Div profileDiv = new Div(null, "profile");
        //A a = new A();
        //IMG profileImg = new IMG();
       // profileImg.setSRC(ImageUtils.PROFILE_LOGO);
        //a.addChild(profileImg);
        //profileDiv.addChild(a);
        //iconDiv.addChild(profileDiv);
        //headerDiv.addChild(iconDiv);
	}
}
