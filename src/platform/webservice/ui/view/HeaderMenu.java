package platform.webservice.ui.view;



import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.MenuItem;
import platform.webservice.ui.html.UL;

public class HeaderMenu {
	UL mMenuContainer;
	UIServletContext mContext;
	
	public HeaderMenu(UIServletContext context,UL menuContainer) {
		this(context);
		mMenuContainer = menuContainer;
	}

	public HeaderMenu(UIServletContext context) {
		mContext = context;
		mMenuContainer = new UL();
	}
	
	public void buildUI() {
		MenuItem item = new MenuItem("Monitoring", "/ui/monitor");
		mMenuContainer.addChild(item.getItem());
		item = new MenuItem("Configuration", "/ui/configuration");
		mMenuContainer.addChild(item.getItem());
		item = new MenuItem("Reports", "/ui/report");
		mMenuContainer.addChild(item.getItem());
		item = new MenuItem("Logout", "/ui/logout");
		mMenuContainer.addChild(item.getItem());
	}
	
	public UL getMenu() {
		return mMenuContainer;
	}
}
