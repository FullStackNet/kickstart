package platform.webservice.ui.html;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.util.Attribute;

public class FORM extends BaseHTMLComponent {
	
	
	public FORM() {
		super();
	}
	
	public FORM(UIServletContext ctx,FormDefinition definition) {
		super();
	}
	public FORM(String id,String className) {
		super(id,className);
	}	
	public FORM(String id, String name,String className) {
		super(id,name,className);
	}
	
	public void setAction(String action) {
		addAttribute(new Attribute("action", action));
	}
	
	public void setMethod(String method) {
		addAttribute(new Attribute("method", method));
	}

	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "form";
	}

}
