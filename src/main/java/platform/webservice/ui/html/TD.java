package platform.webservice.ui.html;


public class TD extends BaseHTMLComponent {
	
	
	public TD() {
		super();
	}
	public TD(String id,String className) {
		super(id,className);
	}	
	public TD(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "td";
	}

}
