package platform.webservice.ui.html;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.FormDefinition;

public class TABLE extends BaseHTMLComponent {
	
	public TABLE() {
		super();
	}
	public TABLE(UIServletContext ctx,FormDefinition definition) {
		super();
	}
	public TABLE(String id,String className) {
		super(id,className);
	}	
	public TABLE(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "table";
	}

}
