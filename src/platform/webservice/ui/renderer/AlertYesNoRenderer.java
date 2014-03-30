package platform.webservice.ui.renderer;

import java.util.Map;

import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.IMG;

public class AlertYesNoRenderer extends BaseRenderer {

	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		IMG image = new IMG(field.getName()+"_"+refreshKey,field.getClassName());
		image.addAttribute("data-renderer","ALERT_YES_NO");
		image.addAttribute("width","12px");
		image.addAttribute("name",field.getName()+"_"+refreshKey);
		image.addAttribute("height","12px");
		if ("Y".equals(value)) {
			image.setSRC("/ui/images/red-dot.png");
			image.addAttribute("title","Alert");
		} else {
			image.setSRC("/ui/images/green-dot.png");
			image.addAttribute("title","Normal");
		}
		return image;
	}

	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		IMG image = new IMG(field.getName(),field.getClassName());
		String value = "";
		if (data.get(field.getName()) != null) {
			value = data.get(field.getName()).toString();
			
		}
		if ("Y".equals(value)) {
			image.setSRC("/ui/images/red-dot.png");
			image.addAttribute("title","Alert");
		} else {
			image.setSRC("/ui/images/green-dot.png");
			image.addAttribute("title","Normal");
		}
		return image;
	}
	
}
