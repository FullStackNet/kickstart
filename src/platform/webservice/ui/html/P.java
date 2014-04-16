package platform.webservice.ui.html;


public class P extends BaseHTMLComponent {
	
	
	public P() {
		super();
	}
	public P(String id,String className) {
		super(id,className);
	}	
	public P(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "p";
	}

}
