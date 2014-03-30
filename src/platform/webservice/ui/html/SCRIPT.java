package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;

public class SCRIPT extends BaseHTMLComponent{
	
	public SCRIPT(String type, String src) {
		setType(type);
		setSrc(src);
	}
	
	void setType(String type) {
		addAttribute(new Attribute("type", type));
	}
	
	void setRel(String rel) {
		addAttribute(new Attribute("rel", rel));
	}
	
	void setSrc(String src) {
		addAttribute(new Attribute("src",src));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "script";
	}
	public boolean selfClosing() {
		return false;
	}
}
