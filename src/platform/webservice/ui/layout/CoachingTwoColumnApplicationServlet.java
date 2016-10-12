package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.CoachingHeaderView;
import platform.webservice.ui.view.CoachingMenuView;

public abstract class CoachingTwoColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return getWebPage(context);
	}
	public  BaseHTMLComponent getMenuDisplay(UIServletContext context)  {
		CoachingMenuView view = new CoachingMenuView(context);
		view.buildUI();
		return view.getView();
	}
	public abstract BaseHTMLComponent getWebLeftDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebRightDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		CoachingTwoColumnLayout layout = new CoachingTwoColumnLayout(context);
		CoachingHeaderView headerView = new CoachingHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		layout.getContent().addChild(getMenuDisplay(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getCoachingPageContent();
		
		 /*layout = new CoachingTwoColumnLayout(context);
		Map<String, String> map = new HashMap<String, String>();
		map.put("CUSTOMER_NAME", "Nirman IAS");
		String content = Util.readTempleteFileFromLocal("coaching", map);
		return content;*/
	}

}
