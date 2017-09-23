package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class HIDDEN extends INPUT {
	
	public HIDDEN(String id,Object value) {
		super(id,id,null);
		addAttribute(new Attribute("type", "hidden"));
		if (value != null)
			addAttribute(new Attribute("value", value.toString()));
	}	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
