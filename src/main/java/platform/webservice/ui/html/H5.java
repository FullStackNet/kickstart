package platform.webservice.ui.html;



public class H5 extends INPUT {
	
	public H5() {
		this(null,null,null);
		
	}
	
	public H5(String id,String className) {
		this(id,null,className);
	}	
	public H5(String id, String name,String className) {
		super(id,name,className);		
	}
	
	
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "h5";
	}
	
}
