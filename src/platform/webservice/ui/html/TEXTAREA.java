package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class TEXTAREA extends INPUT {
	
	
	public TEXTAREA() {
		this(null,null,null);
		
	}
	public TEXTAREA(String id,String className) {
		this(id,null,className);
	}	
	public TEXTAREA(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("rows", "8"));
		addAttribute(new Attribute("cols", "41"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "textarea";
	}
	
	public boolean selfClosing() {
		return false;
	}
}
