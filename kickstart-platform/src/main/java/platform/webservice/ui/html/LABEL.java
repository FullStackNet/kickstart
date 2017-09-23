package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;



public class LABEL extends BaseHTMLComponent{

	public void setValue(String value) {
		addAttribute(new Attribute("value", value));
	}
	
	public LABEL() {
		super();
	}
	public LABEL(String id,String className) {
		super(id,className);
	}	
	public LABEL(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "label";
	}
}
