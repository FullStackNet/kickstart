package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class Report_card_generateRenderer extends BaseRenderer {
	String resourceName;
	public Report_card_generateRenderer(String resourceName) {
		this.resourceName = resourceName;
	}
	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		value =  TimeUtil.getStringFromTime(field.getTimeZone(),Long.parseLong(value));
		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		span.setText(value);
		return span;
	}

	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		A a = new A(field.getName(),field.getClassName());
		a.addAttribute("onclick","ActionHandler.call('/c4t/"+resourceName+"','"+data.get("id")+"','GENERATE')");
		a.setHref("javascript:void(0)");
		a.setText("Generate");
		return a;
	}
}
