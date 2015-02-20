package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class CHECKBOX extends INPUT {
	
	
	public CHECKBOX() {
		this(null,null,null);
		
	}
	public CHECKBOX(String id,String className) {
		this(id,id,className);
	}	
	public CHECKBOX(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "checkbox"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
