package platform.webservice.ui.html;


public class TH extends BaseHTMLComponent {
	
	
	public TH() {
		super();
	}
	public TH(String id,String className) {
		super(id,className);
	}	
	public TH(String id, String name,String className) {
		super(id,name,className);
	}
		@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "th";
	}

}
