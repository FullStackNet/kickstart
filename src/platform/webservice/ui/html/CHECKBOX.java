package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;


public class CHECKBOX extends INPUT {
	
	public String checkedValue;
	

	public CHECKBOX() {
		this(null,null,null);
		
	}
	public CHECKBOX(String id,String className) {
		this(id,id,className);
	}	
	
	public String getCheckedValue() {
		return checkedValue;
	}
	public void setCheckedValue(String checkedValue) {
		this.checkedValue = checkedValue;
		addAttribute(new Attribute("value", checkedValue));
	}
	
	public void setValue(String value) {
		if (value != null && checkedValue.equals(value)) {
			setChecked(true);
		} else {
			setChecked(false);
		}
	}
	
	public CHECKBOX(String id, String name,String className) {
		super(id,name,className);
		addAttribute(new Attribute("type", "checkbox"));
	}
	
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return "input";
	}
}
