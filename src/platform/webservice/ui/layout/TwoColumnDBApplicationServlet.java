package platform.webservice.ui.layout;

import platform.webservice.WebServiceContants;
import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.view.HeaderView;

public abstract class TwoColumnDBApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return "";
	}

	public abstract BaseHTMLComponent getWebLeftMenu(UIServletContext context) ;

	public abstract BaseHTMLComponent getAddView(UIServletContext context);
	public abstract BaseHTMLComponent getModifyView(UIServletContext context);
	public abstract BaseHTMLComponent getDeleteView(UIServletContext context);
	public abstract BaseHTMLComponent getListView(UIServletContext context);
	public abstract BaseHTMLComponent getView(UIServletContext context);

	public BaseHTMLComponent getWebContentView(UIServletContext context) {
		String op = context.getParamValue("op");
		if (op != null) {
			if (WebServiceContants.OPERATION_ADD.equalsIgnoreCase(op)) {
				return getAddView(context);
			} else if(WebServiceContants.OPERATION_MODIFY.equalsIgnoreCase(op)) {
				return getModifyView(context);
			} else if(WebServiceContants.OPERATION_MODIFY.equalsIgnoreCase(op)) {
				return getModifyView(context);
			} else if(WebServiceContants.OPERATION_DELETE.equalsIgnoreCase(op)) {
				return getDeleteView(context);
			} else if(WebServiceContants.OPERATION_VIEW.equalsIgnoreCase(op)) {
				return getView(context);
			}
		}
		return getListView(context);
	}

	
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
