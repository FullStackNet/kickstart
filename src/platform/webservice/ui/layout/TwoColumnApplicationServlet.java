package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.HeaderMenu;
import platform.webservice.ui.view.HeaderView;

public abstract class TwoColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return "";
	}

	public abstract BaseHTMLComponent getWebLeftMenu(UIServletContext context) ;

	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);

	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		TwoColumnLayout layout = new TwoColumnLayout(context);
		HeaderView headerView = new HeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		HeaderMenu headerMenu = new HeaderMenu(context, layout.getMenu());
		headerMenu.buildUI();
		layout.getLeftColumn().addChild(getWebLeftMenu(context));
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getPageContent();
	}

}
