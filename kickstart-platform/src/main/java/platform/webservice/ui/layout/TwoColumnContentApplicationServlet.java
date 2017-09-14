package platform.webservice.ui.layout;

import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.view.HeaderView;

public abstract class TwoColumnContentApplicationServlet extends BaseUIServlet {
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
		HeaderView headerView = new HeaderView(context, layout.getHeader());
		headerView.buildUI();
		layout.getLeftColumn().addChild(getWebLeftMenu(context));
		Div div = new Div();
		div.addAttribute("align","left");
		div.addAttribute("style","color:silver;font-size:10px;margin-top: 0px; margin-bottom:0px; margin-left:5px;");
		div.addChild(new TEXT("Welcome "+ context.getUserName().toUpperCase()+","));
		layout.getContent().addChild(div);
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getPageContent();
	}

}
