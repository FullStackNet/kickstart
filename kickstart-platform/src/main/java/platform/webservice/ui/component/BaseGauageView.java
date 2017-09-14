package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.GauageDefinition;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;


public class BaseGauageView extends BaseView {
	UIServletContext mContext;
	GauageDefinition  mDefinition;
	
	public BaseGauageView(UIServletContext ctx) {
		super();
		mContext = ctx;
		mContext.getPageBuilder().addJS(new JS("jsapi", "https://www.google.com"));
		mDefinition = new GauageDefinition();
	}
	
	public UIServletContext getContext() {
		return mContext;
	}
	
	public GauageDefinition getDefinition() {
		return mDefinition;
	}
	
	public void buildUI(Integer value) {
		// TODO Auto-generated method stub
		Div div = new Div();
		div.addAttribute("id",mDefinition.getId());
		div.addAttribute("style","font-size : 10px");
		//div.addAttribute("style","height :100px;width :100px");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<script>" +
				"google.load('visualization', '1', {packages:['gauge']});\n" +
			     "google.setOnLoadCallback(drawChart); " +
			     "function drawChart() { "+
			     "var data = google.visualization.arrayToDataTable([ " + 
			     "   ['Label', 'Value'], " +
			     "	 ['"+mDefinition.getTitle()+"', "+value+"], "  +
			     "	]); " +
			     "   var options = { "
			     );
		if (mDefinition.getMax() != null) {
			buffer.append(" max : " + mDefinition.getMax()+ ",");
		}
		buffer.append("   width: 120, height: 120 " +
				 "   }; " + 
			     "   var chart = new google.visualization.Gauge(document.getElementById('"+mDefinition.getId()+"')); "+
			     "   chart.draw(data, options); " +
			     "} ");
		buffer.append("</script>");
	    TEXT text = new TEXT(buffer.toString());
		div.addChild(text);
		getView().addChild(div);
	}
}
