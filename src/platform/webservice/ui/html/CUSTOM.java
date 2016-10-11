package platform.webservice.ui.html;



public class CUSTOM extends BaseHTMLComponent{
	
	String tag;
	
	public CUSTOM() {
		super();
	}
	public CUSTOM(String tag,String id,String className) {
		super(id,className);
		this.tag = tag;
	}	
	public CUSTOM(String tag,String id, String name,String className) {
		super(id,name,className);
		this.tag = tag;
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return tag;
	}
}
