package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.CoachingHeaderView;
import platform.webservice.ui.view.CoachingMenuView;
import platform.webservice.ui.view.CorporateTestMenuView;
import platform.webservice.ui.view.CorporateTestHeaderView;

public abstract class CorporateThreeColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return getWebPage(context);
	}
	public abstract BaseHTMLComponent getWebLeftDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebRightDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		CoachingThreeColumnLayout layout = new CoachingThreeColumnLayout(context);
		CorporateTestHeaderView headerView = new CorporateTestHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		CorporateTestMenuView menuView = new CorporateTestMenuView(context);
		menuView.buildUI();
		layout.getMenu().addChild(menuView.getView());
		layout.getLeftColumn().addChild(getWebLeftDisplay(context));
		layout.getContent().addChild(getWebContentView(context));
		layout.getRightColumn().addChild(getWebRightDisplay(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getCoachingPageContent();
	}
}
