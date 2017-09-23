package platform.webservice.ui.html;



public class FIELDSET extends INPUT {
	
	public FIELDSET() {
		this(null,null,null);
		
	}
	public FIELDSET(String id,String className) {
		this(id,null,className);
	}	
	public FIELDSET(String id, String name,String className) {
		super(id,name,className);
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "fieldset";
	}
	
}
