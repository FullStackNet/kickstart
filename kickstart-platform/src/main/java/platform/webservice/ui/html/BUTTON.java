package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class BUTTON extends INPUT {
	
	public BUTTON() {
		this(null,null,null);
		
	}
	
	public BUTTON(String id,String className,boolean submit) {
		this(id,null,className,submit);
	}
	
	public BUTTON(String id,String className) {
		this(id,null,className);
	}	
	public BUTTON(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "submit"));
	}
	
	
	public BUTTON(String id, String name,String className, boolean submit) {
		super(id,name,className);
		if (submit)
			addAttribute(new Attribute("type", "submit"));
		else 
			addAttribute(new Attribute("type", "button"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
	
}
