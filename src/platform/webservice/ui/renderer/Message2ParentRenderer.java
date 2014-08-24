package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class Message2ParentRenderer extends BaseRenderer {
	String resourceName;
	public Message2ParentRenderer(String resourceName) {
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
		a.setHref("/ui/message2parent"+"?op=add&student_id="+data.get("id"));
		a.setText("Message 2 Parent");
		return a;
	}
}
