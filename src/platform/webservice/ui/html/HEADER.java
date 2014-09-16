package platform.webservice.ui.html;



public class HEADER extends BaseHTMLComponent{
	
	
	public HEADER() {
		super();
	}
	public HEADER(String id,String className) {
		super(id,className);
	}	
	public HEADER(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "header";
	}
		
}
