package platform.webservice.ui.renderer;

import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

import java.util.Map;

public class SeverityRenderer extends BaseRenderer {

	@Override
	public BaseHTMLComponent render(Field field, String value, String refreshKey) {
		// TODO Auto-generated method stub
	
		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		return span;
	}

	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		SPAN span = new SPAN(field.getName(),field.getClassName());
		String severity = ""+data.get("severity");
		if ("1".equals(severity)) {
			span.setText("Critical");
		} else if ("2".equals(severity)) {
			span.setText("Major");
		}  else if ("3".equals(severity)) {
			span.setText("Warning");
		} else if ("4".equals(severity)) {
			span.setText("Minor");
		} else if ("5".equals(severity)) {
			span.setText("Info");
		}
		return span;
	}
}
