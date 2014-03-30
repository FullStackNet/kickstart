package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;

public class LINK extends BaseHTMLComponent{
	
	public LINK(String href, String rel, String type) {
		setHref(href);
		setRel(rel);
		setType(type);
	}
	
	void setHref(String href) {
		addAttribute(new Attribute("href", href));
	}
	
	void setRel(String rel) {
		addAttribute(new Attribute("rel", rel));
	}
	
	void setType(String type) {
		addAttribute(new Attribute("type", type));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "link";
	}

}
