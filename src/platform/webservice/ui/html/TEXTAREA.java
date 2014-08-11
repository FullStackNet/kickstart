package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class TEXTAREA extends INPUT {
	
	
	public TEXTAREA() {
		this(null,null,null,false);
		
	}
	public TEXTAREA(String id,String className,boolean fullWidth) {
		this(id,null,className,fullWidth);
	}	
	public TEXTAREA(String id, String name,String className, boolean fullWidth) {
		super(id,name,className);
		addAttribute(new Attribute("rows", "8"));
		if (fullWidth) {
			addAttribute(new Attribute("cols", "70"));
		} else {
			addAttribute(new Attribute("cols", "40"));
		}
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
