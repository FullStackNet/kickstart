package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class TEXTEDIT extends INPUT {
	
	
	public TEXTEDIT() {
		this(null,null,null);
		
	}
	public TEXTEDIT(String id,String className) {
		this(id,id,className);
	}	
	public TEXTEDIT(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "text"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
