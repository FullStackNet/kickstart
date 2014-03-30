package platform.webservice.ui.html;



public class CANVAS extends BaseHTMLComponent{
	
	
	public CANVAS() {
		super();
	}
	public CANVAS(String id,String className) {
		super(id,className);
	}	
	public CANVAS(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "canvas";
	}
	
	public boolean selfClosing() {
		return false;
	}
}
