package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class Report_card_pdfRenderer extends BaseRenderer {
	String resourceName;
	public Report_card_pdfRenderer(String resourceName) {
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
		a.addAttribute("target","_blank");
		a.setHref("/ui/activity_report_card_pdf"+"?id="+data.get("id"));
		a.setText("Live Report");
		return a;
	}
}
