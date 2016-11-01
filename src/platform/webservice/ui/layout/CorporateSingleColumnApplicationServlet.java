package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.CorporateTestHeaderView;
import platform.webservice.ui.view.CorporateTestMenuView;

public abstract class CorporateSingleColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return getWebPage(context);
	}
	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		CoachingSingleColumnLayout layout = new CoachingSingleColumnLayout(context);
		CorporateTestHeaderView headerView = new CorporateTestHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		CorporateTestMenuView menuView = new CorporateTestMenuView(context);
		menuView.buildUI();
		layout.getMenu().addChild(menuView.getView());
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getCoachingPageContent();
	}
}
