package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class DurationFromSecondRenderer extends BaseRenderer {

	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		value = TimeUtil.getDurationString(Long.parseLong(value)*1000L);
		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		span.addAttribute("data-renderer","DURATION");
		span.setText(value);
		return span;
	}
	
	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		String value = "";
		if (data.get(field.getName()) != null) {
			value = data.get(field.getName()).toString();
			
		}
		value = TimeUtil.getDurationString(Long.parseLong(value));
		SPAN span = new SPAN(field.getName(),field.getClassName());
		span.addAttribute("data-renderer","DURATION");
		span.setText(value);
		return span;
	}
	
}
