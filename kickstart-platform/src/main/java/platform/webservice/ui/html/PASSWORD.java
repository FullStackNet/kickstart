package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class PASSWORD extends BaseHTMLComponent{
	
	
	public PASSWORD() {
		this(null,null);
	}
	
	public PASSWORD(String id,String className) {
		this(id,null,className);
	}	

	public PASSWORD(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "password"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
