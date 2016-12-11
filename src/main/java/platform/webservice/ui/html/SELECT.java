package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;



public class SELECT extends BaseHTMLComponent{

	public void setValue(String value) {
		addAttribute(new Attribute("value", value));
	}
	
	public SELECT() {
		super();
	}
	public SELECT(String id,String className) {
		super(id,className);
	}	
	public SELECT(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "select";
	}
}
