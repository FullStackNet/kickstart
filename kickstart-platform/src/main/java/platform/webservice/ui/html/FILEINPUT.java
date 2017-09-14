package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class FILEINPUT extends INPUT {
	
	
	public FILEINPUT() {
		this(null,null,null);
		
	}
	public FILEINPUT(String id,String className) {
		this(id,id,className);
	}	
	public FILEINPUT(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "file"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
