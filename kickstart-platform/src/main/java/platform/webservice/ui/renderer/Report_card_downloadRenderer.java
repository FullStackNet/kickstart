package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;
import application.c4t.vehicle.school.resource.report_card;

public class Report_card_downloadRenderer extends BaseRenderer {
	String resourceName;
	public Report_card_downloadRenderer(String resourceName) {
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
		String school_id = (String)data.get(report_card.FIELD_SCHOOL_ID);
		String accessment = (String)data.get(report_card.FIELD_ACCESSMENT_FOR);
		String accessment_type = (String)data.get(report_card.FIELD_ACCESSMENT_TYPE);
		String id = (String)data.get(report_card.FIELD_ID);
		String file = "/reports_card/"+school_id+"/"+accessment+"/"+accessment_type+"/report_card_"+id+".pdf";
		a.setHref(file);
		a.addAttribute("target","_blank");
		a.addAttribute("title","Download the generated report");
		a.setText("Download");
		return a;
	}
}
