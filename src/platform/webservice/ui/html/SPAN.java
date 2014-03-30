package platform.webservice.ui.html;


public class SPAN extends BaseHTMLComponent {
	
	
	public SPAN() {
		super();
	}
	public SPAN(String id,String className) {
		super(id,className);
	}	
	public SPAN(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "span";
	}

}
