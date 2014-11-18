package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;
import application.c4t.vehicle.school.resource.report_card_generation_request;

public class Report_card_resultRenderer extends BaseRenderer {
	String resourceName;
	public Report_card_resultRenderer(String resourceName) {
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
		String id = (String)data.get(report_card_generation_request.FIELD_ID);
		String file = "/ui/activity_report_card_generation_request?id="+id;
		a.setHref(file);
		a.addAttribute("target","_blank");
		a.addAttribute("title","See status of report cards generation");
		a.setText("Generation Status");
		return a;
	}
}
