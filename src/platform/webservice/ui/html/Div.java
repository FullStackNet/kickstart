package platform.webservice.ui.html;



public class Div extends BaseHTMLComponent{
	
	
	public Div() {
		super();
	}
	public Div(String id,String className) {
		super(id,className);
	}	
	public Div(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "div";
	}
	
	public boolean selfClosing() {
		return false;
	}
}
