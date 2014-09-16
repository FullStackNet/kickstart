package platform.webservice.ui.html;



public class ASIDE extends BaseHTMLComponent{
	
	
	public ASIDE() {
		super();
	}
	public ASIDE(String id,String className) {
		super(id,className);
	}	
	public ASIDE(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "aside";
	}
		
}
