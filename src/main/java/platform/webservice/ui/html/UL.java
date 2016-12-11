package platform.webservice.ui.html;



public class UL extends BaseHTMLComponent{
	
	
	public UL() {
		super();
	}
	public UL(String id,String className) {
		super(id,className);
	}	
	public UL(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "ul";
	}
}
