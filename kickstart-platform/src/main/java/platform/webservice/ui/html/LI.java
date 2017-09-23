package platform.webservice.ui.html;



public class LI extends BaseHTMLComponent{
	
	
	public LI() {
		super();
	}
	public LI(String id,String className) {
		super(id,className);
	}	
	public LI(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "li";
	}
}
