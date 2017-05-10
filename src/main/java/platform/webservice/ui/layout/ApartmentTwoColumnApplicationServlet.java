package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.ApartmentHeaderView;
import platform.webservice.ui.view.ApartmentMenuView;

public abstract class ApartmentTwoColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return getWebPage(context);
	}
	public abstract BaseHTMLComponent getWebLeftDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		ApartmentTwoColumnLayout layout = new ApartmentTwoColumnLayout(context);
		ApartmentHeaderView headerView = new ApartmentHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		ApartmentMenuView menuView = new ApartmentMenuView(context);
		menuView.buildUI();
		layout.getMenu().addChild(menuView.getView());
		layout.getLeftColumn().addChild(getWebLeftDisplay(context));
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getApartmentPageContent();
	}
}
