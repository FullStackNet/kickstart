package platform.webservice.ui.renderer;

import java.util.Map;

import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;

public abstract class BaseRenderer {

	public abstract BaseHTMLComponent render(Field field, String value,String refreshKey); 
	public abstract BaseHTMLComponent render(Field field, Map<String, Object> data); 
}
