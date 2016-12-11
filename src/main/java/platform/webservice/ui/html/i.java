package platform.webservice.ui.html;



public class i extends BaseHTMLComponent{
	
	
	public i() {
		super();
	}
	public i(String id,String className) {
		super(id,className);
	}	
	public i(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "i";
	}
	
	public boolean selfClosing() {
		return false;
	}
		
}
