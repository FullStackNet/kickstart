package platform.webservice.ui.html;

import platform.webservice.ui.util.Attribute;




public class MenuItem {
	LI mItem ;
	
	public MenuItem(String label, String link) {
		mItem = new LI();
		A a = new A();
		a.setText(label);
		a.addAttribute(new Attribute("href", link));
		mItem.addChild(a);
	}
	
	public LI getItem() {
		// TODO Auto-generated method stub
		return mItem;
	}
}
