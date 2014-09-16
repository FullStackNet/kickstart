package platform.webservice.ui.html;



public class H6 extends INPUT {
	
	public H6() {
		this(null,null,null);
		
	}
	
	public H6(String id,String className) {
		this(id,null,className);
	}	
	public H6(String id, String name,String className) {
		super(id,name,className);		
	}
	
	
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "h6";
	}
	
}
