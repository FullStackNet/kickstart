package platform.webservice.ui.html;


public class THEAD extends BaseHTMLComponent {
	
	
	public THEAD() {
		super();
	}
	public THEAD(String id,String className) {
		super(id,className);
	}	
	public THEAD(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "thead";
	}

}
