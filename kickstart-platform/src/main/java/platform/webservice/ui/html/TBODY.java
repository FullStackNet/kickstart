package platform.webservice.ui.html;


public class TBODY extends BaseHTMLComponent {
	
	
	public TBODY() {
		super();
	}
	public TBODY(String id,String className) {
		super(id,className);
	}	
	public TBODY(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "tbody";
	}

}
