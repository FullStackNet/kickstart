package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;



public class INPUT extends BaseHTMLComponent{
	
	public void setValue(String value) {
		addAttribute(new Attribute("value", value));
	}
	
	public INPUT() {
		super();
	}
	public INPUT(String id,String className) {
		super(id,className);
	}	
	public INPUT(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
	
}
