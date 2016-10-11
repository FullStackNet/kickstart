package platform.webservice.ui.layout;

import java.util.HashMap;
import java.util.Map;

import platform.util.Util;
import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;

public abstract class CoachingTwoColumnApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return "";
	}

	public abstract BaseHTMLComponent getWebLeftDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebRightDisplay(UIServletContext context) ;
	public abstract BaseHTMLComponent getWebContentView(UIServletContext context);
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("CUSTOMER_NAME", "Nirman IAS");
		String content = Util.readTempleteFileFromLocal("coaching", map);
		return content;
	}

}
