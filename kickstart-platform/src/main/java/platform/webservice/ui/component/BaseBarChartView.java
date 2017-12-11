package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.BarChartDefinition;
import platform.webservice.ui.definition.BarChartObject;
import platform.webservice.ui.definition.GauageDefinition;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;

import java.util.List;


public class BaseBarChartView extends BaseView {
	UIServletContext mContext;
	BarChartDefinition mDefinition;

	public BaseBarChartView(UIServletContext ctx) {
		super();
		mContext = ctx;
		mContext.getPageBuilder().addJS(new JS("jsapi", "https://www.google.com"));
		mDefinition = new BarChartDefinition();
	}
	
	public UIServletContext getContext() {
		return mContext;
	}
	
	public BarChartDefinition getDefinition() {
		return mDefinition;
	}
	
	public void buildUI(List<BarChartObject> data) {
		// TODO Auto-generated method stub
		Div div = new Div();
		div.addAttribute("id",mDefinition.getId());
		div.addAttribute("style","font-size : 10px");
		//div.addAttribute("style","height :100px;width :100px");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<script>" +
				"google.charts.load('current', {packages:['corechart', 'bar']});\n" +
			     "google.charts.setOnLoadCallback(drawMultSeries); " +
			     "function drawMultSeries() { "+
			     "var data = google.visualization.arrayToDataTable([ " + 
			     "   ['"+mDefinition.getX_axisTitle()+"', '"+mDefinition.getY_axisTitle()+"'], " );
		for(int i=0; i< data.size(); i++) {
			if (i > 0) {
				buffer.append(",");
			}
			buffer.append("['"+data.get(i).getPoint()+"',"+data.get(i).getPoint()+"]");
		}
		buffer.append(	     "	]); " +
			     "   var options = { "
			     );

		buffer.append(" title :'" + mDefinition.getTitle()+"',chartArea :{width:'100%'},hAxis:{title:'Consumption',minValue:0},vAxis:{title:'Time',minValue:0}"+
				 "   }; " + 
			     "   var chart = new google.visualization.BarChar(document.getElementById('"+mDefinition.getId()+"')); "+
			     "   chart.draw(data, options); " +
			     "} ");
		buffer.append("</script>");
	    TEXT text = new TEXT(buffer.toString());
		div.addChild(text);
		getView().addChild(div);
	}
}
