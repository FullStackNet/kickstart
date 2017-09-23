package platform.webservice.ui.html;

public class A extends BaseHTMLComponent {
	
	public A() {
		this(null,null,null);
		
	}
	public A(String id,String className) {
		this(id,null,className);
	}	
	public A(String id, String name,String className) {
		super(id,name,className);
	}
	
	public void setHref(String href) {
		addAttribute("href", href);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "a";
	}
	
}
