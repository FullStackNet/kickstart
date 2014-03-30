package platform.webservice.ui.html;


public class TR extends BaseHTMLComponent {
	
	
	public TR() {
		super();
	}
	public TR(String id,String className) {
		super(id,className);
	}	
	public TR(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "tr";
	}

}
