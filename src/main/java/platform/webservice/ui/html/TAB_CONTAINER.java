package platform.webservice.ui.html;

import java.util.ArrayList;

import platform.util.ApplicationException;
import platform.webservice.ui.component.BaseView;



public class TAB_CONTAINER extends BaseView {
	String id;
	ArrayList<TAB> tabs;
	
	public void addTab(TAB tab) {
		tabs.add(tab);
	}
	
	public TAB_CONTAINER(String id) {
		tabs = new ArrayList<TAB>();
		this.id = id;
	}
	@Override
	public void buildUI() throws ApplicationException {
		TEXT text = new TEXT("<script>$(function() { " +
            "$( \"#"+id+"\" ).tabs(); "+
         "});</script>");
		getView().addAttribute("id",id);
		UL ul = new UL();
		for(TAB tab : tabs) {
			LI li = new LI();
			A a = new A();
			a.setHref("#"+tab.getId());
			a.setText(tab.getTitle());
			li.addChild(a);
			ul.addChild(li);
		}
		getView().addChild(ul);
		for(TAB tab : tabs) {
			tab.buildUI();
			getView().addChild(tab.getView());
		}
		getView().addChild(text);
	}	
}
