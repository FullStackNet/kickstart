package platform.webservice.ui.html;

public class IMG extends BaseHTMLComponent {
	
	public IMG() {
		this(null,null,null);
		
	}
	public IMG(String id,String className) {
		this(id,null,className);
	}	
	public IMG(String id, String name,String className) {
		super(id,name,className);
	}
	
	public void setSRC(String src) {
		addAttribute("src", src);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "img";
	}
	
}
