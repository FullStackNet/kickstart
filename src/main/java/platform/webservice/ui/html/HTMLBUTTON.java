package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class HTMLBUTTON extends INPUT {
	
	public HTMLBUTTON() {
		this(null,null,null);
		
	}
	
	public HTMLBUTTON(String id,String className) {
		this(id,null,className);
	}	
	public HTMLBUTTON(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "submit"));
	}
	
	
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "button";
	}
	
}
