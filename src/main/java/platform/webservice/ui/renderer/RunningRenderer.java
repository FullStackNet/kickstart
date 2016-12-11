package platform.webservice.ui.renderer;

import java.util.Map;

import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.IMG;

public class RunningRenderer extends BaseRenderer {
	int size;
	
	public RunningRenderer() {
		size = 12;
	}
	
	public RunningRenderer(int size) {
		this.size = size;
	}
	
	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		IMG image = new IMG(field.getName()+"_"+refreshKey,field.getClassName());
		image.addAttribute("data-renderer","RUNNING");
		image.addAttribute("name",field.getName()+"_"+refreshKey);
		image.addAttribute("width",size+"px");
		image.addAttribute("height",size+"px");
		if ("Y".equals(value)) {
			image.setSRC("/ui/images/green-dot.png");
			image.addAttribute("title","Running");
		} else {
			image.setSRC("/ui/images/red-dot.png");
			image.addAttribute("title","Not Running");
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
		image.addAttribute("width",size+"px");
		image.addAttribute("height",size+"px");
		if ("Y".equals(value)) {
			image.setSRC("/ui/images/green-dot.png");
			image.addAttribute("title","Yes");
		} else {
			image.setSRC("/ui/images/red-dot.png");
			image.addAttribute("title","No");
		}
		return image;
	}
}
