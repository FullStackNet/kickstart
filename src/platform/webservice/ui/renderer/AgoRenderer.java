package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.util.Util;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class AgoRenderer extends BaseRenderer {

	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		span.addAttribute("data-renderer","AGO");
		if (Util.isEmpty(value) || value.length() == 0) {
			value = "-";
		} else {
			value = TimeUtil.ago(Long.parseLong(value));
		}
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
		
		SPAN span = new SPAN(field.getName(),field.getClassName());
		span.addAttribute("data-renderer","AGO");
		if (Util.isEmpty(value) || value.length() == 0) {
			value = "-";
		} else {
			value = TimeUtil.ago(Long.parseLong(value));
		}
		span.setText(value);
		return span;
	}
	
}
