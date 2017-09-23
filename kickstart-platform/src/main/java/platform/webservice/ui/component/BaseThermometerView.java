package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.ThermometerDefinition;
import platform.webservice.ui.html.CANVAS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;


public class BaseThermometerView extends BaseView {
	UIServletContext mContext;
	ThermometerDefinition  mDefinition;
	
	public BaseThermometerView(UIServletContext ctx) {
		super();
		mContext = ctx;
		mContext.getPageBuilder().addJS(new JS("thermometer.js", "/ui/js"));
		mDefinition = new ThermometerDefinition();
	}
	
	public UIServletContext getContext() {
		return mContext;
	}
	
	public ThermometerDefinition getDefinition() {
		return mDefinition;
	}
	
	public void buildUI(Number value) {
		// TODO Auto-generated method stub
		Div div = new Div();
		CANVAS canvas = new CANVAS();
		canvas.addAttribute("id", mDefinition.getId());
		canvas.addAttribute("height", "200");
		canvas.addAttribute("width", "200");
		div.addChild(canvas);
		//div.addAttribute("style","height :100px;width :100px");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<script>" +
				"var g = new ThermometerGuage(document.getElementById('"+mDefinition.getId()+"'), {" +
			    	" w: 200, " +
			        " h: 200,"+
			        " color: { label: 'rgba(255, 255, 255, .6)',tickLabel: 'rgba(255, 0, 0, 0.4)'}," +
			        " centerTicks: false, " +
			        " majorTicks: 3, " +
			        " minorTicks: 4, "+
			        " max: 200, "+
			        " min:0, "+
			        " scaleTickLabelText: 1.15,"+
			        " scaleLabelText: 0.9,"+
			        " scaleTickWidth: 1.5, " +
			        " unitsLabel: ' C' "  +
			    " }); " +
			    "g.setValue('"+value+"');");
		buffer.append("</script>");
	    TEXT text = new TEXT(buffer.toString());
		div.addChild(text);
		getView().addChild(div);
	}
}
