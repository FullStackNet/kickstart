package platform.webservice.ui.html;



public class BOOTSTRAP_BUTTON extends BaseHTMLComponent {
	
	public BOOTSTRAP_BUTTON() {
		this(null,null,null);
		
	}
	
	public BOOTSTRAP_BUTTON(String id,String className) {
		this(id,null,className);
	}	
	public BOOTSTRAP_BUTTON(String id, String name,String className) {
		super(id,name,className);
	}
	
	
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "button";
	}
	
}
