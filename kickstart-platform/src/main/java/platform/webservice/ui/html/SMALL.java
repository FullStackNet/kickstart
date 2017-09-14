package platform.webservice.ui.html;



public class SMALL extends INPUT {
	
	public SMALL() {
		this(null,null,null);
		
	}
	
	public SMALL(String id,String className) {
		this(id,null,className);
	}	
	public SMALL(String id, String name,String className) {
		super(id,name,className);		
	}
	
	
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "small";
	}
	
}
